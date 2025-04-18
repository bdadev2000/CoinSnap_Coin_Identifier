package u7;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioManager;
import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes3.dex */
public abstract class i {
    public static void a(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
        AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        audioManager.getClass();
        audioManager.registerAudioDeviceCallback(audioDeviceCallback, handler);
    }

    public static void b(Context context, AudioDeviceCallback audioDeviceCallback) {
        AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        audioManager.getClass();
        audioManager.unregisterAudioDeviceCallback(audioDeviceCallback);
    }
}
