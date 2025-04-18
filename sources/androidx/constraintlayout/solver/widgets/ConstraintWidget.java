package androidx.constraintlayout.solver.widgets;

import android.support.v4.media.d;
import androidx.compose.foundation.text.input.a;
import androidx.constraintlayout.solver.Cache;
import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.analyzer.ChainRun;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun;
import androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class ConstraintWidget {
    public final ConstraintAnchor A;
    public final ConstraintAnchor B;
    public final ConstraintAnchor C;
    public final ConstraintAnchor D;
    public final ConstraintAnchor E;
    public final ConstraintAnchor F;
    public final ConstraintAnchor[] G;
    public final ArrayList H;
    public final boolean[] I;
    public final DimensionBehaviour[] J;
    public ConstraintWidget K;
    public int L;
    public int M;
    public float N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public float U;
    public float V;
    public Object W;
    public int X;
    public String Y;
    public String Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f18012a0;

    /* renamed from: b, reason: collision with root package name */
    public ChainRun f18013b;

    /* renamed from: b0, reason: collision with root package name */
    public int f18014b0;

    /* renamed from: c, reason: collision with root package name */
    public ChainRun f18015c;

    /* renamed from: c0, reason: collision with root package name */
    public final float[] f18016c0;

    /* renamed from: d0, reason: collision with root package name */
    public final ConstraintWidget[] f18017d0;

    /* renamed from: e0, reason: collision with root package name */
    public final ConstraintWidget[] f18018e0;
    public boolean x;

    /* renamed from: y, reason: collision with root package name */
    public final ConstraintAnchor f18036y;

    /* renamed from: z, reason: collision with root package name */
    public final ConstraintAnchor f18037z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f18011a = false;
    public final HorizontalWidgetRun d = new HorizontalWidgetRun(this);
    public final VerticalWidgetRun e = new VerticalWidgetRun(this);

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f18019f = {true, true};

    /* renamed from: g, reason: collision with root package name */
    public final int[] f18020g = {0, 0, 0, 0};

    /* renamed from: h, reason: collision with root package name */
    public int f18021h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f18022i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f18023j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f18024k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f18025l = new int[2];

    /* renamed from: m, reason: collision with root package name */
    public int f18026m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f18027n = 0;

    /* renamed from: o, reason: collision with root package name */
    public float f18028o = 1.0f;

    /* renamed from: p, reason: collision with root package name */
    public int f18029p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f18030q = 0;

    /* renamed from: r, reason: collision with root package name */
    public float f18031r = 1.0f;

    /* renamed from: s, reason: collision with root package name */
    public int f18032s = -1;

    /* renamed from: t, reason: collision with root package name */
    public float f18033t = 1.0f;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f18034u = {Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER};

    /* renamed from: v, reason: collision with root package name */
    public float f18035v = 0.0f;
    public boolean w = false;

    /* renamed from: androidx.constraintlayout.solver.widgets.ConstraintWidget$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18038a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f18039b;

        static {
            int[] iArr = new int[DimensionBehaviour.values().length];
            f18039b = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18039b[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18039b[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18039b[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ConstraintAnchor.Type.values().length];
            f18038a = iArr2;
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18038a[2] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18038a[3] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f18038a[4] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f18038a[5] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f18038a[6] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f18038a[7] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f18038a[8] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f18038a[0] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class DimensionBehaviour {

        /* renamed from: a, reason: collision with root package name */
        public static final DimensionBehaviour f18040a;

        /* renamed from: b, reason: collision with root package name */
        public static final DimensionBehaviour f18041b;

        /* renamed from: c, reason: collision with root package name */
        public static final DimensionBehaviour f18042c;
        public static final DimensionBehaviour d;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ DimensionBehaviour[] f18043f;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour] */
        static {
            ?? r02 = new Enum("FIXED", 0);
            f18040a = r02;
            ?? r1 = new Enum("WRAP_CONTENT", 1);
            f18041b = r1;
            ?? r2 = new Enum("MATCH_CONSTRAINT", 2);
            f18042c = r2;
            ?? r3 = new Enum("MATCH_PARENT", 3);
            d = r3;
            f18043f = new DimensionBehaviour[]{r02, r1, r2, r3};
        }

        public static DimensionBehaviour valueOf(String str) {
            return (DimensionBehaviour) Enum.valueOf(DimensionBehaviour.class, str);
        }

        public static DimensionBehaviour[] values() {
            return (DimensionBehaviour[]) f18043f.clone();
        }
    }

    public ConstraintWidget() {
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.f18003a);
        this.f18036y = constraintAnchor;
        ConstraintAnchor constraintAnchor2 = new ConstraintAnchor(this, ConstraintAnchor.Type.f18004b);
        this.f18037z = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = new ConstraintAnchor(this, ConstraintAnchor.Type.f18005c);
        this.A = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = new ConstraintAnchor(this, ConstraintAnchor.Type.d);
        this.B = constraintAnchor4;
        ConstraintAnchor constraintAnchor5 = new ConstraintAnchor(this, ConstraintAnchor.Type.f18006f);
        this.C = constraintAnchor5;
        ConstraintAnchor constraintAnchor6 = new ConstraintAnchor(this, ConstraintAnchor.Type.f18008h);
        this.D = constraintAnchor6;
        ConstraintAnchor constraintAnchor7 = new ConstraintAnchor(this, ConstraintAnchor.Type.f18009i);
        this.E = constraintAnchor7;
        ConstraintAnchor constraintAnchor8 = new ConstraintAnchor(this, ConstraintAnchor.Type.f18007g);
        this.F = constraintAnchor8;
        this.G = new ConstraintAnchor[]{constraintAnchor, constraintAnchor3, constraintAnchor2, constraintAnchor4, constraintAnchor5, constraintAnchor8};
        ArrayList arrayList = new ArrayList();
        this.H = arrayList;
        this.I = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.f18040a;
        this.J = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.K = null;
        this.L = 0;
        this.M = 0;
        this.N = 0.0f;
        this.O = -1;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.U = 0.5f;
        this.V = 0.5f;
        this.X = 0;
        this.Y = null;
        this.Z = null;
        this.f18012a0 = 0;
        this.f18014b0 = 0;
        this.f18016c0 = new float[]{-1.0f, -1.0f};
        this.f18017d0 = new ConstraintWidget[]{null, null};
        this.f18018e0 = new ConstraintWidget[]{null, null};
        arrayList.add(constraintAnchor);
        arrayList.add(constraintAnchor2);
        arrayList.add(constraintAnchor3);
        arrayList.add(constraintAnchor4);
        arrayList.add(constraintAnchor6);
        arrayList.add(constraintAnchor7);
        arrayList.add(constraintAnchor8);
        arrayList.add(constraintAnchor5);
    }

    public void A(boolean z2, boolean z3) {
        int i2;
        int i3;
        HorizontalWidgetRun horizontalWidgetRun = this.d;
        boolean z4 = z2 & horizontalWidgetRun.f18153g;
        VerticalWidgetRun verticalWidgetRun = this.e;
        boolean z5 = z3 & verticalWidgetRun.f18153g;
        int i4 = horizontalWidgetRun.f18154h.f18127g;
        int i5 = verticalWidgetRun.f18154h.f18127g;
        int i6 = horizontalWidgetRun.f18155i.f18127g;
        int i7 = verticalWidgetRun.f18155i.f18127g;
        int i8 = i7 - i5;
        if (i6 - i4 < 0 || i8 < 0 || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE) {
            i6 = 0;
            i7 = 0;
            i4 = 0;
            i5 = 0;
        }
        int i9 = i6 - i4;
        int i10 = i7 - i5;
        if (z4) {
            this.P = i4;
        }
        if (z5) {
            this.Q = i5;
        }
        if (this.X == 8) {
            this.L = 0;
            this.M = 0;
            return;
        }
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.f18040a;
        if (z4) {
            if (this.J[0] == dimensionBehaviour && i9 < (i3 = this.L)) {
                i9 = i3;
            }
            this.L = i9;
            int i11 = this.S;
            if (i9 < i11) {
                this.L = i11;
            }
        }
        if (z5) {
            if (this.J[1] == dimensionBehaviour && i10 < (i2 = this.M)) {
                i10 = i2;
            }
            this.M = i10;
            int i12 = this.T;
            if (i10 < i12) {
                this.M = i12;
            }
        }
    }

    public void B(LinearSystem linearSystem) {
        int i2;
        int i3;
        ConstraintAnchor constraintAnchor = this.f18036y;
        linearSystem.getClass();
        int m2 = LinearSystem.m(constraintAnchor);
        int m3 = LinearSystem.m(this.f18037z);
        int m4 = LinearSystem.m(this.A);
        int m5 = LinearSystem.m(this.B);
        HorizontalWidgetRun horizontalWidgetRun = this.d;
        DependencyNode dependencyNode = horizontalWidgetRun.f18154h;
        if (dependencyNode.f18130j) {
            DependencyNode dependencyNode2 = horizontalWidgetRun.f18155i;
            if (dependencyNode2.f18130j) {
                m2 = dependencyNode.f18127g;
                m4 = dependencyNode2.f18127g;
            }
        }
        VerticalWidgetRun verticalWidgetRun = this.e;
        DependencyNode dependencyNode3 = verticalWidgetRun.f18154h;
        if (dependencyNode3.f18130j) {
            DependencyNode dependencyNode4 = verticalWidgetRun.f18155i;
            if (dependencyNode4.f18130j) {
                m3 = dependencyNode3.f18127g;
                m5 = dependencyNode4.f18127g;
            }
        }
        int i4 = m5 - m3;
        if (m4 - m2 < 0 || i4 < 0 || m2 == Integer.MIN_VALUE || m2 == Integer.MAX_VALUE || m3 == Integer.MIN_VALUE || m3 == Integer.MAX_VALUE || m4 == Integer.MIN_VALUE || m4 == Integer.MAX_VALUE || m5 == Integer.MIN_VALUE || m5 == Integer.MAX_VALUE) {
            m2 = 0;
            m3 = 0;
            m4 = 0;
            m5 = 0;
        }
        int i5 = m4 - m2;
        int i6 = m5 - m3;
        this.P = m2;
        this.Q = m3;
        if (this.X == 8) {
            this.L = 0;
            this.M = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.J;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.f18040a;
        if (dimensionBehaviour == dimensionBehaviour2 && i5 < (i3 = this.L)) {
            i5 = i3;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i6 < (i2 = this.M)) {
            i6 = i2;
        }
        this.L = i5;
        this.M = i6;
        int i7 = this.T;
        if (i6 < i7) {
            this.M = i7;
        }
        int i8 = this.S;
        if (i5 < i8) {
            this.L = i8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0339 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(androidx.constraintlayout.solver.LinearSystem r55) {
        /*
            Method dump skipped, instructions count: 1691
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.b(androidx.constraintlayout.solver.LinearSystem):void");
    }

    public boolean c() {
        return this.X != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x030a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x03f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(androidx.constraintlayout.solver.LinearSystem r30, boolean r31, boolean r32, boolean r33, boolean r34, androidx.constraintlayout.solver.SolverVariable r35, androidx.constraintlayout.solver.SolverVariable r36, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour r37, boolean r38, androidx.constraintlayout.solver.widgets.ConstraintAnchor r39, androidx.constraintlayout.solver.widgets.ConstraintAnchor r40, int r41, int r42, int r43, int r44, float r45, boolean r46, boolean r47, boolean r48, boolean r49, int r50, int r51, int r52, int r53, float r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 1076
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.d(androidx.constraintlayout.solver.LinearSystem, boolean, boolean, boolean, boolean, androidx.constraintlayout.solver.SolverVariable, androidx.constraintlayout.solver.SolverVariable, androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour, boolean, androidx.constraintlayout.solver.widgets.ConstraintAnchor, androidx.constraintlayout.solver.widgets.ConstraintAnchor, int, int, int, int, float, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void e(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i2) {
        boolean z2;
        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.f18007g;
        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.f18009i;
        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.f18008h;
        ConstraintAnchor.Type type6 = ConstraintAnchor.Type.f18003a;
        ConstraintAnchor.Type type7 = ConstraintAnchor.Type.f18004b;
        ConstraintAnchor.Type type8 = ConstraintAnchor.Type.f18005c;
        ConstraintAnchor.Type type9 = ConstraintAnchor.Type.d;
        if (type == type3) {
            if (type2 != type3) {
                if (type2 == type6 || type2 == type8) {
                    e(type6, constraintWidget, type2, 0);
                    e(type8, constraintWidget, type2, 0);
                    h(type3).a(constraintWidget.h(type2), 0);
                    return;
                } else {
                    if (type2 == type7 || type2 == type9) {
                        e(type7, constraintWidget, type2, 0);
                        e(type9, constraintWidget, type2, 0);
                        h(type3).a(constraintWidget.h(type2), 0);
                        return;
                    }
                    return;
                }
            }
            ConstraintAnchor h2 = h(type6);
            ConstraintAnchor h3 = h(type8);
            ConstraintAnchor h4 = h(type7);
            ConstraintAnchor h5 = h(type9);
            boolean z3 = true;
            if ((h2 == null || !h2.f()) && (h3 == null || !h3.f())) {
                e(type6, constraintWidget, type6, 0);
                e(type8, constraintWidget, type8, 0);
                z2 = true;
            } else {
                z2 = false;
            }
            if ((h4 == null || !h4.f()) && (h5 == null || !h5.f())) {
                e(type7, constraintWidget, type7, 0);
                e(type9, constraintWidget, type9, 0);
            } else {
                z3 = false;
            }
            if (z2 && z3) {
                h(type3).a(constraintWidget.h(type3), 0);
                return;
            } else if (z2) {
                h(type5).a(constraintWidget.h(type5), 0);
                return;
            } else {
                if (z3) {
                    h(type4).a(constraintWidget.h(type4), 0);
                    return;
                }
                return;
            }
        }
        if (type == type5 && (type2 == type6 || type2 == type8)) {
            ConstraintAnchor h6 = h(type6);
            ConstraintAnchor h7 = constraintWidget.h(type2);
            ConstraintAnchor h8 = h(type8);
            h6.a(h7, 0);
            h8.a(h7, 0);
            h(type5).a(h7, 0);
            return;
        }
        if (type == type4 && (type2 == type7 || type2 == type9)) {
            ConstraintAnchor h9 = constraintWidget.h(type2);
            h(type7).a(h9, 0);
            h(type9).a(h9, 0);
            h(type4).a(h9, 0);
            return;
        }
        if (type == type5 && type2 == type5) {
            h(type6).a(constraintWidget.h(type6), 0);
            h(type8).a(constraintWidget.h(type8), 0);
            h(type5).a(constraintWidget.h(type2), 0);
            return;
        }
        if (type == type4 && type2 == type4) {
            h(type7).a(constraintWidget.h(type7), 0);
            h(type9).a(constraintWidget.h(type9), 0);
            h(type4).a(constraintWidget.h(type2), 0);
            return;
        }
        ConstraintAnchor h10 = h(type);
        ConstraintAnchor h11 = constraintWidget.h(type2);
        if (h10.g(h11)) {
            ConstraintAnchor.Type type10 = ConstraintAnchor.Type.f18006f;
            if (type == type10) {
                ConstraintAnchor h12 = h(type7);
                ConstraintAnchor h13 = h(type9);
                if (h12 != null) {
                    h12.h();
                }
                if (h13 != null) {
                    h13.h();
                }
                i2 = 0;
            } else if (type == type7 || type == type9) {
                ConstraintAnchor h14 = h(type10);
                if (h14 != null) {
                    h14.h();
                }
                ConstraintAnchor h15 = h(type3);
                if (h15.d != h11) {
                    h15.h();
                }
                ConstraintAnchor d = h(type).d();
                ConstraintAnchor h16 = h(type4);
                if (h16.f()) {
                    d.h();
                    h16.h();
                }
            } else if (type == type6 || type == type8) {
                ConstraintAnchor h17 = h(type3);
                if (h17.d != h11) {
                    h17.h();
                }
                ConstraintAnchor d2 = h(type).d();
                ConstraintAnchor h18 = h(type5);
                if (h18.f()) {
                    d2.h();
                    h18.h();
                }
            }
            h10.a(h11, i2);
        }
    }

    public final void f(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i2) {
        if (constraintAnchor.f17998b == this) {
            e(constraintAnchor.f17999c, constraintAnchor2.f17998b, constraintAnchor2.f17999c, i2);
        }
    }

    public final void g(LinearSystem linearSystem) {
        linearSystem.j(this.f18036y);
        linearSystem.j(this.f18037z);
        linearSystem.j(this.A);
        linearSystem.j(this.B);
        if (this.R > 0) {
            linearSystem.j(this.C);
        }
    }

    public ConstraintAnchor h(ConstraintAnchor.Type type) {
        switch (type.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.f18036y;
            case 2:
                return this.f18037z;
            case 3:
                return this.A;
            case 4:
                return this.B;
            case 5:
                return this.C;
            case 6:
                return this.F;
            case 7:
                return this.D;
            case 8:
                return this.E;
            default:
                throw new AssertionError(type.name());
        }
    }

    public final DimensionBehaviour i(int i2) {
        if (i2 == 0) {
            return this.J[0];
        }
        if (i2 == 1) {
            return this.J[1];
        }
        return null;
    }

    public final int j() {
        if (this.X == 8) {
            return 0;
        }
        return this.M;
    }

    public final ConstraintWidget k(int i2) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i2 != 0) {
            if (i2 == 1 && (constraintAnchor2 = (constraintAnchor = this.B).d) != null && constraintAnchor2.d == constraintAnchor) {
                return constraintAnchor2.f17998b;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.A;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.d;
        if (constraintAnchor4 == null || constraintAnchor4.d != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.f17998b;
    }

    public final ConstraintWidget l(int i2) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i2 != 0) {
            if (i2 == 1 && (constraintAnchor2 = (constraintAnchor = this.f18037z).d) != null && constraintAnchor2.d == constraintAnchor) {
                return constraintAnchor2.f17998b;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.f18036y;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.d;
        if (constraintAnchor4 == null || constraintAnchor4.d != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.f17998b;
    }

    public final int m() {
        if (this.X == 8) {
            return 0;
        }
        return this.L;
    }

    public final int n() {
        ConstraintWidget constraintWidget = this.K;
        return (constraintWidget == null || !(constraintWidget instanceof ConstraintWidgetContainer)) ? this.P : ((ConstraintWidgetContainer) constraintWidget).f18049l0 + this.P;
    }

    public final int o() {
        ConstraintWidget constraintWidget = this.K;
        return (constraintWidget == null || !(constraintWidget instanceof ConstraintWidgetContainer)) ? this.Q : ((ConstraintWidgetContainer) constraintWidget).f18050m0 + this.Q;
    }

    public final void p(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i2, int i3) {
        h(type).b(constraintWidget.h(type2), i2, i3, true);
    }

    public final boolean q(int i2) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        int i3 = i2 * 2;
        ConstraintAnchor[] constraintAnchorArr = this.G;
        ConstraintAnchor constraintAnchor3 = constraintAnchorArr[i3];
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.d;
        return (constraintAnchor4 == null || constraintAnchor4.d == constraintAnchor3 || (constraintAnchor2 = (constraintAnchor = constraintAnchorArr[i3 + 1]).d) == null || constraintAnchor2.d != constraintAnchor) ? false : true;
    }

    public final boolean r() {
        ConstraintAnchor constraintAnchor = this.f18036y;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.d;
        if (constraintAnchor2 != null && constraintAnchor2.d == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.A;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.d;
        return constraintAnchor4 != null && constraintAnchor4.d == constraintAnchor3;
    }

    public final boolean s() {
        ConstraintAnchor constraintAnchor = this.f18037z;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.d;
        if (constraintAnchor2 != null && constraintAnchor2.d == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.B;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.d;
        return constraintAnchor4 != null && constraintAnchor4.d == constraintAnchor3;
    }

    public void t() {
        this.f18036y.h();
        this.f18037z.h();
        this.A.h();
        this.B.h();
        this.C.h();
        this.D.h();
        this.E.h();
        this.F.h();
        this.K = null;
        this.f18035v = 0.0f;
        this.L = 0;
        this.M = 0;
        this.N = 0.0f;
        this.O = -1;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0.5f;
        this.V = 0.5f;
        DimensionBehaviour[] dimensionBehaviourArr = this.J;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.f18040a;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.W = null;
        this.X = 0;
        this.Z = null;
        this.f18012a0 = 0;
        this.f18014b0 = 0;
        float[] fArr = this.f18016c0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f18021h = -1;
        this.f18022i = -1;
        int[] iArr = this.f18034u;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f18023j = 0;
        this.f18024k = 0;
        this.f18028o = 1.0f;
        this.f18031r = 1.0f;
        this.f18027n = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f18030q = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f18026m = 0;
        this.f18029p = 0;
        this.f18032s = -1;
        this.f18033t = 1.0f;
        boolean[] zArr = this.f18019f;
        zArr[0] = true;
        zArr[1] = true;
        boolean[] zArr2 = this.I;
        zArr2[0] = false;
        zArr2[1] = false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.Z != null ? d.r(new StringBuilder("type: "), this.Z, " ") : "");
        sb.append(this.Y != null ? d.r(new StringBuilder("id: "), this.Y, " ") : "");
        sb.append("(");
        sb.append(this.P);
        sb.append(", ");
        sb.append(this.Q);
        sb.append(") - (");
        sb.append(this.L);
        sb.append(" x ");
        return a.n(sb, this.M, ")");
    }

    public final void u() {
        ConstraintWidget constraintWidget = this.K;
        if (constraintWidget != null && (constraintWidget instanceof ConstraintWidgetContainer)) {
            ((ConstraintWidgetContainer) constraintWidget).getClass();
        }
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ConstraintAnchor) arrayList.get(i2)).h();
        }
    }

    public void v(Cache cache) {
        this.f18036y.i();
        this.f18037z.i();
        this.A.i();
        this.B.i();
        this.C.i();
        this.F.i();
        this.D.i();
        this.E.i();
    }

    public final void w(int i2) {
        this.M = i2;
        int i3 = this.T;
        if (i2 < i3) {
            this.M = i3;
        }
    }

    public final void x(DimensionBehaviour dimensionBehaviour) {
        this.J[0] = dimensionBehaviour;
    }

    public final void y(DimensionBehaviour dimensionBehaviour) {
        this.J[1] = dimensionBehaviour;
    }

    public final void z(int i2) {
        this.L = i2;
        int i3 = this.S;
        if (i2 < i3) {
            this.L = i3;
        }
    }
}
