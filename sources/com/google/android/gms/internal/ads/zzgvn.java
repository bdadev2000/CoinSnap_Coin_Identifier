package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgvn extends zzgyx implements zzhaj {
    private static final zzgvn zza;
    private static volatile zzhaq zzb;
    private int zzc;

    static {
        zzgvn zzgvnVar = new zzgvn();
        zza = zzgvnVar;
        zzgyx.zzcb(zzgvn.class, zzgvnVar);
    }

    private zzgvn() {
    }

    public static zzgvn zzc() {
        return zza;
    }

    public static zzgvn zzd(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
        return (zzgvn) zzgyx.zzbr(zza, zzgxpVar, zzgyhVar);
    }

    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzc"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgvn();
            case NEW_BUILDER:
                return new zzgvl(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzgvn.class) {
                        zzhaqVar = zzb;
                        if (zzhaqVar == null) {
                            zzhaqVar = new zzgys(zza);
                            zzb = zzhaqVar;
                        }
                    }
                }
                return zzhaqVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
