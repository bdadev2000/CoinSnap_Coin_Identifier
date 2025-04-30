package k3;

import java.io.Closeable;
import l3.C2440e;
import r3.C2666i;
import r3.InterfaceC2661d;
import s7.InterfaceC2701a;

/* loaded from: classes.dex */
public final class k implements Closeable {
    public InterfaceC2701a b;

    /* renamed from: c, reason: collision with root package name */
    public p3.c f21435c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC2701a f21436d;

    /* renamed from: f, reason: collision with root package name */
    public C2440e f21437f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC2701a f21438g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC2701a f21439h;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((C2666i) ((InterfaceC2661d) this.f21438g.get())).close();
    }
}
