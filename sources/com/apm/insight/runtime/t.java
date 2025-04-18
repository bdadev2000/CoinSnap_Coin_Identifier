package com.apm.insight.runtime;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class t {
    private String a = null;

    /* renamed from: b, reason: collision with root package name */
    private int f3360b = -1;

    public t(Context context) {
    }

    public String a() {
        if (!TextUtils.isEmpty(this.a) && !"0".equals(this.a)) {
            return this.a;
        }
        String d10 = com.apm.insight.i.a().d();
        this.a = d10;
        if (!TextUtils.isEmpty(d10) && !"0".equals(this.a)) {
            return this.a;
        }
        String b3 = s.a().b();
        this.a = b3;
        return b3;
    }

    public boolean b() {
        return this.a != null;
    }

    public void a(String str) {
        this.a = str;
        s.a().b(str);
    }
}
