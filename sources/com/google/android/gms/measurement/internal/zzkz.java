package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.adjust.sdk.Constants;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes12.dex */
public final class zzkz implements Application.ActivityLifecycleCallbacks {
    private final /* synthetic */ zzjq zza;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ae A[Catch: RuntimeException -> 0x0196, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x0196, blocks: (B:3:0x000b, B:5:0x0019, B:8:0x002a, B:14:0x00ae, B:16:0x00ba, B:19:0x00cf, B:21:0x00d5, B:24:0x00e2, B:26:0x00e8, B:27:0x00fb, B:29:0x0107, B:33:0x010e, B:37:0x0131, B:38:0x014d, B:40:0x013e, B:41:0x0154, B:43:0x015a, B:45:0x0160, B:47:0x0166, B:49:0x016c, B:51:0x0174, B:53:0x017c, B:55:0x0182, B:58:0x0188, B:60:0x003e, B:63:0x0046, B:65:0x004e, B:67:0x0054, B:69:0x005a, B:71:0x0060, B:73:0x0068, B:75:0x0070, B:77:0x0078, B:79:0x0080, B:80:0x008c, B:82:0x00a5), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010e A[Catch: RuntimeException -> 0x0196, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0196, blocks: (B:3:0x000b, B:5:0x0019, B:8:0x002a, B:14:0x00ae, B:16:0x00ba, B:19:0x00cf, B:21:0x00d5, B:24:0x00e2, B:26:0x00e8, B:27:0x00fb, B:29:0x0107, B:33:0x010e, B:37:0x0131, B:38:0x014d, B:40:0x013e, B:41:0x0154, B:43:0x015a, B:45:0x0160, B:47:0x0166, B:49:0x016c, B:51:0x0174, B:53:0x017c, B:55:0x0182, B:58:0x0188, B:60:0x003e, B:63:0x0046, B:65:0x004e, B:67:0x0054, B:69:0x005a, B:71:0x0060, B:73:0x0068, B:75:0x0070, B:77:0x0078, B:79:0x0080, B:80:0x008c, B:82:0x00a5), top: B:2:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void zza(com.google.android.gms.measurement.internal.zzkz r17, boolean r18, android.net.Uri r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkz.zza(com.google.android.gms.measurement.internal.zzkz, boolean, android.net.Uri, java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkz(zzjq zzjqVar) {
        this.zza = zzjqVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        String str;
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
                    str = "auto";
                }
                this.zza.zzl().zzb(new zzlc(this, bundle == null, uri, str, uri.getQueryParameter(Constants.REFERRER)));
            }
        } catch (RuntimeException e) {
            this.zza.zzj().zzg().zza("Throwable caught in onActivityCreated", e);
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
}
