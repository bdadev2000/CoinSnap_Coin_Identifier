package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentTransaction;

/* loaded from: classes2.dex */
public final class zzaup extends zzhbo implements zzhdf {
    private static final zzaup zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private long zzw;
    private long zzx;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private int zzj = 1000;
    private long zzk = -1;
    private long zzl = -1;
    private long zzm = -1;
    private int zzn = 1000;
    private long zzo = -1;
    private long zzp = -1;
    private long zzu = -1;
    private long zzv = -1;
    private long zzy = -1;
    private long zzz = -1;
    private long zzA = -1;
    private long zzB = -1;

    static {
        zzaup zzaupVar = new zzaup();
        zza = zzaupVar;
        zzhbo.zzca(zzaup.class, zzaupVar);
    }

    private zzaup() {
    }

    public static zzauo zza() {
        return (zzauo) zza.zzaZ();
    }

    public static /* synthetic */ void zzd(zzaup zzaupVar, long j7) {
        zzaupVar.zzc |= 1;
        zzaupVar.zzd = j7;
    }

    public static /* synthetic */ void zze(zzaup zzaupVar, long j7) {
        zzaupVar.zzc |= 2;
        zzaupVar.zze = j7;
    }

    public static /* synthetic */ void zzf(zzaup zzaupVar, long j7) {
        zzaupVar.zzc |= 4;
        zzaupVar.zzf = j7;
    }

    public static /* synthetic */ void zzg(zzaup zzaupVar, long j7) {
        zzaupVar.zzc |= 8;
        zzaupVar.zzg = j7;
    }

    public static /* synthetic */ void zzh(zzaup zzaupVar) {
        zzaupVar.zzc &= -9;
        zzaupVar.zzg = -1L;
    }

    public static /* synthetic */ void zzi(zzaup zzaupVar, long j7) {
        zzaupVar.zzc |= 16;
        zzaupVar.zzh = j7;
    }

    public static /* synthetic */ void zzj(zzaup zzaupVar, long j7) {
        zzaupVar.zzc |= 32;
        zzaupVar.zzi = j7;
    }

    public static /* synthetic */ void zzk(zzaup zzaupVar, zzavc zzavcVar) {
        zzaupVar.zzj = zzavcVar.zza();
        zzaupVar.zzc |= 64;
    }

    public static /* synthetic */ void zzl(zzaup zzaupVar, long j7) {
        zzaupVar.zzc |= 128;
        zzaupVar.zzk = j7;
    }

    public static /* synthetic */ void zzm(zzaup zzaupVar, long j7) {
        zzaupVar.zzc |= NotificationCompat.FLAG_LOCAL_ONLY;
        zzaupVar.zzl = j7;
    }

    public static /* synthetic */ void zzn(zzaup zzaupVar, long j7) {
        zzaupVar.zzc |= 512;
        zzaupVar.zzm = j7;
    }

    public static /* synthetic */ void zzo(zzaup zzaupVar, zzavc zzavcVar) {
        zzaupVar.zzn = zzavcVar.zza();
        zzaupVar.zzc |= 1024;
    }

    public static /* synthetic */ void zzp(zzaup zzaupVar, long j7) {
        zzaupVar.zzc |= 2048;
        zzaupVar.zzo = j7;
    }

    public static /* synthetic */ void zzq(zzaup zzaupVar, long j7) {
        zzaupVar.zzc |= 4096;
        zzaupVar.zzp = j7;
    }

    public static /* synthetic */ void zzr(zzaup zzaupVar, long j7) {
        zzaupVar.zzc |= FragmentTransaction.TRANSIT_EXIT_MASK;
        zzaupVar.zzu = j7;
    }

    public static /* synthetic */ void zzs(zzaup zzaupVar, long j7) {
        zzaupVar.zzc |= 16384;
        zzaupVar.zzv = j7;
    }

    public static /* synthetic */ void zzt(zzaup zzaupVar, long j7) {
        zzaupVar.zzc |= 32768;
        zzaupVar.zzw = j7;
    }

    public static /* synthetic */ void zzu(zzaup zzaupVar, long j7) {
        zzaupVar.zzc |= 65536;
        zzaupVar.zzx = j7;
    }

    public static /* synthetic */ void zzv(zzaup zzaupVar, long j7) {
        zzaupVar.zzc |= 131072;
        zzaupVar.zzy = j7;
    }

    public static /* synthetic */ void zzw(zzaup zzaupVar, long j7) {
        zzaupVar.zzc |= 262144;
        zzaupVar.zzz = j7;
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzato zzatoVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                zzhbu zzhbuVar = zzavb.zza;
                return zzhbo.zzbR(zza, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzhbuVar, "zzk", "zzl", "zzm", "zzn", zzhbuVar, "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB"});
            case NEW_MUTABLE_INSTANCE:
                return new zzaup();
            case NEW_BUILDER:
                return new zzauo(zzatoVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzaup.class) {
                        try {
                            zzhdmVar = zzb;
                            if (zzhdmVar == null) {
                                zzhdmVar = new zzhbj(zza);
                                zzb = zzhdmVar;
                            }
                        } finally {
                        }
                    }
                }
                return zzhdmVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
