package com.google.ar.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ar.core.Anchor;
import com.google.ar.core.annotations.UsedByNative;
import java.lang.ref.WeakReference;
import java.util.function.BiConsumer;

/* loaded from: classes2.dex */
public class ResolveAnchorOnRooftopFuture extends FutureImpl {

    /* loaded from: classes2.dex */
    public final class CallbackWrapper {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f14278a;
        public final long b;

        /* renamed from: c, reason: collision with root package name */
        public final BiConsumer f14279c;

        public CallbackWrapper(Session session, BiConsumer biConsumer) {
            this.f14278a = new WeakReference(session);
            this.b = session.nativeSymbolTableHandle;
            this.f14279c = biConsumer;
        }

        @UsedByNative("callback_context.cc")
        public void accept(long j7, int i9) {
            Session session = (Session) this.f14278a.get();
            BiConsumer biConsumer = this.f14279c;
            if (session != null) {
                biConsumer.accept(ResolveAnchorOnRooftopFuture.makeAnchor(j7, session), Anchor.RooftopAnchorState.forNumber(i9));
                return;
            }
            biConsumer.accept(null, Anchor.RooftopAnchorState.ERROR_INTERNAL);
            if (j7 != 0) {
                Anchor.nativeReleaseAnchor(this.b, j7);
            }
        }
    }

    public ResolveAnchorOnRooftopFuture(Session session, long j7, long j9) {
        super(session, j7, j9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static Anchor makeAnchor(long j7, @NonNull Session session) {
        if (j7 != 0) {
            return new Anchor(j7, session);
        }
        return null;
    }

    @Override // com.google.ar.core.FutureImpl, com.google.ar.core.Future
    public /* bridge */ /* synthetic */ boolean cancel() {
        return super.cancel();
    }

    @Nullable
    public Anchor getResultAnchor() {
        return makeAnchor(nativeGetResultAnchor(this.session.nativeWrapperHandle, this.nativeFuture), this.session);
    }

    @NonNull
    public Anchor.RooftopAnchorState getResultRooftopAnchorState() {
        return Anchor.RooftopAnchorState.forNumber(nativeGetResultRooftopAnchorState(this.session.nativeWrapperHandle, this.nativeFuture));
    }

    @Override // com.google.ar.core.FutureImpl, com.google.ar.core.Future
    @NonNull
    public /* bridge */ /* synthetic */ FutureState getState() {
        return super.getState();
    }

    public native long nativeGetResultAnchor(long j7, long j9);

    public native int nativeGetResultRooftopAnchorState(long j7, long j9);
}
