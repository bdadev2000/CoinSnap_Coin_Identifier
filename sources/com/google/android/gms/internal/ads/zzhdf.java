package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhdf extends zzgyx implements zzhaj {
    private static final zzhdf zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private zzgxp zzd;
    private zzgxp zze;
    private byte zzf = 2;

    static {
        zzhdf zzhdfVar = new zzhdf();
        zza = zzhdfVar;
        zzgyx.zzcb(zzhdf.class, zzhdfVar);
    }

    private zzhdf() {
        zzgxp zzgxpVar = zzgxp.zzb;
        this.zzd = zzgxpVar;
        this.zze = zzgxpVar;
    }

    public static zzhde zzc() {
        return (zzhde) zza.zzaZ();
    }

    public static /* bridge */ /* synthetic */ zzhdf zzd() {
        return zza;
    }

    public static /* synthetic */ void zzf(zzhdf zzhdfVar, zzgxp zzgxpVar) {
        zzhdfVar.zzc |= 1;
        zzhdfVar.zzd = zzgxpVar;
    }

    public static /* synthetic */ void zzg(zzhdf zzhdfVar, zzgxp zzgxpVar) {
        zzhdfVar.zzc |= 2;
        zzhdfVar.zze = zzgxpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzhfd zzhfdVar = null;
        byte b3 = 1;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzf);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b3 = 0;
                }
                this.zzf = b3;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhdf();
            case NEW_BUILDER:
                return new zzhde(zzhfdVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzhdf.class) {
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
