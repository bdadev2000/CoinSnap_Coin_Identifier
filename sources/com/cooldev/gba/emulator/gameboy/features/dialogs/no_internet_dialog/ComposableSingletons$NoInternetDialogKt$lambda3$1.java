package com.cooldev.gba.emulator.gameboy.features.dialogs.no_internet_dialog;

import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.p;

/* renamed from: com.cooldev.gba.emulator.gameboy.features.dialogs.no_internet_dialog.ComposableSingletons$NoInternetDialogKt$lambda-3$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$NoInternetDialogKt$lambda3$1 extends r implements p {
    public static final ComposableSingletons$NoInternetDialogKt$lambda3$1 INSTANCE = new ComposableSingletons$NoInternetDialogKt$lambda3$1();

    public ComposableSingletons$NoInternetDialogKt$lambda3$1() {
        super(2);
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    @ComposableTarget
    @Composable
    public final void invoke(@Nullable Composer composer, int i2) {
        if ((i2 & 11) == 2 && composer.i()) {
            composer.A();
        } else {
            TextKt.b("Please check your internet connection and try again.", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
        }
    }
}
