package jalapongo;

import javafx.scene.shape.*;

/**
 * @author Nick
 * @version 1.0
 * @created 02-Mar-2015 3:19:45 PM
 */
public class Paddle {

	private Rectangle GUIPaddle;
	private Line Paddle;
	private int PaddleLocX;
	private int PaddleLocY;
	private int pos;

	public Paddle(int pos){
		if(pos == 1){
			PaddleLocX = 10;
			Paddle = new Line(PaddleLocX,325,PaddleLocX,375);
			this.pos = pos;
		}
		if(pos == 2){
			PaddleLocY = 690;
			Paddle = new Line(325,PaddleLocY,375,PaddleLocY);
			this.pos = pos;
		}
		if(pos == 3){
			PaddleLocX = 690;
			Paddle = new Line(PaddleLocX,325,PaddleLocX,375);
			this.pos = pos;
		}
		if(pos == 4){
			PaddleLocY = 10;
			Paddle = new Line(325,PaddleLocY,375,PaddleLocY);
			this.pos = pos;
		}	
	}

	public int getLength(){
		int length = 0;
		if(pos == 1 || pos == 3){
			length = (int)(Paddle.getEndX() - Paddle.getStartX());
		}else{
			length = (int)(Paddle.getEndY() - Paddle.getStartY());
		}
		return length;
	}

	public void setLength(int length){
		int start;
		int end;
		if(pos == 1 || pos == 3){
			start = (int)Paddle.getStartX();
			end = start + length;
			Paddle.setEndX((double)end);
		}
		else{
			start = (int)Paddle.getStartY();
			end = start + length;
			Paddle.setEndY((double)end);
		}
	}

}//end Paddle
/** For Ball Class
public int setXstart(){
	return (int)Math.ceil(Math.random()*300+200);
}

public int setYstart(){
	return (int)Math.ceil(Math.random()*300+200);
}
*/
