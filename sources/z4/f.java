package z4;

import android.media.MediaPlayer;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class f implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f28506b;

    public f(g gVar) {
        this.f28506b = new WeakReference(gVar);
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
        k kVar;
        try {
            g gVar = (g) this.f28506b.get();
            if (gVar != null && (kVar = gVar.f28508c) != null) {
                kVar.YFl(gVar, i10);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        j jVar;
        try {
            g gVar = (g) this.f28506b.get();
            if (gVar != null && (jVar = gVar.f28507b) != null) {
                jVar.YFl(gVar);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001b A[RETURN] */
    @Override // android.media.MediaPlayer.OnErrorListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onError(android.media.MediaPlayer r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 0
            java.lang.ref.WeakReference r0 = r3.f28506b     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L1c
            z4.g r0 = (z4.g) r0     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1c
            r1 = 1
            z4.l r2 = r0.f28511f     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L18
            boolean r5 = r2.YFl(r0, r5, r6)     // Catch: java.lang.Throwable -> L18
            if (r5 == 0) goto L18
            r5 = r1
            goto L19
        L18:
            r5 = r4
        L19:
            if (r5 == 0) goto L1c
            return r1
        L1c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.f.onError(android.media.MediaPlayer, int, int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001b A[RETURN] */
    @Override // android.media.MediaPlayer.OnInfoListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInfo(android.media.MediaPlayer r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 0
            java.lang.ref.WeakReference r0 = r3.f28506b     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L1c
            z4.g r0 = (z4.g) r0     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1c
            r1 = 1
            z4.h r2 = r0.f28512g     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L18
            boolean r5 = r2.Sg(r0, r5, r6)     // Catch: java.lang.Throwable -> L18
            if (r5 == 0) goto L18
            r5 = r1
            goto L19
        L18:
            r5 = r4
        L19:
            if (r5 == 0) goto L1c
            return r1
        L1c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.f.onInfo(android.media.MediaPlayer, int, int):boolean");
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        n nVar;
        try {
            g gVar = (g) this.f28506b.get();
            if (gVar != null && (nVar = gVar.a) != null) {
                nVar.Sg(gVar);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        m mVar;
        try {
            g gVar = (g) this.f28506b.get();
            if (gVar != null && (mVar = gVar.f28509d) != null) {
                mVar.tN(gVar);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        i iVar;
        try {
            g gVar = (g) this.f28506b.get();
            if (gVar != null && (iVar = gVar.f28510e) != null) {
                iVar.YFl(gVar, i10, i11, 1, 1);
            }
        } catch (Throwable unused) {
        }
    }
}
