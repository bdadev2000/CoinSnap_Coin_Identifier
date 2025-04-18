package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzasp extends zzhbe implements zzhcq {
    private static final zzasp zza;
    private static volatile zzhcx zzb;
    private int zzc;
    private int zzd;

    static {
        zzasp zzaspVar = new zzasp();
        zza = zzaspVar;
        zzhbe.zzcb(zzasp.class, zzaspVar);
    }

    private zzasp() {
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
                return zzhbe.zzbS(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzc", "zzd", zzass.zza});
            case NEW_MUTABLE_INSTANCE:
                return new zzasp();
            case NEW_BUILDER:
                return new zzaso(zzaslVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzasp.class) {
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
