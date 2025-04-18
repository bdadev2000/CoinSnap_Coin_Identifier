package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzguu extends zzgyx implements zzhaj {
    private static final zzguu zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private int zzd;
    private zzgux zze;

    static {
        zzguu zzguuVar = new zzguu();
        zza = zzguuVar;
        zzgyx.zzcb(zzguu.class, zzguuVar);
    }

    private zzguu() {
    }

    public static zzgus zzb() {
        return (zzgus) zza.zzaZ();
    }

    public static zzguu zzd(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
        return (zzguu) zzgyx.zzbr(zza, zzgxpVar, zzgyhVar);
    }

    public static zzhaq zzg() {
        return zza.zzbN();
    }

    public static /* synthetic */ void zzh(zzguu zzguuVar, zzgux zzguxVar) {
        zzguxVar.getClass();
        zzguuVar.zze = zzguxVar;
        zzguuVar.zzc |= 1;
    }

    public final int zza() {
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
                return zzgyx.zzbS(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzguu();
            case NEW_BUILDER:
                return new zzgus(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzguu.class) {
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

    public final zzgux zzf() {
        zzgux zzguxVar = this.zze;
        return zzguxVar == null ? zzgux.zzc() : zzguxVar;
    }
}
