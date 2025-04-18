package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
final class zzhn {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzhm zzf;
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzhn.<clinit>():void");
    }

    private zzhn() {
    }

    private static int zzA(Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzB() {
        int i2 = zzdi.zza;
        Field zzC = zzC(Buffer.class, "effectiveDirectAddress");
        if (zzC != null) {
            return zzC;
        }
        Field zzC2 = zzC(Buffer.class, "address");
        if (zzC2 == null || zzC2.getType() != Long.TYPE) {
            return null;
        }
        return zzC2;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzD(Object obj, long j2, byte b2) {
        zzhm zzhmVar = zzf;
        long j3 = (-4) & j2;
        int i2 = zzhmVar.zza.getInt(obj, j3);
        int i3 = ((~((int) j2)) & 3) << 3;
        zzhmVar.zza.putInt(obj, j3, ((255 & b2) << i3) | (i2 & (~(255 << i3))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzE(Object obj, long j2, byte b2) {
        zzhm zzhmVar = zzf;
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        zzhmVar.zza.putInt(obj, j3, ((255 & b2) << i2) | (zzhmVar.zza.getInt(obj, j3) & (~(255 << i2))));
    }

    public static double zza(Object obj, long j2) {
        return zzf.zza(obj, j2);
    }

    public static float zzb(Object obj, long j2) {
        return zzf.zzb(obj, j2);
    }

    public static int zzc(Object obj, long j2) {
        return zzf.zza.getInt(obj, j2);
    }

    public static long zzd(Object obj, long j2) {
        return zzf.zza.getLong(obj, j2);
    }

    public static Object zze(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static Object zzf(Object obj, long j2) {
        return zzf.zza.getObject(obj, j2);
    }

    public static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzhj());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void zzh(Throwable th) {
        Logger.getLogger(zzhn.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static void zzm(Object obj, long j2, boolean z2) {
        zzf.zzc(obj, j2, z2);
    }

    public static void zzn(byte[] bArr, long j2, byte b2) {
        zzf.zzd(bArr, zza + j2, b2);
    }

    public static void zzo(Object obj, long j2, double d) {
        zzf.zze(obj, j2, d);
    }

    public static void zzp(Object obj, long j2, float f2) {
        zzf.zzf(obj, j2, f2);
    }

    public static void zzq(Object obj, long j2, int i2) {
        zzf.zza.putInt(obj, j2, i2);
    }

    public static void zzr(Object obj, long j2, long j3) {
        zzf.zza.putLong(obj, j2, j3);
    }

    public static void zzs(Object obj, long j2, Object obj2) {
        zzf.zza.putObject(obj, j2, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean zzt(Object obj, long j2) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean zzu(Object obj, long j2) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean zzv(Class cls) {
        int i2 = zzdi.zza;
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

    public static boolean zzw(Object obj, long j2) {
        return zzf.zzg(obj, j2);
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
