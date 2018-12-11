package solid.principle.isp.wrong.way;

import solid.principle.isp.Document;


//Need only scanner but we need to implement print method also
public class Scanner implements IMachine {

	@Override
	public void print(Document document) {
		//Not to implement or throw exception
	}

	@Override
	public void scan(Document document) {
		// TODO Auto-generated method stub
	}

}
