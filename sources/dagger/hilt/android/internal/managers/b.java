package dagger.hilt.android.internal.managers;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.e1;
import com.google.common.collect.c1;

/* loaded from: classes4.dex */
public final class b implements ph.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16929b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Object f16930c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final Activity f16931d;

    /* renamed from: f, reason: collision with root package name */
    public final Object f16932f;

    /* renamed from: g, reason: collision with root package name */
    public volatile Object f16933g;

    public b(Activity activity) {
        this.f16931d = activity;
        this.f16932f = new b((ComponentActivity) activity);
    }

    public final Object a() {
        String str;
        Activity activity = this.f16931d;
        if (!(activity.getApplication() instanceof ph.b)) {
            StringBuilder sb2 = new StringBuilder("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
            if (Application.class.equals(activity.getApplication().getClass())) {
                str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
            } else {
                str = "Found: " + activity.getApplication().getClass();
            }
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
        p000if.c cVar = (p000if.c) ((a) com.facebook.internal.i.r(a.class, (ph.b) this.f16932f));
        c1 c1Var = new c1(cVar.a, cVar.f19616b);
        activity.getClass();
        c1Var.f11925d = activity;
        return new p000if.a((p000if.f) c1Var.f11923b, (p000if.c) c1Var.f11924c);
    }

    @Override // ph.b
    public final Object d() {
        switch (this.f16929b) {
            case 0:
                if (this.f16933g == null) {
                    synchronized (this.f16930c) {
                        if (this.f16933g == null) {
                            this.f16933g = a();
                        }
                    }
                }
                return this.f16933g;
            default:
                if (((kh.a) this.f16933g) == null) {
                    synchronized (this.f16930c) {
                        if (((kh.a) this.f16933g) == null) {
                            this.f16933g = ((e) new h.c((e1) this.f16931d, new c((Context) this.f16932f)).s(e.class)).a;
                        }
                    }
                }
                return (kh.a) this.f16933g;
        }
    }

    public b(ComponentActivity componentActivity) {
        this.f16931d = componentActivity;
        this.f16932f = componentActivity;
    }
}
