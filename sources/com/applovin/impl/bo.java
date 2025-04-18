package com.applovin.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class bo extends e2 implements Handler.Callback {
    private int A;
    private long B;

    /* renamed from: n, reason: collision with root package name */
    private final Handler f23142n;

    /* renamed from: o, reason: collision with root package name */
    private final ao f23143o;

    /* renamed from: p, reason: collision with root package name */
    private final ql f23144p;

    /* renamed from: q, reason: collision with root package name */
    private final g9 f23145q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f23146r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f23147s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f23148t;

    /* renamed from: u, reason: collision with root package name */
    private int f23149u;

    /* renamed from: v, reason: collision with root package name */
    private f9 f23150v;
    private ol w;
    private rl x;

    /* renamed from: y, reason: collision with root package name */
    private sl f23151y;

    /* renamed from: z, reason: collision with root package name */
    private sl f23152z;

    public bo(ao aoVar, Looper looper) {
        this(aoVar, looper, ql.f26192a);
    }

    private long A() {
        if (this.A == -1) {
            return Long.MAX_VALUE;
        }
        b1.a(this.f23151y);
        if (this.A >= this.f23151y.a()) {
            return Long.MAX_VALUE;
        }
        return this.f23151y.a(this.A);
    }

    private void B() {
        this.f23148t = true;
        this.w = this.f23144p.b((f9) b1.a(this.f23150v));
    }

    private void C() {
        this.x = null;
        this.A = -1;
        sl slVar = this.f23151y;
        if (slVar != null) {
            slVar.g();
            this.f23151y = null;
        }
        sl slVar2 = this.f23152z;
        if (slVar2 != null) {
            slVar2.g();
            this.f23152z = null;
        }
    }

    private void D() {
        C();
        ((ol) b1.a(this.w)).a();
        this.w = null;
        this.f23149u = 0;
    }

    private void E() {
        D();
        B();
    }

    private void a(pl plVar) {
        pc.a("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f23150v, plVar);
        z();
        E();
    }

    private void b(List list) {
        Handler handler = this.f23142n;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            a(list);
        }
    }

    private void z() {
        b(Collections.emptyList());
    }

    @Override // com.applovin.impl.qi
    public boolean c() {
        return this.f23147s;
    }

    @Override // com.applovin.impl.qi
    public boolean d() {
        return true;
    }

    @Override // com.applovin.impl.qi, com.applovin.impl.ri
    public String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        a((List) message.obj);
        return true;
    }

    @Override // com.applovin.impl.e2
    public void v() {
        this.f23150v = null;
        this.B = -9223372036854775807L;
        z();
        D();
    }

    public bo(ao aoVar, Looper looper, ql qlVar) {
        super(3);
        this.f23143o = (ao) b1.a(aoVar);
        this.f23142n = looper == null ? null : xp.a(looper, (Handler.Callback) this);
        this.f23144p = qlVar;
        this.f23145q = new g9();
        this.B = -9223372036854775807L;
    }

    public void c(long j2) {
        b1.b(k());
        this.B = j2;
    }

    private void a(List list) {
        this.f23143o.a(list);
    }

    @Override // com.applovin.impl.e2
    public void a(long j2, boolean z2) {
        z();
        this.f23146r = false;
        this.f23147s = false;
        this.B = -9223372036854775807L;
        if (this.f23149u != 0) {
            E();
        } else {
            C();
            ((ol) b1.a(this.w)).b();
        }
    }

    @Override // com.applovin.impl.e2
    public void a(f9[] f9VarArr, long j2, long j3) {
        this.f23150v = f9VarArr[0];
        if (this.w != null) {
            this.f23149u = 1;
        } else {
            B();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x00a7, code lost:
    
        if (r11 != false) goto L48;
     */
    @Override // com.applovin.impl.qi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(long r9, long r11) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.bo.a(long, long):void");
    }

    @Override // com.applovin.impl.ri
    public int a(f9 f9Var) {
        if (this.f23144p.a(f9Var)) {
            return ri.a(f9Var.F == 0 ? 4 : 2);
        }
        if (Cif.h(f9Var.f23840m)) {
            return ri.a(1);
        }
        return ri.a(0);
    }
}
