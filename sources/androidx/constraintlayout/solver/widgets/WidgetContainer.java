package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.Cache;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class WidgetContainer extends ConstraintWidget {

    /* renamed from: f0, reason: collision with root package name */
    public ArrayList f18102f0;

    public void C() {
        ArrayList arrayList = this.f18102f0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.f18102f0.get(i2);
            if (constraintWidget instanceof WidgetContainer) {
                ((WidgetContainer) constraintWidget).C();
            }
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void t() {
        this.f18102f0.clear();
        super.t();
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public final void v(Cache cache) {
        super.v(cache);
        int size = this.f18102f0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ConstraintWidget) this.f18102f0.get(i2)).v(cache);
        }
    }
}
