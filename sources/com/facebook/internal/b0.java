package com.facebook.internal;

import android.net.Uri;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b0 extends h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(String action, Bundle bundle) {
        super(action, bundle);
        Intrinsics.checkNotNullParameter(action, "action");
        Uri s5 = ni.a.s(bundle == null ? new Bundle() : bundle, action);
        if (!m6.a.b(this)) {
            try {
                Intrinsics.checkNotNullParameter(s5, "<set-?>");
                this.a = s5;
            } catch (Throwable th2) {
                m6.a.a(this, th2);
            }
        }
    }
}
