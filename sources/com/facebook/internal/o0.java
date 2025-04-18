package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class o0 {
    public Context a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11060b;

    /* renamed from: c, reason: collision with root package name */
    public String f11061c;

    /* renamed from: d, reason: collision with root package name */
    public q0 f11062d;

    /* renamed from: e, reason: collision with root package name */
    public Bundle f11063e;

    /* renamed from: f, reason: collision with root package name */
    public final com.facebook.a f11064f;

    public o0(FragmentActivity context, String action, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(action, "action");
        Date date = com.facebook.a.f10880n;
        this.f11064f = z1.d.n();
        if (!z1.d.p()) {
            this.f11060b = m0.p(context);
        }
        this.a = context;
        this.f11061c = action;
        if (bundle != null) {
            this.f11063e = bundle;
        } else {
            this.f11063e = new Bundle();
        }
    }

    public o0(FragmentActivity context, String str, Bundle bundle, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("oauth", "action");
        str = str == null ? m0.p(context) : str;
        x5.i.o(str, "applicationId");
        this.f11060b = str;
        this.a = context;
        this.f11061c = "oauth";
        this.f11063e = bundle;
    }
}
