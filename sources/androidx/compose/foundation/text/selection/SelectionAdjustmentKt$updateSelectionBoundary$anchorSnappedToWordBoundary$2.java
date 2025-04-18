package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import d0.h;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SelectionAdjustmentKt$updateSelectionBoundary$anchorSnappedToWordBoundary$2 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SelectableInfo f7094a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7095b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7096c;
    public final /* synthetic */ SelectionLayout d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f7097f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionAdjustmentKt$updateSelectionBoundary$anchorSnappedToWordBoundary$2(SelectableInfo selectableInfo, int i2, int i3, SelectionLayout selectionLayout, h hVar) {
        super(0);
        this.f7094a = selectableInfo;
        this.f7095b = i2;
        this.f7096c = i3;
        this.d = selectionLayout;
        this.f7097f = hVar;
    }

    @Override // q0.a
    public final Object invoke() {
        int intValue = ((Number) this.f7097f.getValue()).intValue();
        SelectionLayout selectionLayout = this.d;
        boolean a2 = selectionLayout.a();
        boolean z2 = selectionLayout.e() == CrossStatus.f7053a;
        SelectableInfo selectableInfo = this.f7094a;
        TextLayoutResult textLayoutResult = selectableInfo.f7082f;
        int i2 = this.f7095b;
        long l2 = textLayoutResult.l(i2);
        int i3 = TextRange.f17057c;
        int i4 = (int) (l2 >> 32);
        TextLayoutResult textLayoutResult2 = selectableInfo.f7082f;
        int f2 = textLayoutResult2.f(i4);
        MultiParagraph multiParagraph = textLayoutResult2.f17047b;
        if (f2 != intValue) {
            int i5 = multiParagraph.f16914f;
            i4 = intValue >= i5 ? textLayoutResult2.i(i5 - 1) : textLayoutResult2.i(intValue);
        }
        int i6 = (int) (l2 & 4294967295L);
        if (textLayoutResult2.f(i6) != intValue) {
            int i7 = multiParagraph.f16914f;
            i6 = intValue >= i7 ? textLayoutResult2.e(i7 - 1, false) : textLayoutResult2.e(intValue, false);
        }
        int i8 = this.f7096c;
        if (i4 == i8) {
            return selectableInfo.a(i6);
        }
        if (i6 == i8) {
            return selectableInfo.a(i4);
        }
        if (!(a2 ^ z2) ? i2 >= i4 : i2 > i6) {
            i4 = i6;
        }
        return selectableInfo.a(i4);
    }
}
