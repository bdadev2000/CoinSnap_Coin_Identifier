package k8;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public interface l {
    void a(o9.g gVar, Handler handler);

    MediaFormat b();

    ByteBuffer c(int i10);

    void d(Surface surface);

    void e(int i10, w7.d dVar, long j3);

    void f();

    void flush();

    void g(Bundle bundle);

    void h(int i10, long j3);

    int i();

    int j(MediaCodec.BufferInfo bufferInfo);

    void k(int i10, boolean z10);

    ByteBuffer l(int i10);

    void m(int i10, int i11, long j3, int i12);

    void release();

    void setVideoScalingMode(int i10);
}
