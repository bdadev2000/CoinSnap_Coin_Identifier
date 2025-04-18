package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhbu {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzhbt zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    static {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhbu.<clinit>():void");
    }

    private zzhbu() {
    }

    public static boolean zzA() {
        return zzh;
    }

    public static boolean zzB() {
        return zzg;
    }

    private static int zzC(Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzD(Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzE() {
        int i10 = zzgxc.zza;
        Field zzF = zzF(Buffer.class, "effectiveDirectAddress");
        if (zzF == null) {
            Field zzF2 = zzF(Buffer.class, "address");
            if (zzF2 != null && zzF2.getType() == Long.TYPE) {
                return zzF2;
            }
            return null;
        }
        return zzF;
    }

    private static Field zzF(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzG(Object obj, long j3, byte b3) {
        zzhbt zzhbtVar = zzf;
        long j10 = (-4) & j3;
        int i10 = zzhbtVar.zza.getInt(obj, j10);
        int i11 = ((~((int) j3)) & 3) << 3;
        zzhbtVar.zza.putInt(obj, j10, ((255 & b3) << i11) | (i10 & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzH(Object obj, long j3, byte b3) {
        zzhbt zzhbtVar = zzf;
        long j10 = (-4) & j3;
        int i10 = (((int) j3) & 3) << 3;
        zzhbtVar.zza.putInt(obj, j10, ((255 & b3) << i10) | (zzhbtVar.zza.getInt(obj, j10) & (~(255 << i10))));
    }

    public static byte zza(long j3) {
        return zzf.zza(j3);
    }

    public static double zzb(Object obj, long j3) {
        return zzf.zzb(obj, j3);
    }

    public static float zzc(Object obj, long j3) {
        return zzf.zzc(obj, j3);
    }

    public static int zzd(Object obj, long j3) {
        return zzf.zza.getInt(obj, j3);
    }

    public static long zze(ByteBuffer byteBuffer) {
        zzhbt zzhbtVar = zzf;
        return zzhbtVar.zza.getLong(byteBuffer, zzi);
    }

    public static long zzf(Object obj, long j3) {
        return zzf.zza.getLong(obj, j3);
    }

    public static Object zzg(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object zzh(Object obj, long j3) {
        return zzf.zza.getObject(obj, j3);
    }

    public static Unsafe zzi() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzhbq());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void zzj(Throwable th2) {
        Logger.getLogger(zzhbu.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    public static void zzo(long j3, byte[] bArr, long j10, long j11) {
        zzf.zzd(j3, bArr, j10, j11);
    }

    public static void zzp(Object obj, long j3, boolean z10) {
        zzf.zze(obj, j3, z10);
    }

    public static void zzq(byte[] bArr, long j3, byte b3) {
        zzf.zzf(bArr, zza + j3, b3);
    }

    public static void zzr(Object obj, long j3, double d10) {
        zzf.zzg(obj, j3, d10);
    }

    public static void zzs(Object obj, long j3, float f10) {
        zzf.zzh(obj, j3, f10);
    }

    public static void zzt(Object obj, long j3, int i10) {
        zzf.zza.putInt(obj, j3, i10);
    }

    public static void zzu(Object obj, long j3, long j10) {
        zzf.zza.putLong(obj, j3, j10);
    }

    public static void zzv(Object obj, long j3, Object obj2) {
        zzf.zza.putObject(obj, j3, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean zzw(Object obj, long j3) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j3) >>> ((int) (((~j3) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean zzx(Object obj, long j3) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j3) >>> ((int) ((j3 & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean zzy(Class cls) {
        int i10 = zzgxc.zza;
        try {
            Class cls2 = zzd;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean zzz(Object obj, long j3) {
        return zzf.zzi(obj, j3);
    }
}
