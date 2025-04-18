package com.swordfish.libretrodroid;

import b1.d0;
import d0.b0;
import e1.l0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.p;

@e(c = "com.swordfish.libretrodroid.GLRetroView$catchExceptions$2", f = "GLRetroView.kt", l = {352}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class GLRetroView$catchExceptions$2 extends i implements p {
    int label;
    final /* synthetic */ GLRetroView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GLRetroView$catchExceptions$2(GLRetroView gLRetroView, g gVar) {
        super(2, gVar);
        this.this$0 = gLRetroView;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new GLRetroView$catchExceptions$2(this.this$0, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((GLRetroView$catchExceptions$2) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        l0 l0Var;
        i0.a aVar = i0.a.f30806a;
        int i2 = this.label;
        if (i2 == 0) {
            q.m(obj);
            l0Var = this.this$0.retroGLIssuesErrors;
            Integer num = new Integer(-1);
            this.label = 1;
            if (l0Var.emit(num, this) == aVar) {
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
