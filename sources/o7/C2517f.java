package o7;

import T1.C0299e;
import k.C2426o;
import q7.InterfaceC2649b;
import s6.h;

/* renamed from: o7.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2517f implements InterfaceC2649b {
    public volatile s6.f b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f22007c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final C2426o f22008d;

    public C2517f(C2426o c2426o) {
        this.f22008d = c2426o;
    }

    @Override // q7.InterfaceC2649b
    public final Object a() {
        if (this.b == null) {
            synchronized (this.f22007c) {
                try {
                    if (this.b == null) {
                        this.b = new s6.f(new C0299e((h) this.f22008d.f21320c, 3));
                    }
                } finally {
                }
            }
        }
        return this.b;
    }
}
