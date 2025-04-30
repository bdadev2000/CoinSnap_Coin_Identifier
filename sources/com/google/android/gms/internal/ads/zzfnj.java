package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzfnj extends zzhbo implements zzhdf {
    private static final zzfnj zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private zzfnf zzd;

    static {
        zzfnj zzfnjVar = new zzfnj();
        zza = zzfnjVar;
        zzhbo.zzca(zzfnj.class, zzfnjVar);
    }

    private zzfnj() {
    }

    public static zzfni zza() {
        return (zzfni) zza.zzaZ();
    }

    public static /* synthetic */ zzfnj zzc() {
        return zza;
    }

    public static /* synthetic */ void zzd(zzfnj zzfnjVar, zzfnf zzfnfVar) {
        zzfnfVar.getClass();
        zzfnjVar.zzd = zzfnfVar;
        zzfnjVar.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzfng zzfngVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbo.zzbR(zza, "\u0000\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zzc", "zzd"});
            case NEW_MUTABLE_INSTANCE:
                return new zzfnj();
            case NEW_BUILDER:
                return new zzfni(zzfngVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzfnj.class) {
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
