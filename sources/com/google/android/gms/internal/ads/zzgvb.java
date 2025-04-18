package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgvb extends zzhbe implements zzhcq {
    private static final zzgvb zza;
    private static volatile zzhcx zzb;
    private int zzc;
    private int zzd;

    static {
        zzgvb zzgvbVar = new zzgvb();
        zza = zzgvbVar;
        zzhbe.zzcb(zzgvb.class, zzgvbVar);
    }

    private zzgvb() {
    }

    public static zzgva zzd() {
        return (zzgva) zza.zzaZ();
    }

    public static zzgvb zzf(zzgzs zzgzsVar, zzhao zzhaoVar) throws zzhbt {
        return (zzgvb) zzhbe.zzbr(zza, zzgzsVar, zzhaoVar);
    }

    public final int zza() {
        return this.zzc;
    }

    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zza, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzc", "zzd"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgvb();
            case NEW_BUILDER:
                return new zzgva(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzgvb.class) {
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
