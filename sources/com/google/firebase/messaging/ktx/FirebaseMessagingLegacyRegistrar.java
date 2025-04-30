package com.google.firebase.messaging.ktx;

import R2.b;
import android.support.v4.media.session.a;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import o4.C2496b;

@Keep
/* loaded from: classes2.dex */
public final class FirebaseMessagingLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C2496b> getComponents() {
        return a.w(b.k("fire-fcm-ktx", "24.0.0"));
    }
}
