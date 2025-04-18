package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgvk extends zzgyx implements zzhaj {
    private static final zzgvk zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private zzgxp zzd = zzgxp.zzb;

    static {
        zzgvk zzgvkVar = new zzgvk();
        zza = zzgvkVar;
        zzgyx.zzcb(zzgvk.class, zzgvkVar);
    }

    private zzgvk() {
    }

    public static zzgvi zzb() {
        return (zzgvi) zza.zzaZ();
    }

    public static zzgvk zzd(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
        return (zzgvk) zzgyx.zzbr(zza, zzgxpVar, zzgyhVar);
    }

    public static zzhaq zzg() {
        return zza.zzbN();
    }

    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzc", "zzd"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgvk();
            case NEW_BUILDER:
                return new zzgvi(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzgvk.class) {
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

    public final zzgxp zzf() {
        return this.zzd;
    }
}
