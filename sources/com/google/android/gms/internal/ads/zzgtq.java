package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgtq extends zzgyx implements zzhaj {
    private static final zzgtq zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private int zzd;
    private zzgtw zze;
    private zzgxp zzf = zzgxp.zzb;

    static {
        zzgtq zzgtqVar = new zzgtq();
        zza = zzgtqVar;
        zzgyx.zzcb(zzgtq.class, zzgtqVar);
    }

    private zzgtq() {
    }

    public static zzgto zzb() {
        return (zzgto) zza.zzaZ();
    }

    public static zzgtq zzd() {
        return zza;
    }

    public static zzgtq zzf(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
        return (zzgtq) zzgyx.zzbr(zza, zzgxpVar, zzgyhVar);
    }

    public static zzhaq zzi() {
        return zza.zzbN();
    }

    public static /* synthetic */ void zzk(zzgtq zzgtqVar, zzgtw zzgtwVar) {
        zzgtwVar.getClass();
        zzgtqVar.zze = zzgtwVar;
        zzgtqVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzgtp zzgtpVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgtq();
            case NEW_BUILDER:
                return new zzgto(zzgtpVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzgtq.class) {
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

    public final zzgtw zzg() {
        zzgtw zzgtwVar = this.zze;
        return zzgtwVar == null ? zzgtw.zzf() : zzgtwVar;
    }

    public final zzgxp zzh() {
        return this.zzf;
    }
}
