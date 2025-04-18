package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhdj extends zzgyx implements zzhaj {
    private static final zzhdj zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private zzhdi zzd;
    private zzgxp zzf;
    private zzgxp zzg;
    private int zzh;
    private byte zzi = 2;
    private zzgzj zze = zzgyx.zzbK();

    static {
        zzhdj zzhdjVar = new zzhdj();
        zza = zzhdjVar;
        zzgyx.zzcb(zzhdj.class, zzhdjVar);
    }

    private zzhdj() {
        zzgxp zzgxpVar = zzgxp.zzb;
        this.zzf = zzgxpVar;
        this.zzg = zzgxpVar;
    }

    public static zzhdg zzc() {
        return (zzhdg) zza.zzaZ();
    }

    public static /* synthetic */ void zzf(zzhdj zzhdjVar, zzhdf zzhdfVar) {
        zzhdfVar.getClass();
        zzgzj zzgzjVar = zzhdjVar.zze;
        if (!zzgzjVar.zzc()) {
            zzhdjVar.zze = zzgyx.zzbL(zzgzjVar);
        }
        zzhdjVar.zze.add(zzhdfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        byte b3 = 1;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzi);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b3 = 0;
                }
                this.zzi = b3;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzc", "zzd", "zze", zzhdf.class, "zzf", "zzg", "zzh"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhdj();
            case NEW_BUILDER:
                return new zzhdg(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzhdj.class) {
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
