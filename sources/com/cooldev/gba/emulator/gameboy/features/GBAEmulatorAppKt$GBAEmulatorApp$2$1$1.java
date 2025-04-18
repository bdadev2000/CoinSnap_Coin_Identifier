package com.cooldev.gba.emulator.gameboy.features;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import com.cooldev.gba.emulator.gameboy.router.RouterDelegateKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.p;

/* loaded from: classes.dex */
public final class GBAEmulatorAppKt$GBAEmulatorApp$2$1$1 extends r implements p {
    final /* synthetic */ MutableState<Boolean> $isInitialized$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GBAEmulatorAppKt$GBAEmulatorApp$2$1$1(MutableState<Boolean> mutableState) {
        super(2);
        this.$isInitialized$delegate = mutableState;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    @ComposableTarget
    @Composable
    public final void invoke(@Nullable Composer composer, int i2) {
        boolean GBAEmulatorApp$lambda$1;
        if ((i2 & 11) == 2 && composer.i()) {
            composer.A();
            return;
        }
        GBAEmulatorApp$lambda$1 = GBAEmulatorAppKt.GBAEmulatorApp$lambda$1(this.$isInitialized$delegate);
        if (GBAEmulatorApp$lambda$1) {
            RouterDelegateKt.RouterDelegate(composer, 0);
        }
    }
}
