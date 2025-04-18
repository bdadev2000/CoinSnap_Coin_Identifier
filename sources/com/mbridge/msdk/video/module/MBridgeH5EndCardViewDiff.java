package com.mbridge.msdk.video.module;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.mbridge.msdk.click.a;
import com.mbridge.msdk.click.i;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbsignalcommon.mraid.b;
import com.mbridge.msdk.video.signal.h;

/* loaded from: classes4.dex */
public abstract class MBridgeH5EndCardViewDiff extends MBridgeBaseView implements i, b, h {
    public String unitId;

    public MBridgeH5EndCardViewDiff(Context context) {
        super(context);
    }

    public void open(String str) {
        try {
            String clickURL = this.f15895b.getClickURL();
            if (!TextUtils.isEmpty(str)) {
                this.f15895b.setClickURL(str);
                reportOpen(str);
            }
            a aVar = new a(getContext(), this.unitId);
            aVar.a(this);
            aVar.a(this.f15895b);
            this.f15895b.setClickURL(clickURL);
            this.notifyListener.a(126, "");
        } catch (Exception e2) {
            ad.b(MBridgeBaseView.TAG, e2.getMessage());
        }
    }

    public void reportOpen(String str) {
        CampaignEx mraidCampaign = getMraidCampaign();
        if (mraidCampaign != null) {
            new com.mbridge.msdk.foundation.same.report.h(getContext()).a(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.unitId, str, this.f15895b.isBidCampaign());
        }
    }

    public MBridgeH5EndCardViewDiff(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
