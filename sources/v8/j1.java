package v8;

import com.google.common.collect.z1;

/* loaded from: classes3.dex */
public final class j1 implements s7.i {

    /* renamed from: f, reason: collision with root package name */
    public static final j1 f26179f = new j1(new i1[0]);

    /* renamed from: g, reason: collision with root package name */
    public static final String f26180g = n9.h0.E(0);

    /* renamed from: b, reason: collision with root package name */
    public final int f26181b;

    /* renamed from: c, reason: collision with root package name */
    public final z1 f26182c;

    /* renamed from: d, reason: collision with root package name */
    public int f26183d;

    static {
        new n0.h(0);
    }

    public j1(i1... i1VarArr) {
        this.f26182c = com.google.common.collect.r0.l(i1VarArr);
        this.f26181b = i1VarArr.length;
        int i10 = 0;
        while (true) {
            z1 z1Var = this.f26182c;
            if (i10 < z1Var.f12064f) {
                int i11 = i10 + 1;
                for (int i12 = i11; i12 < z1Var.f12064f; i12++) {
                    if (((i1) z1Var.get(i10)).equals(z1Var.get(i12))) {
                        n9.o.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                }
                i10 = i11;
            } else {
                return;
            }
        }
    }

    public final i1 a(int i10) {
        return (i1) this.f26182c.get(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j1.class != obj.getClass()) {
            return false;
        }
        j1 j1Var = (j1) obj;
        if (this.f26181b == j1Var.f26181b && this.f26182c.equals(j1Var.f26182c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f26183d == 0) {
            this.f26183d = this.f26182c.hashCode();
        }
        return this.f26183d;
    }
}
