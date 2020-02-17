package blackjackGame;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;


/*
 * First card starts at (77,46)
 * Each card is about 6 pixels apart in the x direction
 * Each card are about 8 pixels apart in the y direction
 * each card is about 126 x 176 pixels
 */


public class Card extends GameObject{
    private int rank;
    private int suit;
    private int CARD_WIDTH = 126;
    private int CARD_HEIGHT = 176;
    private boolean faceUp = false;
    
    //initializes a card at (x,y) = (0,0) with the card ID
    public Card(int rank, int suit) {
    		//super for GameObject class
    		super(0, 0, ID.Card);
        this.rank = rank;
        this.suit = suit;
    }
    
    public String toString() {
        String[] ranks = {null, "2", "3", "4", "5", "6",
                   "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suits = {"Diamonds", "Clubs", "Hearts", "Spades"};
        String s = ranks[this.rank] + " of " + suits[this.suit];
        return s;
    }
    
	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}


	
	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		String deckImage = "/Users/oschacherer/Desktop/BlackjackGame/ImageSrc/cardDeck.jpg";
		Image deckImg = new ImageIcon(deckImage).getImage();
		
		int sy1 = this.suit * (176 + 8) + 46;
		int sy2 = sy1 + 176;
		int sx1 = (this.rank - 1)*(126 + 6)+77;
		int sx2 = sx1 + 126;
		g.drawImage(deckImg, 0, 0, CARD_WIDTH / 2, CARD_HEIGHT / 2, sx1, sy1,sx2, sy2, null);
		
		
		try {
			/*
			 String f = "/Users/oschacherer/Desktop/ace-of-spades-vector-2848235.jpg";

			 *This creates and renders an image from the above directory
			 *
			 *
			int newHeight = 200, newWidth = 125;
			
			Image img = new ImageIcon(f).getImage();
			g.drawImage(img, 0, 0,newWidth, newHeight, null);
			*/
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}