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

/* loaded from: classes3.dex */
public class RollingPagerListenrt implements f {
    private NativeListener.FilpListener FilpListening;
    private List<Frame> frames;
    private List<Integer> list = new ArrayList();
    private h reportController;
    private String unit_id;

    @Override // androidx.viewpager.widget.f
    public void onPageScrollStateChanged(int i9) {
    }

    @Override // androidx.viewpager.widget.f
    public void onPageScrolled(int i9, float f9, int i10) {
    }

    @Override // androidx.viewpager.widget.f
    public void onPageSelected(int i9) {
        reportRollBC(i9);
    }

    public void reportRollBC(int i9) {
        NativeListener.FilpListener filpListener = this.FilpListening;
        if (filpListener != null) {
            filpListener.filpEvent(i9);
        }
        if (this.list.contains(Integer.valueOf(i9))) {
            return;
        }
        this.list.add(Integer.valueOf(i9));
        Frame frame = this.frames.get(i9);
        List<CampaignEx> campaigns = frame.getCampaigns();
        if (campaigns != null && !campaigns.isEmpty()) {
            CampaignEx campaignEx = campaigns.get(0);
            StringBuilder sb = new StringBuilder();
            for (int i10 = 0; i10 < campaigns.size(); i10++) {
                campaignEx = campaigns.get(i10);
                if (i10 == campaigns.size() - 1) {
                    sb.append(campaignEx.getId());
                } else {
                    sb.append(campaignEx.getId() + ",");
                }
            }
            HashMap hashMap = new HashMap();
            hashMap.put("rid_n", campaignEx.getRequestId());
            hashMap.put("frame_id", (i9 + 1) + "");
            hashMap.put("template", Integer.valueOf(frame.getTemplate()));
            hashMap.put("cids", sb.toString());
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
