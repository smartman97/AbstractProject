package myAbstract.model;

public abstract class Cards implements InternetThings, Comparable
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
		
		public String toString()
		{
			String description = "This is a " + this.getClass() + " and its meme is: " + meme(); 
			
			return description;
		}
		
		/**
		 * If the supplied variable compared comes before the calling variable return -1
		 * If the supplied variable is after the calling variable return 1
		 * Elseif they are the same, return 0
		 * @param compared
		 * @return
		 */
		public int compareTo(Object compared)
		{
			int comparedValue = Integer.MIN_VALUE;
			
			if(compared instanceof InternetThings)
			{
				if(this.cat() > ((InternetThings) compared).cat())
				{
					comparedValue = 1;
				}
				else if(this.cat() < ((InternetThings) compared).cat())
				{
					comparedValue = -1;
				}
				else
				{
					comparedValue = 0;
				}
			}
			
			return comparedValue;
		}
}
