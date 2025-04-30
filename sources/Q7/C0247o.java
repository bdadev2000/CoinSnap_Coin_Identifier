package Q7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: Q7.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0247o {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(C0247o.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f2575a;

    public C0247o(boolean z8, Throwable th) {
        this.f2575a = th;
        this._handled$volatile = z8 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f2575a + ']';
    }
}
