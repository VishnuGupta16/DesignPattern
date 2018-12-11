package solid.principle.dip.right.way;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import solid.principle.dip.Person;
import solid.principle.dip.Relationship;
import solid.principle.dip.Triplet;
import solid.principle.ocp.right.way.Specification;

//Low-level module
public class Relationships implements RelationshipBrowser {

	List<Triplet<Person, Relationship, Person>> list = new ArrayList<>();

	public void addParentChildRelation(Person parent, Person child) {
		list.add(new Triplet<Person, Relationship, Person>(parent, Relationship.PARENT, child));
		list.add(new Triplet<Person, Relationship, Person>(child, Relationship.CHILD, parent));
	}

	//Now internal data structure is independent of client implementaion so we can change it client don't have to change logic
	public Stream<Triplet<Person, Relationship, Person>> getRelationShips(Specification<Triplet<Person, Relationship, Person>> specification){
		return  filter(list.stream(), specification);
	}
}

