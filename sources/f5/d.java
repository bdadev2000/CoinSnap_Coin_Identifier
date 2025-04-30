package f5;

import a5.C0397a;
import android.app.ActivityManager;
import android.content.Context;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Runtime f20341a = Runtime.getRuntime();
    public final ActivityManager b;

    /* renamed from: c, reason: collision with root package name */
    public final ActivityManager.MemoryInfo f20342c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f20343d;

    static {
        C0397a.d();
    }

    public d(Context context) {
        this.f20343d = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f20342c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}
