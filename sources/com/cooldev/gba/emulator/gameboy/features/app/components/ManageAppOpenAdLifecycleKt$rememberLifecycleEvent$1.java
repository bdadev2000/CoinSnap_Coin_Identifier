package com.cooldev.gba.emulator.gameboy.features.app.components;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.safedk.android.analytics.events.MaxEvent;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.l;

/* loaded from: classes.dex */
public final class ManageAppOpenAdLifecycleKt$rememberLifecycleEvent$1 extends r implements l {
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    final /* synthetic */ MutableState<Lifecycle.Event> $state$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManageAppOpenAdLifecycleKt$rememberLifecycleEvent$1(LifecycleOwner lifecycleOwner, MutableState<Lifecycle.Event> mutableState) {
        super(1);
        this.$lifecycleOwner = lifecycleOwner;
        this.$state$delegate = mutableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(MutableState mutableState, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        p0.a.s(mutableState, "$state$delegate");
        p0.a.s(lifecycleOwner, "<anonymous parameter 0>");
        p0.a.s(event, MaxEvent.f29810a);
        mutableState.setValue(event);
    }

    @Override // q0.l
    @NotNull
    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
        p0.a.s(disposableEffectScope, "$this$DisposableEffect");
        final MutableState<Lifecycle.Event> mutableState = this.$state$delegate;
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.cooldev.gba.emulator.gameboy.features.app.components.a
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void c(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                ManageAppOpenAdLifecycleKt$rememberLifecycleEvent$1.invoke$lambda$0(MutableState.this, lifecycleOwner, event);
            }
        };
        this.$lifecycleOwner.getLifecycle().a(lifecycleEventObserver);
        final LifecycleOwner lifecycleOwner = this.$lifecycleOwner;
        return new DisposableEffectResult() { // from class: com.cooldev.gba.emulator.gameboy.features.app.components.ManageAppOpenAdLifecycleKt$rememberLifecycleEvent$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                LifecycleOwner.this.getLifecycle().d(lifecycleEventObserver);
            }
        };
    }
}
