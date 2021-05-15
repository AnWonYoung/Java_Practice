package concept;

import java.util.LinkedList;

class HashTable {
	class Node {
		String key; // 검색할 키 
		String value; // 검색할 값
		
		// 키와 값을 받아서 객체에 할당
		public Node(String key, String value) {
			this.key=key;
			this.value=value;
		}
		// value를 가지고 올 get, set함수
		String value() { // 가져오는 함수
			return value;
		}
		
		void value(String value) { // 저장하는 함수
		this.value = value;
	}
  }
	
	LinkedList<Node>[] data;
	HashTable(int size) {
		this.data = new LinkedList[size]; // 배열의 크기부터 먼저 선언!
	}
	
	// 함수 3개를 만들 것
	int getHashCode(String key) { // 1. 키를 받아서 해시코드로 반환하는 함수
		int hashcode = 0;
		for(char c : key.toCharArray()) { // 아스키코드 값을 받아서
			hashcode = hashcode + c;		  // 해시코드 안에 모두 더해주는 것
		}
		return hashcode;
	}
	
	int convertToIndex(int hashcode) { // 2. 위에서 코드를 받고 인덱스로 변환해주는 함수
		return hashcode % data.length; // 해시코드를 배열 방의 크기만큼 나눈 값이 곧바로 인덱스가 됨
	}
	
	Node searchKey(LinkedList<Node> list, String key) { // 3. 인덱스를 받고 Node의 방이 여러 개가 있을 때 키 값을 받아서 값을 찾는 함수
		if(list == null) { // 값이 아무것도 없을 때는 그대로 null을 반환하기
			return null;
		}
		for(Node node : list) { // 값이 들어왔다면 반복하며 key가 본래의 key값과 같을 때 node를 반환하기
			if(node.key.equals(key)) {
				return node;
			}
		}
		return null; 		// 같은 key값이 없을 때는 null을 반환
	}
	void put (String key, String value) { // 데이터를 받아서 저장하는 함수
		int hashcode = getHashCode(key);
		int index = convertToIndex(hashcode);
		LinkedList<Node> list = data[index]; //배열방을 새로 생성해서 기존의 배열을 새로 받아오기
		if(list == null) { // 배열방이 null이면
			list = new LinkedList<Node>(); // 리스트를 새로 생성함
			data[index] = list; // 위 생성한 리스트를 배열 방에 넣어줌
		}
		Node node = searchKey(list, key);	// 배열방에 혹시 키를 가지고 있는지 확인하기 위해 노드를 받아옴
		if(node == null) {					// 노드가 null이라면 데이터가 없다는 뜻이니까 새로운 Node객체를 생성
			list.addLast(new Node(key, value)); // 객체를 리스트에 추가하기
		}else { 
			node.value(value);			// 노드가 null이 아니면 그 해당 노트키를 대체하는 것으로 중복을 처리
		}
		}
	String get(String key) {		// 키를 가지고 date를 가져오는 함수
		int hashcode = getHashCode(key);
		int index = convertToIndex(hashcode);
		LinkedList<Node> list = data[index]; 
		Node node = searchKey(list, key); // 해당 key를 가지고 있는지 검색
		return node == null? "Not found" : node.value(); // 삼항식 (못 찾았을 때 not found, 찾았을 때 node.value
	}
}

public class Hash {
	public static void main(String[] args) {
		HashTable h = new HashTable(3);
		h.put("sung", "She is pretty");
		h.put("jin", "She is model");
		h.put("hee", "She is an angel");
		h.put("min", "She is cute");
		h.put("sung", "She is beautiful"); // 업데이트가 됨
		System.out.println(h.get("sung"));
		System.out.println(h.get("jin"));
		System.out.println(h.get("hee"));
		System.out.println(h.get("min"));
		
		System.out.println(h.get("jae"));
	}

}
