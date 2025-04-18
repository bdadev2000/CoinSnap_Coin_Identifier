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

@e(c = "com.swordfish.libretrodroid.GLRetroView$catchExceptions$1", f = "GLRetroView.kt", l = {346}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class GLRetroView$catchExceptions$1 extends i implements p {
    final /* synthetic */ RetroException $e;
    int label;
    final /* synthetic */ GLRetroView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GLRetroView$catchExceptions$1(GLRetroView gLRetroView, RetroException retroException, g gVar) {
        super(2, gVar);
        this.this$0 = gLRetroView;
        this.$e = retroException;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new GLRetroView$catchExceptions$1(this.this$0, this.$e, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((GLRetroView$catchExceptions$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
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
            Integer num = new Integer(this.$e.getErrorCode());
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
