package com.google.accompanist.systemuicontroller;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.ColorKt;
import d0.a;
import org.jetbrains.annotations.NotNull;
import q0.l;

@Stable
@a
/* loaded from: classes2.dex */
public interface SystemUiController {
    /* renamed from: setNavigationBarColor-Iv8Zu3U$default */
    static /* synthetic */ void m594setNavigationBarColorIv8Zu3U$default(SystemUiController systemUiController, long j2, boolean z2, boolean z3, l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setNavigationBarColor-Iv8Zu3U");
        }
        if ((i2 & 2) != 0) {
            z2 = ColorKt.i(j2) > 0.5f;
        }
        boolean z4 = z2;
        boolean z5 = (i2 & 4) != 0 ? true : z3;
        if ((i2 & 8) != 0) {
            lVar = SystemUiControllerKt.BlackScrimmed;
        }
        systemUiController.mo592setNavigationBarColorIv8Zu3U(j2, z4, z5, lVar);
    }

    /* renamed from: setStatusBarColor-ek8zF_U$default */
    static /* synthetic */ void m595setStatusBarColorek8zF_U$default(SystemUiController systemUiController, long j2, boolean z2, l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setStatusBarColor-ek8zF_U");
        }
        if ((i2 & 2) != 0) {
            z2 = ColorKt.i(j2) > 0.5f;
        }
        if ((i2 & 4) != 0) {
            lVar = SystemUiControllerKt.BlackScrimmed;
        }
        systemUiController.mo593setStatusBarColorek8zF_U(j2, z2, lVar);
    }

    /* renamed from: setSystemBarsColor-Iv8Zu3U$default */
    static /* synthetic */ void m596setSystemBarsColorIv8Zu3U$default(SystemUiController systemUiController, long j2, boolean z2, boolean z3, l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSystemBarsColor-Iv8Zu3U");
        }
        if ((i2 & 2) != 0) {
            z2 = ColorKt.i(j2) > 0.5f;
        }
        boolean z4 = z2;
        boolean z5 = (i2 & 4) != 0 ? true : z3;
        if ((i2 & 8) != 0) {
            lVar = SystemUiControllerKt.BlackScrimmed;
        }
        systemUiController.m597setSystemBarsColorIv8Zu3U(j2, z4, z5, lVar);
    }

    boolean getNavigationBarDarkContentEnabled();

    boolean getStatusBarDarkContentEnabled();

    int getSystemBarsBehavior();

    default boolean getSystemBarsDarkContentEnabled() {
        return getStatusBarDarkContentEnabled() && getNavigationBarDarkContentEnabled();
    }

    boolean isNavigationBarContrastEnforced();

    boolean isNavigationBarVisible();

    boolean isStatusBarVisible();

    default boolean isSystemBarsVisible() {
        return isNavigationBarVisible() && isStatusBarVisible();
    }

    /* renamed from: setNavigationBarColor-Iv8Zu3U */
    void mo592setNavigationBarColorIv8Zu3U(long j2, boolean z2, boolean z3, @NotNull l lVar);

    void setNavigationBarContrastEnforced(boolean z2);

    void setNavigationBarDarkContentEnabled(boolean z2);

    void setNavigationBarVisible(boolean z2);

    /* renamed from: setStatusBarColor-ek8zF_U */
    void mo593setStatusBarColorek8zF_U(long j2, boolean z2, @NotNull l lVar);

    void setStatusBarDarkContentEnabled(boolean z2);

    void setStatusBarVisible(boolean z2);

    void setSystemBarsBehavior(int i2);

    /* renamed from: setSystemBarsColor-Iv8Zu3U */
    default void m597setSystemBarsColorIv8Zu3U(long j2, boolean z2, boolean z3, @NotNull l lVar) {
        p0.a.s(lVar, "transformColorForLightContent");
        mo593setStatusBarColorek8zF_U(j2, z2, lVar);
        mo592setNavigationBarColorIv8Zu3U(j2, z2, z3, lVar);
    }

    default void setSystemBarsDarkContentEnabled(boolean z2) {
        setStatusBarDarkContentEnabled(z2);
        setNavigationBarDarkContentEnabled(z2);
    }

    default void setSystemBarsVisible(boolean z2) {
        setStatusBarVisible(z2);
        setNavigationBarVisible(z2);
    }
}
