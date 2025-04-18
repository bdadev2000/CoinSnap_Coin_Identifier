package androidx.navigation;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NavController$activity$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final NavController$activity$1 f20372a = new r(1);

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
