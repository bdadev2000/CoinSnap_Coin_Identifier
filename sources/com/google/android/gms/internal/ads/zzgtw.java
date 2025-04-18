package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgtw extends zzgyx implements zzhaj {
    private static final zzgtw zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private int zzd;

    static {
        zzgtw zzgtwVar = new zzgtw();
        zza = zzgtwVar;
        zzgyx.zzcb(zzgtw.class, zzgtwVar);
    }

    private zzgtw() {
    }

    public static zzgtu zzc() {
        return (zzgtu) zza.zzaZ();
    }

    public static zzgtw zzf() {
        return zza;
    }

    public final int zza() {
        return this.zzd;
    }

    public final zzgtn zzb() {
        int i10 = this.zzc;
        zzgtn zzgtnVar = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? null : zzgtn.SHA224 : zzgtn.SHA512 : zzgtn.SHA256 : zzgtn.SHA384 : zzgtn.SHA1 : zzgtn.UNKNOWN_HASH;
        return zzgtnVar == null ? zzgtn.UNRECOGNIZED : zzgtnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzgtv zzgtvVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzc", "zzd"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgtw();
            case NEW_BUILDER:
                return new zzgtu(zzgtvVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzgtw.class) {
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
