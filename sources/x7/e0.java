package x7;

import android.media.MediaDrm;
import android.media.metrics.LogSessionId;

/* loaded from: classes3.dex */
public abstract class e0 {
    public static boolean a(MediaDrm mediaDrm, String str) {
        boolean requiresSecureDecoder;
        requiresSecureDecoder = mediaDrm.requiresSecureDecoder(str);
        return requiresSecureDecoder;
    }

    public static void b(MediaDrm mediaDrm, byte[] bArr, t7.x xVar) {
        LogSessionId logSessionId;
        boolean equals;
        MediaDrm.PlaybackComponent playbackComponent;
        t7.w wVar = xVar.a;
        wVar.getClass();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        LogSessionId logSessionId2 = wVar.a;
        equals = logSessionId2.equals(logSessionId);
        if (!equals) {
            playbackComponent = mediaDrm.getPlaybackComponent(bArr);
            playbackComponent.getClass();
            u7.f0.b(playbackComponent).setLogSessionId(logSessionId2);
        }
    }
}
