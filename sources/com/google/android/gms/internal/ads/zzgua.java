package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgua extends zzgyx implements zzhaj {
    private static final zzgua zza;
    private static volatile zzhaq zzb;
    private String zzc = "";
    private zzgxp zzd = zzgxp.zzb;
    private int zze;

    static {
        zzgua zzguaVar = new zzgua();
        zza = zzguaVar;
        zzgyx.zzcb(zzgua.class, zzguaVar);
    }

    private zzgua() {
    }

    public static zzgtx zza() {
        return (zzgtx) zza.zzaZ();
    }

    public static zzgua zzd() {
        return zza;
    }

    public static /* synthetic */ void zzi(zzgua zzguaVar, String str) {
        str.getClass();
        zzguaVar.zzc = str;
    }

    public static /* synthetic */ void zzj(zzgua zzguaVar, zzgxp zzgxpVar) {
        zzgxpVar.getClass();
        zzguaVar.zzd = zzgxpVar;
    }

    public final zzgty zzb() {
        int i10 = this.zze;
        zzgty zzgtyVar = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? null : zzgty.REMOTE : zzgty.ASYMMETRIC_PUBLIC : zzgty.ASYMMETRIC_PRIVATE : zzgty.SYMMETRIC : zzgty.UNKNOWN_KEYMATERIAL;
        return zzgtyVar == null ? zzgty.UNRECOGNIZED : zzgtyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzgtz zzgtzVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgua();
            case NEW_BUILDER:
                return new zzgtx(zzgtzVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzgua.class) {
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

    public final zzgxp zzf() {
        return this.zzd;
    }

    public final String zzg() {
        return this.zzc;
    }
}
