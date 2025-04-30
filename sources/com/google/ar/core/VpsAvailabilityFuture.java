package com.google.ar.core;

import androidx.annotation.NonNull;
import com.google.ar.core.annotations.UsedByNative;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public class VpsAvailabilityFuture extends FutureImpl {

    /* loaded from: classes2.dex */
    public final class CallbackWrapper {

        /* renamed from: a, reason: collision with root package name */
        public final Consumer f14284a;

        public CallbackWrapper(Consumer consumer) {
            this.f14284a = consumer;
        }

        @UsedByNative("callback_context.cc")
        public void accept(int i9) {
            this.f14284a.accept(VpsAvailability.forNumber(i9));
        }
    }

    public VpsAvailabilityFuture(Session session, long j7, long j9) {
        super(session, j7, j9);
    }

    @Override // com.google.ar.core.FutureImpl, com.google.ar.core.Future
    public /* bridge */ /* synthetic */ boolean cancel() {
        return super.cancel();
    }

    @NonNull
    public VpsAvailability getResult() {
        return VpsAvailability.forNumber(nativeGetResult(this.session.nativeWrapperHandle, this.nativeFuture));
    }

    @Override // com.google.ar.core.FutureImpl, com.google.ar.core.Future
    @NonNull
    public /* bridge */ /* synthetic */ FutureState getState() {
        return super.getState();
    }

    public native int nativeGetResult(long j7, long j9);
}
