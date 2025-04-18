package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzasb extends zzgyx implements zzhaj {
    private static final zzasb zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private boolean zzd;
    private int zze = 5000;
    private boolean zzf;
    private boolean zzg;

    static {
        zzasb zzasbVar = new zzasb();
        zza = zzasbVar;
        zzgyx.zzcb(zzasb.class, zzasbVar);
    }

    private zzasb() {
    }

    public static zzasb zzc() {
        return zza;
    }

    public final int zza() {
        return this.zze;
    }

    public final boolean zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzasa zzasaVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new zzasb();
            case NEW_BUILDER:
                return new zzarz(zzasaVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzasb.class) {
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

    public final boolean zzf() {
        return this.zzg;
    }

    public final boolean zzg() {
        return this.zzf;
    }
}
