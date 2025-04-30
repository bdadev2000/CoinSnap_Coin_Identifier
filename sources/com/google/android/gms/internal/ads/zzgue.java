package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgue extends zzhbo implements zzhdf {
    private static final zzgue zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;
    private zzguk zze;
    private zzgvw zzf;

    static {
        zzgue zzgueVar = new zzgue();
        zza = zzgueVar;
        zzhbo.zzca(zzgue.class, zzgueVar);
    }

    private zzgue() {
    }

    public static zzgud zzc() {
        return (zzgud) zza.zzaZ();
    }

    public static zzgue zze(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
        return (zzgue) zzhbo.zzbr(zza, zzhacVar, zzhayVar);
    }

    public static zzhdm zzh() {
        return zza.zzbM();
    }

    public static /* synthetic */ void zzi(zzgue zzgueVar, zzguk zzgukVar) {
        zzgukVar.getClass();
        zzgueVar.zze = zzgukVar;
        zzgueVar.zzc |= 1;
    }

    public static /* synthetic */ void zzj(zzgue zzgueVar, zzgvw zzgvwVar) {
        zzgvwVar.getClass();
        zzgueVar.zzf = zzgvwVar;
        zzgueVar.zzc |= 2;
    }

    public final int zza() {
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
                return zzhbo.zzbR(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgue();
            case NEW_BUILDER:
                return new zzgud(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzgue.class) {
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

    public final zzguk zzf() {
        zzguk zzgukVar = this.zze;
        if (zzgukVar == null) {
            return zzguk.zze();
        }
        return zzgukVar;
    }

    public final zzgvw zzg() {
        zzgvw zzgvwVar = this.zzf;
        if (zzgvwVar == null) {
            return zzgvw.zze();
        }
        return zzgvwVar;
    }
}
