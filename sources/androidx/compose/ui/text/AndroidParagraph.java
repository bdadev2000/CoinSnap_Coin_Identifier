package androidx.compose.ui.text;

import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.support.v4.media.d;
import android.text.Layout;
import android.text.TextUtils;
import androidx.compose.animation.core.a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.android.AndroidLayoutApi34;
import androidx.compose.ui.text.android.LayoutHelper;
import androidx.compose.ui.text.android.LayoutIntrinsics;
import androidx.compose.ui.text.android.TextAndroidCanvas;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.TextLayoutGetRangeForRectExtensions_androidKt;
import androidx.compose.ui.text.android.TextLayout_androidKt;
import androidx.compose.ui.text.android.selection.GraphemeClusterSegmentFinderApi29;
import androidx.compose.ui.text.android.selection.GraphemeClusterSegmentFinderUnderApi29;
import androidx.compose.ui.text.android.selection.SegmentFinder;
import androidx.compose.ui.text.android.selection.WordIterator;
import androidx.compose.ui.text.android.selection.WordSegmentFinder;
import androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt;
import androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt$NoopSpan$1;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import java.text.BreakIterator;
import java.util.List;

@StabilityInferred
/* loaded from: classes.dex */
public final class AndroidParagraph implements Paragraph {

    /* renamed from: a, reason: collision with root package name */
    public final AndroidParagraphIntrinsics f16875a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16876b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16877c;
    public final TextLayout d;
    public final CharSequence e;

