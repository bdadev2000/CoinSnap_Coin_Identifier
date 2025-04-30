package com.bytedance.sdk.openadsdk.YW;

import android.content.Context;
import android.media.AudioManager;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes.dex */
public class ku {
    private final AudioManager zp;
    private int lMd = -1;
    private boolean KS = false;

    public ku(Context context) {
        this.zp = (AudioManager) context.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
    }

    public boolean lMd() {
        if (!this.KS) {
            return false;
        }
        this.KS = false;
        return true;
    }

    public int zp() {
        return this.lMd;
    }

    public void zp(int i9) {
        this.lMd = i9;
    }

    public void zp(boolean z8) {
        zp(z8, false);
    }

    public void zp(boolean z8, boolean z9) {
        if (this.zp == null) {
            return;
        }
        int i9 = 0;
        if (z8) {
            int QR = DeviceUtils.QR();
            if (QR != 0) {
                this.lMd = QR;
            }
            zp(3, 0, 0);
            this.KS = true;
            return;
        }
        int i10 = this.lMd;
        if (i10 == 0) {
            i10 = DeviceUtils.YW() / 15;
        } else {
            if (i10 == -1) {
                if (!z9) {
                    return;
                } else {
                    i10 = DeviceUtils.YW() / 15;
                }
            }
            this.lMd = -1;
            zp(3, i10, i9);
            this.KS = true;
        }
        i9 = 1;
        this.lMd = -1;
        zp(3, i10, i9);
        this.KS = true;
    }

    private void zp(int i9, int i10, int i11) {
        try {
            this.zp.setStreamVolume(i9, i10, i11);
        } catch (Throwable unused) {
        }
    }
}
