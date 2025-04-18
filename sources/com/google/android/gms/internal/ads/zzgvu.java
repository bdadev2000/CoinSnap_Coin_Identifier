package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgvu extends zzhbe implements zzhcq {
    private static final zzgvu zza;
    private static volatile zzhcx zzb;
    private int zzc;
    private zzgvx zzd;
    private int zze;
    private int zzf;

    static {
        zzgvu zzgvuVar = new zzgvu();
        zza = zzgvuVar;
        zzhbe.zzcb(zzgvu.class, zzgvuVar);
    }

    private zzgvu() {
    }

    public static zzgvt zzd() {
        return (zzgvt) zza.zzaZ();
    }

    public static zzgvu zzf() {
        return zza;
    }

    public static zzgvu zzg(zzgzs zzgzsVar, zzhao zzhaoVar) throws zzhbt {
        return (zzgvu) zzhbe.zzbr(zza, zzgzsVar, zzhaoVar);
    }

    public static /* synthetic */ void zzi(zzgvu zzgvuVar, zzgvx zzgvxVar) {
        zzgvxVar.getClass();
        zzgvuVar.zzd = zzgvxVar;
        zzgvuVar.zzc |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzc() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgvu();
            case NEW_BUILDER:
                return new zzgvt(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzgvu.class) {
                        try {
                            zzhcxVar = zzb;
                            if (zzhcxVar == null) {
                                zzhcxVar = new zzhaz(zza);
                                zzb = zzhcxVar;
                            }
                        } finally {
                        }
                    }
                }
                return zzhcxVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final zzgvx zzh() {
        zzgvx zzgvxVar = this.zzd;
        return zzgvxVar == null ? zzgvx.zzf() : zzgvxVar;
    }
}
