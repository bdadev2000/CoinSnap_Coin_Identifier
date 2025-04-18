package androidx.compose.ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.selection.WordIterator;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;

@StabilityInferred
/* loaded from: classes.dex */
public final class TextLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f17113a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17114b;
    public final boolean d;
    public WordIterator e;

    /* renamed from: f, reason: collision with root package name */
    public final Layout f17116f;

    /* renamed from: g, reason: collision with root package name */
    public final int f17117g;

    /* renamed from: h, reason: collision with root package name */
    public final int f17118h;

    /* renamed from: i, reason: collision with root package name */
    public final int f17119i;

    /* renamed from: j, reason: collision with root package name */
    public final float f17120j;

    /* renamed from: k, reason: collision with root package name */
    public final float f17121k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f17122l;

    /* renamed from: m, reason: collision with root package name */
    public final Paint.FontMetricsInt f17123m;

    /* renamed from: n, reason: collision with root package name */
    public final int f17124n;

    /* renamed from: o, reason: collision with root package name */
    public final LineHeightStyleSpan[] f17125o;

    /* renamed from: q, reason: collision with root package name */
    public LayoutHelper f17127q;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17115c = true;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f17126p = new Rect();

    /* JADX WARN: Code restructure failed: missing block: B:112:0x017a, code lost:
    
        if (r11 >= 28) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0175, code lost:
    
        if (r10 == false) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x026e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0327  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TextLayout(java.lang.CharSequence r48, float r49, androidx.compose.ui.text.platform.AndroidTextPaint r50, int r51, android.text.TextUtils.TruncateAt r52, int r53, boolean r54, int r55, int r56, int r57, int r58, int r59, int r60, androidx.compose.ui.text.android.LayoutIntrinsics r61) {
        /*
            Method dump skipped, instructions count: 841
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.TextLayout.<init>(java.lang.CharSequence, float, androidx.compose.ui.text.platform.AndroidTextPaint, int, android.text.TextUtils$TruncateAt, int, boolean, int, int, int, int, int, int, androidx.compose.ui.text.android.LayoutIntrinsics):void");
    }

    public final void a(int i2, int i3, float[] fArr, int i4) {
        boolean z2;
        float a2;
        float a3;
        TextLayout textLayout = this;
        Layout layout = textLayout.f17116f;
        int length = layout.getText().length();
        if (i2 < 0) {
            throw new IllegalArgumentException("startOffset must be > 0".toString());
        }
        if (i2 >= length) {
            throw new IllegalArgumentException("startOffset must be less than text length".toString());
        }
        if (i3 <= i2) {
            throw new IllegalArgumentException("endOffset must be greater than startOffset".toString());
        }
        if (i3 > length) {
            throw new IllegalArgumentException("endOffset must be smaller or equal to text length".toString());
        }
        if (fArr.length - i4 < (i3 - i2) * 4) {
            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4".toString());
        }
        int lineForOffset = layout.getLineForOffset(i2);
        int lineForOffset2 = layout.getLineForOffset(i3 - 1);
        HorizontalPositionCache horizontalPositionCache = new HorizontalPositionCache(textLayout);
        if (lineForOffset > lineForOffset2) {
            return;
        }
        int i5 = lineForOffset;
        int i6 = i4;
        while (true) {
            int lineStart = layout.getLineStart(i5);
            int g2 = textLayout.g(i5);
            int max = Math.max(i2, lineStart);
            int min = Math.min(i3, g2);
            float h2 = textLayout.h(i5);
            float f2 = textLayout.f(i5);
            boolean z3 = false;
            boolean z4 = layout.getParagraphDirection(i5) == 1;
            boolean z5 = !z4;
            while (max < min) {
                boolean isRtlCharAt = layout.isRtlCharAt(max);
                if (!z4 || isRtlCharAt) {
                    if (z4 && isRtlCharAt) {
                        float a4 = horizontalPositionCache.a(max, false, false, false);
                        a2 = horizontalPositionCache.a(max + 1, true, true, false);
                        z2 = false;
                        a3 = a4;
                    } else if (z5 && isRtlCharAt) {
                        float a5 = horizontalPositionCache.a(max, false, false, true);
                        a2 = horizontalPositionCache.a(max + 1, true, true, true);
                        a3 = a5;
                    } else {
                        z2 = false;
                        a2 = horizontalPositionCache.a(max, false, false, false);
                        a3 = horizontalPositionCache.a(max + 1, true, true, false);
                    }
                    fArr[i6] = a2;
                    fArr[i6 + 1] = h2;
                    fArr[i6 + 2] = a3;
                    fArr[i6 + 3] = f2;
                    i6 += 4;
                    max++;
                    z3 = z2;
                } else {
                    a2 = horizontalPositionCache.a(max, z3, z3, true);
                    a3 = horizontalPositionCache.a(max + 1, true, true, true);
                }
                z2 = false;
                fArr[i6] = a2;
                fArr[i6 + 1] = h2;
                fArr[i6 + 2] = a3;
                fArr[i6 + 3] = f2;
                i6 += 4;
                max++;
                z3 = z2;
            }
            if (i5 == lineForOffset2) {
                return;
            }
            i5++;
            textLayout = this;
        }
    }

    public final int b() {
        boolean z2 = this.d;
        Layout layout = this.f17116f;
        return (z2 ? layout.getLineBottom(this.f17117g - 1) : layout.getHeight()) + this.f17118h + this.f17119i + this.f17124n;
    }

    public final float c(int i2) {
        if (i2 == this.f17117g - 1) {
            return this.f17120j + this.f17121k;
        }
        return 0.0f;
    }

    public final LayoutHelper d() {
        LayoutHelper layoutHelper = this.f17127q;
        if (layoutHelper != null) {
            p0.a.p(layoutHelper);
            return layoutHelper;
        }
        LayoutHelper layoutHelper2 = new LayoutHelper(this.f17116f);
        this.f17127q = layoutHelper2;
        return layoutHelper2;
    }

    public final float e(int i2) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f17118h + ((i2 != this.f17117g + (-1) || (fontMetricsInt = this.f17123m) == null) ? this.f17116f.getLineBaseline(i2) : h(i2) - fontMetricsInt.ascent);
    }

    public final float f(int i2) {
        Paint.FontMetricsInt fontMetricsInt;
        int i3 = this.f17117g;
        int i4 = i3 - 1;
        Layout layout = this.f17116f;
        if (i2 != i4 || (fontMetricsInt = this.f17123m) == null) {
            return this.f17118h + layout.getLineBottom(i2) + (i2 == i3 + (-1) ? this.f17119i : 0);
        }
        return layout.getLineBottom(i2 - 1) + fontMetricsInt.bottom;
    }

    public final int g(int i2) {
        Layout layout = this.f17116f;
        return layout.getEllipsisStart(i2) == 0 ? layout.getLineEnd(i2) : layout.getText().length();
    }

    public final float h(int i2) {
        return this.f17116f.getLineTop(i2) + (i2 == 0 ? 0 : this.f17118h);
    }

    public final float i(int i2, boolean z2) {
        return c(this.f17116f.getLineForOffset(i2)) + d().c(i2, true, z2);
    }

    public final float j(int i2, boolean z2) {
        return c(this.f17116f.getLineForOffset(i2)) + d().c(i2, false, z2);
    }

    public final WordIterator k() {
        WordIterator wordIterator = this.e;
        if (wordIterator != null) {
            return wordIterator;
        }
        Layout layout = this.f17116f;
        WordIterator wordIterator2 = new WordIterator(layout.getText(), layout.getText().length(), this.f17113a.getTextLocale());
        this.e = wordIterator2;
        return wordIterator2;
    }
}
