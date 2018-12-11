package solid.principle.lsp.wrong.way;

public class Square extends Rectangle {

	private Long s;
	
	public Square(Long s) {
		super(s, s);
		this.s = s;
	}
	
	@Override
	public Long getH() {
		return s;
	}

	@Override
	public void setH(Long h) {
		super.setH(h);
		super.setW(h);
	}

	@Override
	public Long getW() {
		return s;
	}

	@Override
	public void setW(Long w) {
		super.setH(w);
		super.setW(w);
	}
	
	@Override
	public Long calculateArea() {
		return s*s;
	}
}
