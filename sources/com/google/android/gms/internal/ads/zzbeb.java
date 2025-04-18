package com.google.android.gms.internal.ads;

/* loaded from: classes4.dex */
public class zzbeb {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    public zzbeb(String str, Object obj, int i2) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i2;
    }

    public static zzbeb zza(String str, double d) {
        return new zzbeb(str, Double.valueOf(d), 3);
    }

    public static zzbeb zzb(String str, long j2) {
        return new zzbeb(str, Long.valueOf(j2), 2);
    }

    public static zzbeb zzc(String str, String str2) {
        return new zzbeb("gad:dynamite_module:experiment_id", "", 4);
    }

    public static zzbeb zzd(String str, boolean z2) {
        return new zzbeb(str, Boolean.valueOf(z2), 1);
    }

    public final Object zze() {
        zzbfg zza = zzbfi.zza();
        if (zza != null) {
            int i2 = this.zzc - 1;
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? zza.zzd(this.zza, (String) this.zzb) : zza.zzb(this.zza, ((Double) this.zzb).doubleValue()) : zza.zzc(this.zza, ((Long) this.zzb).longValue()) : zza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
        }
        if (zzbfi.zzb() != null) {
            zzbfi.zzb().zza();
        }
        return this.zzb;
    }
}
