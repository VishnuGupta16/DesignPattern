package solid.principle.isp.wrong.way;

import solid.principle.isp.Document;

public interface IMachine {
	
	void print(Document document);
	void scan(Document document);
}
