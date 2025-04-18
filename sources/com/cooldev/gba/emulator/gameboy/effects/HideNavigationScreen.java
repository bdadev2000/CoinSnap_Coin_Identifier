package com.cooldev.gba.emulator.gameboy.effects;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import org.jetbrains.annotations.NotNull;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class HideNavigationScreen {
    public static final int $stable = 0;

    @NotNull
    public static final HideNavigationScreen INSTANCE = new HideNavigationScreen();

    private HideNavigationScreen() {
    }

    public final void hideNavigation(@NotNull Activity activity) {
        a.s(activity, "activity");
        View decorView = activity.getWindow().getDecorView();
        a.r(decorView, "getDecorView(...)");
        Window window = activity.getWindow();
        int i2 = Color.f14963j;
        window.setStatusBarColor(ColorKt.j(Color.f14961h));
        decorView.setSystemUiVisibility(5634);
    }
}
