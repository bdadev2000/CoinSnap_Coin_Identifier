package com.google.android.gms.internal.ads;

@Deprecated
/* loaded from: classes.dex */
public final class zzgxi extends zzhbe implements zzhcq {
    public static final /* synthetic */ int zza = 0;
    private static final zzgxi zzb;
    private static volatile zzhcx zzc;
    private String zzd = "";
    private zzhbq zze = zzhbe.zzbK();

    static {
        zzgxi zzgxiVar = new zzgxi();
        zzb = zzgxiVar;
        zzhbe.zzcb(zzgxi.class, zzgxiVar);
    }

    private zzgxi() {
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", zzgwi.class});
            case NEW_MUTABLE_INSTANCE:
                return new zzgxi();
            case NEW_BUILDER:
                return new zzgxh(null);
            case GET_DEFAULT_INSTANCE:
                return zzb;
            case GET_PARSER:
                zzhcx zzhcxVar = zzc;
                if (zzhcxVar == null) {
                    synchronized (zzgxi.class) {
                        try {
                            zzhcxVar = zzc;
                            if (zzhcxVar == null) {
                                zzhcxVar = new zzhaz(zzb);
                                zzc = zzhcxVar;
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
