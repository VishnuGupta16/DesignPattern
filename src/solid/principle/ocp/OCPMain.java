package solid.principle.ocp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import solid.principle.ocp.right.way.AndSpecification;
import solid.principle.ocp.right.way.ColorSpecification;
import solid.principle.ocp.right.way.GenericProductFilter;
import solid.principle.ocp.right.way.SizeSpecification;
import solid.principle.ocp.right.way.Specification;
import solid.principle.ocp.wrong.way.ProductFilter;

public class OCPMain {
	
	
	public static void main(String[] arg) {
		
		List<Product> products = new ArrayList<>(3);
		products.add(new Product("Apple", Color.GREEN, Size.M));
		products.add(new Product("Apple", Color.RED, Size.M));
		products.add(new Product("Apple", Color.RED, Size.L));
		
		
		System.out.println("-----------------Product Filter wrong way-----------------");
		
		ProductFilter.filterByColor(products, Color.RED).forEach(product -> System.out.println(product));
		ProductFilter.filterBySize(products, Size.L).forEach(product -> System.out.println(product));
		ProductFilter.filterByColorAndSize(products, Color.RED, Size.L).forEach(product -> System.out.println(product));
		
		System.out.println("-----------------Product Filter right way using SPecification Design  Pattern-----------------");
		
		Specification<Product> colorSpecification = new ColorSpecification(Color.RED);
		Specification<Product> sizeSpecification = new SizeSpecification(Size.L);
		Specification<Product> colorAndSizeSpecification = new AndSpecification<Product>(Arrays.asList(colorSpecification, sizeSpecification));
		
		GenericProductFilter genericProductFilter = new GenericProductFilter();
		genericProductFilter.filter(products.stream(), colorSpecification).forEach(product -> System.out.println(product));
		genericProductFilter.filter(products.stream(), sizeSpecification).forEach(product -> System.out.println(product));
		genericProductFilter.filter(products.stream(), colorAndSizeSpecification).forEach(product -> System.out.println(product));
		
	}
	

}
