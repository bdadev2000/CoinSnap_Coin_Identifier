package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class G2 implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s9 f6398c;

    public /* synthetic */ G2(s9 s9Var, int i9) {
        this.b = i9;
        this.f6398c = s9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.f6398c.P();
                return;
            case 1:
                s9.E(this.f6398c);
                return;
            case 2:
                s9.F(this.f6398c);
                return;
            case 3:
                this.f6398c.R();
                return;
            case 4:
                s9.H(this.f6398c);
                return;
            case 5:
                s9.K(this.f6398c);
                return;
            default:
                s9.I(this.f6398c);
                return;
        }
    }
}
