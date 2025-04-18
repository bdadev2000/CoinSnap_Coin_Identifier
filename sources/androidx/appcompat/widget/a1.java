package androidx.appcompat.widget;

import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class a1 {
    public static int a(TextView textView) {
        int autoSizeStepGranularity;
        autoSizeStepGranularity = textView.getAutoSizeStepGranularity();
        return autoSizeStepGranularity;
    }

    public static void b(TextView textView, int i10, int i11, int i12, int i13) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
    }

    public static void c(TextView textView, int[] iArr, int i10) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
    }

    public static boolean d(TextView textView, String str) {
        boolean fontVariationSettings;
        fontVariationSettings = textView.setFontVariationSettings(str);
        return fontVariationSettings;
    }
}
