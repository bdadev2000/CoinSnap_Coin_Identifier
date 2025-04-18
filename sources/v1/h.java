package v1;

import android.os.CancellationSignal;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Job;

/* loaded from: classes.dex */
public final class h extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CancellationSignal f25882b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Job f25883c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(CancellationSignal cancellationSignal, Job job) {
        super(1);
        this.f25882b = cancellationSignal;
        this.f25883c = job;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CancellationSignal cancellationSignal = this.f25882b;
        if (cancellationSignal != null) {
            Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
            cancellationSignal.cancel();
        }
        Job.DefaultImpls.cancel$default(this.f25883c, (CancellationException) null, 1, (Object) null);
        return Unit.INSTANCE;
    }
}
