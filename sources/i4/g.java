package i4;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final int f19145e;
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final ActivityManager f19146b;

    /* renamed from: c, reason: collision with root package name */
    public final v3.c f19147c;

    /* renamed from: d, reason: collision with root package name */
    public final float f19148d;

    static {
        f19145e = Build.VERSION.SDK_INT < 26 ? 4 : 1;
    }

    public g(Context context) {
        this.f19148d = f19145e;
        this.a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f19146b = activityManager;
        this.f19147c = new v3.c(context.getResources().getDisplayMetrics(), 16);
        if (Build.VERSION.SDK_INT >= 26 && activityManager.isLowRamDevice()) {
            this.f19148d = 0.0f;
        }
    }
}
