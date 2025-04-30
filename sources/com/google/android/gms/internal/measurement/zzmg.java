package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzmg {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class<?> zzc;
    private static final boolean zzd;
    private static final boolean zze;
    private static final zzb zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;

    /* loaded from: classes2.dex */
    public static final class zza extends zzb {
        public zza(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.zzmg.zzb
        public final double zza(Object obj, long j7) {
            return Double.longBitsToDouble(zze(obj, j7));
        }

        @Override // com.google.android.gms.internal.measurement.zzmg.zzb
        public final float zzb(Object obj, long j7) {
            return Float.intBitsToFloat(zzd(obj, j7));
        }

        @Override // com.google.android.gms.internal.measurement.zzmg.zzb
        public final boolean zzc(Object obj, long j7) {
            if (zzmg.zza) {
                return zzmg.zzf(obj, j7);
            }
            return zzmg.zzg(obj, j7);
        }

        @Override // com.google.android.gms.internal.measurement.zzmg.zzb
        public final void zza(Object obj, long j7, boolean z8) {
            if (zzmg.zza) {
                zzmg.zza(obj, j7, z8);
            } else {
                zzmg.zzb(obj, j7, z8);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzmg.zzb
        public final void zza(Object obj, long j7, byte b) {
            if (!zzmg.zza) {
                zzmg.zzd(obj, j7, b);
            } else {
                zzmg.zzc(obj, j7, b);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzmg.zzb
        public final void zza(Object obj, long j7, double d2) {
            zza(obj, j7, Double.doubleToLongBits(d2));
        }

        @Override // com.google.android.gms.internal.measurement.zzmg.zzb
        public final void zza(Object obj, long j7, float f9) {
            zza(obj, j7, Float.floatToIntBits(f9));
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class zzb {
        Unsafe zza;

        public zzb(Unsafe unsafe) {
            this.zza = unsafe;
        }

        public abstract double zza(Object obj, long j7);

        public abstract void zza(Object obj, long j7, byte b);

        public abstract void zza(Object obj, long j7, double d2);

        public abstract void zza(Object obj, long j7, float f9);

        public final void zza(Object obj, long j7, int i9) {
            this.zza.putInt(obj, j7, i9);
        }

        public abstract void zza(Object obj, long j7, boolean z8);

        public abstract float zzb(Object obj, long j7);

        public final boolean zzb() {
            Unsafe unsafe = this.zza;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return zzmg.zza() != null;
            } catch (Throwable th) {
                zzmg.zza(th);
                return false;
            }
        }

        public abstract boolean zzc(Object obj, long j7);

        public final int zzd(Object obj, long j7) {
            return this.zza.getInt(obj, j7);
        }

        public final long zze(Object obj, long j7) {
            return this.zza.getLong(obj, j7);
        }

        public final void zza(Object obj, long j7, long j9) {
            this.zza.putLong(obj, j7, j9);
        }

        public final boolean zza() {
            Unsafe unsafe = this.zza;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                zzmg.zza(th);
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class zzc extends zzb {
        public zzc(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.zzmg.zzb
        public final double zza(Object obj, long j7) {
            return Double.longBitsToDouble(zze(obj, j7));
        }

        @Override // com.google.android.gms.internal.measurement.zzmg.zzb
        public final float zzb(Object obj, long j7) {
            return Float.intBitsToFloat(zzd(obj, j7));
        }

        @Override // com.google.android.gms.internal.measurement.zzmg.zzb
        public final boolean zzc(Object obj, long j7) {
            if (zzmg.zza) {
                return zzmg.zzf(obj, j7);
            }
            return zzmg.zzg(obj, j7);
        }

        @Override // com.google.android.gms.internal.measurement.zzmg.zzb
        public final void zza(Object obj, long j7, boolean z8) {
            if (zzmg.zza) {
                zzmg.zza(obj, j7, z8);
            } else {
                zzmg.zzb(obj, j7, z8);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzmg.zzb
        public final void zza(Object obj, long j7, byte b) {
            if (!zzmg.zza) {
                zzmg.zzd(obj, j7, b);
            } else {
                zzmg.zzc(obj, j7, b);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzmg.zzb
        public final void zza(Object obj, long j7, double d2) {
            zza(obj, j7, Double.doubleToLongBits(d2));
        }

        @Override // com.google.android.gms.internal.measurement.zzmg.zzb
        public final void zza(Object obj, long j7, float f9) {
            zza(obj, j7, Float.floatToIntBits(f9));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    static {
        /*
            sun.misc.Unsafe r0 = zzb()
            com.google.android.gms.internal.measurement.zzmg.zzb = r0
            java.lang.Class r1 = com.google.android.gms.internal.measurement.zzht.zza()
            com.google.android.gms.internal.measurement.zzmg.zzc = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r1 = zzd(r1)
            com.google.android.gms.internal.measurement.zzmg.zzd = r1
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r2 = zzd(r2)
            com.google.android.gms.internal.measurement.zzmg.zze = r2
            if (r0 == 0) goto L2e
            if (r1 == 0) goto L26
            com.google.android.gms.internal.measurement.zzmg$zzc r1 = new com.google.android.gms.internal.measurement.zzmg$zzc
            r1.<init>(r0)
            goto L2f
        L26:
            if (r2 == 0) goto L2e
            com.google.android.gms.internal.measurement.zzmg$zza r1 = new com.google.android.gms.internal.measurement.zzmg$zza
            r1.<init>(r0)
            goto L2f
        L2e:
            r1 = 0
        L2f:
            com.google.android.gms.internal.measurement.zzmg.zzf = r1
            r0 = 0
            if (r1 != 0) goto L36
            r2 = r0
            goto L3a
        L36:
            boolean r2 = r1.zzb()
        L3a:
            com.google.android.gms.internal.measurement.zzmg.zzg = r2
            if (r1 != 0) goto L40
            r2 = r0
            goto L44
        L40:
            boolean r2 = r1.zza()
        L44:
            com.google.android.gms.internal.measurement.zzmg.zzh = r2
            java.lang.Class<byte[]> r2 = byte[].class
            int r2 = zzb(r2)
            long r2 = (long) r2
            com.google.android.gms.internal.measurement.zzmg.zzi = r2
            java.lang.Class<boolean[]> r2 = boolean[].class
            zzb(r2)
            zzc(r2)
            java.lang.Class<int[]> r2 = int[].class
            zzb(r2)
            zzc(r2)
            java.lang.Class<long[]> r2 = long[].class
            zzb(r2)
            zzc(r2)
            java.lang.Class<float[]> r2 = float[].class
            zzb(r2)
            zzc(r2)
            java.lang.Class<double[]> r2 = double[].class
            zzb(r2)
            zzc(r2)
            java.lang.Class<java.lang.Object[]> r2 = java.lang.Object[].class
            zzb(r2)
            zzc(r2)
            java.lang.reflect.Field r2 = zze()
            if (r2 == 0) goto L8d
            if (r1 != 0) goto L88
            goto L8d
        L88:
            sun.misc.Unsafe r1 = r1.zza
            r1.objectFieldOffset(r2)
        L8d:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            if (r1 != r2) goto L96
            r0 = 1
        L96:
            com.google.android.gms.internal.measurement.zzmg.zza = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzmg.<clinit>():void");
    }

    private zzmg() {
    }

    public static /* synthetic */ Field zza() {
        return zze();
    }

    private static int zzc(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    public static long zzd(Object obj, long j7) {
        return zzf.zze(obj, j7);
    }

    public static Object zze(Object obj, long j7) {
        return zzf.zza.getObject(obj, j7);
    }

    public static /* synthetic */ boolean zzf(Object obj, long j7) {
        if (((byte) (zzc(obj, (-4) & j7) >>> ((int) (((~j7) & 3) << 3)))) != 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean zzg(Object obj, long j7) {
        if (((byte) (zzc(obj, (-4) & j7) >>> ((int) ((j7 & 3) << 3)))) != 0) {
            return true;
        }
        return false;
    }

    public static boolean zzh(Object obj, long j7) {
        return zzf.zzc(obj, j7);
    }

    public static float zzb(Object obj, long j7) {
        return zzf.zzb(obj, j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzd(Object obj, long j7, byte b) {
        long j9 = (-4) & j7;
        int i9 = (((int) j7) & 3) << 3;
        zza(obj, j9, ((255 & b) << i9) | (zzc(obj, j9) & (~(255 << i9))));
    }

    public static double zza(Object obj, long j7) {
        return zzf.zza(obj, j7);
    }

    private static int zzb(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static int zzc(Object obj, long j7) {
        return zzf.zzd(obj, j7);
    }

    private static Field zze() {
        Field zza2 = zza((Class<?>) Buffer.class, "effectiveDirectAddress");
        if (zza2 != null) {
            return zza2;
        }
        Field zza3 = zza((Class<?>) Buffer.class, "address");
        if (zza3 == null || zza3.getType() != Long.TYPE) {
            return null;
        }
        return zza3;
    }

    public static <T> T zza(Class<T> cls) {
        try {
            return (T) zzb.allocateInstance(cls);
        } catch (InstantiationException e4) {
            throw new IllegalStateException(e4);
        }
    }

    public static void zzc(Object obj, long j7, boolean z8) {
        zzf.zza(obj, j7, z8);
    }

    private static boolean zzd(Class<?> cls) {
        try {
            Class<?> cls2 = zzc;
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

    public static Unsafe zzb() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzmi());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(Object obj, long j7, byte b) {
        long j9 = (-4) & j7;
        int zzc2 = zzc(obj, j9);
        int i9 = ((~((int) j7)) & 3) << 3;
        zza(obj, j9, ((255 & b) << i9) | (zzc2 & (~(255 << i9))));
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ void zza(Throwable th) {
        Logger.getLogger(zzmg.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th)));
    }

    public static /* synthetic */ void zzb(Object obj, long j7, boolean z8) {
        zzd(obj, j7, z8 ? (byte) 1 : (byte) 0);
    }

    public static boolean zzc() {
        return zzh;
    }

    public static /* synthetic */ void zza(Object obj, long j7, boolean z8) {
        zzc(obj, j7, z8 ? (byte) 1 : (byte) 0);
    }

    public static void zza(byte[] bArr, long j7, byte b) {
        zzf.zza((Object) bArr, zzi + j7, b);
    }

    public static void zza(Object obj, long j7, double d2) {
        zzf.zza(obj, j7, d2);
    }

    public static void zza(Object obj, long j7, float f9) {
        zzf.zza(obj, j7, f9);
    }

    public static void zza(Object obj, long j7, int i9) {
        zzf.zza(obj, j7, i9);
    }

    public static boolean zzd() {
        return zzg;
    }

    public static void zza(Object obj, long j7, long j9) {
        zzf.zza(obj, j7, j9);
    }

    public static void zza(Object obj, long j7, Object obj2) {
        zzf.zza.putObject(obj, j7, obj2);
    }
}
