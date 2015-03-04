
/**
 * @author Mike
 * @version 1.0
 * @created 02-Mar-2015 3:19:43 PM
 */
public class Ball {
//Jon commented on ball 
	private Rectangle ball;
	private Circle GUIBall;
	private Paddle paddleLastHit;
	private int xLoc;
	private int xSpeed;
	private int yLoc;
	private int ySpeed;

	public Ball(){

	}

	/**
	 * 
	 * @exception Throwable
	 */
	public void finalize()
	  throws Throwable{

	}

	public Paddle getPaddleLastHit(){
		return this.paddleLastHit;
	}

	public int getXLoc(){
		return xLoc;
	}

	public int getXSpeed(){
		return xSpeed;
	}

	public int getYLoc(){
		return yLoc;
	}

	public int getYSpeed(){
		return ySpeed;
	}

	public void moveBall(){
		xLoc += xSpeed;
		yLoc += ySpeed;
	}

	public void setPaddleLastHit(Paddle paddleLastHit){
		this.paddleLastHit = paddleLastHit;
	}

	public int setXLoc(int xLoc){
		this.xLoc = xLoc;
	}

	public int setXSpeed(int xSpeed){
		this.xSpeed = xSpeed;
	}

	public int setYLoc(int yLoc){
		this.yLoc = yLoc;
	}

	public int setYSpeed(int ySpeed){
		this.ySpeed = ySpeed;
	}
}//end Ball