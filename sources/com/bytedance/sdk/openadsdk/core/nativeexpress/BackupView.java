package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.core.FP;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.YhE;

/* loaded from: classes.dex */
public abstract class BackupView extends PAGFrameLayout {
    protected boolean Bj;
    protected TTDislikeDialogAbstract COT;
    protected String HWF;
    protected com.bytedance.sdk.openadsdk.core.model.woN KS;
    protected int QR;
    protected int YW;
    protected boolean dT;
    protected com.bytedance.sdk.openadsdk.dislike.lMd jU;
    protected int ku;
    protected Context lMd;
    protected String vDp;
    private com.bytedance.sdk.openadsdk.lMd.QR zp;

    public BackupView(@NonNull Context context) {
        super(context);
        this.HWF = "embeded_ad";
        this.dT = true;
        this.Bj = true;
        setTag("tt_express_backup_fl_tag_26");
    }

    public String getDescription() {
        if (!TextUtils.isEmpty(this.KS.rCC())) {
            return this.KS.rCC();
        }
        if (!TextUtils.isEmpty(this.KS.MBR())) {
            return this.KS.MBR();
        }
        return "";
    }

    public String getNameOrSource() {
        com.bytedance.sdk.openadsdk.core.model.woN won = this.KS;
        if (won == null) {
            return "";
        }
        if (won.Vjb() != null && !TextUtils.isEmpty(this.KS.Vjb().lMd())) {
            return this.KS.Vjb().lMd();
        }
        if (TextUtils.isEmpty(this.KS.Pxi())) {
            return "";
        }
        return this.KS.Pxi();
    }

    public float getRealHeight() {
        return WNy.KS(this.lMd, this.ku);
    }

    public float getRealWidth() {
        return WNy.KS(this.lMd, this.QR);
    }

    @Override // android.view.View
    public Object getTag() {
        return "tt_express_backup_fl_tag_26";
    }

    public String getTitle() {
        if (this.KS.Vjb() != null && !TextUtils.isEmpty(this.KS.Vjb().lMd())) {
            return this.KS.Vjb().lMd();
        }
        if (!TextUtils.isEmpty(this.KS.Pxi())) {
            return this.KS.Pxi();
        }
        if (!TextUtils.isEmpty(this.KS.rCC())) {
            return this.KS.rCC();
        }
        return "";
    }

    public NativeVideoTsView getVideoView() {
        NativeVideoTsView nativeVideoTsView;
        com.bytedance.sdk.openadsdk.core.model.woN won = this.KS;
        if (won != null && this.lMd != null) {
            if (com.bytedance.sdk.openadsdk.core.model.woN.COT(won)) {
                try {
                    nativeVideoTsView = new NativeVideoTsView(this.lMd, this.KS, this.HWF, true, false, this.zp);
                    nativeVideoTsView.setVideoCacheUrl(this.vDp);
                    nativeVideoTsView.setControllerStatusCallBack(new NativeVideoTsView.lMd() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView.2
                        @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.lMd
                        public void zp(boolean z8, long j7, long j9, long j10, boolean z9) {
                        }
                    });
                    nativeVideoTsView.setIsAutoPlay(this.dT);
                    nativeVideoTsView.setIsQuiet(this.Bj);
                } catch (Throwable unused) {
                }
                if (!com.bytedance.sdk.openadsdk.core.model.woN.COT(this.KS) && nativeVideoTsView != null && nativeVideoTsView.zp(0L, true, false)) {
                    return nativeVideoTsView;
                }
            }
            nativeVideoTsView = null;
            if (!com.bytedance.sdk.openadsdk.core.model.woN.COT(this.KS)) {
            }
        }
        return null;
    }

    public void setDislikeInner(FP fp) {
        if (fp instanceof com.bytedance.sdk.openadsdk.dislike.lMd) {
            this.jU = (com.bytedance.sdk.openadsdk.dislike.lMd) fp;
        }
    }

    public void setDislikeOuter(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        com.bytedance.sdk.openadsdk.core.model.woN won;
        if (tTDislikeDialogAbstract != null && (won = this.KS) != null) {
            tTDislikeDialogAbstract.setMaterialMeta(won.GP(), this.KS.sqt());
        }
        this.COT = tTDislikeDialogAbstract;
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        super.setTag("tt_express_backup_fl_tag_26");
    }

    public void zp() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.COT;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.dislike.lMd lmd = this.jU;
        if (lmd != null) {
            lmd.zp();
        } else {
            TTDelegateActivity.zp(this.KS, (String) null);
        }
    }

    public abstract void zp(View view, int i9, com.bytedance.sdk.openadsdk.core.model.tG tGVar);

    public BackupView(@NonNull Context context, String str) {
        super(context);
        this.HWF = "embeded_ad";
        this.dT = true;
        this.Bj = true;
        this.vDp = str;
        setTag("tt_express_backup_fl_tag_26");
    }

    public void zp(View view, boolean z8) {
        com.bytedance.sdk.openadsdk.core.lMd.lMd lmd;
        if (view == null) {
            return;
        }
        if (z8) {
            Context context = this.lMd;
            com.bytedance.sdk.openadsdk.core.model.woN won = this.KS;
            String str = this.HWF;
            lmd = new com.bytedance.sdk.openadsdk.core.lMd.zp(context, won, str, YhE.zp(str));
        } else {
            Context context2 = this.lMd;
            com.bytedance.sdk.openadsdk.core.model.woN won2 = this.KS;
            String str2 = this.HWF;
            lmd = new com.bytedance.sdk.openadsdk.core.lMd.lMd(context2, won2, str2, YhE.zp(str2));
        }
        view.setOnTouchListener(lmd);
        view.setOnClickListener(lmd);
        lmd.zp(new zp() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView.1
            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.zp
            public void zp(View view2, int i9, com.bytedance.sdk.openadsdk.core.model.tG tGVar) {
                BackupView.this.zp(view2, i9, tGVar);
            }
        });
    }

    public void zp(int i9) {
        this.Bj = com.bytedance.sdk.openadsdk.core.KVG.jU().KS(String.valueOf(this.YW));
        int lMd = com.bytedance.sdk.openadsdk.core.KVG.jU().lMd(i9);
        if (3 == lMd) {
            this.dT = false;
            return;
        }
        int KS = com.bytedance.sdk.component.utils.KVG.KS(com.bytedance.sdk.openadsdk.core.KVG.zp());
        if (1 != lMd || !YhE.jU(KS)) {
            if (2 == lMd) {
                if (YhE.COT(KS) || YhE.jU(KS) || YhE.HWF(KS)) {
                    this.dT = true;
                    return;
                }
                return;
            }
            if (5 != lMd) {
                return;
            }
            if (!YhE.jU(KS) && !YhE.HWF(KS)) {
                return;
            }
        }
        this.dT = true;
    }

    public void zp(View view) {
        com.bytedance.sdk.openadsdk.core.model.woN won = this.KS;
        if (won == null || won.eWG() == null || view == null) {
            return;
        }
        zp(view, this.KS.ot() == 1 && this.dT);
    }
}
