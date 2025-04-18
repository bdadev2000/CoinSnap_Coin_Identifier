package okhttp3.internal.http2;

import com.google.android.gms.common.api.Api;
import e0.q;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import p0.a;

/* loaded from: classes.dex */
public final class Settings {
    public static final int COUNT = 10;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_INITIAL_WINDOW_SIZE = 65535;
    public static final int ENABLE_PUSH = 2;
    public static final int HEADER_TABLE_SIZE = 1;
    public static final int INITIAL_WINDOW_SIZE = 7;
    public static final int MAX_CONCURRENT_STREAMS = 4;
    public static final int MAX_FRAME_SIZE = 5;
    public static final int MAX_HEADER_LIST_SIZE = 6;
    private int set;

    @NotNull
    private final int[] values = new int[10];

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public final void clear() {
        this.set = 0;
        q.X(this.values, 0, 0, 6);
    }

    public final int get(int i2) {
        return this.values[i2];
    }

    public final boolean getEnablePush(boolean z2) {
        return (this.set & 4) != 0 ? this.values[2] == 1 : z2;
    }

    public final int getHeaderTableSize() {
        if ((this.set & 2) != 0) {
            return this.values[1];
        }
        return -1;
    }

    public final int getInitialWindowSize() {
        return (this.set & 128) != 0 ? this.values[7] : DEFAULT_INITIAL_WINDOW_SIZE;
    }

    public final int getMaxConcurrentStreams() {
        return (this.set & 16) != 0 ? this.values[4] : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public final int getMaxFrameSize(int i2) {
        return (this.set & 32) != 0 ? this.values[5] : i2;
    }

    public final int getMaxHeaderListSize(int i2) {
        return (this.set & 64) != 0 ? this.values[6] : i2;
    }

    public final boolean isSet(int i2) {
        return ((1 << i2) & this.set) != 0;
    }

    public final void merge(@NotNull Settings settings) {
        a.s(settings, "other");
        for (int i2 = 0; i2 < 10; i2++) {
            if (settings.isSet(i2)) {
                set(i2, settings.get(i2));
            }
        }
    }

    @NotNull
    public final Settings set(int i2, int i3) {
        if (i2 >= 0) {
            int[] iArr = this.values;
            if (i2 < iArr.length) {
                this.set = (1 << i2) | this.set;
                iArr[i2] = i3;
            }
        }
        return this;
    }

    public final int size() {
        return Integer.bitCount(this.set);
    }
}
