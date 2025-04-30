package s;

import java.util.HashMap;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2684a extends C2689f {

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f22951g = new HashMap();

    @Override // s.C2689f
    public final C2686c b(Object obj) {
        return (C2686c) this.f22951g.get(obj);
    }

    @Override // s.C2689f
    public final Object c(Object obj) {
        Object c9 = super.c(obj);
        this.f22951g.remove(obj);
        return c9;
    }

    public final Object d(Object obj, Object obj2) {
        C2686c b = b(obj);
        if (b != null) {
            return b.f22954c;
        }
        HashMap hashMap = this.f22951g;
        C2686c c2686c = new C2686c(obj, obj2);
        this.f22961f++;
        C2686c c2686c2 = this.f22959c;
        if (c2686c2 == null) {
            this.b = c2686c;
            this.f22959c = c2686c;
        } else {
            c2686c2.f22955d = c2686c;
            c2686c.f22956f = c2686c2;
            this.f22959c = c2686c;
        }
        hashMap.put(obj, c2686c);
        return null;
    }
}
