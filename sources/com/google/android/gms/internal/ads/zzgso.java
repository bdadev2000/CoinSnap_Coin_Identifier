package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgso extends zzgyx implements zzhaj {
    private static final zzgso zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private int zzd;
    private zzgsu zze;
    private zzgxp zzf = zzgxp.zzb;

    static {
        zzgso zzgsoVar = new zzgso();
        zza = zzgsoVar;
        zzgyx.zzcb(zzgso.class, zzgsoVar);
    }

    private zzgso() {
    }

    public static zzgsm zzb() {
        return (zzgsm) zza.zzaZ();
    }

    public static zzgso zzd(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
        return (zzgso) zzgyx.zzbr(zza, zzgxpVar, zzgyhVar);
    }

    public static zzhaq zzh() {
        return zza.zzbN();
    }

    public static /* synthetic */ void zzj(zzgso zzgsoVar, zzgsu zzgsuVar) {
        zzgsuVar.getClass();
        zzgsoVar.zze = zzgsuVar;
        zzgsoVar.zzc |= 1;
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
                return zzgyx.zzbS(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgso();
            case NEW_BUILDER:
                return new zzgsm(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzgso.class) {
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
        zzgsu zzgsuVar = this.zze;
        return zzgsuVar == null ? zzgsu.zzd() : zzgsuVar;
    }

    public final zzgxp zzg() {
        return this.zzf;
    }
}
