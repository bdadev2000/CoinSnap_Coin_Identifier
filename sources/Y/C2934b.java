package y;

import java.util.concurrent.CancellationException;

/* renamed from: y.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2934b {

    /* renamed from: c, reason: collision with root package name */
    public static final C2934b f24251c;

    /* renamed from: d, reason: collision with root package name */
    public static final C2934b f24252d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f24253a;
    public final Throwable b;

    static {
        if (h.f24264f) {
            f24252d = null;
            f24251c = null;
        } else {
            f24252d = new C2934b(false, null);
            f24251c = new C2934b(true, null);
        }
    }

    public C2934b(boolean z8, CancellationException cancellationException) {
        this.f24253a = z8;
        this.b = cancellationException;
    }
}
