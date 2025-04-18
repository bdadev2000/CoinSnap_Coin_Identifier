package androidx.datastore.core;

import b1.a0;
import b1.d0;
import b1.h1;
import com.google.android.gms.common.api.Api;
import d0.b0;
import d1.b;
import d1.g;
import d1.h;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.r;
import p0.a;
import q0.l;
import q0.p;

/* loaded from: classes4.dex */
public final class SimpleActor<T> {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f18970a;

    /* renamed from: b, reason: collision with root package name */
    public final p f18971b;

    /* renamed from: c, reason: collision with root package name */
    public final b f18972c;
    public final AtomicInteger d;

    /* renamed from: androidx.datastore.core.SimpleActor$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f18973a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SimpleActor f18974b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p f18975c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(l lVar, SimpleActor simpleActor) {
            super(1);
            SingleProcessDataStore$actor$2 singleProcessDataStore$actor$2 = SingleProcessDataStore$actor$2.f19000a;
            this.f18973a = lVar;
            this.f18974b = simpleActor;
            this.f18975c = singleProcessDataStore$actor$2;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            b0 b0Var;
            b0 b0Var2;
            Throwable th = (Throwable) obj;
            this.f18973a.invoke(th);
            SimpleActor simpleActor = this.f18974b;
            simpleActor.f18972c.m(false, th);
            do {
                Object d = simpleActor.f18972c.d();
                b0Var = null;
                if (d instanceof h) {
                    d = null;
                }
                b0Var2 = b0.f30125a;
                if (d != null) {
                    this.f18975c.invoke(d, th);
                    b0Var = b0Var2;
                }
            } while (b0Var != null);
            return b0Var2;
        }
    }

    public SimpleActor(d0 d0Var, l lVar, p pVar) {
        a.s(d0Var, "scope");
        this.f18970a = d0Var;
        this.f18971b = pVar;
        this.f18972c = a.a(Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, 6);
        this.d = new AtomicInteger(0);
        h1 h1Var = (h1) d0Var.getCoroutineContext().i(a0.f22285b);
        if (h1Var == null) {
            return;
        }
        h1Var.g0(new AnonymousClass1(lVar, this));
    }

    public final void a(Object obj) {
        Object b2 = this.f18972c.b(obj);
        boolean z2 = b2 instanceof g;
        if (z2) {
            g gVar = z2 ? (g) b2 : null;
            Throwable th = gVar != null ? gVar.f30178a : null;
            if (th != null) {
                throw th;
            }
            throw new IllegalStateException("Channel was closed normally");
        }
        if (!(!(b2 instanceof h))) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (this.d.getAndIncrement() == 0) {
            e.v(this.f18970a, null, 0, new SimpleActor$offer$2(this, null), 3);
        }
    }
}
