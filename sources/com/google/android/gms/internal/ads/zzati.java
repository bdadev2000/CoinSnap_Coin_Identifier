package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzati extends zzgyx implements zzhaj {
    private static final zzati zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private long zzf;
    private long zzh;
    private String zzd = "";
    private String zze = "";
    private String zzg = "D";

    static {
        zzati zzatiVar = new zzati();
        zza = zzatiVar;
        zzgyx.zzcb(zzati.class, zzatiVar);
    }

    private zzati() {
    }

    public static zzath zza() {
        return (zzath) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzati zzatiVar, String str) {
        zzatiVar.zzc |= 1;
        zzatiVar.zzd = "1.671910402";
    }

    public static /* synthetic */ void zzd(zzati zzatiVar, String str) {
        str.getClass();
        zzatiVar.zzc |= 2;
        zzatiVar.zze = str;
    }

    public static /* synthetic */ void zzf(zzati zzatiVar, String str) {
        str.getClass();
        zzatiVar.zzc |= 8;
        zzatiVar.zzg = str;
    }

    public static /* synthetic */ void zzg(zzati zzatiVar, long j3) {
        zzatiVar.zzc |= 4;
        zzatiVar.zzf = j3;
    }

    public static /* synthetic */ void zzh(zzati zzatiVar, long j3) {
        zzatiVar.zzc |= 16;
        zzatiVar.zzh = j3;
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
                return zzgyx.zzbS(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
            case NEW_MUTABLE_INSTANCE:
                return new zzati();
            case NEW_BUILDER:
                return new zzath(zzatqVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzati.class) {
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
