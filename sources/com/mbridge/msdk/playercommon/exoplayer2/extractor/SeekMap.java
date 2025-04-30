package com.mbridge.msdk.playercommon.exoplayer2.extractor;

import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public interface SeekMap {

    /* loaded from: classes3.dex */
    public static final class SeekPoints {
        public final SeekPoint first;
        public final SeekPoint second;

        public SeekPoints(SeekPoint seekPoint) {
            this(seekPoint, seekPoint);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SeekPoints.class != obj.getClass()) {
                return false;
            }
            SeekPoints seekPoints = (SeekPoints) obj;
            if (this.first.equals(seekPoints.first) && this.second.equals(seekPoints.second)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.second.hashCode() + (this.first.hashCode() * 31);
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("[");
            sb.append(this.first);
            if (this.first.equals(this.second)) {
                str = "";
            } else {
                str = ", " + this.second;
            }
            return AbstractC2914a.h(sb, str, "]");
        }

        public SeekPoints(SeekPoint seekPoint, SeekPoint seekPoint2) {
            this.first = (SeekPoint) Assertions.checkNotNull(seekPoint);
            this.second = (SeekPoint) Assertions.checkNotNull(seekPoint2);
        }
    }

    /* loaded from: classes3.dex */
    public static final class Unseekable implements SeekMap {
        private final long durationUs;
        private final SeekPoints startSeekPoints;

        public Unseekable(long j7) {
            this(j7, 0L);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
        public final long getDurationUs() {
            return this.durationUs;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
        public final SeekPoints getSeekPoints(long j7) {
            return this.startSeekPoints;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
        public final boolean isSeekable() {
            return false;
        }

        public Unseekable(long j7, long j9) {
            this.durationUs = j7;
            this.startSeekPoints = new SeekPoints(j9 == 0 ? SeekPoint.START : new SeekPoint(0L, j9));
        }
    }

    long getDurationUs();

    SeekPoints getSeekPoints(long j7);

    boolean isSeekable();
}