    /* renamed from: f, reason: collision with root package name */
    public final List f16878f;

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ResolvedTextDirection.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:102:0x02b7. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0126 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x022c  */
    /* JADX WARN: Type inference failed for: r0v37, types: [android.text.Spannable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AndroidParagraph(androidx.compose.ui.text.platform.AndroidParagraphIntrinsics r25, int r26, boolean r27, long r28) {
        /*
            Method dump skipped, instructions count: 874
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.AndroidParagraph.<init>(androidx.compose.ui.text.platform.AndroidParagraphIntrinsics, int, boolean, long):void");
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final ResolvedTextDirection a(int i2) {
        TextLayout textLayout = this.d;
        return textLayout.f17116f.getParagraphDirection(textLayout.f17116f.getLineForOffset(i2)) == 1 ? ResolvedTextDirection.f17460a : ResolvedTextDirection.f17461b;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final float b(int i2) {
        TextLayout textLayout = this.d;
        return textLayout.f17116f.getLineRight(i2) + (i2 == textLayout.f17117g + (-1) ? textLayout.f17121k : 0.0f);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final float c(int i2) {
        TextLayout textLayout = this.d;
        return textLayout.f17116f.getLineLeft(i2) + (i2 == textLayout.f17117g + (-1) ? textLayout.f17120j : 0.0f);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final Rect d(int i2) {
        float j2;
        float j3;
        float i3;
        float i4;
        CharSequence charSequence = this.e;
        if (i2 < 0 || i2 >= charSequence.length()) {
            StringBuilder t2 = d.t("offset(", i2, ") is out of bounds [0,");
            t2.append(charSequence.length());
            t2.append(')');
            throw new IllegalArgumentException(t2.toString().toString());
        }
        TextLayout textLayout = this.d;
        Layout layout = textLayout.f17116f;
        int lineForOffset = layout.getLineForOffset(i2);
        float h2 = textLayout.h(lineForOffset);
        float f2 = textLayout.f(lineForOffset);
        boolean z2 = layout.getParagraphDirection(lineForOffset) == 1;
        boolean isRtlCharAt = layout.isRtlCharAt(i2);
        if (!z2 || isRtlCharAt) {
            if (z2 && isRtlCharAt) {
                i3 = textLayout.j(i2, false);
                i4 = textLayout.j(i2 + 1, true);
            } else if (isRtlCharAt) {
                i3 = textLayout.i(i2, false);
                i4 = textLayout.i(i2 + 1, true);
            } else {
                j2 = textLayout.j(i2, false);
                j3 = textLayout.j(i2 + 1, true);
            }
            float f3 = i3;
            j2 = i4;
            j3 = f3;
        } else {
            j2 = textLayout.i(i2, false);
            j3 = textLayout.i(i2 + 1, true);
        }
        RectF rectF = new RectF(j2, h2, j3, f2);
        return new Rect(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final float e(int i2) {
        return this.d.h(i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final Rect f(int i2) {
        CharSequence charSequence = this.e;
        if (i2 < 0 || i2 > charSequence.length()) {
            StringBuilder t2 = d.t("offset(", i2, ") is out of bounds [0,");
            t2.append(charSequence.length());
            t2.append(']');
            throw new IllegalArgumentException(t2.toString().toString());
        }
        TextLayout textLayout = this.d;
        float i3 = textLayout.i(i2, false);
        int lineForOffset = textLayout.f17116f.getLineForOffset(i2);
        return new Rect(i3, textLayout.h(lineForOffset), i3, textLayout.f(lineForOffset));
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final void g(Canvas canvas, long j2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2) {
        AndroidParagraphIntrinsics androidParagraphIntrinsics = this.f16875a;
        AndroidTextPaint androidTextPaint = androidParagraphIntrinsics.f17410g;
        int i3 = androidTextPaint.f17419c;
        androidTextPaint.d(j2);
        androidTextPaint.f(shadow);
        androidTextPaint.g(textDecoration);
        androidTextPaint.e(drawStyle);
        androidTextPaint.b(i2);
        z(canvas);
        androidParagraphIntrinsics.f17410g.b(i3);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final float getHeight() {
        return this.d.b();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final float getWidth() {
        return Constraints.i(this.f16877c);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final long h(int i2) {
        int preceding;
        int i3;
        int following;
        WordIterator k2 = this.d.k();
        k2.a(i2);
        BreakIterator breakIterator = k2.d;
        if (k2.e(breakIterator.preceding(i2))) {
            k2.a(i2);
            preceding = i2;
            while (preceding != -1 && (!k2.e(preceding) || k2.c(preceding))) {
                k2.a(preceding);
                preceding = breakIterator.preceding(preceding);
            }
        } else {
            k2.a(i2);
            preceding = k2.d(i2) ? (!breakIterator.isBoundary(i2) || k2.b(i2)) ? breakIterator.preceding(i2) : i2 : k2.b(i2) ? breakIterator.preceding(i2) : -1;
        }
        if (preceding == -1) {
            preceding = i2;
        }
        k2.a(i2);
        if (k2.c(breakIterator.following(i2))) {
            k2.a(i2);
            i3 = i2;
            while (i3 != -1 && (k2.e(i3) || !k2.c(i3))) {
                k2.a(i3);
                i3 = breakIterator.following(i3);
            }
        } else {
            k2.a(i2);
            if (k2.b(i2)) {
                following = (!breakIterator.isBoundary(i2) || k2.d(i2)) ? breakIterator.following(i2) : i2;
            } else if (k2.d(i2)) {
                following = breakIterator.following(i2);
            } else {
                i3 = -1;
            }
            i3 = following;
        }
        if (i3 != -1) {
            i2 = i3;
        }
        return TextRangeKt.a(preceding, i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final float i() {
        return this.d.e(0);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final int j(long j2) {
        int h2 = (int) Offset.h(j2);
        TextLayout textLayout = this.d;
        int i2 = h2 - textLayout.f17118h;
        Layout layout = textLayout.f17116f;
        int lineForVertical = layout.getLineForVertical(i2);
        return layout.getOffsetForHorizontal(lineForVertical, (textLayout.c(lineForVertical) * (-1)) + Offset.g(j2));
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final int k(int i2) {
        return this.d.f17116f.getLineStart(i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final int l(int i2, boolean z2) {
        TextLayout textLayout = this.d;
        if (!z2) {
            return textLayout.g(i2);
        }
        Layout layout = textLayout.f17116f;
        if (layout.getEllipsisStart(i2) != 0) {
            return layout.getEllipsisStart(i2) + layout.getLineStart(i2);
        }
        LayoutHelper d = textLayout.d();
        Layout layout2 = d.f17077a;
        return d.f(layout2.getLineEnd(i2), layout2.getLineStart(i2));
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final int m(float f2) {
        TextLayout textLayout = this.d;
        return textLayout.f17116f.getLineForVertical(((int) f2) - textLayout.f17118h);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final AndroidPath n(int i2, int i3) {
        CharSequence charSequence = this.e;
        if (i2 < 0 || i2 > i3 || i3 > charSequence.length()) {
            StringBuilder u2 = d.u("start(", i2, ") or end(", i3, ") is out of range [0..");
            u2.append(charSequence.length());
            u2.append("], or start > end!");
            throw new IllegalArgumentException(u2.toString().toString());
        }
        Path path = new Path();
        TextLayout textLayout = this.d;
        textLayout.f17116f.getSelectionPath(i2, i3, path);
        int i4 = textLayout.f17118h;
        if (i4 != 0 && !path.isEmpty()) {
            path.offset(0.0f, i4);
        }
        return new AndroidPath(path);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final float o(int i2, boolean z2) {
        TextLayout textLayout = this.d;
        return z2 ? textLayout.i(i2, false) : textLayout.j(i2, false);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final void p(Canvas canvas, Brush brush, float f2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2) {
        AndroidParagraphIntrinsics androidParagraphIntrinsics = this.f16875a;
        AndroidTextPaint androidTextPaint = androidParagraphIntrinsics.f17410g;
        int i3 = androidTextPaint.f17419c;
        androidTextPaint.c(brush, SizeKt.a(getWidth(), getHeight()), f2);
        androidTextPaint.f(shadow);
        androidTextPaint.g(textDecoration);
        androidTextPaint.e(drawStyle);
        androidTextPaint.b(i2);
        z(canvas);
        androidParagraphIntrinsics.f17410g.b(i3);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final void q(long j2, float[] fArr, int i2) {
        this.d.a(TextRange.f(j2), TextRange.e(j2), fArr, i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final float r() {
        return this.d.e(r0.f17117g - 1);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final int s(int i2) {
        return this.d.f17116f.getLineForOffset(i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final ResolvedTextDirection t(int i2) {
        return this.d.f17116f.isRtlCharAt(i2) ? ResolvedTextDirection.f17461b : ResolvedTextDirection.f17460a;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final float u(int i2) {
        return this.d.f(i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final List v() {
        return this.f16878f;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final long w(Rect rect, int i2, a aVar) {
        SegmentFinder graphemeClusterSegmentFinderApi29;
        int i3;
        char c2;
        int[] iArr;
        RectF c3 = RectHelper_androidKt.c(rect);
        int i4 = (!TextGranularity.a(i2, 0) && TextGranularity.a(i2, 1)) ? 1 : 0;
        AndroidParagraph$getRangeForRect$range$1 androidParagraph$getRangeForRect$range$1 = new AndroidParagraph$getRangeForRect$range$1(aVar);
        int i5 = Build.VERSION.SDK_INT;
        TextLayout textLayout = this.d;
        if (i5 >= 34) {
            textLayout.getClass();
            iArr = AndroidLayoutApi34.f17064a.a(textLayout, c3, i4, androidParagraph$getRangeForRect$range$1);
            c2 = 1;
        } else {
            LayoutHelper d = textLayout.d();
            Layout layout = textLayout.f17116f;
            if (i4 == 1) {
                graphemeClusterSegmentFinderApi29 = new WordSegmentFinder(layout.getText(), textLayout.k());
            } else {
                CharSequence text = layout.getText();
                graphemeClusterSegmentFinderApi29 = i5 >= 29 ? new GraphemeClusterSegmentFinderApi29(textLayout.f17113a, text) : new GraphemeClusterSegmentFinderUnderApi29(text);
            }
            SegmentFinder segmentFinder = graphemeClusterSegmentFinderApi29;
            int lineForVertical = layout.getLineForVertical((int) c3.top);
            if (c3.top <= textLayout.f(lineForVertical) || (lineForVertical = lineForVertical + 1) < textLayout.f17117g) {
                int i6 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) c3.bottom);
                if (lineForVertical2 != 0 || c3.bottom >= textLayout.h(0)) {
                    int b2 = TextLayoutGetRangeForRectExtensions_androidKt.b(textLayout, layout, d, i6, c3, segmentFinder, androidParagraph$getRangeForRect$range$1, true);
                    while (true) {
                        i3 = i6;
                        if (b2 != -1 || i3 >= lineForVertical2) {
                            break;
                        }
                        i6 = i3 + 1;
                        b2 = TextLayoutGetRangeForRectExtensions_androidKt.b(textLayout, layout, d, i6, c3, segmentFinder, androidParagraph$getRangeForRect$range$1, true);
                    }
                    if (b2 != -1) {
                        int i7 = i3;
                        int i8 = b2;
                        int b3 = TextLayoutGetRangeForRectExtensions_androidKt.b(textLayout, layout, d, lineForVertical2, c3, segmentFinder, androidParagraph$getRangeForRect$range$1, false);
                        int i9 = lineForVertical2;
                        while (b3 == -1) {
                            int i10 = i7;
                            if (i10 >= i9) {
                                break;
                            }
                            int i11 = i9 - 1;
                            b3 = TextLayoutGetRangeForRectExtensions_androidKt.b(textLayout, layout, d, i11, c3, segmentFinder, androidParagraph$getRangeForRect$range$1, false);
                            i7 = i10;
                            i9 = i11;
                        }
                        if (b3 == -1) {
                            iArr = null;
                            c2 = 1;
                        } else {
                            c2 = 1;
                            iArr = new int[]{segmentFinder.b(i8 + 1), segmentFinder.c(b3 - 1)};
                        }
                    }
                }
            }
            c2 = 1;
            iArr = null;
        }
        return iArr == null ? TextRange.f17056b : TextRangeKt.a(iArr[0], iArr[c2]);
    }

    public final TextLayout x(int i2, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, int i6, int i7, int i8) {
        PlatformParagraphStyle platformParagraphStyle;
        CharSequence charSequence = this.e;
        float width = getWidth();
        AndroidParagraphIntrinsics androidParagraphIntrinsics = this.f16875a;
        AndroidTextPaint androidTextPaint = androidParagraphIntrinsics.f17410g;
        int i9 = androidParagraphIntrinsics.f17415l;
        LayoutIntrinsics layoutIntrinsics = androidParagraphIntrinsics.f17412i;
        AndroidParagraphHelper_androidKt$NoopSpan$1 androidParagraphHelper_androidKt$NoopSpan$1 = AndroidParagraphHelper_androidKt.f17405a;
        PlatformTextStyle platformTextStyle = androidParagraphIntrinsics.f17407b.f17061c;
        return new TextLayout(charSequence, width, androidTextPaint, i2, truncateAt, i9, (platformTextStyle == null || (platformParagraphStyle = platformTextStyle.f16950b) == null) ? false : platformParagraphStyle.f16946a, i4, i6, i7, i8, i5, i3, layoutIntrinsics);
    }

    public final float y() {
        return this.f16875a.f17412i.b();
    }

    public final void z(Canvas canvas) {
        android.graphics.Canvas b2 = AndroidCanvas_androidKt.b(canvas);
        TextLayout textLayout = this.d;
        if (textLayout.d) {
            b2.save();
            b2.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        if (b2.getClipBounds(textLayout.f17126p)) {
            int i2 = textLayout.f17118h;
            if (i2 != 0) {
                b2.translate(0.0f, i2);
            }
            TextAndroidCanvas textAndroidCanvas = TextLayout_androidKt.f17128a;
            textAndroidCanvas.f17112a = b2;
            textLayout.f17116f.draw(textAndroidCanvas);
            if (i2 != 0) {
                b2.translate(0.0f, (-1) * i2);
            }
        }
        if (textLayout.d) {
            b2.restore();
        }
    }
}
