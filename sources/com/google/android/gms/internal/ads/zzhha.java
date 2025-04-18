package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhha extends zzhbe implements zzhcq {
    private static final zzhha zza;
    private static volatile zzhcx zzb;
    private int zzc;
    private String zzd = "";
    private zzgzs zze = zzgzs.zzb;

    static {
        zzhha zzhhaVar = new zzhha();
        zza = zzhhaVar;
        zzhbe.zzcb(zzhha.class, zzhhaVar);
    }

    private zzhha() {
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhha();
            case NEW_BUILDER:
                return new zzhgz(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzhha.class) {
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
