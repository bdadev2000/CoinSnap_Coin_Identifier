package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhez extends zzhbe implements zzhcq {
    private static final zzhez zza;
    private static volatile zzhcx zzb;
    private int zzc;
    private int zzd;
    private long zze;
    private zzgzs zzf = zzgzs.zzb;

    static {
        zzhez zzhezVar = new zzhez();
        zza = zzhezVar;
        zzhbe.zzcb(zzhez.class, zzhezVar);
    }

    private zzhez() {
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", zzhey.zza, "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhez();
            case NEW_BUILDER:
                return new zzhex(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzhez.class) {
                        try {
                            zzhcxVar = zzb;
                            if (zzhcxVar == null) {
                                zzhcxVar = new zzhaz(zza);
                                zzb = zzhcxVar;
                            }
                        } finally {
                        }
                    }
                }
                return zzhcxVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
