package com.mbridge.msdk.c;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public int f14723a;
    private HashMap<String, f> b;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final e f14724a = new e();
    }

    public static e a() {
        return a.f14724a;
    }

    public final void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (this.b == null) {
                this.b = new HashMap<>();
            }
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String string = jSONObject.getString(next);
                f fVar = new f();
                fVar.a(next);
                fVar.b(string);
                this.b.put(next, fVar);
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    private e() {
        this.f14723a = 6;
        this.b = new HashMap<>();
    }

    public final int a(String str) {
        HashMap<String, f> hashMap;
        f fVar;
        if (TextUtils.isEmpty(str) || (hashMap = this.b) == null || !hashMap.containsKey(str) || (fVar = this.b.get(str)) == null) {
            return 0;
        }
        int i9 = fVar.b() ? 1 : fVar.a() >= this.f14723a ? 2 : 0;
        fVar.a(false);
        return i9;
    }
}
