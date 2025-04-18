package com.cooldev.gba.emulator.gameboy.features.app.components;

import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class ManageAppOpenAdLifecycleKt {
    @Composable
    public static final void ManageAppOpenAdLifecycle(@NotNull Context context, @Nullable Composer composer, int i2) {
        p0.a.s(context, "context");
        ComposerImpl g2 = composer.g(-181531491);
        EffectsKt.c(rememberLifecycleEvent(null, g2, 0, 1), new ManageAppOpenAdLifecycleKt$ManageAppOpenAdLifecycle$1(context), g2);
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ManageAppOpenAdLifecycleKt$ManageAppOpenAdLifecycle$2(context, i2);
        }
    }

    @Composable
    @NotNull
    public static final Lifecycle.Event rememberLifecycleEvent(@Nullable LifecycleOwner lifecycleOwner, @Nullable Composer composer, int i2, int i3) {
        composer.J(-2145973795);
        if ((i3 & 1) != 0) {
            lifecycleOwner = (LifecycleOwner) composer.K(LocalLifecycleOwnerKt.f20226a);
        }
        composer.J(-626854432);
        Object u2 = composer.u();
        if (u2 == Composer.Companion.f13690a) {
            u2 = SnapshotStateKt.f(Lifecycle.Event.ON_ANY, StructuralEqualityPolicy.f14078a);
            composer.o(u2);
        }
        MutableState mutableState = (MutableState) u2;
        composer.D();
        EffectsKt.c(lifecycleOwner, new ManageAppOpenAdLifecycleKt$rememberLifecycleEvent$1(lifecycleOwner, mutableState), composer);
        Lifecycle.Event rememberLifecycleEvent$lambda$1 = rememberLifecycleEvent$lambda$1(mutableState);
        composer.D();
        return rememberLifecycleEvent$lambda$1;
    }

    private static final Lifecycle.Event rememberLifecycleEvent$lambda$1(MutableState<Lifecycle.Event> mutableState) {
        return (Lifecycle.Event) mutableState.getValue();
    }
}
