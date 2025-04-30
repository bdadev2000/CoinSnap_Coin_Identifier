package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhhd extends zzhbo implements zzhdf {
    private static final zzhhd zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private zzhac zzd;
    private zzhac zze;
    private byte zzf = 2;

    static {
        zzhhd zzhhdVar = new zzhhd();
        zza = zzhhdVar;
        zzhbo.zzca(zzhhd.class, zzhhdVar);
    }

    private zzhhd() {
        zzhac zzhacVar = zzhac.zzb;
        this.zzd = zzhacVar;
        this.zze = zzhacVar;
    }

    public static zzhhc zzc() {
        return (zzhhc) zza.zzaZ();
    }

    public static /* synthetic */ zzhhd zze() {
        return zza;
    }

    public static /* synthetic */ void zzf(zzhhd zzhhdVar, zzhac zzhacVar) {
        zzhhdVar.zzc |= 1;
        zzhhdVar.zzd = zzhacVar;
    }

    public static /* synthetic */ void zzg(zzhhd zzhhdVar, zzhac zzhacVar) {
        zzhhdVar.zzc |= 2;
        zzhhdVar.zze = zzhacVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        byte b;
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzhfr zzhfrVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzf);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                } else {
                    b = 1;
                }
                this.zzf = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbo.zzbR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhhd();
            case NEW_BUILDER:
                return new zzhhc(zzhfrVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzhhd.class) {
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
