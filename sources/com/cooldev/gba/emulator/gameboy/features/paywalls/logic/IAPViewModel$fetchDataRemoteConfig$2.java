package com.cooldev.gba.emulator.gameboy.features.paywalls.logic;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class IAPViewModel$fetchDataRemoteConfig$2 extends r implements l {
    final /* synthetic */ boolean $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IAPViewModel$fetchDataRemoteConfig$2(boolean z2) {
        super(1);
        this.$value = z2;
    }

    @Override // q0.l
    @NotNull
    public final IAPState invoke(@NotNull IAPState iAPState) {
        a.s(iAPState, "it");
        return IAPState.copy$default(iAPState, null, null, false, this.$value, null, 23, null);
    }
}
