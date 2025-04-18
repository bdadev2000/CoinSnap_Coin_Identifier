package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhfc extends zzgyx implements zzhaj {
    private static final zzhfc zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private boolean zzj;
    private double zzk;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzu;
    private String zzd = "";
    private String zze = "";
    private int zzf = 4;
    private zzgzj zzg = zzgyx.zzbK();
    private String zzh = "";
    private String zzi = "";
    private zzgzj zzl = zzgyx.zzbK();

    static {
        zzhfc zzhfcVar = new zzhfc();
        zza = zzhfcVar;
        zzgyx.zzcb(zzhfc.class, zzhfcVar);
    }

    private zzhfc() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zzc", "zzd", "zzf", zzhfb.zza, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzhfa.class, "zze", "zzm", zzhey.zza, "zzn", "zzo", "zzp", "zzu"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhfc();
            case NEW_BUILDER:
                return new zzhex(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzhfc.class) {
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
