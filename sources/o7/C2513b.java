package o7;

import G7.s;
import android.app.Activity;
import android.app.Application;
import com.facebook.appevents.g;
import f.l;
import k.C2426o;
import n1.C2475f;
import n7.C2485c;
import q7.InterfaceC2648a;
import q7.InterfaceC2649b;

/* renamed from: o7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2513b implements InterfaceC2649b {
    public final /* synthetic */ int b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Object f22002c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final Activity f22003d;

    /* renamed from: f, reason: collision with root package name */
    public final Object f22004f;

    /* renamed from: g, reason: collision with root package name */
    public volatile InterfaceC2648a f22005g;

    public C2513b(Activity activity) {
        this.f22003d = activity;
        this.f22004f = new C2513b((l) activity);
    }

    @Override // q7.InterfaceC2649b
    public final Object a() {
        switch (this.b) {
            case 0:
                if (((s6.b) this.f22005g) == null) {
                    synchronized (this.f22002c) {
                        try {
                            if (((s6.b) this.f22005g) == null) {
                                this.f22005g = b();
                            }
                        } finally {
                        }
                    }
                }
                return (s6.b) this.f22005g;
            default:
                if (((s6.d) this.f22005g) == null) {
                    synchronized (this.f22002c) {
                        try {
                            if (((s6.d) this.f22005g) == null) {
                                this.f22005g = ((C2515d) new C2475f((l) this.f22003d, new C2485c((l) this.f22004f, 1)).o(s.a(C2515d.class))).b;
                            }
                        } finally {
                        }
                    }
                }
                return (s6.d) this.f22005g;
        }
    }

    public s6.b b() {
        String str;
        Activity activity = this.f22003d;
        if (!(activity.getApplication() instanceof InterfaceC2649b)) {
            StringBuilder sb = new StringBuilder("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
            if (Application.class.equals(activity.getApplication().getClass())) {
                str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
            } else {
                str = "Found: " + activity.getApplication().getClass();
            }
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
        s6.d dVar = (s6.d) ((InterfaceC2512a) g.l((C2513b) this.f22004f, InterfaceC2512a.class));
        return new s6.b(dVar.f22975a, dVar.b);
    }

    public C2426o c() {
        C2513b c2513b = (C2513b) this.f22004f;
        return ((C2515d) new C2475f((l) c2513b.f22003d, new C2485c((l) c2513b.f22004f, 1)).o(s.a(C2515d.class))).f22006c;
    }

    public C2513b(l lVar) {
        this.f22003d = lVar;
        this.f22004f = lVar;
    }
}
