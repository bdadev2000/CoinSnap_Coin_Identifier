package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgvh extends zzhbe implements zzhcq {
    private static final zzgvh zza;
    private static volatile zzhcx zzb;
    private int zzc;
    private int zzd;

    static {
        zzgvh zzgvhVar = new zzgvh();
        zza = zzgvhVar;
        zzhbe.zzcb(zzgvh.class, zzgvhVar);
    }

    private zzgvh() {
    }

    public static zzgvg zzd() {
        return (zzgvg) zza.zzaZ();
    }

    public static zzgvh zzf(zzgzs zzgzsVar, zzhao zzhaoVar) throws zzhbt {
        return (zzgvh) zzhbe.zzbr(zza, zzgzsVar, zzhaoVar);
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
                return zzhbe.zzbS(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzd", "zzc"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgvh();
            case NEW_BUILDER:
                return new zzgvg(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzgvh.class) {
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
