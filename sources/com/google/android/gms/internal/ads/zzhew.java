package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhew extends zzgyx implements zzhaj {
    private static final zzhew zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private int zzd;
    private int zzg;
    private String zze = "";
    private zzgzf zzf = zzgyx.zzbG();
    private zzgzj zzh = zzgyx.zzbK();
    private zzgxp zzi = zzgxp.zzb;

    static {
        zzhew zzhewVar = new zzhew();
        zza = zzhewVar;
        zzgyx.zzcb(zzhew.class, zzhewVar);
    }

    private zzhew() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", zzheu.class, "zzi"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhew();
            case NEW_BUILDER:
                return new zzhev(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzhew.class) {
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
