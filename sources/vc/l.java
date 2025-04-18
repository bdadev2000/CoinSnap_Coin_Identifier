package vc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class l extends zc.b {

    /* renamed from: t, reason: collision with root package name */
    public static final k f26448t = new k();
    public static final com.google.gson.u u = new com.google.gson.u("closed");

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f26449q;

    /* renamed from: r, reason: collision with root package name */
    public String f26450r;

    /* renamed from: s, reason: collision with root package name */
    public com.google.gson.p f26451s;

    public l() {
        super(f26448t);
        this.f26449q = new ArrayList();
        this.f26451s = com.google.gson.r.f12122b;
    }

    @Override // zc.b
    public final void T(double d10) {
        boolean z10 = true;
        if (this.f28740j != 1) {
            z10 = false;
        }
        if (!z10 && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d10);
        }
        b0(new com.google.gson.u(Double.valueOf(d10)));
    }

    @Override // zc.b
    public final void U(long j3) {
        b0(new com.google.gson.u(Long.valueOf(j3)));
    }

    @Override // zc.b
    public final void V(Boolean bool) {
        if (bool == null) {
            b0(com.google.gson.r.f12122b);
        } else {
            b0(new com.google.gson.u(bool));
        }
    }

    @Override // zc.b
    public final void W(Number number) {
        if (number == null) {
            b0(com.google.gson.r.f12122b);
            return;
        }
        boolean z10 = true;
        if (this.f28740j != 1) {
            z10 = false;
        }
        if (!z10) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        b0(new com.google.gson.u(number));
    }

    @Override // zc.b
    public final void X(String str) {
        if (str == null) {
            b0(com.google.gson.r.f12122b);
        } else {
            b0(new com.google.gson.u(str));
        }
    }

    @Override // zc.b
    public final void Y(boolean z10) {
        b0(new com.google.gson.u(Boolean.valueOf(z10)));
    }

    public final com.google.gson.p a0() {
        return (com.google.gson.p) this.f26449q.get(r0.size() - 1);
    }

    public final void b0(com.google.gson.p pVar) {
        if (this.f26450r != null) {
            if (!(pVar instanceof com.google.gson.r) || this.f28743m) {
                com.google.gson.s sVar = (com.google.gson.s) a0();
                sVar.f12125b.put(this.f26450r, pVar);
            }
            this.f26450r = null;
            return;
        }
        if (this.f26449q.isEmpty()) {
            this.f26451s = pVar;
            return;
        }
        com.google.gson.p a02 = a0();
        if (a02 instanceof com.google.gson.o) {
            ((com.google.gson.o) a02).f12121b.add(pVar);
            return;
        }
        throw new IllegalStateException();
    }

    @Override // zc.b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.f26449q;
        if (arrayList.isEmpty()) {
            arrayList.add(u);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // zc.b, java.io.Flushable
    public final void flush() {
    }

    @Override // zc.b
    public final void g() {
        com.google.gson.o oVar = new com.google.gson.o();
        b0(oVar);
        this.f26449q.add(oVar);
    }

    @Override // zc.b
    public final void j() {
        com.google.gson.s sVar = new com.google.gson.s();
        b0(sVar);
        this.f26449q.add(sVar);
    }

    @Override // zc.b
    public final void p() {
        ArrayList arrayList = this.f26449q;
        if (!arrayList.isEmpty() && this.f26450r == null) {
            if (a0() instanceof com.google.gson.o) {
                arrayList.remove(arrayList.size() - 1);
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // zc.b
    public final void q() {
        ArrayList arrayList = this.f26449q;
        if (!arrayList.isEmpty() && this.f26450r == null) {
            if (a0() instanceof com.google.gson.s) {
                arrayList.remove(arrayList.size() - 1);
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // zc.b
    public final void r(String str) {
        Objects.requireNonNull(str, "name == null");
        if (!this.f26449q.isEmpty() && this.f26450r == null) {
            if (a0() instanceof com.google.gson.s) {
                this.f26450r = str;
                return;
            }
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        throw new IllegalStateException("Did not expect a name");
    }

    @Override // zc.b
    public final zc.b t() {
        b0(com.google.gson.r.f12122b);
        return this;
    }
}
