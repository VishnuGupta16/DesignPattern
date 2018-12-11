package solid.principle.dip.right.way;

import solid.principle.dip.Person;
import solid.principle.dip.Relationship;
import solid.principle.dip.Triplet;
import solid.principle.ocp.right.way.Filter;

public interface RelationshipBrowser extends Filter<Triplet<Person, Relationship, Person>> {}
