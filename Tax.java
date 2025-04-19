package Bolum10;

public class Tax {
	 public static final int SINGLE_FILER = 0;
	    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW_ER = 1;
	    public static final int MARRIED_SEPARATELY = 2;
	    public static final int HEAD_OF_HOUSEHOLD = 3;

	    private int filingStatus;
	    private int[][] brackets;
	    private double[] rates;
	    private double taxableIncome;
	    
	public static void main(String[] args) {
		Tax tax = new Tax();
		 // 2001 yýlý oranlarý ve dilimleri
        double[] rates2001 = {0.15, 0.275, 0.305, 0.355, 0.391};
        int[][] brackets2001 = {
            {27050, 65550, 136750, 297350}, // Single
            {45200, 109250, 166500, 297350}, // Married jointly
            {22600, 54625, 83250, 148675},   // Married separately
            {36250, 93650, 151650, 297350}   // Head of household
        };

        // 2009 yýlý oranlarý ve dilimleri
        double[] rates2009 = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int[][] brackets2009 = {
            {8350, 33950, 82250, 171550, 372950},    // Single
            {16700, 67900, 137050, 208850, 372950},  // Married jointly
            {8350, 33950, 68525, 104425, 186475},    // Married separately
            {11950, 45500, 117450, 190200, 372950}   // Head of household
        };

        System.out.println("2001 Tax Tables");
        printTaxTable(brackets2001, rates2001, 2001);

        System.out.println("\n2009 Tax Tables");
        printTaxTable(brackets2009, rates2009, 2009);
    }

    public static void printTaxTable(int[][] brackets, double[] rates, int year) {
        System.out.printf("%-12s%-20s%-20s%-20s%-20s\n", 
            "Taxable", "Single", "Married Joint", "Married Sep.", "Head of House");

        for (int income = 50000; income <= 60000; income += 1000) {
            System.out.printf("%-12d", income);
            for (int status = 0; status <= 3; status++) {
                Tax tax = new Tax(status, brackets, rates, income);
                System.out.printf("%-20.2f", tax.getTax());
            }
            System.out.println();
        }
    }
	
	public Tax(){
		
	}
	public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
	        this.filingStatus = filingStatus;
	        this.brackets = brackets;
	        this.rates = rates;
	        this.taxableIncome = taxableIncome;
	}
	
	public int getFilingStatus() {
        return filingStatus;
    }
	
	public void setFilingStatus(int filingStatus) {
        if (filingStatus >= 0 && filingStatus <= 3) {
            this.filingStatus = filingStatus;
        } else {
            throw new IllegalArgumentException("Invalid filing status.");
        }
    }
	public int[][] getBrackets() {
        return brackets;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public double[] getRates() {
        return rates;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }
    
    public double getTax() {
        double tax = 0;
        double incomeLeft = taxableIncome;
        int[] statusBrackets = brackets[filingStatus];

        for (int i = 0; i < statusBrackets.length; i++) {
            if (i == 0) {
                if (incomeLeft <= statusBrackets[i]) {
                    tax += incomeLeft * rates[i];
                    return tax;
                } else {
                    tax += statusBrackets[i] * rates[i];
                    incomeLeft -= statusBrackets[i];
                }
            } else {
                if (i < statusBrackets.length) {
                    int taxablePart = statusBrackets[i] - statusBrackets[i - 1];
                    if (incomeLeft <= taxablePart) {
                        tax += incomeLeft * rates[i];
                        return tax;
                    } else {
                        tax += taxablePart * rates[i];
                        incomeLeft -= taxablePart;
                    }
                }
            }
        }
        // Remaining income taxed at the highest rate
        tax += incomeLeft * rates[rates.length - 1];
        return tax;
    }
}
