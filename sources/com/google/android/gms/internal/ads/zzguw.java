package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzguw extends zzhbo implements zzhdf {
    private static final zzguw zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private zzguz zzd;
    private int zze;

    static {
        zzguw zzguwVar = new zzguw();
        zza = zzguwVar;
        zzhbo.zzca(zzguw.class, zzguwVar);
    }

    private zzguw() {
    }

    public static zzguv zzc() {
        return (zzguv) zza.zzaZ();
    }

    public static zzguw zze(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
        return (zzguw) zzhbo.zzbr(zza, zzhacVar, zzhayVar);
    }

    public static /* synthetic */ void zzg(zzguw zzguwVar, zzguz zzguzVar) {
        zzguzVar.getClass();
        zzguwVar.zzd = zzguzVar;
        zzguwVar.zzc |= 1;
    }

    public final int zza() {
        return this.zze;
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
                return zzhbo.zzbR(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzguw();
            case NEW_BUILDER:
                return new zzguv(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzguw.class) {
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

    public final zzguz zzf() {
        zzguz zzguzVar = this.zzd;
        if (zzguzVar == null) {
            return zzguz.zze();
        }
        return zzguzVar;
    }
}
