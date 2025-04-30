package com.vungle.ads.internal.task;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class a {
    public /* synthetic */ a(G7.f fVar) {
        this();
    }

    public static /* synthetic */ g makeJobInfo$default(a aVar, String str, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = null;
        }
        return aVar.makeJobInfo(str);
    }

    public final g makeJobInfo(String str) {
        boolean z8 = false;
        g priority = new g(c.TAG).setPriority(0);
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString("AD_ID_KEY", str);
        }
        g extras = priority.setExtras(bundle);
        if (str == null) {
            z8 = true;
        }
        return extras.setUpdateCurrent(z8);
    }

    private a() {
    }
}
