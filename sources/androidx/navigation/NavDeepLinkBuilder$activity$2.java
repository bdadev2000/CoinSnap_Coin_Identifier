package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class NavDeepLinkBuilder$activity$2 extends r implements l {
    @Override // q0.l
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        p0.a.s(context, "it");
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }
}
