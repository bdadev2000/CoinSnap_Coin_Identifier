package com.google.android.gms.internal.ads;

@Deprecated
/* loaded from: classes3.dex */
public final class zzgvh extends zzgyx implements zzhaj {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvh zzb;
    private static volatile zzhaq zzc;
    private String zzd = "";
    private zzgzj zze = zzgyx.zzbK();

    static {
        zzgvh zzgvhVar = new zzgvh();
        zzb = zzgvhVar;
        zzgyx.zzcb(zzgvh.class, zzgvhVar);
    }

    private zzgvh() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", zzguh.class});
            case NEW_MUTABLE_INSTANCE:
                return new zzgvh();
            case NEW_BUILDER:
                return new zzgvf(null);
            case GET_DEFAULT_INSTANCE:
                return zzb;
            case GET_PARSER:
                zzhaq zzhaqVar = zzc;
                if (zzhaqVar == null) {
                    synchronized (zzgvh.class) {
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
