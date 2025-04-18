package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* loaded from: classes3.dex */
public final class zzasx extends zzgyx implements zzhaj {
    private static final zzasx zza;
    private static volatile zzhaq zzb;
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
        zzasx zzasxVar = new zzasx();
        zza = zzasxVar;
        zzgyx.zzcb(zzasx.class, zzasxVar);
    }

    private zzasx() {
    }

    public static zzasw zza() {
        return (zzasw) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzasx zzasxVar) {
        zzasxVar.zzc &= -9;
        zzasxVar.zzg = -1L;
    }

    public static /* synthetic */ void zzd(zzasx zzasxVar, long j3) {
        zzasxVar.zzc |= 8;
        zzasxVar.zzg = j3;
    }

    public static /* synthetic */ void zzf(zzasx zzasxVar, long j3) {
        zzasxVar.zzc |= 32;
        zzasxVar.zzi = j3;
    }

    public static /* synthetic */ void zzg(zzasx zzasxVar, long j3) {
        zzasxVar.zzc |= 4096;
        zzasxVar.zzp = j3;
    }

    public static /* synthetic */ void zzh(zzasx zzasxVar, long j3) {
        zzasxVar.zzc |= 512;
        zzasxVar.zzm = j3;
    }

    public static /* synthetic */ void zzi(zzasx zzasxVar, long j3) {
        zzasxVar.zzc |= 2048;
        zzasxVar.zzo = j3;
    }

    public static /* synthetic */ void zzj(zzasx zzasxVar, long j3) {
        zzasxVar.zzc |= 4;
        zzasxVar.zzf = j3;
    }

    public static /* synthetic */ void zzk(zzasx zzasxVar, long j3) {
        zzasxVar.zzc |= 16;
        zzasxVar.zzh = j3;
    }

    public static /* synthetic */ void zzl(zzasx zzasxVar, long j3) {
        zzasxVar.zzc |= 128;
        zzasxVar.zzk = j3;
    }

    public static /* synthetic */ void zzm(zzasx zzasxVar, long j3) {
        zzasxVar.zzc |= 131072;
        zzasxVar.zzy = j3;
    }

    public static /* synthetic */ void zzn(zzasx zzasxVar, long j3) {
        zzasxVar.zzc |= 1;
        zzasxVar.zzd = j3;
    }

    public static /* synthetic */ void zzo(zzasx zzasxVar, long j3) {
        zzasxVar.zzc |= 262144;
        zzasxVar.zzz = j3;
    }

    public static /* synthetic */ void zzp(zzasx zzasxVar, long j3) {
        zzasxVar.zzc |= 2;
        zzasxVar.zze = j3;
    }

    public static /* synthetic */ void zzq(zzasx zzasxVar, long j3) {
        zzasxVar.zzc |= NotificationCompat.FLAG_LOCAL_ONLY;
        zzasxVar.zzl = j3;
    }

    public static /* synthetic */ void zzr(zzasx zzasxVar, long j3) {
        zzasxVar.zzc |= 32768;
        zzasxVar.zzw = j3;
    }

    public static /* synthetic */ void zzs(zzasx zzasxVar, long j3) {
        zzasxVar.zzc |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
        zzasxVar.zzx = j3;
    }

    public static /* synthetic */ void zzt(zzasx zzasxVar, long j3) {
        zzasxVar.zzc |= 8192;
        zzasxVar.zzu = j3;
    }

    public static /* synthetic */ void zzu(zzasx zzasxVar, long j3) {
        zzasxVar.zzc |= JsonLexerKt.BATCH_SIZE;
        zzasxVar.zzv = j3;
    }

    public static /* synthetic */ void zzv(zzasx zzasxVar, int i10) {
        zzasxVar.zzn = i10 - 1;
        zzasxVar.zzc |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
    }

    public static /* synthetic */ void zzw(zzasx zzasxVar, int i10) {
        zzasxVar.zzj = i10 - 1;
        zzasxVar.zzc |= 64;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzatq zzatqVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                zzgzd zzgzdVar = zzatg.zza;
                return zzgyx.zzbS(zza, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzgzdVar, "zzk", "zzl", "zzm", "zzn", zzgzdVar, "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB"});
            case NEW_MUTABLE_INSTANCE:
                return new zzasx();
            case NEW_BUILDER:
                return new zzasw(zzatqVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzasx.class) {
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
