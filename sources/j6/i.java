package j6;

import android.content.Context;
import android.os.Handler;
import t7.y;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements F7.a {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f21119c;

    public /* synthetic */ i(m mVar, int i9) {
        this.b = i9;
        this.f21119c = mVar;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [j6.r, java.lang.Object] */
    @Override // F7.a
    public final Object invoke() {
        switch (this.b) {
            case 0:
                m mVar = this.f21119c;
                G7.j.e(mVar, "this$0");
                return new e(mVar);
            case 1:
                m mVar2 = this.f21119c;
                G7.j.e(mVar2, "this$0");
                C2401a c2401a = r.f21185a;
                Context context = mVar2.b;
                G7.j.e(context, "context");
                r rVar = r.b;
                if (rVar == null) {
                    synchronized (c2401a) {
                        r rVar2 = r.b;
                        rVar = rVar2;
                        if (rVar2 == null) {
                            ?? obj = new Object();
                            r.b = obj;
                            context.getSharedPreferences("com.skydoves.balloon", 0);
                            rVar = obj;
                        }
                    }
                }
                return rVar;
            default:
                m mVar3 = this.f21119c;
                G7.j.e(mVar3, "this$0");
                mVar3.f21175h = false;
                mVar3.f21173f.dismiss();
                mVar3.f21174g.dismiss();
                ((Handler) mVar3.f21177j.getValue()).removeCallbacks((e) mVar3.f21178k.getValue());
                return y.f23029a;
        }
    }
}
