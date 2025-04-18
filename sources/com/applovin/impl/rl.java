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
    private final MediaCodec a;

    /* renamed from: b, reason: collision with root package name */
    private final Surface f7372b;

    /* renamed from: c, reason: collision with root package name */
    private ByteBuffer[] f7373c;

    /* renamed from: d, reason: collision with root package name */
    private ByteBuffer[] f7374d;

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
                    mediaCodec.configure(aVar.f4095b, aVar.f4097d, aVar.f4098e, aVar.f4099f);
                    lo.a();
                    if (aVar.f4100g) {
                        if (yp.a >= 18) {
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
                    } catch (IOException | RuntimeException e2) {
                        r02 = surface;
                        e = e2;
                        if (r02 != 0) {
                            r02.release();
                        }
                        if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                        throw e;
                    }
                } catch (IOException e10) {
                    e = e10;
                } catch (RuntimeException e11) {
                    e = e11;
                }
            } catch (IOException | RuntimeException e12) {
                e = e12;
                mediaCodec = null;
            }
        }

        public MediaCodec b(cd.a aVar) {
            a1.a(aVar.a);
            String str = aVar.a.a;
            lo.a("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            lo.a();
            return createByCodecName;
        }
    }

    private rl(MediaCodec mediaCodec, Surface surface) {
        this.a = mediaCodec;
        this.f7372b = surface;
        if (yp.a < 21) {
            this.f7373c = mediaCodec.getInputBuffers();
            this.f7374d = mediaCodec.getOutputBuffers();
        }
    }

    @Override // com.applovin.impl.cd
    public void b() {
        this.a.flush();
    }

    @Override // com.applovin.impl.cd
    public boolean c() {
        return false;
    }

    @Override // com.applovin.impl.cd
    public int d() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // com.applovin.impl.cd
    public MediaFormat e() {
        return this.a.getOutputFormat();
    }

    @Override // com.applovin.impl.cd
    public int a(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && yp.a < 21) {
                this.f7374d = this.a.getOutputBuffers();
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.applovin.impl.cd
    public ByteBuffer b(int i10) {
        if (yp.a >= 21) {
            return this.a.getOutputBuffer(i10);
        }
        return ((ByteBuffer[]) yp.a((Object) this.f7374d))[i10];
    }

    @Override // com.applovin.impl.cd
    public void c(int i10) {
        this.a.setVideoScalingMode(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(cd.c cVar, MediaCodec mediaCodec, long j3, long j10) {
        cVar.a(this, j3, j10);
    }

    @Override // com.applovin.impl.cd
    public void a(int i10, int i11, int i12, long j3, int i13) {
        this.a.queueInputBuffer(i10, i11, i12, j3, i13);
    }

    @Override // com.applovin.impl.cd
    public void a(int i10, int i11, y4 y4Var, long j3, int i12) {
        this.a.queueSecureInputBuffer(i10, i11, y4Var.a(), j3, i12);
    }

    @Override // com.applovin.impl.cd
    public void a() {
        this.f7373c = null;
        this.f7374d = null;
        Surface surface = this.f7372b;
        if (surface != null) {
            surface.release();
        }
        this.a.release();
    }

    @Override // com.applovin.impl.cd
    public void a(int i10, long j3) {
        this.a.releaseOutputBuffer(i10, j3);
    }

    @Override // com.applovin.impl.cd
    public void a(int i10, boolean z10) {
        this.a.releaseOutputBuffer(i10, z10);
    }

    @Override // com.applovin.impl.cd
    public void a(cd.c cVar, Handler handler) {
        this.a.setOnFrameRenderedListener(new ot(this, cVar, 1), handler);
    }

    @Override // com.applovin.impl.cd
    public void a(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // com.applovin.impl.cd
    public void a(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // com.applovin.impl.cd
    public ByteBuffer a(int i10) {
        if (yp.a >= 21) {
            return this.a.getInputBuffer(i10);
        }
        return ((ByteBuffer[]) yp.a((Object) this.f7373c))[i10];
    }
}
