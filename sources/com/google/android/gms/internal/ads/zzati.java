package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzati extends zzhbo implements zzhdf {
    private static final zzati zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd = 2;

    static {
        zzati zzatiVar = new zzati();
        zza = zzatiVar;
        zzhbo.zzca(zzati.class, zzatiVar);
    }

    private zzati() {
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzate zzateVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbo.zzbR(zza, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b᠌\u0000", new Object[]{"zzc", "zzd", zzatk.zza});
            case NEW_MUTABLE_INSTANCE:
                return new zzati();
            case NEW_BUILDER:
                return new zzath(zzateVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzati.class) {
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
