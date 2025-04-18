package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzfld extends zzgyx implements zzhaj {
    private static final zzfld zza;
    private static volatile zzhaq zzb;
    private String zzc = "";

    static {
        zzfld zzfldVar = new zzfld();
        zza = zzfldVar;
        zzgyx.zzcb(zzfld.class, zzfldVar);
    }

    private zzfld() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzflc zzflcVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzc"});
            case NEW_MUTABLE_INSTANCE:
                return new zzfld();
            case NEW_BUILDER:
                return new zzflb(zzflcVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzfld.class) {
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
