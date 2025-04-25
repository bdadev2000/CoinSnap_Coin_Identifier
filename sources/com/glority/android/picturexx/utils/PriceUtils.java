package com.glority.android.picturexx.utils;

import com.glority.android.core.data.LogEventArguments;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Currency;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PriceUtils.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\rJ\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\t¨\u0006\u000e"}, d2 = {"Lcom/glority/android/picturexx/utils/PriceUtils;", "", "<init>", "()V", "getCurrencySymbol", "", "getCurrencyCode", "formatPrice", "price", "", "formatNumber", LogEventArguments.ARG_NUMBER, "", "", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class PriceUtils {
    public static final int $stable = 0;
    public static final PriceUtils INSTANCE = new PriceUtils();

    private PriceUtils() {
    }

    public final String getCurrencySymbol() {
        try {
            String priceSymbol = CoinSPUtils.INSTANCE.getPriceSymbol();
            if (priceSymbol == null) {
                Currency currency = NumberFormat.getCurrencyInstance().getCurrency();
                priceSymbol = currency != null ? currency.getSymbol() : null;
                if (priceSymbol == null) {
                    return "$";
                }
            }
            return priceSymbol;
        } catch (Throwable unused) {
            return "$";
        }
    }

    public final String getCurrencyCode() {
        try {
            String priceCurrencyCode = CoinSPUtils.INSTANCE.getPriceCurrencyCode();
            if (priceCurrencyCode != null) {
                return priceCurrencyCode;
            }
            Currency currency = NumberFormat.getCurrencyInstance().getCurrency();
            String currencyCode = currency != null ? currency.getCurrencyCode() : null;
            return currencyCode == null ? "USD" : currencyCode;
        } catch (Throwable unused) {
            return "$";
        }
    }

    public final String formatPrice(double price) {
        String format;
        try {
            if (price < 10.0d) {
                format = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(price)}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            } else {
                format = NumberFormat.getInstance(Locale.getDefault()).format(BigDecimal.valueOf(price).setScale(0, RoundingMode.HALF_UP).doubleValue());
            }
            return format;
        } catch (Throwable unused) {
            return String.valueOf(price);
        }
    }

    public final String formatNumber(int number) {
        try {
            return NumberFormat.getInstance(Locale.getDefault()).format(Integer.valueOf(number));
        } catch (Throwable unused) {
            return String.valueOf(number);
        }
    }

    public final String formatNumber(long number) {
        try {
            return NumberFormat.getInstance(Locale.getDefault()).format(number);
        } catch (Throwable unused) {
            return String.valueOf(number);
        }
    }

    public final String formatNumber(double number) {
        try {
            return NumberFormat.getInstance(Locale.getDefault()).format(number);
        } catch (Throwable unused) {
            return String.valueOf(number);
        }
    }
}
