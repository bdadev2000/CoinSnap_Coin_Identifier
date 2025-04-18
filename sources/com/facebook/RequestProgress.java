package com.facebook;

import android.os.Handler;
import com.facebook.GraphRequest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class RequestProgress {

    @Nullable
    private final Handler callbackHandler;
    private long lastReportedProgress;
    private long maxProgress;
    private long progress;

    @NotNull
    private final GraphRequest request;
    private final long threshold;

    public RequestProgress(@Nullable Handler handler, @NotNull GraphRequest graphRequest) {
        p0.a.s(graphRequest, "request");
        this.callbackHandler = handler;
        this.request = graphRequest;
        this.threshold = FacebookSdk.getOnProgressThreshold();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reportProgress$lambda-0, reason: not valid java name */
    public static final void m431reportProgress$lambda0(GraphRequest.Callback callback, long j2, long j3) {
        ((GraphRequest.OnProgressCallback) callback).onProgress(j2, j3);
    }

    public final void addProgress(long j2) {
        long j3 = this.progress + j2;
        this.progress = j3;
        if (j3 >= this.lastReportedProgress + this.threshold || j3 >= this.maxProgress) {
            reportProgress();
        }
    }

    public final void addToMax(long j2) {
        this.maxProgress += j2;
    }

    public final long getMaxProgress() {
        return this.maxProgress;
    }

    public final long getProgress() {
        return this.progress;
    }

    public final void reportProgress() {
        if (this.progress > this.lastReportedProgress) {
            final GraphRequest.Callback callback = this.request.getCallback();
            final long j2 = this.maxProgress;
            if (j2 <= 0 || !(callback instanceof GraphRequest.OnProgressCallback)) {
                return;
            }
            final long j3 = this.progress;
            Handler handler = this.callbackHandler;
            if ((handler == null ? null : Boolean.valueOf(handler.post(new Runnable() { // from class: com.facebook.h
                @Override // java.lang.Runnable
                public final void run() {
                    RequestProgress.m431reportProgress$lambda0(GraphRequest.Callback.this, j3, j2);
                }
            }))) == null) {
                ((GraphRequest.OnProgressCallback) callback).onProgress(j3, j2);
            }
            this.lastReportedProgress = this.progress;
        }
    }
}
