package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzfla extends zzgyx implements zzhaj {
    private static final zzfla zza;
    private static volatile zzhaq zzb;
    private String zzc = "";

    static {
        zzfla zzflaVar = new zzfla();
        zza = zzflaVar;
        zzgyx.zzcb(zzfla.class, zzflaVar);
    }

    private zzfla() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzfkz zzfkzVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzc"});
            case NEW_MUTABLE_INSTANCE:
                return new zzfla();
            case NEW_BUILDER:
                return new zzfky(zzfkzVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzfla.class) {
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
