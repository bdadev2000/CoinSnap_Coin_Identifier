package u7;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* loaded from: classes3.dex */
public final class j extends AudioDeviceCallback {
    public final /* synthetic */ l a;

    public j(l lVar) {
        this.a = lVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        l lVar = this.a;
        l.a(lVar, h.a(lVar.a));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        l lVar = this.a;
        l.a(lVar, h.a(lVar.a));
    }
}
