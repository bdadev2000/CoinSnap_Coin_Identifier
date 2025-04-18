package com.applovin.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class co extends d2 implements Handler.Callback {
    private int A;
    private long B;

    /* renamed from: n, reason: collision with root package name */
    private final Handler f4115n;

    /* renamed from: o, reason: collision with root package name */
    private final bo f4116o;

    /* renamed from: p, reason: collision with root package name */
    private final nl f4117p;

    /* renamed from: q, reason: collision with root package name */
    private final e9 f4118q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f4119r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f4120s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f4121t;
    private int u;

    /* renamed from: v, reason: collision with root package name */
    private d9 f4122v;

    /* renamed from: w, reason: collision with root package name */
    private ll f4123w;

    /* renamed from: x, reason: collision with root package name */
    private ol f4124x;

    /* renamed from: y, reason: collision with root package name */
    private pl f4125y;

    /* renamed from: z, reason: collision with root package name */
    private pl f4126z;

    public co(bo boVar, Looper looper) {
        this(boVar, looper, nl.a);
    }

    private long A() {
        if (this.A == -1) {
            return Long.MAX_VALUE;
        }
        a1.a(this.f4125y);
        if (this.A >= this.f4125y.a()) {
            return Long.MAX_VALUE;
        }
        return this.f4125y.a(this.A);
    }

    private void B() {
        this.f4121t = true;
        this.f4123w = this.f4117p.b((d9) a1.a(this.f4122v));
    }

    private void C() {
        this.f4124x = null;
        this.A = -1;
        pl plVar = this.f4125y;
        if (plVar != null) {
            plVar.g();
            this.f4125y = null;
        }
        pl plVar2 = this.f4126z;
        if (plVar2 != null) {
            plVar2.g();
            this.f4126z = null;
        }
    }

    private void D() {
        C();
        ((ll) a1.a(this.f4123w)).a();
        this.f4123w = null;
        this.u = 0;
    }

    private void E() {
        D();
        B();
    }

    private void a(ml mlVar) {
        kc.a("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f4122v, mlVar);
        z();
        E();
    }

    private void b(List list) {
        Handler handler = this.f4115n;
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
        return this.f4120s;
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

    @Override // com.applovin.impl.d2
    public void v() {
        this.f4122v = null;
        this.B = C.TIME_UNSET;
        z();
        D();
    }

    public co(bo boVar, Looper looper, nl nlVar) {
        super(3);
        this.f4116o = (bo) a1.a(boVar);
        this.f4115n = looper == null ? null : yp.a(looper, (Handler.Callback) this);
        this.f4117p = nlVar;
        this.f4118q = new e9();
        this.B = C.TIME_UNSET;
    }

    public void c(long j3) {
        a1.b(k());
        this.B = j3;
    }

    private void a(List list) {
        this.f4116o.a(list);
    }

    @Override // com.applovin.impl.d2
    public void a(long j3, boolean z10) {
        z();
        this.f4119r = false;
        this.f4120s = false;
        this.B = C.TIME_UNSET;
        if (this.u != 0) {
            E();
        } else {
            C();
            ((ll) a1.a(this.f4123w)).b();
        }
    }

    @Override // com.applovin.impl.d2
    public void a(d9[] d9VarArr, long j3, long j10) {
        this.f4122v = d9VarArr[0];
        if (this.f4123w != null) {
            this.u = 1;
        } else {
            B();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x00a7, code lost:
    
        if (r11 != false) goto L48;
     */
    @Override // com.applovin.impl.li
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(long r9, long r11) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.co.a(long, long):void");
    }

    @Override // com.applovin.impl.mi
    public int a(d9 d9Var) {
        if (this.f4117p.a(d9Var)) {
            return mi.a(d9Var.F == 0 ? 4 : 2);
        }
        if (df.h(d9Var.f4228m)) {
            return mi.a(1);
        }
        return mi.a(0);
    }
}
