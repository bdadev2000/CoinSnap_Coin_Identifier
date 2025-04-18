package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgtu extends zzhbe implements zzhcq {
    private static final zzgtu zza;
    private static volatile zzhcx zzb;
    private int zzc;
    private int zzd;
    private zzgtx zze;

    static {
        zzgtu zzgtuVar = new zzgtu();
        zza = zzgtuVar;
        zzhbe.zzcb(zzgtu.class, zzgtuVar);
    }

    private zzgtu() {
    }

    public static zzgtt zzc() {
        return (zzgtt) zza.zzaZ();
    }

    public static zzgtu zze(zzgzs zzgzsVar, zzhao zzhaoVar) throws zzhbt {
        return (zzgtu) zzhbe.zzbr(zza, zzgzsVar, zzhaoVar);
    }

    public static /* synthetic */ void zzh(zzgtu zzgtuVar, zzgtx zzgtxVar) {
        zzgtxVar.getClass();
        zzgtuVar.zze = zzgtxVar;
        zzgtuVar.zzc |= 1;
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
                return zzhbe.zzbS(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgtu();
            case NEW_BUILDER:
                return new zzgtt(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzgtu.class) {
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

    public final zzgtx zzf() {
        zzgtx zzgtxVar = this.zze;
        return zzgtxVar == null ? zzgtx.zze() : zzgtxVar;
    }
}
