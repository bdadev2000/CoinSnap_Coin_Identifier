package com.cooldev.gba.emulator.gameboy.features.app.logic;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes2.dex */
public final class AppViewModel$fetchUpdateMode$2 extends r implements l {
    final /* synthetic */ boolean $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppViewModel$fetchUpdateMode$2(boolean z2) {
        super(1);
        this.$value = z2;
    }

    @Override // q0.l
    @NotNull
    public final AppState invoke(@NotNull AppState appState) {
        a.s(appState, "it");
        return AppState.copy$default(appState, false, this.$value ? 1 : 0, 0, 5, null);
    }
}
