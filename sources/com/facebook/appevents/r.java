package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.u0;
import com.facebook.x;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static final com.facebook.c f10969b = new com.facebook.c(15, 0);
    public final l a;

    public r(l loggerImpl) {
        Intrinsics.checkNotNullParameter(loggerImpl, "loggerImpl");
        this.a = loggerImpl;
    }

    public final void a(String str, double d10, Bundle bundle) {
        x xVar = x.a;
        if (u0.b()) {
            l lVar = this.a;
            lVar.getClass();
            if (!m6.a.b(lVar)) {
                try {
                    lVar.e(str, Double.valueOf(d10), bundle, false, c6.b.a());
                } catch (Throwable th2) {
                    m6.a.a(lVar, th2);
                }
            }
        }
    }

    public final void b(Bundle bundle, String str) {
        x xVar = x.a;
        if (u0.b()) {
            this.a.f(str, bundle);
        }
    }

    public r(Context context) {
        this(new l(context, (String) null));
    }

    public r(Context context, String str) {
        this(new l(context, str));
    }
}
