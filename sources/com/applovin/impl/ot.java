package com.applovin.impl;

import android.media.MediaCodec;
import com.applovin.impl.cd;

/* loaded from: classes.dex */
public final /* synthetic */ class ot implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cd.c f6879b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cd f6880c;

    public /* synthetic */ ot(cd cdVar, cd.c cVar, int i10) {
        this.a = i10;
        this.f6880c = cdVar;
        this.f6879b = cVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j3, long j10) {
        int i10 = this.a;
        cd cdVar = this.f6880c;
        switch (i10) {
            case 0:
                f1.a((f1) cdVar, this.f6879b, mediaCodec, j3, j10);
                return;
            default:
                ((rl) cdVar).a(this.f6879b, mediaCodec, j3, j10);
                return;
        }
    }
}
