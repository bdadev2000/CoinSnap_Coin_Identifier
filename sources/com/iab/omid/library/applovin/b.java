package com.iab.omid.library.applovin;

import android.content.Context;
import com.iab.omid.library.applovin.internal.i;
import com.iab.omid.library.applovin.utils.e;
import com.iab.omid.library.applovin.utils.g;

/* loaded from: classes4.dex */
public class b {
    private boolean a;

    private void b(Context context) {
        g.a(context, "Application Context cannot be null");
    }

    public String a() {
        return "1.4.12-Applovin";
    }

    public void c() {
        g.a();
        com.iab.omid.library.applovin.internal.a.a().d();
    }

    public void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        i.c().a(context);
        com.iab.omid.library.applovin.internal.b.g().a(context);
        com.iab.omid.library.applovin.utils.a.a(context);
        com.iab.omid.library.applovin.utils.c.a(context);
        e.a(context);
        com.iab.omid.library.applovin.internal.g.b().a(context);
        com.iab.omid.library.applovin.internal.a.a().a(context);
    }

    public boolean b() {
        return this.a;
    }

    public void a(boolean z10) {
        this.a = z10;
    }
}
