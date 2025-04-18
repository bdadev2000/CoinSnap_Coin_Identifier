package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzasz extends zzgyx implements zzhaj {
    private static final zzasz zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;

    static {
        zzasz zzaszVar = new zzasz();
        zza = zzaszVar;
        zzgyx.zzcb(zzasz.class, zzaszVar);
    }

    private zzasz() {
    }

    public static zzasy zza() {
        return (zzasy) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzasz zzaszVar, long j3) {
        zzaszVar.zzc |= 32;
        zzaszVar.zzi = j3;
    }

    public static /* synthetic */ void zzd(zzasz zzaszVar, long j3) {
        zzaszVar.zzc |= 4;
        zzaszVar.zzf = j3;
    }

    public static /* synthetic */ void zzf(zzasz zzaszVar, long j3) {
        zzaszVar.zzc |= 1;
        zzaszVar.zzd = j3;
    }

    public static /* synthetic */ void zzg(zzasz zzaszVar, long j3) {
        zzaszVar.zzc |= 8;
        zzaszVar.zzg = j3;
    }

    public static /* synthetic */ void zzh(zzasz zzaszVar, long j3) {
        zzaszVar.zzc |= 16;
        zzaszVar.zzh = j3;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzatq zzatqVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case NEW_MUTABLE_INSTANCE:
                return new zzasz();
            case NEW_BUILDER:
                return new zzasy(zzatqVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzasz.class) {
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
