package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.text.TextLayoutResult;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class TextFieldDecoratorModifierNode$applySemantics$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6554a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$applySemantics$1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(1);
        this.f6554a = textFieldDecoratorModifierNode;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        List list = (List) obj;
        TextLayoutResult b2 = this.f6554a.f6547r.b();
        return Boolean.valueOf(b2 != null ? list.add(b2) : false);
    }
}
