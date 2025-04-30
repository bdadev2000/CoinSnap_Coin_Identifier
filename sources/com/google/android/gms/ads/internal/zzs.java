package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzad;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbfx;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzs {
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
        } catch (PackageManager.NameNotFoundException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to get package version name for reporting", e4);
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

    public final void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, VersionInfoParcel versionInfoParcel) {
        Bundle bundle;
        this.zzd = zzlVar.zzj.zza;
        Bundle bundle2 = zzlVar.zzm;
        if (bundle2 != null) {
            bundle = bundle2.getBundle(AdMobAdapter.class.getName());
        } else {
            bundle = null;
        }
        if (bundle != null) {
            String str = (String) zzbfx.zzc.zze();
            for (String str2 : bundle.keySet()) {
                if (str.equals(str2)) {
                    this.zze = bundle.getString(str2);
                } else if (str2.startsWith("csa_")) {
                    this.zzc.put(str2.substring(4), bundle.getString(str2));
                }
            }
            this.zzc.put("SDKVersion", versionInfoParcel.afmaVersion);
            if (((Boolean) zzbfx.zza.zze()).booleanValue()) {
                Bundle zzb = zzad.zzb(this.zza, (String) zzbfx.zzb.zze());
                for (String str3 : zzb.keySet()) {
                    this.zzc.put(str3, zzb.get(str3).toString());
                }
            }
        }
    }
}
