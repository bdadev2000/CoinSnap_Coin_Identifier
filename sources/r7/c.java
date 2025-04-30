package R7;

import G7.j;
import Q7.AbstractC0251t;
import Q7.AbstractC0255x;
import Q7.C;
import Q7.F;
import V7.o;
import X7.e;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import w7.k;

/* loaded from: classes3.dex */
public final class c extends AbstractC0251t implements C {

    /* renamed from: d, reason: collision with root package name */
    public final Handler f2763d;

    /* renamed from: f, reason: collision with root package name */
    public final String f2764f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2765g;

    /* renamed from: h, reason: collision with root package name */
    public final c f2766h;

    public c(Handler handler, String str, boolean z8) {
        this.f2763d = handler;
        this.f2764f = str;
        this.f2765g = z8;
        this.f2766h = z8 ? this : new c(handler, str, true);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.f2763d == this.f2763d && cVar.f2765g == this.f2765g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int identityHashCode = System.identityHashCode(this.f2763d);
        if (this.f2765g) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        return identityHashCode ^ i9;
    }

    @Override // Q7.AbstractC0251t
    public final void j(k kVar, Runnable runnable) {
        if (!this.f2763d.post(runnable)) {
            AbstractC0255x.c(kVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
            F.b.j(kVar, runnable);
        }
    }

    @Override // Q7.AbstractC0251t
    public final boolean k() {
        if (this.f2765g && j.a(Looper.myLooper(), this.f2763d.getLooper())) {
            return false;
        }
        return true;
    }

    @Override // Q7.AbstractC0251t
    public final String toString() {
        c cVar;
        String str;
        e eVar = F.f2529a;
        c cVar2 = o.f3533a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f2766h;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            if (this == cVar) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            String str2 = this.f2764f;
            if (str2 == null) {
                str2 = this.f2763d.toString();
            }
            if (this.f2765g) {
                return com.mbridge.msdk.foundation.entity.o.j(str2, ".immediate");
            }
            return str2;
        }
        return str;
    }

    public c(Handler handler) {
        this(handler, null, false);
    }
}
