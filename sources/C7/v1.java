package c7;

/* loaded from: classes3.dex */
public final class v1 {
    public static final u1 Companion = new u1(null);
    private final j1 device;
    private final C0617a0 ext;
    private final int ordinalView;
    private final s1 request;
    private final C0629g0 user;

    public /* synthetic */ v1(int i9, j1 j1Var, C0629g0 c0629g0, C0617a0 c0617a0, s1 s1Var, int i10, e8.g0 g0Var) {
        if (17 != (i9 & 17)) {
            e8.W.h(i9, 17, t1.INSTANCE.getDescriptor());
            throw null;
        }
        this.device = j1Var;
        if ((i9 & 2) == 0) {
            this.user = null;
        } else {
            this.user = c0629g0;
        }
        if ((i9 & 4) == 0) {
            this.ext = null;
        } else {
            this.ext = c0617a0;
        }
        if ((i9 & 8) == 0) {
            this.request = null;
        } else {
            this.request = s1Var;
        }
        this.ordinalView = i10;
    }

    public static /* synthetic */ v1 copy$default(v1 v1Var, j1 j1Var, C0629g0 c0629g0, C0617a0 c0617a0, s1 s1Var, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j1Var = v1Var.device;
        }
        if ((i10 & 2) != 0) {
            c0629g0 = v1Var.user;
        }
        C0629g0 c0629g02 = c0629g0;
        if ((i10 & 4) != 0) {
            c0617a0 = v1Var.ext;
        }
        C0617a0 c0617a02 = c0617a0;
        if ((i10 & 8) != 0) {
            s1Var = v1Var.request;
        }
        s1 s1Var2 = s1Var;
        if ((i10 & 16) != 0) {
            i9 = v1Var.ordinalView;
        }
        return v1Var.copy(j1Var, c0629g02, c0617a02, s1Var2, i9);
    }

    public static final void write$Self(v1 v1Var, d8.b bVar, c8.g gVar) {
        G7.j.e(v1Var, "self");
        G7.j.e(bVar, "output");
        G7.j.e(gVar, "serialDesc");
        bVar.m(gVar, 0, V0.INSTANCE, v1Var.device);
        if (bVar.o(gVar) || v1Var.user != null) {
            bVar.u(gVar, 1, C0625e0.INSTANCE, v1Var.user);
        }
        if (bVar.o(gVar) || v1Var.ext != null) {
            bVar.u(gVar, 2, Y.INSTANCE, v1Var.ext);
        }
        if (bVar.o(gVar) || v1Var.request != null) {
            bVar.u(gVar, 3, q1.INSTANCE, v1Var.request);
        }
        bVar.C(4, v1Var.ordinalView, gVar);
    }

    public final j1 component1() {
        return this.device;
    }

    public final C0629g0 component2() {
        return this.user;
    }

    public final C0617a0 component3() {
        return this.ext;
    }

    public final s1 component4() {
        return this.request;
    }

    public final int component5() {
        return this.ordinalView;
    }

    public final v1 copy(j1 j1Var, C0629g0 c0629g0, C0617a0 c0617a0, s1 s1Var, int i9) {
        G7.j.e(j1Var, "device");
        return new v1(j1Var, c0629g0, c0617a0, s1Var, i9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        if (G7.j.a(this.device, v1Var.device) && G7.j.a(this.user, v1Var.user) && G7.j.a(this.ext, v1Var.ext) && G7.j.a(this.request, v1Var.request) && this.ordinalView == v1Var.ordinalView) {
            return true;
        }
        return false;
    }

    public final j1 getDevice() {
        return this.device;
    }

    public final C0617a0 getExt() {
        return this.ext;
    }

    public final int getOrdinalView() {
        return this.ordinalView;
    }

    public final s1 getRequest() {
        return this.request;
    }

    public final C0629g0 getUser() {
        return this.user;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.device.hashCode() * 31;
        C0629g0 c0629g0 = this.user;
        int i9 = 0;
        if (c0629g0 == null) {
            hashCode = 0;
        } else {
            hashCode = c0629g0.hashCode();
        }
        int i10 = (hashCode3 + hashCode) * 31;
        C0617a0 c0617a0 = this.ext;
        if (c0617a0 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c0617a0.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        s1 s1Var = this.request;
        if (s1Var != null) {
            i9 = s1Var.hashCode();
        }
        return Integer.hashCode(this.ordinalView) + ((i11 + i9) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RtbToken(device=");
        sb.append(this.device);
        sb.append(", user=");
        sb.append(this.user);
        sb.append(", ext=");
        sb.append(this.ext);
        sb.append(", request=");
        sb.append(this.request);
        sb.append(", ordinalView=");
        return com.mbridge.msdk.foundation.entity.o.l(sb, this.ordinalView, ')');
    }

    public v1(j1 j1Var, C0629g0 c0629g0, C0617a0 c0617a0, s1 s1Var, int i9) {
        G7.j.e(j1Var, "device");
        this.device = j1Var;
        this.user = c0629g0;
        this.ext = c0617a0;
        this.request = s1Var;
        this.ordinalView = i9;
    }

    public /* synthetic */ v1(j1 j1Var, C0629g0 c0629g0, C0617a0 c0617a0, s1 s1Var, int i9, int i10, G7.f fVar) {
        this(j1Var, (i10 & 2) != 0 ? null : c0629g0, (i10 & 4) != 0 ? null : c0617a0, (i10 & 8) != 0 ? null : s1Var, i9);
    }

    public static /* synthetic */ void getOrdinalView$annotations() {
    }
}
