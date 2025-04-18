package com.google.android.gms.internal.ads;

@Deprecated
/* loaded from: classes3.dex */
public final class zzhds extends zzgyx implements zzhaj {
    private static final zzhds zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private int zzd;
    private zzhdr zze;
    private zzhdr zzf;

    static {
        zzhds zzhdsVar = new zzhds();
        zza = zzhdsVar;
        zzgyx.zzcb(zzhds.class, zzhdsVar);
    }

    private zzhds() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzc", "zzd", zzhdp.zza, "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhds();
            case NEW_BUILDER:
                return new zzhdo(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzhds.class) {
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
