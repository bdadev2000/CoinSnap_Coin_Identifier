package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhfd extends zzhbe implements zzhcq {
    private static final zzhfd zza;
    private static volatile zzhcx zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private int zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private boolean zzv;
    private long zzw;
    private boolean zzy;
    private String zzf = "";
    private zzhbq zzg = zzhbe.zzbK();
    private String zzl = "";
    private zzhbq zzu = zzhbe.zzbK();
    private zzhbm zzx = zzhbe.zzbG();
    private zzhbm zzz = zzhbe.zzbG();

    static {
        zzhfd zzhfdVar = new zzhfd();
        zza = zzhfdVar;
        zzhbe.zzcb(zzhfd.class, zzhfdVar);
    }

    private zzhfd() {
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zza, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new Object[]{"zzc", "zzd", zzhfc.zza, "zze", "zzf", "zzg", "zzh", zzhfa.zza, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", zzhez.class, "zzv", "zzw", "zzx", zzhep.zza(), "zzy", "zzz", zzhfb.zza});
            case NEW_MUTABLE_INSTANCE:
                return new zzhfd();
            case NEW_BUILDER:
                return new zzhew(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzhfd.class) {
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
