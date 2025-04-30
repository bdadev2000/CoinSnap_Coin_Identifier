package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhhr extends zzhbo implements zzhdf {
    private static final zzhhr zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        zzhhr zzhhrVar = new zzhhr();
        zza = zzhhrVar;
        zzhbo.zzca(zzhhr.class, zzhhrVar);
    }

    private zzhhr() {
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
                zzhbu zzhbuVar = zzhho.zza;
                return zzhbo.zzbR(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002", new Object[]{"zzc", "zzd", zzhbuVar, "zze", "zzf", zzhbuVar});
            case NEW_MUTABLE_INSTANCE:
                return new zzhhr();
            case NEW_BUILDER:
                return new zzhhq(zzhfrVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzhhr.class) {
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
