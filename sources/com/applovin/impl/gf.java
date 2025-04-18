package com.applovin.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class gf extends e2 implements Handler.Callback {

    /* renamed from: n, reason: collision with root package name */
    private final df f24097n;

    /* renamed from: o, reason: collision with root package name */
    private final ff f24098o;

    /* renamed from: p, reason: collision with root package name */
    private final Handler f24099p;

    /* renamed from: q, reason: collision with root package name */
    private final ef f24100q;

    /* renamed from: r, reason: collision with root package name */
    private cf f24101r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f24102s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f24103t;

    /* renamed from: u, reason: collision with root package name */
    private long f24104u;

    /* renamed from: v, reason: collision with root package name */
    private long f24105v;
    private bf w;

    public gf(ff ffVar, Looper looper) {
        this(ffVar, looper, df.f23482a);
    }

    private void b(bf bfVar) {
        this.f24098o.a(bfVar);
    }

    private void z() {
        if (this.f24102s || this.w != null) {
            return;
        }
        this.f24100q.b();
        g9 r2 = r();
        int a2 = a(r2, this.f24100q, 0);
        if (a2 != -4) {
            if (a2 == -5) {
                this.f24104u = ((f9) b1.a(r2.f24058b)).f23844q;
                return;
            }
            return;
        }
        if (this.f24100q.e()) {
            this.f24102s = true;
            return;
        }
        ef efVar = this.f24100q;
        efVar.f23684j = this.f24104u;
        efVar.g();
        bf a3 = ((cf) xp.a(this.f24101r)).a(this.f24100q);
        if (a3 != null) {
            ArrayList arrayList = new ArrayList(a3.c());
            a(a3, arrayList);
            if (arrayList.isEmpty()) {
                return;
            }
            this.w = new bf(arrayList);
            this.f24105v = this.f24100q.f25964f;
        }
    }

    @Override // com.applovin.impl.e2
    public void a(long j2, boolean z2) {
        this.w = null;
        this.f24105v = -9223372036854775807L;
        this.f24102s = false;
        this.f24103t = false;
    }

    @Override // com.applovin.impl.qi
    public boolean c() {
        return this.f24103t;
    }

    @Override // com.applovin.impl.qi
    public boolean d() {
        return true;
    }

    @Override // com.applovin.impl.qi, com.applovin.impl.ri
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        b((bf) message.obj);
        return true;
    }

    @Override // com.applovin.impl.e2
    public void v() {
        this.w = null;
        this.f24105v = -9223372036854775807L;
        this.f24101r = null;
    }

    public gf(ff ffVar, Looper looper, df dfVar) {
        super(5);
        this.f24098o = (ff) b1.a(ffVar);
        this.f24099p = looper == null ? null : xp.a(looper, (Handler.Callback) this);
        this.f24097n = (df) b1.a(dfVar);
        this.f24100q = new ef();
        this.f24105v = -9223372036854775807L;
    }

    private void a(bf bfVar, List list) {
        for (int i2 = 0; i2 < bfVar.c(); i2++) {
            f9 b2 = bfVar.a(i2).b();
            if (b2 != null && this.f24097n.a(b2)) {
                cf b3 = this.f24097n.b(b2);
                byte[] bArr = (byte[]) b1.a(bfVar.a(i2).a());
                this.f24100q.b();
                this.f24100q.g(bArr.length);
                ((ByteBuffer) xp.a(this.f24100q.f25963c)).put(bArr);
                this.f24100q.g();
                bf a2 = b3.a(this.f24100q);
                if (a2 != null) {
                    a(a2, list);
                }
            } else {
                list.add(bfVar.a(i2));
            }
        }
    }

    private boolean c(long j2) {
        boolean z2;
        bf bfVar = this.w;
        if (bfVar == null || this.f24105v > j2) {
            z2 = false;
        } else {
            a(bfVar);
            this.w = null;
            this.f24105v = -9223372036854775807L;
            z2 = true;
        }
        if (this.f24102s && this.w == null) {
            this.f24103t = true;
        }
        return z2;
    }

    private void a(bf bfVar) {
        Handler handler = this.f24099p;
        if (handler != null) {
            handler.obtainMessage(0, bfVar).sendToTarget();
        } else {
            b(bfVar);
        }
    }

    @Override // com.applovin.impl.e2
    public void a(f9[] f9VarArr, long j2, long j3) {
        this.f24101r = this.f24097n.b(f9VarArr[0]);
    }

    @Override // com.applovin.impl.qi
    public void a(long j2, long j3) {
        boolean z2 = true;
        while (z2) {
            z();
            z2 = c(j2);
        }
    }

    @Override // com.applovin.impl.ri
    public int a(f9 f9Var) {
        if (this.f24097n.a(f9Var)) {
            return ri.a(f9Var.F == 0 ? 4 : 2);
        }
        return ri.a(0);
    }
}
