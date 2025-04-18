package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzasv extends zzgyx implements zzhaj {
    private static final zzasv zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private long zzd = -1;
    private int zze = 1000;

    static {
        zzasv zzasvVar = new zzasv();
        zza = zzasvVar;
        zzgyx.zzcb(zzasv.class, zzasvVar);
    }

    private zzasv() {
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
                return zzgyx.zzbS(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zzc", "zzd", "zze", zzatg.zza});
            case NEW_MUTABLE_INSTANCE:
                return new zzasv();
            case NEW_BUILDER:
                return new zzasu(zzatqVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzasv.class) {
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
