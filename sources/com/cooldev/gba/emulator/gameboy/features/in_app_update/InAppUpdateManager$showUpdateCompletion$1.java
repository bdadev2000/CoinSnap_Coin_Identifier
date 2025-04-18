package com.cooldev.gba.emulator.gameboy.features.in_app_update;

import a1.c;
import android.util.Log;
import b1.d0;
import com.google.android.play.core.appupdate.AppUpdateManager;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.in_app_update.InAppUpdateManager$showUpdateCompletion$1", f = "InAppUpdateManager.kt", l = {Opcodes.I2C}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class InAppUpdateManager$showUpdateCompletion$1 extends i implements p {
    int label;
    final /* synthetic */ InAppUpdateManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppUpdateManager$showUpdateCompletion$1(InAppUpdateManager inAppUpdateManager, g gVar) {
        super(2, gVar);
        this.this$0 = inAppUpdateManager;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new InAppUpdateManager$showUpdateCompletion$1(this.this$0, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((InAppUpdateManager$showUpdateCompletion$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        String str;
        AppUpdateManager appUpdateManager;
        i0.a aVar = i0.a.f30806a;
        int i2 = this.label;
        b0 b0Var = b0.f30125a;
        if (i2 == 0) {
            q.m(obj);
            str = InAppUpdateManager.TAG;
            Log.d(str, "Waiting for 5 seconds before completing the update.");
            int i3 = a1.a.d;
            long E = kotlin.jvm.internal.e.E(5, c.d);
            this.label = 1;
            long j2 = 0;
            if (a1.a.c(E, 0L) > 0) {
                j2 = p0.a.w(((((int) E) & 1) == 1 && (a1.a.f(E) ^ true)) ? E >> 1 : a1.a.h(E, c.f63c), 1L);
            }
            Object L = p0.a.L(j2, this);
            if (L != aVar) {
                L = b0Var;
            }
            if (L == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        appUpdateManager = this.this$0.appUpdateManager;
        appUpdateManager.completeUpdate();
        return b0Var;
    }
}
