package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgvr extends zzhbe implements zzhcq {
    private static final zzgvr zza;
    private static volatile zzhcx zzb;
    private int zzc;
    private int zzd;
    private zzgvx zze;
    private zzgzs zzf = zzgzs.zzb;

    static {
        zzgvr zzgvrVar = new zzgvr();
        zza = zzgvrVar;
        zzhbe.zzcb(zzgvr.class, zzgvrVar);
    }

    private zzgvr() {
    }

    public static zzgvq zzc() {
        return (zzgvq) zza.zzaZ();
    }

    public static zzgvr zze() {
        return zza;
    }

    public static zzgvr zzf(zzgzs zzgzsVar, zzhao zzhaoVar) throws zzhbt {
        return (zzgvr) zzhbe.zzbr(zza, zzgzsVar, zzhaoVar);
    }

    public static zzhcx zzi() {
        return zza.zzbN();
    }

    public static /* synthetic */ void zzj(zzgvr zzgvrVar, zzgvx zzgvxVar) {
        zzgvxVar.getClass();
        zzgvrVar.zze = zzgvxVar;
        zzgvrVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgvr();
            case NEW_BUILDER:
                return new zzgvq(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzgvr.class) {
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

    public final zzgvx zzg() {
        zzgvx zzgvxVar = this.zze;
        return zzgvxVar == null ? zzgvx.zzf() : zzgvxVar;
    }

    public final zzgzs zzh() {
        return this.zzf;
    }
}
