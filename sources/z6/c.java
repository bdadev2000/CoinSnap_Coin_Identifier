package z6;

import G7.j;
import android.os.Bundle;
import com.tools.arruler.ui.component.arruler.ArRulerActivity;
import com.tools.arruler.ui.component.iap.IAPActivity;
import t7.y;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements F7.a {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArRulerActivity f24556c;

    public /* synthetic */ c(ArRulerActivity arRulerActivity, int i9) {
        this.b = i9;
        this.f24556c = arRulerActivity;
    }

    @Override // F7.a
    public final Object invoke() {
        y yVar = y.f23029a;
        ArRulerActivity arRulerActivity = this.f24556c;
        switch (this.b) {
            case 0:
                int i9 = ArRulerActivity.f19637r;
                j.e(arRulerActivity, "this$0");
                arRulerActivity.w(new c(arRulerActivity, 2));
                return yVar;
            case 1:
                int i10 = ArRulerActivity.f19637r;
                j.e(arRulerActivity, "this$0");
                arRulerActivity.finish();
                a7.b bVar = a7.b.f4076f;
                if (bVar != null) {
                    bVar.A("FIRST_RATE", true);
                    return yVar;
                }
                throw new IllegalStateException(a7.b.class.getSimpleName().concat(" is not initialized, call initializeInstance(..) method first."));
            case 2:
                int i11 = ArRulerActivity.f19637r;
                j.e(arRulerActivity, "this$0");
                arRulerActivity.finish();
                a7.b bVar2 = a7.b.f4076f;
                if (bVar2 != null) {
                    bVar2.A("FIRST_RATE", true);
                    return yVar;
                }
                throw new IllegalStateException(a7.b.class.getSimpleName().concat(" is not initialized, call initializeInstance(..) method first."));
            default:
                int i12 = ArRulerActivity.f19637r;
                j.e(arRulerActivity, "this$0");
                Bundle bundle = new Bundle();
                bundle.putBoolean("IAP_FROM_MAIN", true);
                arRulerActivity.s(IAPActivity.class, bundle);
                return yVar;
        }
    }
}
