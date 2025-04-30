package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhhk extends zzhbo implements zzhdf {
    private static final zzhhk zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;
    private zzhac zze;
    private zzhac zzf;

    static {
        zzhhk zzhhkVar = new zzhhk();
        zza = zzhhkVar;
        zzhbo.zzca(zzhhk.class, zzhhkVar);
    }

    private zzhhk() {
        zzhac zzhacVar = zzhac.zzb;
        this.zze = zzhacVar;
        this.zzf = zzhacVar;
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
                return zzhbo.zzbR(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhhk();
            case NEW_BUILDER:
                return new zzhhj(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzhhk.class) {
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
