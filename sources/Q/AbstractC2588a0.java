package q;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* renamed from: q.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2588a0 {
    @NonNull
    public static StaticLayout a(@NonNull CharSequence charSequence, @NonNull Layout.Alignment alignment, int i9, int i10, @NonNull TextView textView, @NonNull TextPaint textPaint, @NonNull AbstractC2594d0 abstractC2594d0) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i9);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
        if (i10 == -1) {
            i10 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i10);
        try {
            abstractC2594d0.a(obtain, textView);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }
}
