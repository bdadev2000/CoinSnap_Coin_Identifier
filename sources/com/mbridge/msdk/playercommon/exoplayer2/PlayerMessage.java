package com.mbridge.msdk.playercommon.exoplayer2;

import android.os.Handler;
import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.util.concurrent.TimeoutException;

/* loaded from: classes4.dex */
public final class PlayerMessage {
    private Handler handler;
    private boolean isCanceled;
    private boolean isDelivered;
    private boolean isProcessed;
    private boolean isSent;
    private Object payload;
    private final Sender sender;
    private final Target target;
    private final Timeline timeline;
    private int type;
    private int windowIndex;
    private long positionMs = C.TIME_UNSET;
    private boolean deleteAfterDelivery = true;

    /* loaded from: classes4.dex */
    public interface Sender {
        void sendMessage(PlayerMessage playerMessage);
    }

    /* loaded from: classes4.dex */
    public interface Target {
        void handleMessage(int i10, Object obj) throws ExoPlaybackException;
    }

    public PlayerMessage(Sender sender, Target target, Timeline timeline, int i10, Handler handler) {
        this.sender = sender;
        this.target = target;
        this.timeline = timeline;
        this.handler = handler;
        this.windowIndex = i10;
    }

    public final synchronized boolean blockUntilDelivered() throws InterruptedException, TimeoutException {
        boolean z10;
        boolean z11;
        Assertions.checkState(this.isSent);
        if (this.handler.getLooper().getThread() != Thread.currentThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Assertions.checkState(z10);
        long j3 = 500;
        long elapsedRealtime = SystemClock.elapsedRealtime() + 500;
        while (true) {
            z11 = this.isProcessed;
            if (z11 || j3 <= 0) {
                break;
            }
            wait(j3);
            j3 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z11) {
        } else {
            throw new TimeoutException("Message delivery time out");
        }
        return this.isDelivered;
    }

    public final synchronized PlayerMessage cancel() {
        Assertions.checkState(this.isSent);
        this.isCanceled = true;
        markAsProcessed(false);
        return this;
    }

    public final boolean getDeleteAfterDelivery() {
        return this.deleteAfterDelivery;
    }

    public final Handler getHandler() {
        return this.handler;
    }

    public final Object getPayload() {
        return this.payload;
    }

    public final long getPositionMs() {
        return this.positionMs;
    }

    public final Target getTarget() {
        return this.target;
    }

    public final Timeline getTimeline() {
        return this.timeline;
    }

    public final int getType() {
        return this.type;
    }

    public final int getWindowIndex() {
        return this.windowIndex;
    }

    public final synchronized boolean isCanceled() {
        return this.isCanceled;
    }

    public final synchronized void markAsProcessed(boolean z10) {
        this.isDelivered = z10 | this.isDelivered;
        this.isProcessed = true;
        notifyAll();
    }

    public final PlayerMessage send() {
        Assertions.checkState(!this.isSent);
        if (this.positionMs == C.TIME_UNSET) {
            Assertions.checkArgument(this.deleteAfterDelivery);
        }
        this.isSent = true;
        this.sender.sendMessage(this);
        return this;
    }

    public final PlayerMessage setDeleteAfterDelivery(boolean z10) {
        Assertions.checkState(!this.isSent);
        this.deleteAfterDelivery = z10;
        return this;
    }

    public final PlayerMessage setHandler(Handler handler) {
        Assertions.checkState(!this.isSent);
        this.handler = handler;
        return this;
    }

    public final PlayerMessage setPayload(Object obj) {
        Assertions.checkState(!this.isSent);
        this.payload = obj;
        return this;
    }

    public final PlayerMessage setPosition(long j3) {
        Assertions.checkState(!this.isSent);
        this.positionMs = j3;
        return this;
    }

    public final PlayerMessage setType(int i10) {
        Assertions.checkState(!this.isSent);
        this.type = i10;
        return this;
    }

    public final PlayerMessage setPosition(int i10, long j3) {
        Assertions.checkState(!this.isSent);
        Assertions.checkArgument(j3 != C.TIME_UNSET);
        if (i10 >= 0 && (this.timeline.isEmpty() || i10 < this.timeline.getWindowCount())) {
            this.windowIndex = i10;
            this.positionMs = j3;
            return this;
        }
        throw new IllegalSeekPositionException(this.timeline, i10, j3);
    }
}
