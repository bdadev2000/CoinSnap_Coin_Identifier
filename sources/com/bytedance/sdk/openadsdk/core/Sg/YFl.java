package com.bytedance.sdk.openadsdk.core.Sg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.EH;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.qsH.qsH;
import com.bytedance.sdk.openadsdk.utils.GA;
import com.bytedance.sdk.openadsdk.utils.Sco;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class YFl extends Sg {
    private int GS;
    private WeakReference<InterfaceC0116YFl> Sco;
    private boolean Sg;
    private boolean YFl;
    private boolean tN;

    /* renamed from: com.bytedance.sdk.openadsdk.core.Sg.YFl$YFl, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0116YFl {
        long getVideoProgress();
    }

    public YFl(@NonNull Context context, @NonNull Wwa wwa, @NonNull String str, int i10) {
        super(context, wwa, str, i10);
        this.YFl = true;
        this.Sg = false;
        this.tN = false;
    }

    private boolean AlY(View view) {
        if (view == null) {
            return false;
        }
        if ((view instanceof com.bytedance.sdk.openadsdk.core.GA.Sg.vc) || view.getId() == GA.wqc || view.getId() == GA.ZU || view.getId() == GA.BPI || view.getId() == GA.zG || view.getId() == GA.ko || view.getId() == 520093726 || view.getId() == GA.Lx) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i10 >= viewGroup.getChildCount()) {
                return false;
            }
            if (AlY(viewGroup.getChildAt(i10))) {
                return true;
            }
            i10++;
        }
    }

    private boolean NjR() {
        return this instanceof qsH;
    }

    private boolean nc() {
        if (((Sg) this).f10642vc == null || NjR()) {
            return false;
        }
        if (((Sg) this).f10642vc.ZLB() != 5 && ((Sg) this).f10642vc.ZLB() != 15) {
            return false;
        }
        if (this.GS == 0) {
            this.GS = ((Sg) this).f10642vc.Uv();
        }
        Sg();
        YFl();
        tN();
        if (this.GS == 5 && qsH() && YFl() && !Sg() && !tN()) {
            return false;
        }
        int i10 = this.GS;
        if (i10 != 1 && i10 != 2 && i10 != 5) {
            return false;
        }
        return true;
    }

    private boolean qsH() {
        return Wwa.wN(((Sg) this).f10642vc) && ((Sg) this).f10642vc.bZ() == 1;
    }

    public boolean Sg() {
        return false;
    }

    public void YFl(boolean z10) {
        this.YFl = z10;
    }

    public boolean tN() {
        return false;
    }

    public void Sg(boolean z10) {
        this.Sg = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x03b2, code lost:
    
        if (((java.lang.Boolean) r4.getTag(520093762)).booleanValue() != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x03a3, code lost:
    
        if ((r4 instanceof com.bytedance.sdk.openadsdk.core.GA.Sg.vc) == false) goto L184;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0138  */
    /* JADX WARN: Type inference failed for: r2v32, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.content.Context] */
    @Override // com.bytedance.sdk.openadsdk.core.Sg.Sg, com.bytedance.sdk.openadsdk.core.Sg.tN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void YFl(android.view.View r31, float r32, float r33, float r34, float r35, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.Sg.tN.YFl> r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.Sg.YFl.YFl(android.view.View, float, float, float, float, android.util.SparseArray, boolean):void");
    }

    public void tN(boolean z10) {
        this.tN = z10;
    }

    private String Sg(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1695837674:
                if (str.equals("banner_ad")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1263194568:
                if (str.equals("open_ad")) {
                    c10 = 1;
                    break;
                }
                break;
            case -712491894:
                if (str.equals("embeded_ad")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1844104722:
                if (str.equals("interaction")) {
                    c10 = 3;
                    break;
                }
                break;
            case 2091589896:
                if (str.equals("slide_banner_ad")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
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

    public boolean YFl() {
        Wwa wwa = ((Sg) this).f10642vc;
        if (wwa == null) {
            return true;
        }
        int Sg = lG.AlY().Sg(wwa.kU());
        int tN = EH.tN(lG.YFl());
        if (Sg == 1) {
            return Sco.AlY(tN);
        }
        if (Sg == 2) {
            return Sco.wN(tN) || Sco.AlY(tN) || Sco.vc(tN);
        }
        if (Sg != 3) {
            return Sg != 5 || Sco.AlY(tN) || Sco.vc(tN);
        }
        return false;
    }

    public void YFl(InterfaceC0116YFl interfaceC0116YFl) {
        this.Sco = new WeakReference<>(interfaceC0116YFl);
    }
}
