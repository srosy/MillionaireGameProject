public class Price {
	private int priceIndex;
	public String[] winnerPrice = { "0", "500", "1,000", "2,000", "4,000", "8,000", "16,000", "32,000", "64,000",
			"125,000", "250,000", "500,000", "1,000,000" };

	public void setPrice() {
		priceIndex++;
	}

	public void resetPrice() {
		priceIndex = 0;
	}

	public String getPrice() {
		return winnerPrice[priceIndex];
	}

}
