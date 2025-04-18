package com.applovin.impl;

import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes2.dex */
public class v7 {

    /* renamed from: b, reason: collision with root package name */
    private final String f27475b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f27476c;

    /* renamed from: a, reason: collision with root package name */
    private final String f27474a = UUID.randomUUID().toString();
    private final long d = System.currentTimeMillis();

    public v7(String str, Map map) {
        this.f27475b = str;
        this.f27476c = map;
    }

    public long a() {
        return this.d;
    }

    public String b() {
        return this.f27474a;
    }

    public String c() {
        return this.f27475b;
    }

    public Map d() {
        return this.f27476c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        v7 v7Var = (v7) obj;
        if (this.d == v7Var.d && Objects.equals(this.f27475b, v7Var.f27475b) && Objects.equals(this.f27476c, v7Var.f27476c)) {
            return Objects.equals(this.f27474a, v7Var.f27474a);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f27475b;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f27476c;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        long j2 = this.d;
        int i2 = (hashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str2 = this.f27474a;
        return i2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Event{name='" + this.f27475b + "', id='" + this.f27474a + "', creationTimestampMillis=" + this.d + ", parameters=" + this.f27476c + '}';
    }
}
