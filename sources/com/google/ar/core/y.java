package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class y extends com.google.ar.core.dependencies.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f14320a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArImage f14321c;

    public y(ArImage arImage, long j7, int i9) {
        this.f14321c = arImage;
        this.f14320a = j7;
        this.b = i9;
    }

    @Override // android.media.Image.Plane
    public final ByteBuffer getBuffer() {
        ArImage arImage = this.f14321c;
        return arImage.c(arImage.b.nativeWrapperHandle, this.f14320a, this.b).asReadOnlyBuffer();
    }

    @Override // android.media.Image.Plane
    public final int getPixelStride() {
        ArImage arImage = this.f14321c;
        int b = arImage.b(arImage.b.nativeWrapperHandle, this.f14320a, this.b);
        if (b != -1) {
            return b;
        }
        throw new FatalException("Unknown error in ArImage.Plane.getPixelStride().");
    }

    @Override // android.media.Image.Plane
    public final int getRowStride() {
        ArImage arImage = this.f14321c;
        int a6 = arImage.a(arImage.b.nativeWrapperHandle, this.f14320a, this.b);
        if (a6 != -1) {
            return a6;
        }
        throw new FatalException("Unknown error in ArImage.Plane.getRowStride().");
    }
}
