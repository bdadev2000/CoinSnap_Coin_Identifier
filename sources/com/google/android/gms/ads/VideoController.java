package com.google.android.gms.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.annotation.KeepForSdk;

/* loaded from: classes.dex */
public final class VideoController {

    @KeepForSdk
    public static final int PLAYBACK_STATE_ENDED = 3;

    @KeepForSdk
    public static final int PLAYBACK_STATE_PAUSED = 2;

    @KeepForSdk
    public static final int PLAYBACK_STATE_PLAYING = 1;

    @KeepForSdk
    public static final int PLAYBACK_STATE_READY = 5;

    @KeepForSdk
    public static final int PLAYBACK_STATE_UNKNOWN = 0;
    private final Object zza = new Object();

    @Nullable
    private zzeb zzb;

    @Nullable
    private VideoLifecycleCallbacks zzc;

    /* loaded from: classes.dex */
    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z2) {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }
    }

    @KeepForSdk
    public int getPlaybackState() {
        synchronized (this.zza) {
            zzeb zzebVar = this.zzb;
            if (zzebVar == null) {
                return 0;
            }
            try {
                return zzebVar.zzh();
            } catch (RemoteException e) {
                zzm.zzh("Unable to call getPlaybackState on video controller.", e);
                return 0;
            }
        }
    }

    @Nullable
    public VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.zza) {
            videoLifecycleCallbacks = this.zzc;
        }
        return videoLifecycleCallbacks;
    }

    public boolean hasVideoContent() {
        boolean z2;
        synchronized (this.zza) {
            z2 = this.zzb != null;
        }
        return z2;
    }

    public boolean isClickToExpandEnabled() {
        synchronized (this.zza) {
            zzeb zzebVar = this.zzb;
            if (zzebVar == null) {
                return false;
            }
            try {
                return zzebVar.zzo();
            } catch (RemoteException e) {
                zzm.zzh("Unable to call isClickToExpandEnabled.", e);
                return false;
            }
        }
    }

    public boolean isCustomControlsEnabled() {
        synchronized (this.zza) {
            zzeb zzebVar = this.zzb;
            if (zzebVar == null) {
                return false;
            }
            try {
                return zzebVar.zzp();
            } catch (RemoteException e) {
                zzm.zzh("Unable to call isUsingCustomPlayerControls.", e);
                return false;
            }
        }
    }

    public boolean isMuted() {
        synchronized (this.zza) {
            zzeb zzebVar = this.zzb;
            if (zzebVar == null) {
                return true;
            }
            try {
                return zzebVar.zzq();
            } catch (RemoteException e) {
                zzm.zzh("Unable to call isMuted on video controller.", e);
                return true;
            }
        }
    }

    public void mute(boolean z2) {
        synchronized (this.zza) {
            zzeb zzebVar = this.zzb;
            if (zzebVar == null) {
                return;
            }
            try {
                zzebVar.zzj(z2);
            } catch (RemoteException e) {
                zzm.zzh("Unable to call mute on video controller.", e);
            }
        }
    }

    public void pause() {
        synchronized (this.zza) {
            zzeb zzebVar = this.zzb;
            if (zzebVar == null) {
                return;
            }
            try {
                zzebVar.zzk();
            } catch (RemoteException e) {
                zzm.zzh("Unable to call pause on video controller.", e);
            }
        }
    }

    public void play() {
        synchronized (this.zza) {
            zzeb zzebVar = this.zzb;
            if (zzebVar == null) {
                return;
            }
            try {
                zzebVar.zzl();
            } catch (RemoteException e) {
                zzm.zzh("Unable to call play on video controller.", e);
            }
        }
    }

    public void setVideoLifecycleCallbacks(@Nullable VideoLifecycleCallbacks videoLifecycleCallbacks) {
        zzga zzgaVar;
        synchronized (this.zza) {
            this.zzc = videoLifecycleCallbacks;
            zzeb zzebVar = this.zzb;
            if (zzebVar == null) {
                return;
            }
            if (videoLifecycleCallbacks == null) {
                zzgaVar = null;
            } else {
                try {
                    zzgaVar = new zzga(videoLifecycleCallbacks);
                } catch (RemoteException e) {
                    zzm.zzh("Unable to call setVideoLifecycleCallbacks on video controller.", e);
                }
            }
            zzebVar.zzm(zzgaVar);
        }
    }

    public void stop() {
        synchronized (this.zza) {
            zzeb zzebVar = this.zzb;
            if (zzebVar == null) {
                return;
            }
            try {
                zzebVar.zzn();
            } catch (RemoteException e) {
                zzm.zzh("Unable to call stop on video controller.", e);
            }
        }
    }

    @Nullable
    public final zzeb zza() {
        zzeb zzebVar;
        synchronized (this.zza) {
            zzebVar = this.zzb;
        }
        return zzebVar;
    }

    public final void zzb(@Nullable zzeb zzebVar) {
        synchronized (this.zza) {
            try {
                this.zzb = zzebVar;
                VideoLifecycleCallbacks videoLifecycleCallbacks = this.zzc;
                if (videoLifecycleCallbacks != null) {
                    setVideoLifecycleCallbacks(videoLifecycleCallbacks);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
