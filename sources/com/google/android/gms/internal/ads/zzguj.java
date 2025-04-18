package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzguj extends zzhbe implements zzhcq {
    private static final zzguj zza;
    private static volatile zzhcx zzb;
    private int zzc;
    private zzgum zzd;
    private int zze;

    static {
        zzguj zzgujVar = new zzguj();
        zza = zzgujVar;
        zzhbe.zzcb(zzguj.class, zzgujVar);
    }

    private zzguj() {
    }

    public static zzgui zzc() {
        return (zzgui) zza.zzaZ();
    }

    public static zzguj zze() {
        return zza;
    }

    public static /* synthetic */ void zzg(zzguj zzgujVar, zzgum zzgumVar) {
        zzgumVar.getClass();
        zzgujVar.zzd = zzgumVar;
        zzgujVar.zzc |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        zzguh zzguhVar = null;
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzguj();
            case NEW_BUILDER:
                return new zzgui(zzguhVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzguj.class) {
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

    public final zzgum zzf() {
        zzgum zzgumVar = this.zzd;
        return zzgumVar == null ? zzgum.zze() : zzgumVar;
    }
}
