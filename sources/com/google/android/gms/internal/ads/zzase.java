package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzase extends zzhbe implements zzhcq {
    private static final zzase zza;
    private static volatile zzhcx zzb;
    private int zzc;
    private int zzd = 2;

    static {
        zzase zzaseVar = new zzase();
        zza = zzaseVar;
        zzhbe.zzcb(zzase.class, zzaseVar);
    }

    private zzase() {
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        zzasa zzasaVar = null;
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zza, "\u0004\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b᠌\u0000", new Object[]{"zzc", "zzd", zzasf.zza});
            case NEW_MUTABLE_INSTANCE:
                return new zzase();
            case NEW_BUILDER:
                return new zzasd(zzasaVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzase.class) {
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
