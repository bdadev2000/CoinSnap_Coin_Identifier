package com.applovin.impl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class wl {

    /* renamed from: a, reason: collision with root package name */
    protected final ro f12014a;

    /* loaded from: classes.dex */
    public static final class a extends ah {
        public a(String str) {
            super(str, null, false, 1);
        }
    }

    public wl(ro roVar) {
        this.f12014a = roVar;
    }

    public abstract boolean a(yg ygVar);

    public final boolean a(yg ygVar, long j7) {
        return a(ygVar) && b(ygVar, j7);
    }

    public abstract boolean b(yg ygVar, long j7);
}
