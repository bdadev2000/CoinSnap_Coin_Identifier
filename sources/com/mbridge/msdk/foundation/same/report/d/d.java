package com.mbridge.msdk.foundation.same.report.d;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class d {
    private Map<String, String> a = new HashMap();

    public final void a(String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        try {
            if (obj instanceof String) {
                if (!TextUtils.isEmpty((String) obj)) {
                    this.a.put(str, (String) obj);
                }
            } else {
                this.a.put(str, obj + "");
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public final Object b(String str) {
        return this.a.get(str);
    }

    public final void c(String str) {
        if (this.a != null && !TextUtils.isEmpty(str)) {
            this.a.remove(str);
        }
    }

    public final boolean a(String str) {
        return this.a.containsKey(str);
    }

    public final Map<String, String> a() {
        return this.a;
    }

    public final void a(d dVar) {
        Map<String, String> map;
        Map<String, String> map2;
        if (dVar == null || (map = dVar.a) == null || (map2 = this.a) == null) {
            return;
        }
        map2.putAll(map);
    }

    public final void a(Map map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        this.a.putAll(map);
    }
}
