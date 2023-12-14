package baseball.view.constant;

import java.text.DecimalFormat;

public enum PrintFormat {
    RESPONSE_USER_COIN("투입 금액: %d원"),
    RESPONSE_CHARGE_COIN("%d원 - %d개"),
    MENU_FORMAT("%s %d개"),
    SEPARATOR_FORMAT(new DecimalFormat("#,##0원")),
    BENEFIT_FORMAT("%s: %s");

    private final String format;
    private final DecimalFormat priceFormat;

    PrintFormat(String format) {
        this.format = format;
        this.priceFormat = null;
    }

    PrintFormat(DecimalFormat priceFormat) {
        this.format = null;
        this.priceFormat = priceFormat;
    }

    public String getFormat() {
        return format;
    }

    private DecimalFormat getPriceFormat() {
        return priceFormat;
    }

    /*
    public static String formatBenefit(final String benefitName, final int amount) {
        return String.format(BENEFIT_FORMAT.getFormat(), benefitName, SEPARATOR_FORMAT.getPriceFormat().format(amount));
    }

    public String formatPrice(int amount) {
        if (priceFormat != null) {
            return priceFormat.format(amount) + System.lineSeparator();
        }
        return SEPARATOR_FORMAT.getPriceFormat().format(amount) + System.lineSeparator();
    }*/
}