package L;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public final class l extends android.support.v4.media.session.a {
    public static final Class b;

    /* renamed from: c, reason: collision with root package name */
    public static final Constructor f1679c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f1680d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f1681e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            Log.e("TypefaceCompatApi24Impl", e4.getClass().getName(), e4);
            cls = null;
            method = null;
            method2 = null;
        }
        f1679c = constructor;
        b = cls;
        f1680d = method2;
        f1681e = method;
    }

    public static boolean y(Object obj, ByteBuffer byteBuffer, int i9, int i10, boolean z8) {
        try {
            return ((Boolean) f1680d.invoke(obj, byteBuffer, Integer.valueOf(i9), null, Integer.valueOf(i10), Boolean.valueOf(z8))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface z(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f1681e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b A[SYNTHETIC] */
    @Override // android.support.v4.media.session.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Typeface h(android.content.Context r17, K.f r18, android.content.res.Resources r19, int r20) {
        /*
            r16 = this;
            r1 = 0
            java.lang.reflect.Constructor r0 = L.l.f1679c     // Catch: java.lang.Throwable -> L9
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Throwable -> L9
            r2 = r0
            goto La
        L9:
            r2 = r1
        La:
            if (r2 != 0) goto Ld
            return r1
        Ld:
            r0 = r18
            K.g[] r3 = r0.f1618a
            int r4 = r3.length
            r0 = 0
            r5 = r0
        L14:
            if (r5 >= r4) goto L71
            r6 = r3[r5]
            int r0 = r6.f1623f
            java.io.File r7 = com.bumptech.glide.c.M(r17)
            if (r7 != 0) goto L24
            r8 = r19
        L22:
            r0 = r1
            goto L59
        L24:
            r8 = r19
            boolean r0 = com.bumptech.glide.c.H(r7, r8, r0)     // Catch: java.lang.Throwable -> L6c
            if (r0 != 0) goto L30
            r7.delete()
            goto L22
        L30:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
            r9.<init>(r7)     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
            java.nio.channels.FileChannel r10 = r9.getChannel()     // Catch: java.lang.Throwable -> L49
            long r14 = r10.size()     // Catch: java.lang.Throwable -> L49
            java.nio.channels.FileChannel$MapMode r11 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L49
            r12 = 0
            java.nio.MappedByteBuffer r0 = r10.map(r11, r12, r14)     // Catch: java.lang.Throwable -> L49
            r9.close()     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
            goto L56
        L49:
            r0 = move-exception
            r10 = r0
            r9.close()     // Catch: java.lang.Throwable -> L4f
            goto L54
        L4f:
            r0 = move-exception
            r9 = r0
            r10.addSuppressed(r9)     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
        L54:
            throw r10     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
        L55:
            r0 = r1
        L56:
            r7.delete()
        L59:
            if (r0 != 0) goto L5c
            return r1
        L5c:
            int r7 = r6.b
            boolean r9 = r6.f1620c
            int r6 = r6.f1622e
            boolean r0 = y(r2, r0, r6, r7, r9)
            if (r0 != 0) goto L69
            return r1
        L69:
            int r5 = r5 + 1
            goto L14
        L6c:
            r0 = move-exception
            r7.delete()
            throw r0
        L71:
            android.graphics.Typeface r0 = z(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: L.l.h(android.content.Context, K.f, android.content.res.Resources, int):android.graphics.Typeface");
    }

    @Override // android.support.v4.media.session.a
    public final Typeface i(Context context, Q.g[] gVarArr, int i9) {
        Object obj;
        try {
            obj = f1679c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        x.l lVar = new x.l();
        for (Q.g gVar : gVarArr) {
            Uri uri = gVar.f2461a;
            ByteBuffer byteBuffer = (ByteBuffer) lVar.getOrDefault(uri, null);
            if (byteBuffer == null) {
                byteBuffer = com.bumptech.glide.c.O(context, uri);
                lVar.put(uri, byteBuffer);
            }
            if (byteBuffer == null) {
                return null;
            }
            if (!y(obj, byteBuffer, gVar.b, gVar.f2462c, gVar.f2463d)) {
                return null;
            }
        }
        Typeface z8 = z(obj);
        if (z8 == null) {
            return null;
        }
        return Typeface.create(z8, i9);
    }
}
