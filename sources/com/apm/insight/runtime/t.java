package com.apm.insight.runtime;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private String f6076a = null;
    private int b = -1;

    public t(Context context) {
    }

    public String a() {
        if (!TextUtils.isEmpty(this.f6076a) && !"0".equals(this.f6076a)) {
            return this.f6076a;
        }
        String d2 = com.apm.insight.i.a().d();
        this.f6076a = d2;
        if (!TextUtils.isEmpty(d2) && !"0".equals(this.f6076a)) {
            return this.f6076a;
        }
        String b = s.a().b();
        this.f6076a = b;
        return b;
    }

    public boolean b() {
        return this.f6076a != null;
    }

    public void a(String str) {
        this.f6076a = str;
        s.a().b(str);
    }
}
