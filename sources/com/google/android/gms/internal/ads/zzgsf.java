package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgsf extends zzgyx implements zzhaj {
    private static final zzgsf zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private int zzd;
    private zzgsl zze;
    private zzgxp zzf = zzgxp.zzb;

    static {
        zzgsf zzgsfVar = new zzgsf();
        zza = zzgsfVar;
        zzgyx.zzcb(zzgsf.class, zzgsfVar);
    }

    private zzgsf() {
    }

    public static zzgsd zzb() {
        return (zzgsd) zza.zzaZ();
    }

    public static zzgsf zzd() {
        return zza;
    }

    public static /* synthetic */ void zzi(zzgsf zzgsfVar, zzgsl zzgslVar) {
        zzgslVar.getClass();
        zzgsfVar.zze = zzgslVar;
        zzgsfVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzgse zzgseVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgsf();
            case NEW_BUILDER:
                return new zzgsd(zzgseVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzgsf.class) {
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

    public final zzgsl zzf() {
        zzgsl zzgslVar = this.zze;
        return zzgslVar == null ? zzgsl.zzd() : zzgslVar;
    }

    public final zzgxp zzg() {
        return this.zzf;
    }
}
