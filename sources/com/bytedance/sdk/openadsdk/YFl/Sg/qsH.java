package com.bytedance.sdk.openadsdk.YFl.Sg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.VOe.YFl.wN;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.NjR;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.rkt;
import com.bytedance.sdk.openadsdk.core.tN.AlY;
import com.bytedance.sdk.openadsdk.utils.Ne;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.bytedance.sdk.openadsdk.utils.dXO;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class qsH extends PAGNativeAd {
    protected YFl AlY;
    protected String DSW;
    private boolean NjR;
    protected final Wwa Sg;
    protected rkt YFl;
    private boolean qsH;
    protected final Context tN;

    /* renamed from: vc, reason: collision with root package name */
    protected int f10526vc;
    protected int wN;

    public qsH(@NonNull Context context, @NonNull Wwa wwa, int i10, boolean z10) {
        if (wwa == null) {
            YoT.Sg("materialMeta can't been null");
        }
        this.Sg = wwa;
        this.tN = context;
        this.wN = i10;
        this.f10526vc = wwa.kU();
        String tN = Sco.tN(i10);
        this.DSW = tN;
        if (z10) {
            this.AlY = new YFl(context, wwa, tN);
            this.YFl = new rkt(context, this, wwa, YFl(i10), this.AlY);
        }
    }

    private String YFl(int i10) {
        return i10 != 1 ? i10 != 2 ? "embeded_ad" : "interaction" : "banner_ad";
    }

    public boolean DSW() {
        Wwa wwa = this.Sg;
        if (wwa == null || wwa.ko() == 5 || lG.AlY().tN(this.f10526vc) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        Wwa wwa = this.Sg;
        if (wwa != null && wwa.AfY() != null) {
            try {
                return this.Sg.AfY().get(str);
            } catch (Throwable th2) {
                YoT.YFl("TTNativeAdImpl", th2.getMessage());
                return null;
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        Wwa wwa = this.Sg;
        if (wwa != null) {
            return wwa.AfY();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public PAGNativeAdData getNativeAdData() {
        return new AlY(qsH());
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d10, String str, String str2) {
        if (!this.NjR) {
            dXO.YFl(this.Sg, d10, str, str2);
            this.NjR = true;
        }
    }

    public YFl qsH() {
        return this.AlY;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void registerViewForInteraction(@NonNull ViewGroup viewGroup, @NonNull List<View> list, @Nullable List<View> list2, @Nullable View view, PAGNativeAdInteractionListener pAGNativeAdInteractionListener) {
        if (viewGroup == null) {
            YoT.Sg("container can't been null");
            return;
        }
        if (list == null) {
            YoT.Sg("clickView can't been null");
        } else if (list.size() <= 0) {
            YoT.Sg("clickViews size must been more than 1");
        } else {
            YFl(viewGroup, null, list, list2, view, new DSW(pAGNativeAdInteractionListener));
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void showPrivacyActivity() {
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d10) {
        if (!this.qsH) {
            dXO.YFl(this.Sg, d10);
            this.qsH = true;
        }
    }

    private List<View> YFl(List<View> list, List<View> list2) {
        LinkedList linkedList = new LinkedList();
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                linkedList.add(list.get(i10));
            }
        }
        if (list2 != null && !list2.isEmpty()) {
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                linkedList.add(list2.get(i11));
            }
        }
        return linkedList;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void registerViewForInteraction(@NonNull ViewGroup viewGroup, @NonNull List<View> list, @Nullable List<View> list2, @Nullable View view, PAGNativeAdInteractionCallback pAGNativeAdInteractionCallback) {
        registerViewForInteraction(viewGroup, list, list2, view, (PAGNativeAdInteractionListener) pAGNativeAdInteractionCallback);
    }

    public void YFl(String str) {
        this.DSW = str;
    }

    public void YFl(@NonNull ViewGroup viewGroup, @NonNull List<View> list, @NonNull List<View> list2, @Nullable List<View> list3, @Nullable View view, final vc vcVar) {
        if (viewGroup == null) {
            YoT.Sg("container can't been null");
            return;
        }
        if (list2 == null) {
            YoT.Sg("clickView can't been null");
            return;
        }
        if (list2.size() <= 0) {
            YoT.Sg("clickViews size must been more than 1");
            return;
        }
        if (DSW()) {
            list3 = YFl(list2, list3);
        }
        List<View> list4 = list3;
        if (view != null && vcVar != null && vcVar.Sg()) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.YFl.Sg.qsH.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    final String YFl = Ne.YFl();
                    TTDelegateActivity.YFl(qsH.this.Sg, YFl, new AlY.YFl() { // from class: com.bytedance.sdk.openadsdk.YFl.Sg.qsH.1.1
                        @Override // com.bytedance.sdk.openadsdk.core.tN.AlY.YFl
                        public void YFl() {
                            vcVar.YFl();
                            NjR.Sg().vc(YFl);
                            PAGMediaView YFl2 = qsH.this.qsH().YFl();
                            if (YFl2 != null) {
                                YFl2.close();
                            }
                        }
                    });
                }
            });
        }
        this.YFl.YFl(viewGroup, list, list2, list4, view, vcVar);
        Wwa wwa = this.Sg;
        com.bytedance.sdk.openadsdk.VOe.YFl.wN.YFl(viewGroup, this.Sg, (wwa == null || wwa.Ne() != 2) ? null : new wN.YFl(this.Sg.UZM()));
    }
}
