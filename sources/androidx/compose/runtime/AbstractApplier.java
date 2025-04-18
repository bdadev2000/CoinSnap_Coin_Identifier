package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;

@StabilityInferred
/* loaded from: classes3.dex */
public abstract class AbstractApplier<T> implements Applier<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f13669a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f13670b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public Object f13671c;

    public AbstractApplier(Object obj) {
        this.f13669a = obj;
        this.f13671c = obj;
    }

    @Override // androidx.compose.runtime.Applier
    public final void clear() {
        this.f13670b.clear();
        this.f13671c = this.f13669a;
        i();
    }

    @Override // androidx.compose.runtime.Applier
    public final Object e() {
        return this.f13671c;
    }

    @Override // androidx.compose.runtime.Applier
    public final void g(Object obj) {
        this.f13670b.add(this.f13671c);
        this.f13671c = obj;
    }

    @Override // androidx.compose.runtime.Applier
    public final void h() {
        ArrayList arrayList = this.f13670b;
        if (!arrayList.isEmpty()) {
            this.f13671c = arrayList.remove(arrayList.size() - 1);
        } else {
            PreconditionsKt.b("empty stack");
            throw null;
        }
    }

    public abstract void i();
}
