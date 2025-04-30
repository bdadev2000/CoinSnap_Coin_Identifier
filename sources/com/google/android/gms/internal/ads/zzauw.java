package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzauw extends zzhbo implements zzhdf {
    private static final zzauw zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private zzhac zzd;
    private zzhac zze;
    private zzhac zzf;
    private zzhac zzg;

    static {
        zzauw zzauwVar = new zzauw();
        zza = zzauwVar;
        zzhbo.zzca(zzauw.class, zzauwVar);
    }

    private zzauw() {
        zzhac zzhacVar = zzhac.zzb;
        this.zzd = zzhacVar;
        this.zze = zzhacVar;
        this.zzf = zzhacVar;
        this.zzg = zzhacVar;
    }

    public static zzauv zza() {
        return (zzauv) zza.zzaZ();
    }

    public static /* synthetic */ zzauw zzc() {
        return zza;
    }

    public static zzauw zzd(byte[] bArr, zzhay zzhayVar) throws zzhcd {
        return (zzauw) zzhbo.zzbx(zza, bArr, zzhayVar);
    }

    public static /* synthetic */ void zzi(zzauw zzauwVar, zzhac zzhacVar) {
        zzauwVar.zzc |= 1;
        zzauwVar.zzd = zzhacVar;
    }

    public static /* synthetic */ void zzj(zzauw zzauwVar, zzhac zzhacVar) {
        zzauwVar.zzc |= 2;
        zzauwVar.zze = zzhacVar;
    }

    public static /* synthetic */ void zzk(zzauw zzauwVar, zzhac zzhacVar) {
        zzauwVar.zzc |= 4;
        zzauwVar.zzf = zzhacVar;
    }

    public static /* synthetic */ void zzl(zzauw zzauwVar, zzhac zzhacVar) {
        zzauwVar.zzc |= 8;
        zzauwVar.zzg = zzhacVar;
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
                return zzhbo.zzbR(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new zzauw();
            case NEW_BUILDER:
                return new zzauv(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzauw.class) {
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

    public final zzhac zze() {
        return this.zzd;
    }

    public final zzhac zzf() {
        return this.zze;
    }

    public final zzhac zzg() {
        return this.zzg;
    }

    public final zzhac zzh() {
        return this.zzf;
    }
}
