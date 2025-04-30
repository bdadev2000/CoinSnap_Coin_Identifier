package com.iab.omid.library.bytedance2.internal;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class b extends d {

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static b f14519d = new b();

    private b() {
    }

    public static b g() {
        return f14519d;
    }

    @Override // com.iab.omid.library.bytedance2.internal.d
    public void b(boolean z8) {
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = c.c().b().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(z8);
        }
    }

    @Override // com.iab.omid.library.bytedance2.internal.d
    public boolean d() {
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            View c9 = it.next().c();
            if (c9 != null && c9.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
