package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzaru extends zzgyx implements zzhaj {
    private static final zzaru zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private int zzd = 2;

    static {
        zzaru zzaruVar = new zzaru();
        zza = zzaruVar;
        zzgyx.zzcb(zzaru.class, zzaruVar);
    }

    private zzaru() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzary zzaryVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0004\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b᠌\u0000", new Object[]{"zzc", "zzd", zzarv.zza});
            case NEW_MUTABLE_INSTANCE:
                return new zzaru();
            case NEW_BUILDER:
                return new zzart(zzaryVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzaru.class) {
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
