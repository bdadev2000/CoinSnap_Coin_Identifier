package z4;

import android.media.MediaPlayer;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28498b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f28499c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f28500d;

    public /* synthetic */ c(e eVar, boolean z10, int i10) {
        this.f28498b = i10;
        this.f28500d = eVar;
        this.f28499c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f28498b;
        e eVar = this.f28500d;
        boolean z10 = this.f28499c;
        switch (i10) {
            case 0:
                if (!eVar.qsH() && e.YFl(eVar) != null) {
                    try {
                        e.AlY(eVar, z10);
                        MediaPlayer mediaPlayer = ((g) e.YFl(eVar)).f28514i;
                        if (mediaPlayer != null) {
                            if (z10) {
                                mediaPlayer.setVolume(0.0f, 0.0f);
                            } else {
                                mediaPlayer.setVolume(1.0f, 1.0f);
                            }
                        }
                    } catch (Throwable unused) {
                        return;
                    }
                }
                return;
            default:
                if (e.YFl(eVar) != null) {
                    ((g) e.YFl(eVar)).f28513h = z10;
                    return;
                }
                return;
        }
    }
}
