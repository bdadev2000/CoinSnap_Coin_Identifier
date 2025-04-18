package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;

/* loaded from: classes.dex */
public abstract class i0 extends f0 {

    /* renamed from: b, reason: collision with root package name */
    public final Activity f1647b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f1648c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f1649d;

    /* renamed from: f, reason: collision with root package name */
    public final c1 f1650f;

    public i0(FragmentActivity fragmentActivity) {
        Handler handler = new Handler();
        this.f1650f = new c1();
        this.f1647b = fragmentActivity;
        if (fragmentActivity != null) {
            this.f1648c = fragmentActivity;
            this.f1649d = handler;
            return;
        }
        throw new NullPointerException("context == null");
    }
}
