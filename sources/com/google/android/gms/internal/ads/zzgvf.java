package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgvf extends zzhbo implements zzhdf {
    private static final zzgvf zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;

    static {
        zzgvf zzgvfVar = new zzgvf();
        zza = zzgvfVar;
        zzhbo.zzca(zzgvf.class, zzgvfVar);
    }

    private zzgvf() {
    }

    public static zzgve zzd() {
        return (zzgve) zza.zzaZ();
    }

    public static zzgvf zzf(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
        return (zzgvf) zzhbo.zzbr(zza, zzhacVar, zzhayVar);
    }

    public final int zza() {
        return this.zzc;
    }

    public final int zzc() {
        return this.zzd;
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
                return zzhbo.zzbR(zza, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzc", "zzd"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgvf();
            case NEW_BUILDER:
                return new zzgve(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzgvf.class) {
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
