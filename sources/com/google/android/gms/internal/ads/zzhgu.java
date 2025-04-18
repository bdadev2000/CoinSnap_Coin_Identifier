package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhgu extends zzhbe implements zzhcq {
    private static final zzhgu zza;
    private static volatile zzhcx zzb;
    private int zzc;
    private int zzd;
    private zzhfv zzf;
    private zzhfz zzg;
    private int zzh;
    private int zzk;
    private byte zzm = 2;
    private String zze = "";
    private zzhbm zzi = zzhbe.zzbG();
    private String zzj = "";
    private zzhbq zzl = zzhbe.zzbK();

    static {
        zzhgu zzhguVar = new zzhgu();
        zza = zzhguVar;
        zzhbe.zzcb(zzhgu.class, zzhguVar);
    }

    private zzhgu() {
    }

    public static zzhgt zzd() {
        return (zzhgt) zza.zzaZ();
    }

    public static /* synthetic */ void zzg(zzhgu zzhguVar, int i2) {
        zzhguVar.zzc |= 1;
        zzhguVar.zzd = i2;
    }

    public static /* synthetic */ void zzh(zzhgu zzhguVar, String str) {
        str.getClass();
        zzhguVar.zzc |= 2;
        zzhguVar.zze = str;
    }

    public static /* synthetic */ void zzi(zzhgu zzhguVar, zzhfv zzhfvVar) {
        zzhfvVar.getClass();
        zzhguVar.zzf = zzhfvVar;
        zzhguVar.zzc |= 4;
    }

    public static /* synthetic */ void zzj(zzhgu zzhguVar, String str) {
        str.getClass();
        zzhbq zzhbqVar = zzhguVar.zzl;
        if (!zzhbqVar.zzc()) {
            zzhguVar.zzl = zzhbe.zzbL(zzhbqVar);
        }
        zzhguVar.zzl.add(str);
    }

    public static /* synthetic */ void zzk(zzhgu zzhguVar, int i2) {
        zzhguVar.zzk = i2 - 1;
        zzhguVar.zzc |= 64;
    }

    public final int zzc() {
        return this.zzl.size();
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzm);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzm = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzhgr.zza, "zzl"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhgu();
            case NEW_BUILDER:
                return new zzhgt(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzhgu.class) {
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

    public final String zzf() {
        return this.zze;
    }
}
