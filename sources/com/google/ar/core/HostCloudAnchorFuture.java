package com.google.ar.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ar.core.Anchor;
import com.google.ar.core.annotations.UsedByNative;
import java.util.function.BiConsumer;

/* loaded from: classes2.dex */
public class HostCloudAnchorFuture extends FutureImpl {

    /* loaded from: classes2.dex */
    public final class CallbackWrapper {

        /* renamed from: a, reason: collision with root package name */
        public final BiConsumer f14272a;

        public CallbackWrapper(BiConsumer biConsumer) {
            this.f14272a = biConsumer;
        }

        @UsedByNative("callback_context.cc")
        public void accept(String str, int i9) {
            this.f14272a.accept(str, Anchor.CloudAnchorState.forNumber(i9));
        }
    }

    public HostCloudAnchorFuture(Session session, long j7, long j9) {
        super(session, j7, j9);
    }

    @Override // com.google.ar.core.FutureImpl, com.google.ar.core.Future
    public /* bridge */ /* synthetic */ boolean cancel() {
        return super.cancel();
    }

    @Nullable
    public String getResultCloudAnchorId() {
        return nativeGetResultCloudAnchorId(this.session.nativeWrapperHandle, this.nativeFuture);
    }

    @NonNull
    public Anchor.CloudAnchorState getResultCloudAnchorState() {
        return Anchor.CloudAnchorState.forNumber(nativeGetResultCloudAnchorState(this.session.nativeWrapperHandle, this.nativeFuture));
    }

    @Override // com.google.ar.core.FutureImpl, com.google.ar.core.Future
    @NonNull
    public /* bridge */ /* synthetic */ FutureState getState() {
        return super.getState();
    }

    public native String nativeGetResultCloudAnchorId(long j7, long j9);

    public native int nativeGetResultCloudAnchorState(long j7, long j9);
}
