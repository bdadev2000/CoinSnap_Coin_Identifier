package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;
import o.h;
import o.o;
import o.s;

/* loaded from: classes3.dex */
public final class zzbdo {

    @Nullable
    private s zza;

    @Nullable
    private h zzb;

    @Nullable
    private o zzc;

    @Nullable
    private zzbdn zzd;

    public static boolean zzg(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, C.DEFAULT_BUFFER_SEGMENT_SIZE);
            if (queryIntentActivities != null && resolveActivity != null) {
                for (int i10 = 0; i10 < queryIntentActivities.size(); i10++) {
                    if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i10).activityInfo.name)) {
                        return resolveActivity.activityInfo.packageName.equals(zzhgq.zza(context));
                    }
                }
            }
        }
        return false;
    }

    @Nullable
    public final s zza() {
        h hVar = this.zzb;
        if (hVar == null) {
            this.zza = null;
        } else if (this.zza == null) {
            this.zza = hVar.c(null);
        }
        return this.zza;
    }

    public final void zzb(Activity activity) {
        String zza;
        if (this.zzb == null && (zza = zzhgq.zza(activity)) != null) {
            zzhgr zzhgrVar = new zzhgr(this);
            this.zzc = zzhgrVar;
            h.a(activity, zza, zzhgrVar);
        }
    }

    public final void zzc(h hVar) {
        this.zzb = hVar;
        hVar.getClass();
        try {
            ((b.c) hVar.a).l();
        } catch (RemoteException unused) {
        }
        zzbdn zzbdnVar = this.zzd;
        if (zzbdnVar != null) {
            zzbdnVar.zza();
        }
    }

    public final void zzd() {
        this.zzb = null;
        this.zza = null;
    }

    public final void zze(zzbdn zzbdnVar) {
        this.zzd = zzbdnVar;
    }

    public final void zzf(Activity activity) {
        o oVar = this.zzc;
        if (oVar == null) {
            return;
        }
        activity.unbindService(oVar);
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }
}
