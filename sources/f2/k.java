package f2;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k implements r {
    public final /* synthetic */ View a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f17604b;

    public k(View view, ArrayList arrayList) {
        this.a = view;
        this.f17604b = arrayList;
    }

    @Override // f2.r
    public final void a() {
    }

    @Override // f2.r
    public final void c(t tVar) {
    }

    @Override // f2.r
    public final void d() {
    }

    @Override // f2.r
    public final void e(t tVar) {
        tVar.z(this);
        tVar.a(this);
    }

    @Override // f2.r
    public final void f(t tVar) {
        tVar.z(this);
        this.a.setVisibility(8);
        ArrayList arrayList = this.f17604b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((View) arrayList.get(i10)).setVisibility(0);
        }
    }
}
