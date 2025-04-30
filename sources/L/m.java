package L;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class m extends k {

    /* renamed from: g, reason: collision with root package name */
    public final Class f1682g;

    /* renamed from: h, reason: collision with root package name */
    public final Constructor f1683h;

    /* renamed from: i, reason: collision with root package name */
    public final Method f1684i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f1685j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f1686k;
    public final Method l;
    public final Method m;

    public m() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = G(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = H(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e4.getClass().getName()), e4);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f1682g = cls;
        this.f1683h = constructor;
        this.f1684i = method2;
        this.f1685j = method3;
        this.f1686k = method4;
        this.l = method5;
        this.m = method;
    }

    public static Method G(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void A(Object obj) {
        try {
            this.l.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean B(Context context, Object obj, String str, int i9, int i10, int i11, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f1684i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface C(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f1682g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean D(Object obj) {
        try {
            return ((Boolean) this.f1686k.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean E() {
        Method method = this.f1684i;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            return true;
        }
        return false;
    }

    public final Object F() {
        try {
            return this.f1683h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method H(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // L.k, android.support.v4.media.session.a
    public final Typeface h(Context context, K.f fVar, Resources resources, int i9) {
        if (!E()) {
            return super.h(context, fVar, resources, i9);
        }
        Object F4 = F();
        if (F4 == null) {
            return null;
        }
        for (K.g gVar : fVar.f1618a) {
            if (!B(context, F4, gVar.f1619a, gVar.f1622e, gVar.b, gVar.f1620c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(gVar.f1621d))) {
                A(F4);
                return null;
            }
        }
        if (!D(F4)) {
            return null;
        }
        return C(F4);
    }

    @Override // L.k, android.support.v4.media.session.a
    public final Typeface i(Context context, Q.g[] gVarArr, int i9) {
        Typeface C8;
        boolean z8;
        if (gVarArr.length < 1) {
            return null;
        }
        if (!E()) {
            Q.g o3 = o(gVarArr, i9);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(o3.f2461a, CampaignEx.JSON_KEY_AD_R, null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(o3.f2462c).setItalic(o3.f2463d).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (Q.g gVar : gVarArr) {
            if (gVar.f2464e == 0) {
                Uri uri = gVar.f2461a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, com.bumptech.glide.c.O(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object F4 = F();
        if (F4 == null) {
            return null;
        }
        int length = gVarArr.length;
        int i10 = 0;
        boolean z9 = false;
        while (i10 < length) {
            Q.g gVar2 = gVarArr[i10];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(gVar2.f2461a);
            if (byteBuffer != null) {
                try {
                    z8 = ((Boolean) this.f1685j.invoke(F4, byteBuffer, Integer.valueOf(gVar2.b), null, Integer.valueOf(gVar2.f2462c), Integer.valueOf(gVar2.f2463d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    z8 = false;
                }
                if (!z8) {
                    A(F4);
                    return null;
                }
                z9 = true;
            }
            i10++;
            z9 = z9;
        }
        if (!z9) {
            A(F4);
            return null;
        }
        if (!D(F4) || (C8 = C(F4)) == null) {
            return null;
        }
        return Typeface.create(C8, i9);
    }

    @Override // android.support.v4.media.session.a
    public final Typeface k(Context context, Resources resources, int i9, String str, int i10) {
        if (!E()) {
            return super.k(context, resources, i9, str, i10);
        }
        Object F4 = F();
        if (F4 == null) {
            return null;
        }
        if (!B(context, F4, str, 0, -1, -1, null)) {
            A(F4);
            return null;
        }
        if (!D(F4)) {
            return null;
        }
        return C(F4);
    }
}
