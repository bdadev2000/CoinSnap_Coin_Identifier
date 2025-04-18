package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzac;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbdz;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
final class zzs {
    private final Context zza;
    private final String zzb;
    private final Map zzc = new TreeMap();
    private String zzd;
    private String zze;
    private final String zzf;

    public zzs(Context context, String str) {
        String concat;
        this.zza = context.getApplicationContext();
        this.zzb = str;
        String packageName = context.getPackageName();
        try {
            concat = packageName + "-" + Wrappers.packageManager(context).getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to get package version name for reporting", e2);
            concat = String.valueOf(packageName).concat("-missing");
        }
        this.zzf = concat;
    }

    public final String zza() {
        return this.zzf;
    }

    public final String zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzd;
    }

    public final Map zze() {
        return this.zzc;
    }

    public final void zzf(com.google.android.gms.ads.internal.client.zzm zzmVar, VersionInfoParcel versionInfoParcel) {
        Bundle bundle;
        this.zzd = zzmVar.zzj.zza;
        Bundle bundle2 = zzmVar.zzm;
        if (bundle2 != null) {
            bundle = bundle2.getBundle(AdMobAdapter.class.getName());
        } else {
            bundle = null;
        }
        if (bundle != null) {
            String str = (String) zzbdz.zzc.zze();
            for (String str2 : bundle.keySet()) {
                if (str.equals(str2)) {
                    this.zze = bundle.getString(str2);
                } else if (str2.startsWith("csa_")) {
                    this.zzc.put(str2.substring(4), bundle.getString(str2));
                }
            }
            this.zzc.put("SDKVersion", versionInfoParcel.afmaVersion);
            if (((Boolean) zzbdz.zza.zze()).booleanValue()) {
                Bundle zzb = zzac.zzb(this.zza, (String) zzbdz.zzb.zze());
                for (String str3 : zzb.keySet()) {
                    this.zzc.put(str3, zzb.get(str3).toString());
                }
            }
        }
    }
}
