package t0;

import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class o {
    public static CharSequence a(PrecomputedText precomputedText) {
        return precomputedText;
    }

    public static String[] b(DecimalFormatSymbols decimalFormatSymbols) {
        String[] digitStrings;
        digitStrings = decimalFormatSymbols.getDigitStrings();
        return digitStrings;
    }

    public static PrecomputedText.Params c(TextView textView) {
        PrecomputedText.Params textMetricsParams;
        textMetricsParams = textView.getTextMetricsParams();
        return textMetricsParams;
    }

    public static void d(TextView textView, int i10) {
        textView.setFirstBaselineToTopHeight(i10);
    }
}
