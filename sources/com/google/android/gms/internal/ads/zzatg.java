package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzatg extends zzhbe implements zzhcq {
    private static final zzatg zza;
    private static volatile zzhcx zzb;
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
        zzatg zzatgVar = new zzatg();
        zza = zzatgVar;
        zzhbe.zzcb(zzatg.class, zzatgVar);
    }

    private zzatg() {
    }

    public static zzatf zza() {
        return (zzatf) zza.zzaZ();
    }

    public static /* synthetic */ void zzd(zzatg zzatgVar, long j2) {
        zzatgVar.zzc |= 1;
        zzatgVar.zzd = j2;
    }

    public static /* synthetic */ void zze(zzatg zzatgVar, long j2) {
        zzatgVar.zzc |= 4;
        zzatgVar.zzf = j2;
    }

    public static /* synthetic */ void zzf(zzatg zzatgVar, long j2) {
        zzatgVar.zzc |= 8;
        zzatgVar.zzg = j2;
    }

    public static /* synthetic */ void zzg(zzatg zzatgVar, long j2) {
        zzatgVar.zzc |= 16;
        zzatgVar.zzh = j2;
    }

    public static /* synthetic */ void zzh(zzatg zzatgVar, long j2) {
        zzatgVar.zzc |= 32;
        zzatgVar.zzi = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        zzasl zzaslVar = null;
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case NEW_MUTABLE_INSTANCE:
                return new zzatg();
            case NEW_BUILDER:
                return new zzatf(zzaslVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzatg.class) {
                        try {
                            zzhcxVar = zzb;
                            if (zzhcxVar == null) {
                                zzhcxVar = new zzhaz(zza);
                                zzb = zzhcxVar;
                            }
                        } finally {
                        }
                    }
                }
                return zzhcxVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
