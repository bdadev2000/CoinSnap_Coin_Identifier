package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhcv extends zzgyx implements zzhaj {
    private static final zzhcv zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private String zzd = "";

    static {
        zzhcv zzhcvVar = new zzhcv();
        zza = zzhcvVar;
        zzgyx.zzcb(zzhcv.class, zzhcvVar);
    }

    private zzhcv() {
    }

    public static zzhcu zzc() {
        return (zzhcu) zza.zzaZ();
    }

    public static /* bridge */ /* synthetic */ zzhcv zzd() {
        return zza;
    }

    public static /* synthetic */ void zzf(zzhcv zzhcvVar, String str) {
        zzhcvVar.zzc |= 1;
        zzhcvVar.zzd = str;
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
                return zzgyx.zzbS(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzc", "zzd"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhcv();
            case NEW_BUILDER:
                return new zzhcu(zzhfdVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzhcv.class) {
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
