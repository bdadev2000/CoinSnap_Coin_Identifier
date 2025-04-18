package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhfv extends zzhbe implements zzhcq {
    private static final zzhfv zza;
    private static volatile zzhcx zzb;
    private int zzc;
    private zzhfu zzd;
    private zzgzs zzf;
    private zzgzs zzg;
    private int zzh;
    private byte zzi = 2;
    private zzhbq zze = zzhbe.zzbK();

    static {
        zzhfv zzhfvVar = new zzhfv();
        zza = zzhfvVar;
        zzhbe.zzcb(zzhfv.class, zzhfvVar);
    }

    private zzhfv() {
        zzgzs zzgzsVar = zzgzs.zzb;
        this.zzf = zzgzsVar;
        this.zzg = zzgzsVar;
    }

    public static zzhfs zzc() {
        return (zzhfs) zza.zzaZ();
    }

    public static /* synthetic */ void zze(zzhfv zzhfvVar, zzhfr zzhfrVar) {
        zzhfrVar.getClass();
        zzhbq zzhbqVar = zzhfvVar.zze;
        if (!zzhbqVar.zzc()) {
            zzhfvVar.zze = zzhbe.zzbL(zzhbqVar);
        }
        zzhfvVar.zze.add(zzhfrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzi);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzi = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzc", "zzd", "zze", zzhfr.class, "zzf", "zzg", "zzh"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhfv();
            case NEW_BUILDER:
                return new zzhfs(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzhfv.class) {
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
