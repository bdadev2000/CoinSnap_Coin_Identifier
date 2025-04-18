package androidx.constraintlayout.widget;

import android.content.Context;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class Barrier extends ConstraintHelper {

    /* renamed from: i, reason: collision with root package name */
    public int f18176i;

    /* renamed from: j, reason: collision with root package name */
    public int f18177j;

    /* renamed from: k, reason: collision with root package name */
    public final androidx.constraintlayout.solver.widgets.Barrier f18178k;

    public Barrier(Context context) {
        super(context);
        this.f18191a = new int[32];
        this.f18195g = null;
        this.f18196h = new HashMap();
        this.f18193c = context;
        androidx.constraintlayout.solver.widgets.Barrier barrier = new androidx.constraintlayout.solver.widgets.Barrier();
        this.f18178k = barrier;
        this.d = barrier;
        m();
        super.setVisibility(8);
    }

    public int getMargin() {
        return this.f18178k.f17981j0;
    }

    public int getType() {
        return this.f18176i;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void j(ConstraintWidget constraintWidget, boolean z2) {
        n(constraintWidget, this.f18176i, z2);
    }

    public final void n(ConstraintWidget constraintWidget, int i2, boolean z2) {
        this.f18177j = i2;
        if (z2) {
            int i3 = this.f18176i;
            if (i3 == 5) {
                this.f18177j = 1;
            } else if (i3 == 6) {
                this.f18177j = 0;
            }
        } else {
            int i4 = this.f18176i;
            if (i4 == 5) {
                this.f18177j = 0;
            } else if (i4 == 6) {
                this.f18177j = 1;
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.solver.widgets.Barrier) {
            ((androidx.constraintlayout.solver.widgets.Barrier) constraintWidget).f17979h0 = this.f18177j;
        }
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.f18178k.f17980i0 = z2;
    }

    public void setDpMargin(int i2) {
        this.f18178k.f17981j0 = (int) ((i2 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i2) {
        this.f18178k.f17981j0 = i2;
    }

    public void setType(int i2) {
        this.f18176i = i2;
    }
}
