package g0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* loaded from: classes.dex */
public final class n extends v3.c {

    /* renamed from: d, reason: collision with root package name */
    public static final Class f17922d;

    /* renamed from: f, reason: collision with root package name */
    public static final Constructor f17923f;

    /* renamed from: g, reason: collision with root package name */
    public static final Method f17924g;

    /* renamed from: h, reason: collision with root package name */
    public static final Method f17925h;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f17923f = constructor;
        f17922d = cls;
        f17924g = method2;
        f17925h = method;
    }

    public static boolean F(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        try {
            return ((Boolean) f17924g.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // v3.c
    public final Typeface v(Context context, f0.f fVar, Resources resources, int i10) {
        Object obj;
        MappedByteBuffer mappedByteBuffer;
        try {
            obj = f17923f.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (f0.g gVar : fVar.a) {
            int i11 = gVar.f17522f;
            File D = com.bumptech.glide.c.D(context);
            if (D != null) {
                try {
                    if (com.bumptech.glide.c.n(D, resources, i11)) {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(D);
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                            } finally {
                                break;
                            }
                        } catch (IOException unused2) {
                            mappedByteBuffer = null;
                        }
                        if (mappedByteBuffer != null || !F(obj, mappedByteBuffer, gVar.f17521e, gVar.f17518b, gVar.f17519c)) {
                            return null;
                        }
                    }
                } finally {
                    D.delete();
                }
            }
            mappedByteBuffer = null;
            if (mappedByteBuffer != null) {
                return null;
            }
        }
        try {
            Object newInstance = Array.newInstance((Class<?>) f17922d, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f17925h.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused3) {
            return null;
        }
    }

    @Override // v3.c
    public final Typeface w(Context context, k0.h[] hVarArr, int i10) {
        Object obj;
        Typeface typeface;
        try {
            obj = f17923f.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        r.k kVar = new r.k();
        for (k0.h hVar : hVarArr) {
            Uri uri = hVar.a;
            ByteBuffer byteBuffer = (ByteBuffer) kVar.getOrDefault(uri, null);
            if (byteBuffer == null) {
                byteBuffer = com.bumptech.glide.c.I(context, uri);
                kVar.put(uri, byteBuffer);
            }
            if (byteBuffer == null || !F(obj, byteBuffer, hVar.f20204b, hVar.f20205c, hVar.f20206d)) {
                return null;
            }
        }
        try {
            Object newInstance = Array.newInstance((Class<?>) f17922d, 1);
            Array.set(newInstance, 0, obj);
            typeface = (Typeface) f17925h.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused2) {
            typeface = null;
        }
        if (typeface == null) {
            return null;
        }
        return Typeface.create(typeface, i10);
    }
}
