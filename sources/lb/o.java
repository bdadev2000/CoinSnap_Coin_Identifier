package lb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o {
    public final List a;

    /* renamed from: b, reason: collision with root package name */
    public int f21325b;

    public o(int i10) {
        this.a = new ArrayList();
        this.f21325b = 128;
    }

    public final synchronized List a() {
        return Collections.unmodifiableList(new ArrayList(this.a));
    }

    public final boolean b() {
        return this.f21325b < this.a.size();
    }

    public final synchronized boolean c(List list) {
        this.a.clear();
        if (list.size() > this.f21325b) {
            b6.a.f2288f.i("Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f21325b, null);
            return this.a.addAll(list.subList(0, this.f21325b));
        }
        return this.a.addAll(list);
    }

    public o(ArrayList routes) {
        Intrinsics.checkNotNullParameter(routes, "routes");
        this.a = routes;
    }

    public o() {
        this.a = new ArrayList();
        this.f21325b = 0;
    }
}
