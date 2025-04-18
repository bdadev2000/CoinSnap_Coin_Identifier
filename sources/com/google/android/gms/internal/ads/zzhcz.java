package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhcz extends zzgyx implements zzhaj {
    private static final zzhcz zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private zzhcy zze;
    private long zzf;
    private String zzd = "";
    private String zzg = "";

    static {
        zzhcz zzhczVar = new zzhcz();
        zza = zzhczVar;
        zzgyx.zzcb(zzhcz.class, zzhczVar);
    }

    private zzhcz() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhcz();
            case NEW_BUILDER:
                return new zzhcw(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzhcz.class) {
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
