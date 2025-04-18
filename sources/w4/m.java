package w4;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class m {
    public static final char[] a = "0123456789abcdef".toCharArray();

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f26739b = new char[64];

    /* renamed from: c, reason: collision with root package name */
    public static volatile Handler f26740c;

    public static void a() {
        boolean z10;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
        } else {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
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

    public static ArrayList d(Set set) {
        ArrayList arrayList = new ArrayList(set.size());
        for (Object obj : set) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Handler e() {
        if (f26740c == null) {
            synchronized (m.class) {
                if (f26740c == null) {
                    f26740c = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f26740c;
    }

    public static int f(int i10, Object obj) {
        return (i10 * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public static int g(int i10, boolean z10) {
        return (i10 * 31) + (z10 ? 1 : 0);
    }

    public static boolean h(int i10, int i11) {
        if (i10 > 0 || i10 == Integer.MIN_VALUE) {
            return i11 > 0 || i11 == Integer.MIN_VALUE;
        }
        return false;
    }
}
