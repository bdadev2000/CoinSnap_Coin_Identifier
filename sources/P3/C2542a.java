package p3;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import k3.s;
import l3.C2441f;
import r3.InterfaceC2661d;
import s3.InterfaceC2698c;

/* renamed from: p3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2542a implements b {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f22207f = Logger.getLogger(s.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final q3.c f22208a;
    public final Executor b;

    /* renamed from: c, reason: collision with root package name */
    public final C2441f f22209c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2661d f22210d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2698c f22211e;

    public C2542a(Executor executor, C2441f c2441f, q3.c cVar, InterfaceC2661d interfaceC2661d, InterfaceC2698c interfaceC2698c) {
        this.b = executor;
        this.f22209c = c2441f;
        this.f22208a = cVar;
        this.f22210d = interfaceC2661d;
        this.f22211e = interfaceC2698c;
    }
}
