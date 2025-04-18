package com.cooldev.gba.emulator.gameboy.extensions;

import androidx.compose.runtime.State;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.l;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.extensions.DebounceExtensionsKt$useDebounce$1$job$1", f = "DebounceExtensions.kt", l = {49}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DebounceExtensionsKt$useDebounce$1$job$1 extends i implements p {
    final /* synthetic */ long $delayMillis;
    final /* synthetic */ l $onChange;
    final /* synthetic */ State<T> $state$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DebounceExtensionsKt$useDebounce$1$job$1(long j2, l lVar, State<? extends T> state, g gVar) {
        super(2, gVar);
        this.$delayMillis = j2;
        this.$onChange = lVar;
        this.$state$delegate = state;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new DebounceExtensionsKt$useDebounce$1$job$1(this.$delayMillis, this.$onChange, this.$state$delegate, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((DebounceExtensionsKt$useDebounce$1$job$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object useDebounce$lambda$0;
        a aVar = a.f30806a;
        int i2 = this.label;
        if (i2 == 0) {
            q.m(obj);
            long j2 = this.$delayMillis;
            this.label = 1;
            if (p0.a.L(j2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        l lVar = this.$onChange;
        useDebounce$lambda$0 = DebounceExtensionsKt.useDebounce$lambda$0(this.$state$delegate);
        lVar.invoke(useDebounce$lambda$0);
        return b0.f30125a;
    }
}
