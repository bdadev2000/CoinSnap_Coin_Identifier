package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhgd extends zzhbe implements zzhcq {
    private static final zzhgd zza;
    private static volatile zzhcx zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        zzhgd zzhgdVar = new zzhgd();
        zza = zzhgdVar;
        zzhbe.zzcb(zzhgd.class, zzhgdVar);
    }

    private zzhgd() {
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        zzhev zzhevVar = null;
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                zzhbk zzhbkVar = zzhgb.zza;
                return zzhbe.zzbS(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002", new Object[]{"zzc", "zzd", zzhbkVar, "zze", "zzf", zzhbkVar});
            case NEW_MUTABLE_INSTANCE:
                return new zzhgd();
            case NEW_BUILDER:
                return new zzhgc(zzhevVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzhgd.class) {
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
