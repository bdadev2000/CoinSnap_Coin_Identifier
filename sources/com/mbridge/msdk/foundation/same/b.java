package com.mbridge.msdk.foundation.same;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.af;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f15712a;
    private Boolean b = null;

    private b() {
    }

    public static b a() {
        if (f15712a == null) {
            synchronized (b.class) {
                try {
                    if (f15712a == null) {
                        f15712a = new b();
                    }
                } finally {
                }
            }
        }
        return f15712a;
    }

    public final Boolean b() {
        return this.b;
    }

    public final boolean a(String str) {
        if (TextUtils.isEmpty(str) || !str.equals("new_bridge_reward_video")) {
            return false;
        }
        boolean a6 = af.a().a("new_bridge_reward_video", false, false);
        this.b = Boolean.valueOf(a6);
        return a6;
    }
}
