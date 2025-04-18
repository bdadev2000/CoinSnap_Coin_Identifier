package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhek extends zzgyx implements zzhaj {
    private static final zzhek zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private long zze;
    private boolean zzf;
    private int zzg;
    private boolean zzj;
    private boolean zzk;
    private String zzd = "";
    private String zzh = "";
    private String zzi = "";

    static {
        zzhek zzhekVar = new zzhek();
        zza = zzhekVar;
        zzgyx.zzcb(zzhek.class, zzhekVar);
    }

    private zzhek() {
    }

    public static zzhej zzc() {
        return (zzhej) zza.zzaZ();
    }

    public static /* bridge */ /* synthetic */ zzhek zzd() {
        return zza;
    }

    public static /* synthetic */ void zzf(zzhek zzhekVar, String str) {
        zzhekVar.zzc |= 1;
        zzhekVar.zzd = str;
    }

    public static /* synthetic */ void zzg(zzhek zzhekVar, long j3) {
        zzhekVar.zzc |= 2;
        zzhekVar.zze = j3;
    }

    public static /* synthetic */ void zzh(zzhek zzhekVar, boolean z10) {
        zzhekVar.zzc |= 4;
        zzhekVar.zzf = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzhfd zzhfdVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", zzhel.zza, "zzh", "zzi", "zzj", "zzk"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhek();
            case NEW_BUILDER:
                return new zzhej(zzhfdVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzhek.class) {
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
