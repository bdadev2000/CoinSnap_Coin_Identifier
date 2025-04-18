package androidx.appcompat.widget;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class g1 {
    @NonNull
    public static StaticLayout a(@NonNull CharSequence charSequence, @NonNull Layout.Alignment alignment, int i10, @NonNull TextView textView, @NonNull TextPaint textPaint) {
        return new StaticLayout(charSequence, textPaint, i10, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
    }

    public static int b(@NonNull TextView textView) {
        return textView.getMaxLines();
    }
}
