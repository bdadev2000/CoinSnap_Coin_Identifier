package k8;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public final class g extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f20307b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f20308c;

    /* renamed from: h, reason: collision with root package name */
    public MediaFormat f20313h;

    /* renamed from: i, reason: collision with root package name */
    public MediaFormat f20314i;

    /* renamed from: j, reason: collision with root package name */
    public MediaCodec.CodecException f20315j;

    /* renamed from: k, reason: collision with root package name */
    public long f20316k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f20317l;

    /* renamed from: m, reason: collision with root package name */
    public IllegalStateException f20318m;
    public final Object a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final g8.f f20309d = new g8.f();

    /* renamed from: e, reason: collision with root package name */
    public final g8.f f20310e = new g8.f();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f20311f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f20312g = new ArrayDeque();

    public g(HandlerThread handlerThread) {
        this.f20307b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f20312g;
        if (!arrayDeque.isEmpty()) {
            this.f20314i = (MediaFormat) arrayDeque.getLast();
        }
        this.f20309d.c();
        this.f20310e.c();
        this.f20311f.clear();
        arrayDeque.clear();
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.a) {
            this.f20315j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.a) {
            this.f20309d.b(i10);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.a) {
            MediaFormat mediaFormat = this.f20314i;
            if (mediaFormat != null) {
                this.f20310e.b(-2);
                this.f20312g.add(mediaFormat);
                this.f20314i = null;
            }
            this.f20310e.b(i10);
            this.f20311f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.a) {
            this.f20310e.b(-2);
            this.f20312g.add(mediaFormat);
            this.f20314i = null;
        }
    }
}
