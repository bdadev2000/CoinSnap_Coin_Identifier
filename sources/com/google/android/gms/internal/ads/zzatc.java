package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzatc extends zzhbe implements zzhcq {
    private static final zzatc zza;
    private static volatile zzhcx zzb;
    private int zzc;
    private long zzd = -1;
    private int zze = 1000;

    static {
        zzatc zzatcVar = new zzatc();
        zza = zzatcVar;
        zzhbe.zzcb(zzatc.class, zzatcVar);
    }

    private zzatc() {
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
                return zzhbe.zzbS(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zzc", "zzd", "zze", zzatn.zza});
            case NEW_MUTABLE_INSTANCE:
                return new zzatc();
            case NEW_BUILDER:
                return new zzatb(zzaslVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzatc.class) {
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
