package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzflk extends zzgyx implements zzhaj {
    private static final zzflk zza;
    private static volatile zzhaq zzb;
    private zzgzj zzc = zzgyx.zzbK();

    static {
        zzflk zzflkVar = new zzflk();
        zza = zzflkVar;
        zzgyx.zzcb(zzflk.class, zzflkVar);
    }

    private zzflk() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", zzflh.class});
            case NEW_MUTABLE_INSTANCE:
                return new zzflk();
            case NEW_BUILDER:
                return new zzfli(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzflk.class) {
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
