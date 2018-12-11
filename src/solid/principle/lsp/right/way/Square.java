package solid.principle.lsp.right.way;

public class Square implements Shape {

	private Long s;
	
	public Square(Long s) {
		this.s=s;
	}

	@Override
	public Long calculateArea() {
		return s*s;
	}

	@Override
	public Long getH() {
		// TODO Auto-generated method stub
		return s;
	}

	@Override
	public Long getW() {
		// TODO Auto-generated method stub
		return s;
	}

	@Override
	public void setH(Long h) {
		this.s = h;
		
	}

	@Override
	public void setW(Long w) {
		this.s = w;
		
	}
}
