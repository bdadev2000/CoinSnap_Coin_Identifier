package com.cooldev.gba.emulator.gameboy.features.dialogs.no_internet_dialog;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.q;

/* renamed from: com.cooldev.gba.emulator.gameboy.features.dialogs.no_internet_dialog.ComposableSingletons$NoInternetDialogKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$NoInternetDialogKt$lambda1$1 extends r implements q {
    public static final ComposableSingletons$NoInternetDialogKt$lambda1$1 INSTANCE = new ComposableSingletons$NoInternetDialogKt$lambda1$1();

    public ComposableSingletons$NoInternetDialogKt$lambda1$1() {
        super(3);
    }

    @Override // q0.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return b0.f30125a;
    }

    @ComposableTarget
    @Composable
    public final void invoke(@NotNull RowScope rowScope, @Nullable Composer composer, int i2) {
        a.s(rowScope, "$this$Button");
        if ((i2 & 81) == 16 && composer.i()) {
            composer.A();
        } else {
            TextKt.b("OK", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
        }
    }
}
