package x6;

import G7.j;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.J;
import androidx.recyclerview.widget.p0;
import d0.AbstractC2155b;
import d0.AbstractC2158e;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class f extends J {

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f24240i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public Context f24241j;

    public abstract int a();

    public void b(AbstractC2158e abstractC2158e, Object obj, int i9) {
        j.e(abstractC2158e, "binding");
    }

    public abstract void c(AbstractC2158e abstractC2158e, Object obj, int i9);

    @Override // androidx.recyclerview.widget.J
    public int getItemCount() {
        ArrayList arrayList = this.f24240i;
        if (!arrayList.isEmpty()) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.J
    public final void onBindViewHolder(p0 p0Var, int i9) {
        e eVar = (e) p0Var;
        j.e(eVar, "holder");
        Object obj = this.f24240i.get(i9);
        f fVar = eVar.f24239c;
        fVar.getClass();
        AbstractC2158e abstractC2158e = eVar.b;
        j.e(abstractC2158e, "binding");
        fVar.b(abstractC2158e, obj, eVar.getLayoutPosition());
        fVar.c(abstractC2158e, obj, eVar.getLayoutPosition());
    }

    @Override // androidx.recyclerview.widget.J
    public final p0 onCreateViewHolder(ViewGroup viewGroup, int i9) {
        j.e(viewGroup, "parent");
        this.f24241j = viewGroup.getContext();
        AbstractC2158e b = AbstractC2155b.b(a(), LayoutInflater.from(viewGroup.getContext()), viewGroup);
        j.d(b, "inflate(...)");
        return new e(this, b);
    }
}
