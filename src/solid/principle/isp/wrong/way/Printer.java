package solid.principle.isp.wrong.way;

import solid.principle.isp.Document;

//Need only printer but need extend scan
public class Printer implements IMachine {

	@Override
	public void print(Document document) {
		// TODO Auto-generated method stub

	}

	@Override
	public void scan(Document document) {
		//Either throw exception which need to propagate to client
	}

}
