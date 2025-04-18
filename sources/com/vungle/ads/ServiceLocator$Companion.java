package com.vungle.ads;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J#\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\bJ\u0006\u0010\n\u001a\u00020\tR*\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"com/vungle/ads/ServiceLocator$Companion", "", "Landroid/content/Context;", "context", "Lcom/vungle/ads/e3;", "getInstance", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Lazy;", "inject", "", "deInit", "INSTANCE", "Lcom/vungle/ads/e3;", "getINSTANCE$vungle_ads_release", "()Lcom/vungle/ads/e3;", "setINSTANCE$vungle_ads_release", "(Lcom/vungle/ads/e3;)V", "getINSTANCE$vungle_ads_release$annotations", "()V", "<init>", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes4.dex */
public final class ServiceLocator$Companion {
    private ServiceLocator$Companion() {
    }

    public /* synthetic */ ServiceLocator$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void getINSTANCE$vungle_ads_release$annotations() {
    }

    public final synchronized void deInit() {
        setINSTANCE$vungle_ads_release(null);
    }

    public final e3 getINSTANCE$vungle_ads_release() {
        return e3.access$getINSTANCE$cp();
    }

    public final e3 getInstance(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        e3 iNSTANCE$vungle_ads_release = getINSTANCE$vungle_ads_release();
        if (iNSTANCE$vungle_ads_release == null) {
            synchronized (this) {
                ServiceLocator$Companion serviceLocator$Companion = e3.Companion;
                e3 iNSTANCE$vungle_ads_release2 = serviceLocator$Companion.getINSTANCE$vungle_ads_release();
                if (iNSTANCE$vungle_ads_release2 == null) {
                    iNSTANCE$vungle_ads_release2 = new e3(context, null);
                    serviceLocator$Companion.setINSTANCE$vungle_ads_release(iNSTANCE$vungle_ads_release2);
                }
                iNSTANCE$vungle_ads_release = iNSTANCE$vungle_ads_release2;
            }
        }
        return iNSTANCE$vungle_ads_release;
    }

    public final /* synthetic */ <T> Lazy<T> inject(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new o2(context));
    }

    public final void setINSTANCE$vungle_ads_release(e3 e3Var) {
        e3.access$setINSTANCE$cp(e3Var);
    }
}
