package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgvl extends zzhbo implements zzhdf {
    private static final zzgvl zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;

    static {
        zzgvl zzgvlVar = new zzgvl();
        zza = zzgvlVar;
        zzhbo.zzca(zzgvl.class, zzgvlVar);
    }

    private zzgvl() {
    }

    public static zzgvk zzd() {
        return (zzgvk) zza.zzaZ();
    }

    public static zzgvl zzf(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
        return (zzgvl) zzhbo.zzbr(zza, zzhacVar, zzhayVar);
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
                return zzhbo.zzbR(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzd", "zzc"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgvl();
            case NEW_BUILDER:
                return new zzgvk(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzgvl.class) {
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
