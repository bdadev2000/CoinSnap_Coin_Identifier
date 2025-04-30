package com.bytedance.sdk.openadsdk.core.lMd;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.Gzh;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.ku;
import com.bytedance.sdk.openadsdk.core.lMd.KS;
import com.bytedance.sdk.openadsdk.core.model.YW;
import com.bytedance.sdk.openadsdk.core.model.tG;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.YhE;
import com.bytedance.sdk.openadsdk.utils.vDp;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class lMd extends KS {
    protected zp Bj;
    protected final woN COT;
    protected final String HWF;
    protected Context KS;
    protected Map<String, Object> KVG;
    protected final int QR;
    private boolean UPs;
    protected WeakReference<View> YW;
    protected com.com.bytedance.overseas.sdk.zp.KS dQp;
    protected YW dT;
    public tG jU;
    protected WeakReference<View> ku;
    private WeakReference<Activity> lMd;
    protected int pvr;
    protected boolean rV;
    protected com.bykv.vk.openvk.component.video.api.jU.KS tG;
    protected PAGNativeAd vDp;
    protected com.bytedance.sdk.openadsdk.core.nativeexpress.zp vwr;
    protected PangleAd woN;
    private String zp;

    /* loaded from: classes.dex */
    public interface zp {
        void zp(View view, int i9);
    }

    public lMd(@NonNull Context context, @NonNull woN won, @NonNull String str, int i9) {
        this.rV = false;
        this.pvr = 0;
        this.UPs = false;
        this.KS = context;
        this.COT = won;
        this.HWF = str;
        this.QR = i9;
    }

    public View COT() {
        WeakReference<Activity> weakReference = this.lMd;
        if (weakReference != null && weakReference.get() != null) {
            View findViewById = this.lMd.get().findViewById(520093713);
            View findViewById2 = this.lMd.get().findViewById(520093713);
            if (findViewById == null) {
                return findViewById2;
            }
            return findViewById;
        }
        return null;
    }

    public String HWF() {
        return this.zp;
    }

    public void KS(int i9) {
        this.Lij = i9;
    }

    public void jU(boolean z8) {
        this.rV = z8;
    }

    public void lMd(View view) {
        if (view == null) {
            return;
        }
        this.YW = new WeakReference<>(view);
    }

    public boolean zp(YW yw, Map<String, Object> map) {
        return false;
    }

    public static boolean KS(View view) {
        return 520093705 == view.getId() || 520093707 == view.getId() || 520093703 == view.getId() || cz.COT(view.getContext(), "btn_native_creative") == view.getId() || vDp.xg == view.getId() || vDp.ea == view.getId();
    }

    public View jU() {
        WeakReference<Activity> weakReference = this.lMd;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.lMd.get().findViewById(R.id.content);
    }

    public void lMd(int i9) {
        this.Gzh = i9;
    }

    public void zp(com.com.bytedance.overseas.sdk.zp.KS ks) {
        this.dQp = ks;
    }

    public void zp(com.bytedance.sdk.openadsdk.core.nativeexpress.zp zpVar) {
        this.vwr = zpVar;
    }

    public void jU(int i9) {
        this.pvr = i9;
    }

    public void zp(PAGNativeAd pAGNativeAd) {
        this.vDp = pAGNativeAd;
    }

    public void zp(PangleAd pangleAd) {
        this.woN = pangleAd;
    }

    public void zp(com.bykv.vk.openvk.component.video.api.jU.KS ks) {
        this.tG = ks;
    }

    public void zp(zp zpVar) {
        this.Bj = zpVar;
    }

    public void zp(Activity activity) {
        if (activity == null) {
            return;
        }
        this.lMd = new WeakReference<>(activity);
    }

    public lMd(@NonNull Context context, @NonNull woN won, @NonNull String str, int i9, boolean z8) {
        this(context, won, str, i9);
        this.UPs = z8;
    }

    public void zp(View view) {
        if (view == null) {
            return;
        }
        this.ku = new WeakReference<>(view);
    }

    public void zp(Map<String, Object> map) {
        Map<String, Object> map2 = this.KVG;
        if (map2 != null) {
            map2.putAll(map);
            map.putAll(this.KVG);
        }
        this.KVG = map;
    }

    public void zp(int i9) {
        this.irS = i9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [android.content.Context] */
    @Override // com.bytedance.sdk.openadsdk.core.lMd.KS
    public void zp(View view, float f9, float f10, float f11, float f12, SparseArray<KS.zp> sparseArray, boolean z8) {
        int i9;
        JSONObject jSONObject;
        woN won;
        if (this.KS == null) {
            this.KS = KVG.zp();
        }
        if ((this.UPs || !zp(view, 1, f9, f10, f11, f12, sparseArray, z8)) && this.KS != null) {
            tG tGVar = this.jU;
            if (tGVar != null) {
                int i10 = tGVar.vDp;
                jSONObject = tGVar.tG;
                i9 = i10;
            } else {
                i9 = -1;
                jSONObject = null;
            }
            long j7 = this.ox;
            long j9 = this.RCv;
            WeakReference<View> weakReference = this.ku;
            View view2 = weakReference == null ? null : weakReference.get();
            WeakReference<View> weakReference2 = this.YW;
            YW zp2 = zp(f9, f10, f11, f12, sparseArray, j7, j9, view2, weakReference2 == null ? null : weakReference2.get(), HWF(), WNy.COT(this.KS), WNy.QR(this.KS), WNy.HWF(this.KS), i9, jSONObject);
            this.dT = zp2;
            if (zp(zp2, this.KVG)) {
                return;
            }
            if (this.tG != null) {
                if (this.KVG == null) {
                    this.KVG = new HashMap();
                }
                this.KVG.put("duration", Long.valueOf(this.tG.COT()));
            }
            if (this.UPs) {
                com.bytedance.sdk.openadsdk.lMd.KS.zp(CampaignEx.JSON_NATIVE_VIDEO_CLICK, this.COT, this.dT, this.HWF, true, this.KVG, z8 ? 1 : 2);
                return;
            }
            zp zpVar = this.Bj;
            if (zpVar != null) {
                zpVar.zp(view, -1);
            }
            if (zp(view, z8)) {
                boolean lMd = com.bytedance.sdk.openadsdk.core.model.cz.lMd(this.COT);
                String zp3 = lMd ? this.HWF : YhE.zp(this.QR);
                if (view != null) {
                    try {
                        if (((Boolean) view.getTag(520093762)).booleanValue()) {
                            Gzh.zp(true);
                        }
                    } catch (Exception unused) {
                    }
                }
                Activity zp4 = view != null ? com.bytedance.sdk.component.utils.lMd.zp(view) : null;
                boolean zp5 = Gzh.zp(zp4 == null ? this.KS : zp4, this.COT, this.QR, this.vDp, this.woN, zp3, this.dQp, lMd, 0);
                Gzh.zp(false);
                if (zp5 || (won = this.COT) == null || won.fs() == null || this.COT.fs().KS() != 2) {
                    woN won2 = this.COT;
                    if (won2 != null && !zp5 && TextUtils.isEmpty(won2.aax()) && com.bytedance.sdk.openadsdk.lMd.lMd.zp(this.HWF)) {
                        com.com.bytedance.overseas.sdk.zp.jU.zp(this.KS, this.COT, this.HWF).jU();
                    }
                    com.bytedance.sdk.openadsdk.lMd.KS.zp(CampaignEx.JSON_NATIVE_VIDEO_CLICK, this.COT, this.dT, this.HWF, zp5, this.KVG, z8 ? 1 : 2);
                }
            }
        }
    }

    public boolean zp(View view, boolean z8) {
        return zp(view, this.COT, z8);
    }

    public static boolean zp(View view, woN won, boolean z8) {
        if (view != null && won != null) {
            try {
                int i9 = com.bytedance.sdk.component.adexpress.dynamic.zp.cz;
                String valueOf = String.valueOf(view.getTag(i9));
                if (view.getTag(i9) != null && !TextUtils.isEmpty(valueOf)) {
                    if (CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(valueOf)) {
                        return z8;
                    }
                    return true;
                }
            } catch (Exception unused) {
            }
            if (KS(view)) {
                return won.woN() != 1 || z8;
            }
            if (won.KVG() == 1 && !z8) {
                return false;
            }
        }
        return true;
    }

    public YW zp(float f9, float f10, float f11, float f12, SparseArray<KS.zp> sparseArray, long j7, long j9, View view, View view2, String str, float f13, int i9, float f14, int i10, JSONObject jSONObject) {
        return new YW.zp().HWF(f9).COT(f10).jU(f11).KS(f12).lMd(j7).zp(j9).lMd(WNy.zp(view)).zp(WNy.zp(view2)).KS(WNy.KS(view)).jU(WNy.KS(view2)).jU(this.Lij).COT(this.Gzh).HWF(this.irS).zp(sparseArray).lMd(ku.lMd().zp() ? 1 : 2).zp(str).zp(f13).KS(i9).lMd(f14).zp(i10).zp(jSONObject).zp();
    }

    public boolean zp(View view, int i9, float f9, float f10, float f11, float f12, SparseArray<KS.zp> sparseArray, boolean z8) {
        if (this.vwr == null) {
            return false;
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        WeakReference<View> weakReference = this.YW;
        if (weakReference != null) {
            iArr = WNy.zp(weakReference.get());
            iArr2 = WNy.KS(this.YW.get());
        }
        this.vwr.zp(view, i9, new tG.zp().jU(f9).KS(f10).lMd(f11).zp(f12).lMd(this.ox).zp(this.RCv).KS(iArr[0]).jU(iArr[1]).COT(iArr2[0]).HWF(iArr2[1]).zp(sparseArray).zp(z8).zp());
        return true;
    }

    public void zp(String str) {
        this.zp = str;
    }
}
