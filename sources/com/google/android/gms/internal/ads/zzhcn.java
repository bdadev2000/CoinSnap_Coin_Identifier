package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhcn extends zzgyx implements zzhaj {
    private static final zzhcn zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private int zzd;
    private long zze;
    private zzgxp zzf = zzgxp.zzb;

    static {
        zzhcn zzhcnVar = new zzhcn();
        zza = zzhcnVar;
        zzgyx.zzcb(zzhcn.class, zzhcnVar);
    }

    private zzhcn() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", zzhcm.zza, "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhcn();
            case NEW_BUILDER:
                return new zzhcl(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzhcn.class) {
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
