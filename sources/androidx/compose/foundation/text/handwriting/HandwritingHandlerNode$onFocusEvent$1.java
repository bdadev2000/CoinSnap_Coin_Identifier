package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.foundation.text.handwriting.HandwritingHandlerNode$onFocusEvent$1", f = "HandwritingHandler.android.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class HandwritingHandlerNode$onFocusEvent$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HandwritingHandlerNode f6273a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandwritingHandlerNode$onFocusEvent$1(HandwritingHandlerNode handwritingHandlerNode, g gVar) {
        super(2, gVar);
        this.f6273a = handwritingHandlerNode;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new HandwritingHandlerNode$onFocusEvent$1(this.f6273a, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        HandwritingHandlerNode$onFocusEvent$1 handwritingHandlerNode$onFocusEvent$1 = (HandwritingHandlerNode$onFocusEvent$1) create((d0) obj, (g) obj2);
        b0 b0Var = b0.f30125a;
        handwritingHandlerNode$onFocusEvent$1.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        q.m(obj);
        ((ComposeInputMethodManager) this.f6273a.f6271p.getValue()).g();
        return b0.f30125a;
    }
}
