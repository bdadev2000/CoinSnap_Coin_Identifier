package com.mbridge.msdk.video.dynview.b;

import android.view.View;
import com.mbridge.msdk.video.dynview.c;
import java.util.Map;

/* loaded from: classes4.dex */
public class b {
    private static volatile b a;

    private b() {
    }

    public static b a() {
        b bVar;
        if (a == null) {
            synchronized (b.class) {
                if (a == null) {
                    a = new b();
                }
                bVar = a;
            }
            return bVar;
        }
        return a;
    }

    public final void a(View view, c cVar, Map<String, Object> map) {
        if (cVar == null) {
            return;
        }
        int h10 = cVar.h();
        if (h10 == 1) {
            new com.mbridge.msdk.video.dynview.j.b().a(view, map);
            return;
        }
        if (h10 == 2) {
            new com.mbridge.msdk.video.dynview.j.b().a(view, cVar, map);
            return;
        }
        if (h10 == 3) {
            new com.mbridge.msdk.video.dynview.j.b().a(view, cVar);
        } else if (h10 == 4) {
            new com.mbridge.msdk.video.dynview.j.b().b(view, cVar, map);
        } else {
            if (h10 != 5) {
                return;
            }
            new com.mbridge.msdk.video.dynview.j.b();
        }
    }
}
