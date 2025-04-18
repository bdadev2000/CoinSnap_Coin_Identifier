package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzasi extends zzgyx implements zzhaj {
    private static final zzasi zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private int zzd;

    static {
        zzasi zzasiVar = new zzasi();
        zza = zzasiVar;
        zzgyx.zzcb(zzasi.class, zzasiVar);
    }

    private zzasi() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzatq zzatqVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzc", "zzd", zzasl.zza});
            case NEW_MUTABLE_INSTANCE:
                return new zzasi();
            case NEW_BUILDER:
                return new zzash(zzatqVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzasi.class) {
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
