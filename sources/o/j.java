package o;

import T.InterfaceC0277j0;
import q.Y0;

/* loaded from: classes.dex */
public final class j extends android.support.v4.media.session.a {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21919c;

    /* renamed from: d, reason: collision with root package name */
    public int f21920d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f21921e;

    public j(k kVar) {
        this.b = 0;
        this.f21921e = kVar;
        this.f21919c = false;
        this.f21920d = 0;
    }

    @Override // android.support.v4.media.session.a, T.InterfaceC0277j0
    public void a() {
        switch (this.b) {
            case 1:
                this.f21919c = true;
                return;
            default:
                return;
        }
    }

    @Override // android.support.v4.media.session.a, T.InterfaceC0277j0
    public final void b() {
        switch (this.b) {
            case 0:
                if (!this.f21919c) {
                    this.f21919c = true;
                    InterfaceC0277j0 interfaceC0277j0 = ((k) this.f21921e).f21924d;
                    if (interfaceC0277j0 != null) {
                        interfaceC0277j0.b();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((Y0) this.f21921e).f22611a.setVisibility(0);
                return;
        }
    }

    @Override // T.InterfaceC0277j0
    public final void c() {
        switch (this.b) {
            case 0:
                int i9 = this.f21920d + 1;
                this.f21920d = i9;
                k kVar = (k) this.f21921e;
                if (i9 == kVar.f21922a.size()) {
                    InterfaceC0277j0 interfaceC0277j0 = kVar.f21924d;
                    if (interfaceC0277j0 != null) {
                        interfaceC0277j0.c();
                    }
                    this.f21920d = 0;
                    this.f21919c = false;
                    kVar.f21925e = false;
                    return;
                }
                return;
            default:
                if (!this.f21919c) {
                    ((Y0) this.f21921e).f22611a.setVisibility(this.f21920d);
                    return;
                }
                return;
        }
    }

    public j(Y0 y02, int i9) {
        this.b = 1;
        this.f21921e = y02;
        this.f21920d = i9;
        this.f21919c = false;
    }
}
