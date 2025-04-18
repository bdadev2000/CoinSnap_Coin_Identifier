package com.bytedance.sdk.openadsdk.core.eT.AlY;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.AlY.Sg;
import com.bytedance.adsdk.ugeno.core.GA;
import com.bytedance.adsdk.ugeno.core.YoT;
import com.bytedance.adsdk.ugeno.core.qsH;
import com.bytedance.sdk.openadsdk.core.model.UZM;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.model.pDU;
import com.bytedance.sdk.openadsdk.utils.GS;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class wN extends tN {
    public wN(Context context, Wwa wwa, boolean z10, YFl yFl, ViewGroup viewGroup) {
        super(context, wwa, z10, yFl, viewGroup);
    }

    private void vc() {
        qsH qsh = new qsH();
        HashMap hashMap = new HashMap();
        hashMap.put("image_info", this.f10673vc.eT());
        hashMap.put("cache_dir", this.f10673vc.pDU());
        qsh.YFl(hashMap);
        qsh.YFl(this.Sg);
        qsh.YFl(this.AlY);
        qsh.Sg(this.Ne);
        this.YFl.YFl("ad", qsh);
    }

    @Override // com.bytedance.sdk.openadsdk.core.eT.AlY.tN
    public int AlY() {
        vc();
        this.YFl.YFl((YoT) this);
        this.YFl.YFl((GA) this);
        UZM UI = this.wN.UI();
        try {
            if (UI != null) {
                this.tN = this.YFl.YFl(this.AlY, this.Ne, UI.wN());
            } else {
                this.tN = this.YFl.YFl(this.AlY, this.Ne, null);
            }
            this.f10673vc.Cfr().Sg();
            this.f10673vc.Cfr().tN();
            return 0;
        } catch (NoClassDefFoundError unused) {
            return 140;
        } catch (UnsatisfiedLinkError unused2) {
            return 139;
        } catch (Throwable unused3) {
            return 141;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.eT.AlY.tN
    public JSONObject Sg() {
        return this.f10673vc.tN();
    }

    @Override // com.bytedance.sdk.openadsdk.core.eT.AlY.tN
    public JSONObject YFl() {
        JSONObject tN = this.f10673vc.tN();
        if (tN != null) {
            return tN.optJSONObject("xTemplate");
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.eT.AlY.tN, com.bytedance.sdk.component.adexpress.dynamic.AlY
    public void setSoundMute(boolean z10) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.eT.AlY.tN, com.bytedance.sdk.component.adexpress.dynamic.AlY
    public void setTime(CharSequence charSequence, int i10, int i11, boolean z10) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.eT.AlY.tN, com.bytedance.adsdk.ugeno.core.YoT
    public void YFl(com.bytedance.adsdk.ugeno.Sg.Sg sg2, String str, Sg.YFl yFl) {
        if (this.qsH == null || yFl == null) {
            return;
        }
        String Sg = yFl.Sg();
        Sg.getClass();
        int i10 = 6;
        boolean z10 = true;
        char c10 = 65535;
        switch (Sg.hashCode()) {
            case -511324706:
                if (Sg.equals("openPrivacy")) {
                    c10 = 0;
                    break;
                }
                break;
            case -55818203:
                if (Sg.equals("pauseVideo")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3532159:
                if (Sg.equals("skip")) {
                    c10 = 2;
                    break;
                }
                break;
            case 804386914:
                if (Sg.equals("videoControl")) {
                    c10 = 3;
                    break;
                }
                break;
            case 951590323:
                if (Sg.equals("convert")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1151744482:
                if (Sg.equals("muteVideo")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1671642405:
                if (Sg.equals("dislike")) {
                    c10 = 6;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                i10 = 7;
                break;
            case 1:
            case 3:
                i10 = 4;
                break;
            case 2:
                break;
            case 4:
                i10 = 2;
                break;
            case 5:
                i10 = 5;
                break;
            case 6:
                i10 = 3;
                break;
            default:
                i10 = 0;
                break;
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        WeakReference<View> weakReference = this.aIu;
        if (weakReference != null) {
            int[] YFl = GS.YFl(weakReference.get());
            if (YFl != null) {
                iArr = YFl;
            }
            int[] tN = GS.tN(this.aIu.get());
            if (tN != null) {
                iArr2 = tN;
            }
        }
        pDU.YFl YFl2 = new pDU.YFl().AlY(this.YoT).tN(this.GA).Sg(this.pDU).YFl(this.EH).Sg(this.rkt).YFl(this.lG).tN(iArr[0]).AlY(iArr[1]).wN(iArr2[0]).vc(iArr2[1]).YFl(this.wXo);
        if (str.equals("tap") && !this.Wwa) {
            z10 = false;
        }
        this.qsH.YFl(sg2.NjR(), i10, YFl2.YFl(z10).YFl(sg2.hQ()).Sg(false).YFl());
    }
}
