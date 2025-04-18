package com.applovin.impl;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.applovin.impl.hd;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class ul implements hd {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f27367a;

    /* renamed from: b, reason: collision with root package name */
    private final Surface f27368b;

    /* renamed from: c, reason: collision with root package name */
    private ByteBuffer[] f27369c;
    private ByteBuffer[] d;

    /* loaded from: classes2.dex */
    public static final class b {
        public static Surface a(MediaCodec mediaCodec) {
            return mediaCodec.createInputSurface();
        }
    }

    /* loaded from: classes2.dex */
    public static class c implements hd.b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.applovin.impl.ul$a] */
        /* JADX WARN: Type inference failed for: r0v1, types: [android.view.Surface] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        @Override // com.applovin.impl.hd.b
        public hd a(hd.a aVar) {
            MediaCodec mediaCodec;
            Surface surface;
            ?? r02 = 0;
            r02 = 0;
            r02 = 0;
            try {
                mediaCodec = b(aVar);
                try {
                    ko.a("configureCodec");
                    mediaCodec.configure(aVar.f24305b, aVar.d, aVar.e, aVar.f24307f);
                    ko.a();
                    if (!aVar.f24308g) {
                        surface = null;
                    } else {
                        if (xp.f27962a < 18) {
                            throw new IllegalStateException("Encoding from a surface is only supported on API 18 and up.");
                        }
                        surface = b.a(mediaCodec);
                    }
                    try {
                        ko.a("startCodec");
                        mediaCodec.start();
                        ko.a();
                        return new ul(mediaCodec, surface);
                    } catch (IOException | RuntimeException e) {
                        r02 = surface;
                        e = e;
                        if (r02 != 0) {
                            r02.release();
                        }
                        if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                        throw e;
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (RuntimeException e3) {
                    e = e3;
                }
            } catch (IOException | RuntimeException e4) {
                e = e4;
                mediaCodec = null;
            }
        }

        public MediaCodec b(hd.a aVar) {
            b1.a(aVar.f24304a);
            String str = aVar.f24304a.f24873a;
            ko.a("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            ko.a();
            return createByCodecName;
        }
    }

    private ul(MediaCodec mediaCodec, Surface surface) {
        this.f27367a = mediaCodec;
        this.f27368b = surface;
        if (xp.f27962a < 21) {
            this.f27369c = mediaCodec.getInputBuffers();
            this.d = mediaCodec.getOutputBuffers();
        }
    }

    @Override // com.applovin.impl.hd
    public void b() {
        this.f27367a.flush();
    }

    @Override // com.applovin.impl.hd
    public boolean c() {
        return false;
    }

    @Override // com.applovin.impl.hd
    public int d() {
        return this.f27367a.dequeueInputBuffer(0L);
    }

    @Override // com.applovin.impl.hd
    public MediaFormat e() {
        return this.f27367a.getOutputFormat();
    }

    @Override // com.applovin.impl.hd
    public int a(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f27367a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && xp.f27962a < 21) {
                this.d = this.f27367a.getOutputBuffers();
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.applovin.impl.hd
    public ByteBuffer b(int i2) {
        if (xp.f27962a >= 21) {
            return this.f27367a.getOutputBuffer(i2);
        }
        return ((ByteBuffer[]) xp.a((Object) this.d))[i2];
    }

    @Override // com.applovin.impl.hd
    public void c(int i2) {
        this.f27367a.setVideoScalingMode(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(hd.c cVar, MediaCodec mediaCodec, long j2, long j3) {
        cVar.a(this, j2, j3);
    }

    @Override // com.applovin.impl.hd
    public void a(int i2, int i3, int i4, long j2, int i5) {
        this.f27367a.queueInputBuffer(i2, i3, i4, j2, i5);
    }

    @Override // com.applovin.impl.hd
    public void a(int i2, int i3, a5 a5Var, long j2, int i4) {
        this.f27367a.queueSecureInputBuffer(i2, i3, a5Var.a(), j2, i4);
    }

    @Override // com.applovin.impl.hd
    public void a() {
        this.f27369c = null;
        this.d = null;
        Surface surface = this.f27368b;
        if (surface != null) {
            surface.release();
        }
        this.f27367a.release();
    }

    @Override // com.applovin.impl.hd
    public void a(int i2, long j2) {
        this.f27367a.releaseOutputBuffer(i2, j2);
    }

    @Override // com.applovin.impl.hd
    public void a(int i2, boolean z2) {
        this.f27367a.releaseOutputBuffer(i2, z2);
    }

    @Override // com.applovin.impl.hd
    public void a(hd.c cVar, Handler handler) {
        this.f27367a.setOnFrameRenderedListener(new nt(this, cVar, 1), handler);
    }

    @Override // com.applovin.impl.hd
    public void a(Surface surface) {
        this.f27367a.setOutputSurface(surface);
    }

    @Override // com.applovin.impl.hd
    public void a(Bundle bundle) {
        this.f27367a.setParameters(bundle);
    }

    @Override // com.applovin.impl.hd
    public ByteBuffer a(int i2) {
        if (xp.f27962a >= 21) {
            return this.f27367a.getInputBuffer(i2);
        }
        return ((ByteBuffer[]) xp.a((Object) this.f27369c))[i2];
    }
}
