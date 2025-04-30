package androidx.fragment.app;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class J0 implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f4661c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ L0 f4662d;

    public /* synthetic */ J0(r rVar, L0 l02, int i9) {
        this.b = i9;
        this.f4661c = rVar;
        this.f4662d = l02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                r rVar = this.f4661c;
                G7.j.e(rVar, "this$0");
                L0 l02 = this.f4662d;
                G7.j.e(l02, "$operation");
                if (rVar.b.contains(l02)) {
                    int i9 = l02.f4666a;
                    View view = l02.f4667c.mView;
                    G7.j.d(view, "operation.fragment.mView");
                    Q7.n0.a(i9, view, rVar.f4771a);
                    return;
                }
                return;
            case 1:
                r rVar2 = this.f4661c;
                G7.j.e(rVar2, "this$0");
                L0 l03 = this.f4662d;
                G7.j.e(l03, "$operation");
                rVar2.a(l03);
                return;
            default:
                r rVar3 = this.f4661c;
                G7.j.e(rVar3, "this$0");
                L0 l04 = this.f4662d;
                G7.j.e(l04, "$operation");
                rVar3.b.remove(l04);
                rVar3.f4772c.remove(l04);
                return;
        }
    }
}
