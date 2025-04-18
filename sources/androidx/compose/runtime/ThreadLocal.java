package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes3.dex */
public final class ThreadLocal<T> extends java.lang.ThreadLocal<T> {
    @Override // java.lang.ThreadLocal
    public final Object get() {
        return super.get();
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        throw null;
    }

    @Override // java.lang.ThreadLocal
    public final void remove() {
        super.remove();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.ThreadLocal
    public final void set(Object obj) {
        super.set(obj);
    }
}
