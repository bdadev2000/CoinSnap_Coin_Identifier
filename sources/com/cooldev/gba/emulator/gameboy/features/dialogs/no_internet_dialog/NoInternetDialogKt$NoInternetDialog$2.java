package com.cooldev.gba.emulator.gameboy.features.dialogs.no_internet_dialog;

import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.p;

/* loaded from: classes.dex */
public final class NoInternetDialogKt$NoInternetDialog$2 extends r implements p {
    final /* synthetic */ MutableState<Boolean> $openDialog$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoInternetDialogKt$NoInternetDialog$2(MutableState<Boolean> mutableState) {
        super(2);
        this.$openDialog$delegate = mutableState;
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
            return;
        }
        composer.J(865026183);
        MutableState<Boolean> mutableState = this.$openDialog$delegate;
        Object u2 = composer.u();
        if (u2 == Composer.Companion.f13690a) {
            u2 = new NoInternetDialogKt$NoInternetDialog$2$1$1(mutableState);
            composer.o(u2);
        }
        composer.D();
        ButtonKt.a((a) u2, null, false, null, null, null, null, null, null, ComposableSingletons$NoInternetDialogKt.INSTANCE.m168getLambda1$gba_v1_0_35_54__09Apr2025_1046_release(), composer, 805306374, 510);
    }
}
