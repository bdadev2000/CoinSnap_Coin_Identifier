package k8;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import n9.h0;

/* loaded from: classes3.dex */
public final class a0 implements l {
    public final MediaCodec a;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer[] f20284b;

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f20285c;

    public a0(MediaCodec mediaCodec) {
        this.a = mediaCodec;
        if (h0.a < 21) {
            this.f20284b = mediaCodec.getInputBuffers();
            this.f20285c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // k8.l
    public final void a(o9.g gVar, Handler handler) {
        this.a.setOnFrameRenderedListener(new a(this, gVar, 1), handler);
    }

    @Override // k8.l
    public final MediaFormat b() {
        return this.a.getOutputFormat();
    }

    @Override // k8.l
    public final ByteBuffer c(int i10) {
        if (h0.a >= 21) {
            return this.a.getInputBuffer(i10);
        }
        return this.f20284b[i10];
    }

    @Override // k8.l
    public final void d(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // k8.l
    public final void e(int i10, w7.d dVar, long j3) {
        this.a.queueSecureInputBuffer(i10, 0, dVar.f26876i, j3, 0);
    }

    @Override // k8.l
    public final void f() {
    }

    @Override // k8.l
    public final void flush() {
        this.a.flush();
    }

    @Override // k8.l
    public final void g(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // k8.l
    public final void h(int i10, long j3) {
        this.a.releaseOutputBuffer(i10, j3);
    }

    @Override // k8.l
    public final int i() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // k8.l
    public final int j(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = this.a;
            dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && h0.a < 21) {
                this.f20285c = mediaCodec.getOutputBuffers();
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // k8.l
    public final void k(int i10, boolean z10) {
        this.a.releaseOutputBuffer(i10, z10);
    }

    @Override // k8.l
    public final ByteBuffer l(int i10) {
        if (h0.a >= 21) {
            return this.a.getOutputBuffer(i10);
        }
        return this.f20285c[i10];
    }

    @Override // k8.l
    public final void m(int i10, int i11, long j3, int i12) {
        this.a.queueInputBuffer(i10, 0, i11, j3, i12);
    }

    @Override // k8.l
    public final void release() {
        this.f20284b = null;
        this.f20285c = null;
        this.a.release();
    }

    @Override // k8.l
    public final void setVideoScalingMode(int i10) {
        this.a.setVideoScalingMode(i10);
    }
}
