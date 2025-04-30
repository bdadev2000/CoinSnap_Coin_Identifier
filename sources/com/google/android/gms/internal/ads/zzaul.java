package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzaul extends zzhbo implements zzhdf {
    private static final zzaul zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;
    private long zze = -1;

    static {
        zzaul zzaulVar = new zzaul();
        zza = zzaulVar;
        zzhbo.zzca(zzaul.class, zzaulVar);
    }

    private zzaul() {
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
                return zzhbo.zzbR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", zzatw.zza, "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzaul();
            case NEW_BUILDER:
                return new zzauk(zzatoVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzaul.class) {
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
