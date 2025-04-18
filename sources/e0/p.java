package e0;

import java.io.BufferedReader;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class p implements y0.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30215a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f30216b;

    public /* synthetic */ p(Object obj, int i2) {
        this.f30215a = i2;
        this.f30216b = obj;
    }

    @Override // y0.j
    public final Iterator iterator() {
        int i2 = this.f30215a;
        Object obj = this.f30216b;
        switch (i2) {
            case 0:
                return kotlin.jvm.internal.e.t((Object[]) obj);
            case 1:
                return ((Iterable) obj).iterator();
            case 2:
                return new o0.j(this);
            case 3:
                return kotlin.jvm.internal.e.u((q0.p) obj);
            case 4:
                return (Iterator) obj;
            default:
                CharSequence charSequence = (CharSequence) obj;
                p0.a.s(charSequence, "<this>");
                return new z0.k(charSequence);
        }
    }

    public p(BufferedReader bufferedReader) {
        this.f30215a = 2;
        this.f30216b = bufferedReader;
    }
}
