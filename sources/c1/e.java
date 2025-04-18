package c1;

import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.h;
import b1.o0;
import b1.q0;
import b1.u1;
import b1.x1;
import g1.u;
import h0.l;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class e extends f {

    @Nullable
    private volatile e _immediate;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f22409c;
    public final String d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f22410f;

    /* renamed from: g, reason: collision with root package name */
    public final e f22411g;

    public e(Handler handler, String str, boolean z2) {
        this.f22409c = handler;
        this.d = str;
        this.f22410f = z2;
        this._immediate = z2 ? this : null;
        e eVar = this._immediate;
        if (eVar == null) {
            eVar = new e(handler, str, true);
            this._immediate = eVar;
        }
        this.f22411g = eVar;
    }

    @Override // b1.k0
    public final q0 E(long j2, final Runnable runnable, l lVar) {
        if (j2 > 4611686018427387903L) {
            j2 = 4611686018427387903L;
        }
        if (this.f22409c.postDelayed(runnable, j2)) {
            return new q0() { // from class: c1.c
                @Override // b1.q0
                public final void dispose() {
                    e.this.f22409c.removeCallbacks(runnable);
                }
            };
        }
        l0(lVar, runnable);
        return x1.f22395a;
    }

    @Override // b1.k0
    public final void G(long j2, b1.l lVar) {
        h hVar = new h(lVar, this, 2);
        if (j2 > 4611686018427387903L) {
            j2 = 4611686018427387903L;
        }
        if (this.f22409c.postDelayed(hVar, j2)) {
            lVar.z(new d(0, this, hVar));
        } else {
            l0(lVar.f22340f, hVar);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && ((e) obj).f22409c == this.f22409c;
    }

    @Override // b1.z
    public final void h0(l lVar, Runnable runnable) {
        if (this.f22409c.post(runnable)) {
            return;
        }
        l0(lVar, runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.f22409c);
    }

    @Override // b1.z
    public final boolean j0(l lVar) {
        return (this.f22410f && p0.a.g(Looper.myLooper(), this.f22409c.getLooper())) ? false : true;
    }

    public final void l0(l lVar, Runnable runnable) {
        kotlin.jvm.internal.e.h(lVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        o0.f22356b.h0(lVar, runnable);
    }

    @Override // b1.z
    public final String toString() {
        e eVar;
        String str;
        h1.d dVar = o0.f22355a;
        u1 u1Var = u.f30639a;
        if (this == u1Var) {
            str = "Dispatchers.Main";
        } else {
            try {
                eVar = ((e) u1Var).f22411g;
            } catch (UnsupportedOperationException unused) {
                eVar = null;
            }
            str = this == eVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.d;
        if (str2 == null) {
            str2 = this.f22409c.toString();
        }
        return this.f22410f ? androidx.compose.foundation.text.input.a.j(str2, ".immediate") : str2;
    }

    public e(Handler handler) {
        this(handler, null, false);
    }
}
