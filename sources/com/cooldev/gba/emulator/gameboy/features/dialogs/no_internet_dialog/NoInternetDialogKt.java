package com.cooldev.gba.emulator.gameboy.features.dialogs.no_internet_dialog;

import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import org.jetbrains.annotations.Nullable;
import q0.a;

/* loaded from: classes.dex */
public final class NoInternetDialogKt {
    @ComposableTarget
    @Composable
    public static final void NoInternetDialog(@Nullable Composer composer, int i2) {
        ComposerImpl g2 = composer.g(558519986);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            g2.J(-1525617005);
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (u2 == composer$Companion$Empty$1) {
                u2 = SnapshotStateKt.f(Boolean.TRUE, StructuralEqualityPolicy.f14078a);
                g2.o(u2);
            }
            MutableState mutableState = (MutableState) u2;
            g2.V(false);
            if (NoInternetDialog$lambda$1(mutableState)) {
                g2.J(-1525613528);
                Object u3 = g2.u();
                if (u3 == composer$Companion$Empty$1) {
                    u3 = new NoInternetDialogKt$NoInternetDialog$1$1(mutableState);
                    g2.o(u3);
                }
                g2.V(false);
                ComposableLambdaImpl c2 = ComposableLambdaKt.c(-1800339393, new NoInternetDialogKt$NoInternetDialog$2(mutableState), g2);
                ComposableSingletons$NoInternetDialogKt composableSingletons$NoInternetDialogKt = ComposableSingletons$NoInternetDialogKt.INSTANCE;
                AndroidAlertDialog_androidKt.a((a) u3, c2, null, null, null, composableSingletons$NoInternetDialogKt.m169getLambda2$gba_v1_0_35_54__09Apr2025_1046_release(), composableSingletons$NoInternetDialogKt.m170getLambda3$gba_v1_0_35_54__09Apr2025_1046_release(), null, 0L, 0L, 0L, 0L, 0.0f, null, g2, 1772598, 0, 16276);
            }
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new NoInternetDialogKt$NoInternetDialog$3(i2);
        }
    }

    private static final boolean NoInternetDialog$lambda$1(MutableState<Boolean> mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NoInternetDialog$lambda$2(MutableState<Boolean> mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }
}
