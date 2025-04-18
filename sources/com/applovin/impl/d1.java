package com.applovin.impl;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public abstract class d1 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.j f23397a;

    /* renamed from: b, reason: collision with root package name */
    protected final String f23398b;

    /* renamed from: c, reason: collision with root package name */
    protected final com.applovin.impl.sdk.n f23399c;
    protected final AtomicBoolean e = new AtomicBoolean();
    private final Context d = com.applovin.impl.sdk.j.l();

    public d1(String str, com.applovin.impl.sdk.j jVar) {
        this.f23398b = str;
        this.f23397a = jVar;
        this.f23399c = jVar.J();
    }

    public Context a() {
        return this.d;
    }

    public void a(boolean z2) {
        this.e.set(z2);
    }
}
