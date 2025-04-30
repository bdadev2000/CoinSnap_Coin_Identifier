package com.mbridge.msdk.foundation.same.c;

import android.content.Context;
import android.graphics.Bitmap;
import com.mbridge.msdk.foundation.same.c.d;
import com.mbridge.msdk.foundation.tools.ai;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static b f15731a;

    private b(Context context) {
    }

    public static b a(Context context) {
        if (f15731a == null) {
            f15731a = new b(context);
        }
        return f15731a;
    }

    public final boolean b(String str) {
        if (ai.k(str)) {
            return false;
        }
        return d.a.a().b(str);
    }

    public final Bitmap a(String str) {
        if (ai.k(str)) {
            return null;
        }
        return d.a.a().a(str);
    }

    public final void a(String str, c cVar) {
        d.a.a().a(str, null, cVar);
    }
}
