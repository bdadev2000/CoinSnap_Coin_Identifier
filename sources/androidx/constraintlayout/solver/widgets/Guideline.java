package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.ArrayRow;
import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class Guideline extends ConstraintWidget {

    /* renamed from: f0, reason: collision with root package name */
    public float f18082f0 = -1.0f;

    /* renamed from: g0, reason: collision with root package name */
    public int f18083g0 = -1;

    /* renamed from: h0, reason: collision with root package name */
    public int f18084h0 = -1;

    /* renamed from: i0, reason: collision with root package name */
    public ConstraintAnchor f18085i0 = this.f18037z;

    /* renamed from: j0, reason: collision with root package name */
    public int f18086j0 = 0;

    /* renamed from: androidx.constraintlayout.solver.widgets.Guideline$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18087a;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f18087a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18087a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18087a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18087a[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18087a[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18087a[6] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18087a[7] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f18087a[8] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f18087a[0] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public Guideline() {
        this.H.clear();
        this.H.add(this.f18085i0);
        int length = this.G.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.G[i2] = this.f18085i0;
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public final void B(LinearSystem linearSystem) {
        if (this.K == null) {
            return;
        }
        ConstraintAnchor constraintAnchor = this.f18085i0;
        linearSystem.getClass();
        int m2 = LinearSystem.m(constraintAnchor);
        if (this.f18086j0 == 1) {
            this.P = m2;
            this.Q = 0;
            w(this.K.j());
            z(0);
            return;
        }
        this.P = 0;
        this.Q = m2;
        z(this.K.m());
        w(0);
    }

    public final void C(int i2) {
        if (this.f18086j0 == i2) {
            return;
        }
        this.f18086j0 = i2;
        ArrayList arrayList = this.H;
        arrayList.clear();
        if (this.f18086j0 == 1) {
            this.f18085i0 = this.f18036y;
        } else {
            this.f18085i0 = this.f18037z;
        }
        arrayList.add(this.f18085i0);
        ConstraintAnchor[] constraintAnchorArr = this.G;
        int length = constraintAnchorArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            constraintAnchorArr[i3] = this.f18085i0;
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public final void b(LinearSystem linearSystem) {
        ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) this.K;
        if (constraintWidgetContainer == null) {
            return;
        }
        ConstraintAnchor h2 = constraintWidgetContainer.h(ConstraintAnchor.Type.f18003a);
        ConstraintAnchor h3 = constraintWidgetContainer.h(ConstraintAnchor.Type.f18005c);
        ConstraintWidget constraintWidget = this.K;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f18041b;
        boolean z2 = constraintWidget != null && constraintWidget.J[0] == dimensionBehaviour;
        if (this.f18086j0 == 0) {
            h2 = constraintWidgetContainer.h(ConstraintAnchor.Type.f18004b);
            h3 = constraintWidgetContainer.h(ConstraintAnchor.Type.d);
            ConstraintWidget constraintWidget2 = this.K;
            z2 = constraintWidget2 != null && constraintWidget2.J[1] == dimensionBehaviour;
        }
        if (this.f18083g0 != -1) {
            SolverVariable j2 = linearSystem.j(this.f18085i0);
            linearSystem.e(j2, linearSystem.j(h2), this.f18083g0, 8);
            if (z2) {
                linearSystem.f(linearSystem.j(h3), j2, 0, 5);
                return;
            }
            return;
        }
        if (this.f18084h0 != -1) {
            SolverVariable j3 = linearSystem.j(this.f18085i0);
            SolverVariable j4 = linearSystem.j(h3);
            linearSystem.e(j3, j4, -this.f18084h0, 8);
            if (z2) {
                linearSystem.f(j3, linearSystem.j(h2), 0, 5);
                linearSystem.f(j4, j3, 0, 5);
                return;
            }
            return;
        }
        if (this.f18082f0 != -1.0f) {
            SolverVariable j5 = linearSystem.j(this.f18085i0);
            SolverVariable j6 = linearSystem.j(h3);
            float f2 = this.f18082f0;
            ArrayRow k2 = linearSystem.k();
            k2.d.f(j5, -1.0f);
            k2.d.f(j6, f2);
            linearSystem.c(k2);
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public final boolean c() {
        return true;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public final ConstraintAnchor h(ConstraintAnchor.Type type) {
        switch (type.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.f18086j0 == 1) {
                    return this.f18085i0;
                }
                break;
            case 2:
            case 4:
                if (this.f18086j0 == 0) {
                    return this.f18085i0;
                }
                break;
        }
        throw new AssertionError(type.name());
    }
}
