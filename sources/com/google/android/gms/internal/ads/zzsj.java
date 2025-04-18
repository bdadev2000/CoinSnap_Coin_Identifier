package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.view.MotionEventCompat;
import java.util.HashSet;
import java.util.Iterator;

@RequiresApi(MotionEventCompat.AXIS_GENERIC_4)
/* loaded from: classes3.dex */
public final class zzsj {
    private final HashSet zza;

    @Nullable
    private LoudnessCodecController zzb;

    public zzsj() {
        throw null;
    }

    public void zza(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.zzb;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        zzdb.zzf(this.zza.add(mediaCodec));
    }

    public void zzb() {
        this.zza.clear();
        LoudnessCodecController loudnessCodecController = this.zzb;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public void zzc(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.zza.remove(mediaCodec) && (loudnessCodecController = this.zzb) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public void zzd(int i10) {
        LoudnessCodecController loudnessCodecController = this.zzb;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.zzb = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i10, zzgey.zzb(), new zzsg(this));
        this.zzb = create;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    public zzsj(zzsi zzsiVar) {
        this.zza = new HashSet();
    }
}
