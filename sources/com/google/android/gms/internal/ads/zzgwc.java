package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgwc extends zzhbo implements zzhdf {
    private static final zzgwc zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;

    static {
        zzgwc zzgwcVar = new zzgwc();
        zza = zzgwcVar;
        zzhbo.zzca(zzgwc.class, zzgwcVar);
    }

    private zzgwc() {
    }

    public static zzgwb zzd() {
        return (zzgwb) zza.zzaZ();
    }

    public static zzgwc zzf() {
        return zza;
    }

    public final int zza() {
        return this.zzd;
    }

    public final zzgvt zzc() {
        zzgvt zzb2 = zzgvt.zzb(this.zzc);
        if (zzb2 == null) {
            return zzgvt.UNRECOGNIZED;
        }
        return zzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzgwa zzgwaVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbo.zzbR(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzc", "zzd"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgwc();
            case NEW_BUILDER:
                return new zzgwb(zzgwaVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzgwc.class) {
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
