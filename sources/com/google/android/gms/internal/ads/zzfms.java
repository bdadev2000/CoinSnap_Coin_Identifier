package com.google.android.gms.internal.ads;

/* loaded from: classes4.dex */
public final class zzfms extends zzhbe implements zzhcq {
    private static final zzfms zza;
    private static volatile zzhcx zzb;
    private String zzc = "";

    static {
        zzfms zzfmsVar = new zzfms();
        zza = zzfmsVar;
        zzhbe.zzcb(zzfms.class, zzfmsVar);
    }

    private zzfms() {
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        zzfmq zzfmqVar = null;
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zza, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzc"});
            case NEW_MUTABLE_INSTANCE:
                return new zzfms();
            case NEW_BUILDER:
                return new zzfmr(zzfmqVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzfms.class) {
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
