package androidx.fragment.app;

import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import e8.C2249y;
import e8.C2250z;
import g0.C2280b;
import java.io.File;

/* renamed from: androidx.fragment.app.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0477n extends G7.k implements F7.a {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4741c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4742d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0477n(int i9, Object obj, Object obj2) {
        super(0);
        this.b = i9;
        this.f4741c = obj;
        this.f4742d = obj2;
    }

    @Override // F7.a
    public final Object invoke() {
        switch (this.b) {
            case 0:
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "Animating to start");
                }
                C0481p c0481p = (C0481p) this.f4741c;
                G0 g02 = c0481p.f4751f;
                Object obj = c0481p.f4760q;
                G7.j.b(obj);
                g02.d(obj, new RunnableC0473l(c0481p, (ViewGroup) this.f4742d));
                return t7.y.f23029a;
            case 1:
                C2250z c2250z = (C2250z) this.f4741c;
                c2250z.getClass();
                Enum[] enumArr = c2250z.f20207a;
                C2249y c2249y = new C2249y((String) this.f4742d, enumArr.length);
                for (Enum r02 : enumArr) {
                    c2249y.l(r02.name(), false);
                }
                return c2249y;
            case 2:
                return android.support.v4.media.session.a.e((String) this.f4741c, c8.l.f5456g, new c8.g[0], new G7.w((e8.U) this.f4742d, 9));
            default:
                Context context = (Context) this.f4741c;
                G7.j.d(context, "applicationContext");
                String str = ((C2280b) this.f4742d).f20413a;
                G7.j.e(str, "name");
                String j7 = G7.j.j(".preferences_pb", str);
                G7.j.e(j7, "fileName");
                return new File(context.getApplicationContext().getFilesDir(), G7.j.j(j7, "datastore/"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0477n(e8.U u8) {
        super(0);
        this.b = 2;
        this.f4741c = "kotlin.Unit";
        this.f4742d = u8;
    }
}
