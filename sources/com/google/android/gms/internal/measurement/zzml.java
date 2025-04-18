package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzml {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class<?> zzc;
    private static final boolean zzd;
    private static final boolean zze;
    private static final zzb zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;

    /* loaded from: classes.dex */
    public static final class zza extends zzb {
        public zza(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final double zza(Object obj, long j2) {
            return Double.longBitsToDouble(zze(obj, j2));
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final float zzb(Object obj, long j2) {
            return Float.intBitsToFloat(zzd(obj, j2));
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final boolean zzc(Object obj, long j2) {
            return zzml.zza ? zzml.zzf(obj, j2) : zzml.zzg(obj, j2);
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final void zza(Object obj, long j2, boolean z2) {
            if (zzml.zza) {
                zzml.zza(obj, j2, z2);
            } else {
                zzml.zzb(obj, j2, z2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final void zza(Object obj, long j2, byte b2) {
            if (!zzml.zza) {
                zzml.zzd(obj, j2, b2);
            } else {
                zzml.zzc(obj, j2, b2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final void zza(Object obj, long j2, double d) {
            zza(obj, j2, Double.doubleToLongBits(d));
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final void zza(Object obj, long j2, float f2) {
            zza(obj, j2, Float.floatToIntBits(f2));
        }
    }

    /* loaded from: classes.dex */
    public static abstract class zzb {
        Unsafe zza;

        public zzb(Unsafe unsafe) {
            this.zza = unsafe;
        }

        public abstract double zza(Object obj, long j2);

        public abstract void zza(Object obj, long j2, byte b2);

        public abstract void zza(Object obj, long j2, double d);

        public abstract void zza(Object obj, long j2, float f2);

        public final void zza(Object obj, long j2, int i2) {
            this.zza.putInt(obj, j2, i2);
        }

        public abstract void zza(Object obj, long j2, boolean z2);

        public abstract float zzb(Object obj, long j2);

        public final boolean zzb() {
            Unsafe unsafe = this.zza;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return zzml.zza() != null;
            } catch (Throwable th) {
                zzml.zza(th);
                return false;
            }
        }

        public abstract boolean zzc(Object obj, long j2);

        public final int zzd(Object obj, long j2) {
            return this.zza.getInt(obj, j2);
        }

        public final long zze(Object obj, long j2) {
            return this.zza.getLong(obj, j2);
        }

        public final void zza(Object obj, long j2, long j3) {
            this.zza.putLong(obj, j2, j3);
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
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                zzml.zza(th);
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class zzc extends zzb {
        public zzc(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final double zza(Object obj, long j2) {
            return Double.longBitsToDouble(zze(obj, j2));
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final float zzb(Object obj, long j2) {
            return Float.intBitsToFloat(zzd(obj, j2));
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final boolean zzc(Object obj, long j2) {
            return zzml.zza ? zzml.zzf(obj, j2) : zzml.zzg(obj, j2);
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final void zza(Object obj, long j2, boolean z2) {
            if (zzml.zza) {
                zzml.zza(obj, j2, z2);
            } else {
                zzml.zzb(obj, j2, z2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final void zza(Object obj, long j2, byte b2) {
            if (!zzml.zza) {
                zzml.zzd(obj, j2, b2);
            } else {
                zzml.zzc(obj, j2, b2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final void zza(Object obj, long j2, double d) {
            zza(obj, j2, Double.doubleToLongBits(d));
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final void zza(Object obj, long j2, float f2) {
            zza(obj, j2, Float.floatToIntBits(f2));
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
            com.google.android.gms.internal.measurement.zzml.zzb = r0
            java.lang.Class r1 = com.google.android.gms.internal.measurement.zzih.zza()
            com.google.android.gms.internal.measurement.zzml.zzc = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r1 = zzd(r1)
            com.google.android.gms.internal.measurement.zzml.zzd = r1
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r2 = zzd(r2)
            com.google.android.gms.internal.measurement.zzml.zze = r2
            if (r0 == 0) goto L2e
            if (r1 == 0) goto L26
            com.google.android.gms.internal.measurement.zzml$zzc r1 = new com.google.android.gms.internal.measurement.zzml$zzc
            r1.<init>(r0)
            goto L2f
        L26:
            if (r2 == 0) goto L2e
            com.google.android.gms.internal.measurement.zzml$zza r1 = new com.google.android.gms.internal.measurement.zzml$zza
            r1.<init>(r0)
            goto L2f
        L2e:
            r1 = 0
        L2f:
            com.google.android.gms.internal.measurement.zzml.zzf = r1
            r0 = 0
            if (r1 != 0) goto L36
            r2 = r0
            goto L3a
        L36:
            boolean r2 = r1.zzb()
        L3a:
            com.google.android.gms.internal.measurement.zzml.zzg = r2
            if (r1 != 0) goto L40
            r2 = r0
            goto L44
        L40:
            boolean r2 = r1.zza()
        L44:
            com.google.android.gms.internal.measurement.zzml.zzh = r2
            java.lang.Class<byte[]> r2 = byte[].class
            int r2 = zzb(r2)
            long r2 = (long) r2
            com.google.android.gms.internal.measurement.zzml.zzi = r2
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
            com.google.android.gms.internal.measurement.zzml.zza = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.<clinit>():void");
    }

    private zzml() {
    }

    public static /* synthetic */ Field zza() {
        return zze();
    }

    public static boolean zzc() {
        return zzh;
    }

    public static boolean zzd() {
        return zzg;
    }

    public static Object zze(Object obj, long j2) {
        return zzf.zza.getObject(obj, j2);
    }

    public static /* synthetic */ boolean zzf(Object obj, long j2) {
        return ((byte) (zzc(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3)))) != 0;
    }

    public static /* synthetic */ boolean zzg(Object obj, long j2) {
        return ((byte) (zzc(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3)))) != 0;
    }

    public static boolean zzh(Object obj, long j2) {
        return zzf.zzc(obj, j2);
    }

    public static float zzb(Object obj, long j2) {
        return zzf.zzb(obj, j2);
    }

    private static int zzc(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    public static long zzd(Object obj, long j2) {
        return zzf.zze(obj, j2);
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

    public static double zza(Object obj, long j2) {
        return zzf.zza(obj, j2);
    }

    private static int zzb(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static int zzc(Object obj, long j2) {
        return zzf.zzd(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzd(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        zza(obj, j3, ((255 & b2) << i2) | (zzc(obj, j3) & (~(255 << i2))));
    }

    public static <T> T zza(Class<T> cls) {
        try {
            return (T) zzb.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static Unsafe zzb() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzmn());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void zzc(Object obj, long j2, boolean z2) {
        zzf.zza(obj, j2, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int zzc2 = zzc(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        zza(obj, j3, ((255 & b2) << i2) | (zzc2 & (~(255 << i2))));
    }

    private static boolean zzd(Class<?> cls) {
        try {
            Class<?> cls2 = zzc;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
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

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ void zzb(Object obj, long j2, boolean z2) {
        zzd(obj, j2, z2 ? (byte) 1 : (byte) 0);
    }

    public static /* synthetic */ void zza(Throwable th) {
        Logger.getLogger(zzml.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th)));
    }

    public static /* synthetic */ void zza(Object obj, long j2, boolean z2) {
        zzc(obj, j2, z2 ? (byte) 1 : (byte) 0);
    }

    public static void zza(byte[] bArr, long j2, byte b2) {
        zzf.zza((Object) bArr, zzi + j2, b2);
    }

    public static void zza(Object obj, long j2, double d) {
        zzf.zza(obj, j2, d);
    }

    public static void zza(Object obj, long j2, float f2) {
        zzf.zza(obj, j2, f2);
    }

    public static void zza(Object obj, long j2, int i2) {
        zzf.zza(obj, j2, i2);
    }

    public static void zza(Object obj, long j2, long j3) {
        zzf.zza(obj, j2, j3);
    }

    public static void zza(Object obj, long j2, Object obj2) {
        zzf.zza.putObject(obj, j2, obj2);
    }
}
