package androidx.activity.compose;

import b1.a2;
import b1.d0;
import d1.b;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.e;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class OnBackInstance {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f228a;

    /* renamed from: b, reason: collision with root package name */
    public final b f229b = p0.a.a(-2, 1, 4);

    /* renamed from: c, reason: collision with root package name */
    public final a2 f230c;

    public OnBackInstance(d0 d0Var, boolean z2, p pVar) {
        this.f228a = z2;
        this.f230c = e.v(d0Var, null, 0, new OnBackInstance$job$1(pVar, this, null), 3);
    }

    public final void a() {
        this.f229b.a(new CancellationException("onBack cancelled"));
        this.f230c.a(null);
    }
}
