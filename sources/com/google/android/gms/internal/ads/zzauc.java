package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzauc extends zzhbo implements zzhdf {
    private static final zzauc zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private long zzd = -1;
    private int zze = 1000;
    private int zzf = 1000;

    static {
        zzauc zzaucVar = new zzauc();
        zza = zzaucVar;
        zzhbo.zzca(zzauc.class, zzaucVar);
    }

    private zzauc() {
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
                zzhbu zzhbuVar = zzavb.zza;
                return zzhbo.zzbR(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzc", "zzd", "zze", zzhbuVar, "zzf", zzhbuVar});
            case NEW_MUTABLE_INSTANCE:
                return new zzauc();
            case NEW_BUILDER:
                return new zzaub(zzatoVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzauc.class) {
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
