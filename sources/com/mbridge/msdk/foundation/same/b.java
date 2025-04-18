package com.mbridge.msdk.foundation.same;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.af;

/* loaded from: classes4.dex */
public class b {
    private static volatile b a;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f13310b = null;

    private b() {
    }

    public static b a() {
        if (a == null) {
            synchronized (b.class) {
                if (a == null) {
                    a = new b();
                }
            }
        }
        return a;
    }

    public final Boolean b() {
        return this.f13310b;
    }

    public final boolean a(String str) {
        if (TextUtils.isEmpty(str) || !str.equals("new_bridge_reward_video")) {
            return false;
        }
        Boolean valueOf = Boolean.valueOf(af.a().a("new_bridge_reward_video", false, false));
        this.f13310b = valueOf;
        return valueOf.booleanValue();
    }
}
