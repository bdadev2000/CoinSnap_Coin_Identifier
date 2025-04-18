package la;

import a4.j;
import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.e;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public final class c extends mi.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SideSheetBehavior f21291d;

    public c(SideSheetBehavior sideSheetBehavior) {
        this.f21291d = sideSheetBehavior;
    }

    @Override // mi.a
    public final int d(View view, int i10) {
        int H;
        int i11;
        SideSheetBehavior sideSheetBehavior = this.f21291d;
        a aVar = sideSheetBehavior.a;
        switch (aVar.f21286f) {
            case 0:
                H = -aVar.f21287g.f11783l;
                break;
            default:
                H = aVar.H();
                break;
        }
        a aVar2 = sideSheetBehavior.a;
        int i12 = aVar2.f21286f;
        SideSheetBehavior sideSheetBehavior2 = aVar2.f21287g;
        switch (i12) {
            case 0:
                i11 = sideSheetBehavior2.f11786o;
                break;
            default:
                i11 = sideSheetBehavior2.f11784m;
                break;
        }
        return e.o(i10, H, i11);
    }

    @Override // mi.a
    public final int e(View view, int i10) {
        return view.getTop();
    }

    @Override // mi.a
    public final int h(View view) {
        SideSheetBehavior sideSheetBehavior = this.f21291d;
        return sideSheetBehavior.f11783l + sideSheetBehavior.f11786o;
    }

    @Override // mi.a
    public final void l(int i10) {
        if (i10 == 1) {
            SideSheetBehavior sideSheetBehavior = this.f21291d;
            if (sideSheetBehavior.f11778g) {
                sideSheetBehavior.y(1);
            }
        }
    }

    @Override // mi.a
    public final void m(View view, int i10, int i11) {
        View view2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        SideSheetBehavior sideSheetBehavior = this.f21291d;
        WeakReference weakReference = sideSheetBehavior.f11788q;
        if (weakReference != null) {
            view2 = (View) weakReference.get();
        } else {
            view2 = null;
        }
        if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
            a aVar = sideSheetBehavior.a;
            int left = view.getLeft();
            int right = view.getRight();
            int i12 = aVar.f21286f;
            SideSheetBehavior sideSheetBehavior2 = aVar.f21287g;
            switch (i12) {
                case 0:
                    if (left <= sideSheetBehavior2.f11784m) {
                        marginLayoutParams.leftMargin = right;
                        break;
                    }
                    break;
                default:
                    int i13 = sideSheetBehavior2.f11784m;
                    if (left <= i13) {
                        marginLayoutParams.rightMargin = i13 - left;
                        break;
                    }
                    break;
            }
            view2.setLayoutParams(marginLayoutParams);
        }
        LinkedHashSet linkedHashSet = sideSheetBehavior.f11792v;
        if (!linkedHashSet.isEmpty()) {
            sideSheetBehavior.a.F(i10);
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                j.t(it.next());
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r5 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (java.lang.Math.abs(r5 - r0.a.H()) < java.lang.Math.abs(r5 - r0.a.I())) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r0.a.M(r4) == false) goto L21;
     */
    @Override // mi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(android.view.View r4, float r5, float r6) {
        /*
            r3 = this;
            com.google.android.material.sidesheet.SideSheetBehavior r0 = r3.f21291d
            la.a r1 = r0.a
            boolean r1 = r1.L(r5)
            r2 = 1
            if (r1 == 0) goto Lc
            goto L58
        Lc:
            la.a r1 = r0.a
            boolean r1 = r1.O(r4, r5)
            if (r1 == 0) goto L25
            la.a r1 = r0.a
            boolean r5 = r1.N(r5, r6)
            if (r5 != 0) goto L5a
            la.a r5 = r0.a
            boolean r5 = r5.M(r4)
            if (r5 == 0) goto L58
            goto L5a
        L25:
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 == 0) goto L3b
            float r5 = java.lang.Math.abs(r5)
            float r6 = java.lang.Math.abs(r6)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L38
            r5 = r2
            goto L39
        L38:
            r5 = 0
        L39:
            if (r5 != 0) goto L5a
        L3b:
            int r5 = r4.getLeft()
            la.a r6 = r0.a
            int r6 = r6.H()
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            la.a r1 = r0.a
            int r1 = r1.I()
            int r5 = r5 - r1
            int r5 = java.lang.Math.abs(r5)
            if (r6 >= r5) goto L5a
        L58:
            r5 = 3
            goto L5b
        L5a:
            r5 = 5
        L5b:
            r0.z(r4, r5, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: la.c.n(android.view.View, float, float):void");
    }

    @Override // mi.a
    public final boolean p(int i10, View view) {
        WeakReference weakReference;
        SideSheetBehavior sideSheetBehavior = this.f21291d;
        if (sideSheetBehavior.f11779h == 1 || (weakReference = sideSheetBehavior.f11787p) == null || weakReference.get() != view) {
            return false;
        }
        return true;
    }
}
