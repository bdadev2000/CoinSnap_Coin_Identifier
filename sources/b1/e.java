package b1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f22297b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount");

    /* renamed from: a, reason: collision with root package name */
    public final i0[] f22298a;
    private volatile int notCompletedCount;

    public e(i0[] i0VarArr) {
        this.f22298a = i0VarArr;
        this.notCompletedCount = i0VarArr.length;
    }
}
