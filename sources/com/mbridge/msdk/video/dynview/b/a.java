package com.mbridge.msdk.video.dynview.b;

import android.view.View;
import com.mbridge.msdk.video.dynview.c;
import com.mbridge.msdk.video.dynview.e.e;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static volatile a f15708b;
    public com.mbridge.msdk.video.dynview.d.a a;

    private a() {
    }

    public static a a() {
        a aVar;
        if (f15708b == null) {
            synchronized (a.class) {
                if (f15708b == null) {
                    f15708b = new a();
                }
                aVar = f15708b;
            }
            return aVar;
        }
        return f15708b;
    }

    public final void b() {
        com.mbridge.msdk.video.dynview.d.a aVar = this.a;
        if (aVar != null) {
            aVar.c();
        }
    }

    public final void a(View view, c cVar, Map map, e eVar) {
        int h10 = cVar.h();
        if (h10 == 1) {
            com.mbridge.msdk.video.dynview.j.a aVar = new com.mbridge.msdk.video.dynview.j.a();
            aVar.a(cVar, view, map, eVar);
            this.a = aVar.a;
        } else {
            if (h10 == 2) {
                new com.mbridge.msdk.video.dynview.j.a().b(cVar, view, map, eVar);
                return;
            }
            if (h10 == 4) {
                new com.mbridge.msdk.video.dynview.j.a().a(cVar, view, eVar);
            } else if (h10 != 5) {
                eVar.a(view, new ArrayList());
            } else {
                new com.mbridge.msdk.video.dynview.j.a().c(cVar, view, map, eVar);
            }
        }
    }
}
