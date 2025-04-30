package Z;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class m {
    public static int a(TextView textView) {
        return textView.getBreakStrategy();
    }

    public static ColorStateList b(TextView textView) {
        return textView.getCompoundDrawableTintList();
    }

    public static PorterDuff.Mode c(TextView textView) {
        return textView.getCompoundDrawableTintMode();
    }

    public static int d(TextView textView) {
        return textView.getHyphenationFrequency();
    }

    public static void e(TextView textView, int i9) {
        textView.setBreakStrategy(i9);
    }

    public static void f(TextView textView, ColorStateList colorStateList) {
        textView.setCompoundDrawableTintList(colorStateList);
    }

    public static void g(TextView textView, PorterDuff.Mode mode) {
        textView.setCompoundDrawableTintMode(mode);
    }

    public static void h(TextView textView, int i9) {
        textView.setHyphenationFrequency(i9);
    }
}
