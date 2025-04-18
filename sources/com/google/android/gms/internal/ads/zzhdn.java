package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhdn extends zzgyx implements zzhaj {
    private static final zzhdn zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private zzhdm zzd;
    private zzgxp zzf;
    private zzgxp zzg;
    private int zzh;
    private zzgxp zzi;
    private byte zzj = 2;
    private zzgzj zze = zzgyx.zzbK();

    static {
        zzhdn zzhdnVar = new zzhdn();
        zza = zzhdnVar;
        zzgyx.zzcb(zzhdn.class, zzhdnVar);
    }

    private zzhdn() {
        zzgxp zzgxpVar = zzgxp.zzb;
        this.zzf = zzgxpVar;
        this.zzg = zzgxpVar;
        this.zzi = zzgxpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        byte b3 = 1;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzj);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b3 = 0;
                }
                this.zzj = b3;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzc", "zzd", "zze", zzhdf.class, "zzf", "zzg", "zzh", "zzi"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhdn();
            case NEW_BUILDER:
                return new zzhdk(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzhdn.class) {
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
