package androidx.compose.ui.text.android.selection;

import android.text.TextPaint;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
@RequiresApi
/* loaded from: classes4.dex */
public final class GraphemeClusterSegmentFinderApi29 extends GraphemeClusterSegmentFinder {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f17134a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f17135b;

    public GraphemeClusterSegmentFinderApi29(TextPaint textPaint, CharSequence charSequence) {
        this.f17134a = charSequence;
        this.f17135b = textPaint;
    }

    @Override // androidx.compose.ui.text.android.selection.GraphemeClusterSegmentFinder
    public final int e(int i2) {
        int textRunCursor;
        CharSequence charSequence = this.f17134a;
        textRunCursor = this.f17135b.getTextRunCursor(charSequence, 0, charSequence.length(), false, i2, 0);
        return textRunCursor;
    }

    @Override // androidx.compose.ui.text.android.selection.GraphemeClusterSegmentFinder
    public final int f(int i2) {
        int textRunCursor;
        CharSequence charSequence = this.f17134a;
        textRunCursor = this.f17135b.getTextRunCursor(charSequence, 0, charSequence.length(), false, i2, 2);
        return textRunCursor;
    }
}
