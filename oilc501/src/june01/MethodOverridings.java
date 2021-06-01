package june01;

class MethodOverridings {
	public static void main(String[] args) {
		Bitcoin BTC = new Bitcoin();
		Dogecoin DOGE = new Dogecoin();
		Polygon MATIC = new Polygon();
		Litecoin LTC = new Litecoin();
		Etherum ETH = new Etherum();
		BinanceCoin BNB = new BinanceCoin();
		Ripple XRP = new Ripple();
		
		System.out.println("Value of Bitcoin is "+BTC.CoinValue());
		System.out.println("Value of Etherum is "+ETH.CoinValue());
		System.out.println("Value of Ripple is "+XRP.CoinValue());
		System.out.println("Value of Litecoin is "+LTC.CoinValue());
		System.out.println("Value of Polygon is "+MATIC.CoinValue());
		System.out.println("Value of Dogecoin is "+DOGE.CoinValue());
		System.out.println("Value of Binancecoin is "+BNB.CoinValue());

	
	}

}

class CryptoRiding {
	int CoinValue(){
	return 0;
	}

}// Note:- coin value is taken from specific time due(02/06/20921;01:33)
class Bitcoin extends CryptoRiding{
	int CoinValue() {
		
		return 2791000;
		
	}
}
class Etherum extends CryptoRiding{
	int CoinValue() {
		return 198000;
	}
}
class Ripple extends CryptoRiding{
	int CoinValue() {
		
		return 78;
		
	}
}
class Litecoin extends CryptoRiding{
	int CoinValue() {
		return 14000;
	}
}
class Polygon extends CryptoRiding{
	int CoinValue() {
		return 142;
	}
}
class Dogecoin extends CryptoRiding{
	int CoinValue() {
		return 25;
	}
}
class BinanceCoin extends CryptoRiding{
	int CoinValue() {
		return 27000;
	}
}


		
