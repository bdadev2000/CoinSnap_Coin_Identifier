package M3;

import android.window.OnBackInvokedCallback;
import k.w;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1992a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i9) {
        this.f1992a = i9;
        this.b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f1992a) {
            case 0:
                ((b) this.b).b();
                return;
            case 1:
                F7.a aVar = (F7.a) this.b;
                G7.j.e(aVar, "$onBackInvoked");
                aVar.invoke();
                return;
            case 2:
                ((w) this.b).C();
                return;
            default:
                ((Runnable) this.b).run();
                return;
        }
    }
}
