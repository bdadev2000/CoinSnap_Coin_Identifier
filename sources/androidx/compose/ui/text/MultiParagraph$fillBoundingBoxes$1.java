package androidx.compose.ui.text;

import d0.b0;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class MultiParagraph$fillBoundingBoxes$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f16917a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float[] f16918b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f16919c;
    public final /* synthetic */ c0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiParagraph$fillBoundingBoxes$1(long j2, float[] fArr, d0 d0Var, c0 c0Var) {
        super(1);
        this.f16917a = j2;
        this.f16918b = fArr;
        this.f16919c = d0Var;
        this.d = c0Var;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ParagraphInfo paragraphInfo = (ParagraphInfo) obj;
        int i2 = paragraphInfo.f16929b;
        long j2 = this.f16917a;
        int f2 = i2 > TextRange.f(j2) ? paragraphInfo.f16929b : TextRange.f(j2);
        int e = TextRange.e(j2);
        int i3 = paragraphInfo.f16930c;
        if (i3 >= e) {
            i3 = TextRange.e(j2);
        }
        long a2 = TextRangeKt.a(paragraphInfo.b(f2), paragraphInfo.b(i3));
        d0 d0Var = this.f16919c;
        int i4 = d0Var.f30925a;
        Paragraph paragraph = paragraphInfo.f16928a;
        float[] fArr = this.f16918b;
        paragraph.q(a2, fArr, i4);
        int d = (TextRange.d(a2) * 4) + d0Var.f30925a;
        int i5 = d0Var.f30925a;
        while (true) {
            c0 c0Var = this.d;
            if (i5 >= d) {
                d0Var.f30925a = d;
                c0Var.f30922a = paragraph.getHeight() + c0Var.f30922a;
                return b0.f30125a;
            }
            int i6 = i5 + 1;
            float f3 = fArr[i6];
            float f4 = c0Var.f30922a;
            fArr[i6] = f3 + f4;
            int i7 = i5 + 3;
            fArr[i7] = fArr[i7] + f4;
            i5 += 4;
        }
    }
}
