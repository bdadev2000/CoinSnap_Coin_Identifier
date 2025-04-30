package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgvr extends zzhbo implements zzhdf {
    private static final zzgvr zza;
    private static volatile zzhdm zzb;

    static {
        zzgvr zzgvrVar = new zzgvr();
        zza = zzgvrVar;
        zzhbo.zzca(zzgvr.class, zzgvrVar);
    }

    private zzgvr() {
    }

    public static zzgvr zzc() {
        return zza;
    }

    public static zzgvr zzd(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
        return (zzgvr) zzhbo.zzbr(zza, zzhacVar, zzhayVar);
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
                return zzhbo.zzbR(zza, "\u0000\u0000", null);
            case NEW_MUTABLE_INSTANCE:
                return new zzgvr();
            case NEW_BUILDER:
                return new zzgvq(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzgvr.class) {
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
