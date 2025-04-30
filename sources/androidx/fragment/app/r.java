package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import u7.AbstractC2816g;
import u7.AbstractC2822m;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f4771a;
    public final ArrayList b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4772c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4773d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4774e;

    public r(ViewGroup viewGroup) {
        G7.j.e(viewGroup, "container");
        this.f4771a = viewGroup;
        this.b = new ArrayList();
        this.f4772c = new ArrayList();
    }

    public static void j(x.b bVar, View view) {
        String transitionName = ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            bVar.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = viewGroup.getChildAt(i9);
                if (childAt.getVisibility() == 0) {
                    j(bVar, childAt);
                }
            }
        }
    }

    public static final r n(ViewGroup viewGroup, FragmentManager fragmentManager) {
        G7.j.e(viewGroup, "container");
        G7.j.e(fragmentManager, "fragmentManager");
        G7.j.d(fragmentManager.getSpecialEffectsControllerFactory(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof r) {
            return (r) tag;
        }
        r rVar = new r(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, rVar);
        return rVar;
    }

    public static void q(x.b bVar, Collection collection) {
        Set entrySet = bVar.entrySet();
        G7.j.d(entrySet, "entries");
        G7.w wVar = new G7.w(collection, 6);
        Iterator it = ((x.i) entrySet).iterator();
        while (it.hasNext()) {
            if (!((Boolean) wVar.invoke(it.next())).booleanValue()) {
                it.remove();
            }
        }
    }

    public final void a(L0 l02) {
        G7.j.e(l02, "operation");
        if (l02.f4673i) {
            int i9 = l02.f4666a;
            View requireView = l02.f4667c.requireView();
            G7.j.d(requireView, "operation.fragment.requireView()");
            Q7.n0.a(i9, requireView, this.f4771a);
            l02.f4673i = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03ff A[LOOP:7: B:80:0x03f9->B:82:0x03ff, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x041e  */
    /* JADX WARN: Type inference failed for: r13v1, types: [x.l, java.util.Map, x.b] */
    /* JADX WARN: Type inference failed for: r5v0, types: [x.l, java.util.Map, x.b] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [x.l, java.util.Map, x.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.util.ArrayList r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 1263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.r.b(java.util.ArrayList, boolean):void");
    }

    public final void c(ArrayList arrayList) {
        G7.j.e(arrayList, "operations");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC2822m.G(((L0) it.next()).f4675k, arrayList2);
        }
        List T2 = AbstractC2816g.T(AbstractC2816g.V(arrayList2));
        int size = T2.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((K0) T2.get(i9)).c(this.f4771a);
        }
        int size2 = arrayList.size();
        for (int i10 = 0; i10 < size2; i10++) {
            a((L0) arrayList.get(i10));
        }
        List T8 = AbstractC2816g.T(arrayList);
        int size3 = T8.size();
        for (int i11 = 0; i11 < size3; i11++) {
            L0 l02 = (L0) T8.get(i11);
            if (l02.f4675k.isEmpty()) {
                l02.b();
            }
        }
    }

    public final void d(int i9, int i10, w0 w0Var) {
        synchronized (this.b) {
            try {
                Fragment fragment = w0Var.f4797c;
                G7.j.d(fragment, "fragmentStateManager.fragment");
                L0 k6 = k(fragment);
                if (k6 == null) {
                    Fragment fragment2 = w0Var.f4797c;
                    if (fragment2.mTransitioning) {
                        k6 = l(fragment2);
                    } else {
                        k6 = null;
                    }
                }
                if (k6 != null) {
                    k6.d(i9, i10);
                    return;
                }
                L0 l02 = new L0(i9, i10, w0Var);
                this.b.add(l02);
                l02.f4668d.add(new J0(this, l02, 0));
                l02.f4668d.add(new J0(this, l02, 2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(int i9, w0 w0Var) {
        AbstractC2914a.i(i9, "finalState");
        G7.j.e(w0Var, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Enqueuing add operation for fragment " + w0Var.f4797c);
        }
        d(i9, 2, w0Var);
    }

    public final void f(w0 w0Var) {
        G7.j.e(w0Var, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Enqueuing hide operation for fragment " + w0Var.f4797c);
        }
        d(3, 1, w0Var);
    }

    public final void g(w0 w0Var) {
        G7.j.e(w0Var, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Enqueuing remove operation for fragment " + w0Var.f4797c);
        }
        d(1, 3, w0Var);
    }

    public final void h(w0 w0Var) {
        G7.j.e(w0Var, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Enqueuing show operation for fragment " + w0Var.f4797c);
        }
        d(2, 1, w0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x019c A[Catch: all -> 0x005d, TRY_LEAVE, TryCatch #0 {all -> 0x005d, blocks: (B:12:0x0017, B:14:0x0020, B:15:0x002f, B:17:0x0035, B:19:0x0041, B:20:0x0060, B:23:0x0072, B:26:0x0076, B:30:0x006f, B:34:0x007c, B:35:0x008b, B:37:0x0092, B:39:0x009e, B:40:0x00b4, B:43:0x00cb, B:46:0x00cf, B:51:0x00c6, B:52:0x00c8, B:54:0x00d5, B:58:0x00e6, B:60:0x00f6, B:61:0x00fd, B:62:0x0108, B:64:0x010e, B:66:0x011d, B:68:0x0123, B:72:0x0144, B:78:0x012a, B:79:0x012e, B:81:0x0134, B:90:0x014f, B:91:0x0158, B:93:0x015e, B:95:0x016a, B:99:0x0175, B:100:0x0194, B:102:0x019c, B:104:0x017e, B:106:0x0188), top: B:11:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0175 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:12:0x0017, B:14:0x0020, B:15:0x002f, B:17:0x0035, B:19:0x0041, B:20:0x0060, B:23:0x0072, B:26:0x0076, B:30:0x006f, B:34:0x007c, B:35:0x008b, B:37:0x0092, B:39:0x009e, B:40:0x00b4, B:43:0x00cb, B:46:0x00cf, B:51:0x00c6, B:52:0x00c8, B:54:0x00d5, B:58:0x00e6, B:60:0x00f6, B:61:0x00fd, B:62:0x0108, B:64:0x010e, B:66:0x011d, B:68:0x0123, B:72:0x0144, B:78:0x012a, B:79:0x012e, B:81:0x0134, B:90:0x014f, B:91:0x0158, B:93:0x015e, B:95:0x016a, B:99:0x0175, B:100:0x0194, B:102:0x019c, B:104:0x017e, B:106:0x0188), top: B:11:0x0017 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.r.i():void");
    }

    public final L0 k(Fragment fragment) {
        Object obj;
        Iterator it = this.b.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                L0 l02 = (L0) obj;
                if (G7.j.a(l02.f4667c, fragment) && !l02.f4669e) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (L0) obj;
    }

    public final L0 l(Fragment fragment) {
        Object obj;
        Iterator it = this.f4772c.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                L0 l02 = (L0) obj;
                if (G7.j.a(l02.f4667c, fragment) && !l02.f4669e) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (L0) obj;
    }

    public final void m() {
        String str;
        String str2;
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = this.f4771a.isAttachedToWindow();
        synchronized (this.b) {
            try {
                r();
                p(this.b);
                Iterator it = AbstractC2816g.U(this.f4772c).iterator();
                while (it.hasNext()) {
                    L0 l02 = (L0) it.next();
                    if (FragmentManager.isLoggingEnabled(2)) {
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f4771a + " is not attached to window. ";
                        }
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: " + str2 + "Cancelling running operation " + l02);
                    }
                    l02.a(this.f4771a);
                }
                Iterator it2 = AbstractC2816g.U(this.b).iterator();
                while (it2.hasNext()) {
                    L0 l03 = (L0) it2.next();
                    if (FragmentManager.isLoggingEnabled(2)) {
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f4771a + " is not attached to window. ";
                        }
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: " + str + "Cancelling pending operation " + l03);
                    }
                    l03.a(this.f4771a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o() {
        Fragment fragment;
        Object obj;
        boolean z8;
        synchronized (this.b) {
            try {
                r();
                ArrayList arrayList = this.b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    fragment = null;
                    if (listIterator.hasPrevious()) {
                        obj = listIterator.previous();
                        L0 l02 = (L0) obj;
                        View view = l02.f4667c.mView;
                        G7.j.d(view, "operation.fragment.mView");
                        int G3 = com.bumptech.glide.d.G(view);
                        if (l02.f4666a == 2 && G3 != 2) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                L0 l03 = (L0) obj;
                if (l03 != null) {
                    fragment = l03.f4667c;
                }
                if (fragment != null) {
                    z8 = fragment.isPostponed();
                } else {
                    z8 = false;
                }
                this.f4774e = z8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void p(List list) {
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            L0 l02 = (L0) list.get(i9);
            if (!l02.f4672h) {
                l02.f4672h = true;
                int i10 = l02.b;
                w0 w0Var = l02.l;
                if (i10 == 2) {
                    Fragment fragment = w0Var.f4797c;
                    G7.j.d(fragment, "fragmentStateManager.fragment");
                    View findFocus = fragment.mView.findFocus();
                    if (findFocus != null) {
                        fragment.setFocusedView(findFocus);
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "requestFocus: Saved focused view " + findFocus + " for Fragment " + fragment);
                        }
                    }
                    View requireView = l02.f4667c.requireView();
                    G7.j.d(requireView, "this.fragment.requireView()");
                    if (requireView.getParent() == null) {
                        w0Var.b();
                        requireView.setAlpha(0.0f);
                    }
                    if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                        requireView.setVisibility(4);
                    }
                    requireView.setAlpha(fragment.getPostOnViewCreatedAlpha());
                } else if (i10 == 3) {
                    Fragment fragment2 = w0Var.f4797c;
                    G7.j.d(fragment2, "fragmentStateManager.fragment");
                    View requireView2 = fragment2.requireView();
                    G7.j.d(requireView2, "fragment.requireView()");
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "Clearing focus " + requireView2.findFocus() + " on view " + requireView2 + " for Fragment " + fragment2);
                    }
                    requireView2.clearFocus();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2822m.G(((L0) it.next()).f4675k, arrayList);
        }
        List T2 = AbstractC2816g.T(AbstractC2816g.V(arrayList));
        int size2 = T2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            K0 k02 = (K0) T2.get(i11);
            k02.getClass();
            ViewGroup viewGroup = this.f4771a;
            G7.j.e(viewGroup, "container");
            if (!k02.f4664a) {
                k02.e(viewGroup);
            }
            k02.f4664a = true;
        }
    }

    public final void r() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            L0 l02 = (L0) it.next();
            int i9 = 2;
            if (l02.b == 2) {
                View requireView = l02.f4667c.requireView();
                G7.j.d(requireView, "fragment.requireView()");
                int visibility = requireView.getVisibility();
                if (visibility != 0) {
                    i9 = 4;
                    if (visibility != 4) {
                        if (visibility == 8) {
                            i9 = 3;
                        } else {
                            throw new IllegalArgumentException(com.mbridge.msdk.foundation.entity.o.h(visibility, "Unknown visibility "));
                        }
                    }
                }
                l02.d(i9, 1);
            }
        }
    }
}
