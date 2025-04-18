package androidx.lifecycle;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/lifecycle/v;", "<anonymous parameter 0>", "Landroidx/lifecycle/n;", NotificationCompat.CATEGORY_EVENT, "", "onStateChanged", "(Landroidx/lifecycle/v;Landroidx/lifecycle/n;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 implements t {
    @Override // androidx.lifecycle.t
    public final void a(v vVar, n event) {
        Intrinsics.checkNotNullParameter(vVar, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != n.ON_DESTROY) {
            return;
        }
        Result.Companion companion = Result.INSTANCE;
        Result.m145constructorimpl(Unit.INSTANCE);
        throw null;
    }
}
