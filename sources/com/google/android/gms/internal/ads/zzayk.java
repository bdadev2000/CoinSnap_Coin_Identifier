package com.google.android.gms.internal.ads;

/* loaded from: classes4.dex */
public final class zzayk extends zzhbe implements zzhcq {
    private static final zzayk zza;
    private static volatile zzhcx zzb;
    private int zzc;
    private String zzd = "";
    private String zze = "";
    private long zzf;
    private long zzg;
    private long zzh;

    static {
        zzayk zzaykVar = new zzayk();
        zza = zzaykVar;
        zzhbe.zzcb(zzayk.class, zzaykVar);
    }

    private zzayk() {
    }

    public static zzayj zze() {
        return (zzayj) zza.zzaZ();
    }

    public static zzayk zzg() {
        return zza;
    }

    public static zzayk zzh(zzgzs zzgzsVar) throws zzhbt {
        return (zzayk) zzhbe.zzbm(zza, zzgzsVar);
    }

    public static zzayk zzi(zzgzs zzgzsVar, zzhao zzhaoVar) throws zzhbt {
        return (zzayk) zzhbe.zzbr(zza, zzgzsVar, zzhaoVar);
    }

    public static /* synthetic */ void zzl(zzayk zzaykVar, String str) {
        str.getClass();
        zzaykVar.zzc |= 1;
        zzaykVar.zzd = str;
    }

    public static /* synthetic */ void zzm(zzayk zzaykVar, long j2) {
        zzaykVar.zzc |= 16;
        zzaykVar.zzh = j2;
    }

    public static /* synthetic */ void zzn(zzayk zzaykVar, String str) {
        str.getClass();
        zzaykVar.zzc |= 2;
        zzaykVar.zze = str;
    }

    public static /* synthetic */ void zzo(zzayk zzaykVar, long j2) {
        zzaykVar.zzc |= 4;
        zzaykVar.zzf = j2;
    }

    public static /* synthetic */ void zzp(zzayk zzaykVar, long j2) {
        zzaykVar.zzc |= 8;
        zzaykVar.zzg = j2;
    }

    public final long zza() {
        return this.zzg;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final long zzd() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        zzayi zzayiVar = null;
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zza, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
            case NEW_MUTABLE_INSTANCE:
                return new zzayk();
            case NEW_BUILDER:
                return new zzayj(zzayiVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzayk.class) {
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

    public final String zzj() {
        return this.zze;
    }

    public final String zzk() {
        return this.zzd;
    }
}
