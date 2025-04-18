package u0;

import java.util.Random;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: c, reason: collision with root package name */
    public final b f31368c = new ThreadLocal();

    @Override // u0.a
    public final Random e() {
        Object obj = this.f31368c.get();
        p0.a.r(obj, "get(...)");
        return (Random) obj;
    }
}
