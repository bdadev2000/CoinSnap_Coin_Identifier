package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgvx extends zzhbe implements zzhcq {
    private static final zzgvx zza;
    private static volatile zzhcx zzb;
    private int zzc;
    private int zzd;

    static {
        zzgvx zzgvxVar = new zzgvx();
        zza = zzgvxVar;
        zzhbe.zzcb(zzgvx.class, zzgvxVar);
    }

    private zzgvx() {
    }

    public static zzgvw zzd() {
        return (zzgvw) zza.zzaZ();
    }

    public static zzgvx zzf() {
        return zza;
    }

    public final int zza() {
        return this.zzd;
    }

    public final zzgvo zzc() {
        int i2 = this.zzc;
        zzgvo zzgvoVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? null : zzgvo.SHA224 : zzgvo.SHA512 : zzgvo.SHA256 : zzgvo.SHA384 : zzgvo.SHA1 : zzgvo.UNKNOWN_HASH;
        return zzgvoVar == null ? zzgvo.UNRECOGNIZED : zzgvoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        zzgvv zzgvvVar = null;
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzc", "zzd"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgvx();
            case NEW_BUILDER:
                return new zzgvw(zzgvvVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzgvx.class) {
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
