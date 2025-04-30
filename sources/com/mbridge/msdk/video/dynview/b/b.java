package com.mbridge.msdk.video.dynview.b;

import android.view.View;
import com.mbridge.msdk.video.dynview.c;
import java.util.Map;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f18570a;

    private b() {
    }

    public static b a() {
        b bVar;
        if (f18570a == null) {
            synchronized (b.class) {
                try {
                    if (f18570a == null) {
                        f18570a = new b();
                    }
                    bVar = f18570a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bVar;
        }
        return f18570a;
    }

    public final void a(View view, c cVar, Map<String, Object> map) {
        if (cVar == null) {
            return;
        }
        int h6 = cVar.h();
        if (h6 == 1) {
            new com.mbridge.msdk.video.dynview.j.b().a(view, map);
            return;
        }
        if (h6 == 2) {
            new com.mbridge.msdk.video.dynview.j.b().a(view, cVar, map);
            return;
        }
        if (h6 == 3) {
            new com.mbridge.msdk.video.dynview.j.b().a(view, cVar);
        } else if (h6 == 4) {
            new com.mbridge.msdk.video.dynview.j.b().b(view, cVar, map);
        } else {
            if (h6 != 5) {
                return;
            }
            new com.mbridge.msdk.video.dynview.j.b();
        }
    }
}
