package solid.principle.dip.wrong.way;

import java.util.ArrayList;
import java.util.List;

import solid.principle.dip.Person;
import solid.principle.dip.Relationship;
import solid.principle.dip.Triplet;

//Low-level module
public class Relationships {
	
	List<Triplet<Person, Relationship, Person>> list = new ArrayList<>();
	
	public void addParentChildRelation(Person parent, Person child) {
		list.add(new Triplet<Person, Relationship, Person>(parent, Relationship.PARENT, child));
		list.add(new Triplet<Person, Relationship, Person>(child, Relationship.CHILD, parent));
	}
	
	
	//Wrong way to do suppose if we change list data structure to tree than client will also change
	public List<Triplet<Person, Relationship, Person>> getRelationShips(){
		return list;
	}
	
}

