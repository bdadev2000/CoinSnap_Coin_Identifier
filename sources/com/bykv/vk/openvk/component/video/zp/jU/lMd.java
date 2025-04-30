package com.bykv.vk.openvk.component.video.zp.jU;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.component.sdk.annotation.RequiresApi;
import java.io.FileDescriptor;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class lMd extends com.bykv.vk.openvk.component.video.zp.jU.zp {
    private Surface COT;
    private final Object HWF;
    private final zp KS;
    private volatile boolean QR;
    private com.bykv.vk.openvk.component.video.zp.zp.zp jU;
    private final MediaPlayer lMd;

    /* loaded from: classes.dex */
    public static class zp implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {
        private final WeakReference<lMd> zp;

        public zp(lMd lmd) {
            this.zp = new WeakReference<>(lmd);
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i9) {
            try {
                lMd lmd = this.zp.get();
                if (lmd != null) {
                    lmd.zp(i9);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            try {
                lMd lmd = this.zp.get();
                if (lmd != null) {
                    lmd.KS();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i9, int i10) {
            try {
                lMd lmd = this.zp.get();
                if (lmd == null) {
                    return false;
                }
                if (!lmd.zp(i9, i10)) {
                    return false;
                }
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i9, int i10) {
            try {
                lMd lmd = this.zp.get();
                if (lmd == null) {
                    return false;
                }
                if (!lmd.lMd(i9, i10)) {
                    return false;
                }
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            try {
                lMd lmd = this.zp.get();
                if (lmd != null) {
                    lmd.lMd();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer) {
            try {
                lMd lmd = this.zp.get();
                if (lmd != null) {
                    lmd.jU();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i9, int i10) {
            try {
                lMd lmd = this.zp.get();
                if (lmd != null) {
                    lmd.zp(i9, i10, 1, 1);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public lMd() {
        MediaPlayer mediaPlayer;
        Object obj = new Object();
        this.HWF = obj;
        synchronized (obj) {
            mediaPlayer = new MediaPlayer();
            this.lMd = mediaPlayer;
        }
        zp(mediaPlayer);
        try {
            mediaPlayer.setAudioStreamType(3);
        } catch (Throwable unused) {
        }
        this.KS = new zp(this);
        KVG();
    }

    private void KVG() {
        this.lMd.setOnPreparedListener(this.KS);
        this.lMd.setOnBufferingUpdateListener(this.KS);
        this.lMd.setOnCompletionListener(this.KS);
        this.lMd.setOnSeekCompleteListener(this.KS);
        this.lMd.setOnVideoSizeChangedListener(this.KS);
        this.lMd.setOnErrorListener(this.KS);
        this.lMd.setOnInfoListener(this.KS);
    }

    private void dQp() {
        com.bykv.vk.openvk.component.video.zp.zp.zp zpVar = this.jU;
        if (zpVar != null) {
            try {
                zpVar.close();
            } catch (Throwable unused) {
            }
            this.jU = null;
        }
    }

    private void woN() {
        try {
            Surface surface = this.COT;
            if (surface != null) {
                surface.release();
                this.COT = null;
            }
        } catch (Throwable unused) {
        }
    }

    private void zp(MediaPlayer mediaPlayer) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        try {
            Class<?> cls = Class.forName("android.media.MediaTimeProvider");
            Class<?> cls2 = Class.forName("android.media.SubtitleController");
            Class<?> cls3 = Class.forName("android.media.SubtitleController$Anchor");
            Object newInstance = cls2.getConstructor(Context.class, cls, Class.forName("android.media.SubtitleController$Listener")).newInstance(com.bykv.vk.openvk.component.video.api.KS.zp(), null, null);
            Field declaredField = cls2.getDeclaredField("mHandler");
            declaredField.setAccessible(true);
            try {
                declaredField.set(newInstance, new Handler());
                declaredField.setAccessible(false);
                mediaPlayer.getClass().getMethod("setSubtitleAnchor", cls2, cls3).invoke(mediaPlayer, newInstance, null);
            } catch (Throwable unused) {
                declaredField.setAccessible(false);
            }
        } catch (Throwable unused2) {
        }
    }

    @Override // com.bykv.vk.openvk.component.video.zp.jU.KS
    public void Bj() throws Throwable {
        synchronized (this.HWF) {
            try {
                if (!this.QR) {
                    this.lMd.release();
                    this.QR = true;
                    woN();
                    dQp();
                    zp();
                    KVG();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bykv.vk.openvk.component.video.zp.jU.KS
    public void COT() throws Throwable {
        this.lMd.start();
    }

    @Override // com.bykv.vk.openvk.component.video.zp.jU.KS
    public void HWF() throws Throwable {
        this.lMd.stop();
    }

    @Override // com.bykv.vk.openvk.component.video.zp.jU.KS
    public void KS(boolean z8) throws Throwable {
        this.lMd.setLooping(z8);
    }

    @Override // com.bykv.vk.openvk.component.video.zp.jU.KS
    public void QR() throws Throwable {
        this.lMd.pause();
    }

    @Override // com.bykv.vk.openvk.component.video.zp.jU.KS
    public long YW() {
        try {
            return this.lMd.getCurrentPosition();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // com.bykv.vk.openvk.component.video.zp.jU.KS
    public long dT() {
        try {
            return this.lMd.getDuration();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        woN();
    }

    @Override // com.bykv.vk.openvk.component.video.zp.jU.KS
    public void jU(boolean z8) throws Throwable {
        MediaPlayer mediaPlayer = this.lMd;
        if (mediaPlayer == null) {
            return;
        }
        if (z8) {
            mediaPlayer.setVolume(0.0f, 0.0f);
        } else {
            mediaPlayer.setVolume(1.0f, 1.0f);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.zp.jU.KS
    public void ku() {
        MediaPlayer mediaPlayer = this.lMd;
        if (mediaPlayer != null) {
            mediaPlayer.prepareAsync();
        }
    }

    @Override // com.bykv.vk.openvk.component.video.zp.jU.KS
    public void lMd(boolean z8) throws Throwable {
        this.lMd.setScreenOnWhilePlaying(z8);
    }

    @Override // com.bykv.vk.openvk.component.video.zp.jU.KS
    public int rV() {
        MediaPlayer mediaPlayer = this.lMd;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.bykv.vk.openvk.component.video.zp.jU.KS
    public int tG() {
        MediaPlayer mediaPlayer = this.lMd;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.bykv.vk.openvk.component.video.zp.jU.KS
    public void vDp() throws Throwable {
        try {
            this.lMd.reset();
        } catch (Throwable unused) {
        }
        dQp();
        zp();
        KVG();
    }

    @Override // com.bykv.vk.openvk.component.video.zp.jU.KS
    public void zp(SurfaceHolder surfaceHolder) throws Throwable {
        synchronized (this.HWF) {
            try {
                if (!this.QR && surfaceHolder != null && surfaceHolder.getSurface() != null && this.zp) {
                    this.lMd.setDisplay(surfaceHolder);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bykv.vk.openvk.component.video.zp.jU.KS
    @TargetApi(14)
    public void zp(Surface surface) {
        woN();
        this.COT = surface;
        this.lMd.setSurface(surface);
    }

    @Override // com.bykv.vk.openvk.component.video.zp.jU.KS
    @RequiresApi(api = 23)
    public void zp(com.bykv.vk.openvk.component.video.api.lMd lmd) throws Throwable {
        this.lMd.setPlaybackParams(this.lMd.getPlaybackParams().setSpeed(lmd.zp()));
    }

    @Override // com.bykv.vk.openvk.component.video.zp.jU.KS
    public void zp(String str) throws Throwable {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (!TextUtils.isEmpty(scheme) && scheme.equalsIgnoreCase("file")) {
            this.lMd.setDataSource(parse.getPath());
        } else {
            this.lMd.setDataSource(str);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.zp.jU.KS
    public void zp(FileDescriptor fileDescriptor) throws Throwable {
        this.lMd.setDataSource(fileDescriptor);
    }

    @Override // com.bykv.vk.openvk.component.video.zp.jU.KS
    @RequiresApi(api = 23)
    public synchronized void zp(com.bykv.vk.openvk.component.video.api.KS.KS ks) {
        this.jU = com.bykv.vk.openvk.component.video.zp.zp.zp.zp(com.bykv.vk.openvk.component.video.api.KS.zp(), ks);
        com.bykv.vk.openvk.component.video.zp.zp.lMd.KS.zp(ks);
        this.lMd.setDataSource(this.jU);
    }

    @Override // com.bykv.vk.openvk.component.video.zp.jU.KS
    public void zp(long j7, int i9) throws Throwable {
        if (Build.VERSION.SDK_INT < 26) {
            this.lMd.seekTo((int) j7);
            return;
        }
        if (i9 == 0) {
            this.lMd.seekTo((int) j7, 0);
            return;
        }
        if (i9 == 1) {
            this.lMd.seekTo((int) j7, 1);
            return;
        }
        if (i9 == 2) {
            this.lMd.seekTo((int) j7, 2);
        } else if (i9 == 3) {
            this.lMd.seekTo((int) j7, 3);
        } else {
            this.lMd.seekTo((int) j7);
        }
    }
}
