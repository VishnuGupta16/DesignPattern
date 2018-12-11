package solid.principle.lsp;

import solid.principle.lsp.right.way.Shape;
import solid.principle.lsp.right.way.Square;
import solid.principle.lsp.wrong.way.Rectangle;

public class LSPMain {

	public static void main(String[] args) {

		//Wrong way
		System.out.println("-----------Wrong Way---------------");
		Rectangle rectangle = new solid.principle.lsp.wrong.way.Square(2l);
		System.out.println("Side length of square is "+rectangle.getH());
		useIt(rectangle);

		//Right way
		System.out.println("-----------Wrong Way---------------");
		Shape square = new Square(2l);
		System.out.println("Side length of square is "+square.getH());
		useIt(square);



	}

	//This method should work irrespective of 
	private static void useIt(Rectangle rectangle) {

		System.out.println(rectangle.calculateArea()+" Area before chaning side size: ");
		rectangle.setH(3l);
		System.out.println(rectangle.calculateArea()+" Area after chaning side size of square to 3 should be 9");

	}

	private static void useIt(Shape shape) {
		System.out.println(shape.calculateArea()+" Area before chaning side size: ");
		shape.setH(3l);
		System.out.println(shape.calculateArea()+" Area after chaning side size of square to 3 should be 9");
	}


}
