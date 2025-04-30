package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzguq extends zzhbo implements zzhdf {
    private static final zzguq zza;
    private static volatile zzhdm zzb;
    private int zzc;

    static {
        zzguq zzguqVar = new zzguq();
        zza = zzguqVar;
        zzhbo.zzca(zzguq.class, zzguqVar);
    }

    private zzguq() {
    }

    public static zzgup zzc() {
        return (zzgup) zza.zzaZ();
    }

    public static zzguq zze() {
        return zza;
    }

    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzguo zzguoVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbo.zzbR(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzc"});
            case NEW_MUTABLE_INSTANCE:
                return new zzguq();
            case NEW_BUILDER:
                return new zzgup(zzguoVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzguq.class) {
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
