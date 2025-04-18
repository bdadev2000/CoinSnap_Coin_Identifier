package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.PlatformTextInputModifierNodeKt;
import androidx.compose.ui.platform.PlatformTextInputSessionScope;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import b1.d0;
import d0.b0;
import e1.l0;
import h0.g;
import j0.i;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import q0.l;
import q0.p;

@j0.e(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1", f = "TextFieldDecoratorModifier.kt", l = {707}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TextFieldDecoratorModifierNode$startInputSession$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f6597a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6598b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ReceiveContentConfiguration f6599c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @j0.e(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1", f = "TextFieldDecoratorModifier.kt", l = {708}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f6600a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f6601b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextFieldDecoratorModifierNode f6602c;
        public final /* synthetic */ ReceiveContentConfiguration d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public final /* synthetic */ class C00281 extends o implements l {
            @Override // q0.l
            public final Object invoke(Object obj) {
                TextFieldDecoratorModifierNode.i2((TextFieldDecoratorModifierNode) this.receiver, ((ImeAction) obj).f17330a);
                return b0.f30125a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, ReceiveContentConfiguration receiveContentConfiguration, g gVar) {
            super(2, gVar);
            this.f6602c = textFieldDecoratorModifierNode;
            this.d = receiveContentConfiguration;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f6602c, this.d, gVar);
            anonymousClass1.f6601b = obj;
            return anonymousClass1;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass1) create((PlatformTextInputSessionScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
            return i0.a.f30806a;
        }

        /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.internal.n, q0.l] */
        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f6600a;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.m(obj);
                throw new RuntimeException();
            }
            q.m(obj);
            PlatformTextInputSessionScope platformTextInputSessionScope = (PlatformTextInputSessionScope) this.f6601b;
            TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.f6602c;
            TransformedTextFieldState transformedTextFieldState = textFieldDecoratorModifierNode.f6546q;
            TextLayoutState textLayoutState = textFieldDecoratorModifierNode.f6547r;
            ImeOptions d = textFieldDecoratorModifierNode.D.d(textFieldDecoratorModifierNode.x);
            ReceiveContentConfiguration receiveContentConfiguration = this.d;
            TextFieldDecoratorModifierNode textFieldDecoratorModifierNode2 = this.f6602c;
            ?? nVar = new n(1, textFieldDecoratorModifierNode2, TextFieldDecoratorModifierNode.class, "onImeActionPerformed", "onImeActionPerformed-KlQnJC8(I)V", 0);
            l0 l2 = textFieldDecoratorModifierNode2.l2();
            ViewConfiguration viewConfiguration = (ViewConfiguration) CompositionLocalConsumerModifierNodeKt.a(textFieldDecoratorModifierNode, CompositionLocalsKt.f16445q);
            this.f6600a = 1;
            AndroidTextInputSession_androidKt.b(platformTextInputSessionScope, transformedTextFieldState, textLayoutState, d, receiveContentConfiguration, nVar, l2, viewConfiguration, this);
            return aVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$startInputSession$1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, ReceiveContentConfiguration receiveContentConfiguration, g gVar) {
        super(2, gVar);
        this.f6598b = textFieldDecoratorModifierNode;
        this.f6599c = receiveContentConfiguration;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new TextFieldDecoratorModifierNode$startInputSession$1(this.f6598b, this.f6599c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((TextFieldDecoratorModifierNode$startInputSession$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        return i0.a.f30806a;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f6597a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
            throw new RuntimeException();
        }
        q.m(obj);
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.f6598b;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(textFieldDecoratorModifierNode, this.f6599c, null);
        this.f6597a = 1;
        PlatformTextInputModifierNodeKt.a(textFieldDecoratorModifierNode, anonymousClass1, this);
        return aVar;
    }
}
