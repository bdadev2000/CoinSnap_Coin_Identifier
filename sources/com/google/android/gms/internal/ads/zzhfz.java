package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhfz extends zzhbe implements zzhcq {
    private static final zzhfz zza;
    private static volatile zzhcx zzb;
    private int zzc;
    private zzhfy zzd;
    private zzgzs zzf;
    private zzgzs zzg;
    private int zzh;
    private zzgzs zzi;
    private byte zzj = 2;
    private zzhbq zze = zzhbe.zzbK();

    static {
        zzhfz zzhfzVar = new zzhfz();
        zza = zzhfzVar;
        zzhbe.zzcb(zzhfz.class, zzhfzVar);
    }

    private zzhfz() {
        zzgzs zzgzsVar = zzgzs.zzb;
        this.zzf = zzgzsVar;
        this.zzg = zzgzsVar;
        this.zzi = zzgzsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzj);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzj = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzc", "zzd", "zze", zzhfr.class, "zzf", "zzg", "zzh", "zzi"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhfz();
            case NEW_BUILDER:
                return new zzhfw(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzhfz.class) {
                        try {
                            zzhcxVar = zzb;
                            if (zzhcxVar == null) {
                                zzhcxVar = new zzhaz(zza);
                                zzb = zzhcxVar;
                            }
                        } finally {
                        }
                    }
                }
                return zzhcxVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
