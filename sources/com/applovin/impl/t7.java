package com.applovin.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class t7 {
    private final String a = UUID.randomUUID().toString();

    /* renamed from: b, reason: collision with root package name */
    private final String f8152b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f8153c;

    /* renamed from: d, reason: collision with root package name */
    private final long f8154d;

    public t7(String str, Map map, Map map2) {
        this.f8152b = str;
        HashMap hashMap = new HashMap();
        this.f8153c = hashMap;
        hashMap.putAll(map);
        hashMap.put("applovin_sdk_super_properties", map2);
        this.f8154d = System.currentTimeMillis();
    }

    public long a() {
        return this.f8154d;
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.f8152b;
    }

    public Map d() {
        return this.f8153c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        t7 t7Var = (t7) obj;
        if (this.f8154d != t7Var.f8154d) {
            return false;
        }
        String str = this.f8152b;
        if (str == null ? t7Var.f8152b != null : !str.equals(t7Var.f8152b)) {
            return false;
        }
        Map map = this.f8153c;
        if (map == null ? t7Var.f8153c != null : !map.equals(t7Var.f8153c)) {
            return false;
        }
        String str2 = this.a;
        String str3 = t7Var.a;
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
        int i10;
        int i11;
        String str = this.f8152b;
        int i12 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = i10 * 31;
        Map map = this.f8153c;
        if (map != null) {
            i11 = map.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        long j3 = this.f8154d;
        int i15 = (i14 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        String str2 = this.a;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return i15 + i12;
    }

    public String toString() {
        return "Event{name='" + this.f8152b + "', id='" + this.a + "', creationTimestampMillis=" + this.f8154d + ", parameters=" + this.f8153c + AbstractJsonLexerKt.END_OBJ;
    }
}
