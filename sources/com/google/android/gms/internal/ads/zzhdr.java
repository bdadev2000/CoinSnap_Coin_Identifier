package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhdr extends zzgyx implements zzhaj {
    private static final zzhdr zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        zzhdr zzhdrVar = new zzhdr();
        zza = zzhdrVar;
        zzgyx.zzcb(zzhdr.class, zzhdrVar);
    }

    private zzhdr() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzhfd zzhfdVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                zzgzd zzgzdVar = zzhdp.zza;
                return zzgyx.zzbS(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002", new Object[]{"zzc", "zzd", zzgzdVar, "zze", "zzf", zzgzdVar});
            case NEW_MUTABLE_INSTANCE:
                return new zzhdr();
            case NEW_BUILDER:
                return new zzhdq(zzhfdVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzhdr.class) {
                        zzhaqVar = zzb;
                        if (zzhaqVar == null) {
                            zzhaqVar = new zzgys(zza);
                            zzb = zzhaqVar;
                        }
                    }
                }
                return zzhaqVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
