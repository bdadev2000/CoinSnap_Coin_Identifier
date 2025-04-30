package com.mbridge.msdk.tracker.network;

import android.text.TextUtils;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final String f18177a;
    private final String b;

    public h(String str, String str2) {
        this.f18177a = str;
        this.b = str2;
    }

    public final String a() {
        return this.f18177a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (TextUtils.equals(this.f18177a, hVar.f18177a) && TextUtils.equals(this.b, hVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f18177a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header[name=");
        sb.append(this.f18177a);
        sb.append(",value=");
        return AbstractC2914a.h(sb, this.b, "]");
    }
}
