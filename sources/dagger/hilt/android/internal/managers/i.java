package dagger.hilt.android.internal.managers;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n;
import androidx.lifecycle.t;
import androidx.lifecycle.v;

/* loaded from: classes4.dex */
public final class i extends ContextWrapper {
    public LayoutInflater a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f16938b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, Fragment fragment) {
        super(context);
        context.getClass();
        t tVar = new t() { // from class: dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1
            @Override // androidx.lifecycle.t
            public final void a(v vVar, n nVar) {
                if (nVar == n.ON_DESTROY) {
                    i iVar = i.this;
                    iVar.getClass();
                    iVar.a = null;
                    iVar.f16938b = null;
                }
            }
        };
        this.a = null;
        fragment.getClass();
        fragment.getLifecycle().a(tVar);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f16938b == null) {
            if (this.a == null) {
                this.a = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            }
            this.f16938b = this.a.cloneInContext(this);
        }
        return this.f16938b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i(android.view.LayoutInflater r2, androidx.fragment.app.Fragment r3) {
        /*
            r1 = this;
            r2.getClass()
            android.content.Context r0 = r2.getContext()
            r0.getClass()
            r1.<init>(r0)
            dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1 r0 = new dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1
            r0.<init>()
            r1.a = r2
            r3.getClass()
            androidx.lifecycle.p r2 = r3.getLifecycle()
            r2.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dagger.hilt.android.internal.managers.i.<init>(android.view.LayoutInflater, androidx.fragment.app.Fragment):void");
    }
}
