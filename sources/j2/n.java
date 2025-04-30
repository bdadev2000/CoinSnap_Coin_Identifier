package j2;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f21025a = "0123456789abcdef".toCharArray();
    public static final char[] b = new char[64];

    /* renamed from: c, reason: collision with root package name */
    public static volatile Handler f21026c;

    public static void a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
        } else {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static int c(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static int d(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i9 = m.f21024a[config.ordinal()];
        if (i9 == 1) {
            return 1;
        }
        if (i9 == 2 || i9 == 3) {
            return 2;
        }
        if (i9 != 4) {
            return 4;
        }
        return 8;
    }

    public static ArrayList e(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Handler f() {
        if (f21026c == null) {
            synchronized (n.class) {
                try {
                    if (f21026c == null) {
                        f21026c = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return f21026c;
    }

    public static int g(int i9, int i10) {
        return (i10 * 31) + i9;
    }

    public static int h(int i9, Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return g(hashCode, i9);
    }

    public static boolean i(int i9, int i10) {
        if ((i9 <= 0 && i9 != Integer.MIN_VALUE) || (i10 <= 0 && i10 != Integer.MIN_VALUE)) {
            return false;
        }
        return true;
    }
}
