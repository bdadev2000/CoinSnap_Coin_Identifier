package com.vungle.ads;

import android.content.Context;
import androidx.annotation.Keep;
import t7.InterfaceC2717f;

@Keep
/* loaded from: classes3.dex */
public final class ServiceLocator$Companion {
    public /* synthetic */ ServiceLocator$Companion(G7.f fVar) {
        this();
    }

    public static /* synthetic */ void getINSTANCE$vungle_ads_release$annotations() {
    }

    public final synchronized void deInit() {
        setINSTANCE$vungle_ads_release(null);
    }

    public final f1 getINSTANCE$vungle_ads_release() {
        return f1.access$getINSTANCE$cp();
    }

    public final f1 getInstance(Context context) {
        G7.j.e(context, "context");
        f1 iNSTANCE$vungle_ads_release = getINSTANCE$vungle_ads_release();
        if (iNSTANCE$vungle_ads_release == null) {
            synchronized (this) {
                ServiceLocator$Companion serviceLocator$Companion = f1.Companion;
                f1 iNSTANCE$vungle_ads_release2 = serviceLocator$Companion.getINSTANCE$vungle_ads_release();
                if (iNSTANCE$vungle_ads_release2 == null) {
                    iNSTANCE$vungle_ads_release2 = new f1(context, null);
                    serviceLocator$Companion.setINSTANCE$vungle_ads_release(iNSTANCE$vungle_ads_release2);
                }
                iNSTANCE$vungle_ads_release = iNSTANCE$vungle_ads_release2;
            }
        }
        return iNSTANCE$vungle_ads_release;
    }

    public final <T> InterfaceC2717f inject(Context context) {
        G7.j.e(context, "context");
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public final void setINSTANCE$vungle_ads_release(f1 f1Var) {
        f1.access$setINSTANCE$cp(f1Var);
    }

    private ServiceLocator$Companion() {
    }
}
