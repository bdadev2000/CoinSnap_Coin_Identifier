package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphKt;
import androidx.compose.ui.text.ParagraphInfo;
import androidx.compose.ui.text.TextLayoutResult;
import b1.f0;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class TextSelectionDelegateKt {
    public static final long a(TextLayoutResult textLayoutResult, int i2, boolean z2, boolean z3) {
        int f2 = textLayoutResult.f(i2);
        MultiParagraph multiParagraph = textLayoutResult.f17047b;
        if (f2 >= multiParagraph.f16914f) {
            return 9205357640488583168L;
        }
        boolean z4 = textLayoutResult.a(((!z2 || z3) && (z2 || !z3)) ? Math.max(i2 + (-1), 0) : i2) == textLayoutResult.j(i2);
        multiParagraph.j(i2);
        int length = multiParagraph.f16911a.f16923a.f16880a.length();
        ArrayList arrayList = multiParagraph.f16916h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i2 == length ? f0.p(arrayList) : MultiParagraphKt.a(i2, arrayList));
        float o2 = paragraphInfo.f16928a.o(paragraphInfo.b(i2), z4);
        long j2 = textLayoutResult.f17048c;
        return OffsetKt.a(p0.a.z(o2, 0.0f, (int) (j2 >> 32)), p0.a.z(multiParagraph.b(f2), 0.0f, (int) (j2 & 4294967295L)));
    }
}
