package M;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public abstract class c {
    public static IconCompat a(Icon icon) {
        icon.getClass();
        int d2 = d(icon);
        if (d2 != 2) {
            if (d2 != 4) {
                if (d2 != 6) {
                    IconCompat iconCompat = new IconCompat(-1);
                    iconCompat.b = icon;
                    return iconCompat;
                }
                Uri e4 = e(icon);
                PorterDuff.Mode mode = IconCompat.f4454k;
                e4.getClass();
                String uri = e4.toString();
                uri.getClass();
                IconCompat iconCompat2 = new IconCompat(6);
                iconCompat2.b = uri;
                return iconCompat2;
            }
            Uri e9 = e(icon);
            PorterDuff.Mode mode2 = IconCompat.f4454k;
            e9.getClass();
            String uri2 = e9.toString();
            uri2.getClass();
            IconCompat iconCompat3 = new IconCompat(4);
            iconCompat3.b = uri2;
            return iconCompat3;
        }
        return IconCompat.b(b(icon), c(icon));
    }

    public static int b(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return e.a(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        } catch (NoSuchMethodException e9) {
            Log.e("IconCompat", "Unable to get icon resource", e9);
            return 0;
        } catch (InvocationTargetException e10) {
            Log.e("IconCompat", "Unable to get icon resource", e10);
            return 0;
        }
    }

    public static String c(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return e.b(obj);
        }
        try {
            return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
        } catch (IllegalAccessException e4) {
            Log.e("IconCompat", "Unable to get icon package", e4);
            return null;
        } catch (NoSuchMethodException e9) {
            Log.e("IconCompat", "Unable to get icon package", e9);
            return null;
        } catch (InvocationTargetException e10) {
            Log.e("IconCompat", "Unable to get icon package", e10);
            return null;
        }
    }

    public static int d(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return e.c(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e4) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e4);
            return -1;
        } catch (NoSuchMethodException e9) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e9);
            return -1;
        } catch (InvocationTargetException e10) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e10);
            return -1;
        }
    }

    @Nullable
    public static Uri e(@NonNull Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return e.d(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e4) {
            Log.e("IconCompat", "Unable to get icon uri", e4);
            return null;
        } catch (NoSuchMethodException e9) {
            Log.e("IconCompat", "Unable to get icon uri", e9);
            return null;
        } catch (InvocationTargetException e10) {
            Log.e("IconCompat", "Unable to get icon uri", e10);
            return null;
        }
    }

    public static Drawable f(Icon icon, Context context) {
        return icon.loadDrawable(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.drawable.Icon g(androidx.core.graphics.drawable.IconCompat r6, android.content.Context r7) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M.c.g(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
    }
}
