package k8;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
import n9.h0;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o9.g f20282b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f20283c;

    public /* synthetic */ a(l lVar, o9.g gVar, int i10) {
        this.a = i10;
        this.f20283c = lVar;
        this.f20282b = gVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j3, long j10) {
        o9.g gVar = this.f20282b;
        int i10 = this.a;
        l lVar = this.f20283c;
        switch (i10) {
            case 0:
                ((c) lVar).getClass();
                gVar.getClass();
                if (h0.a < 30) {
                    Handler handler = gVar.f23201b;
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j3 >> 32), (int) j3));
                    return;
                } else {
                    gVar.a(j3);
                    return;
                }
            default:
                ((a0) lVar).getClass();
                gVar.getClass();
                if (h0.a < 30) {
                    Handler handler2 = gVar.f23201b;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j3 >> 32), (int) j3));
                    return;
                } else {
                    gVar.a(j3);
                    return;
                }
        }
    }
}
