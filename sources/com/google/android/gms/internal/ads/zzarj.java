package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzarj extends zzgyx implements zzhaj {
    private static final zzarj zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private int zzd;
    private boolean zzg;
    private zzasb zzi;
    private zzase zzj;
    private boolean zzk;
    private boolean zze = true;
    private String zzf = "unknown_host";
    private boolean zzh = true;

    static {
        zzarj zzarjVar = new zzarj();
        zza = zzarjVar;
        zzgyx.zzcb(zzarj.class, zzarjVar);
    }

    private zzarj() {
    }

    public static zzarh zza() {
        return (zzarh) zza.zzaZ();
    }

    public static /* synthetic */ void zzg(zzarj zzarjVar, boolean z10) {
        zzarjVar.zzc |= 8;
        zzarjVar.zzg = z10;
    }

    public static /* synthetic */ void zzh(zzarj zzarjVar, String str) {
        str.getClass();
        zzarjVar.zzc |= 4;
        zzarjVar.zzf = str;
    }

    public final zzasb zzc() {
        zzasb zzasbVar = this.zzi;
        return zzasbVar == null ? zzasb.zzc() : zzasbVar;
    }

    public final zzase zzd() {
        zzase zzaseVar = this.zzj;
        return zzaseVar == null ? zzase.zzb() : zzaseVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzari zzariVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new Object[]{"zzc", "zzd", zzark.zza, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case NEW_MUTABLE_INSTANCE:
                return new zzarj();
            case NEW_BUILDER:
                return new zzarh(zzariVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzarj.class) {
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
        return this.zzf;
    }

    public final boolean zzi() {
        return this.zzg;
    }
}
