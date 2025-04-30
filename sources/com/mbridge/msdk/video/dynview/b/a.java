package com.mbridge.msdk.video.dynview.b;

import android.view.View;
import com.mbridge.msdk.video.dynview.c;
import com.mbridge.msdk.video.dynview.e.e;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes3.dex */
public class a {
    private static volatile a b;

    /* renamed from: a, reason: collision with root package name */
    public com.mbridge.msdk.video.dynview.d.a f18569a;

    private a() {
    }

    public static a a() {
        a aVar;
        if (b == null) {
            synchronized (a.class) {
                try {
                    if (b == null) {
                        b = new a();
                    }
                    aVar = b;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return aVar;
        }
        return b;
    }

    public final void b() {
        com.mbridge.msdk.video.dynview.d.a aVar = this.f18569a;
        if (aVar != null) {
            aVar.c();
        }
    }

    public final void a(View view, c cVar, Map map, e eVar) {
        int h6 = cVar.h();
        if (h6 == 1) {
            com.mbridge.msdk.video.dynview.j.a aVar = new com.mbridge.msdk.video.dynview.j.a();
            aVar.a(cVar, view, map, eVar);
            this.f18569a = aVar.f18648a;
        } else {
            if (h6 == 2) {
                new com.mbridge.msdk.video.dynview.j.a().b(cVar, view, map, eVar);
                return;
            }
            if (h6 == 4) {
                new com.mbridge.msdk.video.dynview.j.a().a(cVar, view, eVar);
            } else if (h6 != 5) {
                eVar.a(view, new ArrayList());
            } else {
                new com.mbridge.msdk.video.dynview.j.a().c(cVar, view, map, eVar);
            }
        }
    }
}
