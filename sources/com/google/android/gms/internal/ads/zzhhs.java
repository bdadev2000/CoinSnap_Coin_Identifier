package com.google.android.gms.internal.ads;

@Deprecated
/* loaded from: classes2.dex */
public final class zzhhs extends zzhbo implements zzhdf {
    private static final zzhhs zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;
    private zzhhr zze;
    private zzhhr zzf;

    static {
        zzhhs zzhhsVar = new zzhhs();
        zza = zzhhsVar;
        zzhbo.zzca(zzhhs.class, zzhhsVar);
    }

    private zzhhs() {
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbo.zzbR(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzc", "zzd", zzhho.zza, "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhhs();
            case NEW_BUILDER:
                return new zzhhm(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzhhs.class) {
                        try {
                            zzhdmVar = zzb;
                            if (zzhdmVar == null) {
                                zzhdmVar = new zzhbj(zza);
                                zzb = zzhdmVar;
                            }
                        } finally {
                        }
                    }
                }
                return zzhdmVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
