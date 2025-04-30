package com.applovin.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public class t7 {

    /* renamed from: a, reason: collision with root package name */
    private final String f11306a = UUID.randomUUID().toString();
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f11307c;

    /* renamed from: d, reason: collision with root package name */
    private final long f11308d;

    public t7(String str, Map map, Map map2) {
        this.b = str;
        HashMap hashMap = new HashMap();
        this.f11307c = hashMap;
        hashMap.putAll(map);
        hashMap.put("applovin_sdk_super_properties", map2);
        this.f11308d = System.currentTimeMillis();
    }

    public long a() {
        return this.f11308d;
    }

    public String b() {
        return this.f11306a;
    }

    public String c() {
        return this.b;
    }

    public Map d() {
        return this.f11307c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        t7 t7Var = (t7) obj;
        if (this.f11308d != t7Var.f11308d) {
            return false;
        }
        String str = this.b;
        if (str == null ? t7Var.b != null : !str.equals(t7Var.b)) {
            return false;
        }
        Map map = this.f11307c;
        if (map == null ? t7Var.f11307c != null : !map.equals(t7Var.f11307c)) {
            return false;
        }
        String str2 = this.f11306a;
        String str3 = t7Var.f11306a;
        if (str2 != null) {
            if (str2.equals(str3)) {
                return true;
            }
        } else if (str3 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i9;
        int i10;
        String str = this.b;
        int i11 = 0;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i12 = i9 * 31;
        Map map = this.f11307c;
        if (map != null) {
            i10 = map.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i12 + i10) * 31;
        long j7 = this.f11308d;
        int i14 = (i13 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        String str2 = this.f11306a;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i14 + i11;
    }

    public String toString() {
        return "Event{name='" + this.b + "', id='" + this.f11306a + "', creationTimestampMillis=" + this.f11308d + ", parameters=" + this.f11307c + '}';
    }
}
