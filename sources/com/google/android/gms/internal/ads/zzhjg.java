package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhjg extends zzhbo implements zzhdf {
    private static final zzhjg zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;
    private String zze = "";

    static {
        zzhjg zzhjgVar = new zzhjg();
        zza = zzhjgVar;
        zzhbo.zzca(zzhjg.class, zzhjgVar);
    }

    private zzhjg() {
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzhfr zzhfrVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbo.zzbR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", zzhje.zza, "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhjg();
            case NEW_BUILDER:
                return new zzhjc(zzhfrVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzhjg.class) {
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
