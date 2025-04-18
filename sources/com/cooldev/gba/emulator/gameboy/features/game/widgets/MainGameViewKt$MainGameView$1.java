package com.cooldev.gba.emulator.gameboy.features.game.widgets;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.lifecycle.LifecycleOwner;
import com.swordfish.libretrodroid.GLRetroView;
import com.swordfish.libretrodroid.LibretroDroid;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes2.dex */
public final class MainGameViewKt$MainGameView$1 extends r implements l {
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    final /* synthetic */ GLRetroView $retroView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainGameViewKt$MainGameView$1(LifecycleOwner lifecycleOwner, GLRetroView gLRetroView) {
        super(1);
        this.$lifecycleOwner = lifecycleOwner;
        this.$retroView = gLRetroView;
    }

    @Override // q0.l
    @NotNull
    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
        a.s(disposableEffectScope, "$this$DisposableEffect");
        this.$lifecycleOwner.getLifecycle().a(this.$retroView);
        final LifecycleOwner lifecycleOwner = this.$lifecycleOwner;
        final GLRetroView gLRetroView = this.$retroView;
        return new DisposableEffectResult() { // from class: com.cooldev.gba.emulator.gameboy.features.game.widgets.MainGameViewKt$MainGameView$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                LifecycleOwner.this.getLifecycle().d(gLRetroView);
                LibretroDroid.destroy();
            }
        };
    }
}
