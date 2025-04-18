package com.cooldev.gba.emulator.gameboy.features.overlays.save_game.page;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import com.cooldev.gba.emulator.gameboy.features.overlays.save_game.logic.SaveGameViewModel;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes2.dex */
public final class SaveGameOverlayKt$SaveGameOverlay$1 extends r implements l {
    final /* synthetic */ SaveGameViewModel $saveGameViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveGameOverlayKt$SaveGameOverlay$1(SaveGameViewModel saveGameViewModel) {
        super(1);
        this.$saveGameViewModel = saveGameViewModel;
    }

    @Override // q0.l
    @NotNull
    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
        a.s(disposableEffectScope, "$this$DisposableEffect");
        final SaveGameViewModel saveGameViewModel = this.$saveGameViewModel;
        return new DisposableEffectResult() { // from class: com.cooldev.gba.emulator.gameboy.features.overlays.save_game.page.SaveGameOverlayKt$SaveGameOverlay$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                SaveGameViewModel.this.hideSaveGameView();
            }
        };
    }
}
