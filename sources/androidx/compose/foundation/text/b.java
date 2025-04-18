package androidx.compose.foundation.text;

import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import com.applovin.impl.hc;
import com.applovin.impl.s0;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements TextRangeScopeMeasurePolicy, hc.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6263b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6264c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(int i2, int i3, Object obj) {
        this.d = obj;
        this.f6263b = i2;
        this.f6264c = i3;
    }

    @Override // com.applovin.impl.hc.a
    public final void a(Object obj) {
        ((s0) obj).a((s0.a) this.d, this.f6263b, this.f6264c);
    }

    @Override // androidx.compose.foundation.text.TextRangeScopeMeasurePolicy
    public final TextRangeLayoutMeasureResult a(TextRangeLayoutMeasureScope textRangeLayoutMeasureScope) {
        TextLayoutResult textLayoutResult = (TextLayoutResult) ((TextLinkScope) this.d).f6214b.getValue();
        if (textLayoutResult == null) {
            return new TextRangeLayoutMeasureResult(0, TextLinkScope$textRange$1$layoutResult$1.f6235a, 0);
        }
        IntRect b2 = IntRectKt.b(textLayoutResult.k(this.f6263b, this.f6264c).b());
        return new TextRangeLayoutMeasureResult(b2.c(), new TextLinkScope$textRange$1$1(b2), b2.b());
    }
}
