package com.applovin.impl;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractCallableC0679c1 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f6944a;
    protected final String b;

    /* renamed from: c, reason: collision with root package name */
    protected final com.applovin.impl.sdk.t f6945c;

    /* renamed from: e, reason: collision with root package name */
    protected final AtomicBoolean f6947e = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    private final Context f6946d = com.applovin.impl.sdk.k.k();

    public AbstractCallableC0679c1(String str, com.applovin.impl.sdk.k kVar) {
        this.b = str;
        this.f6944a = kVar;
        this.f6945c = kVar.L();
    }

    public Context a() {
        return this.f6946d;
    }

    public void a(boolean z8) {
        this.f6947e.set(z8);
    }
}
