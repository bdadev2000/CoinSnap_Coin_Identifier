package t0;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x0.n;

/* loaded from: classes.dex */
public abstract class a implements c {
    private Object value;

    public a(Object obj) {
        this.value = obj;
    }

    public abstract void afterChange(n nVar, Object obj, Object obj2);

    public boolean beforeChange(@NotNull n nVar, Object obj, Object obj2) {
        p0.a.s(nVar, "property");
        return true;
    }

    @Override // t0.b
    public Object getValue(@Nullable Object obj, @NotNull n nVar) {
        p0.a.s(nVar, "property");
        return this.value;
    }

    @Override // t0.c
    public void setValue(@Nullable Object obj, @NotNull n nVar, Object obj2) {
        p0.a.s(nVar, "property");
        Object obj3 = this.value;
        if (beforeChange(nVar, obj3, obj2)) {
            this.value = obj2;
            afterChange(nVar, obj3, obj2);
        }
    }

    @NotNull
    public String toString() {
        return "ObservableProperty(value=" + this.value + ')';
    }
}
