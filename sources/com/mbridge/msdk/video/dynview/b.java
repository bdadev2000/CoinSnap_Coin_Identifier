package com.mbridge.msdk.video.dynview;

import android.view.View;
import com.mbridge.msdk.video.dynview.e.h;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class b {
    private static volatile b b;

    /* renamed from: a, reason: collision with root package name */
    public Map<String, SoftReference<View>> f18568a = new HashMap();

    private b() {
    }

    public static b a() {
        b bVar;
        if (b == null) {
            synchronized (b.class) {
                try {
                    if (b == null) {
                        b = new b();
                    }
                    bVar = b;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bVar;
        }
        return b;
    }

    public final void a(c cVar, h hVar) {
        new com.mbridge.msdk.video.dynview.h.a(cVar, hVar, new HashMap());
    }
}
