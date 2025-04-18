package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhes extends zzhbe implements zzhcq {
    private static final zzhes zza;
    private static volatile zzhcx zzb;
    private int zzc;
    private long zzd;
    private long zze;

    static {
        zzhes zzhesVar = new zzhes();
        zza = zzhesVar;
        zzhbe.zzcb(zzhes.class, zzhesVar);
    }

    private zzhes() {
    }

    public static zzher zzc() {
        return (zzher) zza.zzaZ();
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        zzheq zzheqVar = null;
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhes();
            case NEW_BUILDER:
                return new zzher(zzheqVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzhes.class) {
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
