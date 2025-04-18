package androidx.appcompat.widget;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class i1 {
    @NonNull
    public static StaticLayout a(@NonNull CharSequence charSequence, @NonNull Layout.Alignment alignment, int i10, int i11, @NonNull TextView textView, @NonNull TextPaint textPaint, @NonNull m1 m1Var) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
        if (i11 == -1) {
            i11 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i11);
        try {
            m1Var.a(obtain, textView);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }
}
