package T6;

import com.tools.arruler.ui.component.protractor.ProtractorActivity;
import com.tools.arruler.ui.component.straight.StraightRulerActivity;
import g4.AbstractC2292b;

/* loaded from: classes3.dex */
public final class a extends AbstractC2292b {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3030c;

    public /* synthetic */ a(Object obj, int i9) {
        this.b = i9;
        this.f3030c = obj;
    }

    @Override // g4.AbstractC2292b
    public final void h() {
        switch (this.b) {
            case 0:
                ((ProtractorActivity) this.f3030c).finish();
                return;
            case 1:
                ((StraightRulerActivity) this.f3030c).finish();
                return;
            default:
                ((F7.a) this.f3030c).invoke();
                return;
        }
    }
}
