package androidx.compose.ui.text;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.IntSize;
import b1.f0;
import e0.u;
import java.util.ArrayList;
import java.util.List;
import p0.a;

@StabilityInferred
/* loaded from: classes.dex */
public final class TextLayoutResult {

    /* renamed from: a, reason: collision with root package name */
    public final TextLayoutInput f17046a;

    /* renamed from: b, reason: collision with root package name */
    public final MultiParagraph f17047b;

    /* renamed from: c, reason: collision with root package name */
    public final long f17048c;
    public final float d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final List f17049f;

    public TextLayoutResult(TextLayoutInput textLayoutInput, MultiParagraph multiParagraph, long j2) {
        this.f17046a = textLayoutInput;
        this.f17047b = multiParagraph;
        this.f17048c = j2;
        ArrayList arrayList = multiParagraph.f16916h;
        float f2 = 0.0f;
        this.d = arrayList.isEmpty() ? 0.0f : ((ParagraphInfo) arrayList.get(0)).f16928a.i();
        ArrayList arrayList2 = multiParagraph.f16916h;
        if (!arrayList2.isEmpty()) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) u.L0(arrayList2);
            f2 = paragraphInfo.f16928a.r() + paragraphInfo.f16931f;
        }
        this.e = f2;
        this.f17049f = multiParagraph.f16915g;
    }

    public final ResolvedTextDirection a(int i2) {
        MultiParagraph multiParagraph = this.f17047b;
        multiParagraph.j(i2);
        int length = multiParagraph.f16911a.f16923a.f16880a.length();
        ArrayList arrayList = multiParagraph.f16916h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i2 == length ? f0.p(arrayList) : MultiParagraphKt.a(i2, arrayList));
        return paragraphInfo.f16928a.t(paragraphInfo.b(i2));
    }

    public final Rect b(int i2) {
        MultiParagraph multiParagraph = this.f17047b;
        multiParagraph.i(i2);
        ArrayList arrayList = multiParagraph.f16916h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(MultiParagraphKt.a(i2, arrayList));
        return paragraphInfo.f16928a.d(paragraphInfo.b(i2)).m(OffsetKt.a(0.0f, paragraphInfo.f16931f));
    }

    public final Rect c(int i2) {
        MultiParagraph multiParagraph = this.f17047b;
        multiParagraph.j(i2);
        int length = multiParagraph.f16911a.f16923a.f16880a.length();
        ArrayList arrayList = multiParagraph.f16916h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i2 == length ? f0.p(arrayList) : MultiParagraphKt.a(i2, arrayList));
        return paragraphInfo.f16928a.f(paragraphInfo.b(i2)).m(OffsetKt.a(0.0f, paragraphInfo.f16931f));
    }

    public final boolean d() {
        long j2 = this.f17048c;
        float f2 = (int) (j2 >> 32);
        MultiParagraph multiParagraph = this.f17047b;
        return f2 < multiParagraph.d || multiParagraph.f16913c || ((float) ((int) (j2 & 4294967295L))) < multiParagraph.e;
    }

    public final int e(int i2, boolean z2) {
        MultiParagraph multiParagraph = this.f17047b;
        multiParagraph.k(i2);
        ArrayList arrayList = multiParagraph.f16916h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(MultiParagraphKt.b(i2, arrayList));
        return paragraphInfo.f16928a.l(i2 - paragraphInfo.d, z2) + paragraphInfo.f16929b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextLayoutResult)) {
            return false;
        }
        TextLayoutResult textLayoutResult = (TextLayoutResult) obj;
        return a.g(this.f17046a, textLayoutResult.f17046a) && a.g(this.f17047b, textLayoutResult.f17047b) && IntSize.b(this.f17048c, textLayoutResult.f17048c) && this.d == textLayoutResult.d && this.e == textLayoutResult.e && a.g(this.f17049f, textLayoutResult.f17049f);
    }

    public final int f(int i2) {
        MultiParagraph multiParagraph = this.f17047b;
        int length = multiParagraph.f16911a.f16923a.f16880a.length();
        ArrayList arrayList = multiParagraph.f16916h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i2 >= length ? f0.p(arrayList) : i2 < 0 ? 0 : MultiParagraphKt.a(i2, arrayList));
        return paragraphInfo.f16928a.s(paragraphInfo.b(i2)) + paragraphInfo.d;
    }

    public final float g(int i2) {
        MultiParagraph multiParagraph = this.f17047b;
        multiParagraph.k(i2);
        ArrayList arrayList = multiParagraph.f16916h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(MultiParagraphKt.b(i2, arrayList));
        return paragraphInfo.f16928a.c(i2 - paragraphInfo.d);
    }

    public final float h(int i2) {
        MultiParagraph multiParagraph = this.f17047b;
        multiParagraph.k(i2);
        ArrayList arrayList = multiParagraph.f16916h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(MultiParagraphKt.b(i2, arrayList));
        return paragraphInfo.f16928a.b(i2 - paragraphInfo.d);
    }

    public final int hashCode() {
        return this.f17049f.hashCode() + d.b(this.e, d.b(this.d, d.d(this.f17048c, (this.f17047b.hashCode() + (this.f17046a.hashCode() * 31)) * 31, 31), 31), 31);
    }

    public final int i(int i2) {
        MultiParagraph multiParagraph = this.f17047b;
        multiParagraph.k(i2);
        ArrayList arrayList = multiParagraph.f16916h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(MultiParagraphKt.b(i2, arrayList));
        return paragraphInfo.f16928a.k(i2 - paragraphInfo.d) + paragraphInfo.f16929b;
    }

    public final ResolvedTextDirection j(int i2) {
        MultiParagraph multiParagraph = this.f17047b;
        multiParagraph.j(i2);
        int length = multiParagraph.f16911a.f16923a.f16880a.length();
        ArrayList arrayList = multiParagraph.f16916h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i2 == length ? f0.p(arrayList) : MultiParagraphKt.a(i2, arrayList));
        return paragraphInfo.f16928a.a(paragraphInfo.b(i2));
    }

    public final AndroidPath k(int i2, int i3) {
        MultiParagraph multiParagraph = this.f17047b;
        MultiParagraphIntrinsics multiParagraphIntrinsics = multiParagraph.f16911a;
        if (i2 < 0 || i2 > i3 || i3 > multiParagraphIntrinsics.f16923a.f16880a.length()) {
            StringBuilder u2 = d.u("Start(", i2, ") or End(", i3, ") is out of range [0..");
            u2.append(multiParagraphIntrinsics.f16923a.f16880a.length());
            u2.append("), or start > end!");
            throw new IllegalArgumentException(u2.toString().toString());
        }
        if (i2 == i3) {
            return AndroidPath_androidKt.a();
        }
        AndroidPath a2 = AndroidPath_androidKt.a();
        MultiParagraphKt.d(multiParagraph.f16916h, TextRangeKt.a(i2, i3), new MultiParagraph$getPathForRange$2(a2, i2, i3));
        return a2;
    }

    public final long l(int i2) {
        MultiParagraph multiParagraph = this.f17047b;
        multiParagraph.j(i2);
        int length = multiParagraph.f16911a.f16923a.f16880a.length();
        ArrayList arrayList = multiParagraph.f16916h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i2 == length ? f0.p(arrayList) : MultiParagraphKt.a(i2, arrayList));
        return paragraphInfo.a(paragraphInfo.f16928a.h(paragraphInfo.b(i2)), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f17046a + ", multiParagraph=" + this.f17047b + ", size=" + ((Object) IntSize.e(this.f17048c)) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f17049f + ')';
    }
}
