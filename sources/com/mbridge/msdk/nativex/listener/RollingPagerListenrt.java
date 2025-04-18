package com.mbridge.msdk.nativex.listener;

import android.content.Context;
import androidx.viewpager.widget.f;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.d.c;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.same.report.i;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes4.dex */
public class RollingPagerListenrt implements f {
    private NativeListener.FilpListener FilpListening;
    private List<Frame> frames;
    private List<Integer> list = new ArrayList();
    private h reportController;
    private String unit_id;

    @Override // androidx.viewpager.widget.f
    public void onPageScrollStateChanged(int i10) {
    }

    @Override // androidx.viewpager.widget.f
    public void onPageScrolled(int i10, float f10, int i11) {
    }

    @Override // androidx.viewpager.widget.f
    public void onPageSelected(int i10) {
        reportRollBC(i10);
    }

    public void reportRollBC(int i10) {
        NativeListener.FilpListener filpListener = this.FilpListening;
        if (filpListener != null) {
            filpListener.filpEvent(i10);
        }
        if (this.list.contains(Integer.valueOf(i10))) {
            return;
        }
        this.list.add(Integer.valueOf(i10));
        Frame frame = this.frames.get(i10);
        List<CampaignEx> campaigns = frame.getCampaigns();
        if (campaigns != null && !campaigns.isEmpty()) {
            CampaignEx campaignEx = campaigns.get(0);
            StringBuilder sb2 = new StringBuilder();
            for (int i11 = 0; i11 < campaigns.size(); i11++) {
                campaignEx = campaigns.get(i11);
                if (i11 == campaigns.size() - 1) {
                    sb2.append(campaignEx.getId());
                } else {
                    sb2.append(campaignEx.getId() + ",");
                }
            }
            HashMap hashMap = new HashMap();
            hashMap.put("rid_n", campaignEx.getRequestId());
            hashMap.put("frame_id", (i10 + 1) + "");
            hashMap.put("template", Integer.valueOf(frame.getTemplate()));
            hashMap.put("cids", sb2.toString());
            hashMap.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.unit_id);
            c.a().d(i.a("2000005", hashMap));
        }
    }

    public void setCampList(List<Frame> list, Context context, String str) {
        this.frames = list;
        this.reportController = new h(context, 2);
        this.unit_id = str;
        this.list.clear();
        reportRollBC(0);
    }

    public void setFilpListening(NativeListener.FilpListener filpListener) {
        this.FilpListening = filpListener;
    }
}
