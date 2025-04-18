package com.facebook.internal;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes3.dex */
public class h {
    public Uri a;

    public h(String action, Bundle bundle) {
        Uri u;
        Intrinsics.checkNotNullParameter(action, "action");
        bundle = bundle == null ? new Bundle() : bundle;
        a0[] valuesCustom = a0.valuesCustom();
        ArrayList arrayList = new ArrayList(valuesCustom.length);
        for (a0 a0Var : valuesCustom) {
            arrayList.add(a0Var.f11020b);
        }
        if (arrayList.contains(action)) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            com.facebook.x xVar = com.facebook.x.a;
            u = m0.b(bundle, com.applovin.impl.mediation.ads.e.h(new Object[]{"fb.gg"}, 1, "%s", "java.lang.String.format(format, *args)"), Intrinsics.stringPlus("/dialog/", action));
        } else {
            u = com.facebook.c.u(bundle, action);
        }
        this.a = u;
    }
}
