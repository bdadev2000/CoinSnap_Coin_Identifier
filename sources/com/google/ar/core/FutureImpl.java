package com.google.ar.core;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class FutureImpl implements Future {
    final long nativeCallbackContext;
    final long nativeFuture;
    final long nativeSymbolTableHandle;
    final Session session;

    public FutureImpl(Session session, long j7, long j9) {
        this.session = session;
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
        this.nativeFuture = j7;
        this.nativeCallbackContext = j9;
    }

    public static native void nativeReleaseFuture(long j7, long j9);

    @Override // com.google.ar.core.Future
    public boolean cancel() {
        return nativeCancel(this.session.nativeWrapperHandle, this.nativeFuture, this.nativeCallbackContext);
    }

    public void finalize() throws Throwable {
        nativeReleaseFuture(this.nativeSymbolTableHandle, this.nativeFuture);
        super.finalize();
    }

    @Override // com.google.ar.core.Future
    public FutureState getState() {
        return FutureState.forNumber(nativeGetState(this.session.nativeWrapperHandle, this.nativeFuture));
    }

    public native boolean nativeCancel(long j7, long j9, long j10);

    public native int nativeGetState(long j7, long j9);
}
