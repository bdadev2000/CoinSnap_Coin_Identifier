package l3;

import android.content.Context;
import s7.InterfaceC2701a;

/* renamed from: l3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2442g implements InterfaceC2701a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2701a f21565a;
    public final InterfaceC2701a b;

    public C2442g(p3.c cVar, C2440e c2440e) {
        this.f21565a = cVar;
        this.b = c2440e;
    }

    @Override // s7.InterfaceC2701a
    public final Object get() {
        return new C2441f((Context) this.f21565a.get(), (C2439d) this.b.get());
    }
}
