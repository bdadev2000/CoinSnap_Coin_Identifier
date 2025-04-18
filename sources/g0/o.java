package g0;

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
public class o extends m {

    /* renamed from: j, reason: collision with root package name */
    public final Class f17926j;

    /* renamed from: k, reason: collision with root package name */
    public final Constructor f17927k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f17928l;

    /* renamed from: m, reason: collision with root package name */
    public final Method f17929m;

    /* renamed from: n, reason: collision with root package name */
    public final Method f17930n;

    /* renamed from: o, reason: collision with root package name */
    public final Method f17931o;

    /* renamed from: p, reason: collision with root package name */
    public final Method f17932p;

    public o() {
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
            method2 = L(cls);
            method3 = M(cls);
            method4 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            method5 = N(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e2.getClass().getName()), e2);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f17926j = cls;
        this.f17927k = constructor;
        this.f17928l = method2;
        this.f17929m = method3;
        this.f17930n = method4;
        this.f17931o = method;
        this.f17932p = method5;
    }

    public static Method L(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public static Method M(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public final boolean H(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f17928l.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface I(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f17926j, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f17932p.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean J(Object obj) {
        try {
            return ((Boolean) this.f17930n.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean K() {
        Method method = this.f17928l;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            return true;
        }
        return false;
    }

    public Method N(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // g0.m, v3.c
    public final Typeface v(Context context, f0.f fVar, Resources resources, int i10) {
        Object obj;
        FontVariationAxis[] fromFontVariationSettings;
        if (!K()) {
            return super.v(context, fVar, resources, i10);
        }
        try {
            obj = this.f17927k.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (f0.g gVar : fVar.a) {
            String str = gVar.a;
            int i11 = gVar.f17521e;
            int i12 = gVar.f17518b;
            boolean z10 = gVar.f17519c;
            fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(gVar.f17520d);
            if (!H(context, obj, str, i11, i12, z10 ? 1 : 0, fromFontVariationSettings)) {
                try {
                    this.f17931o.invoke(obj, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
                return null;
            }
        }
        if (!J(obj)) {
            return null;
        }
        return I(obj);
    }

    @Override // g0.m, v3.c
    public final Typeface w(Context context, k0.h[] hVarArr, int i10) {
        Object obj;
        Typeface I;
        boolean z10;
        Typeface.Builder weight;
        Typeface.Builder italic;
        Typeface build;
        if (hVarArr.length < 1) {
            return null;
        }
        if (!K()) {
            k0.h C = C(i10, hVarArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(C.a, CampaignEx.JSON_KEY_AD_R, null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    d2.a.s();
                    weight = d2.a.i(openFileDescriptor.getFileDescriptor()).setWeight(C.f20205c);
                    italic = weight.setItalic(C.f20206d);
                    build = italic.build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        } else {
            HashMap hashMap = new HashMap();
            for (k0.h hVar : hVarArr) {
                if (hVar.f20207e == 0) {
                    Uri uri = hVar.a;
                    if (!hashMap.containsKey(uri)) {
                        hashMap.put(uri, com.bumptech.glide.c.I(context, uri));
                    }
                }
            }
            Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
            try {
                obj = this.f17927k.newInstance(new Object[0]);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
                obj = null;
            }
            if (obj == null) {
                return null;
            }
            int length = hVarArr.length;
            int i11 = 0;
            boolean z11 = false;
            while (true) {
                Method method = this.f17931o;
                if (i11 < length) {
                    k0.h hVar2 = hVarArr[i11];
                    ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(hVar2.a);
                    if (byteBuffer != null) {
                        try {
                            z10 = ((Boolean) this.f17929m.invoke(obj, byteBuffer, Integer.valueOf(hVar2.f20204b), null, Integer.valueOf(hVar2.f20205c), Integer.valueOf(hVar2.f20206d ? 1 : 0))).booleanValue();
                        } catch (IllegalAccessException | InvocationTargetException unused3) {
                            z10 = false;
                        }
                        if (!z10) {
                            try {
                                method.invoke(obj, new Object[0]);
                                return null;
                            } catch (IllegalAccessException | InvocationTargetException unused4) {
                                return null;
                            }
                        }
                        z11 = true;
                    }
                    i11++;
                    z11 = z11;
                } else {
                    if (!z11) {
                        try {
                            method.invoke(obj, new Object[0]);
                            return null;
                        } catch (IllegalAccessException | InvocationTargetException unused5) {
                            return null;
                        }
                    }
                    if (!J(obj) || (I = I(obj)) == null) {
                        return null;
                    }
                    return Typeface.create(I, i10);
                }
            }
        }
    }

    @Override // v3.c
    public final Typeface y(Context context, Resources resources, int i10, String str, int i11) {
        Object obj;
        if (!K()) {
            return super.y(context, resources, i10, str, i11);
        }
        try {
            obj = this.f17927k.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        if (!H(context, obj, str, 0, -1, -1, null)) {
            try {
                this.f17931o.invoke(obj, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
            return null;
        }
        if (!J(obj)) {
            return null;
        }
        return I(obj);
    }
}
