package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhfy extends zzhbe implements zzhcq {
    private static final zzhfy zza;
    private static volatile zzhcx zzb;
    private int zzc;
    private int zzd;
    private zzgzs zze;
    private zzgzs zzf;

    static {
        zzhfy zzhfyVar = new zzhfy();
        zza = zzhfyVar;
        zzhbe.zzcb(zzhfy.class, zzhfyVar);
    }

    private zzhfy() {
        zzgzs zzgzsVar = zzgzs.zzb;
        this.zze = zzgzsVar;
        this.zzf = zzgzsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhfy();
            case NEW_BUILDER:
                return new zzhfx(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzhfy.class) {
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
