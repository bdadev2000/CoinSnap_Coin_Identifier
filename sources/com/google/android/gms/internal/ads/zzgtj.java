package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgtj extends zzgyx implements zzhaj {
    private static final zzgtj zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private zzgxp zzd = zzgxp.zzb;

    static {
        zzgtj zzgtjVar = new zzgtj();
        zza = zzgtjVar;
        zzgyx.zzcb(zzgtj.class, zzgtjVar);
    }

    private zzgtj() {
    }

    public static zzgth zzb() {
        return (zzgth) zza.zzaZ();
    }

    public static zzgtj zzd(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
        return (zzgtj) zzgyx.zzbr(zza, zzgxpVar, zzgyhVar);
    }

    public static zzhaq zzg() {
        return zza.zzbN();
    }

    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzc", "zzd"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgtj();
            case NEW_BUILDER:
                return new zzgth(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzgtj.class) {
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

    public final zzgxp zzf() {
        return this.zzd;
    }
}
