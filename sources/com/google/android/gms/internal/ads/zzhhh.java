package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhhh extends zzhbo implements zzhdf {
    private static final zzhhh zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private zzhhg zzd;
    private zzhac zzf;
    private zzhac zzg;
    private int zzh;
    private byte zzi = 2;
    private zzhca zze = zzhbo.zzbK();

    static {
        zzhhh zzhhhVar = new zzhhh();
        zza = zzhhhVar;
        zzhbo.zzca(zzhhh.class, zzhhhVar);
    }

    private zzhhh() {
        zzhac zzhacVar = zzhac.zzb;
        this.zzf = zzhacVar;
        this.zzg = zzhacVar;
    }

    public static zzhhe zzc() {
        return (zzhhe) zza.zzaZ();
    }

    public static /* synthetic */ void zzf(zzhhh zzhhhVar, zzhhd zzhhdVar) {
        zzhhdVar.getClass();
        zzhca zzhcaVar = zzhhhVar.zze;
        if (!zzhcaVar.zzc()) {
            zzhhhVar.zze = zzhbo.zzbL(zzhcaVar);
        }
        zzhhhVar.zze.add(zzhhdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        byte b;
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzi);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                } else {
                    b = 1;
                }
                this.zzi = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbo.zzbR(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzc", "zzd", "zze", zzhhd.class, "zzf", "zzg", "zzh"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhhh();
            case NEW_BUILDER:
                return new zzhhe(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzhhh.class) {
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
