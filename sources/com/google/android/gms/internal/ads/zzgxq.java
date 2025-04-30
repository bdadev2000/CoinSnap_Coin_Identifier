package com.google.android.gms.internal.ads;

@Deprecated
/* loaded from: classes2.dex */
public final class zzgxq extends zzhbo implements zzhdf {
    private static final zzgxq zza;
    private static volatile zzhdm zzb;
    private String zzc = "";
    private zzhca zzd = zzhbo.zzbK();

    static {
        zzgxq zzgxqVar = new zzgxq();
        zza = zzgxqVar;
        zzhbo.zzca(zzgxq.class, zzgxqVar);
    }

    private zzgxq() {
    }

    public static zzgxq zzc() {
        return zza;
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
                return zzhbo.zzbR(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzc", "zzd", zzgwp.class});
            case NEW_MUTABLE_INSTANCE:
                return new zzgxq();
            case NEW_BUILDER:
                return new zzgxp(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzgxq.class) {
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
