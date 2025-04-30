package f1;

import java.util.concurrent.CancellationException;

/* renamed from: f1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2252a {

    /* renamed from: c, reason: collision with root package name */
    public static final C2252a f20246c;

    /* renamed from: d, reason: collision with root package name */
    public static final C2252a f20247d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20248a;
    public final Throwable b;

    static {
        if (AbstractC2260i.f20260f) {
            f20247d = null;
            f20246c = null;
        } else {
            f20247d = new C2252a(false, null);
            f20246c = new C2252a(true, null);
        }
    }

    public C2252a(boolean z8, CancellationException cancellationException) {
        this.f20248a = z8;
        this.b = cancellationException;
    }
}
