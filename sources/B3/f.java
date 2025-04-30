package B3;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public final class f extends y8.a {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G.b f284c;

    public /* synthetic */ f(G.b bVar, int i9) {
        this.b = i9;
        this.f284c = bVar;
    }

    @Override // y8.a
    public final int d(View view, int i9) {
        switch (this.b) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f284c;
                return F2.h.f(i9, sideSheetBehavior.f14106a.s(), sideSheetBehavior.f14106a.r());
        }
    }

    @Override // y8.a
    public final int e(View view, int i9) {
        switch (this.b) {
            case 0:
                return F2.h.f(i9, ((BottomSheetBehavior) this.f284c).C(), p());
            default:
                return view.getTop();
        }
    }

    @Override // y8.a
    public int o(View view) {
        switch (this.b) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f284c;
                return sideSheetBehavior.l + sideSheetBehavior.f14117o;
            default:
                return super.o(view);
        }
    }

    @Override // y8.a
    public int p() {
        switch (this.b) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f284c;
                if (bottomSheetBehavior.f13922I) {
                    return bottomSheetBehavior.f13932T;
                }
                return bottomSheetBehavior.f13920G;
            default:
                return super.p();
        }
    }

    @Override // y8.a
    public final void s(int i9) {
        switch (this.b) {
            case 0:
                if (i9 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f284c;
                    if (bottomSheetBehavior.f13924K) {
                        bottomSheetBehavior.I(1);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i9 == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f284c;
                    if (sideSheetBehavior.f14111g) {
                        sideSheetBehavior.w(1);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // y8.a
    public final void t(View view, int i9, int i10) {
        View view2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.b) {
            case 0:
                ((BottomSheetBehavior) this.f284c).y(i10);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f284c;
                WeakReference weakReference = sideSheetBehavior.f14119q;
                if (weakReference != null) {
                    view2 = (View) weakReference.get();
                } else {
                    view2 = null;
                }
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f14106a.Z(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f14124v;
                if (!linkedHashSet.isEmpty()) {
                    sideSheetBehavior.f14106a.e(i9);
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        com.mbridge.msdk.foundation.entity.o.v(it.next());
                        throw null;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r0.f14106a.z(r6) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        if (java.lang.Math.abs(r7 - r0.f14106a.p()) < java.lang.Math.abs(r7 - r0.f14106a.q())) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        if (r7 > r4.f13918E) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cd, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r4.C()) < java.lang.Math.abs(r6.getTop() - r4.f13918E)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fb, code lost:
    
        if (java.lang.Math.abs(r7 - r4.f13918E) < java.lang.Math.abs(r7 - r4.f13920G)) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0115, code lost:
    
        if (java.lang.Math.abs(r7 - r4.f13917D) < java.lang.Math.abs(r7 - r4.f13920G)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0125, code lost:
    
        if (r7 < java.lang.Math.abs(r7 - r4.f13920G)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0136, code lost:
    
        if (java.lang.Math.abs(r7 - r8) < java.lang.Math.abs(r7 - r4.f13920G)) goto L71;
     */
    @Override // y8.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(android.view.View r6, float r7, float r8) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.f.u(android.view.View, float, float):void");
    }

    @Override // y8.a
    public final boolean y(View view, int i9) {
        View view2;
        WeakReference weakReference;
        switch (this.b) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f284c;
                int i10 = bottomSheetBehavior.f13925L;
                if (i10 == 1 || bottomSheetBehavior.f13941b0) {
                    return false;
                }
                if (i10 == 3 && bottomSheetBehavior.f13938Z == i9) {
                    WeakReference weakReference2 = bottomSheetBehavior.f13934V;
                    if (weakReference2 != null) {
                        view2 = (View) weakReference2.get();
                    } else {
                        view2 = null;
                    }
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                System.currentTimeMillis();
                WeakReference weakReference3 = bottomSheetBehavior.f13933U;
                if (weakReference3 == null || weakReference3.get() != view) {
                    return false;
                }
                return true;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f284c;
                if (sideSheetBehavior.f14112h == 1 || (weakReference = sideSheetBehavior.f14118p) == null || weakReference.get() != view) {
                    return false;
                }
                return true;
        }
    }
}
