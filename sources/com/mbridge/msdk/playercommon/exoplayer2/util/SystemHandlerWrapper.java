package com.mbridge.msdk.playercommon.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes3.dex */
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
    public final Message obtainMessage(int i9) {
        return this.handler.obtainMessage(i9);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final boolean post(Runnable runnable) {
        return this.handler.post(runnable);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final boolean postDelayed(Runnable runnable, long j7) {
        return this.handler.postDelayed(runnable, j7);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final void removeCallbacksAndMessages(Object obj) {
        this.handler.removeCallbacksAndMessages(obj);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final void removeMessages(int i9) {
        this.handler.removeMessages(i9);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final boolean sendEmptyMessage(int i9) {
        return this.handler.sendEmptyMessage(i9);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final boolean sendEmptyMessageAtTime(int i9, long j7) {
        return this.handler.sendEmptyMessageAtTime(i9, j7);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final Message obtainMessage(int i9, Object obj) {
        return this.handler.obtainMessage(i9, obj);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final Message obtainMessage(int i9, int i10, int i11) {
        return this.handler.obtainMessage(i9, i10, i11);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final Message obtainMessage(int i9, int i10, int i11, Object obj) {
        return this.handler.obtainMessage(i9, i10, i11, obj);
    }
}
