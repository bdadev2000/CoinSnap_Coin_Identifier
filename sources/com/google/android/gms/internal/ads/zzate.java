package com.google.android.gms.internal.ads;

import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public final class zzate extends zzhbe implements zzhcq {
    private static final zzate zza;
    private static volatile zzhcx zzb;
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
        zzate zzateVar = new zzate();
        zza = zzateVar;
        zzhbe.zzcb(zzate.class, zzateVar);
    }

    private zzate() {
    }

    public static zzatd zza() {
        return (zzatd) zza.zzaZ();
    }

    public static /* synthetic */ void zzd(zzate zzateVar, long j2) {
        zzateVar.zzc |= 1;
        zzateVar.zzd = j2;
    }

    public static /* synthetic */ void zze(zzate zzateVar, long j2) {
        zzateVar.zzc |= 2;
        zzateVar.zze = j2;
    }

    public static /* synthetic */ void zzf(zzate zzateVar, long j2) {
        zzateVar.zzc |= 4;
        zzateVar.zzf = j2;
    }

    public static /* synthetic */ void zzg(zzate zzateVar, long j2) {
        zzateVar.zzc |= 8;
        zzateVar.zzg = j2;
    }

    public static /* synthetic */ void zzh(zzate zzateVar) {
        zzateVar.zzc &= -9;
        zzateVar.zzg = -1L;
    }

    public static /* synthetic */ void zzi(zzate zzateVar, long j2) {
        zzateVar.zzc |= 16;
        zzateVar.zzh = j2;
    }

    public static /* synthetic */ void zzj(zzate zzateVar, long j2) {
        zzateVar.zzc |= 32;
        zzateVar.zzi = j2;
    }

    public static /* synthetic */ void zzk(zzate zzateVar, long j2) {
        zzateVar.zzc |= 128;
        zzateVar.zzk = j2;
    }

    public static /* synthetic */ void zzl(zzate zzateVar, long j2) {
        zzateVar.zzc |= 256;
        zzateVar.zzl = j2;
    }

    public static /* synthetic */ void zzm(zzate zzateVar, long j2) {
        zzateVar.zzc |= 512;
        zzateVar.zzm = j2;
    }

    public static /* synthetic */ void zzn(zzate zzateVar, long j2) {
        zzateVar.zzc |= Opcodes.ACC_STRICT;
        zzateVar.zzo = j2;
    }

    public static /* synthetic */ void zzo(zzate zzateVar, long j2) {
        zzateVar.zzc |= 4096;
        zzateVar.zzp = j2;
    }

    public static /* synthetic */ void zzp(zzate zzateVar, long j2) {
        zzateVar.zzc |= 8192;
        zzateVar.zzu = j2;
    }

    public static /* synthetic */ void zzq(zzate zzateVar, long j2) {
        zzateVar.zzc |= 16384;
        zzateVar.zzv = j2;
    }

    public static /* synthetic */ void zzr(zzate zzateVar, long j2) {
        zzateVar.zzc |= 32768;
        zzateVar.zzw = j2;
    }

    public static /* synthetic */ void zzs(zzate zzateVar, long j2) {
        zzateVar.zzc |= 65536;
        zzateVar.zzx = j2;
    }

    public static /* synthetic */ void zzt(zzate zzateVar, long j2) {
        zzateVar.zzc |= Opcodes.ACC_DEPRECATED;
        zzateVar.zzy = j2;
    }

    public static /* synthetic */ void zzu(zzate zzateVar, long j2) {
        zzateVar.zzc |= Opcodes.ASM4;
        zzateVar.zzz = j2;
    }

    public static /* synthetic */ void zzv(zzate zzateVar, int i2) {
        zzateVar.zzj = i2 - 1;
        zzateVar.zzc |= 64;
    }

    public static /* synthetic */ void zzw(zzate zzateVar, int i2) {
        zzateVar.zzn = i2 - 1;
        zzateVar.zzc |= 1024;
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        zzasl zzaslVar = null;
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                zzhbk zzhbkVar = zzatn.zza;
                return zzhbe.zzbS(zza, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzhbkVar, "zzk", "zzl", "zzm", "zzn", zzhbkVar, "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB"});
            case NEW_MUTABLE_INSTANCE:
                return new zzate();
            case NEW_BUILDER:
                return new zzatd(zzaslVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzate.class) {
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
}
