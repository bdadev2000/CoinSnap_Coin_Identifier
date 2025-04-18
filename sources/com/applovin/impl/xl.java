package com.applovin.impl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class xl {

    /* renamed from: a, reason: collision with root package name */
    protected final qo f27937a;

    /* loaded from: classes3.dex */
    public static final class a extends dh {
        public a(String str) {
            super(str, null, false, 1);
        }
    }

    public xl(qo qoVar) {
        this.f27937a = qoVar;
    }

    public abstract boolean a(bh bhVar);

    public final boolean a(bh bhVar, long j2) {
        return a(bhVar) && b(bhVar, j2);
    }

    public abstract boolean b(bh bhVar, long j2);
}
