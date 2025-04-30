package T;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f2933a;
    public static final Field b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f2934c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f2935d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f2933a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f2934c = declaredField3;
            declaredField3.setAccessible(true);
            f2935d = true;
        } catch (ReflectiveOperationException e4) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e4.getMessage(), e4);
        }
    }
}
