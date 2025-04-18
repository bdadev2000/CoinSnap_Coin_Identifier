package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import b1.d0;
import d0.b0;
import h0.g;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@j0.e(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onFocusChange$1", f = "TextFieldDecoratorModifier.kt", l = {634}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TextFieldDecoratorModifierNode$onFocusChange$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f6573a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6574b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$onFocusChange$1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, g gVar) {
        super(2, gVar);
        this.f6574b = textFieldDecoratorModifierNode;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new TextFieldDecoratorModifierNode$onFocusChange$1(this.f6574b, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((TextFieldDecoratorModifierNode$onFocusChange$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f6573a;
        if (i2 == 0) {
            q.m(obj);
            TextFieldSelectionState textFieldSelectionState = this.f6574b.f6548s;
            this.f6573a = 1;
            if (textFieldSelectionState.v(this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0.f30125a;
    }
}
