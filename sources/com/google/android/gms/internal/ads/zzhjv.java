package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhjv extends zzhbo implements zzhdf {
    private static final zzhjv zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private boolean zzj;
    private double zzk;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzu;
    private String zzd = "";
    private String zze = "";
    private int zzf = 4;
    private zzhca zzg = zzhbo.zzbK();
    private String zzh = "";
    private String zzi = "";
    private zzhca zzl = zzhbo.zzbK();

    static {
        zzhjv zzhjvVar = new zzhjv();
        zza = zzhjvVar;
        zzhbo.zzca(zzhjv.class, zzhjvVar);
    }

    private zzhjv() {
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbo.zzbR(zza, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zzc", "zzd", "zzf", zzhjt.zza, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzhjr.class, "zze", "zzm", zzhjo.zza, "zzn", "zzo", "zzp", "zzu"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhjv();
            case NEW_BUILDER:
                return new zzhjm(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzhjv.class) {
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
}
