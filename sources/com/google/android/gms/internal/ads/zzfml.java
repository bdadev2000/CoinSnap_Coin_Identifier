package com.google.android.gms.internal.ads;

/* loaded from: classes4.dex */
public final class zzfml extends zzhbe implements zzhcq {
    private static final zzfml zza;
    private static volatile zzhcx zzb;
    private int zzc;
    private zzfmh zzd;

    static {
        zzfml zzfmlVar = new zzfml();
        zza = zzfmlVar;
        zzhbe.zzcb(zzfml.class, zzfmlVar);
    }

    private zzfml() {
    }

    public static zzfmk zza() {
        return (zzfmk) zza.zzaZ();
    }

    public static /* synthetic */ zzfml zzc() {
        return zza;
    }

    public static /* synthetic */ void zzd(zzfml zzfmlVar, zzfmh zzfmhVar) {
        zzfmhVar.getClass();
        zzfmlVar.zzd = zzfmhVar;
        zzfmlVar.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        zzfmi zzfmiVar = null;
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zza, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zzc", "zzd"});
            case NEW_MUTABLE_INSTANCE:
                return new zzfml();
            case NEW_BUILDER:
                return new zzfmk(zzfmiVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzfml.class) {
                        try {
                            zzhcxVar = zzb;
                            if (zzhcxVar == null) {
                                zzhcxVar = new zzhaz(zza);
                                zzb = zzhcxVar;
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
