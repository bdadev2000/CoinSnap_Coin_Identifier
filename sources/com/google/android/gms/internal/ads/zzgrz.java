package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgrz extends zzgyx implements zzhaj {
    private static final zzgrz zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private int zzd;
    private zzgsf zze;
    private zzgtq zzf;

    static {
        zzgrz zzgrzVar = new zzgrz();
        zza = zzgrzVar;
        zzgyx.zzcb(zzgrz.class, zzgrzVar);
    }

    private zzgrz() {
    }

    public static zzgrx zzb() {
        return (zzgrx) zza.zzaZ();
    }

    public static zzgrz zzd(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
        return (zzgrz) zzgyx.zzbr(zza, zzgxpVar, zzgyhVar);
    }

    public static zzhaq zzh() {
        return zza.zzbN();
    }

    public static /* synthetic */ void zzi(zzgrz zzgrzVar, zzgsf zzgsfVar) {
        zzgsfVar.getClass();
        zzgrzVar.zze = zzgsfVar;
        zzgrzVar.zzc |= 1;
    }

    public static /* synthetic */ void zzj(zzgrz zzgrzVar, zzgtq zzgtqVar) {
        zzgtqVar.getClass();
        zzgrzVar.zzf = zzgtqVar;
        zzgrzVar.zzc |= 2;
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
                return zzgyx.zzbS(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgrz();
            case NEW_BUILDER:
                return new zzgrx(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzgrz.class) {
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

    public final zzgsf zzf() {
        zzgsf zzgsfVar = this.zze;
        return zzgsfVar == null ? zzgsf.zzd() : zzgsfVar;
    }

    public final zzgtq zzg() {
        zzgtq zzgtqVar = this.zzf;
        return zzgtqVar == null ? zzgtq.zzd() : zzgtqVar;
    }
}
