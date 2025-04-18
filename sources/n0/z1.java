package n0;

import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class z1 extends WindowInsetsAnimation.Callback {
    public final u1 a;

    /* renamed from: b, reason: collision with root package name */
    public List f22373b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f22374c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f22375d;

    public z1(u1 u1Var) {
        super(u1Var.f22351b);
        this.f22375d = new HashMap();
        this.a = u1Var;
    }

    public final c2 a(WindowInsetsAnimation windowInsetsAnimation) {
        c2 c2Var = (c2) this.f22375d.get(windowInsetsAnimation);
        if (c2Var == null) {
            c2 c2Var2 = new c2(windowInsetsAnimation);
            this.f22375d.put(windowInsetsAnimation, c2Var2);
            return c2Var2;
        }
        return c2Var;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        u1 u1Var = this.a;
        a(windowInsetsAnimation);
        ((v9.i) u1Var).f26370c.setTranslationY(0.0f);
        this.f22375d.remove(windowInsetsAnimation);
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        u1 u1Var = this.a;
        a(windowInsetsAnimation);
        v9.i iVar = (v9.i) u1Var;
        View view = iVar.f26370c;
        int[] iArr = iVar.f26373f;
        view.getLocationOnScreen(iArr);
        iVar.f26371d = iArr[1];
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f22374c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f22374c = arrayList2;
            this.f22373b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                WindowInsetsAnimation l10 = jb.z.l(list.get(size));
                c2 a = a(l10);
                fraction = l10.getFraction();
                a.a.d(fraction);
                this.f22374c.add(a);
            } else {
                u1 u1Var = this.a;
                r2 h10 = r2.h(null, windowInsets);
                u1Var.a(h10, this.f22373b);
                return h10.g();
            }
        }
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        u1 u1Var = this.a;
        a(windowInsetsAnimation);
        d3.g gVar = new d3.g(bounds);
        v9.i iVar = (v9.i) u1Var;
        View view = iVar.f26370c;
        int[] iArr = iVar.f26373f;
        view.getLocationOnScreen(iArr);
        int i10 = iVar.f26371d - iArr[1];
        iVar.f26372e = i10;
        view.setTranslationY(i10);
        jb.z.B();
        return jb.z.j(((g0.f) gVar.f16812c).d(), ((g0.f) gVar.f16813d).d());
    }
}
