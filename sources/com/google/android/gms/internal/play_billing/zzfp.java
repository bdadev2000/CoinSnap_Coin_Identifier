package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class zzfp {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzfo zzf;
    private static final boolean zzg;
    private static final boolean zzh;

    /* JADX WARN: Removed duplicated region for block: B:15:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    static {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzfp.<clinit>():void");
    }

    private zzfp() {
    }

    private static int zzA(Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzB() {
        int i10 = zzbb.zza;
        Field zzC = zzC(Buffer.class, "effectiveDirectAddress");
        if (zzC == null) {
            Field zzC2 = zzC(Buffer.class, "address");
            if (zzC2 != null && zzC2.getType() == Long.TYPE) {
                return zzC2;
            }
            return null;
        }
        return zzC;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzD(Object obj, long j3, byte b3) {
        zzfo zzfoVar = zzf;
        long j10 = (-4) & j3;
        int i10 = zzfoVar.zza.getInt(obj, j10);
        int i11 = ((~((int) j3)) & 3) << 3;
        zzfoVar.zza.putInt(obj, j10, ((255 & b3) << i11) | (i10 & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzE(Object obj, long j3, byte b3) {
        zzfo zzfoVar = zzf;
        long j10 = (-4) & j3;
        int i10 = (((int) j3) & 3) << 3;
        zzfoVar.zza.putInt(obj, j10, ((255 & b3) << i10) | (zzfoVar.zza.getInt(obj, j10) & (~(255 << i10))));
    }

    public static double zza(Object obj, long j3) {
        return zzf.zza(obj, j3);
    }

    public static float zzb(Object obj, long j3) {
        return zzf.zzb(obj, j3);
    }

    public static int zzc(Object obj, long j3) {
        return zzf.zza.getInt(obj, j3);
    }

    public static long zzd(Object obj, long j3) {
        return zzf.zza.getLong(obj, j3);
    }

    public static Object zze(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object zzf(Object obj, long j3) {
        return zzf.zza.getObject(obj, j3);
    }

    public static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzfl());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void zzh(Throwable th2) {
        Logger.getLogger(zzfp.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    public static void zzm(Object obj, long j3, boolean z10) {
        zzf.zzc(obj, j3, z10);
    }

    public static void zzn(byte[] bArr, long j3, byte b3) {
        zzf.zzd(bArr, zza + j3, b3);
    }

    public static void zzo(Object obj, long j3, double d10) {
        zzf.zze(obj, j3, d10);
    }

    public static void zzp(Object obj, long j3, float f10) {
        zzf.zzf(obj, j3, f10);
    }

    public static void zzq(Object obj, long j3, int i10) {
        zzf.zza.putInt(obj, j3, i10);
    }

    public static void zzr(Object obj, long j3, long j10) {
        zzf.zza.putLong(obj, j3, j10);
    }

    public static void zzs(Object obj, long j3, Object obj2) {
        zzf.zza.putObject(obj, j3, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean zzt(Object obj, long j3) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j3) >>> ((int) (((~j3) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean zzu(Object obj, long j3) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j3) >>> ((int) ((j3 & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean zzv(Class cls) {
        int i10 = zzbb.zza;
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

    public static boolean zzw(Object obj, long j3) {
        return zzf.zzg(obj, j3);
    }

    public static boolean zzx() {
        return zzh;
    }

    public static boolean zzy() {
        return zzg;
    }

    private static int zzz(Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }
}
