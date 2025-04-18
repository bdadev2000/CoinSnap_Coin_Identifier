package com.bytedance.sdk.openadsdk.core.qsH;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.core.GA.Sg.vc;
import com.bytedance.sdk.openadsdk.core.UZM;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.bytedance.sdk.openadsdk.utils.Sco;

/* loaded from: classes.dex */
public abstract class YFl extends com.bytedance.sdk.openadsdk.core.wN.tN {
    protected com.bytedance.sdk.openadsdk.tN.tN AlY;
    protected int DSW;
    protected int NjR;
    protected Context Sg;
    private com.bytedance.sdk.openadsdk.AlY.DSW YFl;
    protected String YoT;
    protected boolean eT;

    /* renamed from: nc, reason: collision with root package name */
    protected boolean f10725nc;
    protected int qsH;
    protected com.bytedance.sdk.openadsdk.core.model.Wwa tN;

    /* renamed from: vc, reason: collision with root package name */
    protected String f10726vc;
    protected TTDislikeDialogAbstract wN;

    public YFl(@NonNull Context context) {
        super(context);
        this.f10726vc = "embeded_ad";
        this.f10725nc = true;
        this.eT = true;
        setTag("tt_express_backup_fl_tag_26");
    }

    public void YFl() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.wN;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.tN.tN tNVar = this.AlY;
        if (tNVar != null) {
            tNVar.YFl();
        } else {
            TTDelegateActivity.YFl(this.tN, (String) null);
        }
    }

    public abstract void YFl(View view, int i10, com.bytedance.sdk.openadsdk.core.model.pDU pdu);

    public String getDescription() {
        if (!TextUtils.isEmpty(this.tN.Hjb())) {
            return this.tN.Hjb();
        }
        if (!TextUtils.isEmpty(this.tN.dd())) {
            return this.tN.dd();
        }
        return "";
    }

    public String getNameOrSource() {
        com.bytedance.sdk.openadsdk.core.model.Wwa wwa = this.tN;
        if (wwa == null) {
            return "";
        }
        if (wwa.in() != null && !TextUtils.isEmpty(this.tN.in().Sg())) {
            return this.tN.in().Sg();
        }
        if (TextUtils.isEmpty(this.tN.zG())) {
            return "";
        }
        return this.tN.zG();
    }

    public float getRealHeight() {
        return GS.AlY(this.Sg, this.qsH);
    }

    public float getRealWidth() {
        return GS.AlY(this.Sg, this.DSW);
    }

    @Override // android.view.View
    public Object getTag() {
        return "tt_express_backup_fl_tag_26";
    }

    public String getTitle() {
        if (this.tN.in() != null && !TextUtils.isEmpty(this.tN.in().Sg())) {
            return this.tN.in().Sg();
        }
        if (!TextUtils.isEmpty(this.tN.zG())) {
            return this.tN.zG();
        }
        if (!TextUtils.isEmpty(this.tN.Hjb())) {
            return this.tN.Hjb();
        }
        return "";
    }

    public com.bytedance.sdk.openadsdk.core.GA.Sg.vc getVideoView() {
        com.bytedance.sdk.openadsdk.core.GA.Sg.vc vcVar;
        com.bytedance.sdk.openadsdk.core.model.Wwa wwa = this.tN;
        if (wwa != null && this.Sg != null) {
            if (com.bytedance.sdk.openadsdk.core.model.Wwa.wN(wwa)) {
                try {
                    vcVar = new com.bytedance.sdk.openadsdk.core.GA.Sg.vc(this.Sg, this.tN, this.f10726vc, true, false, this.YFl);
                    vcVar.setVideoCacheUrl(this.YoT);
                    vcVar.setControllerStatusCallBack(new vc.Sg() { // from class: com.bytedance.sdk.openadsdk.core.qsH.YFl.2
                        @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.vc.Sg
                        public void YFl(boolean z10, long j3, long j10, long j11, boolean z11) {
                        }
                    });
                    vcVar.setIsAutoPlay(this.f10725nc);
                    vcVar.setIsQuiet(this.eT);
                } catch (Throwable unused) {
                }
                if (!com.bytedance.sdk.openadsdk.core.model.Wwa.wN(this.tN) && vcVar != null && vcVar.YFl(0L, true, false)) {
                    return vcVar;
                }
            }
            vcVar = null;
            if (!com.bytedance.sdk.openadsdk.core.model.Wwa.wN(this.tN)) {
            }
        }
        return null;
    }

    public void setDislikeInner(UZM uzm) {
        if (uzm instanceof com.bytedance.sdk.openadsdk.tN.tN) {
            this.AlY = (com.bytedance.sdk.openadsdk.tN.tN) uzm;
        }
    }

    public void setDislikeOuter(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        com.bytedance.sdk.openadsdk.core.model.Wwa wwa;
        if (tTDislikeDialogAbstract != null && (wwa = this.tN) != null) {
            tTDislikeDialogAbstract.setMaterialMeta(wwa.uGS(), this.tN.UT());
        }
        this.wN = tTDislikeDialogAbstract;
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        super.setTag("tt_express_backup_fl_tag_26");
    }

    public YFl(@NonNull Context context, String str) {
        super(context);
        this.f10726vc = "embeded_ad";
        this.f10725nc = true;
        this.eT = true;
        this.YoT = str;
        setTag("tt_express_backup_fl_tag_26");
    }

    public void YFl(View view, boolean z10) {
        com.bytedance.sdk.openadsdk.core.Sg.Sg sg2;
        if (view == null) {
            return;
        }
        if (z10) {
            Context context = this.Sg;
            com.bytedance.sdk.openadsdk.core.model.Wwa wwa = this.tN;
            String str = this.f10726vc;
            sg2 = new com.bytedance.sdk.openadsdk.core.Sg.YFl(context, wwa, str, Sco.YFl(str));
        } else {
            Context context2 = this.Sg;
            com.bytedance.sdk.openadsdk.core.model.Wwa wwa2 = this.tN;
            String str2 = this.f10726vc;
            sg2 = new com.bytedance.sdk.openadsdk.core.Sg.Sg(context2, wwa2, str2, Sco.YFl(str2));
        }
        view.setOnTouchListener(sg2);
        view.setOnClickListener(sg2);
        sg2.YFl(new Sg() { // from class: com.bytedance.sdk.openadsdk.core.qsH.YFl.1
            @Override // com.bytedance.sdk.openadsdk.core.qsH.Sg
            public void YFl(View view2, int i10, com.bytedance.sdk.openadsdk.core.model.pDU pdu) {
                YFl.this.YFl(view2, i10, pdu);
            }
        });
    }

    public void YFl(int i10) {
        this.eT = com.bytedance.sdk.openadsdk.core.lG.AlY().tN(String.valueOf(this.NjR));
        int Sg = com.bytedance.sdk.openadsdk.core.lG.AlY().Sg(i10);
        if (3 == Sg) {
            this.f10725nc = false;
            return;
        }
        int tN = com.bytedance.sdk.component.utils.EH.tN(com.bytedance.sdk.openadsdk.core.lG.YFl());
        if (1 != Sg || !Sco.AlY(tN)) {
            if (2 == Sg) {
                if (Sco.wN(tN) || Sco.AlY(tN) || Sco.vc(tN)) {
                    this.f10725nc = true;
                    return;
                }
                return;
            }
            if (5 != Sg) {
                return;
            }
            if (!Sco.AlY(tN) && !Sco.vc(tN)) {
                return;
            }
        }
        this.f10725nc = true;
    }

    public void YFl(View view) {
        com.bytedance.sdk.openadsdk.core.model.Wwa wwa = this.tN;
        if (wwa == null || wwa.BPI() == null || view == null) {
            return;
        }
        YFl(view, this.tN.bZ() == 1 && this.f10725nc);
    }
}
