package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhfa {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzhez zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;

    /* JADX WARN: Removed duplicated region for block: B:15:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    static {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhfa.<clinit>():void");
    }

    private zzhfa() {
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
        int i9 = zzgzm.zza;
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
    public static void zzG(Object obj, long j7, byte b) {
        zzhez zzhezVar = zzf;
        long j9 = (-4) & j7;
        int i9 = zzhezVar.zza.getInt(obj, j9);
        int i10 = ((~((int) j7)) & 3) << 3;
        zzhezVar.zza.putInt(obj, j9, ((255 & b) << i10) | (i9 & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzH(Object obj, long j7, byte b) {
        zzhez zzhezVar = zzf;
        long j9 = (-4) & j7;
        int i9 = (((int) j7) & 3) << 3;
        zzhezVar.zza.putInt(obj, j9, ((255 & b) << i9) | (zzhezVar.zza.getInt(obj, j9) & (~(255 << i9))));
    }

    public static byte zza(long j7) {
        return zzf.zza(j7);
    }

    public static double zzb(Object obj, long j7) {
        return zzf.zzb(obj, j7);
    }

    public static float zzc(Object obj, long j7) {
        return zzf.zzc(obj, j7);
    }

    public static int zzd(Object obj, long j7) {
        return zzf.zza.getInt(obj, j7);
    }

    public static long zze(ByteBuffer byteBuffer) {
        zzhez zzhezVar = zzf;
        return zzhezVar.zza.getLong(byteBuffer, zzi);
    }

    public static long zzf(Object obj, long j7) {
        return zzf.zza.getLong(obj, j7);
    }

    public static Object zzg(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e4) {
            throw new IllegalStateException(e4);
        }
    }

    public static Object zzh(Object obj, long j7) {
        return zzf.zza.getObject(obj, j7);
    }

    public static Unsafe zzi() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzhew());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void zzj(Throwable th) {
        Logger.getLogger(zzhfa.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static void zzo(long j7, byte[] bArr, long j9, long j10) {
        zzf.zzd(j7, bArr, j9, j10);
    }

    public static void zzp(Object obj, long j7, boolean z8) {
        zzf.zze(obj, j7, z8);
    }

    public static void zzq(byte[] bArr, long j7, byte b) {
        zzf.zzf(bArr, zza + j7, b);
    }

    public static void zzr(Object obj, long j7, double d2) {
        zzf.zzg(obj, j7, d2);
    }

    public static void zzs(Object obj, long j7, float f9) {
        zzf.zzh(obj, j7, f9);
    }

    public static void zzt(Object obj, long j7, int i9) {
        zzf.zza.putInt(obj, j7, i9);
    }

    public static void zzu(Object obj, long j7, long j9) {
        zzf.zza.putLong(obj, j7, j9);
    }

    public static void zzv(Object obj, long j7, Object obj2) {
        zzf.zza.putObject(obj, j7, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean zzw(Object obj, long j7) {
        if (((byte) ((zzf.zza.getInt(obj, (-4) & j7) >>> ((int) (((~j7) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ boolean zzx(Object obj, long j7) {
        if (((byte) ((zzf.zza.getInt(obj, (-4) & j7) >>> ((int) ((j7 & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static boolean zzy(Class cls) {
        int i9 = zzgzm.zza;
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

    public static boolean zzz(Object obj, long j7) {
        return zzf.zzi(obj, j7);
    }
}
