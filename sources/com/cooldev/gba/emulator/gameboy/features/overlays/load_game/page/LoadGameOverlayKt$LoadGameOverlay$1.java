package com.cooldev.gba.emulator.gameboy.features.overlays.load_game.page;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import com.cooldev.gba.emulator.gameboy.features.overlays.load_game.logic.LoadGameViewModel;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class LoadGameOverlayKt$LoadGameOverlay$1 extends r implements l {
    final /* synthetic */ LoadGameViewModel $loadGameViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadGameOverlayKt$LoadGameOverlay$1(LoadGameViewModel loadGameViewModel) {
        super(1);
        this.$loadGameViewModel = loadGameViewModel;
    }

    @Override // q0.l
    @NotNull
    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
        a.s(disposableEffectScope, "$this$DisposableEffect");
        final LoadGameViewModel loadGameViewModel = this.$loadGameViewModel;
        return new DisposableEffectResult() { // from class: com.cooldev.gba.emulator.gameboy.features.overlays.load_game.page.LoadGameOverlayKt$LoadGameOverlay$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                LoadGameViewModel.this.hideLoadGameView();
            }
        };
    }
}
