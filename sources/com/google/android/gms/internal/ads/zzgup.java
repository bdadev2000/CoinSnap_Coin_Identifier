package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgup extends zzgyx implements zzhaj {
    private static final zzgup zza;
    private static volatile zzhaq zzb;
    private String zzc = "";
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzgup zzgupVar = new zzgup();
        zza = zzgupVar;
        zzgyx.zzcb(zzgup.class, zzgupVar);
    }

    private zzgup() {
    }

    public static zzguo zza() {
        return (zzguo) zza.zzaZ();
    }

    public static /* bridge */ /* synthetic */ zzgup zzb() {
        return zza;
    }

    public static /* synthetic */ void zzc(zzgup zzgupVar, int i10) {
        zzgupVar.zze = i10;
    }

    public static /* synthetic */ void zzd(zzgup zzgupVar, zzgve zzgveVar) {
        zzgupVar.zzf = zzgveVar.zza();
    }

    public static /* synthetic */ void zzf(zzgup zzgupVar, String str) {
        str.getClass();
        zzgupVar.zzc = str;
    }

    public static /* synthetic */ void zzg(zzgup zzgupVar, int i10) {
        zzgupVar.zzd = zzgub.zza(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzguq zzguqVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgup();
            case NEW_BUILDER:
                return new zzguo(zzguqVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzgup.class) {
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
}
