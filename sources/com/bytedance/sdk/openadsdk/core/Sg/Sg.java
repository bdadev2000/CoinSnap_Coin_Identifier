package com.bytedance.sdk.openadsdk.core.Sg;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.qO;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.NjR;
import com.bytedance.sdk.openadsdk.core.Sg.tN;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.mn;
import com.bytedance.sdk.openadsdk.core.model.Ne;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.model.nc;
import com.bytedance.sdk.openadsdk.core.model.pDU;
import com.bytedance.sdk.openadsdk.utils.GA;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import l5.g;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Sg extends tN {
    private static int Sco = Integer.MIN_VALUE;
    protected Context AlY;
    protected final String DSW;
    protected boolean EH;
    protected PAGNativeAd GA;
    protected WeakReference<View> NjR;
    private WeakReference<Activity> Sg;
    protected PangleAd Wwa;
    private String YFl;
    protected YFl YoT;
    protected int aIu;
    protected nc eT;
    protected Map<String, Object> lG;

    /* renamed from: nc, reason: collision with root package name */
    protected WeakReference<View> f10641nc;
    protected g pDU;
    protected com.bytedance.sdk.openadsdk.core.qsH.Sg qO;
    protected final int qsH;
    protected com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.vc rkt;
    private boolean tN;

    /* renamed from: vc, reason: collision with root package name */
    protected final Wwa f10642vc;
    public pDU wN;

    /* loaded from: classes.dex */
    public interface YFl {
        void YFl(View view, int i10);
    }

    public Sg(@NonNull Context context, @NonNull Wwa wwa, @NonNull String str, int i10) {
        this.EH = false;
        this.aIu = 0;
        this.tN = false;
        this.AlY = context;
        this.f10642vc = wwa;
        this.DSW = str;
        this.qsH = i10;
    }

    public void AlY(boolean z10) {
        this.EH = z10;
    }

    public void Sg(View view) {
        if (view == null) {
            return;
        }
        this.f10641nc = new WeakReference<>(view);
    }

    public boolean YFl(nc ncVar, Map<String, Object> map) {
        return false;
    }

    public void tN(int i10) {
        this.Ga = i10;
    }

    public String vc() {
        return this.YFl;
    }

    public View wN() {
        WeakReference<Activity> weakReference = this.Sg;
        if (weakReference != null && weakReference.get() != null) {
            View findViewById = this.Sg.get().findViewById(520093713);
            View findViewById2 = this.Sg.get().findViewById(520093713);
            if (findViewById == null) {
                return findViewById2;
            }
            return findViewById;
        }
        return null;
    }

    public static boolean tN(View view) {
        return 520093705 == view.getId() || 520093707 == view.getId() || 520093703 == view.getId() || YFl(view.getContext()) == view.getId() || GA.Gmi == view.getId() || GA.cC == view.getId();
    }

    public View AlY() {
        WeakReference<Activity> weakReference = this.Sg;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.Sg.get().findViewById(R.id.content);
    }

    public void Sg(int i10) {
        this.dXO = i10;
    }

    public void YFl(com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.vc vcVar) {
        this.rkt = vcVar;
    }

    public void YFl(com.bytedance.sdk.openadsdk.core.qsH.Sg sg2) {
        this.qO = sg2;
    }

    public void AlY(int i10) {
        this.aIu = i10;
    }

    public void YFl(PAGNativeAd pAGNativeAd) {
        this.GA = pAGNativeAd;
    }

    public void YFl(PangleAd pangleAd) {
        this.Wwa = pangleAd;
    }

    public void YFl(g gVar) {
        this.pDU = gVar;
    }

    public void YFl(YFl yFl) {
        this.YoT = yFl;
    }

    public void YFl(Activity activity) {
        if (activity == null) {
            return;
        }
        this.Sg = new WeakReference<>(activity);
    }

    public Sg(@NonNull Context context, @NonNull Wwa wwa, @NonNull String str, int i10, boolean z10) {
        this(context, wwa, str, i10);
        this.tN = z10;
    }

    public void YFl(View view) {
        if (view == null) {
            return;
        }
        this.NjR = new WeakReference<>(view);
    }

    public void YFl(Map<String, Object> map) {
        Map<String, Object> map2 = this.lG;
        if (map2 != null) {
            map2.putAll(map);
            map.putAll(this.lG);
        }
        this.lG = map;
    }

    public void YFl(int i10) {
        this.Cfr = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.content.Context] */
    @Override // com.bytedance.sdk.openadsdk.core.Sg.tN
    public void YFl(View view, float f10, float f11, float f12, float f13, SparseArray<tN.YFl> sparseArray, boolean z10) {
        int i10;
        boolean z11;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        Wwa wwa;
        if (this.AlY == null) {
            this.AlY = lG.YFl();
        }
        if ((this.tN || !YFl(view, 1, f10, f11, f12, f13, sparseArray, z10)) && this.AlY != null) {
            pDU pdu = this.wN;
            if (pdu != null) {
                int i11 = pdu.YoT;
                JSONObject jSONObject3 = pdu.GA;
                JSONObject jSONObject4 = pdu.lG;
                z11 = pdu.Wwa;
                i10 = i11;
                jSONObject = jSONObject3;
                jSONObject2 = jSONObject4;
            } else {
                i10 = -1;
                z11 = false;
                jSONObject = null;
                jSONObject2 = null;
            }
            long j3 = this.UZM;
            long j10 = this.YI;
            WeakReference<View> weakReference = this.NjR;
            View view2 = weakReference == null ? null : weakReference.get();
            WeakReference<View> weakReference2 = this.f10641nc;
            nc YFl2 = YFl(f10, f11, f12, f13, sparseArray, j3, j10, view2, weakReference2 == null ? null : weakReference2.get(), vc(), GS.wN(this.AlY), GS.DSW(this.AlY), GS.vc(this.AlY), i10, jSONObject, jSONObject2);
            this.eT = YFl2;
            if (YFl(YFl2, this.lG)) {
                return;
            }
            if (this.pDU != null) {
                if (this.lG == null) {
                    this.lG = new HashMap();
                }
                this.lG.put("duration", Long.valueOf(this.pDU.wN()));
            }
            if (!this.tN && !z11) {
                YFl yFl = this.YoT;
                if (yFl != null) {
                    yFl.YFl(view, -1);
                }
                if (YFl(view, z10)) {
                    boolean Sg = Ne.Sg(this.f10642vc);
                    String YFl3 = Sg ? this.DSW : Sco.YFl(this.qsH);
                    if (view != null) {
                        try {
                            if (((Boolean) view.getTag(520093762)).booleanValue()) {
                                mn.YFl(true);
                            }
                        } catch (Exception unused) {
                        }
                    }
                    Activity YFl4 = view != null ? com.bytedance.sdk.component.utils.Sg.YFl(view) : null;
                    boolean YFl5 = mn.YFl(YFl4 == null ? this.AlY : YFl4, this.f10642vc, this.qsH, this.GA, this.Wwa, YFl3, this.rkt, Sg, 0);
                    mn.YFl(false);
                    if (YFl5 || (wwa = this.f10642vc) == null || wwa.Bn() == null || this.f10642vc.Bn().tN() != 2) {
                        Wwa wwa2 = this.f10642vc;
                        if (wwa2 != null && !YFl5 && TextUtils.isEmpty(wwa2.Cqy()) && com.bytedance.sdk.openadsdk.AlY.Sg.YFl(this.DSW)) {
                            com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.DSW.YFl(this.AlY, this.f10642vc, this.DSW).AlY();
                        }
                        com.bytedance.sdk.openadsdk.AlY.tN.YFl(CampaignEx.JSON_NATIVE_VIDEO_CLICK, this.f10642vc, this.eT, this.DSW, YFl5, this.lG, z10 ? 1 : 2);
                        return;
                    }
                    return;
                }
                return;
            }
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(CampaignEx.JSON_NATIVE_VIDEO_CLICK, this.f10642vc, this.eT, this.DSW, true, this.lG, z10 ? 1 : 2);
        }
    }

    public boolean YFl(View view, boolean z10) {
        return YFl(view, this.f10642vc, z10);
    }

    public static boolean YFl(View view, Wwa wwa, boolean z10) {
        if (view != null && wwa != null) {
            try {
                int i10 = com.bytedance.sdk.component.adexpress.dynamic.YFl.aIu;
                String valueOf = String.valueOf(view.getTag(i10));
                if (view.getTag(i10) != null && !TextUtils.isEmpty(valueOf)) {
                    if (CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(valueOf)) {
                        return z10;
                    }
                    return true;
                }
            } catch (Exception unused) {
            }
            if (tN(view)) {
                return wwa.qO() != 1 || z10;
            }
            if (wwa.Wwa() == 1 && !z10) {
                return false;
            }
        }
        return true;
    }

    public nc YFl(float f10, float f11, float f12, float f13, SparseArray<tN.YFl> sparseArray, long j3, long j10, View view, View view2, String str, float f14, int i10, float f15, int i11, JSONObject jSONObject, JSONObject jSONObject2) {
        return new nc.YFl().vc(f10).wN(f11).AlY(f12).tN(f13).Sg(j3).YFl(j10).Sg(GS.YFl(view)).YFl(GS.YFl(view2)).tN(GS.tN(view)).AlY(GS.tN(view2)).AlY(this.Ga).wN(this.dXO).vc(this.Cfr).YFl(sparseArray).Sg(NjR.Sg().YFl() ? 1 : 2).YFl(str).YFl(f14).tN(i10).Sg(f15).YFl(i11).YFl(jSONObject).Sg(jSONObject2).YFl();
    }

    public boolean YFl(View view, int i10, float f10, float f11, float f12, float f13, SparseArray<tN.YFl> sparseArray, boolean z10) {
        if (this.qO == null) {
            return false;
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        WeakReference<View> weakReference = this.f10641nc;
        if (weakReference != null) {
            iArr = GS.YFl(weakReference.get());
            iArr2 = GS.tN(this.f10641nc.get());
        }
        this.qO.YFl(view, i10, new pDU.YFl().AlY(f10).tN(f11).Sg(f12).YFl(f13).Sg(this.UZM).YFl(this.YI).tN(iArr[0]).AlY(iArr[1]).wN(iArr2[0]).vc(iArr2[1]).YFl(sparseArray).YFl(z10).YFl());
        return true;
    }

    private static int YFl(Context context) {
        if (Sco == Integer.MIN_VALUE) {
            Sco = qO.wN(context, "btn_native_creative");
        }
        return Sco;
    }

    public void YFl(String str) {
        this.YFl = str;
    }
}
