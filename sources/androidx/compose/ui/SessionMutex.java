package androidx.compose.ui;

import androidx.annotation.RestrictTo;
import b1.h1;
import j0.c;
import java.util.concurrent.atomic.AtomicReference;
import p0.a;
import q0.l;
import q0.p;

@RestrictTo
@InternalComposeUiApi
/* loaded from: classes4.dex */
public final class SessionMutex<T> {

    /* loaded from: classes4.dex */
    public static final class Session<T> {

        /* renamed from: a, reason: collision with root package name */
        public final h1 f14702a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f14703b;

        public Session(h1 h1Var, Object obj) {
            this.f14702a = h1Var;
            this.f14703b = obj;
        }
    }

    public static final Object a(AtomicReference atomicReference) {
        Session session = (Session) atomicReference.get();
        if (session != null) {
            return session.f14703b;
        }
        return null;
    }

    public static final Object b(AtomicReference atomicReference, c cVar, l lVar, p pVar) {
        return a.J(new SessionMutex$withSessionCancellingPrevious$2(atomicReference, null, lVar, pVar), cVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SessionMutex)) {
            return false;
        }
        ((SessionMutex) obj).getClass();
        return a.g(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "SessionMutex(currentSessionHolder=null)";
    }
}
