package com.applovin.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class co extends AbstractC0685d2 implements Handler.Callback {

    /* renamed from: A, reason: collision with root package name */
    private int f7101A;

    /* renamed from: B, reason: collision with root package name */
    private long f7102B;

    /* renamed from: n, reason: collision with root package name */
    private final Handler f7103n;

    /* renamed from: o, reason: collision with root package name */
    private final bo f7104o;

    /* renamed from: p, reason: collision with root package name */
    private final nl f7105p;

    /* renamed from: q, reason: collision with root package name */
    private final e9 f7106q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f7107r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f7108s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f7109t;

    /* renamed from: u, reason: collision with root package name */
    private int f7110u;

    /* renamed from: v, reason: collision with root package name */
    private d9 f7111v;

    /* renamed from: w, reason: collision with root package name */
    private ll f7112w;

    /* renamed from: x, reason: collision with root package name */
    private ol f7113x;

    /* renamed from: y, reason: collision with root package name */
    private pl f7114y;

    /* renamed from: z, reason: collision with root package name */
    private pl f7115z;

    public co(bo boVar, Looper looper) {
        this(boVar, looper, nl.f9358a);
    }

    private long A() {
        if (this.f7101A == -1) {
            return Long.MAX_VALUE;
        }
        AbstractC0669a1.a(this.f7114y);
        if (this.f7101A >= this.f7114y.a()) {
            return Long.MAX_VALUE;
        }
        return this.f7114y.a(this.f7101A);
    }

    private void B() {
        this.f7109t = true;
        this.f7112w = this.f7105p.b((d9) AbstractC0669a1.a(this.f7111v));
    }

    private void C() {
        this.f7113x = null;
        this.f7101A = -1;
        pl plVar = this.f7114y;
        if (plVar != null) {
            plVar.g();
            this.f7114y = null;
        }
        pl plVar2 = this.f7115z;
        if (plVar2 != null) {
            plVar2.g();
            this.f7115z = null;
        }
    }

    private void D() {
        C();
        ((ll) AbstractC0669a1.a(this.f7112w)).a();
        this.f7112w = null;
        this.f7110u = 0;
    }

    private void E() {
        D();
        B();
    }

    private void a(ml mlVar) {
        kc.a("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f7111v, mlVar);
        z();
        E();
    }

    private void b(List list) {
        Handler handler = this.f7103n;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            a(list);
        }
    }

    private void z() {
        b(Collections.emptyList());
    }

    @Override // com.applovin.impl.li
    public boolean c() {
        return this.f7108s;
    }

    @Override // com.applovin.impl.li
    public boolean d() {
        return true;
    }

    @Override // com.applovin.impl.li, com.applovin.impl.mi
    public String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            a((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // com.applovin.impl.AbstractC0685d2
    public void v() {
        this.f7111v = null;
        this.f7102B = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        z();
        D();
    }

    public co(bo boVar, Looper looper, nl nlVar) {
        super(3);
        this.f7104o = (bo) AbstractC0669a1.a(boVar);
        this.f7103n = looper == null ? null : yp.a(looper, (Handler.Callback) this);
        this.f7105p = nlVar;
        this.f7106q = new e9();
        this.f7102B = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    public void c(long j7) {
        AbstractC0669a1.b(k());
        this.f7102B = j7;
    }

    private void a(List list) {
        this.f7104o.a(list);
    }

    @Override // com.applovin.impl.AbstractC0685d2
    public void a(long j7, boolean z8) {
        z();
        this.f7107r = false;
        this.f7108s = false;
        this.f7102B = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        if (this.f7110u != 0) {
            E();
        } else {
            C();
            ((ll) AbstractC0669a1.a(this.f7112w)).b();
        }
    }

    @Override // com.applovin.impl.AbstractC0685d2
    public void a(d9[] d9VarArr, long j7, long j9) {
        this.f7111v = d9VarArr[0];
        if (this.f7112w != null) {
            this.f7110u = 1;
        } else {
            B();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x00a7, code lost:
    
        if (r11 != false) goto L48;
     */
    @Override // com.applovin.impl.li
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(long r9, long r11) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.co.a(long, long):void");
    }

    @Override // com.applovin.impl.mi
    public int a(d9 d9Var) {
        if (this.f7105p.a(d9Var)) {
            return mi.a(d9Var.f7200F == 0 ? 4 : 2);
        }
        if (df.h(d9Var.m)) {
            return mi.a(1);
        }
        return mi.a(0);
    }
}
