package androidx.lifecycle;

import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l0 implements v {

    /* renamed from: k, reason: collision with root package name */
    public static final l0 f1793k = new l0();

    /* renamed from: b, reason: collision with root package name */
    public int f1794b;

    /* renamed from: c, reason: collision with root package name */
    public int f1795c;

    /* renamed from: g, reason: collision with root package name */
    public Handler f1798g;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1796d = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1797f = true;

    /* renamed from: h, reason: collision with root package name */
    public final x f1799h = new x(this);

    /* renamed from: i, reason: collision with root package name */
    public final androidx.activity.d f1800i = new androidx.activity.d(this, 8);

    /* renamed from: j, reason: collision with root package name */
    public final k0 f1801j = new k0(this);

    public final void a() {
        int i10 = this.f1795c + 1;
        this.f1795c = i10;
        if (i10 == 1) {
            if (this.f1796d) {
                this.f1799h.e(n.ON_RESUME);
                this.f1796d = false;
            } else {
                Handler handler = this.f1798g;
                Intrinsics.checkNotNull(handler);
                handler.removeCallbacks(this.f1800i);
            }
        }
    }

    @Override // androidx.lifecycle.v
    public final p getLifecycle() {
        return this.f1799h;
    }
}
