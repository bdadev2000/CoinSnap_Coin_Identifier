package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgvd extends zzgyx implements zzhaj {
    private static final zzgvd zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private String zzd = "";
    private zzgue zze;

    static {
        zzgvd zzgvdVar = new zzgvd();
        zza = zzgvdVar;
        zzgyx.zzcb(zzgvd.class, zzgvdVar);
    }

    private zzgvd() {
    }

    public static zzgvb zzb() {
        return (zzgvb) zza.zzaZ();
    }

    public static zzgvd zzd() {
        return zza;
    }

    public static zzgvd zzf(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
        return (zzgvd) zzgyx.zzbr(zza, zzgxpVar, zzgyhVar);
    }

    public static /* synthetic */ void zzh(zzgvd zzgvdVar, zzgue zzgueVar) {
        zzgueVar.getClass();
        zzgvdVar.zze = zzgueVar;
        zzgvdVar.zzc |= 1;
    }

    public static /* synthetic */ void zzi(zzgvd zzgvdVar, String str) {
        str.getClass();
        zzgvdVar.zzd = str;
    }

    public final zzgue zza() {
        zzgue zzgueVar = this.zze;
        return zzgueVar == null ? zzgue.zzd() : zzgueVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzgvc zzgvcVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgvd();
            case NEW_BUILDER:
                return new zzgvb(zzgvcVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzgvd.class) {
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
        return this.zzd;
    }
}
