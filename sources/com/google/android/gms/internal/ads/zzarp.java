package com.google.android.gms.internal.ads;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes3.dex */
public final class zzarp extends zzgyx implements zzhaj {
    private static final zzarp zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private long zze;
    private long zzi;
    private long zzj;
    private long zzl;
    private int zzp;
    private String zzd = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzk = "";
    private String zzm = "";
    private String zzn = "";
    private zzgzj zzo = zzgyx.zzbK();

    static {
        zzarp zzarpVar = new zzarp();
        zza = zzarpVar;
        zzgyx.zzcb(zzarp.class, zzarpVar);
    }

    private zzarp() {
    }

    public static zzarl zza() {
        return (zzarl) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzarp zzarpVar, String str) {
        str.getClass();
        zzarpVar.zzc |= 1;
        zzarpVar.zzd = str;
    }

    public static /* synthetic */ void zzd(zzarp zzarpVar, String str) {
        zzarpVar.zzc |= 16;
        zzarpVar.zzh = str;
    }

    public static /* synthetic */ void zzf(zzarp zzarpVar, String str) {
        zzarpVar.zzc |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        zzarpVar.zzn = str;
    }

    public static /* synthetic */ void zzg(zzarp zzarpVar, String str) {
        str.getClass();
        zzarpVar.zzc |= 8;
        zzarpVar.zzg = str;
    }

    public static /* synthetic */ void zzh(zzarp zzarpVar, long j3) {
        zzarpVar.zzc |= 2;
        zzarpVar.zze = j3;
    }

    public static /* synthetic */ void zzi(zzarp zzarpVar, String str) {
        str.getClass();
        zzarpVar.zzc |= 4;
        zzarpVar.zzf = str;
    }

    public static /* synthetic */ void zzj(zzarp zzarpVar, int i10) {
        zzarpVar.zzp = i10 - 1;
        zzarpVar.zzc |= 2048;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", zzarn.class, "zzp", zzaro.zza});
            case NEW_MUTABLE_INSTANCE:
                return new zzarp();
            case NEW_BUILDER:
                return new zzarl(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzarp.class) {
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
