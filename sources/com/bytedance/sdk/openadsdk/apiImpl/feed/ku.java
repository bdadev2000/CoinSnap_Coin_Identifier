package com.bytedance.sdk.openadsdk.apiImpl.feed;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.bannerexpress.zp;
import com.bytedance.sdk.openadsdk.core.dQp;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.utils.FP;
import com.bytedance.sdk.openadsdk.utils.RCv;
import com.bytedance.sdk.openadsdk.utils.YhE;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ku extends PAGNativeAd {
    protected int COT;
    protected int HWF;
    protected final Context KS;
    protected String QR;
    private boolean YW;
    protected zp jU;
    private boolean ku;
    protected final woN lMd;
    protected dQp zp;

    public ku(@NonNull Context context, @NonNull woN won, int i9, boolean z8) {
        if (won == null) {
            tG.lMd("materialMeta can't been null");
        }
        this.lMd = won;
        this.KS = context;
        this.COT = i9;
        this.HWF = won.FGx();
        String KS = YhE.KS(i9);
        this.QR = KS;
        if (z8) {
            this.jU = new zp(context, won, KS);
            this.zp = new dQp(context, this, won, zp(i9), this.jU);
        }
    }

    private List<View> zp(List<View> list, List<View> list2) {
        LinkedList linkedList = new LinkedList();
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                linkedList.add(list.get(i9));
            }
        }
        if (list2 != null && !list2.isEmpty()) {
            int size2 = list2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                linkedList.add(list2.get(i10));
            }
        }
        return linkedList;
    }

    public boolean QR() {
        woN won = this.lMd;
        if (won == null || won.oKZ() == 5 || KVG.jU().KS(this.HWF) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        woN won = this.lMd;
        if (won != null) {
            return won.zpV();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public PAGNativeAdData getNativeAdData() {
        return new jU(ku());
    }

    public zp ku() {
        return this.jU;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d2, String str, String str2) {
        if (!this.YW) {
            RCv.zp(this.lMd, d2, str, str2);
            this.YW = true;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void registerViewForInteraction(@NonNull ViewGroup viewGroup, @NonNull List<View> list, @Nullable List<View> list2, @Nullable View view, PAGNativeAdInteractionListener pAGNativeAdInteractionListener) {
        if (viewGroup == null) {
            tG.lMd("container can't been null");
            return;
        }
        if (list == null) {
            tG.lMd("clickView can't been null");
        } else if (list.size() <= 0) {
            tG.lMd("clickViews size must been more than 1");
        } else {
            zp(viewGroup, null, list, list2, view, new QR(pAGNativeAdInteractionListener));
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void showPrivacyActivity() {
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d2) {
        if (!this.ku) {
            RCv.zp(this.lMd, d2);
            this.ku = true;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void registerViewForInteraction(@NonNull ViewGroup viewGroup, @NonNull List<View> list, @Nullable List<View> list2, @Nullable View view, PAGNativeAdInteractionCallback pAGNativeAdInteractionCallback) {
        registerViewForInteraction(viewGroup, list, list2, view, (PAGNativeAdInteractionListener) pAGNativeAdInteractionCallback);
    }

    private String zp(int i9) {
        if (i9 == 1) {
            return "banner_ad";
        }
        if (i9 != 2) {
            return "embeded_ad";
        }
        return "interaction";
    }

    public void zp(String str) {
        this.QR = str;
    }

    public void zp(@NonNull ViewGroup viewGroup, @NonNull List<View> list, @NonNull List<View> list2, @Nullable List<View> list3, @Nullable View view, final HWF hwf) {
        if (viewGroup == null) {
            tG.lMd("container can't been null");
            return;
        }
        if (list2 == null) {
            tG.lMd("clickView can't been null");
            return;
        }
        if (list2.size() <= 0) {
            tG.lMd("clickViews size must been more than 1");
            return;
        }
        if (QR()) {
            list3 = zp(list2, list3);
        }
        List<View> list4 = list3;
        if (view != null && hwf != null && hwf.lMd()) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.ku.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    final String zp = FP.zp();
                    TTDelegateActivity.zp(ku.this.lMd, zp, new zp.InterfaceC0106zp() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.ku.1.1
                        @Override // com.bytedance.sdk.openadsdk.core.bannerexpress.zp.InterfaceC0106zp
                        public void zp() {
                            hwf.zp();
                            com.bytedance.sdk.openadsdk.core.ku.lMd().jU(zp);
                            PAGMediaView zp2 = ku.this.ku().zp();
                            if (zp2 != null) {
                                zp2.close();
                            }
                        }
                    });
                }
            });
        }
        this.zp.zp(viewGroup, list, list2, list4, view, hwf);
        com.bytedance.sdk.openadsdk.rV.zp.COT.zp(viewGroup, this.lMd, -1);
    }
}
