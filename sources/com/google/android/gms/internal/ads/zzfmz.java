package com.google.android.gms.internal.ads;

/* loaded from: classes4.dex */
public final class zzfmz extends zzhbe implements zzhcq {
    private static final zzfmz zza;
    private static volatile zzhcx zzb;
    private zzhbq zzc = zzhbe.zzbK();

    static {
        zzfmz zzfmzVar = new zzfmz();
        zza = zzfmzVar;
        zzhbe.zzcb(zzfmz.class, zzfmzVar);
    }

    private zzfmz() {
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zza, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", zzfmw.class});
            case NEW_MUTABLE_INSTANCE:
                return new zzfmz();
            case NEW_BUILDER:
                return new zzfmy(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzfmz.class) {
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
