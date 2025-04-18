package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class x4 extends ec {

    /* renamed from: f, reason: collision with root package name */
    private com.applovin.impl.sdk.j f27831f;

    /* renamed from: g, reason: collision with root package name */
    private List f27832g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f27833h;

    /* renamed from: i, reason: collision with root package name */
    private List f27834i;

    /* loaded from: classes.dex */
    public enum a {
        RECENT_ADS,
        COUNT
    }

    public x4(Context context) {
        super(context);
        this.f27833h = new AtomicBoolean();
        this.f27834i = new ArrayList();
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new v6((w6) it.next(), this.f23676a));
        }
        return arrayList;
    }

    @Override // com.applovin.impl.ec
    public int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.ec
    public List c(int i2) {
        return this.f27834i;
    }

    public List d() {
        return this.f27832g;
    }

    public com.applovin.impl.sdk.j e() {
        return this.f27831f;
    }

    public boolean f() {
        return this.f27834i.size() == 0;
    }

    public void g() {
        this.f27833h.compareAndSet(true, false);
    }

    public String toString() {
        return "CreativeDebuggerListAdapter{isInitialized=" + this.f27833h.get() + "}";
    }

    @Override // com.applovin.impl.ec
    public int d(int i2) {
        return this.f27834i.size();
    }

    @Override // com.applovin.impl.ec
    public dc e(int i2) {
        return new fj("RECENT ADS");
    }

    public void a(List list, com.applovin.impl.sdk.j jVar) {
        Activity n02;
        this.f27831f = jVar;
        this.f27832g = list;
        if (!(this.f23676a instanceof Activity) && (n02 = jVar.n0()) != null) {
            this.f23676a = n02;
        }
        if (list != null && this.f27833h.compareAndSet(false, true)) {
            this.f27834i = a(this.f27832g);
        }
        AppLovinSdkUtils.runOnUiThread(new mt(this, 21));
    }
}
