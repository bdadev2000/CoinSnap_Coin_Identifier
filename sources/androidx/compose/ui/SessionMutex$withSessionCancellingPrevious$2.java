package androidx.compose.ui;

import androidx.compose.ui.SessionMutex;
import b1.d0;
import b1.h1;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.q;
import org.objectweb.asm.TypeReference;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2", f = "SessionMutex.kt", l = {TypeReference.INSTANCEOF, TypeReference.CONSTRUCTOR_REFERENCE}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SessionMutex$withSessionCancellingPrevious$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f14704a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f14705b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f14706c;
    public final /* synthetic */ AtomicReference d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f14707f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionMutex$withSessionCancellingPrevious$2(AtomicReference atomicReference, g gVar, l lVar, p pVar) {
        super(2, gVar);
        this.f14706c = lVar;
        this.d = atomicReference;
        this.f14707f = pVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        SessionMutex$withSessionCancellingPrevious$2 sessionMutex$withSessionCancellingPrevious$2 = new SessionMutex$withSessionCancellingPrevious$2(this.d, gVar, this.f14706c, this.f14707f);
        sessionMutex$withSessionCancellingPrevious$2.f14705b = obj;
        return sessionMutex$withSessionCancellingPrevious$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((SessionMutex$withSessionCancellingPrevious$2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        SessionMutex.Session session;
        h1 h1Var;
        SessionMutex.Session session2;
        a aVar = a.f30806a;
        int i2 = this.f14704a;
        AtomicReference atomicReference = this.d;
        try {
            if (i2 == 0) {
                q.m(obj);
                d0 d0Var = (d0) this.f14705b;
                session = new SessionMutex.Session(kotlin.jvm.internal.e.m(d0Var.getCoroutineContext()), this.f14706c.invoke(d0Var));
                SessionMutex.Session session3 = (SessionMutex.Session) atomicReference.getAndSet(session);
                if (session3 != null && (h1Var = session3.f14702a) != null) {
                    this.f14705b = session;
                    this.f14704a = 1;
                    if (kotlin.jvm.internal.e.i(h1Var, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    session2 = (SessionMutex.Session) this.f14705b;
                    try {
                        q.m(obj);
                        while (!atomicReference.compareAndSet(session2, null) && atomicReference.get() == session2) {
                        }
                        return obj;
                    } catch (Throwable th) {
                        th = th;
                        while (!atomicReference.compareAndSet(session2, null) && atomicReference.get() == session2) {
                        }
                        throw th;
                    }
                }
                session = (SessionMutex.Session) this.f14705b;
                q.m(obj);
            }
            p pVar = this.f14707f;
            Object obj2 = session.f14703b;
            this.f14705b = session;
            this.f14704a = 2;
            obj = pVar.invoke(obj2, this);
            if (obj == aVar) {
                return aVar;
            }
            session2 = session;
            while (!atomicReference.compareAndSet(session2, null)) {
            }
            return obj;
        } catch (Throwable th2) {
            th = th2;
            session2 = session;
            while (!atomicReference.compareAndSet(session2, null)) {
            }
            throw th;
        }
    }
}
