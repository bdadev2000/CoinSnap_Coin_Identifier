package k;

import android.content.Context;
import android.media.MediaActionSound;
import android.view.MenuItem;
import com.google.common.collect.c1;
import com.otaliastudios.cameraview.CameraView;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class d {
    public Object a;

    /* renamed from: b, reason: collision with root package name */
    public Object f20054b;

    /* renamed from: c, reason: collision with root package name */
    public Object f20055c;

    public d() {
    }

    public d(Context context) {
        this.a = context;
    }

    public static boolean n(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean p(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        if (size != map.size()) {
            return true;
        }
        return false;
    }

    public abstract void c();

    public abstract Object d(int i10, int i11);

    public abstract r.b e();

    public abstract int f();

    public abstract int g(Object obj);

    public abstract int h(Object obj);

    public abstract void i(Object obj, Object obj2);

    public abstract void j(int i10);

    public abstract Object k(int i10, Object obj);

    public final void l(boolean z10) {
        CameraView cameraView;
        boolean z11;
        xe.f fVar = (xe.f) this.f20054b;
        if (fVar != null) {
            boolean z12 = !z10;
            c1 c1Var = (c1) ((he.v) fVar).f19028c;
            if (z12 && (z11 = (cameraView = (CameraView) c1Var.f11925d).f16475b) && z11) {
                if (cameraView.f16491s == null) {
                    cameraView.f16491s = new MediaActionSound();
                }
                cameraView.f16491s.play(0);
            }
            ((CameraView) c1Var.f11925d).f16484l.post(new fe.i(c1Var, 4));
        }
    }

    public void m() {
        Object obj = this.f20054b;
        if (((xe.f) obj) != null) {
            ((xe.f) obj).a((fe.k) this.a, (Exception) this.f20055c);
            this.f20054b = null;
            this.a = null;
        }
    }

    public final MenuItem o(MenuItem menuItem) {
        if (menuItem instanceof i0.b) {
            i0.b bVar = (i0.b) menuItem;
            if (((r.k) this.f20054b) == null) {
                this.f20054b = new r.k();
            }
            MenuItem menuItem2 = (MenuItem) ((r.k) this.f20054b).getOrDefault(bVar, null);
            if (menuItem2 == null) {
                w wVar = new w((Context) this.a, bVar);
                ((r.k) this.f20054b).put(bVar, wVar);
                return wVar;
            }
            return menuItem2;
        }
        return menuItem;
    }

    public abstract void q();

    public final Object[] r(int i10, Object[] objArr) {
        int f10 = f();
        if (objArr.length < f10) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), f10);
        }
        for (int i11 = 0; i11 < f10; i11++) {
            objArr[i11] = d(i11, i10);
        }
        if (objArr.length > f10) {
            objArr[f10] = null;
        }
        return objArr;
    }

    public d(fe.k kVar, xe.f fVar) {
        this.a = kVar;
        this.f20054b = fVar;
    }
}
