package com.mbridge.msdk.playercommon.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes4.dex */
final class SystemHandlerWrapper implements HandlerWrapper {
    private final Handler handler;

    public SystemHandlerWrapper(Handler handler) {
        this.handler = handler;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final Looper getLooper() {
        return this.handler.getLooper();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final Message obtainMessage(int i10) {
        return this.handler.obtainMessage(i10);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final boolean post(Runnable runnable) {
        return this.handler.post(runnable);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final boolean postDelayed(Runnable runnable, long j3) {
        return this.handler.postDelayed(runnable, j3);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final void removeCallbacksAndMessages(Object obj) {
        this.handler.removeCallbacksAndMessages(obj);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final void removeMessages(int i10) {
        this.handler.removeMessages(i10);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final boolean sendEmptyMessage(int i10) {
        return this.handler.sendEmptyMessage(i10);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final boolean sendEmptyMessageAtTime(int i10, long j3) {
        return this.handler.sendEmptyMessageAtTime(i10, j3);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final Message obtainMessage(int i10, Object obj) {
        return this.handler.obtainMessage(i10, obj);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final Message obtainMessage(int i10, int i11, int i12) {
        return this.handler.obtainMessage(i10, i11, i12);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final Message obtainMessage(int i10, int i11, int i12, Object obj) {
        return this.handler.obtainMessage(i10, i11, i12, obj);
    }
}
