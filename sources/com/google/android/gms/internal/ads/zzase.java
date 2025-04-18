package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzase extends zzgyx implements zzhaj {
    public static final /* synthetic */ int zza = 0;
    private static final zzase zzb;
    private static volatile zzhaq zzc;
    private int zzd;
    private boolean zzf;
    private boolean zzg;
    private long zze = 100;
    private long zzh = 300;

    static {
        zzase zzaseVar = new zzase();
        zzb = zzaseVar;
        zzgyx.zzcb(zzase.class, zzaseVar);
    }

    private zzase() {
    }

    public static zzase zzb() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzasd zzasdVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
            case NEW_MUTABLE_INSTANCE:
                return new zzase();
            case NEW_BUILDER:
                return new zzasc(zzasdVar);
            case GET_DEFAULT_INSTANCE:
                return zzb;
            case GET_PARSER:
                zzhaq zzhaqVar = zzc;
                if (zzhaqVar == null) {
                    synchronized (zzase.class) {
                        zzhaqVar = zzc;
                        if (zzhaqVar == null) {
                            zzhaqVar = new zzgys(zzb);
                            zzc = zzhaqVar;
                        }
                    }
                }
                return zzhaqVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
