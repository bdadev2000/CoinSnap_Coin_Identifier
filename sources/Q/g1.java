package q;

import android.os.Build;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class g1 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f22657a;
    public static Method b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f22658c;

    static {
        boolean z8;
        if (Build.VERSION.SDK_INT >= 27) {
            z8 = true;
        } else {
            z8 = false;
        }
        f22658c = z8;
    }
}
