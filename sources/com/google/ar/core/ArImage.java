package com.google.ar.core;

import android.graphics.Rect;
import android.media.Image;
import com.google.ar.core.exceptions.FatalException;
import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ArImage extends com.google.ar.core.dependencies.b {
    public final Session b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14252c;

    /* renamed from: d, reason: collision with root package name */
    public long f14253d;

    public ArImage(Session session, long j7) {
        this.b = session;
        this.f14253d = j7;
        this.f14252c = session.nativeSymbolTableHandle;
    }

    private native void nativeClose(long j7, long j9);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeGetBuffer, reason: merged with bridge method [inline-methods] */
    public native ByteBuffer c(long j7, long j9, int i9);

    private native int nativeGetFormat(long j7, long j9);

    private native int nativeGetHeight(long j7, long j9);

    private native int nativeGetNumberOfPlanes(long j7, long j9);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeGetPixelStride, reason: merged with bridge method [inline-methods] */
    public native int b(long j7, long j9, int i9);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeGetRowStride, reason: merged with bridge method [inline-methods] */
    public native int a(long j7, long j9, int i9);

    private native long nativeGetTimestamp(long j7, long j9);

    private native int nativeGetWidth(long j7, long j9);

    public static native void nativeLoadSymbols();

    @Override // android.media.Image, java.lang.AutoCloseable
    public final void close() {
        nativeClose(this.f14252c, this.f14253d);
        this.f14253d = 0L;
    }

    @Override // android.media.Image
    public final Rect getCropRect() {
        return new Rect(0, 0, getWidth(), getHeight());
    }

    @Override // android.media.Image
    public final int getFormat() {
        int nativeGetFormat = nativeGetFormat(this.b.nativeWrapperHandle, this.f14253d);
        if (nativeGetFormat != -1) {
            return nativeGetFormat;
        }
        throw new FatalException("Unknown error in ArImage.getFormat().");
    }

    @Override // android.media.Image
    public final int getHeight() {
        int nativeGetHeight = nativeGetHeight(this.b.nativeWrapperHandle, this.f14253d);
        if (nativeGetHeight != -1) {
            return nativeGetHeight;
        }
        throw new FatalException("Unknown error in ArImage.getHeight().");
    }

    @Override // android.media.Image
    public final Image.Plane[] getPlanes() {
        int nativeGetNumberOfPlanes = nativeGetNumberOfPlanes(this.b.nativeWrapperHandle, this.f14253d);
        if (nativeGetNumberOfPlanes != -1) {
            y[] yVarArr = new y[nativeGetNumberOfPlanes];
            for (int i9 = 0; i9 < nativeGetNumberOfPlanes; i9++) {
                yVarArr[i9] = new y(this, this.f14253d, i9);
            }
            return yVarArr;
        }
        throw new FatalException("Unknown error in ArImage.getPlanes().");
    }

    @Override // android.media.Image
    public final long getTimestamp() {
        long nativeGetTimestamp = nativeGetTimestamp(this.b.nativeWrapperHandle, this.f14253d);
        if (nativeGetTimestamp != -1) {
            return nativeGetTimestamp;
        }
        throw new FatalException("Unknown error in ArImage.getTimestamp().");
    }

    @Override // android.media.Image
    public final int getWidth() {
        int nativeGetWidth = nativeGetWidth(this.b.nativeWrapperHandle, this.f14253d);
        if (nativeGetWidth != -1) {
            return nativeGetWidth;
        }
        throw new FatalException("Unknown error in ArImage.getWidth().");
    }

    @Override // android.media.Image
    public final void setCropRect(Rect rect) {
        throw new UnsupportedOperationException("This is a read-only image.");
    }

    @Override // android.media.Image
    public final void setTimestamp(long j7) {
        throw new UnsupportedOperationException("This is a read-only image.");
    }
}
