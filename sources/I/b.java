package I;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class b {
    public static int a(Context context, int i9) {
        return context.getColor(i9);
    }

    public static <T> T b(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    public static String c(Context context, Class<?> cls) {
        return context.getSystemServiceName(cls);
    }
}
