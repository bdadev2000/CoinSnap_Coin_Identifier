package com.cooldev.gba.emulator.gameboy.router;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostControllerKt;
import androidx.navigation.compose.NavHostKt;
import com.google.android.gms.location.GeofenceStatusCodes;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class RouterDelegateKt {
    @ComposableTarget
    @Composable
    public static final void RouterDelegate(@Nullable Composer composer, int i2) {
        ComposerImpl g2 = composer.g(8426391);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            NavHostController b2 = NavHostControllerKt.b(new Navigator[0], g2);
            MultiNavigationAppStateKt.getLocalNavigationState().getRootNavigation().setNavController(b2);
            NavHostKt.b(b2, RouterName.LOADING_ADS, null, null, RouterName.ROOT, null, null, null, null, null, RouterDelegateKt$RouterDelegate$1.INSTANCE, g2, 24632, 6, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new RouterDelegateKt$RouterDelegate$2(i2);
        }
    }
}
