package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhdd extends zzgyx implements zzhaj {
    private static final zzhdd zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;

    static {
        zzhdd zzhddVar = new zzhdd();
        zza = zzhddVar;
        zzgyx.zzcb(zzhdd.class, zzhddVar);
    }

    private zzhdd() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဂ\u0003", new Object[]{"zzc", "zzd", zzhdc.zza, "zze", zzhda.zza, "zzf", "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhdd();
            case NEW_BUILDER:
                return new zzhdb(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzhdd.class) {
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
