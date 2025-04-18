package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzasc extends zzhbe implements zzhcq {
    private static final zzasc zza;
    private static volatile zzhcx zzb;
    private int zzc;
    private zzase zzd;
    private zzash zze;

    static {
        zzasc zzascVar = new zzasc();
        zza = zzascVar;
        zzhbe.zzcb(zzasc.class, zzascVar);
    }

    private zzasc() {
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
                return zzhbe.zzbS(zza, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzasc();
            case NEW_BUILDER:
                return new zzasb(zzasaVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzasc.class) {
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
