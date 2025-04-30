package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcrn {
    private final zzdvc zza;
    private final zzfhf zzb;

    public zzcrn(zzdvc zzdvcVar, zzfhf zzfhfVar) {
        this.zza = zzdvcVar;
        this.zzb = zzfhfVar;
    }

    public final void zza(long j7, int i9) {
        String str;
        zzdvb zza = this.zza.zza();
        zza.zzd(this.zzb.zzb.zzb);
        zza.zzb("action", "ad_closed");
        zza.zzb("show_time", String.valueOf(j7));
        zza.zzb("ad_format", "app_open_ad");
        int i10 = i9 - 1;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
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
