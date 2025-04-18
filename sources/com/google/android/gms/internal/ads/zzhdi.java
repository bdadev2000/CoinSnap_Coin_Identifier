package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhdi extends zzgyx implements zzhaj {
    private static final zzhdi zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private zzgxp zzd;
    private zzgxp zze;
    private zzgxp zzf;

    static {
        zzhdi zzhdiVar = new zzhdi();
        zza = zzhdiVar;
        zzgyx.zzcb(zzhdi.class, zzhdiVar);
    }

    private zzhdi() {
        zzgxp zzgxpVar = zzgxp.zzb;
        this.zzd = zzgxpVar;
        this.zze = zzgxpVar;
        this.zzf = zzgxpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhdi();
            case NEW_BUILDER:
                return new zzhdh(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzhdi.class) {
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
