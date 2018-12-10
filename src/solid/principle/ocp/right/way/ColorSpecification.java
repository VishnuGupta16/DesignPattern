package solid.principle.ocp.right.way;

import solid.principle.ocp.Color;
import solid.principle.ocp.Product;

public class ColorSpecification implements Specification<Product> {
	
	private Color color;
	
	public ColorSpecification(Color color) {
		this.color = color;
	}

	@Override
	public boolean isSpecified(Product item) {
		return item.getColor() == this.color;
	}

}
