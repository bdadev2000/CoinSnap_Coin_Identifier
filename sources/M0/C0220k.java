package M0;

import android.view.View;
import java.util.ArrayList;

/* renamed from: M0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0220k implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f1886a;
    public final /* synthetic */ ArrayList b;

    public C0220k(View view, ArrayList arrayList) {
        this.f1886a = view;
        this.b = arrayList;
    }

    @Override // M0.u
    public final void c(w wVar) {
        wVar.A(this);
        this.f1886a.setVisibility(8);
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((View) arrayList.get(i9)).setVisibility(0);
        }
    }

    @Override // M0.u
    public final void d(w wVar) {
        wVar.A(this);
        wVar.a(this);
    }

    @Override // M0.u
    public final void b() {
    }

    @Override // M0.u
    public final void e() {
    }

    @Override // M0.u
    public final void f(w wVar) {
    }
}
