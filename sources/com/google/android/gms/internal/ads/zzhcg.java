package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhcg extends zzgyx implements zzhaj {
    private static final zzhcg zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private long zzd;
    private long zze;

    static {
        zzhcg zzhcgVar = new zzhcg();
        zza = zzhcgVar;
        zzgyx.zzcb(zzhcg.class, zzhcgVar);
    }

    private zzhcg() {
    }

    public static zzhcf zzc() {
        return (zzhcf) zza.zzaZ();
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzhcj zzhcjVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhcg();
            case NEW_BUILDER:
                return new zzhcf(zzhcjVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzhcg.class) {
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
