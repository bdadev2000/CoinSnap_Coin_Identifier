package com.applovin.impl;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.applovin.impl.cd;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class rl implements cd {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f10509a;
    private final Surface b;

    /* renamed from: c, reason: collision with root package name */
    private ByteBuffer[] f10510c;

    /* renamed from: d, reason: collision with root package name */
    private ByteBuffer[] f10511d;

    /* loaded from: classes.dex */
    public static final class b {
        public static Surface a(MediaCodec mediaCodec) {
            return mediaCodec.createInputSurface();
        }
    }

    /* loaded from: classes.dex */
    public static class c implements cd.b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.applovin.impl.rl$a] */
        /* JADX WARN: Type inference failed for: r0v1, types: [android.view.Surface] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        @Override // com.applovin.impl.cd.b
        public cd a(cd.a aVar) {
            MediaCodec mediaCodec;
            Surface surface;
            ?? r02 = 0;
            r02 = 0;
            r02 = 0;
            try {
                mediaCodec = b(aVar);
                try {
                    lo.a("configureCodec");
                    mediaCodec.configure(aVar.b, aVar.f7080d, aVar.f7081e, aVar.f7082f);
                    lo.a();
                    if (aVar.f7083g) {
                        if (yp.f12451a >= 18) {
                            surface = b.a(mediaCodec);
                        } else {
                            throw new IllegalStateException("Encoding from a surface is only supported on API 18 and up.");
                        }
                    } else {
                        surface = null;
                    }
                    try {
                        lo.a("startCodec");
                        mediaCodec.start();
                        lo.a();
                        return new rl(mediaCodec, surface);
                    } catch (IOException | RuntimeException e4) {
                        r02 = surface;
                        e = e4;
                        if (r02 != 0) {
                            r02.release();
                        }
                        if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                        throw e;
                    }
                } catch (IOException e9) {
                    e = e9;
                } catch (RuntimeException e10) {
                    e = e10;
                }
            } catch (IOException | RuntimeException e11) {
                e = e11;
                mediaCodec = null;
            }
        }

        public MediaCodec b(cd.a aVar) {
            AbstractC0669a1.a(aVar.f7078a);
            String str = aVar.f7078a.f7633a;
            lo.a("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            lo.a();
            return createByCodecName;
        }
    }

    private rl(MediaCodec mediaCodec, Surface surface) {
        this.f10509a = mediaCodec;
        this.b = surface;
        if (yp.f12451a < 21) {
            this.f10510c = mediaCodec.getInputBuffers();
            this.f10511d = mediaCodec.getOutputBuffers();
        }
    }

    @Override // com.applovin.impl.cd
    public void b() {
        this.f10509a.flush();
    }

    @Override // com.applovin.impl.cd
    public boolean c() {
        return false;
    }

    @Override // com.applovin.impl.cd
    public int d() {
        return this.f10509a.dequeueInputBuffer(0L);
    }

    @Override // com.applovin.impl.cd
    public MediaFormat e() {
        return this.f10509a.getOutputFormat();
    }

    @Override // com.applovin.impl.cd
    public int a(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f10509a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && yp.f12451a < 21) {
                this.f10511d = this.f10509a.getOutputBuffers();
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.applovin.impl.cd
    public ByteBuffer b(int i9) {
        if (yp.f12451a >= 21) {
            return this.f10509a.getOutputBuffer(i9);
        }
        return ((ByteBuffer[]) yp.a((Object) this.f10511d))[i9];
    }

    @Override // com.applovin.impl.cd
    public void c(int i9) {
        this.f10509a.setVideoScalingMode(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(cd.c cVar, MediaCodec mediaCodec, long j7, long j9) {
        cVar.a(this, j7, j9);
    }

    @Override // com.applovin.impl.cd
    public void a(int i9, int i10, int i11, long j7, int i12) {
        this.f10509a.queueInputBuffer(i9, i10, i11, j7, i12);
    }

    @Override // com.applovin.impl.cd
    public void a(int i9, int i10, y4 y4Var, long j7, int i11) {
        this.f10509a.queueSecureInputBuffer(i9, i10, y4Var.a(), j7, i11);
    }

    @Override // com.applovin.impl.cd
    public void a() {
        this.f10510c = null;
        this.f10511d = null;
        Surface surface = this.b;
        if (surface != null) {
            surface.release();
        }
        this.f10509a.release();
    }

    @Override // com.applovin.impl.cd
    public void a(int i9, long j7) {
        this.f10509a.releaseOutputBuffer(i9, j7);
    }

    @Override // com.applovin.impl.cd
    public void a(int i9, boolean z8) {
        this.f10509a.releaseOutputBuffer(i9, z8);
    }

    @Override // com.applovin.impl.cd
    public void a(cd.c cVar, Handler handler) {
        this.f10509a.setOnFrameRenderedListener(new G0(this, cVar, 1), handler);
    }

    @Override // com.applovin.impl.cd
    public void a(Surface surface) {
        this.f10509a.setOutputSurface(surface);
    }

    @Override // com.applovin.impl.cd
    public void a(Bundle bundle) {
        this.f10509a.setParameters(bundle);
    }

    @Override // com.applovin.impl.cd
    public ByteBuffer a(int i9) {
        if (yp.f12451a >= 21) {
            return this.f10509a.getInputBuffer(i9);
        }
        return ((ByteBuffer[]) yp.a((Object) this.f10510c))[i9];
    }
}
