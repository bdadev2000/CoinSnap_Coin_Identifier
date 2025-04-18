package com.vungle.ads.internal.task;

import android.os.Bundle;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class a {
    private a() {
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ g makeJobInfo$default(a aVar, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return aVar.makeJobInfo(str);
    }

    public final g makeJobInfo(String str) {
        boolean z10 = false;
        g priority = new g(c.TAG).setPriority(0);
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString("AD_ID_KEY", str);
        }
        g extras = priority.setExtras(bundle);
        if (str == null) {
            z10 = true;
        }
        return extras.setUpdateCurrent(z10);
    }
}
