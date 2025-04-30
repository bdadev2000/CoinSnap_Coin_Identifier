package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhjl extends zzhbo implements zzhdf {
    private static final zzhjl zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;
    private int zzg;
    private String zze = "";
    private zzhbw zzf = zzhbo.zzbG();
    private zzhca zzh = zzhbo.zzbK();
    private zzhac zzi = zzhac.zzb;

    static {
        zzhjl zzhjlVar = new zzhjl();
        zza = zzhjlVar;
        zzhbo.zzca(zzhjl.class, zzhjlVar);
    }

    private zzhjl() {
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
                return zzhbo.zzbR(zza, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", zzhjj.class, "zzi"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhjl();
            case NEW_BUILDER:
                return new zzhjk(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzhjl.class) {
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
