package s7;

import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes3.dex */
public final class c implements AudioManager.OnAudioFocusChangeListener {
    public final Handler a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f24305b;

    public c(e eVar, Handler handler) {
        this.f24305b = eVar;
        this.a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        this.a.post(new f0.m(i10, 4, this));
    }
}
