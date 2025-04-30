package H6;

import G7.j;
import android.text.TextPaint;
import android.text.style.UnderlineSpan;

/* loaded from: classes3.dex */
public final class b extends UnderlineSpan {
    @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        j.e(textPaint, "tp");
        textPaint.setUnderlineText(false);
    }
}
