package androidx.activity;

import android.content.res.Resources;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class SystemBarStyle$Companion$auto$1 extends r implements l {
    @Override // q0.l
    public final Object invoke(Object obj) {
        Resources resources = (Resources) obj;
        p0.a.s(resources, "resources");
        return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
    }
}
