package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhhd extends zzhbe implements zzhcq {
    private static final zzhhd zza;
    private static volatile zzhcx zzb;
    private int zzc;
    private int zzd;
    private String zze = "";

    static {
        zzhhd zzhhdVar = new zzhhd();
        zza = zzhhdVar;
        zzhbe.zzcb(zzhhd.class, zzhhdVar);
    }

    private zzhhd() {
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
                return zzhbe.zzbS(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", zzhhc.zza, "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhhd();
            case NEW_BUILDER:
                return new zzhhb(zzhevVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzhhd.class) {
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
