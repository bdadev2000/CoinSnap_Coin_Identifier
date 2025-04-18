package j4;

import android.text.TextUtils;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class a {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public int f19745b;

    /* renamed from: c, reason: collision with root package name */
    public int f19746c;

    /* renamed from: d, reason: collision with root package name */
    public final g4.a f19747d = new g4.a();

    /* renamed from: e, reason: collision with root package name */
    public String f19748e;

    public a(boolean z10) {
        this.a = z10;
    }

    public final e a() {
        if (!TextUtils.isEmpty(this.f19748e)) {
            return new e(new ThreadPoolExecutor(this.f19745b, this.f19746c, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new c(this.f19747d, this.f19748e, this.a)));
        }
        throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f19748e);
    }
}
