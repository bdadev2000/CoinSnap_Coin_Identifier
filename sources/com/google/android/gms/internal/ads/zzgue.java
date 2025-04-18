package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgue extends zzgyx implements zzhaj {
    private static final zzgue zza;
    private static volatile zzhaq zzb;
    private String zzc = "";
    private zzgxp zzd = zzgxp.zzb;
    private int zze;

    static {
        zzgue zzgueVar = new zzgue();
        zza = zzgueVar;
        zzgyx.zzcb(zzgue.class, zzgueVar);
    }

    private zzgue() {
    }

    public static zzguc zza() {
        return (zzguc) zza.zzaZ();
    }

    public static zzguc zzb(zzgue zzgueVar) {
        return (zzguc) zza.zzba(zzgueVar);
    }

    public static zzgue zzd() {
        return zza;
    }

    public static zzgue zzf(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
        return (zzgue) zzgyx.zzbx(zza, bArr, zzgyhVar);
    }

    public static /* synthetic */ void zzk(zzgue zzgueVar, String str) {
        str.getClass();
        zzgueVar.zzc = str;
    }

    public static /* synthetic */ void zzl(zzgue zzgueVar, zzgxp zzgxpVar) {
        zzgxpVar.getClass();
        zzgueVar.zzd = zzgxpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzgud zzgudVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgue();
            case NEW_BUILDER:
                return new zzguc(zzgudVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzgue.class) {
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

    public final zzgve zzg() {
        zzgve zzb2 = zzgve.zzb(this.zze);
        return zzb2 == null ? zzgve.UNRECOGNIZED : zzb2;
    }

    public final zzgxp zzh() {
        return this.zzd;
    }

    public final String zzi() {
        return this.zzc;
    }
}
