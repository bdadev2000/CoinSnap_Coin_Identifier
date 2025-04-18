package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzher extends zzgyx implements zzhaj {
    private static final zzher zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private int zzd;
    private String zze = "";

    static {
        zzher zzherVar = new zzher();
        zza = zzherVar;
        zzgyx.zzcb(zzher.class, zzherVar);
    }

    private zzher() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzhfd zzhfdVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", zzheq.zza, "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzher();
            case NEW_BUILDER:
                return new zzhep(zzhfdVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzher.class) {
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
