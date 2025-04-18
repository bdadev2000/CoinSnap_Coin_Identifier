package com.cooldev.gba.emulator.gameboy.features;

import androidx.compose.runtime.MutableState;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
public final class GBAEmulatorAppKt$GBAEmulatorApp$1$1 extends r implements l {
    final /* synthetic */ MutableState<Boolean> $isInitialized$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GBAEmulatorAppKt$GBAEmulatorApp$1$1(MutableState<Boolean> mutableState) {
        super(1);
        this.$isInitialized$delegate = mutableState;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return b0.f30125a;
    }

    public final void invoke(boolean z2) {
        GBAEmulatorAppKt.GBAEmulatorApp$lambda$2(this.$isInitialized$delegate, z2);
    }
}
