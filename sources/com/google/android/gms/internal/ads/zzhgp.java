package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhgp extends zzhbe implements zzhcq {
    private static final zzhgp zza;
    private static volatile zzhcx zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private zzgzs zzf;
    private zzgzs zzg;

    static {
        zzhgp zzhgpVar = new zzhgp();
        zza = zzhgpVar;
        zzhbe.zzcb(zzhgp.class, zzhgpVar);
    }

    private zzhgp() {
        zzgzs zzgzsVar = zzgzs.zzb;
        this.zzf = zzgzsVar;
        this.zzg = zzgzsVar;
    }

    public static zzhgn zzc() {
        return (zzhgn) zza.zzaZ();
    }

    public static /* synthetic */ zzhgp zzd() {
        return zza;
    }

    public static /* synthetic */ void zze(zzhgp zzhgpVar, String str) {
        zzhgpVar.zzc |= 2;
        zzhgpVar.zze = "image/png";
    }

    public static /* synthetic */ void zzf(zzhgp zzhgpVar, zzgzs zzgzsVar) {
        zzgzsVar.getClass();
        zzhgpVar.zzc |= 4;
        zzhgpVar.zzf = zzgzsVar;
    }

    public static /* synthetic */ void zzg(zzhgp zzhgpVar, int i2) {
        zzhgpVar.zzd = 1;
        zzhgpVar.zzc = 1 | zzhgpVar.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        zzhev zzhevVar = null;
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzc", "zzd", zzhgo.zza, "zze", "zzf", "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhgp();
            case NEW_BUILDER:
                return new zzhgn(zzhevVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzhgp.class) {
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
