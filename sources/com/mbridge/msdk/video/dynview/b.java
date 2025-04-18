package com.mbridge.msdk.video.dynview;

import android.view.View;
import com.mbridge.msdk.video.dynview.e.h;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private static volatile b f15707b;
    public Map<String, SoftReference<View>> a = new HashMap();

    private b() {
    }

    public static b a() {
        b bVar;
        if (f15707b == null) {
            synchronized (b.class) {
                if (f15707b == null) {
                    f15707b = new b();
                }
                bVar = f15707b;
            }
            return bVar;
        }
        return f15707b;
    }

    public final void a(c cVar, h hVar) {
        new com.mbridge.msdk.video.dynview.h.a(cVar, hVar, new HashMap());
    }
}
