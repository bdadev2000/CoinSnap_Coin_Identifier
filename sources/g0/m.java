package g0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class m extends v3.c {

    /* renamed from: d, reason: collision with root package name */
    public static Class f17917d = null;

    /* renamed from: f, reason: collision with root package name */
    public static Constructor f17918f = null;

    /* renamed from: g, reason: collision with root package name */
    public static Method f17919g = null;

    /* renamed from: h, reason: collision with root package name */
    public static Method f17920h = null;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f17921i = false;

    public static boolean F(boolean z10, String str, int i10, Object obj) {
        G();
        try {
            return ((Boolean) f17919g.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void G() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f17921i) {
            return;
        }
        f17921i = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f17918f = constructor;
        f17917d = cls;
        f17919g = method2;
        f17920h = method;
    }

    @Override // v3.c
    public Typeface v(Context context, f0.f fVar, Resources resources, int i10) {
        G();
        try {
            Object newInstance = f17918f.newInstance(new Object[0]);
            for (f0.g gVar : fVar.a) {
                File D = com.bumptech.glide.c.D(context);
                if (D == null) {
                    return null;
                }
                try {
                    if (!com.bumptech.glide.c.n(D, resources, gVar.f17522f)) {
                        return null;
                    }
                    if (!F(gVar.f17519c, D.getPath(), gVar.f17518b, newInstance)) {
                        return null;
                    }
                    D.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    D.delete();
                }
            }
            G();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f17917d, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f17920h.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // v3.c
    public Typeface w(Context context, k0.h[] hVarArr, int i10) {
        File file;
        String readlink;
        if (hVarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(C(i10, hVarArr).a, CampaignEx.JSON_KEY_AD_R, null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                } finally {
                }
            } catch (ErrnoException unused) {
            }
            try {
                if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                    file = new File(readlink);
                    if (file != null && file.canRead()) {
                        Typeface createFromFile = Typeface.createFromFile(file);
                        openFileDescriptor.close();
                        return createFromFile;
                    }
                    FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                    Typeface x10 = x(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return x10;
                }
                Typeface x102 = x(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return x102;
            } finally {
            }
            file = null;
            if (file != null) {
                Typeface createFromFile2 = Typeface.createFromFile(file);
                openFileDescriptor.close();
                return createFromFile2;
            }
            FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
        } catch (IOException unused2) {
            return null;
        }
    }
}
