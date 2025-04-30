package c7;

/* renamed from: c7.h0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0631h0 {
    public static final U Companion = new U(null);
    private final D app;
    private final j1 device;
    private C0617a0 ext;
    private C0623d0 request;
    private final C0629g0 user;

    public /* synthetic */ C0631h0(int i9, j1 j1Var, D d2, C0629g0 c0629g0, C0617a0 c0617a0, C0623d0 c0623d0, e8.g0 g0Var) {
        if (1 != (i9 & 1)) {
            e8.W.h(i9, 1, M.INSTANCE.getDescriptor());
            throw null;
        }
        this.device = j1Var;
        if ((i9 & 2) == 0) {
            this.app = null;
        } else {
            this.app = d2;
        }
        if ((i9 & 4) == 0) {
            this.user = null;
        } else {
            this.user = c0629g0;
        }
        if ((i9 & 8) == 0) {
            this.ext = null;
        } else {
            this.ext = c0617a0;
        }
        if ((i9 & 16) == 0) {
            this.request = null;
        } else {
            this.request = c0623d0;
        }
    }

    public static /* synthetic */ C0631h0 copy$default(C0631h0 c0631h0, j1 j1Var, D d2, C0629g0 c0629g0, C0617a0 c0617a0, C0623d0 c0623d0, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            j1Var = c0631h0.device;
        }
        if ((i9 & 2) != 0) {
            d2 = c0631h0.app;
        }
        D d9 = d2;
        if ((i9 & 4) != 0) {
            c0629g0 = c0631h0.user;
        }
        C0629g0 c0629g02 = c0629g0;
        if ((i9 & 8) != 0) {
            c0617a0 = c0631h0.ext;
        }
        C0617a0 c0617a02 = c0617a0;
        if ((i9 & 16) != 0) {
            c0623d0 = c0631h0.request;
        }
        return c0631h0.copy(j1Var, d9, c0629g02, c0617a02, c0623d0);
    }

    public static final void write$Self(C0631h0 c0631h0, d8.b bVar, c8.g gVar) {
        G7.j.e(c0631h0, "self");
        G7.j.e(bVar, "output");
        G7.j.e(gVar, "serialDesc");
        bVar.m(gVar, 0, V0.INSTANCE, c0631h0.device);
        if (bVar.o(gVar) || c0631h0.app != null) {
            bVar.u(gVar, 1, B.INSTANCE, c0631h0.app);
        }
        if (bVar.o(gVar) || c0631h0.user != null) {
            bVar.u(gVar, 2, C0625e0.INSTANCE, c0631h0.user);
        }
        if (bVar.o(gVar) || c0631h0.ext != null) {
            bVar.u(gVar, 3, Y.INSTANCE, c0631h0.ext);
        }
        if (bVar.o(gVar) || c0631h0.request != null) {
            bVar.u(gVar, 4, C0619b0.INSTANCE, c0631h0.request);
        }
    }

    public final j1 component1() {
        return this.device;
    }

    public final D component2() {
        return this.app;
    }

    public final C0629g0 component3() {
        return this.user;
    }

    public final C0617a0 component4() {
        return this.ext;
    }

    public final C0623d0 component5() {
        return this.request;
    }

    public final C0631h0 copy(j1 j1Var, D d2, C0629g0 c0629g0, C0617a0 c0617a0, C0623d0 c0623d0) {
        G7.j.e(j1Var, "device");
        return new C0631h0(j1Var, d2, c0629g0, c0617a0, c0623d0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0631h0)) {
            return false;
        }
        C0631h0 c0631h0 = (C0631h0) obj;
        if (G7.j.a(this.device, c0631h0.device) && G7.j.a(this.app, c0631h0.app) && G7.j.a(this.user, c0631h0.user) && G7.j.a(this.ext, c0631h0.ext) && G7.j.a(this.request, c0631h0.request)) {
            return true;
        }
        return false;
    }

    public final D getApp() {
        return this.app;
    }

    public final j1 getDevice() {
        return this.device;
    }

    public final C0617a0 getExt() {
        return this.ext;
    }

    public final C0623d0 getRequest() {
        return this.request;
    }

    public final C0629g0 getUser() {
        return this.user;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.device.hashCode() * 31;
        D d2 = this.app;
        int i9 = 0;
        if (d2 == null) {
            hashCode = 0;
        } else {
            hashCode = d2.hashCode();
        }
        int i10 = (hashCode4 + hashCode) * 31;
        C0629g0 c0629g0 = this.user;
        if (c0629g0 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c0629g0.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        C0617a0 c0617a0 = this.ext;
        if (c0617a0 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c0617a0.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        C0623d0 c0623d0 = this.request;
        if (c0623d0 != null) {
            i9 = c0623d0.hashCode();
        }
        return i12 + i9;
    }

    public final void setExt(C0617a0 c0617a0) {
        this.ext = c0617a0;
    }

    public final void setRequest(C0623d0 c0623d0) {
        this.request = c0623d0;
    }

    public String toString() {
        return "CommonRequestBody(device=" + this.device + ", app=" + this.app + ", user=" + this.user + ", ext=" + this.ext + ", request=" + this.request + ')';
    }

    public C0631h0(j1 j1Var, D d2, C0629g0 c0629g0, C0617a0 c0617a0, C0623d0 c0623d0) {
        G7.j.e(j1Var, "device");
        this.device = j1Var;
        this.app = d2;
        this.user = c0629g0;
        this.ext = c0617a0;
        this.request = c0623d0;
    }

    public /* synthetic */ C0631h0(j1 j1Var, D d2, C0629g0 c0629g0, C0617a0 c0617a0, C0623d0 c0623d0, int i9, G7.f fVar) {
        this(j1Var, (i9 & 2) != 0 ? null : d2, (i9 & 4) != 0 ? null : c0629g0, (i9 & 8) != 0 ? null : c0617a0, (i9 & 16) != 0 ? null : c0623d0);
    }
}
