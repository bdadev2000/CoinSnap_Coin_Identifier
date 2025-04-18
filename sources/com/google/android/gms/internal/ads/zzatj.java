package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzatj extends zzhbe implements zzhcq {
    private static final zzatj zza;
    private static volatile zzhcx zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private boolean zzf;
    private zzhbm zzg = zzhbe.zzbG();
    private long zzh;

    static {
        zzatj zzatjVar = new zzatj();
        zza = zzatjVar;
        zzhbe.zzcb(zzatj.class, zzatjVar);
    }

    private zzatj() {
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        zzasl zzaslVar = null;
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
            case NEW_MUTABLE_INSTANCE:
                return new zzatj();
            case NEW_BUILDER:
                return new zzati(zzaslVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzatj.class) {
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
