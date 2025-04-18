package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.input.pointer.PointerInputScope;
import b1.d0;
import d0.b0;
import h0.g;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@j0.e(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2", f = "TextFieldDecoratorModifier.kt", l = {211}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f6586a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6587b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6588c;
    public final /* synthetic */ PointerInputScope d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q0.a f6589f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1 extends r implements q0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextFieldDecoratorModifierNode f6590a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
            super(0);
            this.f6590a = textFieldDecoratorModifierNode;
        }

        @Override // q0.a
        public final Object invoke() {
            TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.f6590a;
            if (textFieldDecoratorModifierNode.J != null) {
                textFieldDecoratorModifierNode.o2().show();
            } else {
                textFieldDecoratorModifierNode.p2(true);
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, q0.a aVar, g gVar) {
        super(2, gVar);
        this.f6587b = textFieldDecoratorModifierNode;
        this.f6588c = textFieldSelectionState;
        this.d = pointerInputScope;
        this.f6589f = aVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2(this.f6587b, this.f6588c, this.d, this.f6589f, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f6586a;
        if (i2 == 0) {
            q.m(obj);
            TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.f6587b;
            MutableInteractionSource mutableInteractionSource = textFieldDecoratorModifierNode.f6552y;
            TextFieldSelectionState textFieldSelectionState = this.f6588c;
            PointerInputScope pointerInputScope = this.d;
            q0.a aVar2 = this.f6589f;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(textFieldDecoratorModifierNode);
            this.f6586a = 1;
            if (textFieldSelectionState.k(pointerInputScope, mutableInteractionSource, aVar2, anonymousClass1, this) == aVar) {
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
