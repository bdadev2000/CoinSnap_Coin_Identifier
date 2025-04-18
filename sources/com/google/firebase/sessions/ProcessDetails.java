package com.google.firebase.sessions;

import android.support.v4.media.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class ProcessDetails {
    private final int importance;
    private final boolean isDefaultProcess;
    private final int pid;

    @NotNull
    private final String processName;

    public ProcessDetails(@NotNull String str, int i2, int i3, boolean z2) {
        p0.a.s(str, "processName");
        this.processName = str;
        this.pid = i2;
        this.importance = i3;
        this.isDefaultProcess = z2;
    }

    public static /* synthetic */ ProcessDetails copy$default(ProcessDetails processDetails, String str, int i2, int i3, boolean z2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = processDetails.processName;
        }
        if ((i4 & 2) != 0) {
            i2 = processDetails.pid;
        }
        if ((i4 & 4) != 0) {
            i3 = processDetails.importance;
        }
        if ((i4 & 8) != 0) {
            z2 = processDetails.isDefaultProcess;
        }
        return processDetails.copy(str, i2, i3, z2);
    }

    @NotNull
    public final String component1() {
        return this.processName;
    }

    public final int component2() {
        return this.pid;
    }

    public final int component3() {
        return this.importance;
    }

    public final boolean component4() {
        return this.isDefaultProcess;
    }

    @NotNull
    public final ProcessDetails copy(@NotNull String str, int i2, int i3, boolean z2) {
        p0.a.s(str, "processName");
        return new ProcessDetails(str, i2, i3, z2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProcessDetails)) {
            return false;
        }
        ProcessDetails processDetails = (ProcessDetails) obj;
        return p0.a.g(this.processName, processDetails.processName) && this.pid == processDetails.pid && this.importance == processDetails.importance && this.isDefaultProcess == processDetails.isDefaultProcess;
    }

    public final int getImportance() {
        return this.importance;
    }

    public final int getPid() {
        return this.pid;
    }

    @NotNull
    public final String getProcessName() {
        return this.processName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int c2 = d.c(this.importance, d.c(this.pid, this.processName.hashCode() * 31, 31), 31);
        boolean z2 = this.isDefaultProcess;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        return c2 + i2;
    }

    public final boolean isDefaultProcess() {
        return this.isDefaultProcess;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails(processName=");
        sb.append(this.processName);
        sb.append(", pid=");
        sb.append(this.pid);
        sb.append(", importance=");
        sb.append(this.importance);
        sb.append(", isDefaultProcess=");
        return d.s(sb, this.isDefaultProcess, ')');
    }
}
