package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhfo extends zzhbo implements zzhdf {
    private static final zzhfo zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private long zzd;
    private long zze;

    static {
        zzhfo zzhfoVar = new zzhfo();
        zza = zzhfoVar;
        zzhbo.zzca(zzhfo.class, zzhfoVar);
    }

    private zzhfo() {
    }

    public static zzhfn zzc() {
        return (zzhfn) zza.zzaZ();
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzhfm zzhfmVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbo.zzbR(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhfo();
            case NEW_BUILDER:
                return new zzhfn(zzhfmVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzhfo.class) {
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
