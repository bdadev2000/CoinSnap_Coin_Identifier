package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzcpz {
    private final zzdud zza;
    private final zzfgt zzb;

    public zzcpz(zzdud zzdudVar, zzfgt zzfgtVar) {
        this.zza = zzdudVar;
        this.zzb = zzfgtVar;
    }

    public final void zza(long j2, int i2) {
        zzduc zza = this.zza.zza();
        zza.zzd(this.zzb.zzb.zzb);
        zza.zzb("action", "ad_closed");
        zza.zzb("show_time", String.valueOf(j2));
        zza.zzb("ad_format", "app_open_ad");
        int i3 = i2 - 1;
        zza.zzb("acr", i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h");
        zza.zzf();
    }
}
