package org.koin.androidx.compose;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.Koin;
import org.koin.core.annotation.KoinExperimentalAPI;
import org.koin.core.component.KoinComponent;
import p0.a;
import q0.p;

/* loaded from: classes.dex */
public final class KoinAndroidContextKt {
    @KoinExperimentalAPI
    @Composable
    @ComposableInferredTarget
    public static final void KoinAndroidContext(@NotNull p pVar, @Nullable Composer composer, int i2) {
        int i3;
        a.s(pVar, "content");
        ComposerImpl g2 = composer.g(-1006789746);
        if ((i2 & 14) == 0) {
            i3 = (g2.w(pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && g2.i()) {
            g2.A();
        } else {
            Context context = (Context) g2.K(AndroidCompositionLocals_androidKt.f16325b);
            g2.t(-1516607014);
            boolean I = g2.I(context);
            Object u2 = g2.u();
            if (I || u2 == Composer.Companion.f13690a) {
                u2 = ComponentCallbackExtKt.getKoin(findContextForKoin(context));
                g2.o(u2);
            }
            g2.V(false);
            KoinApplicationKt.KoinContext((Koin) u2, pVar, g2, ((i3 << 3) & 112) | 8, 0);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new KoinAndroidContextKt$KoinAndroidContext$1(pVar, i2);
        }
    }

    private static final ComponentCallbacks findContextForKoin(Context context) {
        Object obj = context;
        while (obj instanceof ContextWrapper) {
            if ((obj instanceof KoinComponent) && (obj instanceof ComponentCallbacks)) {
                return (ComponentCallbacks) obj;
            }
            obj = ((ContextWrapper) obj).getBaseContext();
            a.r(obj, "getBaseContext(...)");
        }
        Context applicationContext = context.getApplicationContext();
        a.q(applicationContext, "null cannot be cast to non-null type android.app.Application");
        return (Application) applicationContext;
    }
}
