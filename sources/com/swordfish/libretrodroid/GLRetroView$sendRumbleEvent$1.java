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

@e(c = "com.swordfish.libretrodroid.GLRetroView$sendRumbleEvent$1", f = "GLRetroView.kt", l = {453}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class GLRetroView$sendRumbleEvent$1 extends i implements p {
    final /* synthetic */ int $port;
    final /* synthetic */ float $strengthStrong;
    final /* synthetic */ float $strengthWeak;
    int label;
    final /* synthetic */ GLRetroView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GLRetroView$sendRumbleEvent$1(GLRetroView gLRetroView, int i2, float f2, float f3, g gVar) {
        super(2, gVar);
        this.this$0 = gLRetroView;
        this.$port = i2;
        this.$strengthWeak = f2;
        this.$strengthStrong = f3;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new GLRetroView$sendRumbleEvent$1(this.this$0, this.$port, this.$strengthWeak, this.$strengthStrong, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((GLRetroView$sendRumbleEvent$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        l0 l0Var;
        i0.a aVar = i0.a.f30806a;
        int i2 = this.label;
        if (i2 == 0) {
            q.m(obj);
            l0Var = this.this$0.rumbleEventsSubject;
            RumbleEvent rumbleEvent = new RumbleEvent(this.$port, this.$strengthWeak, this.$strengthStrong);
            this.label = 1;
            if (l0Var.emit(rumbleEvent, this) == aVar) {
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
