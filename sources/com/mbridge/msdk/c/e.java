package com.mbridge.msdk.c;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class e {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    private HashMap<String, f> f12432b;

    /* loaded from: classes4.dex */
    public static class a {
        private static final e a = new e();
    }

    public static e a() {
        return a.a;
    }

    public final void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (this.f12432b == null) {
                this.f12432b = new HashMap<>();
            }
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String string = jSONObject.getString(next);
                f fVar = new f();
                fVar.a(next);
                fVar.b(string);
                this.f12432b.put(next, fVar);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private e() {
        this.a = 6;
        this.f12432b = new HashMap<>();
    }

    public final int a(String str) {
        HashMap<String, f> hashMap;
        f fVar;
        if (TextUtils.isEmpty(str) || (hashMap = this.f12432b) == null || !hashMap.containsKey(str) || (fVar = this.f12432b.get(str)) == null) {
            return 0;
        }
        int i10 = fVar.b() ? 1 : fVar.a() >= this.a ? 2 : 0;
        fVar.a(false);
        return i10;
    }
}
