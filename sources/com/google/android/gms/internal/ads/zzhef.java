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
public final class zzhef {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzhee zzf;
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhef.<clinit>():void");
    }

    private zzhef() {
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
        int i2 = zzgzf.zza;
        Field zzF = zzF(Buffer.class, "effectiveDirectAddress");
        if (zzF != null) {
            return zzF;
        }
        Field zzF2 = zzF(Buffer.class, "address");
        if (zzF2 == null || zzF2.getType() != Long.TYPE) {
            return null;
        }
        return zzF2;
    }

    private static Field zzF(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzG(Object obj, long j2, byte b2) {
        zzhee zzheeVar = zzf;
        long j3 = (-4) & j2;
        int i2 = zzheeVar.zza.getInt(obj, j3);
        int i3 = ((~((int) j2)) & 3) << 3;
        zzheeVar.zza.putInt(obj, j3, ((255 & b2) << i3) | (i2 & (~(255 << i3))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzH(Object obj, long j2, byte b2) {
        zzhee zzheeVar = zzf;
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        zzheeVar.zza.putInt(obj, j3, ((255 & b2) << i2) | (zzheeVar.zza.getInt(obj, j3) & (~(255 << i2))));
    }

    public static byte zza(long j2) {
        return zzf.zza(j2);
    }

    public static double zzb(Object obj, long j2) {
        return zzf.zzb(obj, j2);
    }

    public static float zzc(Object obj, long j2) {
        return zzf.zzc(obj, j2);
    }

    public static int zzd(Object obj, long j2) {
        return zzf.zza.getInt(obj, j2);
    }

    public static long zze(ByteBuffer byteBuffer) {
        zzhee zzheeVar = zzf;
        return zzheeVar.zza.getLong(byteBuffer, zzi);
    }

    public static long zzf(Object obj, long j2) {
        return zzf.zza.getLong(obj, j2);
    }

    public static Object zzg(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static Object zzh(Object obj, long j2) {
        return zzf.zza.getObject(obj, j2);
    }

    public static Unsafe zzi() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzheb());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void zzj(Throwable th) {
        Logger.getLogger(zzhef.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static void zzo(long j2, byte[] bArr, long j3, long j4) {
        zzf.zzd(j2, bArr, j3, j4);
    }

    public static void zzp(Object obj, long j2, boolean z2) {
        zzf.zze(obj, j2, z2);
    }

    public static void zzq(byte[] bArr, long j2, byte b2) {
        zzf.zzf(bArr, zza + j2, b2);
    }

    public static void zzr(Object obj, long j2, double d) {
        zzf.zzg(obj, j2, d);
    }

    public static void zzs(Object obj, long j2, float f2) {
        zzf.zzh(obj, j2, f2);
    }

    public static void zzt(Object obj, long j2, int i2) {
        zzf.zza.putInt(obj, j2, i2);
    }

    public static void zzu(Object obj, long j2, long j3) {
        zzf.zza.putLong(obj, j2, j3);
    }

    public static void zzv(Object obj, long j2, Object obj2) {
        zzf.zza.putObject(obj, j2, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean zzw(Object obj, long j2) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean zzx(Object obj, long j2) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean zzy(Class cls) {
        int i2 = zzgzf.zza;
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

    public static boolean zzz(Object obj, long j2) {
        return zzf.zzi(obj, j2);
    }
}
