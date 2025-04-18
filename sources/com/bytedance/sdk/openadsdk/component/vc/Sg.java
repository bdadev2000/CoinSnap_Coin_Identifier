package com.bytedance.sdk.openadsdk.component.vc;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class Sg implements Handler.Callback {
    private boolean DSW;
    private final com.bytedance.sdk.openadsdk.component.qsH.YFl Sg;
    private YFl tN;
    private Handler YFl = new Handler(Looper.myLooper(), this);
    private int AlY = 0;
    private int wN = 5;

    /* renamed from: vc, reason: collision with root package name */
    private int f10621vc = 0;

    public Sg(com.bytedance.sdk.openadsdk.component.qsH.YFl yFl) {
        this.Sg = yFl;
    }

    public void AlY() {
        Handler handler = this.YFl;
        if (handler != null) {
            handler.removeMessages(100);
        }
    }

    public void Sg(int i10) {
        this.f10621vc = i10;
    }

    public void YFl(int i10) {
        this.AlY = i10;
        int i11 = this.wN - i10;
        this.Sg.YFl(i11);
        if (i10 <= 0) {
            YFl yFl = this.tN;
            if (yFl != null && !this.DSW) {
                yFl.Sg();
                this.DSW = true;
            }
            i10 = 0;
        }
        boolean z10 = i11 >= this.f10621vc;
        YFl yFl2 = this.tN;
        if (yFl2 != null) {
            yFl2.YFl(i10, i11, z10);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        if (message.what == 100 && this.YFl != null) {
            int i10 = message.arg1;
            YFl(i10);
            if (i10 > 0) {
                Message obtain = Message.obtain();
                obtain.what = 100;
                obtain.arg1 = i10 - 1;
                this.YFl.sendMessageDelayed(obtain, 1000L);
            }
        }
        return true;
    }

    public void tN() {
        if (this.YFl != null) {
            Message obtain = Message.obtain();
            obtain.what = 100;
            obtain.arg1 = this.AlY;
            this.YFl.sendMessage(obtain);
        }
    }

    public void wN() {
        this.YFl.removeCallbacksAndMessages(null);
        this.YFl = null;
    }

    public void Sg() {
        Handler handler = this.YFl;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(100, this.wN, 0));
        }
    }

    public void YFl(float f10) {
        int i10 = (int) f10;
        this.wN = i10;
        if (i10 <= 0) {
            this.wN = 5;
        }
    }

    public void YFl(YFl yFl) {
        this.tN = yFl;
    }

    public int YFl() {
        return this.f10621vc;
    }
}
