package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import com.google.android.exoplayer2.util.MimeTypes;

/* loaded from: classes.dex */
public class CodecStuckOnFlushQuirk implements Quirk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean load() {
        return isNokia1();
    }

    private static boolean isNokia1() {
        return "Nokia".equalsIgnoreCase(Build.BRAND) && "Nokia 1".equalsIgnoreCase(Build.MODEL);
    }

    public boolean isProblematicMimeType(String str) {
        return MimeTypes.VIDEO_MP4V.equals(str);
    }
}
