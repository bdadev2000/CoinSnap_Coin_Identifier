package com.mbridge.msdk.playercommon.exoplayer2.extractor;

import a4.j;

/* loaded from: classes4.dex */
public final class SeekPoint {
    public static final SeekPoint START = new SeekPoint(0, 0);
    public final long position;
    public final long timeUs;

    public SeekPoint(long j3, long j10) {
        this.timeUs = j3;
        this.position = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SeekPoint.class != obj.getClass()) {
            return false;
        }
        SeekPoint seekPoint = (SeekPoint) obj;
        if (this.timeUs == seekPoint.timeUs && this.position == seekPoint.position) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.timeUs) * 31) + ((int) this.position);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.timeUs);
        sb2.append(", position=");
        return j.j(sb2, this.position, "]");
    }
}
