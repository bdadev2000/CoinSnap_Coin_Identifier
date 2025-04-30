package R1;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import n1.C2475f;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final int f2630e;

    /* renamed from: a, reason: collision with root package name */
    public final Context f2631a;
    public final ActivityManager b;

    /* renamed from: c, reason: collision with root package name */
    public final C2475f f2632c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2633d;

    static {
        int i9;
        if (Build.VERSION.SDK_INT < 26) {
            i9 = 4;
        } else {
            i9 = 1;
        }
        f2630e = i9;
    }

    public f(Context context) {
        this.f2633d = f2630e;
        this.f2631a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.b = activityManager;
        this.f2632c = new C2475f(context.getResources().getDisplayMetrics(), 7);
        if (Build.VERSION.SDK_INT >= 26 && activityManager.isLowRamDevice()) {
            this.f2633d = 0.0f;
        }
    }
}
