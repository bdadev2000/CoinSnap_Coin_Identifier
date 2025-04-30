package W6;

import G7.j;
import android.media.MediaPlayer;
import android.view.KeyEvent;
import android.widget.VideoView;
import com.tools.arruler.ui.component.splash.SplashActivity;
import com.tools.arruler.ui.component.tutorial.ArTutorialActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f3624c;

    public /* synthetic */ a(KeyEvent.Callback callback, int i9) {
        this.b = i9;
        this.f3624c = callback;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        KeyEvent.Callback callback = this.f3624c;
        switch (this.b) {
            case 0:
                int i9 = SplashActivity.l;
                VideoView videoView = (VideoView) callback;
                j.e(videoView, "$this_apply");
                float videoWidth = (mediaPlayer.getVideoWidth() / mediaPlayer.getVideoHeight()) / (videoView.getWidth() / videoView.getHeight());
                if (videoView.getScaleX() >= 1.0f) {
                    videoView.setScaleX(videoWidth);
                } else {
                    videoView.setScaleY(1.0f / videoView.getScaleX());
                }
                mediaPlayer.setLooping(true);
                mediaPlayer.start();
                return;
            default:
                int i10 = ArTutorialActivity.f19737g;
                final ArTutorialActivity arTutorialActivity = (ArTutorialActivity) callback;
                j.e(arTutorialActivity, "this$0");
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: Z6.a
                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public final void onCompletion(MediaPlayer mediaPlayer2) {
                        int i11 = ArTutorialActivity.f19737g;
                        ArTutorialActivity arTutorialActivity2 = ArTutorialActivity.this;
                        j.e(arTutorialActivity2, "this$0");
                        arTutorialActivity2.f19738f = 0;
                        mediaPlayer2.start();
                    }
                });
                return;
        }
    }
}
