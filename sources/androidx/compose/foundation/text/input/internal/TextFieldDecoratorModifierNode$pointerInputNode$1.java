package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.input.pointer.PointerInputScope;
import b1.d0;
import d0.b0;
import h0.g;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@j0.e(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1", f = "TextFieldDecoratorModifier.kt", l = {201}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TextFieldDecoratorModifierNode$pointerInputNode$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f6577a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6578b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6579c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @j0.e(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1", f = "TextFieldDecoratorModifier.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f6580a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextFieldDecoratorModifierNode f6581b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PointerInputScope f6582c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, PointerInputScope pointerInputScope, g gVar) {
            super(2, gVar);
            this.f6581b = textFieldDecoratorModifierNode;
            this.f6582c = pointerInputScope;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f6581b, this.f6582c, gVar);
            anonymousClass1.f6580a = obj;
            return anonymousClass1;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((d0) obj, (g) obj2);
            b0 b0Var = b0.f30125a;
            anonymousClass1.invokeSuspend(b0Var);
            return b0Var;
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            q.m(obj);
            d0 d0Var = (d0) this.f6580a;
            TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.f6581b;
            TextFieldSelectionState textFieldSelectionState = textFieldDecoratorModifierNode.f6548s;
            PointerInputScope pointerInputScope = this.f6582c;
            TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$requestFocus$1 textFieldDecoratorModifierNode$pointerInputNode$1$1$1$requestFocus$1 = new TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$requestFocus$1(textFieldSelectionState, textFieldDecoratorModifierNode);
            kotlin.jvm.internal.e.v(d0Var, null, 4, new TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1(textFieldSelectionState, pointerInputScope, null), 1);
            kotlin.jvm.internal.e.v(d0Var, null, 4, new TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2(textFieldDecoratorModifierNode, textFieldSelectionState, pointerInputScope, textFieldDecoratorModifierNode$pointerInputNode$1$1$1$requestFocus$1, null), 1);
            kotlin.jvm.internal.e.v(d0Var, null, 4, new TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3(textFieldSelectionState, pointerInputScope, textFieldDecoratorModifierNode$pointerInputNode$1$1$1$requestFocus$1, null), 1);
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$pointerInputNode$1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, g gVar) {
        super(2, gVar);
        this.f6579c = textFieldDecoratorModifierNode;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        TextFieldDecoratorModifierNode$pointerInputNode$1 textFieldDecoratorModifierNode$pointerInputNode$1 = new TextFieldDecoratorModifierNode$pointerInputNode$1(this.f6579c, gVar);
        textFieldDecoratorModifierNode$pointerInputNode$1.f6578b = obj;
        return textFieldDecoratorModifierNode$pointerInputNode$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((TextFieldDecoratorModifierNode$pointerInputNode$1) create((PointerInputScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f6577a;
        if (i2 == 0) {
            q.m(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f6579c, (PointerInputScope) this.f6578b, null);
            this.f6577a = 1;
            if (p0.a.J(anonymousClass1, this) == aVar) {
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
