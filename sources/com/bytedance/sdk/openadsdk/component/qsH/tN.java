package com.bytedance.sdk.openadsdk.component.qsH;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.AlY.wN.Sg.EH;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.Sg.YFl;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import l5.e;
import m2.l;

/* loaded from: classes.dex */
public class tN implements YFl.InterfaceC0116YFl {
    private Sg AlY;
    private FrameLayout Sg;
    private Context YFl;
    private Wwa tN;

    public tN(Context context) {
        this.YFl = context.getApplicationContext();
    }

    public void AlY() {
        try {
            if (Sg()) {
                this.AlY.YFl();
            }
        } catch (Throwable th2) {
            YoT.YFl("TTAppOpenVideoManager", "open_ad", "AppOpenVideoManager onPause throw Exception :" + th2.getMessage());
        }
    }

    public long DSW() {
        Sg sg2 = this.AlY;
        if (sg2 != null) {
            return sg2.wN();
        }
        return 0L;
    }

    public long NjR() {
        Sg sg2 = this.AlY;
        if (sg2 != null) {
            return this.AlY.vc() + sg2.qsH();
        }
        return 0L;
    }

    public boolean Sg() {
        Sg sg2 = this.AlY;
        return (sg2 == null || sg2.YoT() == null || !this.AlY.YoT().vc()) ? false : true;
    }

    public void YFl(FrameLayout frameLayout, Wwa wwa) {
        this.Sg = frameLayout;
        this.tN = wwa;
        this.AlY = new Sg(this.YFl, frameLayout, wwa);
    }

    @Override // com.bytedance.sdk.openadsdk.core.Sg.YFl.InterfaceC0116YFl
    public long getVideoProgress() {
        return DSW();
    }

    public long qsH() {
        Sg sg2 = this.AlY;
        if (sg2 != null) {
            return sg2.vc();
        }
        return 0L;
    }

    public boolean tN() {
        Sg sg2 = this.AlY;
        return (sg2 == null || sg2.YoT() == null || !this.AlY.YoT().DSW()) ? false : true;
    }

    public void vc() {
        Sg sg2 = this.AlY;
        if (sg2 == null) {
            return;
        }
        this.YFl = null;
        sg2.tN();
        this.AlY = null;
    }

    public void wN() {
        Sg sg2 = this.AlY;
        if (sg2 != null) {
            sg2.Sg();
        }
    }

    public boolean YFl() {
        com.bytedance.sdk.openadsdk.core.GA.YFl.Sg YFl = Wwa.YFl(((l) CacheDirFactory.getICacheDir(0)).c(), this.tN);
        YFl.Sg(this.tN.zz());
        YFl.YFl(this.Sg.getWidth());
        YFl.Sg(this.Sg.getHeight());
        YFl.tN(this.tN.uGS());
        YFl.YFl(0L);
        YFl.YFl(true);
        return this.AlY.YFl(YFl);
    }

    public void YFl(e eVar) {
        Sg sg2 = this.AlY;
        if (sg2 != null) {
            sg2.YFl(eVar);
        }
    }

    public void YFl(int i10) {
        if (this.AlY != null) {
            EH.YFl yFl = new EH.YFl();
            yFl.YFl(DSW());
            yFl.tN(NjR());
            yFl.Sg(qsH());
            yFl.tN(i10);
            yFl.AlY(this.AlY.DSW());
            this.AlY.YFl(yFl);
        }
    }
}
