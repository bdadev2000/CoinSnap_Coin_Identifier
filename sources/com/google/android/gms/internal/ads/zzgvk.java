package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgvk extends zzhbe implements zzhcq {
    private static final zzgvk zza;
    private static volatile zzhcx zzb;
    private int zzc;
    private zzgzs zzd = zzgzs.zzb;

    static {
        zzgvk zzgvkVar = new zzgvk();
        zza = zzgvkVar;
        zzhbe.zzcb(zzgvk.class, zzgvkVar);
    }

    private zzgvk() {
    }

    public static zzgvj zzc() {
        return (zzgvj) zza.zzaZ();
    }

    public static zzgvk zze(zzgzs zzgzsVar, zzhao zzhaoVar) throws zzhbt {
        return (zzgvk) zzhbe.zzbr(zza, zzgzsVar, zzhaoVar);
    }

    public static zzhcx zzg() {
        return zza.zzbN();
    }

    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzc", "zzd"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgvk();
            case NEW_BUILDER:
                return new zzgvj(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzgvk.class) {
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

    public final zzgzs zzf() {
        return this.zzd;
    }
}
