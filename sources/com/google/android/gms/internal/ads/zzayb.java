package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzayb extends zzgyx implements zzhaj {
    private static final zzayb zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private String zzd = "";
    private String zze = "";
    private long zzf;
    private long zzg;
    private long zzh;

    static {
        zzayb zzaybVar = new zzayb();
        zza = zzaybVar;
        zzgyx.zzcb(zzayb.class, zzaybVar);
    }

    private zzayb() {
    }

    public static zzaxz zzd() {
        return (zzaxz) zza.zzaZ();
    }

    public static zzayb zzg() {
        return zza;
    }

    public static zzayb zzh(zzgxp zzgxpVar) throws zzgzm {
        return (zzayb) zzgyx.zzbm(zza, zzgxpVar);
    }

    public static zzayb zzi(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
        return (zzayb) zzgyx.zzbr(zza, zzgxpVar, zzgyhVar);
    }

    public static /* synthetic */ void zzl(zzayb zzaybVar, String str) {
        str.getClass();
        zzaybVar.zzc |= 2;
        zzaybVar.zze = str;
    }

    public static /* synthetic */ void zzm(zzayb zzaybVar, long j3) {
        zzaybVar.zzc |= 8;
        zzaybVar.zzg = j3;
    }

    public static /* synthetic */ void zzn(zzayb zzaybVar, long j3) {
        zzaybVar.zzc |= 4;
        zzaybVar.zzf = j3;
    }

    public static /* synthetic */ void zzo(zzayb zzaybVar, long j3) {
        zzaybVar.zzc |= 16;
        zzaybVar.zzh = j3;
    }

    public static /* synthetic */ void zzp(zzayb zzaybVar, String str) {
        str.getClass();
        zzaybVar.zzc |= 1;
        zzaybVar.zzd = str;
    }

    public final long zza() {
        return this.zzg;
    }

    public final long zzb() {
        return this.zzf;
    }

    public final long zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzaya zzayaVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
            case NEW_MUTABLE_INSTANCE:
                return new zzayb();
            case NEW_BUILDER:
                return new zzaxz(zzayaVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzayb.class) {
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

    public final String zzj() {
        return this.zze;
    }

    public final String zzk() {
        return this.zzd;
    }
}
