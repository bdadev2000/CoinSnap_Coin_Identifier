package o;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.content.ContextCompat;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final double f31164a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f31165b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f31166c;

    public b(Context context) {
        Bitmap.Config[] configArr = v.g.f31378a;
        double d = 0.2d;
        try {
            Object systemService = ContextCompat.getSystemService(context, ActivityManager.class);
            p0.a.p(systemService);
            if (((ActivityManager) systemService).isLowRamDevice()) {
                d = 0.15d;
            }
        } catch (Exception unused) {
        }
        this.f31164a = d;
        this.f31165b = true;
        this.f31166c = true;
    }
}
