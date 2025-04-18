package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgwm extends zzhbe implements zzhcq {
    private static final zzgwm zza;
    private static volatile zzhcx zzb;
    private int zzc;
    private zzgwb zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzgwm zzgwmVar = new zzgwm();
        zza = zzgwmVar;
        zzhbe.zzcb(zzgwm.class, zzgwmVar);
    }

    private zzgwm() {
    }

    public static zzgwl zzd() {
        return (zzgwl) zza.zzaZ();
    }

    public static /* synthetic */ void zzg(zzgwm zzgwmVar, zzgwb zzgwbVar) {
        zzgwbVar.getClass();
        zzgwmVar.zzd = zzgwbVar;
        zzgwmVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzgwb zzc() {
        zzgwb zzgwbVar = this.zzd;
        return zzgwbVar == null ? zzgwb.zze() : zzgwbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        zzgwj zzgwjVar = null;
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zza, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgwm();
            case NEW_BUILDER:
                return new zzgwl(zzgwjVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzgwm.class) {
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

    public final zzgxf zzf() {
        zzgxf zzb2 = zzgxf.zzb(this.zzg);
        return zzb2 == null ? zzgxf.UNRECOGNIZED : zzb2;
    }

    public final boolean zzj() {
        return (this.zzc & 1) != 0;
    }

    public final int zzk() {
        int i2 = this.zze;
        int i3 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }
}
