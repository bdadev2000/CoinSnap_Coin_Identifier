package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzcol {
    private final zzdsm zza;
    private final zzfff zzb;

    public zzcol(zzdsm zzdsmVar, zzfff zzfffVar) {
        this.zza = zzdsmVar;
        this.zzb = zzfffVar;
    }

    public final void zza(long j3, int i10) {
        String str;
        zzdsl zza = this.zza.zza();
        zza.zzd(this.zzb.zzb.zzb);
        zza.zzb("action", "ad_closed");
        zza.zzb("show_time", String.valueOf(j3));
        zza.zzb("ad_format", "app_open_ad");
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            str = "u";
                        } else {
                            str = "ac";
                        }
                    } else {
                        str = "cb";
                    }
                } else {
                    str = "cc";
                }
            } else {
                str = "bb";
            }
        } else {
            str = "h";
        }
        zza.zzb("acr", str);
        zza.zzf();
    }
}
