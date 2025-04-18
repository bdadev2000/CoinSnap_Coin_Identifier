package com.mbridge.msdk.playercommon.exoplayer2.audio;

import android.media.AudioAttributes;

/* loaded from: classes4.dex */
public final class AudioAttributes {
    public static final AudioAttributes DEFAULT = new Builder().build();
    private android.media.AudioAttributes audioAttributesV21;
    public final int contentType;
    public final int flags;
    public final int usage;

    /* loaded from: classes4.dex */
    public static final class Builder {
        private int contentType = 0;
        private int flags = 0;
        private int usage = 1;

        public final AudioAttributes build() {
            return new AudioAttributes(this.contentType, this.flags, this.usage);
        }

        public final Builder setContentType(int i10) {
            this.contentType = i10;
            return this;
        }

        public final Builder setFlags(int i10) {
            this.flags = i10;
            return this;
        }

        public final Builder setUsage(int i10) {
            this.usage = i10;
            return this;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AudioAttributes.class != obj.getClass()) {
            return false;
        }
        AudioAttributes audioAttributes = (AudioAttributes) obj;
        if (this.contentType == audioAttributes.contentType && this.flags == audioAttributes.flags && this.usage == audioAttributes.usage) {
            return true;
        }
        return false;
    }

    public final android.media.AudioAttributes getAudioAttributesV21() {
        if (this.audioAttributesV21 == null) {
            this.audioAttributesV21 = new AudioAttributes.Builder().setContentType(this.contentType).setFlags(this.flags).setUsage(this.usage).build();
        }
        return this.audioAttributesV21;
    }

    public final int hashCode() {
        return ((((527 + this.contentType) * 31) + this.flags) * 31) + this.usage;
    }

    private AudioAttributes(int i10, int i11, int i12) {
        this.contentType = i10;
        this.flags = i11;
        this.usage = i12;
    }
}
