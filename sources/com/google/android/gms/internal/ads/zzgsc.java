package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgsc extends zzgyx implements zzhaj {
    private static final zzgsc zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private zzgsi zzd;
    private zzgtt zze;

    static {
        zzgsc zzgscVar = new zzgsc();
        zza = zzgscVar;
        zzgyx.zzcb(zzgsc.class, zzgscVar);
    }

    private zzgsc() {
    }

    public static zzgsa zza() {
        return (zzgsa) zza.zzaZ();
    }

    public static zzgsc zzc(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
        return (zzgsc) zzgyx.zzbr(zza, zzgxpVar, zzgyhVar);
    }

    public static /* synthetic */ void zzg(zzgsc zzgscVar, zzgsi zzgsiVar) {
        zzgsiVar.getClass();
        zzgscVar.zzd = zzgsiVar;
        zzgscVar.zzc |= 1;
    }

    public static /* synthetic */ void zzh(zzgsc zzgscVar, zzgtt zzgttVar) {
        zzgttVar.getClass();
        zzgscVar.zze = zzgttVar;
        zzgscVar.zzc |= 2;
    }

    public final zzgsi zzd() {
        zzgsi zzgsiVar = this.zzd;
        return zzgsiVar == null ? zzgsi.zzd() : zzgsiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgsc();
            case NEW_BUILDER:
                return new zzgsa(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzgsc.class) {
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

    public final zzgtt zzf() {
        zzgtt zzgttVar = this.zze;
        return zzgttVar == null ? zzgtt.zzf() : zzgttVar;
    }
}
