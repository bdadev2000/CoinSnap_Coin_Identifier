package ni;

import java.util.Objects;

/* loaded from: classes5.dex */
public final class h0 extends va.b {

    /* renamed from: i, reason: collision with root package name */
    public final String f22804i;

    /* renamed from: j, reason: collision with root package name */
    public final l f22805j;

    public h0(String str) {
        a aVar = a.f22775b;
        Objects.requireNonNull(str, "name == null");
        this.f22804i = str;
        this.f22805j = aVar;
    }

    @Override // va.b
    public final void e(p0 p0Var, Object obj) {
        String str;
        if (obj == null || (str = (String) this.f22805j.convert(obj)) == null) {
            return;
        }
        p0Var.b(this.f22804i, str);
    }
}
