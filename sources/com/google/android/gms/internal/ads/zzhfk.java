package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhfk extends zzhbe implements zzhcq {
    private static final zzhfk zza;
    private static volatile zzhcx zzb;
    private int zzc;
    private zzgzs zzd = zzgzs.zzb;

    static {
        zzhfk zzhfkVar = new zzhfk();
        zza = zzhfkVar;
        zzhbe.zzcb(zzhfk.class, zzhfkVar);
    }

    private zzhfk() {
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"zzc", "zzd"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhfk();
            case NEW_BUILDER:
                return new zzhfj(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzhfk.class) {
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
