package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class xl implements Runnable {
    protected final com.applovin.impl.sdk.k a;

    /* renamed from: b, reason: collision with root package name */
    protected final String f9060b;

    /* renamed from: c, reason: collision with root package name */
    protected final com.applovin.impl.sdk.t f9061c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f9062d;

    /* renamed from: f, reason: collision with root package name */
    private String f9063f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f9064g;

    public xl(String str, com.applovin.impl.sdk.k kVar) {
        this(str, kVar, false, null);
    }

    public com.applovin.impl.sdk.k b() {
        return this.a;
    }

    public String c() {
        return this.f9060b;
    }

    public boolean d() {
        return this.f9064g;
    }

    public xl(String str, com.applovin.impl.sdk.k kVar, String str2) {
        this(str, kVar, false, str2);
    }

    public Context a() {
        return this.f9062d;
    }

    public ScheduledFuture b(Thread thread, long j3) {
        if (j3 <= 0) {
            return null;
        }
        return this.a.l0().b(new kn(this.a, "timeout:" + this.f9060b, new iu(this, thread, j3, 1)), sm.b.TIMEOUT, j3);
    }

    public xl(String str, com.applovin.impl.sdk.k kVar, boolean z10) {
        this(str, kVar, z10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Thread thread, long j3) {
        HashMap<String, String> hashMap = CollectionUtils.hashMap("name", thread.getState().name());
        if (StringUtils.isValidString(this.f9063f)) {
            hashMap.put("details", this.f9063f);
        }
        this.a.B().a(o.b.TASK_LATENCY_ALERT, this.f9060b, (Map) hashMap);
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.k(this.f9060b, "Task has been executing for over " + TimeUnit.MILLISECONDS.toSeconds(j3) + " seconds");
        }
    }

    public xl(String str, com.applovin.impl.sdk.k kVar, boolean z10, String str2) {
        this.f9060b = str;
        this.a = kVar;
        this.f9061c = kVar.L();
        this.f9062d = com.applovin.impl.sdk.k.k();
        this.f9064g = z10;
        this.f9063f = str2;
    }

    public void a(String str) {
        this.f9063f = str;
    }

    public void a(boolean z10) {
        this.f9064g = z10;
    }

    public void a(Throwable th2) {
        Map map = CollectionUtils.map("source", this.f9060b);
        map.put("top_main_method", th2.toString());
        map.put("details", StringUtils.emptyIfNull(this.f9063f));
        this.a.B().a(o.b.TASK_EXCEPTION, map);
    }
}
