package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: Access modifiers changed from: package-private */
@MainThread
@VisibleForTesting
/* loaded from: classes4.dex */
public final class zzkz implements Application.ActivityLifecycleCallbacks {
    private final /* synthetic */ zzjq zza;

    public zzkz(zzjq zzjqVar) {
        this.zza = zzjqVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a8 A[Catch: RuntimeException -> 0x002b, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x002b, blocks: (B:3:0x000d, B:5:0x001b, B:8:0x002f, B:14:0x00a8, B:16:0x00b4, B:19:0x00c9, B:21:0x00cf, B:24:0x00dc, B:26:0x00e2, B:27:0x00f5, B:29:0x0101, B:33:0x0108, B:37:0x012b, B:38:0x0147, B:40:0x0138, B:41:0x014e, B:43:0x0154, B:45:0x015a, B:47:0x0160, B:49:0x0166, B:51:0x016e, B:53:0x0176, B:55:0x017c, B:58:0x0182, B:60:0x0043, B:63:0x004b, B:65:0x0053, B:67:0x0059, B:69:0x005f, B:71:0x0065, B:73:0x006d, B:75:0x0075, B:77:0x007d, B:79:0x0085, B:80:0x0091, B:82:0x009f), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0107 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0108 A[Catch: RuntimeException -> 0x002b, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x002b, blocks: (B:3:0x000d, B:5:0x001b, B:8:0x002f, B:14:0x00a8, B:16:0x00b4, B:19:0x00c9, B:21:0x00cf, B:24:0x00dc, B:26:0x00e2, B:27:0x00f5, B:29:0x0101, B:33:0x0108, B:37:0x012b, B:38:0x0147, B:40:0x0138, B:41:0x014e, B:43:0x0154, B:45:0x015a, B:47:0x0160, B:49:0x0166, B:51:0x016e, B:53:0x0176, B:55:0x017c, B:58:0x0182, B:60:0x0043, B:63:0x004b, B:65:0x0053, B:67:0x0059, B:69:0x005f, B:71:0x0065, B:73:0x006d, B:75:0x0075, B:77:0x007d, B:79:0x0085, B:80:0x0091, B:82:0x009f), top: B:2:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void zza(com.google.android.gms.measurement.internal.zzkz r17, boolean r18, android.net.Uri r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkz.zza(com.google.android.gms.measurement.internal.zzkz, boolean, android.net.Uri, java.lang.String, java.lang.String):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            try {
                this.zza.zzj().zzp().zza("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent == null) {
                    this.zza.zzn().zza(activity, bundle);
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
                    this.zza.zzl().zzb(new zzlc(this, bundle == null, uri, zzos.zza(intent) ? "gs" : "auto", uri.getQueryParameter("referrer")));
                    this.zza.zzn().zza(activity, bundle);
                }
            } catch (RuntimeException e) {
                this.zza.zzj().zzg().zza("Throwable caught in onActivityCreated", e);
                this.zza.zzn().zza(activity, bundle);
            }
        } finally {
            this.zza.zzn().zza(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.zza.zzn().zza(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityPaused(Activity activity) {
        this.zza.zzn().zzb(activity);
        zznb zzp = this.zza.zzp();
        zzp.zzl().zzb(new zznd(zzp, zzp.zzb().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
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
