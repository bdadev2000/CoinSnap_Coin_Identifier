package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhhb extends zzhbo implements zzhdf {
    private static final zzhhb zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;

    static {
        zzhhb zzhhbVar = new zzhhb();
        zza = zzhhbVar;
        zzhbo.zzca(zzhhb.class, zzhhbVar);
    }

    private zzhhb() {
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
                return zzhbo.zzbR(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဂ\u0003", new Object[]{"zzc", "zzd", zzhgz.zza, "zze", zzhgv.zza, "zzf", "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhhb();
            case NEW_BUILDER:
                return new zzhgx(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzhhb.class) {
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
