package com.cooldev.gba.emulator.gameboy.effects;

import android.app.Activity;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* loaded from: classes2.dex */
public final class HideNavigationEffectKt {
    @Composable
    public static final void HideNavigationEffect(@Nullable Composer composer, int i2) {
        ComposerImpl g2 = composer.g(-1298062900);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            MutableState b2 = SnapshotStateKt.b(((LifecycleOwner) g2.K(LocalLifecycleOwnerKt.f20226a)).getLifecycle().c(), g2, 0);
            Object K = g2.K(AndroidCompositionLocals_androidKt.f16325b);
            a.q(K, "null cannot be cast to non-null type android.app.Activity");
            EffectsKt.f(HideNavigationEffect$lambda$0(b2), new HideNavigationEffectKt$HideNavigationEffect$1((Activity) K, b2, null), g2);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new HideNavigationEffectKt$HideNavigationEffect$2(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Lifecycle.State HideNavigationEffect$lambda$0(State<? extends Lifecycle.State> state) {
        return (Lifecycle.State) state.getValue();
    }
}
