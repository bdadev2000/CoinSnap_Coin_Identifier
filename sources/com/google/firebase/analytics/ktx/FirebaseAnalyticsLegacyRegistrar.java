package com.google.firebase.analytics.ktx;

import R2.b;
import android.support.v4.media.session.a;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* loaded from: classes2.dex */
public final class FirebaseAnalyticsLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return a.w(b.k("fire-analytics-ktx", "22.0.2"));
    }
}
