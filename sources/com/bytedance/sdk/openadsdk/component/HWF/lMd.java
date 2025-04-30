package com.bytedance.sdk.openadsdk.component.HWF;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class lMd implements Handler.Callback {
    private zp KS;
    private boolean QR;
    private final com.bytedance.sdk.openadsdk.component.ku.zp lMd;
    private Handler zp = new Handler(Looper.myLooper(), this);
    private int jU = 0;
    private int COT = 5;
    private int HWF = 0;

    public lMd(com.bytedance.sdk.openadsdk.component.ku.zp zpVar) {
        this.lMd = zpVar;
    }

    public void COT() {
        this.zp.removeCallbacksAndMessages(null);
        this.zp = null;
    }

    public void KS() {
        if (this.zp != null) {
            Message obtain = Message.obtain();
            obtain.what = 100;
            obtain.arg1 = this.jU;
            this.zp.sendMessage(obtain);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        if (message.what == 100 && this.zp != null) {
            int i9 = message.arg1;
            zp(i9);
            if (i9 > 0) {
                Message obtain = Message.obtain();
                obtain.what = 100;
                obtain.arg1 = i9 - 1;
                this.zp.sendMessageDelayed(obtain, 1000L);
            }
        }
        return true;
    }

    public void jU() {
        Handler handler = this.zp;
        if (handler != null) {
            handler.removeMessages(100);
        }
    }

    public void lMd(int i9) {
        this.HWF = i9;
    }

    public void zp(int i9) {
        this.jU = i9;
        int i10 = this.COT - i9;
        this.lMd.zp(i10);
        if (i9 <= 0) {
            zp zpVar = this.KS;
            if (zpVar != null && !this.QR) {
                zpVar.lMd();
                this.QR = true;
            }
            i9 = 0;
        }
        boolean z8 = i10 >= this.HWF;
        zp zpVar2 = this.KS;
        if (zpVar2 != null) {
            zpVar2.zp(i9, i10, z8);
        }
    }

    public void lMd() {
        Handler handler = this.zp;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(100, this.COT, 0));
        }
    }

    public void zp(float f9) {
        int i9 = (int) f9;
        this.COT = i9;
        if (i9 <= 0) {
            this.COT = 5;
        }
    }

    public void zp(zp zpVar) {
        this.KS = zpVar;
    }

    public int zp() {
        return this.HWF;
    }
}
