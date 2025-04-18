package mf;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.j0;
import androidx.recyclerview.widget.o1;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class f extends j0 {

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f22239i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public Context f22240j;

    public abstract int a();

    public void b(androidx.databinding.e binding, Object obj, int i10) {
        Intrinsics.checkNotNullParameter(binding, "binding");
    }

    public abstract void c(androidx.databinding.e eVar, Object obj, int i10);

    @Override // androidx.recyclerview.widget.j0
    public int getItemCount() {
        ArrayList arrayList = this.f22239i;
        if (!arrayList.isEmpty()) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.j0
    public final void onBindViewHolder(o1 o1Var, int i10) {
        e holder = (e) o1Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.f22239i.get(i10);
        f fVar = holder.f22238c;
        fVar.getClass();
        androidx.databinding.e binding = holder.f22237b;
        Intrinsics.checkNotNullParameter(binding, "binding");
        fVar.b(binding, obj, holder.getLayoutPosition());
        fVar.c(binding, obj, holder.getLayoutPosition());
    }

    @Override // androidx.recyclerview.widget.j0
    public final o1 onCreateViewHolder(ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f22240j = parent.getContext();
        androidx.databinding.e c10 = androidx.databinding.b.c(LayoutInflater.from(parent.getContext()), a(), parent);
        Intrinsics.checkNotNullExpressionValue(c10, "inflate(...)");
        return new e(this, c10);
    }
}
