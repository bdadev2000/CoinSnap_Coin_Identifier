package com.bytedance.sdk.openadsdk.core.lMd;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.utils.YhE;
import com.bytedance.sdk.openadsdk.utils.vDp;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class zp extends lMd {
    private boolean UPs;
    private WeakReference<InterfaceC0109zp> fRl;
    private int ffE;
    private boolean lMd;
    private boolean zp;

    /* renamed from: com.bytedance.sdk.openadsdk.core.lMd.zp$zp, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0109zp {
        long getVideoProgress();
    }

    public zp(@NonNull Context context, @NonNull woN won, @NonNull String str, int i9) {
        super(context, won, str, i9);
        this.zp = true;
        this.lMd = false;
        this.UPs = false;
    }

    private boolean YW() {
        return this instanceof com.bytedance.sdk.openadsdk.core.nativeexpress.HWF;
    }

    private boolean dT() {
        if (this.COT == null || YW()) {
            return false;
        }
        if (this.COT.mW() != 5 && this.COT.mW() != 15) {
            return false;
        }
        if (this.ffE == 0) {
            this.ffE = this.COT.Dp();
        }
        lMd();
        zp();
        KS();
        if (this.ffE == 5 && ku() && zp() && !lMd() && !KS()) {
            return false;
        }
        int i9 = this.ffE;
        if (i9 != 1 && i9 != 2 && i9 != 5) {
            return false;
        }
        return true;
    }

    private boolean jU(View view) {
        if (view == null) {
            return false;
        }
        if ((view instanceof NativeVideoTsView) || view.getId() == vDp.rOJ || view.getId() == vDp.BO || view.getId() == vDp.Iv || view.getId() == vDp.aax || view.getId() == vDp.Rg || view.getId() == 520093726 || view.getId() == vDp.jyq) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        int i9 = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i9 >= viewGroup.getChildCount()) {
                return false;
            }
            if (jU(viewGroup.getChildAt(i9))) {
                return true;
            }
            i9++;
        }
    }

    private boolean ku() {
        if (woN.COT(this.COT) && this.COT.ot() == 1) {
            return true;
        }
        return false;
    }

    public boolean KS() {
        return false;
    }

    public boolean lMd() {
        return false;
    }

    public void zp(boolean z8) {
        this.zp = z8;
    }

    public void KS(boolean z8) {
        this.UPs = z8;
    }

    public void lMd(boolean z8) {
        this.lMd = z8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x0385, code lost:
    
        if (((java.lang.Boolean) r5.getTag(520093762)).booleanValue() != false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0376, code lost:
    
        if ((r5 instanceof com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView) == false) goto L179;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0138  */
    @Override // com.bytedance.sdk.openadsdk.core.lMd.lMd, com.bytedance.sdk.openadsdk.core.lMd.KS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void zp(android.view.View r35, float r36, float r37, float r38, float r39, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.lMd.KS.zp> r40, boolean r41) {
        /*
            Method dump skipped, instructions count: 980
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.lMd.zp.zp(android.view.View, float, float, float, float, android.util.SparseArray, boolean):void");
    }

    private String lMd(String str) {
        str.getClass();
        char c9 = 65535;
        switch (str.hashCode()) {
            case -1695837674:
                if (str.equals("banner_ad")) {
                    c9 = 0;
                    break;
                }
                break;
            case -1263194568:
                if (str.equals("open_ad")) {
                    c9 = 1;
                    break;
                }
                break;
            case -712491894:
                if (str.equals("embeded_ad")) {
                    c9 = 2;
                    break;
                }
                break;
            case 1844104722:
                if (str.equals("interaction")) {
                    c9 = 3;
                    break;
                }
                break;
            case 2091589896:
                if (str.equals("slide_banner_ad")) {
                    c9 = 4;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                return "banner_call";
            case 1:
                return "open_ad";
            case 2:
                return "feed_call";
            case 3:
                return "interaction_call";
            case 4:
                return "banner_call";
            default:
                return "";
        }
    }

    public boolean zp() {
        woN won = this.COT;
        if (won == null) {
            return true;
        }
        int lMd = KVG.jU().lMd(won.FGx());
        int KS = com.bytedance.sdk.component.utils.KVG.KS(KVG.zp());
        if (lMd == 1) {
            return YhE.jU(KS);
        }
        if (lMd == 2) {
            return YhE.COT(KS) || YhE.jU(KS) || YhE.HWF(KS);
        }
        if (lMd != 3) {
            return lMd != 5 || YhE.jU(KS) || YhE.HWF(KS);
        }
        return false;
    }

    public void zp(InterfaceC0109zp interfaceC0109zp) {
        this.fRl = new WeakReference<>(interfaceC0109zp);
    }
}
