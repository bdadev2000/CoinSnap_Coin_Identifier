package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzatl extends zzgyx implements zzhaj {
    private static final zzatl zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private long zzd;
    private String zze = "";
    private zzgxp zzf = zzgxp.zzb;

    static {
        zzatl zzatlVar = new zzatl();
        zza = zzatlVar;
        zzgyx.zzcb(zzatl.class, zzatlVar);
    }

    private zzatl() {
    }

    public static zzatl zzc() {
        return zza;
    }

    public final long zza() {
        return this.zzd;
    }

    public final zzgxp zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzatl();
            case NEW_BUILDER:
                return new zzatk(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzatl.class) {
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

    public final String zzf() {
        return this.zze;
    }

    public final boolean zzg() {
        return (this.zzc & 1) != 0;
    }
}
