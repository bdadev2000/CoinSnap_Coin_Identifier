package n0;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class d2 {
    public static final Field a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f22255b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f22256c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f22257d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f22255b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f22256c = declaredField3;
            declaredField3.setAccessible(true);
            f22257d = true;
        } catch (ReflectiveOperationException e2) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e2.getMessage(), e2);
        }
    }
}
