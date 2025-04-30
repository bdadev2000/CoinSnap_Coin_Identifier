package E;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f836a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f837c;

    /* renamed from: d, reason: collision with root package name */
    public int f838d;

    /* renamed from: e, reason: collision with root package name */
    public int f839e;

    /* renamed from: f, reason: collision with root package name */
    public int f840f;

    /* renamed from: g, reason: collision with root package name */
    public int f841g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f842h;

    public f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f842h = constraintLayout;
        this.f836a = constraintLayout2;
    }

    public static boolean a(int i9, int i10, int i11) {
        if (i9 == i10) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i9);
        View.MeasureSpec.getSize(i9);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode2 == 1073741824) {
            if ((mode == Integer.MIN_VALUE || mode == 0) && i11 == size) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void b(B.d dVar, C.b bVar) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z14;
        int measuredWidth;
        int baseline;
        int i13;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        int i14;
        boolean z19;
        boolean z20;
        int i15;
        if (dVar == null) {
            return;
        }
        if (dVar.f147g0 == 8) {
            bVar.f340e = 0;
            bVar.f341f = 0;
            bVar.f342g = 0;
            return;
        }
        if (dVar.f129T == null) {
            return;
        }
        int i16 = bVar.f337a;
        int i17 = bVar.b;
        int i18 = bVar.f338c;
        int i19 = bVar.f339d;
        int i20 = this.b + this.f837c;
        int i21 = this.f838d;
        View view = (View) dVar.f0;
        int d2 = AbstractC2965e.d(i16);
        B.c cVar = dVar.f121K;
        B.c cVar2 = dVar.f119I;
        if (d2 != 0) {
            if (d2 != 1) {
                if (d2 != 2) {
                    if (d2 != 3) {
                        makeMeasureSpec = 0;
                    } else {
                        int i22 = this.f840f;
                        if (cVar2 != null) {
                            i15 = cVar2.f108g;
                        } else {
                            i15 = 0;
                        }
                        if (cVar != null) {
                            i15 += cVar.f108g;
                        }
                        makeMeasureSpec = ViewGroup.getChildMeasureSpec(i22, i21 + i15, -1);
                    }
                } else {
                    makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f840f, i21, -2);
                    if (dVar.f165r == 1) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    int i23 = bVar.f345j;
                    if (i23 == 1 || i23 == 2) {
                        if (view.getMeasuredHeight() == dVar.k()) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        if (bVar.f345j == 2 || !z19 || ((z19 && z20) || dVar.A())) {
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dVar.q(), 1073741824);
                        }
                    }
                }
            } else {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f840f, i21, -2);
            }
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
        }
        int d9 = AbstractC2965e.d(i17);
        if (d9 != 0) {
            if (d9 != 1) {
                if (d9 != 2) {
                    if (d9 != 3) {
                        makeMeasureSpec2 = 0;
                    } else {
                        int i24 = this.f841g;
                        if (cVar2 != null) {
                            i14 = dVar.f120J.f108g;
                        } else {
                            i14 = 0;
                        }
                        if (cVar != null) {
                            i14 += dVar.f122L.f108g;
                        }
                        makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i24, i20 + i14, -1);
                    }
                } else {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f841g, i20, -2);
                    if (dVar.f166s == 1) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    int i25 = bVar.f345j;
                    if (i25 == 1 || i25 == 2) {
                        if (view.getMeasuredWidth() == dVar.q()) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (bVar.f345j == 2 || !z17 || ((z17 && z18) || dVar.B())) {
                            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(dVar.k(), 1073741824);
                        }
                    }
                }
            } else {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f841g, i20, -2);
            }
        } else {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
        }
        B.e eVar = (B.e) dVar.f129T;
        ConstraintLayout constraintLayout = this.f842h;
        if (eVar != null && B.j.c(constraintLayout.f4334k, NotificationCompat.FLAG_LOCAL_ONLY) && view.getMeasuredWidth() == dVar.q() && view.getMeasuredWidth() < eVar.q() && view.getMeasuredHeight() == dVar.k() && view.getMeasuredHeight() < eVar.k() && view.getBaseline() == dVar.f137a0 && !dVar.z() && a(dVar.f117G, makeMeasureSpec, dVar.q()) && a(dVar.f118H, makeMeasureSpec2, dVar.k())) {
            bVar.f340e = dVar.q();
            bVar.f341f = dVar.k();
            bVar.f342g = dVar.f137a0;
            return;
        }
        if (i16 == 3) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (i17 == 3) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (i17 != 4 && i17 != 1) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (i16 != 4 && i16 != 1) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z8 && dVar.f132W > 0.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z9 && dVar.f132W > 0.0f) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (view == null) {
            return;
        }
        e eVar2 = (e) view.getLayoutParams();
        int i26 = bVar.f345j;
        if (i26 != 1 && i26 != 2 && z8 && dVar.f165r == 0 && z9 && dVar.f166s == 0) {
            z14 = false;
            measuredWidth = 0;
            i13 = -1;
            baseline = 0;
            i10 = 0;
        } else {
            if ((view instanceof t) && (dVar instanceof B.g)) {
                ((t) view).l((B.g) dVar, makeMeasureSpec, makeMeasureSpec2);
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            dVar.f117G = makeMeasureSpec;
            dVar.f118H = makeMeasureSpec2;
            dVar.f146g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i27 = dVar.f168u;
            if (i27 > 0) {
                i9 = Math.max(i27, measuredWidth2);
            } else {
                i9 = measuredWidth2;
            }
            int i28 = dVar.f169v;
            if (i28 > 0) {
                i9 = Math.min(i28, i9);
            }
            int i29 = dVar.f171x;
            if (i29 > 0) {
                i10 = Math.max(i29, measuredHeight);
            } else {
                i10 = measuredHeight;
            }
            int i30 = makeMeasureSpec;
            int i31 = dVar.f172y;
            if (i31 > 0) {
                i10 = Math.min(i31, i10);
            }
            if (!B.j.c(constraintLayout.f4334k, 1)) {
                if (z12 && z10) {
                    i9 = (int) ((i10 * dVar.f132W) + 0.5f);
                } else if (z13 && z11) {
                    i10 = (int) ((i9 / dVar.f132W) + 0.5f);
                }
            }
            if (measuredWidth2 == i9 && measuredHeight == i10) {
                baseline = baseline2;
                measuredWidth = i9;
                z14 = false;
            } else {
                if (measuredWidth2 != i9) {
                    i11 = 1073741824;
                    i12 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
                } else {
                    i11 = 1073741824;
                    i12 = i30;
                }
                if (measuredHeight != i10) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i10, i11);
                }
                view.measure(i12, makeMeasureSpec2);
                dVar.f117G = i12;
                dVar.f118H = makeMeasureSpec2;
                z14 = false;
                dVar.f146g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                i10 = measuredHeight2;
            }
            i13 = -1;
        }
        if (baseline != i13) {
            z15 = true;
        } else {
            z15 = z14;
        }
        if (measuredWidth != bVar.f338c || i10 != bVar.f339d) {
            z14 = true;
        }
        bVar.f344i = z14;
        if (eVar2.f802c0) {
            z16 = true;
        } else {
            z16 = z15;
        }
        if (z16 && baseline != -1 && dVar.f137a0 != baseline) {
            bVar.f344i = true;
        }
        bVar.f340e = measuredWidth;
        bVar.f341f = i10;
        bVar.f343h = z16;
        bVar.f342g = baseline;
    }
}
