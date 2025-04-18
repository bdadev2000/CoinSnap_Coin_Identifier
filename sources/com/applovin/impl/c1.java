package com.applovin.impl;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class c1 implements Callable {
    protected final com.applovin.impl.sdk.k a;

    /* renamed from: b, reason: collision with root package name */
    protected final String f3974b;

    /* renamed from: c, reason: collision with root package name */
    protected final com.applovin.impl.sdk.t f3975c;

    /* renamed from: e, reason: collision with root package name */
    protected final AtomicBoolean f3977e = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    private final Context f3976d = com.applovin.impl.sdk.k.k();

    public c1(String str, com.applovin.impl.sdk.k kVar) {
        this.f3974b = str;
        this.a = kVar;
        this.f3975c = kVar.L();
    }

    public Context a() {
        return this.f3976d;
    }

    public void a(boolean z10) {
        this.f3977e.set(z10);
    }
}
