package com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.p;

/* loaded from: classes.dex */
public final class BodyGamesKt$BodyGames$3 extends r implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ SoftwareKeyboardController $keyboardController;
    final /* synthetic */ Modifier $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BodyGamesKt$BodyGames$3(Modifier modifier, FocusManager focusManager, SoftwareKeyboardController softwareKeyboardController, int i2) {
        super(2);
        this.$modifier = modifier;
        this.$focusManager = focusManager;
        this.$keyboardController = softwareKeyboardController;
        this.$$changed = i2;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        BodyGamesKt.BodyGames(this.$modifier, this.$focusManager, this.$keyboardController, composer, RecomposeScopeImplKt.a(this.$$changed | 1));
    }
}
