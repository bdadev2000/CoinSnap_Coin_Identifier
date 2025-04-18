package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgvn extends zzhbe implements zzhcq {
    private static final zzgvn zza;
    private static volatile zzhcx zzb;

    static {
        zzgvn zzgvnVar = new zzgvn();
        zza = zzgvnVar;
        zzhbe.zzcb(zzgvn.class, zzgvnVar);
    }

    private zzgvn() {
    }

    public static zzgvn zzc() {
        return zza;
    }

    public static zzgvn zzd(zzgzs zzgzsVar, zzhao zzhaoVar) throws zzhbt {
        return (zzgvn) zzhbe.zzbr(zza, zzgzsVar, zzhaoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zza, "\u0000\u0000", null);
            case NEW_MUTABLE_INSTANCE:
                return new zzgvn();
            case NEW_BUILDER:
                return new zzgvm(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzgvn.class) {
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
