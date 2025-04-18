package androidx.navigation;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class ActivityNavigator$hostActivity$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final ActivityNavigator$hostActivity$1 f20315a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        p0.a.s(context, "it");
        if (context instanceof ContextWrapper) {
            return ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
