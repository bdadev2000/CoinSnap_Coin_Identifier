package com.cooldev.gba.emulator.gameboy.extensions;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.State;
import b1.a2;
import b1.d0;
import b1.h1;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class DebounceExtensionsKt$useDebounce$1 extends r implements l {
    final /* synthetic */ d0 $coroutineScope;
    final /* synthetic */ long $delayMillis;
    final /* synthetic */ l $onChange;
    final /* synthetic */ State<T> $state$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DebounceExtensionsKt$useDebounce$1(d0 d0Var, long j2, l lVar, State<? extends T> state) {
        super(1);
        this.$coroutineScope = d0Var;
        this.$delayMillis = j2;
        this.$onChange = lVar;
        this.$state$delegate = state;
    }

    @Override // q0.l
    @NotNull
    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
        a.s(disposableEffectScope, "$this$DisposableEffect");
        final a2 v2 = e.v(this.$coroutineScope, null, 0, new DebounceExtensionsKt$useDebounce$1$job$1(this.$delayMillis, this.$onChange, this.$state$delegate, null), 3);
        return new DisposableEffectResult() { // from class: com.cooldev.gba.emulator.gameboy.extensions.DebounceExtensionsKt$useDebounce$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                h1.this.a(null);
            }
        };
    }
}
