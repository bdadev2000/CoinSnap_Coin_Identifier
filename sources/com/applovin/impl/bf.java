package com.applovin.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class bf extends d2 implements Handler.Callback {

    /* renamed from: n, reason: collision with root package name */
    private final ye f3871n;

    /* renamed from: o, reason: collision with root package name */
    private final af f3872o;

    /* renamed from: p, reason: collision with root package name */
    private final Handler f3873p;

    /* renamed from: q, reason: collision with root package name */
    private final ze f3874q;

    /* renamed from: r, reason: collision with root package name */
    private xe f3875r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f3876s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f3877t;
    private long u;

    /* renamed from: v, reason: collision with root package name */
    private long f3878v;

    /* renamed from: w, reason: collision with root package name */
    private we f3879w;

    public bf(af afVar, Looper looper) {
        this(afVar, looper, ye.a);
    }

    private void a(we weVar, List list) {
        for (int i10 = 0; i10 < weVar.c(); i10++) {
            d9 b3 = weVar.a(i10).b();
            if (b3 != null && this.f3871n.a(b3)) {
                xe b10 = this.f3871n.b(b3);
                byte[] bArr = (byte[]) a1.a(weVar.a(i10).a());
                this.f3874q.b();
                this.f3874q.g(bArr.length);
                ((ByteBuffer) yp.a(this.f3874q.f6351c)).put(bArr);
                this.f3874q.g();
                we a = b10.a(this.f3874q);
                if (a != null) {
                    a(a, list);
                }
            } else {
                list.add(weVar.a(i10));
            }
        }
    }

    private void b(we weVar) {
        this.f3872o.a(weVar);
    }

    private void z() {
        if (!this.f3876s && this.f3879w == null) {
            this.f3874q.b();
            e9 r6 = r();
            int a = a(r6, this.f3874q, 0);
            if (a == -4) {
                if (this.f3874q.e()) {
                    this.f3876s = true;
                    return;
                }
                ze zeVar = this.f3874q;
                zeVar.f9370j = this.u;
                zeVar.g();
                we a10 = ((xe) yp.a(this.f3875r)).a(this.f3874q);
                if (a10 != null) {
                    ArrayList arrayList = new ArrayList(a10.c());
                    a(a10, arrayList);
                    if (!arrayList.isEmpty()) {
                        this.f3879w = new we(arrayList);
                        this.f3878v = this.f3874q.f6353f;
                        return;
                    }
                    return;
                }
                return;
            }
            if (a == -5) {
                this.u = ((d9) a1.a(r6.f4413b)).f4232q;
            }
        }
    }

    @Override // com.applovin.impl.li
    public boolean c() {
        return this.f3877t;
    }

    @Override // com.applovin.impl.li
    public boolean d() {
        return true;
    }

    @Override // com.applovin.impl.li, com.applovin.impl.mi
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            b((we) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // com.applovin.impl.d2
    public void v() {
        this.f3879w = null;
        this.f3878v = C.TIME_UNSET;
        this.f3875r = null;
    }

    public bf(af afVar, Looper looper, ye yeVar) {
        super(5);
        this.f3872o = (af) a1.a(afVar);
        this.f3873p = looper == null ? null : yp.a(looper, (Handler.Callback) this);
        this.f3871n = (ye) a1.a(yeVar);
        this.f3874q = new ze();
        this.f3878v = C.TIME_UNSET;
    }

    private boolean c(long j3) {
        boolean z10;
        we weVar = this.f3879w;
        if (weVar == null || this.f3878v > j3) {
            z10 = false;
        } else {
            a(weVar);
            this.f3879w = null;
            this.f3878v = C.TIME_UNSET;
            z10 = true;
        }
        if (this.f3876s && this.f3879w == null) {
            this.f3877t = true;
        }
        return z10;
    }

    private void a(we weVar) {
        Handler handler = this.f3873p;
        if (handler != null) {
            handler.obtainMessage(0, weVar).sendToTarget();
        } else {
            b(weVar);
        }
    }

    @Override // com.applovin.impl.d2
    public void a(long j3, boolean z10) {
        this.f3879w = null;
        this.f3878v = C.TIME_UNSET;
        this.f3876s = false;
        this.f3877t = false;
    }

    @Override // com.applovin.impl.d2
    public void a(d9[] d9VarArr, long j3, long j10) {
        this.f3875r = this.f3871n.b(d9VarArr[0]);
    }

    @Override // com.applovin.impl.li
    public void a(long j3, long j10) {
        boolean z10 = true;
        while (z10) {
            z();
            z10 = c(j3);
        }
    }

    @Override // com.applovin.impl.mi
    public int a(d9 d9Var) {
        if (this.f3871n.a(d9Var)) {
            return mi.a(d9Var.F == 0 ? 4 : 2);
        }
        return mi.a(0);
    }
}
