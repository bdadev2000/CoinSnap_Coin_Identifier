package u4;

import java.util.Objects;

/* renamed from: u4.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2764i {

    /* renamed from: a, reason: collision with root package name */
    public final J1.B f23123a;
    public final C2763h b;

    public C2764i(J1.B b, z4.c cVar) {
        this.f23123a = b;
        this.b = new C2763h(cVar);
    }

    public final void a(String str) {
        C2763h c2763h = this.b;
        synchronized (c2763h) {
            if (!Objects.equals(c2763h.b, str)) {
                C2763h.a((z4.c) c2763h.f23121c, str, (String) c2763h.f23122d);
                c2763h.b = str;
            }
        }
    }
}
