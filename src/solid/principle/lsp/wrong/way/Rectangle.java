package solid.principle.lsp.wrong.way;

public class Rectangle {

	private Long h;
	private Long w;
	
	public Rectangle(Long h, Long w) {
		this.h=h;
		this.w=w;
	}
	
	public Long getH() {
		return h;
	}

	public void setH(Long h) {
		this.h = h;
	}

	public Long getW() {
		return w;
	}

	public void setW(Long w) {
		this.w = w;
	}

	public Long calculateArea() {
		return h*w;
	}
	
}
