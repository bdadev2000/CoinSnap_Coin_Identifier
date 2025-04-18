package ni;

import java.util.Objects;

/* loaded from: classes5.dex */
public final class f0 extends va.b {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f22793i;

    /* renamed from: j, reason: collision with root package name */
    public final String f22794j;

    /* renamed from: k, reason: collision with root package name */
    public final l f22795k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f22796l;

    public f0(String str, boolean z10, int i10) {
        a aVar = a.f22775b;
        this.f22793i = i10;
        if (i10 != 1) {
            Objects.requireNonNull(str, "name == null");
            this.f22794j = str;
            this.f22795k = aVar;
            this.f22796l = z10;
            return;
        }
        Objects.requireNonNull(str, "name == null");
        this.f22794j = str;
        this.f22795k = aVar;
        this.f22796l = z10;
    }

    @Override // va.b
    public final void e(p0 p0Var, Object obj) {
        String str;
        String str2;
        int i10 = this.f22793i;
        boolean z10 = this.f22796l;
        String str3 = this.f22794j;
        l lVar = this.f22795k;
        switch (i10) {
            case 0:
                if (obj != null && (str2 = (String) lVar.convert(obj)) != null) {
                    p0Var.a(str3, str2, z10);
                    return;
                }
                return;
            default:
                if (obj != null && (str = (String) lVar.convert(obj)) != null) {
                    p0Var.c(str3, str, z10);
                    return;
                }
                return;
        }
    }
}
