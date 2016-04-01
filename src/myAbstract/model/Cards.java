package myAbstract.model;

public abstract class Cards implements InternetThings
{

		public int amount;
		public String cardName;
		public boolean isItAGoodDeck;
		public double price; 
		
		
		public double getcost()
		{
			return  price;
		}
		public int getAmount()
		{
			return amount;
		}
		public String getCardName()
		{
			return cardName;
		}
		public boolean isItAGoodDeck()
		{
			return isItAGoodDeck;
		}
		public void setPrice(double price)
		{
			this.price = price;
		}
		public void setAmount(int amount)
		{
			this.amount = amount;
		}
		public void setCardName(String cardName)
		{
			this.cardName = cardName;
		}
		public void setItAGoodDeck(boolean isItAGoodDeck)
		{
			this.isItAGoodDeck = isItAGoodDeck;
		}
		
}
