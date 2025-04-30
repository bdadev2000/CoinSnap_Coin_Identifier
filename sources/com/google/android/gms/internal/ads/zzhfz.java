package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhfz extends zzhbo implements zzhdf {
    private static final zzhfz zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;
    private long zze;
    private zzhac zzf = zzhac.zzb;

    static {
        zzhfz zzhfzVar = new zzhfz();
        zza = zzhfzVar;
        zzhbo.zzca(zzhfz.class, zzhfzVar);
    }

    private zzhfz() {
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
                return zzhbo.zzbR(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", zzhfx.zza, "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhfz();
            case NEW_BUILDER:
                return new zzhfv(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzhfz.class) {
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
