package chap2_CJH.quiz02;

public class Car {

	private String model;
	private int speed;
	private char mode;
	private boolean start;
	
	public Car(String model) {
		this.model = model;
		System.out.println("모델명: " + model);
	}

	public void engineStart() {
		System.out.println("시동버튼을 눌렀습니다.");
		this.injectOil();
		this.injectGasoline();
		this.start = true;
		this.moveCylinder();
		System.out.println("시동이 걸렸습니다.");
	}
	
	private void injectOil() {
		System.out.println("엔진오일이 순환합니다.");
	}
	
	private void injectGasoline() {
		System.out.println("연료가 엔진에 주입됩니다.");
	}
	
	private void moveCylinder() {
		if(start) {
			System.out.println("실린더가 움직입니다.");
		} else {
			System.out.println("실린더가 움직이지 않습니다.");
		}
	}
	
	public void engineStop() {
		if(this.speed > 0) {
			System.out.println("주행 중에는 시동을 끌 수 없습니다.");
			return;
		} else if(this.speed == 0) {
			if(this.mode != 'P') {
				System.out.println("P모드로 먼저 변속기를 변경하세요.");
				return;
			} else {
				System.out.println("시동이 꺼졌습니다.");
				this.start = false;
			}
		}
	}
	
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(!start) {
			System.out.println("시동을 먼저 걸어야 합니다.");
			return;
		} else {
			if(speed < 0 || speed >= 200) {
				System.out.println("속도를 다시 입력하세요.");
				return;
			} else if(mode == 'N' || mode == 'P') {
				System.out.println("기어를 다시 입력하세요.");
				return;
			} else if(mode == 'R' && speed > 40) {
				System.out.println("R모드는 속도를 40 초과하면 안됩니다.");
				return;
			}
		}
		this.speed = speed;
	}

	public char getMode() {
		return mode;
	}

	public void setMode(char mode) {
		if(mode == 'D') {
			System.out.println("D모드 입니다.");
			this.mode = mode;
		} else if(mode == 'N') {
			System.out.println("N모드 입니다.");
			this.mode = mode;
		} else if(mode == 'R') {
			System.out.println("R모드 입니다.");
			this.mode = mode;
		} else {
			this.mode = 'P';
		}
		
		this.mode = mode;
	}

	public boolean isStart() {
		return start;
	}

	public void setStart(boolean start) {
		this.start = start;
	}
	
	
	
	
	
	
	
	
}
