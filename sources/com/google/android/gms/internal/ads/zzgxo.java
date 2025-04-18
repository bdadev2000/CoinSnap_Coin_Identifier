package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgxo extends zzhbe implements zzhcq {
    private static final zzgxo zza;
    private static volatile zzhcx zzb;
    private int zzc;

    static {
        zzgxo zzgxoVar = new zzgxo();
        zza = zzgxoVar;
        zzhbe.zzcb(zzgxo.class, zzgxoVar);
    }

    private zzgxo() {
    }

    public static zzgxo zzd() {
        return zza;
    }

    public static zzgxo zze(zzgzs zzgzsVar, zzhao zzhaoVar) throws zzhbt {
        return (zzgxo) zzhbe.zzbr(zza, zzgzsVar, zzhaoVar);
    }

    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzc"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgxo();
            case NEW_BUILDER:
                return new zzgxn(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzgxo.class) {
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
}
