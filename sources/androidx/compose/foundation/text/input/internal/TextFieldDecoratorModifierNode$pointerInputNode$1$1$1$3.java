package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.input.pointer.PointerInputScope;
import b1.d0;
import d0.b0;
import h0.g;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@j0.e(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3", f = "TextFieldDecoratorModifier.kt", l = {225}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f6591a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6592b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PointerInputScope f6593c;
    public final /* synthetic */ q0.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, q0.a aVar, g gVar) {
        super(2, gVar);
        this.f6592b = textFieldSelectionState;
        this.f6593c = pointerInputScope;
        this.d = aVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3(this.f6592b, this.f6593c, this.d, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f6591a;
        if (i2 == 0) {
            q.m(obj);
            this.f6591a = 1;
            if (this.f6592b.B(this.f6593c, this.d, this) == aVar) {
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
