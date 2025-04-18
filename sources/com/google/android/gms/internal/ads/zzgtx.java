package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgtx extends zzhbe implements zzhcq {
    private static final zzgtx zza;
    private static volatile zzhcx zzb;
    private int zzc;

    static {
        zzgtx zzgtxVar = new zzgtx();
        zza = zzgtxVar;
        zzhbe.zzcb(zzgtx.class, zzgtxVar);
    }

    private zzgtx() {
    }

    public static zzgtw zzc() {
        return (zzgtw) zza.zzaZ();
    }

    public static zzgtx zze() {
        return zza;
    }

    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        zzgtv zzgtvVar = null;
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzc"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgtx();
            case NEW_BUILDER:
                return new zzgtw(zzgtvVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzgtx.class) {
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
