package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class v4 extends zb {

    /* renamed from: f, reason: collision with root package name */
    private com.applovin.impl.sdk.k f11666f;

    /* renamed from: g, reason: collision with root package name */
    private List f11667g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f11668h;

    /* renamed from: i, reason: collision with root package name */
    private List f11669i;

    /* loaded from: classes.dex */
    public enum a {
        RECENT_ADS,
        COUNT
    }

    public v4(Context context) {
        super(context);
        this.f11668h = new AtomicBoolean();
        this.f11669i = new ArrayList();
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new t6((u6) it.next(), this.f12545a));
        }
        return arrayList;
    }

    @Override // com.applovin.impl.zb
    public int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.zb
    public List c(int i9) {
        return this.f11669i;
    }

    public List d() {
        return this.f11667g;
    }

    public com.applovin.impl.sdk.k e() {
        return this.f11666f;
    }

    public boolean f() {
        if (this.f11669i.size() == 0) {
            return true;
        }
        return false;
    }

    public void g() {
        this.f11668h.compareAndSet(true, false);
    }

    public String toString() {
        return "CreativeDebuggerListAdapter{isInitialized=" + this.f11668h.get() + "}";
    }

    @Override // com.applovin.impl.zb
    public int d(int i9) {
        return this.f11669i.size();
    }

    @Override // com.applovin.impl.zb
    public yb e(int i9) {
        return new bj("RECENT ADS");
    }

    public void a(List list, com.applovin.impl.sdk.k kVar) {
        Activity p02;
        this.f11666f = kVar;
        this.f11667g = list;
        if (!(this.f12545a instanceof Activity) && (p02 = kVar.p0()) != null) {
            this.f12545a = p02;
        }
        if (list != null && this.f11668h.compareAndSet(false, true)) {
            this.f11669i = a(this.f11667g);
        }
        AppLovinSdkUtils.runOnUiThread(new F0(this, 19));
    }
}
