package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhei extends zzgyx implements zzhaj {
    private static final zzhei zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private int zzd;
    private zzhdj zzf;
    private zzhdn zzg;
    private int zzh;
    private int zzk;
    private byte zzm = 2;
    private String zze = "";
    private zzgzf zzi = zzgyx.zzbG();
    private String zzj = "";
    private zzgzj zzl = zzgyx.zzbK();

    static {
        zzhei zzheiVar = new zzhei();
        zza = zzheiVar;
        zzgyx.zzcb(zzhei.class, zzheiVar);
    }

    private zzhei() {
    }

    public static zzheh zzd() {
        return (zzheh) zza.zzaZ();
    }

    public static /* synthetic */ void zzh(zzhei zzheiVar, String str) {
        str.getClass();
        zzgzj zzgzjVar = zzheiVar.zzl;
        if (!zzgzjVar.zzc()) {
            zzheiVar.zzl = zzgyx.zzbL(zzgzjVar);
        }
        zzheiVar.zzl.add(str);
    }

    public static /* synthetic */ void zzi(zzhei zzheiVar, int i10) {
        zzheiVar.zzc |= 1;
        zzheiVar.zzd = i10;
    }

    public static /* synthetic */ void zzj(zzhei zzheiVar, zzhdj zzhdjVar) {
        zzhdjVar.getClass();
        zzheiVar.zzf = zzhdjVar;
        zzheiVar.zzc |= 4;
    }

    public static /* synthetic */ void zzk(zzhei zzheiVar, String str) {
        str.getClass();
        zzheiVar.zzc |= 2;
        zzheiVar.zze = str;
    }

    public static /* synthetic */ void zzl(zzhei zzheiVar, int i10) {
        zzheiVar.zzk = i10 - 1;
        zzheiVar.zzc |= 64;
    }

    public final int zzc() {
        return this.zzl.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        byte b3 = 1;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzm);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b3 = 0;
                }
                this.zzm = b3;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzhef.zza, "zzl"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhei();
            case NEW_BUILDER:
                return new zzheh(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzhei.class) {
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

    public final String zzg() {
        return this.zze;
    }
}
