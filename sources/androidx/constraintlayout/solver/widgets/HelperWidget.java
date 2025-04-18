package androidx.constraintlayout.solver.widgets;

import java.util.Arrays;

/* loaded from: classes3.dex */
public class HelperWidget extends ConstraintWidget implements Helper {

    /* renamed from: f0, reason: collision with root package name */
    public ConstraintWidget[] f18088f0 = new ConstraintWidget[4];

    /* renamed from: g0, reason: collision with root package name */
    public int f18089g0 = 0;

    public final void C(ConstraintWidget constraintWidget) {
        if (constraintWidget == this || constraintWidget == null) {
            return;
        }
        int i2 = this.f18089g0 + 1;
        ConstraintWidget[] constraintWidgetArr = this.f18088f0;
        if (i2 > constraintWidgetArr.length) {
            this.f18088f0 = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
        }
        ConstraintWidget[] constraintWidgetArr2 = this.f18088f0;
        int i3 = this.f18089g0;
        constraintWidgetArr2[i3] = constraintWidget;
        this.f18089g0 = i3 + 1;
    }

    @Override // androidx.constraintlayout.solver.widgets.Helper
    public void a() {
    }
}
