package androidx.compose.foundation;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import b1.d0;
import b1.q0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.FocusableInteractionNode$emitWithFallback$1", f = "Focusable.kt", l = {309}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class FocusableInteractionNode$emitWithFallback$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f2704a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f2705b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Interaction f2706c;
    public final /* synthetic */ q0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusableInteractionNode$emitWithFallback$1(MutableInteractionSource mutableInteractionSource, Interaction interaction, q0 q0Var, g gVar) {
        super(2, gVar);
        this.f2705b = mutableInteractionSource;
        this.f2706c = interaction;
        this.d = q0Var;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new FocusableInteractionNode$emitWithFallback$1(this.f2705b, this.f2706c, this.d, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((FocusableInteractionNode$emitWithFallback$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f2704a;
        if (i2 == 0) {
            q.m(obj);
            this.f2704a = 1;
            if (this.f2705b.a(this.f2706c, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        q0 q0Var = this.d;
        if (q0Var != null) {
            q0Var.dispose();
        }
        return b0.f30125a;
    }
}
