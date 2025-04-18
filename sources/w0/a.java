package w0;

import java.util.Iterator;
import kotlin.jvm.internal.q;

/* loaded from: classes2.dex */
public abstract class a implements Iterable, r0.a {

    /* renamed from: a, reason: collision with root package name */
    public final char f31398a;

    /* renamed from: b, reason: collision with root package name */
    public final char f31399b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31400c = 1;

    public a(char c2, char c3) {
        this.f31398a = c2;
        this.f31399b = (char) q.f(c2, c3, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f31398a, this.f31399b, this.f31400c);
    }
}
