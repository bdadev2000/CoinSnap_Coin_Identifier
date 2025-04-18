package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgtt extends zzgyx implements zzhaj {
    private static final zzgtt zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private zzgtw zzd;
    private int zze;
    private int zzf;

    static {
        zzgtt zzgttVar = new zzgtt();
        zza = zzgttVar;
        zzgyx.zzcb(zzgtt.class, zzgttVar);
    }

    private zzgtt() {
    }

    public static zzgtr zzc() {
        return (zzgtr) zza.zzaZ();
    }

    public static zzgtt zzf() {
        return zza;
    }

    public static zzgtt zzg(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
        return (zzgtt) zzgyx.zzbr(zza, zzgxpVar, zzgyhVar);
    }

    public static /* synthetic */ void zzj(zzgtt zzgttVar, zzgtw zzgtwVar) {
        zzgtwVar.getClass();
        zzgttVar.zzd = zzgtwVar;
        zzgttVar.zzc |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgtt();
            case NEW_BUILDER:
                return new zzgtr(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzgtt.class) {
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

    public final zzgtw zzh() {
        zzgtw zzgtwVar = this.zzd;
        return zzgtwVar == null ? zzgtw.zzf() : zzgtwVar;
    }
}
