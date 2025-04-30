package com.applovin.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class bf extends AbstractC0685d2 implements Handler.Callback {

    /* renamed from: n, reason: collision with root package name */
    private final ye f6852n;

    /* renamed from: o, reason: collision with root package name */
    private final af f6853o;

    /* renamed from: p, reason: collision with root package name */
    private final Handler f6854p;

    /* renamed from: q, reason: collision with root package name */
    private final ze f6855q;

    /* renamed from: r, reason: collision with root package name */
    private xe f6856r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f6857s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f6858t;

    /* renamed from: u, reason: collision with root package name */
    private long f6859u;

    /* renamed from: v, reason: collision with root package name */
    private long f6860v;

    /* renamed from: w, reason: collision with root package name */
    private we f6861w;

    public bf(af afVar, Looper looper) {
        this(afVar, looper, ye.f12401a);
    }

    private void a(we weVar, List list) {
        for (int i9 = 0; i9 < weVar.c(); i9++) {
            d9 b = weVar.a(i9).b();
            if (b != null && this.f6852n.a(b)) {
                xe b8 = this.f6852n.b(b);
                byte[] bArr = (byte[]) AbstractC0669a1.a(weVar.a(i9).a());
                this.f6855q.b();
                this.f6855q.g(bArr.length);
                ((ByteBuffer) yp.a(this.f6855q.f9273c)).put(bArr);
                this.f6855q.g();
                we a6 = b8.a(this.f6855q);
                if (a6 != null) {
                    a(a6, list);
                }
            } else {
                list.add(weVar.a(i9));
            }
        }
    }

    private void b(we weVar) {
        this.f6853o.a(weVar);
    }

    private void z() {
        if (!this.f6857s && this.f6861w == null) {
            this.f6855q.b();
            e9 r9 = r();
            int a6 = a(r9, this.f6855q, 0);
            if (a6 == -4) {
                if (this.f6855q.e()) {
                    this.f6857s = true;
                    return;
                }
                ze zeVar = this.f6855q;
                zeVar.f12553j = this.f6859u;
                zeVar.g();
                we a9 = ((xe) yp.a(this.f6856r)).a(this.f6855q);
                if (a9 != null) {
                    ArrayList arrayList = new ArrayList(a9.c());
                    a(a9, arrayList);
                    if (!arrayList.isEmpty()) {
                        this.f6861w = new we(arrayList);
                        this.f6860v = this.f6855q.f9275f;
                        return;
                    }
                    return;
                }
                return;
            }
            if (a6 == -5) {
                this.f6859u = ((d9) AbstractC0669a1.a(r9.b)).f7214q;
            }
        }
    }

    @Override // com.applovin.impl.li
    public boolean c() {
        return this.f6858t;
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

    @Override // com.applovin.impl.AbstractC0685d2
    public void v() {
        this.f6861w = null;
        this.f6860v = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f6856r = null;
    }

    public bf(af afVar, Looper looper, ye yeVar) {
        super(5);
        this.f6853o = (af) AbstractC0669a1.a(afVar);
        this.f6854p = looper == null ? null : yp.a(looper, (Handler.Callback) this);
        this.f6852n = (ye) AbstractC0669a1.a(yeVar);
        this.f6855q = new ze();
        this.f6860v = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    private boolean c(long j7) {
        boolean z8;
        we weVar = this.f6861w;
        if (weVar == null || this.f6860v > j7) {
            z8 = false;
        } else {
            a(weVar);
            this.f6861w = null;
            this.f6860v = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            z8 = true;
        }
        if (this.f6857s && this.f6861w == null) {
            this.f6858t = true;
        }
        return z8;
    }

    private void a(we weVar) {
        Handler handler = this.f6854p;
        if (handler != null) {
            handler.obtainMessage(0, weVar).sendToTarget();
        } else {
            b(weVar);
        }
    }

    @Override // com.applovin.impl.AbstractC0685d2
    public void a(long j7, boolean z8) {
        this.f6861w = null;
        this.f6860v = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f6857s = false;
        this.f6858t = false;
    }

    @Override // com.applovin.impl.AbstractC0685d2
    public void a(d9[] d9VarArr, long j7, long j9) {
        this.f6856r = this.f6852n.b(d9VarArr[0]);
    }

    @Override // com.applovin.impl.li
    public void a(long j7, long j9) {
        boolean z8 = true;
        while (z8) {
            z();
            z8 = c(j7);
        }
    }

    @Override // com.applovin.impl.mi
    public int a(d9 d9Var) {
        if (this.f6852n.a(d9Var)) {
            return mi.a(d9Var.f7200F == 0 ? 4 : 2);
        }
        return mi.a(0);
    }
}
