package T;

import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class q0 extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0281l0 f2921a;
    public List b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f2922c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f2923d;

    public q0(AbstractC0281l0 abstractC0281l0) {
        super(abstractC0281l0.b);
        this.f2923d = new HashMap();
        this.f2921a = abstractC0281l0;
    }

    public final t0 a(WindowInsetsAnimation windowInsetsAnimation) {
        t0 t0Var = (t0) this.f2923d.get(windowInsetsAnimation);
        if (t0Var == null) {
            t0Var = new t0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                t0Var.f2928a = new r0(windowInsetsAnimation);
            }
            this.f2923d.put(windowInsetsAnimation, t0Var);
        }
        return t0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        AbstractC0281l0 abstractC0281l0 = this.f2921a;
        a(windowInsetsAnimation);
        ((B3.r) abstractC0281l0).f305c.setTranslationY(0.0f);
        this.f2923d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        AbstractC0281l0 abstractC0281l0 = this.f2921a;
        a(windowInsetsAnimation);
        B3.r rVar = (B3.r) abstractC0281l0;
        View view = rVar.f305c;
        int[] iArr = rVar.f308f;
        view.getLocationOnScreen(iArr);
        rVar.f306d = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f2922c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f2922c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation j7 = I3.b.j(list.get(size));
            t0 a6 = a(j7);
            fraction = j7.getFraction();
            a6.f2928a.d(fraction);
            this.f2922c.add(a6);
        }
        AbstractC0281l0 abstractC0281l0 = this.f2921a;
        G0 h6 = G0.h(null, windowInsets);
        abstractC0281l0.a(h6, this.b);
        return h6.g();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        AbstractC0281l0 abstractC0281l0 = this.f2921a;
        a(windowInsetsAnimation);
        lowerBound = bounds.getLowerBound();
        L.e c9 = L.e.c(lowerBound);
        upperBound = bounds.getUpperBound();
        L.e c10 = L.e.c(upperBound);
        B3.r rVar = (B3.r) abstractC0281l0;
        View view = rVar.f305c;
        int[] iArr = rVar.f308f;
        view.getLocationOnScreen(iArr);
        int i9 = rVar.f306d - iArr[1];
        rVar.f307e = i9;
        view.setTranslationY(i9);
        I3.b.m();
        return I3.b.h(c9.d(), c10.d());
    }
}
