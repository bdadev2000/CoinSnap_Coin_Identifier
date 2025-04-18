package com.google.android.gms.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzfz;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.annotation.KeepForSdk;

/* loaded from: classes3.dex */
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

    /* loaded from: classes3.dex */
    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z10) {
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
            } catch (RemoteException e2) {
                zzm.zzh("Unable to call getPlaybackState on video controller.", e2);
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
        boolean z10;
        synchronized (this.zza) {
            if (this.zzb != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public boolean isClickToExpandEnabled() {
        synchronized (this.zza) {
            zzeb zzebVar = this.zzb;
            if (zzebVar == null) {
                return false;
            }
            try {
                return zzebVar.zzo();
            } catch (RemoteException e2) {
                zzm.zzh("Unable to call isClickToExpandEnabled.", e2);
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
            } catch (RemoteException e2) {
                zzm.zzh("Unable to call isUsingCustomPlayerControls.", e2);
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
            } catch (RemoteException e2) {
                zzm.zzh("Unable to call isMuted on video controller.", e2);
                return true;
            }
        }
    }

    public void mute(boolean z10) {
        synchronized (this.zza) {
            zzeb zzebVar = this.zzb;
            if (zzebVar == null) {
                return;
            }
            try {
                zzebVar.zzj(z10);
            } catch (RemoteException e2) {
                zzm.zzh("Unable to call mute on video controller.", e2);
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
            } catch (RemoteException e2) {
                zzm.zzh("Unable to call pause on video controller.", e2);
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
            } catch (RemoteException e2) {
                zzm.zzh("Unable to call play on video controller.", e2);
            }
        }
    }

    public void setVideoLifecycleCallbacks(@Nullable VideoLifecycleCallbacks videoLifecycleCallbacks) {
        zzfz zzfzVar;
        synchronized (this.zza) {
            this.zzc = videoLifecycleCallbacks;
            zzeb zzebVar = this.zzb;
            if (zzebVar == null) {
                return;
            }
            if (videoLifecycleCallbacks == null) {
                zzfzVar = null;
            } else {
                try {
                    zzfzVar = new zzfz(videoLifecycleCallbacks);
                } catch (RemoteException e2) {
                    zzm.zzh("Unable to call setVideoLifecycleCallbacks on video controller.", e2);
                }
            }
            zzebVar.zzm(zzfzVar);
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
            } catch (RemoteException e2) {
                zzm.zzh("Unable to call stop on video controller.", e2);
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
            this.zzb = zzebVar;
            VideoLifecycleCallbacks videoLifecycleCallbacks = this.zzc;
            if (videoLifecycleCallbacks != null) {
                setVideoLifecycleCallbacks(videoLifecycleCallbacks);
            }
        }
    }
}
