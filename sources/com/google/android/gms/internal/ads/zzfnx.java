package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzfnx extends zzhbo implements zzhdf {
    private static final zzfnx zza;
    private static volatile zzhdm zzb;
    private zzhca zzc = zzhbo.zzbK();

    static {
        zzfnx zzfnxVar = new zzfnx();
        zza = zzfnxVar;
        zzhbo.zzca(zzfnx.class, zzfnxVar);
    }

    private zzfnx() {
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbo.zzbR(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", zzfnu.class});
            case NEW_MUTABLE_INSTANCE:
                return new zzfnx();
            case NEW_BUILDER:
                return new zzfnw(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzfnx.class) {
                        try {
                            zzhdmVar = zzb;
                            if (zzhdmVar == null) {
                                zzhdmVar = new zzhbj(zza);
                                zzb = zzhdmVar;
                            }
                        } finally {
                        }
                    }
                }
                return zzhdmVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
