package com.bytedance.sdk.openadsdk.YoT;

import android.content.Context;
import android.media.AudioManager;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes.dex */
public class qsH {
    private final AudioManager YFl;
    private int Sg = -1;
    private boolean tN = false;

    public qsH(Context context) {
        this.YFl = (AudioManager) context.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
    }

    public boolean Sg() {
        if (!this.tN) {
            return false;
        }
        this.tN = false;
        return true;
    }

    public int YFl() {
        return this.Sg;
    }

    public void YFl(int i10) {
        this.Sg = i10;
    }

    public void YFl(boolean z10) {
        YFl(z10, false);
    }

    public void YFl(boolean z10, boolean z11) {
        if (this.YFl == null) {
            return;
        }
        int i10 = 0;
        if (z10) {
            int DSW = DeviceUtils.DSW();
            if (DSW != 0) {
                this.Sg = DSW;
            } else if (!z11) {
                return;
            }
            YFl(3, 0, 0);
            this.tN = true;
            return;
        }
        int i11 = this.Sg;
        if (i11 == 0) {
            i11 = DeviceUtils.NjR() / 15;
        } else {
            if (i11 == -1) {
                if (!z11) {
                    return;
                } else {
                    i11 = DeviceUtils.NjR() / 15;
                }
            }
            this.Sg = -1;
            YFl(3, i11, i10);
            this.tN = true;
        }
        i10 = 1;
        this.Sg = -1;
        YFl(3, i11, i10);
        this.tN = true;
    }

    private void YFl(int i10, int i11, int i12) {
        try {
            this.YFl.setStreamVolume(i10, i11, i12);
        } catch (Throwable unused) {
        }
    }
}
