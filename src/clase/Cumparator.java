package clase;

import java.util.Calendar;

public class Cumparator {
	String numeCumparator;
	String prenumeCumparator;
	String CNPCumparator;

	public Cumparator(String numeCumparator, String prenumeCumparator, String CNPCumparator) {
		super();
		this.numeCumparator = numeCumparator;
		this.prenumeCumparator = prenumeCumparator;
		this.CNPCumparator = CNPCumparator;
	}

	public String getnumeCumparator() {
		return numeCumparator;
	}

	public void setnumeCumparator(String numeCumparator) {
		this.numeCumparator = numeCumparator;
	}

	public String getPrenumeCumparator() {
		return prenumeCumparator;
	}

	public void setPrenumeCumparator(String prenumeCumparator) {
		this.prenumeCumparator = prenumeCumparator;
	}

	public String getCNPCumparator() {
		return CNPCumparator;
	}

	public void setCNPCumparator(String CNPCumparator) {
		this.CNPCumparator = CNPCumparator;
	}

	public int calculeazaVarstaCumparator() {
		return Calendar.getInstance().get(1) - (1900 + Integer.parseInt("" + CNPCumparator.charAt(1) + CNPCumparator.charAt(2)));
	}
}
