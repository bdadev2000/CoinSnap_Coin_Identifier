package com.mbridge.msdk.thrid.okhttp.internal.http2;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class Settings {
    static final int COUNT = 10;
    static final int DEFAULT_INITIAL_WINDOW_SIZE = 65535;
    static final int ENABLE_PUSH = 2;
    static final int HEADER_TABLE_SIZE = 1;
    static final int INITIAL_WINDOW_SIZE = 7;
    static final int MAX_CONCURRENT_STREAMS = 4;
    static final int MAX_FRAME_SIZE = 5;
    static final int MAX_HEADER_LIST_SIZE = 6;
    private int set;
    private final int[] values = new int[10];

    public void clear() {
        this.set = 0;
        Arrays.fill(this.values, 0);
    }

    public int get(int i9) {
        return this.values[i9];
    }

    public boolean getEnablePush(boolean z8) {
        int i9;
        if ((this.set & 4) != 0) {
            i9 = this.values[2];
        } else if (z8) {
            i9 = 1;
        } else {
            i9 = 0;
        }
        if (i9 != 1) {
            return false;
        }
        return true;
    }

    public int getHeaderTableSize() {
        if ((this.set & 2) != 0) {
            return this.values[1];
        }
        return -1;
    }

    public int getInitialWindowSize() {
        if ((this.set & 128) != 0) {
            return this.values[7];
        }
        return DEFAULT_INITIAL_WINDOW_SIZE;
    }

    public int getMaxConcurrentStreams(int i9) {
        if ((this.set & 16) != 0) {
            return this.values[4];
        }
        return i9;
    }

    public int getMaxFrameSize(int i9) {
        if ((this.set & 32) != 0) {
            return this.values[5];
        }
        return i9;
    }

    public int getMaxHeaderListSize(int i9) {
        if ((this.set & 64) != 0) {
            return this.values[6];
        }
        return i9;
    }

    public boolean isSet(int i9) {
        if (((1 << i9) & this.set) != 0) {
            return true;
        }
        return false;
    }

    public void merge(Settings settings) {
        for (int i9 = 0; i9 < 10; i9++) {
            if (settings.isSet(i9)) {
                set(i9, settings.get(i9));
            }
        }
    }

    public Settings set(int i9, int i10) {
        if (i9 >= 0) {
            int[] iArr = this.values;
            if (i9 < iArr.length) {
                this.set = (1 << i9) | this.set;
                iArr[i9] = i10;
            }
        }
        return this;
    }

    public int size() {
        return Integer.bitCount(this.set);
    }
}
