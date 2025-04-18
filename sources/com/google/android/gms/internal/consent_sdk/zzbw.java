package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.ContextWrapper;
import android.content.Intent;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;

/* loaded from: classes4.dex */
public final class zzbw extends ContextWrapper {
    private Activity zza;

    public zzbw(Application application) {
        super(application);
    }

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p02, Intent p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p12 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p12, g.f30053h);
        p02.startActivity(p12);
    }

    public static void safedk_ContextWrapper_startActivity_343b961272212e138b570e00b333c365(ContextWrapper p02, Intent p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/ContextWrapper;->startActivity(Landroid/content/Intent;)V");
        if (p12 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p12, g.f30053h);
        super.startActivity(p12);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        Activity activity = this.zza;
        return activity != null ? activity.getSystemService(str) : super.getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.zza;
        if (activity != null) {
            safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, intent);
        } else {
            intent.setFlags(268435456);
            safedk_ContextWrapper_startActivity_343b961272212e138b570e00b333c365(this, intent);
        }
    }

    public final void zza(Activity activity) {
        this.zza = activity;
    }
}
