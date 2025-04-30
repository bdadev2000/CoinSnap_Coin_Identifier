package L;

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
public class k extends android.support.v4.media.session.a {
    public static Class b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Constructor f1675c = null;

    /* renamed from: d, reason: collision with root package name */
    public static Method f1676d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Method f1677e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f1678f = false;

    public static boolean y(boolean z8, String str, int i9, Object obj) {
        z();
        try {
            return ((Boolean) f1676d.invoke(obj, str, Integer.valueOf(i9), Boolean.valueOf(z8))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static void z() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f1678f) {
            return;
        }
        f1678f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            Log.e("TypefaceCompatApi21Impl", e4.getClass().getName(), e4);
            method = null;
            cls = null;
            method2 = null;
        }
        f1675c = constructor;
        b = cls;
        f1676d = method2;
        f1677e = method;
    }

    @Override // android.support.v4.media.session.a
    public Typeface h(Context context, K.f fVar, Resources resources, int i9) {
        z();
        try {
            Object newInstance = f1675c.newInstance(null);
            for (K.g gVar : fVar.f1618a) {
                File M8 = com.bumptech.glide.c.M(context);
                if (M8 == null) {
                    return null;
                }
                try {
                    if (!com.bumptech.glide.c.H(M8, resources, gVar.f1623f)) {
                        return null;
                    }
                    if (!y(gVar.f1620c, M8.getPath(), gVar.b, newInstance)) {
                        return null;
                    }
                    M8.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    M8.delete();
                }
            }
            z();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) b, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f1677e.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e4) {
                throw new RuntimeException(e4);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    @Override // android.support.v4.media.session.a
    public Typeface i(Context context, Q.g[] gVarArr, int i9) {
        File file;
        String readlink;
        if (gVarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(o(gVarArr, i9).f2461a, CampaignEx.JSON_KEY_AD_R, null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                } catch (Throwable th) {
                    try {
                        openFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
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
                    Typeface j7 = j(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return j7;
                }
                Typeface j72 = j(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return j72;
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
