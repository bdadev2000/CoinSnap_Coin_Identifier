package h0;

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
        int d10 = d(icon);
        if (d10 != 2) {
            if (d10 != 4) {
                if (d10 != 6) {
                    IconCompat iconCompat = new IconCompat(-1);
                    iconCompat.f1279b = icon;
                    return iconCompat;
                }
                Uri e2 = e(icon);
                PorterDuff.Mode mode = IconCompat.f1278k;
                e2.getClass();
                String uri = e2.toString();
                uri.getClass();
                IconCompat iconCompat2 = new IconCompat(6);
                iconCompat2.f1279b = uri;
                return iconCompat2;
            }
            Uri e10 = e(icon);
            PorterDuff.Mode mode2 = IconCompat.f1278k;
            e10.getClass();
            String uri2 = e10.toString();
            uri2.getClass();
            IconCompat iconCompat3 = new IconCompat(4);
            iconCompat3.f1279b = uri2;
            return iconCompat3;
        }
        return IconCompat.b(c(icon), b(icon));
    }

    public static int b(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return e.a(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (NoSuchMethodException e10) {
            Log.e("IconCompat", "Unable to get icon resource", e10);
            return 0;
        } catch (InvocationTargetException e11) {
            Log.e("IconCompat", "Unable to get icon resource", e11);
            return 0;
        }
    }

    public static String c(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return e.b(obj);
        }
        try {
            return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (NoSuchMethodException e10) {
            Log.e("IconCompat", "Unable to get icon package", e10);
            return null;
        } catch (InvocationTargetException e11) {
            Log.e("IconCompat", "Unable to get icon package", e11);
            return null;
        }
    }

    public static int d(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return e.c(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e2);
            return -1;
        } catch (NoSuchMethodException e10) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e10);
            return -1;
        } catch (InvocationTargetException e11) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e11);
            return -1;
        }
    }

    @Nullable
    public static Uri e(@NonNull Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return e.d(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (NoSuchMethodException e10) {
            Log.e("IconCompat", "Unable to get icon uri", e10);
            return null;
        } catch (InvocationTargetException e11) {
            Log.e("IconCompat", "Unable to get icon uri", e11);
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
        throw new UnsupportedOperationException("Method not decompiled: h0.c.g(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
    }
}
