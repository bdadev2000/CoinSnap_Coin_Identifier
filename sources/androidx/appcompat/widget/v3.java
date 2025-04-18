package androidx.appcompat.widget;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class v3 implements k.c0 {

    /* renamed from: b, reason: collision with root package name */
    public k.o f1063b;

    /* renamed from: c, reason: collision with root package name */
    public k.q f1064c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Toolbar f1065d;

    public v3(Toolbar toolbar) {
        this.f1065d = toolbar;
    }

    @Override // k.c0
    public final void b(k.o oVar, boolean z10) {
    }

    @Override // k.c0
    public final boolean c(k.q qVar) {
        Toolbar toolbar = this.f1065d;
        KeyEvent.Callback callback = toolbar.f780k;
        if (callback instanceof j.d) {
            ((j.d) callback).e();
        }
        toolbar.removeView(toolbar.f780k);
        toolbar.removeView(toolbar.f779j);
        toolbar.f780k = null;
        ArrayList arrayList = toolbar.G;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                toolbar.addView((View) arrayList.get(size));
            } else {
                arrayList.clear();
                this.f1064c = null;
                toolbar.requestLayout();
                qVar.C = false;
                qVar.f20162n.p(false);
                toolbar.s();
                return true;
            }
        }
    }

    @Override // k.c0
    public final void d() {
        if (this.f1064c != null) {
            k.o oVar = this.f1063b;
            boolean z10 = false;
            if (oVar != null) {
                int size = oVar.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    if (this.f1063b.getItem(i10) == this.f1064c) {
                        z10 = true;
                        break;
                    }
                    i10++;
                }
            }
            if (!z10) {
                c(this.f1064c);
            }
        }
    }

    @Override // k.c0
    public final boolean e(k.q qVar) {
        Toolbar toolbar = this.f1065d;
        toolbar.c();
        ViewParent parent = toolbar.f779j.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f779j);
            }
            toolbar.addView(toolbar.f779j);
        }
        View actionView = qVar.getActionView();
        toolbar.f780k = actionView;
        this.f1064c = qVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f780k);
            }
            w3 w3Var = new w3();
            w3Var.a = (toolbar.f785p & 112) | 8388611;
            w3Var.f1075b = 2;
            toolbar.f780k.setLayoutParams(w3Var);
            toolbar.addView(toolbar.f780k);
        }
        int childCount = toolbar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = toolbar.getChildAt(childCount);
            if (((w3) childAt.getLayoutParams()).f1075b != 2 && childAt != toolbar.f772b) {
                toolbar.removeViewAt(childCount);
                toolbar.G.add(childAt);
            }
        }
        toolbar.requestLayout();
        qVar.C = true;
        qVar.f20162n.p(false);
        KeyEvent.Callback callback = toolbar.f780k;
        if (callback instanceof j.d) {
            ((j.d) callback).b();
        }
        toolbar.s();
        return true;
    }

    @Override // k.c0
    public final boolean f(k.i0 i0Var) {
        return false;
    }

    @Override // k.c0
    public final boolean h() {
        return false;
    }

    @Override // k.c0
    public final void i(Context context, k.o oVar) {
        k.q qVar;
        k.o oVar2 = this.f1063b;
        if (oVar2 != null && (qVar = this.f1064c) != null) {
            oVar2.d(qVar);
        }
        this.f1063b = oVar;
    }
}
