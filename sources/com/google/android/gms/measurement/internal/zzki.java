package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.adjust.sdk.Constants;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzki implements Application.ActivityLifecycleCallbacks {
    private final /* synthetic */ zziv zza;

    public zzki(zziv zzivVar) {
        this.zza = zzivVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a9 A[Catch: RuntimeException -> 0x002b, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x002b, blocks: (B:3:0x000f, B:5:0x001b, B:8:0x002f, B:14:0x00a9, B:16:0x00b5, B:19:0x00ca, B:21:0x00d0, B:24:0x00dd, B:26:0x00e3, B:27:0x00f8, B:29:0x0104, B:33:0x010b, B:37:0x012e, B:38:0x014a, B:40:0x013b, B:41:0x0151, B:43:0x0157, B:45:0x015d, B:47:0x0163, B:49:0x0169, B:51:0x0171, B:53:0x0179, B:55:0x017f, B:58:0x0186, B:60:0x0044, B:63:0x004c, B:65:0x0054, B:67:0x005a, B:69:0x0060, B:71:0x0066, B:73:0x006e, B:75:0x0076, B:77:0x007e, B:79:0x0086, B:80:0x0092, B:82:0x00a0), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010b A[Catch: RuntimeException -> 0x002b, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x002b, blocks: (B:3:0x000f, B:5:0x001b, B:8:0x002f, B:14:0x00a9, B:16:0x00b5, B:19:0x00ca, B:21:0x00d0, B:24:0x00dd, B:26:0x00e3, B:27:0x00f8, B:29:0x0104, B:33:0x010b, B:37:0x012e, B:38:0x014a, B:40:0x013b, B:41:0x0151, B:43:0x0157, B:45:0x015d, B:47:0x0163, B:49:0x0169, B:51:0x0171, B:53:0x0179, B:55:0x017f, B:58:0x0186, B:60:0x0044, B:63:0x004c, B:65:0x0054, B:67:0x005a, B:69:0x0060, B:71:0x0066, B:73:0x006e, B:75:0x0076, B:77:0x007e, B:79:0x0086, B:80:0x0092, B:82:0x00a0), top: B:2:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void zza(com.google.android.gms.measurement.internal.zzki r16, boolean r17, android.net.Uri r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzki.zza(com.google.android.gms.measurement.internal.zzki, boolean, android.net.Uri, java.lang.String, java.lang.String):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        String str;
        boolean z8;
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
                    if (zznp.zza(intent)) {
                        str = "gs";
                    } else {
                        str = "auto";
                    }
                    String str2 = str;
                    String queryParameter = uri.getQueryParameter(Constants.REFERRER);
                    if (bundle == null) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    this.zza.zzl().zzb(new zzkh(this, z8, uri, str2, queryParameter));
                    this.zza.zzn().zza(activity, bundle);
                }
            } catch (RuntimeException e4) {
                this.zza.zzj().zzg().zza("Throwable caught in onActivityCreated", e4);
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
    public final void onActivityPaused(Activity activity) {
        this.zza.zzn().zzb(activity);
        zzmh zzp = this.zza.zzp();
        zzp.zzl().zzb(new zzmj(zzp, zzp.zzb().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzmh zzp = this.zza.zzp();
        zzp.zzl().zzb(new zzmk(zzp, zzp.zzb().elapsedRealtime()));
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
