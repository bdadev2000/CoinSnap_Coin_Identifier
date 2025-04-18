package com.applovin.impl;

import android.media.MediaCodec;
import com.applovin.impl.hd;

/* loaded from: classes.dex */
public final /* synthetic */ class nt implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25789a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hd.c f25790b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hd f25791c;

    public /* synthetic */ nt(hd hdVar, hd.c cVar, int i2) {
        this.f25789a = i2;
        this.f25791c = hdVar;
        this.f25790b = cVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j2, long j3) {
        int i2 = this.f25789a;
        hd hdVar = this.f25791c;
        switch (i2) {
            case 0:
                g1.a((g1) hdVar, this.f25790b, mediaCodec, j2, j3);
                return;
            default:
                ((ul) hdVar).a(this.f25790b, mediaCodec, j2, j3);
                return;
        }
    }
}
