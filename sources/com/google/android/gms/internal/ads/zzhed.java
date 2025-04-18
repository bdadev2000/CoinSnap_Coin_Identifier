package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhed extends zzgyx implements zzhaj {
    private static final zzhed zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private zzgxp zzf;
    private zzgxp zzg;

    static {
        zzhed zzhedVar = new zzhed();
        zza = zzhedVar;
        zzgyx.zzcb(zzhed.class, zzhedVar);
    }

    private zzhed() {
        zzgxp zzgxpVar = zzgxp.zzb;
        this.zzf = zzgxpVar;
        this.zzg = zzgxpVar;
    }

    public static zzheb zzc() {
        return (zzheb) zza.zzaZ();
    }

    public static /* bridge */ /* synthetic */ zzhed zzd() {
        return zza;
    }

    public static /* synthetic */ void zzf(zzhed zzhedVar, zzgxp zzgxpVar) {
        zzgxpVar.getClass();
        zzhedVar.zzc |= 4;
        zzhedVar.zzf = zzgxpVar;
    }

    public static /* synthetic */ void zzg(zzhed zzhedVar, String str) {
        zzhedVar.zzc |= 2;
        zzhedVar.zze = "image/png";
    }

    public static /* synthetic */ void zzh(zzhed zzhedVar, int i10) {
        zzhedVar.zzd = 1;
        zzhedVar.zzc = 1 | zzhedVar.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzhfd zzhfdVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzc", "zzd", zzhec.zza, "zze", "zzf", "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhed();
            case NEW_BUILDER:
                return new zzheb(zzhfdVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzhed.class) {
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
