package androidx.compose.ui.text.android;

import android.os.Build;
import android.text.BoringLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.platform.AndroidTextPaint;

@StabilityInferred
/* loaded from: classes4.dex */
public final class LayoutIntrinsics {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f17083a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f17084b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17085c;
    public float d = Float.NaN;
    public float e = Float.NaN;

    /* renamed from: f, reason: collision with root package name */
    public BoringLayout.Metrics f17086f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17087g;

    public LayoutIntrinsics(CharSequence charSequence, AndroidTextPaint androidTextPaint, int i2) {
        this.f17083a = charSequence;
        this.f17084b = androidTextPaint;
        this.f17085c = i2;
    }

    public final BoringLayout.Metrics a() {
        if (!this.f17087g) {
            TextDirectionHeuristic a2 = TextLayout_androidKt.a(this.f17085c);
            int i2 = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f17083a;
            TextPaint textPaint = this.f17084b;
            this.f17086f = i2 >= 33 ? BoringLayoutFactory33.b(charSequence, textPaint, a2) : BoringLayoutFactoryDefault.b(charSequence, textPaint, a2);
            this.f17087g = true;
        }
        return this.f17086f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (androidx.compose.ui.text.android.SpannedExtensions_androidKt.a(r4, androidx.compose.ui.text.android.style.LetterSpacingSpanEm.class) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r3.getLetterSpacing() == 0.0f) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float b() {
        /*
            r7 = this;
            float r0 = r7.d
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lb
            float r0 = r7.d
            goto L57
        Lb:
            android.text.BoringLayout$Metrics r0 = r7.a()
            if (r0 == 0) goto L14
            int r0 = r0.width
            goto L15
        L14:
            r0 = -1
        L15:
            float r0 = (float) r0
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            android.text.TextPaint r3 = r7.f17084b
            java.lang.CharSequence r4 = r7.f17083a
            if (r2 >= 0) goto L2e
            r0 = 0
            int r2 = r4.length()
            float r0 = android.text.Layout.getDesiredWidth(r4, r0, r2, r3)
            double r5 = (double) r0
            double r5 = java.lang.Math.ceil(r5)
            float r0 = (float) r5
        L2e:
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto L33
            goto L55
        L33:
            boolean r2 = r4 instanceof android.text.Spanned
            if (r2 == 0) goto L49
            android.text.Spanned r4 = (android.text.Spanned) r4
            java.lang.Class<androidx.compose.ui.text.android.style.LetterSpacingSpanPx> r2 = androidx.compose.ui.text.android.style.LetterSpacingSpanPx.class
            boolean r2 = androidx.compose.ui.text.android.SpannedExtensions_androidKt.a(r4, r2)
            if (r2 != 0) goto L52
            java.lang.Class<androidx.compose.ui.text.android.style.LetterSpacingSpanEm> r2 = androidx.compose.ui.text.android.style.LetterSpacingSpanEm.class
            boolean r2 = androidx.compose.ui.text.android.SpannedExtensions_androidKt.a(r4, r2)
            if (r2 != 0) goto L52
        L49:
            float r2 = r3.getLetterSpacing()
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L52
            goto L55
        L52:
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
        L55:
            r7.d = r0
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.LayoutIntrinsics.b():float");
    }
}
