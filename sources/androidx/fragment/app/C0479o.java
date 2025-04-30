package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;

/* renamed from: androidx.fragment.app.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0479o extends G7.k implements F7.a {
    public final /* synthetic */ C0481p b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f4743c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4744d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ G7.r f4745f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0479o(C0481p c0481p, ViewGroup viewGroup, Object obj, G7.r rVar) {
        super(0);
        this.b = c0481p;
        this.f4743c = viewGroup;
        this.f4744d = obj;
        this.f4745f = rVar;
    }

    @Override // F7.a
    public final Object invoke() {
        C0481p c0481p = this.b;
        G0 g02 = c0481p.f4751f;
        ViewGroup viewGroup = this.f4743c;
        Object obj = this.f4744d;
        Object i9 = g02.i(viewGroup, obj);
        c0481p.f4760q = i9;
        if (i9 != null) {
            this.f4745f.b = new C0477n(0, c0481p, viewGroup);
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Started executing operations from " + c0481p.f4749d + " to " + c0481p.f4750e);
            }
            return t7.y.f23029a;
        }
        throw new IllegalStateException(("Unable to start transition " + obj + " for container " + viewGroup + '.').toString());
    }
}
