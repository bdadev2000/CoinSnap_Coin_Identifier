package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhgj extends zzhbo implements zzhdf {
    private static final zzhbx zza = new zzhfs();
    private static final zzhbx zzb = new zzhft();
    private static final zzhgj zzc;
    private static volatile zzhdm zzd;
    private boolean zzA;
    private int zze;
    private int zzf;
    private boolean zzg;
    private int zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private int zzo;
    private int zzp;
    private int zzu;
    private boolean zzv;
    private boolean zzx;
    private long zzy;
    private String zzh = "";
    private zzhca zzi = zzhbo.zzbK();
    private String zzn = "";
    private zzhca zzw = zzhbo.zzbK();
    private zzhbw zzz = zzhbo.zzbG();
    private zzhbw zzB = zzhbo.zzbG();

    static {
        zzhgj zzhgjVar = new zzhgj();
        zzc = zzhgjVar;
        zzhbo.zzca(zzhgj.class, zzhgjVar);
    }

    private zzhgj() {
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
                return zzhbo.zzbR(zzc, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new Object[]{"zze", "zzf", zzhgh.zza, "zzg", "zzh", "zzi", "zzj", zzhgb.zza, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", zzhfz.class, "zzx", "zzy", "zzz", zzhfl.zzb(), "zzA", "zzB", zzhge.zza});
            case NEW_MUTABLE_INSTANCE:
                return new zzhgj();
            case NEW_BUILDER:
                return new zzhfu(null);
            case GET_DEFAULT_INSTANCE:
                return zzc;
            case GET_PARSER:
                zzhdm zzhdmVar = zzd;
                if (zzhdmVar == null) {
                    synchronized (zzhgj.class) {
                        try {
                            zzhdmVar = zzd;
                            if (zzhdmVar == null) {
                                zzhdmVar = new zzhbj(zzc);
                                zzd = zzhdmVar;
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
