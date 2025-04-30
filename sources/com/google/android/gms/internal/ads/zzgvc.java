package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgvc extends zzhbo implements zzhdf {
    private static final zzgvc zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private zzhac zzd = zzhac.zzb;

    static {
        zzgvc zzgvcVar = new zzgvc();
        zza = zzgvcVar;
        zzhbo.zzca(zzgvc.class, zzgvcVar);
    }

    private zzgvc() {
    }

    public static zzgvb zzc() {
        return (zzgvb) zza.zzaZ();
    }

    public static zzgvc zze(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
        return (zzgvc) zzhbo.zzbr(zza, zzhacVar, zzhayVar);
    }

    public static zzhdm zzg() {
        return zza.zzbM();
    }

    public final int zza() {
        return this.zzc;
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
                return zzhbo.zzbR(zza, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzc", "zzd"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgvc();
            case NEW_BUILDER:
                return new zzgvb(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzgvc.class) {
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

    public final zzhac zzf() {
        return this.zzd;
    }
}
