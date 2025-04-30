package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhhl extends zzhbo implements zzhdf {
    private static final zzhhl zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private zzhhk zzd;
    private zzhac zzf;
    private zzhac zzg;
    private int zzh;
    private zzhac zzi;
    private byte zzj = 2;
    private zzhca zze = zzhbo.zzbK();

    static {
        zzhhl zzhhlVar = new zzhhl();
        zza = zzhhlVar;
        zzhbo.zzca(zzhhl.class, zzhhlVar);
    }

    private zzhhl() {
        zzhac zzhacVar = zzhac.zzb;
        this.zzf = zzhacVar;
        this.zzg = zzhacVar;
        this.zzi = zzhacVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        byte b;
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzj);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                } else {
                    b = 1;
                }
                this.zzj = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbo.zzbR(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzc", "zzd", "zze", zzhhd.class, "zzf", "zzg", "zzh", "zzi"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhhl();
            case NEW_BUILDER:
                return new zzhhi(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzhhl.class) {
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
