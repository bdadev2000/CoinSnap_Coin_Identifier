package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzflh extends zzgyx implements zzhaj {
    private static final zzflh zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private int zze;
    private String zzd = "";
    private String zzf = "";

    static {
        zzflh zzflhVar = new zzflh();
        zza = zzflhVar;
        zzgyx.zzcb(zzflh.class, zzflhVar);
    }

    private zzflh() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzflg zzflgVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\f\u0004Ȉ", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzflh();
            case NEW_BUILDER:
                return new zzflf(zzflgVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzflh.class) {
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
