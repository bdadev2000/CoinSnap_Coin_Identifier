package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzheo extends zzgyx implements zzhaj {
    private static final zzheo zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private String zzd = "";
    private zzgxp zze = zzgxp.zzb;

    static {
        zzheo zzheoVar = new zzheo();
        zza = zzheoVar;
        zzgyx.zzcb(zzheo.class, zzheoVar);
    }

    private zzheo() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzheo();
            case NEW_BUILDER:
                return new zzhen(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzheo.class) {
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
