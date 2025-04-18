package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzguv extends zzhbe implements zzhcq {
    private static final zzguv zza;
    private static volatile zzhcx zzb;
    private int zzc;

    static {
        zzguv zzguvVar = new zzguv();
        zza = zzguvVar;
        zzhbe.zzcb(zzguv.class, zzguvVar);
    }

    private zzguv() {
    }

    public static zzguu zzc() {
        return (zzguu) zza.zzaZ();
    }

    public static zzguv zze() {
        return zza;
    }

    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        zzgut zzgutVar = null;
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzc"});
            case NEW_MUTABLE_INSTANCE:
                return new zzguv();
            case NEW_BUILDER:
                return new zzguu(zzgutVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzguv.class) {
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
