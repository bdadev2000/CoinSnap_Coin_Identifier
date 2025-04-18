package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgtg extends zzgyx implements zzhaj {
    private static final zzgtg zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private int zzd;

    static {
        zzgtg zzgtgVar = new zzgtg();
        zza = zzgtgVar;
        zzgyx.zzcb(zzgtg.class, zzgtgVar);
    }

    private zzgtg() {
    }

    public static zzgte zzc() {
        return (zzgte) zza.zzaZ();
    }

    public static zzgtg zzf(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
        return (zzgtg) zzgyx.zzbr(zza, zzgxpVar, zzgyhVar);
    }

    public final int zza() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzd", "zzc"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgtg();
            case NEW_BUILDER:
                return new zzgte(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzgtg.class) {
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
