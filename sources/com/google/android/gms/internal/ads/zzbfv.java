package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public class zzbfv {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    public zzbfv(String str, Object obj, int i9) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i9;
    }

    public static zzbfv zza(String str, double d2) {
        return new zzbfv(str, Double.valueOf(d2), 3);
    }

    public static zzbfv zzb(String str, long j7) {
        return new zzbfv(str, Long.valueOf(j7), 2);
    }

    public static zzbfv zzc(String str, String str2) {
        return new zzbfv(str, str2, 4);
    }

    public static zzbfv zzd(String str, boolean z8) {
        return new zzbfv(str, Boolean.valueOf(z8), 1);
    }

    public final Object zze() {
        zzbgz zza = zzbhb.zza();
        if (zza == null) {
            if (zzbhb.zzb() != null) {
                zzbhb.zzb().zza();
            }
            return this.zzb;
        }
        int i9 = this.zzc - 1;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    return zza.zzd(this.zza, (String) this.zzb);
                }
                return zza.zzb(this.zza, ((Double) this.zzb).doubleValue());
            }
            return zza.zzc(this.zza, ((Long) this.zzb).longValue());
        }
        return zza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
    }
}
