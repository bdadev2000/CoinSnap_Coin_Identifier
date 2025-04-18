package com.facebook;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class ProgressNoopOutputStream extends OutputStream implements RequestOutputStream {

    @Nullable
    private final Handler callbackHandler;

    @Nullable
    private GraphRequest currentRequest;

    @Nullable
    private RequestProgress currentRequestProgress;
    private int maxProgress;

    @NotNull
    private final Map<GraphRequest, RequestProgress> progressMap = new HashMap();

    public ProgressNoopOutputStream(@Nullable Handler handler) {
        this.callbackHandler = handler;
    }

    public final void addProgress(long j2) {
        GraphRequest graphRequest = this.currentRequest;
        if (graphRequest == null) {
            return;
        }
        if (this.currentRequestProgress == null) {
            RequestProgress requestProgress = new RequestProgress(this.callbackHandler, graphRequest);
            this.currentRequestProgress = requestProgress;
            this.progressMap.put(graphRequest, requestProgress);
        }
        RequestProgress requestProgress2 = this.currentRequestProgress;
        if (requestProgress2 != null) {
            requestProgress2.addToMax(j2);
        }
        this.maxProgress += (int) j2;
    }

    public final int getMaxProgress() {
        return this.maxProgress;
    }

    @NotNull
    public final Map<GraphRequest, RequestProgress> getProgressMap() {
        return this.progressMap;
    }

    @Override // com.facebook.RequestOutputStream
    public void setCurrentRequest(@Nullable GraphRequest graphRequest) {
        this.currentRequest = graphRequest;
        this.currentRequestProgress = graphRequest != null ? this.progressMap.get(graphRequest) : null;
    }

    @Override // java.io.OutputStream
    public void write(@NotNull byte[] bArr) {
        p0.a.s(bArr, "buffer");
        addProgress(bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(@NotNull byte[] bArr, int i2, int i3) {
        p0.a.s(bArr, "buffer");
        addProgress(i3);
    }

    @Override // java.io.OutputStream
    public void write(int i2) {
        addProgress(1L);
    }
}
