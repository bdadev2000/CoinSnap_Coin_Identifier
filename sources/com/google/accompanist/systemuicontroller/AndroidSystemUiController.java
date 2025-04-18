package com.google.accompanist.systemuicontroller;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.l;

@StabilityInferred
/* loaded from: classes3.dex */
public final class AndroidSystemUiController implements SystemUiController {
    public static final int $stable = 0;

    @NotNull
    private final View view;

    @Nullable
    private final Window window;

    @Nullable
    private final WindowInsetsControllerCompat windowInsetsController;

    public AndroidSystemUiController(@NotNull View view, @Nullable Window window) {
        a.s(view, ViewHierarchyConstants.VIEW_KEY);
        this.view = view;
        this.window = window;
        this.windowInsetsController = window != null ? new WindowInsetsControllerCompat(view, window) : null;
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public boolean getNavigationBarDarkContentEnabled() {
        WindowInsetsControllerCompat windowInsetsControllerCompat = this.windowInsetsController;
        return windowInsetsControllerCompat != null && windowInsetsControllerCompat.c();
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public boolean getStatusBarDarkContentEnabled() {
        WindowInsetsControllerCompat windowInsetsControllerCompat = this.windowInsetsController;
        return windowInsetsControllerCompat != null && windowInsetsControllerCompat.d();
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public int getSystemBarsBehavior() {
        WindowInsetsControllerCompat windowInsetsControllerCompat = this.windowInsetsController;
        if (windowInsetsControllerCompat != null) {
            return windowInsetsControllerCompat.a();
        }
        return 0;
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public boolean isNavigationBarContrastEnforced() {
        Window window;
        boolean isNavigationBarContrastEnforced;
        if (Build.VERSION.SDK_INT >= 29 && (window = this.window) != null) {
            isNavigationBarContrastEnforced = window.isNavigationBarContrastEnforced();
            if (isNavigationBarContrastEnforced) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public boolean isNavigationBarVisible() {
        WindowInsetsCompat n2 = ViewCompat.n(this.view);
        return n2 != null && n2.p(2);
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public boolean isStatusBarVisible() {
        WindowInsetsCompat n2 = ViewCompat.n(this.view);
        return n2 != null && n2.p(1);
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    /* renamed from: setNavigationBarColor-Iv8Zu3U, reason: not valid java name */
    public void mo592setNavigationBarColorIv8Zu3U(long j2, boolean z2, boolean z3, @NotNull l lVar) {
        WindowInsetsControllerCompat windowInsetsControllerCompat;
        a.s(lVar, "transformColorForLightContent");
        setNavigationBarDarkContentEnabled(z2);
        setNavigationBarContrastEnforced(z3);
        Window window = this.window;
        if (window == null) {
            return;
        }
        if (z2 && ((windowInsetsControllerCompat = this.windowInsetsController) == null || !windowInsetsControllerCompat.c())) {
            j2 = ((Color) lVar.invoke(new Color(j2))).f14964a;
        }
        window.setNavigationBarColor(ColorKt.j(j2));
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public void setNavigationBarContrastEnforced(boolean z2) {
        Window window;
        if (Build.VERSION.SDK_INT < 29 || (window = this.window) == null) {
            return;
        }
        window.setNavigationBarContrastEnforced(z2);
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public void setNavigationBarDarkContentEnabled(boolean z2) {
        WindowInsetsControllerCompat windowInsetsControllerCompat = this.windowInsetsController;
        if (windowInsetsControllerCompat == null) {
            return;
        }
        windowInsetsControllerCompat.e(z2);
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public void setNavigationBarVisible(boolean z2) {
        if (z2) {
            WindowInsetsControllerCompat windowInsetsControllerCompat = this.windowInsetsController;
            if (windowInsetsControllerCompat != null) {
                windowInsetsControllerCompat.h(2);
                return;
            }
            return;
        }
        WindowInsetsControllerCompat windowInsetsControllerCompat2 = this.windowInsetsController;
        if (windowInsetsControllerCompat2 != null) {
            windowInsetsControllerCompat2.b(2);
        }
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    /* renamed from: setStatusBarColor-ek8zF_U, reason: not valid java name */
    public void mo593setStatusBarColorek8zF_U(long j2, boolean z2, @NotNull l lVar) {
        WindowInsetsControllerCompat windowInsetsControllerCompat;
        a.s(lVar, "transformColorForLightContent");
        setStatusBarDarkContentEnabled(z2);
        Window window = this.window;
        if (window == null) {
            return;
        }
        if (z2 && ((windowInsetsControllerCompat = this.windowInsetsController) == null || !windowInsetsControllerCompat.d())) {
            j2 = ((Color) lVar.invoke(new Color(j2))).f14964a;
        }
        window.setStatusBarColor(ColorKt.j(j2));
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public void setStatusBarDarkContentEnabled(boolean z2) {
        WindowInsetsControllerCompat windowInsetsControllerCompat = this.windowInsetsController;
        if (windowInsetsControllerCompat == null) {
            return;
        }
        windowInsetsControllerCompat.f(z2);
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public void setStatusBarVisible(boolean z2) {
        if (z2) {
            WindowInsetsControllerCompat windowInsetsControllerCompat = this.windowInsetsController;
            if (windowInsetsControllerCompat != null) {
                windowInsetsControllerCompat.h(1);
                return;
            }
            return;
        }
        WindowInsetsControllerCompat windowInsetsControllerCompat2 = this.windowInsetsController;
        if (windowInsetsControllerCompat2 != null) {
            windowInsetsControllerCompat2.b(1);
        }
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public void setSystemBarsBehavior(int i2) {
        WindowInsetsControllerCompat windowInsetsControllerCompat = this.windowInsetsController;
        if (windowInsetsControllerCompat == null) {
            return;
        }
        windowInsetsControllerCompat.g(i2);
    }
}
