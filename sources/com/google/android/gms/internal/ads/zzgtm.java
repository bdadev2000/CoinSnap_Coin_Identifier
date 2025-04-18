package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgtm extends zzgyx implements zzhaj {
    private static final zzgtm zza;
    private static volatile zzhaq zzb;

    static {
        zzgtm zzgtmVar = new zzgtm();
        zza = zzgtmVar;
        zzgyx.zzcb(zzgtm.class, zzgtmVar);
    }

    private zzgtm() {
    }

    public static zzgtm zzb() {
        return zza;
    }

    public static zzgtm zzc(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
        return (zzgtm) zzgyx.zzbr(zza, zzgxpVar, zzgyhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0000\u0000", null);
            case NEW_MUTABLE_INSTANCE:
                return new zzgtm();
            case NEW_BUILDER:
                return new zzgtk(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzgtm.class) {
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
