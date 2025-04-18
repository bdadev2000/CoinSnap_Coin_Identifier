package androidx.navigation;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class NavDeepLinkBuilder$activity$1 extends r implements l {
    @Override // q0.l
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        p0.a.s(context, "it");
        ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
        if (contextWrapper != null) {
            return contextWrapper.getBaseContext();
        }
        return null;
    }
}
