package M0;

import android.os.Build;

/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f1844a;

    static {
        boolean z8;
        if (Build.VERSION.SDK_INT >= 28) {
            z8 = true;
        } else {
            z8 = false;
        }
        f1844a = z8;
    }
}
