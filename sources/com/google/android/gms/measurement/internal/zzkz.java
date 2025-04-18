package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzkz implements Application.ActivityLifecycleCallbacks {
    private final /* synthetic */ zzjq zza;

    public zzkz(zzjq zzjqVar) {
        this.zza = zzjqVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a5 A[Catch: RuntimeException -> 0x0190, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x0190, blocks: (B:3:0x000d, B:5:0x001b, B:8:0x002c, B:14:0x00a5, B:16:0x00b1, B:19:0x00c6, B:21:0x00cc, B:24:0x00d9, B:26:0x00df, B:27:0x00f2, B:29:0x00fe, B:33:0x0105, B:37:0x0128, B:38:0x0144, B:40:0x0135, B:41:0x014b, B:43:0x0151, B:45:0x0157, B:47:0x015d, B:49:0x0163, B:51:0x016b, B:55:0x0176, B:57:0x0184, B:59:0x018a, B:62:0x0040, B:65:0x0048, B:67:0x0050, B:69:0x0056, B:71:0x005c, B:73:0x0062, B:75:0x006a, B:77:0x0072, B:79:0x007a, B:81:0x0082, B:82:0x008e, B:84:0x009c), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0104 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0105 A[Catch: RuntimeException -> 0x0190, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0190, blocks: (B:3:0x000d, B:5:0x001b, B:8:0x002c, B:14:0x00a5, B:16:0x00b1, B:19:0x00c6, B:21:0x00cc, B:24:0x00d9, B:26:0x00df, B:27:0x00f2, B:29:0x00fe, B:33:0x0105, B:37:0x0128, B:38:0x0144, B:40:0x0135, B:41:0x014b, B:43:0x0151, B:45:0x0157, B:47:0x015d, B:49:0x0163, B:51:0x016b, B:55:0x0176, B:57:0x0184, B:59:0x018a, B:62:0x0040, B:65:0x0048, B:67:0x0050, B:69:0x0056, B:71:0x005c, B:73:0x0062, B:75:0x006a, B:77:0x0072, B:79:0x007a, B:81:0x0082, B:82:0x008e, B:84:0x009c), top: B:2:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void zza(com.google.android.gms.measurement.internal.zzkz r17, boolean r18, android.net.Uri r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkz.zza(com.google.android.gms.measurement.internal.zzkz, boolean, android.net.Uri, java.lang.String, java.lang.String):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        String str;
        boolean z10;
        try {
            this.zza.zzj().zzp().zza("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent == null) {
                return;
            }
            Uri data = intent.getData();
            if (data == null || !data.isHierarchical()) {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    String string = extras.getString("com.android.vending.referral_url");
                    if (!TextUtils.isEmpty(string)) {
                        data = Uri.parse(string);
                    }
                }
                data = null;
            }
            Uri uri = data;
            if (uri != null && uri.isHierarchical()) {
                this.zza.zzq();
                if (zzos.zza(intent)) {
                    str = "gs";
                } else {
                    str = DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
                }
                String str2 = str;
                String queryParameter = uri.getQueryParameter(Constants.REFERRER);
                if (bundle == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.zza.zzl().zzb(new zzlc(this, z10, uri, str2, queryParameter));
            }
        } catch (RuntimeException e2) {
            this.zza.zzj().zzg().zza("Throwable caught in onActivityCreated", e2);
        } finally {
            this.zza.zzn().zza(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.zza.zzn().zza(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.zza.zzn().zzb(activity);
        zznb zzp = this.zza.zzp();
        zzp.zzl().zzb(new zznd(zzp, zzp.zzb().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zznb zzp = this.zza.zzp();
        zzp.zzl().zzb(new zzne(zzp, zzp.zzb().elapsedRealtime()));
        this.zza.zzn().zzc(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.zza.zzn().zzb(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
