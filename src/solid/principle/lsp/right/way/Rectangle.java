package solid.principle.lsp.right.way;

public class Rectangle implements Shape {

	private Long h;
	private Long w;
	
	public Rectangle(Long h, Long w) {
		this.h=h;
		this.w=w;
	}
	
	@Override
	public Long calculateArea() {
		return h*w;
	}

	@Override
	public Long getH() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getW() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setH(Long h) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setW(Long w) {
		// TODO Auto-generated method stub
		
	}

}
