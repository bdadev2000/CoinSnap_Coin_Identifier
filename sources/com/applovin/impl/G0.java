package com.applovin.impl;

import android.media.MediaCodec;
import com.applovin.impl.cd;

/* loaded from: classes.dex */
public final /* synthetic */ class G0 implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6394a;
    public final /* synthetic */ cd.c b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cd f6395c;

    public /* synthetic */ G0(cd cdVar, cd.c cVar, int i9) {
        this.f6394a = i9;
        this.f6395c = cdVar;
        this.b = cVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j7, long j9) {
        switch (this.f6394a) {
            case 0:
                C0694f1.a((C0694f1) this.f6395c, this.b, mediaCodec, j7, j9);
                return;
            default:
                ((rl) this.f6395c).a(this.b, mediaCodec, j7, j9);
                return;
        }
    }
}
