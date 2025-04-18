package com.google.accompanist.systemuicontroller;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.window.DialogWindowProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.l;

/* loaded from: classes3.dex */
public final class SystemUiControllerKt {
    private static final long BlackScrim = ColorKt.a(0.0f, 0.0f, 0.0f, 0.3f, ColorSpaces.f15075c);

    @NotNull
    private static final l BlackScrimmed = SystemUiControllerKt$BlackScrimmed$1.INSTANCE;

    @Composable
    private static final Window findWindow(Composer composer, int i2) {
        composer.t(1009281237);
        StaticProvidableCompositionLocal staticProvidableCompositionLocal = AndroidCompositionLocals_androidKt.f16327f;
        ViewParent parent = ((View) composer.K(staticProvidableCompositionLocal)).getParent();
        DialogWindowProvider dialogWindowProvider = parent instanceof DialogWindowProvider ? (DialogWindowProvider) parent : null;
        Window window = dialogWindowProvider != null ? dialogWindowProvider.getWindow() : null;
        if (window == null) {
            Context context = ((View) composer.K(staticProvidableCompositionLocal)).getContext();
            a.r(context, "getContext(...)");
            window = findWindow(context);
        }
        composer.H();
        return window;
    }

    @Composable
    @d0.a
    @NotNull
    public static final SystemUiController rememberSystemUiController(@Nullable Window window, @Nullable Composer composer, int i2, int i3) {
        composer.t(-715745933);
        if ((i3 & 1) != 0) {
            window = findWindow(composer, 0);
        }
        View view = (View) composer.K(AndroidCompositionLocals_androidKt.f16327f);
        composer.t(-1044852491);
        boolean I = composer.I(view) | composer.I(window);
        Object u2 = composer.u();
        if (I || u2 == Composer.Companion.f13690a) {
            u2 = new AndroidSystemUiController(view, window);
            composer.o(u2);
        }
        AndroidSystemUiController androidSystemUiController = (AndroidSystemUiController) u2;
        composer.H();
        composer.H();
        return androidSystemUiController;
    }

    private static final Window findWindow(Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
            a.r(context, "getBaseContext(...)");
        }
        return ((Activity) context).getWindow();
    }
}
