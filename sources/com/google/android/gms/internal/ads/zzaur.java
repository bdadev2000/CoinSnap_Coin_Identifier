package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzaur extends zzhbo implements zzhdf {
    private static final zzaur zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;

    static {
        zzaur zzaurVar = new zzaur();
        zza = zzaurVar;
        zzhbo.zzca(zzaur.class, zzaurVar);
    }

    private zzaur() {
    }

    public static zzauq zza() {
        return (zzauq) zza.zzaZ();
    }

    public static /* synthetic */ void zzd(zzaur zzaurVar, long j7) {
        zzaurVar.zzc |= 1;
        zzaurVar.zzd = j7;
    }

    public static /* synthetic */ void zze(zzaur zzaurVar, long j7) {
        zzaurVar.zzc |= 4;
        zzaurVar.zzf = j7;
    }

    public static /* synthetic */ void zzf(zzaur zzaurVar, long j7) {
        zzaurVar.zzc |= 8;
        zzaurVar.zzg = j7;
    }

    public static /* synthetic */ void zzg(zzaur zzaurVar, long j7) {
        zzaurVar.zzc |= 16;
        zzaurVar.zzh = j7;
    }

    public static /* synthetic */ void zzh(zzaur zzaurVar, long j7) {
        zzaurVar.zzc |= 32;
        zzaurVar.zzi = j7;
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
                return zzhbo.zzbR(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case NEW_MUTABLE_INSTANCE:
                return new zzaur();
            case NEW_BUILDER:
                return new zzauq(zzatoVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzaur.class) {
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
