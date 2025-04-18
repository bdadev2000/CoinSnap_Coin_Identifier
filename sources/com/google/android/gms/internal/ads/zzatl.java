package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzatl extends zzhbe implements zzhcq {
    private static final zzatl zza;
    private static volatile zzhcx zzb;
    private int zzc;
    private zzgzs zzd;
    private zzgzs zze;
    private zzgzs zzf;
    private zzgzs zzg;

    static {
        zzatl zzatlVar = new zzatl();
        zza = zzatlVar;
        zzhbe.zzcb(zzatl.class, zzatlVar);
    }

    private zzatl() {
        zzgzs zzgzsVar = zzgzs.zzb;
        this.zzd = zzgzsVar;
        this.zze = zzgzsVar;
        this.zzf = zzgzsVar;
        this.zzg = zzgzsVar;
    }

    public static zzatk zza() {
        return (zzatk) zza.zzaZ();
    }

    public static zzatl zzd(byte[] bArr, zzhao zzhaoVar) throws zzhbt {
        return (zzatl) zzhbe.zzbx(zza, bArr, zzhaoVar);
    }

    public static /* synthetic */ void zzi(zzatl zzatlVar, zzgzs zzgzsVar) {
        zzatlVar.zzc |= 1;
        zzatlVar.zzd = zzgzsVar;
    }

    public static /* synthetic */ void zzj(zzatl zzatlVar, zzgzs zzgzsVar) {
        zzatlVar.zzc |= 2;
        zzatlVar.zze = zzgzsVar;
    }

    public static /* synthetic */ void zzk(zzatl zzatlVar, zzgzs zzgzsVar) {
        zzatlVar.zzc |= 4;
        zzatlVar.zzf = zzgzsVar;
    }

    public static /* synthetic */ void zzl(zzatl zzatlVar, zzgzs zzgzsVar) {
        zzatlVar.zzc |= 8;
        zzatlVar.zzg = zzgzsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new zzatl();
            case NEW_BUILDER:
                return new zzatk(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzatl.class) {
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

    public final zzgzs zze() {
        return this.zzd;
    }

    public final zzgzs zzf() {
        return this.zze;
    }

    public final zzgzs zzg() {
        return this.zzg;
    }

    public final zzgzs zzh() {
        return this.zzf;
    }
}
