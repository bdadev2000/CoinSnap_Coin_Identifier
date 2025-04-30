package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhir extends zzhbo implements zzhdf {
    private static final zzhir zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;
    private zzhhh zzf;
    private zzhhl zzg;
    private int zzh;
    private int zzk;
    private byte zzm = 2;
    private String zze = "";
    private zzhbw zzi = zzhbo.zzbG();
    private String zzj = "";
    private zzhca zzl = zzhbo.zzbK();

    static {
        zzhir zzhirVar = new zzhir();
        zza = zzhirVar;
        zzhbo.zzca(zzhir.class, zzhirVar);
    }

    private zzhir() {
    }

    public static zzhiq zze() {
        return (zzhiq) zza.zzaZ();
    }

    public static /* synthetic */ void zzh(zzhir zzhirVar, int i9) {
        zzhirVar.zzc |= 1;
        zzhirVar.zzd = i9;
    }

    public static /* synthetic */ void zzi(zzhir zzhirVar, String str) {
        str.getClass();
        zzhirVar.zzc |= 2;
        zzhirVar.zze = str;
    }

    public static /* synthetic */ void zzj(zzhir zzhirVar, zzhhh zzhhhVar) {
        zzhhhVar.getClass();
        zzhirVar.zzf = zzhhhVar;
        zzhirVar.zzc |= 4;
    }

    public static /* synthetic */ void zzk(zzhir zzhirVar, zzhip zzhipVar) {
        zzhirVar.zzk = zzhipVar.zza();
        zzhirVar.zzc |= 64;
    }

    public static /* synthetic */ void zzl(zzhir zzhirVar, String str) {
        str.getClass();
        zzhca zzhcaVar = zzhirVar.zzl;
        if (!zzhcaVar.zzc()) {
            zzhirVar.zzl = zzhbo.zzbL(zzhcaVar);
        }
        zzhirVar.zzl.add(str);
    }

    public final int zzc() {
        return this.zzl.size();
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        byte b;
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzm);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                } else {
                    b = 1;
                }
                this.zzm = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbo.zzbR(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzhio.zza, "zzl"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhir();
            case NEW_BUILDER:
                return new zzhiq(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzhir.class) {
                        try {
                            zzhdmVar = zzb;
                            if (zzhdmVar == null) {
                                zzhdmVar = new zzhbj(zza);
                                zzb = zzhdmVar;
                            }
                        } finally {
                        }
                    }
                }
                return zzhdmVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final String zzg() {
        return this.zze;
    }
}
