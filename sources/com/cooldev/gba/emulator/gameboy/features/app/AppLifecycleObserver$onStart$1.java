package com.cooldev.gba.emulator.gameboy.features.app;

import android.util.Log;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.app.AppLifecycleObserver$onStart$1", f = "AppLifecycleObserver.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AppLifecycleObserver$onStart$1 extends i implements p {
    int label;
    final /* synthetic */ AppLifecycleObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLifecycleObserver$onStart$1(AppLifecycleObserver appLifecycleObserver, g gVar) {
        super(2, gVar);
        this.this$0 = appLifecycleObserver;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new AppLifecycleObserver$onStart$1(this.this$0, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((AppLifecycleObserver$onStart$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        int i2;
        int i3;
        a aVar;
        a aVar2;
        String str;
        i0.a aVar3 = i0.a.f30806a;
        int i4 = this.label;
        if (i4 == 0) {
            q.m(obj);
            i2 = this.this$0.numStarted;
            if (i2 == 0) {
                this.label = 1;
                if (p0.a.L(500L, this) == aVar3) {
                    return aVar3;
                }
            }
            AppLifecycleObserver appLifecycleObserver = this.this$0;
            i3 = appLifecycleObserver.numStarted;
            appLifecycleObserver.numStarted = i3 + 1;
            return b0.f30125a;
        }
        if (i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q.m(obj);
        aVar = this.this$0.onResume;
        aVar.invoke();
        aVar2 = this.this$0.block;
        aVar2.invoke();
        str = AppLifecycleObserver.LOG_TAG;
        Log.d(str, "App went to foreground");
        AppLifecycleObserver appLifecycleObserver2 = this.this$0;
        i3 = appLifecycleObserver2.numStarted;
        appLifecycleObserver2.numStarted = i3 + 1;
        return b0.f30125a;
    }
}
