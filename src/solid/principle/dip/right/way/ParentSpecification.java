package solid.principle.dip.right.way;

import solid.principle.dip.Person;
import solid.principle.dip.Relationship;
import solid.principle.dip.Triplet;
import solid.principle.ocp.right.way.Specification;

public class ParentSpecification implements Specification<Triplet<Person, Relationship, Person>>{
	
	private String name;
	
	public ParentSpecification(String name) {
		this.name = name;
	}

	@Override
	public boolean isSpecified(Triplet<Person, Relationship, Person> rel) {
		return rel.getKey().toString().equals(name) && rel.getValueKey() == Relationship.PARENT;
	}

}
