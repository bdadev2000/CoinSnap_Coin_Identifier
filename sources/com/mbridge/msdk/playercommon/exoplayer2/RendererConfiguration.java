package com.mbridge.msdk.playercommon.exoplayer2;

/* loaded from: classes3.dex */
public final class RendererConfiguration {
    public static final RendererConfiguration DEFAULT = new RendererConfiguration(0);
    public final int tunnelingAudioSessionId;

    public RendererConfiguration(int i9) {
        this.tunnelingAudioSessionId = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && RendererConfiguration.class == obj.getClass() && this.tunnelingAudioSessionId == ((RendererConfiguration) obj).tunnelingAudioSessionId) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.tunnelingAudioSessionId;
    }
}
