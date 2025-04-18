package u7;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public abstract class e0 {
    public static void a(AudioTrack audioTrack, @Nullable h0 h0Var) {
        AudioDeviceInfo audioDeviceInfo;
        if (h0Var == null) {
            audioDeviceInfo = null;
        } else {
            audioDeviceInfo = h0Var.a;
        }
        audioTrack.setPreferredDevice(audioDeviceInfo);
    }
}
