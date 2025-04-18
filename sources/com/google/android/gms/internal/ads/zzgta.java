package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgta extends zzgyx implements zzhaj {
    private static final zzgta zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private int zzd;

    static {
        zzgta zzgtaVar = new zzgta();
        zza = zzgtaVar;
        zzgyx.zzcb(zzgta.class, zzgtaVar);
    }

    private zzgta() {
    }

    public static zzgsy zzc() {
        return (zzgsy) zza.zzaZ();
    }

    public static zzgta zzf(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
        return (zzgta) zzgyx.zzbr(zza, zzgxpVar, zzgyhVar);
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
                return zzgyx.zzbS(zza, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzc", "zzd"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgta();
            case NEW_BUILDER:
                return new zzgsy(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzgta.class) {
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
