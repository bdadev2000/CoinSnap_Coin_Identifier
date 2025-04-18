package com.mbridge.msdk.playercommon.exoplayer2.extractor;

import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import vd.e;

/* loaded from: classes4.dex */
public interface SeekMap {

    /* loaded from: classes4.dex */
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
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(this.first);
            if (this.first.equals(this.second)) {
                str = "";
            } else {
                str = ", " + this.second;
            }
            return e.h(sb2, str, "]");
        }

        public SeekPoints(SeekPoint seekPoint, SeekPoint seekPoint2) {
            this.first = (SeekPoint) Assertions.checkNotNull(seekPoint);
            this.second = (SeekPoint) Assertions.checkNotNull(seekPoint2);
        }
    }

    /* loaded from: classes4.dex */
    public static final class Unseekable implements SeekMap {
        private final long durationUs;
        private final SeekPoints startSeekPoints;

        public Unseekable(long j3) {
            this(j3, 0L);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
        public final long getDurationUs() {
            return this.durationUs;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
        public final SeekPoints getSeekPoints(long j3) {
            return this.startSeekPoints;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
        public final boolean isSeekable() {
            return false;
        }

        public Unseekable(long j3, long j10) {
            this.durationUs = j3;
            this.startSeekPoints = new SeekPoints(j10 == 0 ? SeekPoint.START : new SeekPoint(0L, j10));
        }
    }

    long getDurationUs();

    SeekPoints getSeekPoints(long j3);

    boolean isSeekable();
}
