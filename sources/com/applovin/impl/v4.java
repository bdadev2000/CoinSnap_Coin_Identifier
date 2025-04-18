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
    private com.applovin.impl.sdk.k f8458f;

    /* renamed from: g, reason: collision with root package name */
    private List f8459g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f8460h;

    /* renamed from: i, reason: collision with root package name */
    private List f8461i;

    /* loaded from: classes.dex */
    public enum a {
        RECENT_ADS,
        COUNT
    }

    public v4(Context context) {
        super(context);
        this.f8460h = new AtomicBoolean();
        this.f8461i = new ArrayList();
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new t6((u6) it.next(), this.a));
        }
        return arrayList;
    }

    @Override // com.applovin.impl.zb
    public int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.zb
    public List c(int i10) {
        return this.f8461i;
    }

    public List d() {
        return this.f8459g;
    }

    public com.applovin.impl.sdk.k e() {
        return this.f8458f;
    }

    public boolean f() {
        return this.f8461i.size() == 0;
    }

    public void g() {
        this.f8460h.compareAndSet(true, false);
    }

    public String toString() {
        return "CreativeDebuggerListAdapter{isInitialized=" + this.f8460h.get() + "}";
    }

    @Override // com.applovin.impl.zb
    public int d(int i10) {
        return this.f8461i.size();
    }

    @Override // com.applovin.impl.zb
    public yb e(int i10) {
        return new bj("RECENT ADS");
    }

    public void a(List list, com.applovin.impl.sdk.k kVar) {
        Activity p02;
        this.f8458f = kVar;
        this.f8459g = list;
        if (!(this.a instanceof Activity) && (p02 = kVar.p0()) != null) {
            this.a = p02;
        }
        if (list != null && this.f8460h.compareAndSet(false, true)) {
            this.f8461i = a(this.f8459g);
        }
        AppLovinSdkUtils.runOnUiThread(new nt(this, 19));
    }
}
