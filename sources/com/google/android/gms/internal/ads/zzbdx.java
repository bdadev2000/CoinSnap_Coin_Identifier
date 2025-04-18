package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public class zzbdx {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    public zzbdx(String str, Object obj, int i10) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i10;
    }

    public static zzbdx zza(String str, double d10) {
        return new zzbdx(str, Double.valueOf(d10), 3);
    }

    public static zzbdx zzb(String str, long j3) {
        return new zzbdx(str, Long.valueOf(j3), 2);
    }

    public static zzbdx zzc(String str, String str2) {
        return new zzbdx("gad:dynamite_module:experiment_id", "", 4);
    }

    public static zzbdx zzd(String str, boolean z10) {
        return new zzbdx(str, Boolean.valueOf(z10), 1);
    }

    public final Object zze() {
        zzbfc zza = zzbfe.zza();
        if (zza == null) {
            if (zzbfe.zzb() != null) {
                zzbfe.zzb().zza();
            }
            return this.zzb;
        }
        int i10 = this.zzc - 1;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return zza.zzd(this.zza, (String) this.zzb);
                }
                return zza.zzb(this.zza, ((Double) this.zzb).doubleValue());
            }
            return zza.zzc(this.zza, ((Long) this.zzb).longValue());
        }
        return zza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
    }
}
