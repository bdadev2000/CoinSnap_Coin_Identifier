package com.mbridge.msdk.foundation.same.c;

import android.content.Context;
import android.graphics.Bitmap;
import com.mbridge.msdk.foundation.same.c.d;
import com.mbridge.msdk.foundation.tools.ai;

/* loaded from: classes4.dex */
public final class b {
    private static b a;

    private b(Context context) {
    }

    public static b a(Context context) {
        if (a == null) {
            a = new b(context);
        }
        return a;
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
