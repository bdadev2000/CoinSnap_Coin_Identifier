package u7;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import com.google.common.collect.b1;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes3.dex */
public abstract class f {
    private static final b1 a() {
        com.google.common.collect.z0 z0Var = new com.google.common.collect.z0();
        z0Var.z(8, 7);
        int i10 = n9.h0.a;
        if (i10 >= 31) {
            z0Var.z(26, 27);
        }
        if (i10 >= 33) {
            z0Var.d(30);
        }
        return z0Var.A();
    }

    public static final boolean b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        audioManager.getClass();
        AudioDeviceInfo[] devices = audioManager.getDevices(2);
        b1 a = a();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (a.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return true;
            }
        }
        return false;
    }
}
