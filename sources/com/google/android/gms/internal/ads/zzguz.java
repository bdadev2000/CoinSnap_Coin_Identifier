package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzguz extends zzhbo implements zzhdf {
    private static final zzguz zza;
    private static volatile zzhdm zzb;
    private int zzc;

    static {
        zzguz zzguzVar = new zzguz();
        zza = zzguzVar;
        zzhbo.zzca(zzguz.class, zzguzVar);
    }

    private zzguz() {
    }

    public static zzguy zzc() {
        return (zzguy) zza.zzaZ();
    }

    public static zzguz zze() {
        return zza;
    }

    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzgux zzguxVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbo.zzbR(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzc"});
            case NEW_MUTABLE_INSTANCE:
                return new zzguz();
            case NEW_BUILDER:
                return new zzguy(zzguxVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzguz.class) {
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
