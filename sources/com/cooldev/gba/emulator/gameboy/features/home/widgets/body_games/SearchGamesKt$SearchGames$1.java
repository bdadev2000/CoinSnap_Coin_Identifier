package com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games;

import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes2.dex */
public final class SearchGamesKt$SearchGames$1 extends r implements a {
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ SoftwareKeyboardController $keyboardController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchGamesKt$SearchGames$1(FocusManager focusManager, SoftwareKeyboardController softwareKeyboardController) {
        super(0);
        this.$focusManager = focusManager;
        this.$keyboardController = softwareKeyboardController;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m241invoke() {
        this.$focusManager.q(false);
        SoftwareKeyboardController softwareKeyboardController = this.$keyboardController;
        if (softwareKeyboardController != null) {
            softwareKeyboardController.hide();
        }
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m241invoke();
        return b0.f30125a;
    }
}
