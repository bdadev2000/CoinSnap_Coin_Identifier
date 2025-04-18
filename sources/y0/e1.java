package y0;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* loaded from: classes.dex */
public final class e1 {
    public final CoroutineScope a;

    /* renamed from: b, reason: collision with root package name */
    public final Function2 f27720b;

    /* renamed from: c, reason: collision with root package name */
    public final Channel f27721c;

    /* renamed from: d, reason: collision with root package name */
    public final fb.c f27722d;

    public e1(CoroutineScope scope, p0 onComplete, q0 onUndeliveredElement, r0 consumeMessage) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onUndeliveredElement, "onUndeliveredElement");
        Intrinsics.checkNotNullParameter(consumeMessage, "consumeMessage");
        this.a = scope;
        this.f27720b = consumeMessage;
        this.f27721c = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        this.f27722d = new fb.c((Object) null);
        Job job = (Job) scope.getCoroutineContext().get(Job.INSTANCE);
        if (job != null) {
            job.invokeOnCompletion(new c1(onComplete, this, onUndeliveredElement));
        }
    }
}
