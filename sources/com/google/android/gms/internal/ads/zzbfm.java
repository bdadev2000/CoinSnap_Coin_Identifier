package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import c.C0578b;
import java.util.List;
import u.AbstractC2736e;
import u.AbstractServiceConnectionC2741j;
import u.C2744m;

/* loaded from: classes2.dex */
public final class zzbfm {

    @Nullable
    private C2744m zza;

    @Nullable
    private AbstractC2736e zzb;

    @Nullable
    private AbstractServiceConnectionC2741j zzc;

    @Nullable
    private zzbfl zzd;

    public static boolean zzg(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (queryIntentActivities != null && resolveActivity != null) {
                for (int i9 = 0; i9 < queryIntentActivities.size(); i9++) {
                    if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i9).activityInfo.name)) {
                        return resolveActivity.activityInfo.packageName.equals(zzhlh.zza(context));
                    }
                }
            }
        }
        return false;
    }

    @Nullable
    public final C2744m zza() {
        AbstractC2736e abstractC2736e = this.zzb;
        if (abstractC2736e == null) {
            this.zza = null;
        } else if (this.zza == null) {
            this.zza = abstractC2736e.b(null);
        }
        return this.zza;
    }

    public final void zzb(Activity activity) {
        String zza;
        if (this.zzb == null && (zza = zzhlh.zza(activity)) != null) {
            zzhli zzhliVar = new zzhli(this);
            this.zzc = zzhliVar;
            AbstractC2736e.a(activity, zza, zzhliVar);
        }
    }

    public final void zzc(AbstractC2736e abstractC2736e) {
        this.zzb = abstractC2736e;
        abstractC2736e.getClass();
        try {
            ((C0578b) abstractC2736e.f23040a).j();
        } catch (RemoteException unused) {
        }
        zzbfl zzbflVar = this.zzd;
        if (zzbflVar != null) {
            zzbflVar.zza();
        }
    }

    public final void zzd() {
        this.zzb = null;
        this.zza = null;
    }

    public final void zze(zzbfl zzbflVar) {
        this.zzd = zzbflVar;
    }

    public final void zzf(Activity activity) {
        AbstractServiceConnectionC2741j abstractServiceConnectionC2741j = this.zzc;
        if (abstractServiceConnectionC2741j == null) {
            return;
        }
        activity.unbindService(abstractServiceConnectionC2741j);
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }
}
