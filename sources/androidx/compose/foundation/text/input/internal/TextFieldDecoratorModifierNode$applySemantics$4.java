package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.jvm.internal.r;
import q0.q;

/* loaded from: classes4.dex */
final class TextFieldDecoratorModifierNode$applySemantics$4 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6558a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$applySemantics$4(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(3);
        this.f6558a = textFieldDecoratorModifierNode;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.f6558a;
        TextFieldCharSequence b2 = booleanValue ? textFieldDecoratorModifierNode.f6546q.f6651a.b() : textFieldDecoratorModifierNode.f6546q.d();
        long j2 = b2.f6298b;
        if (!textFieldDecoratorModifierNode.f6550u || Math.min(intValue, intValue2) < 0 || Math.max(intValue, intValue2) > b2.f6297a.length()) {
            return Boolean.FALSE;
        }
        int i2 = TextRange.f17057c;
        if (intValue == ((int) (j2 >> 32)) && intValue2 == ((int) (j2 & 4294967295L))) {
            return Boolean.TRUE;
        }
        long a2 = TextRangeKt.a(intValue, intValue2);
        if (booleanValue || intValue == intValue2) {
            textFieldDecoratorModifierNode.f6548s.A(TextToolbarState.f6863a);
        } else {
            textFieldDecoratorModifierNode.f6548s.A(TextToolbarState.f6865c);
        }
        if (booleanValue) {
            textFieldDecoratorModifierNode.f6546q.k(a2);
        } else {
            textFieldDecoratorModifierNode.f6546q.j(a2);
        }
        return Boolean.TRUE;
    }
}
