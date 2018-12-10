package solid.principle.ocp.wrong.way;

import java.util.List;
import java.util.stream.Stream;

import solid.principle.ocp.Color;
import solid.principle.ocp.Product;
import solid.principle.ocp.Size;

public class ProductFilter {

	public static Stream<Product> filterBySize(List<Product> items, Size size){
		return items.stream().filter(item -> item.getSize() == size);
	}

	public static Stream<Product> filterByColor(List<Product> items, Color color){
		return items.stream().filter(item -> item.getColor() == color);
	}

	public static Stream<Product> filterByColorAndSize(List<Product> items,
			Color color, Size size){
		return items.stream().filter(item -> item.getColor() == color && item.getSize() == size);
	}

}
