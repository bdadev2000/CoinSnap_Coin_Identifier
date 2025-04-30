package q;

import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class U {
    public static int a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static void b(TextView textView, int i9, int i10, int i11, int i12) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i9, i10, i11, i12);
    }

    public static void c(TextView textView, int[] iArr, int i9) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i9);
    }

    public static boolean d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
