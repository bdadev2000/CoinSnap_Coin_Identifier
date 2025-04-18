package com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games;

import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.applovin.impl.adview.t;
import com.cooldev.gba.emulator.gameboy.constants.MyApps;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.features.dashboard.logic.UserGuideViewModel;
import com.cooldev.gba.emulator.gameboy.features.home.logic.HomeState;
import com.cooldev.gba.emulator.gameboy.features.home.logic.HomeViewModel;
import org.jetbrains.annotations.Nullable;
import org.koin.core.scope.Scope;

/* loaded from: classes.dex */
public final class ViewTypeIconButtonKt {
    @ComposableTarget
    @Composable
    public static final void ViewTypeIconButton(@Nullable Composer composer, int i2) {
        ComposerImpl g2 = composer.g(-295443353);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            Scope q2 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y2 = t.y(g2, false, 511388516, null) | g2.I(q2);
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (y2 || u2 == composer$Companion$Empty$1) {
                u2 = t.g(HomeViewModel.class, q2, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            HomeViewModel homeViewModel = (HomeViewModel) u2;
            Scope q3 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y3 = t.y(g2, false, 511388516, null) | g2.I(q3);
            Object u3 = g2.u();
            if (y3 || u3 == composer$Companion$Empty$1) {
                u3 = t.g(UserGuideViewModel.class, q3, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            HomeState homeState = (HomeState) SnapshotStateKt.b(homeViewModel.getState(), g2, 8).getValue();
            float f2 = 0;
            PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(f2, f2, f2, f2);
            float f3 = 40;
            Modifier e = SizeKt.e(SizeKt.r(Modifier.Companion.f14687a, f3), f3);
            RoundedCornerShape border360 = MyApps.INSTANCE.getBorder360();
            PaddingValuesImpl paddingValuesImpl2 = ButtonDefaults.f8037a;
            ButtonKt.a(new ViewTypeIconButtonKt$ViewTypeIconButton$1((UserGuideViewModel) u3, homeViewModel), e, false, border360, ButtonDefaults.a(MyColors.INSTANCE.m35getText50d7_KjU(), g2), null, null, paddingValuesImpl, null, ComposableLambdaKt.c(932131927, new ViewTypeIconButtonKt$ViewTypeIconButton$2(homeState), g2), g2, 817892400, 356);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ViewTypeIconButtonKt$ViewTypeIconButton$3(i2);
        }
    }
}
