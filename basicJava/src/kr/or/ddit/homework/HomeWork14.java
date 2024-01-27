package kr.or.ddit.homework;

public class HomeWork14 {
	public static void main(String[] args) {
		Deck deck = new Deck();
		Card[] cardList = deck.cardList();
		deck.shuffle(cardList);
		deck.win(cardList);

		// deck.print(cardList);
	}
}

class Card {
	String type;
	int num;

	public Card(String type, int num) {
		this.type = type;
		this.num = num;
	}

	@Override
	public String toString() {
		String n = "";
		if (num == 1)
			n = "A";
		else if (num == 10)
			n = "T";
		else if (num == 11)
			n = "J";
		else if (num == 12)
			n = "K";
		else if (num == 13)
			n = "Q";
		else
			n += num;
		return type + n;
//		return "Card [type=" + type + ", num=" + num + "]";
	}

}

class Deck {
	// Card[] cardList;
	public Card[] cardList() {
		Card[] cardList = new Card[52];
		for (int i = 1; i <= 52; i++) {
			int num = i % 13;
			if (num == 0)
				num = 13;
			String type = "";
			if ((i - 1) / 13 == 0)
				type = "♠";
			if ((i - 1) / 13 == 1)
				type = "◆";
			if ((i - 1) / 13 == 2)
				type = "♥";
			if ((i - 1) / 13 == 3)
				type = "♣";
			cardList[i - 1] = new Card(type, num);
		}
		return cardList;
	}

	public void print(Card[] cardList) {
		for (Card card : cardList) {
			System.out.println(card);
		}
	}

	// 1. shuffle 메서드 완성
	public void shuffle(Card[] cardList) {
		for (int i = 0; i < cardList.length; i++) {
			int j = (int) (Math.random() * cardList.length);
			Card temp = cardList[i];
			cardList[i] = cardList[j];
			cardList[j] = temp;
		}
	}

	// 승패 체크
	public boolean win(Card[] cardList) {
		// 맨위에 카드는 내꺼
		// 그외 나머지 랜덤으로 뽑기
		// 카드 숫자가 내카드가 높다면 win -> true 작거나 같으면 lose -> false
		int r = (int) (Math.random() * (cardList.length - 1) + 1);

		if (cardList[0].num > cardList[r].num) {
			System.out.println("승리! 나: " + cardList[0]);
			System.out.println("패배! 상대: " + cardList[r]);
			return true;
		} else {
			System.out.println("패배! 나: " + cardList[0]);
			System.out.println("승리! 상대: " + cardList[r]);
			return false;
		}
	}

}
