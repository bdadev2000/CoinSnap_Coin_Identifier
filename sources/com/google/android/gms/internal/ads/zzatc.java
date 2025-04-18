package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzatc extends zzgyx implements zzhaj {
    private static final zzatc zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private boolean zzf;
    private zzgzf zzg = zzgyx.zzbG();
    private long zzh;

    static {
        zzatc zzatcVar = new zzatc();
        zza = zzatcVar;
        zzgyx.zzcb(zzatc.class, zzatcVar);
    }

    private zzatc() {
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
                return zzgyx.zzbS(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
            case NEW_MUTABLE_INSTANCE:
                return new zzatc();
            case NEW_BUILDER:
                return new zzatb(zzatqVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzatc.class) {
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
