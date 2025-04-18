package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RequiresApi
@RestrictTo
/* loaded from: classes4.dex */
public class TypefaceCompatApi26Impl extends TypefaceCompatApi21Impl {

    /* renamed from: g, reason: collision with root package name */
    public final Class f18547g;

    /* renamed from: h, reason: collision with root package name */
    public final Constructor f18548h;

    /* renamed from: i, reason: collision with root package name */
    public final Method f18549i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f18550j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f18551k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f18552l;

    /* renamed from: m, reason: collision with root package name */
    public final Method f18553m;

    public TypefaceCompatApi26Impl() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = o(cls);
            method3 = p(cls);
            method4 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            method5 = q(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f18547g = cls;
        this.f18548h = constructor;
        this.f18549i = method2;
        this.f18550j = method3;
        this.f18551k = method4;
        this.f18552l = method;
        this.f18553m = method5;
    }

    public static Method o(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public static Method p(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    @Override // androidx.core.graphics.TypefaceCompatApi21Impl, androidx.core.graphics.TypefaceCompatBaseImpl
    public final Typeface a(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i2) {
        if (!m()) {
            return super.a(context, fontFamilyFilesResourceEntry, resources, i2);
        }
        Object n2 = n();
        if (n2 == null) {
            return null;
        }
        for (FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry : fontFamilyFilesResourceEntry.f18493a) {
            if (!j(context, n2, fontFileResourceEntry.f18494a, fontFileResourceEntry.e, fontFileResourceEntry.f18495b, fontFileResourceEntry.f18496c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fontFileResourceEntry.d))) {
                i(n2);
                return null;
            }
        }
        if (l(n2)) {
            return k(n2);
        }
        return null;
    }

    @Override // androidx.core.graphics.TypefaceCompatApi21Impl, androidx.core.graphics.TypefaceCompatBaseImpl
    public final Typeface b(Context context, FontsContractCompat.FontInfo[] fontInfoArr, int i2) {
        Typeface k2;
        if (fontInfoArr.length < 1) {
            return null;
        }
        if (!m()) {
            FontsContractCompat.FontInfo f2 = f(i2, fontInfoArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(f2.f18643a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(f2.f18645c).setItalic(f2.d).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (FontsContractCompat.FontInfo fontInfo : fontInfoArr) {
            if (fontInfo.e == 0) {
                Uri uri = fontInfo.f18643a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, TypefaceCompatUtil.e(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object n2 = n();
        if (n2 == null) {
            return null;
        }
        int length = fontInfoArr.length;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < length) {
            FontsContractCompat.FontInfo fontInfo2 = fontInfoArr[i3];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(fontInfo2.f18643a);
            if (byteBuffer != null) {
                if (!((Boolean) this.f18550j.invoke(n2, byteBuffer, Integer.valueOf(fontInfo2.f18644b), null, Integer.valueOf(fontInfo2.f18645c), Integer.valueOf(fontInfo2.d ? 1 : 0))).booleanValue()) {
                    i(n2);
                    return null;
                }
                z2 = true;
            }
            i3++;
            z2 = z2;
        }
        if (!z2) {
            i(n2);
            return null;
        }
        if (l(n2) && (k2 = k(n2)) != null) {
            return Typeface.create(k2, i2);
        }
        return null;
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public final Typeface d(Context context, Resources resources, int i2, String str, int i3) {
        if (!m()) {
            return super.d(context, resources, i2, str, i3);
        }
        Object n2 = n();
        if (n2 == null) {
            return null;
        }
        if (!j(context, n2, str, 0, -1, -1, null)) {
            i(n2);
            return null;
        }
        if (l(n2)) {
            return k(n2);
        }
        return null;
    }

    public final void i(Object obj) {
        try {
            this.f18552l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean j(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f18549i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface k(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f18547g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f18553m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean l(Object obj) {
        try {
            return ((Boolean) this.f18551k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean m() {
        Method method = this.f18549i;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public final Object n() {
        try {
            return this.f18548h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method q(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
