package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class PriorityDataSource implements DataSource {
    private final int priority;
    private final PriorityTaskManager priorityTaskManager;
    private final DataSource upstream;

    public PriorityDataSource(DataSource dataSource, PriorityTaskManager priorityTaskManager, int i10) {
        this.upstream = (DataSource) Assertions.checkNotNull(dataSource);
        this.priorityTaskManager = (PriorityTaskManager) Assertions.checkNotNull(priorityTaskManager);
        this.priority = i10;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final void close() throws IOException {
        this.upstream.close();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final Uri getUri() {
        return this.upstream.getUri();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final long open(DataSpec dataSpec) throws IOException {
        this.priorityTaskManager.proceedOrThrow(this.priority);
        return this.upstream.open(dataSpec);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        this.priorityTaskManager.proceedOrThrow(this.priority);
        return this.upstream.read(bArr, i10, i11);
    }
}
