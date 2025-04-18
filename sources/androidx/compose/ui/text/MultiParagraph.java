package androidx.compose.ui.text;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.BrushKt$ShaderBrush$1;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.platform.AndroidMultiParagraphDraw_androidKt;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import b1.f0;
import e0.t;
import e0.u;
import java.util.ArrayList;
import java.util.List;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class MultiParagraph {

    /* renamed from: a, reason: collision with root package name */
    public final MultiParagraphIntrinsics f16911a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16912b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16913c;
    public final float d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16914f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f16915g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f16916h;

    public MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j2, int i2, boolean z2) {
        boolean z3;
        int h2;
        this.f16911a = multiParagraphIntrinsics;
        this.f16912b = i2;
        if (Constraints.k(j2) != 0 || Constraints.j(j2) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = multiParagraphIntrinsics.e;
        int size = arrayList2.size();
        int i3 = 0;
        int i4 = 0;
        float f2 = 0.0f;
        while (i3 < size) {
            ParagraphIntrinsicInfo paragraphIntrinsicInfo = (ParagraphIntrinsicInfo) arrayList2.get(i3);
            ParagraphIntrinsics paragraphIntrinsics = paragraphIntrinsicInfo.f16933a;
            int i5 = Constraints.i(j2);
            if (Constraints.d(j2)) {
                h2 = Constraints.h(j2) - ((int) Math.ceil(f2));
                if (h2 < 0) {
                    h2 = 0;
                }
            } else {
                h2 = Constraints.h(j2);
            }
            long b2 = ConstraintsKt.b(i5, h2, 5);
            int i6 = this.f16912b - i4;
            a.q(paragraphIntrinsics, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidParagraphIntrinsics");
            AndroidParagraph androidParagraph = new AndroidParagraph((AndroidParagraphIntrinsics) paragraphIntrinsics, i6, z2, b2);
            float height = androidParagraph.getHeight() + f2;
            TextLayout textLayout = androidParagraph.d;
            int i7 = i4 + textLayout.f17117g;
            arrayList.add(new ParagraphInfo(androidParagraph, paragraphIntrinsicInfo.f16934b, paragraphIntrinsicInfo.f16935c, i4, i7, f2, height));
            if (textLayout.d) {
                i4 = i7;
            } else {
                i4 = i7;
                if (i4 != this.f16912b || i3 == f0.p(this.f16911a.e)) {
                    i3++;
                    f2 = height;
                }
            }
            z3 = true;
            f2 = height;
            break;
        }
        z3 = false;
        this.e = f2;
        this.f16914f = i4;
        this.f16913c = z3;
        this.f16916h = arrayList;
        this.d = Constraints.i(j2);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i8 = 0; i8 < size2; i8++) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i8);
            List v2 = paragraphInfo.f16928a.v();
            ArrayList arrayList4 = new ArrayList(v2.size());
            int size3 = v2.size();
            for (int i9 = 0; i9 < size3; i9++) {
                Rect rect = (Rect) v2.get(i9);
                arrayList4.add(rect != null ? rect.m(OffsetKt.a(0.0f, paragraphInfo.f16931f)) : null);
            }
            t.t0(arrayList3, arrayList4);
        }
        if (arrayList3.size() < this.f16911a.f16924b.size()) {
            int size4 = this.f16911a.f16924b.size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i10 = 0; i10 < size4; i10++) {
                arrayList5.add(null);
            }
            arrayList3 = u.P0(arrayList5, arrayList3);
        }
        this.f16915g = arrayList3;
    }

    public static void g(MultiParagraph multiParagraph, Canvas canvas, long j2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2, int i3) {
        long j3 = (i3 & 2) != 0 ? Color.f14962i : j2;
        Shadow shadow2 = (i3 & 4) != 0 ? null : shadow;
        TextDecoration textDecoration2 = (i3 & 8) != 0 ? null : textDecoration;
        DrawStyle drawStyle2 = (i3 & 16) != 0 ? null : drawStyle;
        int i4 = (i3 & 32) != 0 ? 3 : i2;
        multiParagraph.getClass();
        canvas.p();
        ArrayList arrayList = multiParagraph.f16916h;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i5);
            paragraphInfo.f16928a.g(canvas, j3, shadow2, textDecoration2, drawStyle2, i4);
            canvas.h(0.0f, paragraphInfo.f16928a.getHeight());
            i5++;
            j3 = j3;
        }
        canvas.i();
    }

    public static void h(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle) {
        multiParagraph.getClass();
        canvas.p();
        ArrayList arrayList = multiParagraph.f16916h;
        if (arrayList.size() <= 1) {
            AndroidMultiParagraphDraw_androidKt.a(multiParagraph, canvas, brush, f2, shadow, textDecoration, drawStyle, 3);
        } else if (brush instanceof SolidColor) {
            AndroidMultiParagraphDraw_androidKt.a(multiParagraph, canvas, brush, f2, shadow, textDecoration, drawStyle, 3);
        } else if (brush instanceof ShaderBrush) {
            int size = arrayList.size();
            float f3 = 0.0f;
            float f4 = 0.0f;
            for (int i2 = 0; i2 < size; i2++) {
                ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i2);
                f4 += paragraphInfo.f16928a.getHeight();
                f3 = Math.max(f3, paragraphInfo.f16928a.getWidth());
            }
            Shader b2 = ((ShaderBrush) brush).b(SizeKt.a(f3, f4));
            Matrix matrix = new Matrix();
            b2.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ParagraphInfo paragraphInfo2 = (ParagraphInfo) arrayList.get(i3);
                paragraphInfo2.f16928a.p(canvas, new BrushKt$ShaderBrush$1(b2), f2, shadow, textDecoration, drawStyle, 3);
                Paragraph paragraph = paragraphInfo2.f16928a;
                canvas.h(0.0f, paragraph.getHeight());
                matrix.setTranslate(0.0f, -paragraph.getHeight());
                b2.setLocalMatrix(matrix);
            }
        }
        canvas.i();
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.jvm.internal.c0] */
    public final void a(long j2, float[] fArr) {
        i(TextRange.f(j2));
        j(TextRange.e(j2));
        ?? obj = new Object();
        obj.f30925a = 0;
        MultiParagraphKt.d(this.f16916h, j2, new MultiParagraph$fillBoundingBoxes$1(j2, fArr, obj, new Object()));
    }

    public final float b(int i2) {
        k(i2);
        ArrayList arrayList = this.f16916h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(MultiParagraphKt.b(i2, arrayList));
        return paragraphInfo.f16928a.u(i2 - paragraphInfo.d) + paragraphInfo.f16931f;
    }

    public final int c(float f2) {
        ArrayList arrayList = this.f16916h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(MultiParagraphKt.c(arrayList, f2));
        int i2 = paragraphInfo.f16930c - paragraphInfo.f16929b;
        int i3 = paragraphInfo.d;
        if (i2 == 0) {
            return i3;
        }
        return i3 + paragraphInfo.f16928a.m(f2 - paragraphInfo.f16931f);
    }

    public final float d(int i2) {
        k(i2);
        ArrayList arrayList = this.f16916h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(MultiParagraphKt.b(i2, arrayList));
        return paragraphInfo.f16928a.e(i2 - paragraphInfo.d) + paragraphInfo.f16931f;
    }

    public final int e(long j2) {
        ArrayList arrayList = this.f16916h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(MultiParagraphKt.c(arrayList, Offset.h(j2)));
        int i2 = paragraphInfo.f16930c;
        int i3 = paragraphInfo.f16929b;
        if (i2 - i3 == 0) {
            return i3;
        }
        return i3 + paragraphInfo.f16928a.j(OffsetKt.a(Offset.g(j2), Offset.h(j2) - paragraphInfo.f16931f));
    }

    public final long f(Rect rect, int i2, androidx.compose.animation.core.a aVar) {
        long j2;
        long j3;
        ArrayList arrayList = this.f16916h;
        int c2 = MultiParagraphKt.c(arrayList, rect.f14915b);
        float f2 = ((ParagraphInfo) arrayList.get(c2)).f16932g;
        float f3 = rect.d;
        if (f2 >= f3 || c2 == f0.p(arrayList)) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(c2);
            return paragraphInfo.a(paragraphInfo.f16928a.w(rect.m(OffsetKt.a(0.0f, -paragraphInfo.f16931f)), i2, aVar), true);
        }
        int c3 = MultiParagraphKt.c(arrayList, f3);
        long j4 = TextRange.f17056b;
        while (true) {
            j2 = TextRange.f17056b;
            if (!TextRange.b(j4, j2) || c2 > c3) {
                break;
            }
            ParagraphInfo paragraphInfo2 = (ParagraphInfo) arrayList.get(c2);
            j4 = paragraphInfo2.a(paragraphInfo2.f16928a.w(rect.m(OffsetKt.a(0.0f, -paragraphInfo2.f16931f)), i2, aVar), true);
            c2++;
        }
        if (TextRange.b(j4, j2)) {
            return j2;
        }
        while (true) {
            j3 = TextRange.f17056b;
            if (!TextRange.b(j2, j3) || c2 > c3) {
                break;
            }
            ParagraphInfo paragraphInfo3 = (ParagraphInfo) arrayList.get(c3);
            j2 = paragraphInfo3.a(paragraphInfo3.f16928a.w(rect.m(OffsetKt.a(0.0f, -paragraphInfo3.f16931f)), i2, aVar), true);
            c3--;
        }
        return TextRange.b(j2, j3) ? j4 : TextRangeKt.a((int) (j4 >> 32), (int) (4294967295L & j2));
    }

    public final void i(int i2) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.f16911a;
        if (i2 < 0 || i2 >= multiParagraphIntrinsics.f16923a.f16880a.length()) {
            StringBuilder t2 = d.t("offset(", i2, ") is out of bounds [0, ");
            t2.append(multiParagraphIntrinsics.f16923a.f16880a.length());
            t2.append(')');
            throw new IllegalArgumentException(t2.toString().toString());
        }
    }

    public final void j(int i2) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.f16911a;
        if (i2 < 0 || i2 > multiParagraphIntrinsics.f16923a.f16880a.length()) {
            StringBuilder t2 = d.t("offset(", i2, ") is out of bounds [0, ");
            t2.append(multiParagraphIntrinsics.f16923a.f16880a.length());
            t2.append(']');
            throw new IllegalArgumentException(t2.toString().toString());
        }
    }

    public final void k(int i2) {
        int i3 = this.f16914f;
        if (i2 < 0 || i2 >= i3) {
            throw new IllegalArgumentException(("lineIndex(" + i2 + ") is out of bounds [0, " + i3 + ')').toString());
        }
    }
}
