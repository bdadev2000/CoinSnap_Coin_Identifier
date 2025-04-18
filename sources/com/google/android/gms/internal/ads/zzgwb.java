package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgwb extends zzhbe implements zzhcq {
    private static final zzgwb zza;
    private static volatile zzhcx zzb;
    private String zzc = "";
    private zzgzs zzd = zzgzs.zzb;
    private int zze;

    static {
        zzgwb zzgwbVar = new zzgwb();
        zza = zzgwbVar;
        zzhbe.zzcb(zzgwb.class, zzgwbVar);
    }

    private zzgwb() {
    }

    public static zzgvz zza() {
        return (zzgvz) zza.zzaZ();
    }

    public static zzgwb zze() {
        return zza;
    }

    public static /* synthetic */ void zzh(zzgwb zzgwbVar, String str) {
        str.getClass();
        zzgwbVar.zzc = str;
    }

    public static /* synthetic */ void zzi(zzgwb zzgwbVar, zzgzs zzgzsVar) {
        zzgzsVar.getClass();
        zzgwbVar.zzd = zzgzsVar;
    }

    public final zzgwa zzc() {
        int i2 = this.zze;
        zzgwa zzgwaVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : zzgwa.REMOTE : zzgwa.ASYMMETRIC_PUBLIC : zzgwa.ASYMMETRIC_PRIVATE : zzgwa.SYMMETRIC : zzgwa.UNKNOWN_KEYMATERIAL;
        return zzgwaVar == null ? zzgwa.UNRECOGNIZED : zzgwaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        zzgvy zzgvyVar = null;
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgwb();
            case NEW_BUILDER:
                return new zzgvz(zzgvyVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzgwb.class) {
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

    public final zzgzs zzf() {
        return this.zzd;
    }

    public final String zzg() {
        return this.zzc;
    }
}
