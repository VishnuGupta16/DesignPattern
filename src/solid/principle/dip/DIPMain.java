package solid.principle.dip;

import solid.principle.dip.right.way.ParentSpecification;
import solid.principle.dip.wrong.way.Relationships;


//High-level module i.e. client
public class DIPMain {

	public static void main(String[] arg) {

		Person parent = new Person("Papa");
		Person beta = new Person("Beta");
		Person beti = new Person("Beti");
		final String name = "Papa";


		System.out.println("------------Wrong Way---------------------");
		Relationships relationships = new Relationships();
		relationships.addParentChildRelation(parent, beti);
		relationships.addParentChildRelation(parent, beta);
		
		//Data structre in Relationship is tightly to client
		relationships.getRelationShips().stream()
		.filter(p -> p.getKey().toString().equals(name) && p.getValueKey() == Relationship.PARENT)
		.forEach(p -> System.out.println(name+" is "+p.getValueKey()+ " of "+p.getValue()));
		
		System.out.println("------------Right Way---------------------");
		solid.principle.dip.right.way.Relationships relationships2 =  new solid.principle.dip.right.way.Relationships();
		relationships2.addParentChildRelation(parent, beti);
		relationships2.addParentChildRelation(parent, beta);
		
		//Data structre in Relationship is not tightly to client
		ParentSpecification parentSpecification = new ParentSpecification(name);
		relationships2.getRelationShips(parentSpecification).forEach(p -> System.out.println(name+" is "+p.getValueKey()+ " of "+p.getValue()));
		
	}

}
