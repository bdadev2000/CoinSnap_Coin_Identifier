package x;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import java.lang.ref.WeakReference;
import z.t;

/* loaded from: classes.dex */
public final class m {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f27281b;

    /* renamed from: c, reason: collision with root package name */
    public int f27282c;

    /* renamed from: d, reason: collision with root package name */
    public int f27283d;

    /* renamed from: e, reason: collision with root package name */
    public int f27284e;

    /* renamed from: f, reason: collision with root package name */
    public int f27285f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f27286g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f27287h;

    public m(n nVar, w.e eVar, t.d dVar, int i10) {
        this.f27287h = nVar;
        this.f27286g = new WeakReference(eVar);
        w.d dVar2 = eVar.I;
        dVar.getClass();
        this.a = t.d.n(dVar2);
        this.f27281b = t.d.n(eVar.J);
        this.f27282c = t.d.n(eVar.K);
        this.f27283d = t.d.n(eVar.L);
        this.f27284e = t.d.n(eVar.M);
        this.f27285f = i10;
    }

    public static boolean a(int i10, int i11, int i12) {
        if (i10 == i11) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i10);
        View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode2 == 1073741824) {
            if ((mode == Integer.MIN_VALUE || mode == 0) && i12 == size) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void b(w.e eVar, b bVar) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z16;
        int baseline;
        int i15;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        int i16;
        boolean z24;
        boolean z25;
        boolean z26;
        int i17;
        if (eVar == null) {
            return;
        }
        if (eVar.f26592g0 == 8) {
            bVar.f27249e = 0;
            bVar.f27250f = 0;
            bVar.f27251g = 0;
            return;
        }
        if (eVar.T == null) {
            return;
        }
        int i18 = bVar.a;
        int i19 = bVar.f27246b;
        int i20 = bVar.f27247c;
        int i21 = bVar.f27248d;
        int i22 = this.a + this.f27281b;
        int i23 = this.f27282c;
        View view = (View) eVar.f26590f0;
        int b3 = t.h.b(i18);
        w.d dVar = eVar.K;
        w.d dVar2 = eVar.I;
        if (b3 != 0) {
            if (b3 != 1) {
                if (b3 != 2) {
                    if (b3 != 3) {
                        makeMeasureSpec = 0;
                    } else {
                        int i24 = this.f27284e;
                        if (dVar2 != null) {
                            i17 = dVar2.f26577g + 0;
                        } else {
                            i17 = 0;
                        }
                        if (dVar != null) {
                            i17 += dVar.f26577g;
                        }
                        makeMeasureSpec = ViewGroup.getChildMeasureSpec(i24, i23 + i17, -1);
                    }
                } else {
                    makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f27284e, i23, -2);
                    if (eVar.f26612r == 1) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    int i25 = bVar.f27254j;
                    if (i25 == 1 || i25 == 2) {
                        if (view.getMeasuredHeight() == eVar.l()) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        if (bVar.f27254j != 2 && z24 && ((!z24 || !z25) && !eVar.B())) {
                            z26 = false;
                        } else {
                            z26 = true;
                        }
                        if (z26) {
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(eVar.r(), 1073741824);
                        }
                    }
                }
            } else {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f27284e, i23, -2);
            }
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i20, 1073741824);
        }
        int b10 = t.h.b(i19);
        if (b10 != 0) {
            if (b10 != 1) {
                if (b10 != 2) {
                    if (b10 != 3) {
                        makeMeasureSpec2 = 0;
                    } else {
                        int i26 = this.f27285f;
                        if (dVar2 != null) {
                            i16 = eVar.J.f26577g + 0;
                        } else {
                            i16 = 0;
                        }
                        if (dVar != null) {
                            i16 += eVar.L.f26577g;
                        }
                        makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i26, i22 + i16, -1);
                    }
                } else {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f27285f, i22, -2);
                    if (eVar.f26613s == 1) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    int i27 = bVar.f27254j;
                    if (i27 == 1 || i27 == 2) {
                        if (view.getMeasuredWidth() == eVar.r()) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        if (bVar.f27254j != 2 && z21 && ((!z21 || !z22) && !eVar.C())) {
                            z23 = false;
                        } else {
                            z23 = true;
                        }
                        if (z23) {
                            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.l(), 1073741824);
                        }
                    }
                }
            } else {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f27285f, i22, -2);
            }
        } else {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i21, 1073741824);
        }
        w.f fVar = (w.f) eVar.T;
        Object obj = this.f27287h;
        if (fVar != null && com.facebook.internal.i.p(((ConstraintLayout) obj).f1137k, NotificationCompat.FLAG_LOCAL_ONLY) && view.getMeasuredWidth() == eVar.r() && view.getMeasuredWidth() < fVar.r() && view.getMeasuredHeight() == eVar.l() && view.getMeasuredHeight() < fVar.l() && view.getBaseline() == eVar.f26580a0 && !eVar.A()) {
            if (a(eVar.G, makeMeasureSpec, eVar.r()) && a(eVar.H, makeMeasureSpec2, eVar.l())) {
                z20 = true;
            } else {
                z20 = false;
            }
            if (z20) {
                bVar.f27249e = eVar.r();
                bVar.f27250f = eVar.l();
                bVar.f27251g = eVar.f26580a0;
                return;
            }
        }
        if (i18 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i19 == 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i19 != 4 && i19 != 1) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (i18 != 4 && i18 != 1) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (z10 && eVar.W > 0.0f) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z11 && eVar.W > 0.0f) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (view == null) {
            return;
        }
        z.e eVar2 = (z.e) view.getLayoutParams();
        int i28 = bVar.f27254j;
        if (i28 != 1 && i28 != 2 && z10 && eVar.f26612r == 0 && z11 && eVar.f26613s == 0) {
            z16 = false;
            i15 = -1;
            baseline = 0;
            i10 = 0;
            i12 = 0;
        } else {
            if ((view instanceof t) && (eVar instanceof w.h)) {
                ((t) view).j((w.h) eVar, makeMeasureSpec, makeMeasureSpec2);
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            eVar.G = makeMeasureSpec;
            eVar.H = makeMeasureSpec2;
            eVar.f26591g = false;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i29 = eVar.u;
            if (i29 > 0) {
                i10 = Math.max(i29, measuredWidth);
            } else {
                i10 = measuredWidth;
            }
            int i30 = eVar.f26615v;
            if (i30 > 0) {
                i10 = Math.min(i30, i10);
            }
            int i31 = eVar.f26617x;
            if (i31 > 0) {
                i12 = Math.max(i31, measuredHeight);
                i11 = makeMeasureSpec2;
            } else {
                i11 = makeMeasureSpec2;
                i12 = measuredHeight;
            }
            int i32 = eVar.f26618y;
            if (i32 > 0) {
                i12 = Math.min(i32, i12);
            }
            if (!com.facebook.internal.i.p(((ConstraintLayout) obj).f1137k, 1)) {
                if (z14 && z12) {
                    i10 = (int) ((i12 * eVar.W) + 0.5f);
                } else if (z15 && z13) {
                    i12 = (int) ((i10 / eVar.W) + 0.5f);
                }
            }
            if (measuredWidth == i10 && measuredHeight == i12) {
                baseline = baseline2;
                z16 = false;
            } else {
                if (measuredWidth != i10) {
                    i13 = 1073741824;
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
                } else {
                    i13 = 1073741824;
                }
                if (measuredHeight != i12) {
                    i14 = View.MeasureSpec.makeMeasureSpec(i12, i13);
                } else {
                    i14 = i11;
                }
                view.measure(makeMeasureSpec, i14);
                eVar.G = makeMeasureSpec;
                eVar.H = i14;
                z16 = false;
                eVar.f26591g = false;
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                i12 = measuredHeight2;
                i10 = measuredWidth2;
            }
            i15 = -1;
        }
        if (baseline != i15) {
            z17 = true;
        } else {
            z17 = z16;
        }
        if (i10 == bVar.f27247c && i12 == bVar.f27248d) {
            z18 = z16;
        } else {
            z18 = true;
        }
        bVar.f27253i = z18;
        if (eVar2.f28317c0) {
            z19 = true;
        } else {
            z19 = z17;
        }
        if (z19 && baseline != -1 && eVar.f26580a0 != baseline) {
            bVar.f27253i = true;
        }
        bVar.f27249e = i10;
        bVar.f27250f = i12;
        bVar.f27252h = z19;
        bVar.f27251g = baseline;
    }

    public m(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f27287h = constraintLayout;
        this.f27286g = constraintLayout2;
    }
}
