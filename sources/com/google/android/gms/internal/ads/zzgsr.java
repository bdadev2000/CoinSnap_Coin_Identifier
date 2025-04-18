package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgsr extends zzgyx implements zzhaj {
    private static final zzgsr zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private zzgsu zzd;
    private int zze;

    static {
        zzgsr zzgsrVar = new zzgsr();
        zza = zzgsrVar;
        zzgyx.zzcb(zzgsr.class, zzgsrVar);
    }

    private zzgsr() {
    }

    public static zzgsp zzb() {
        return (zzgsp) zza.zzaZ();
    }

    public static zzgsr zzd(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
        return (zzgsr) zzgyx.zzbr(zza, zzgxpVar, zzgyhVar);
    }

    public static /* synthetic */ void zzh(zzgsr zzgsrVar, zzgsu zzgsuVar) {
        zzgsuVar.getClass();
        zzgsrVar.zzd = zzgsuVar;
        zzgsrVar.zzc |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgsr();
            case NEW_BUILDER:
                return new zzgsp(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzgsr.class) {
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

    public final zzgsu zzf() {
        zzgsu zzgsuVar = this.zzd;
        return zzgsuVar == null ? zzgsu.zzd() : zzgsuVar;
    }
}
