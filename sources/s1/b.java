package s1;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.RequiresPermission;
import com.bumptech.glide.e;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes.dex */
public final class b extends e {

    /* renamed from: o, reason: collision with root package name */
    public final MeasurementManager f24153o;

    public b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService((Class<Object>) MeasurementManager.class);
        Intrinsics.checkNotNullExpressionValue(systemService, "context.getSystemService…:class.java\n            )");
        MeasurementManager mMeasurementManager = (MeasurementManager) systemService;
        Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
        this.f24153o = mMeasurementManager;
    }

    @Override // com.bumptech.glide.e
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public Object A(Continuation<? super Integer> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        this.f24153o.getMeasurementApiStatus(new l.a(2), com.bumptech.glide.c.c(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // com.bumptech.glide.e
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public Object M(Uri uri, InputEvent inputEvent, Continuation<? super Unit> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        this.f24153o.registerSource(uri, inputEvent, new l.a(6), com.bumptech.glide.c.c(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return result;
        }
        return Unit.INSTANCE;
    }

    @Override // com.bumptech.glide.e
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public Object N(Uri uri, Continuation<? super Unit> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        this.f24153o.registerTrigger(uri, new l.a(3), com.bumptech.glide.c.c(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return result;
        }
        return Unit.INSTANCE;
    }

    @Override // com.bumptech.glide.e
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public Object O(c cVar, Continuation<? super Unit> continuation) {
        new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1).initCancellability();
        throw null;
    }

    @Override // com.bumptech.glide.e
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public Object P(d dVar, Continuation<? super Unit> continuation) {
        new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1).initCancellability();
        throw null;
    }

    @Override // com.bumptech.glide.e
    public Object v(a aVar, Continuation<? super Unit> continuation) {
        new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1).initCancellability();
        new DeletionRequest.Builder();
        throw null;
    }
}
