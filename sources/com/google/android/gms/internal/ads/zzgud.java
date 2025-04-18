package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgud extends zzhbe implements zzhcq {
    private static final zzgud zza;
    private static volatile zzhcx zzb;
    private int zzc;
    private zzguj zzd;
    private zzgvu zze;

    static {
        zzgud zzgudVar = new zzgud();
        zza = zzgudVar;
        zzhbe.zzcb(zzgud.class, zzgudVar);
    }

    private zzgud() {
    }

    public static zzguc zza() {
        return (zzguc) zza.zzaZ();
    }

    public static zzgud zzd(zzgzs zzgzsVar, zzhao zzhaoVar) throws zzhbt {
        return (zzgud) zzhbe.zzbr(zza, zzgzsVar, zzhaoVar);
    }

    public static /* synthetic */ void zzg(zzgud zzgudVar, zzguj zzgujVar) {
        zzgujVar.getClass();
        zzgudVar.zzd = zzgujVar;
        zzgudVar.zzc |= 1;
    }

    public static /* synthetic */ void zzh(zzgud zzgudVar, zzgvu zzgvuVar) {
        zzgvuVar.getClass();
        zzgudVar.zze = zzgvuVar;
        zzgudVar.zzc |= 2;
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgud();
            case NEW_BUILDER:
                return new zzguc(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzgud.class) {
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

    public final zzguj zze() {
        zzguj zzgujVar = this.zzd;
        return zzgujVar == null ? zzguj.zze() : zzgujVar;
    }

    public final zzgvu zzf() {
        zzgvu zzgvuVar = this.zze;
        return zzgvuVar == null ? zzgvu.zzf() : zzgvuVar;
    }
}
