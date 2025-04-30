package androidx.fragment.app;

import android.content.Context;
import g.InterfaceC2278b;

/* loaded from: classes.dex */
public final /* synthetic */ class J implements InterfaceC2278b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4660a;
    public final /* synthetic */ f.l b;

    public /* synthetic */ J(f.l lVar, int i9) {
        this.f4660a = i9;
        this.b = lVar;
    }

    @Override // g.InterfaceC2278b
    public final void a(Context context) {
        switch (this.f4660a) {
            case 0:
                ((FragmentActivity) this.b).lambda$init$3(context);
                return;
            default:
                f.l.b(this.b, context);
                return;
        }
    }
}
