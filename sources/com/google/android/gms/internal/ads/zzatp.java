package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzatp extends zzgyx implements zzhaj {
    private static final zzatp zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private zzgzj zzd = zzgyx.zzbK();
    private zzgxp zze = zzgxp.zzb;
    private int zzf = 1;
    private int zzg = 1;

    static {
        zzatp zzatpVar = new zzatp();
        zza = zzatpVar;
        zzgyx.zzcb(zzatp.class, zzatpVar);
    }

    private zzatp() {
    }

    public static zzato zza() {
        return (zzato) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzatp zzatpVar, zzgxp zzgxpVar) {
        zzgzj zzgzjVar = zzatpVar.zzd;
        if (!zzgzjVar.zzc()) {
            zzatpVar.zzd = zzgyx.zzbL(zzgzjVar);
        }
        zzatpVar.zzd.add(zzgxpVar);
    }

    public static /* synthetic */ void zzd(zzatp zzatpVar, zzgxp zzgxpVar) {
        zzatpVar.zzc |= 1;
        zzatpVar.zze = zzgxpVar;
    }

    public static /* synthetic */ void zzf(zzatp zzatpVar, int i10) {
        zzatpVar.zzg = i10 - 1;
        zzatpVar.zzc |= 4;
    }

    public static /* synthetic */ void zzg(zzatp zzatpVar, int i10) {
        zzatpVar.zzf = 4;
        zzatpVar.zzc |= 2;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zzc", "zzd", "zze", "zzf", zzatj.zza, "zzg", zzatf.zza});
            case NEW_MUTABLE_INSTANCE:
                return new zzatp();
            case NEW_BUILDER:
                return new zzato(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzatp.class) {
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
