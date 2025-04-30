package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzatu extends zzhbo implements zzhdf {
    private static final zzatu zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;

    static {
        zzatu zzatuVar = new zzatu();
        zza = zzatuVar;
        zzhbo.zzca(zzatu.class, zzatuVar);
    }

    private zzatu() {
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzato zzatoVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbo.zzbR(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzc", "zzd", zzatz.zza});
            case NEW_MUTABLE_INSTANCE:
                return new zzatu();
            case NEW_BUILDER:
                return new zzatt(zzatoVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzatu.class) {
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
