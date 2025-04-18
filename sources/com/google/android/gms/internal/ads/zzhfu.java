package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhfu extends zzhbe implements zzhcq {
    private static final zzhfu zza;
    private static volatile zzhcx zzb;
    private int zzc;
    private zzgzs zzd;
    private zzgzs zze;
    private zzgzs zzf;

    static {
        zzhfu zzhfuVar = new zzhfu();
        zza = zzhfuVar;
        zzhbe.zzcb(zzhfu.class, zzhfuVar);
    }

    private zzhfu() {
        zzgzs zzgzsVar = zzgzs.zzb;
        this.zzd = zzgzsVar;
        this.zze = zzgzsVar;
        this.zzf = zzgzsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhfu();
            case NEW_BUILDER:
                return new zzhft(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzhfu.class) {
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
