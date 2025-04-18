package u7;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public abstract class t0 {
    public static void a(w wVar, @Nullable Object obj) {
        h0 h0Var;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
        r0 r0Var = (r0) wVar;
        if (audioDeviceInfo == null) {
            h0Var = null;
        } else {
            r0Var.getClass();
            h0Var = new h0(audioDeviceInfo);
        }
        r0Var.Z = h0Var;
        AudioTrack audioTrack = r0Var.f25634v;
        if (audioTrack != null) {
            e0.a(audioTrack, h0Var);
        }
    }
}
