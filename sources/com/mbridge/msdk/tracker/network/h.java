package com.mbridge.msdk.tracker.network;

import android.text.TextUtils;

/* loaded from: classes4.dex */
public final class h {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15433b;

    public h(String str, String str2) {
        this.a = str;
        this.f15433b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.f15433b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (TextUtils.equals(this.a, hVar.a) && TextUtils.equals(this.f15433b, hVar.f15433b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15433b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Header[name=");
        sb2.append(this.a);
        sb2.append(",value=");
        return vd.e.h(sb2, this.f15433b, "]");
    }
}
