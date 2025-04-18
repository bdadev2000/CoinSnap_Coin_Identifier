package org.jacoco.core.data;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ExecutionData {
    private final long id;
    private final String name;
    private final boolean[] probes;

    public ExecutionData(long j2, String str, boolean[] zArr) {
        this.id = j2;
        this.name = str;
        this.probes = zArr;
    }

    public void assertCompatibility(long j2, String str, int i2) throws IllegalStateException {
        if (this.id != j2) {
            throw new IllegalStateException(String.format("Different ids (%016x and %016x).", Long.valueOf(this.id), Long.valueOf(j2)));
        }
        if (!this.name.equals(str)) {
            throw new IllegalStateException(String.format("Different class names %s and %s for id %016x.", this.name, str, Long.valueOf(j2)));
        }
        if (this.probes.length != i2) {
            throw new IllegalStateException(String.format("Incompatible execution data for class %s with id %016x.", str, Long.valueOf(j2)));
        }
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public boolean[] getProbes() {
        return this.probes;
    }

    public boolean hasHits() {
        for (boolean z2 : this.probes) {
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public void merge(ExecutionData executionData) {
        merge(executionData, true);
    }

    public void reset() {
        Arrays.fill(this.probes, false);
    }

    public String toString() {
        return String.format("ExecutionData[name=%s, id=%016x]", this.name, Long.valueOf(this.id));
    }

    public ExecutionData(long j2, String str, int i2) {
        this.id = j2;
        this.name = str;
        this.probes = new boolean[i2];
    }

    public void merge(ExecutionData executionData, boolean z2) {
        assertCompatibility(executionData.getId(), executionData.getName(), executionData.getProbes().length);
        boolean[] probes = executionData.getProbes();
        int i2 = 0;
        while (true) {
            boolean[] zArr = this.probes;
            if (i2 >= zArr.length) {
                return;
            }
            if (probes[i2]) {
                zArr[i2] = z2;
            }
            i2++;
        }
    }
}
