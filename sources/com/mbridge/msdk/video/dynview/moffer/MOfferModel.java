package com.mbridge.msdk.video.dynview.moffer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.applovin.impl.L;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.f.e;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ao;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.system.NoProGuard;
import com.mbridge.msdk.tracker.network.h;
import com.mbridge.msdk.video.dynview.e.g;
import com.mbridge.msdk.video.dynview.endcard.expose.OnItemExposeListener;
import com.mbridge.msdk.video.dynview.widget.MBridgeRelativeLayout;
import com.mbridge.msdk.video.dynview.widget.ObservableScrollView;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class MOfferModel implements NoProGuard {
    private static final String MOF_LOAD_RESULT_CODE_OFFER_LESS_THAN_5 = "12930014";
    private static final String MOF_LOAD_RESULT_FAILED = "2";
    private static final String MOF_LOAD_RESULT_SUCCESS = "1";
    private static final String TAG = "MOfferModel";
    private int admf;
    private int admftm;
    private List<Integer> cacheImpressionReportList;
    private List<Integer> cacheOnlyImpressionReportList;
    private boolean isShowMoreOffer;
    private CampaignUnit mCampaignUnit;
    private Context mContext;
    private LinearLayout mLinearLayout;
    private CampaignEx mMainOfferCampaignEx;
    private g mMoreOfferLayoutListener;
    private com.mbridge.msdk.video.module.a.a mNotifyListener;
    private ObservableScrollView mObservableScrollView;
    private e mParam;
    private String mRid;
    private String mUnitId;
    private MBridgeRelativeLayout viewMofferLayout;
    private final String VALUE_MOF_TYPE = "1";
    private final String VALUE_H5_TYPE = "1";
    private final String VALUE_MOF = "1";
    private final String VALUE_COUNTRY_CODE = "CN";
    private final String VALUE_MOF_VER = "1";
    private final String VALUE_OFF_SET = "0";
    private final String VALUE_CATEGORY = "0";
    private final String VALUE_ONLY_IMPRESSION = "1";
    private final String VALUE_PING_MODE = "1";
    private final String VALUE_HTTP_REQ = "2";
    private final String VALUE_AD_NUM = "20";
    private final String VALUE_TNUM = "20";
    private final String VALUE_API_VERSION = "2.3";
    private final String VALUE_DEFAULT_VIDEO_TEMP_ID = "404";

    /* renamed from: K, reason: collision with root package name */
    private final String f18707K = CampaignEx.JSON_KEY_AD_K;
    private final String MOF_TEST_UID = "mof_testuid";
    private final String MCC = "mcc";
    private final String MOF_UID = "mof_uid";
    private final String MNC = "mnc";
    private final String RV_TID = "rv_tid";
    private final String EC_ID = "ecid";
    private final String TP_LGP = "tplgp";
    private final String V_FMD5 = "v_fmd5";
    private final String I_FMD5 = "i_fmd5";
    private final String APP_ID = MBridgeConstans.APP_ID;
    private final String SIGN = "sign";
    private final String PARENT_UNIT = "parent_unit";

    /* renamed from: E, reason: collision with root package name */
    private final String f18706E = "e";
    private final String MOF_TYPE = "mof_type";
    private final String H5_TYPE = "h5_type";
    private final String MOF = "mof";
    private final String COUNTRY_CODE = "country_code";
    private final String MOF_VER = "mof_ver";
    private final String CRT_CID = "crt_cid";
    private final String CRT_RID = "crt_rid";
    private final String H5_T = "h5_t";
    private final String MOF_T = "mof_t";
    private final String MOF_DATA = "mof_data";
    private final String IMEI = "imei";
    private final String OFFER_ID = "offer_id";
    private final String OFF_SET = "offset";
    private final String CATEGORY = "category";
    private final String ONLY_IMPRESSION = "only_impression";
    private final String PING_MODE = "ping_mode";
    private final String HTTP_REQ = "http_req";
    private final String AD_NUM = "ad_num";
    private final String TNUM = "tnum";
    private final String API_VERSION = "api_version";
    private final String MOF_DOMAIN = "mof_domain";
    private final String PARENT_ID = "parent_id";
    private final String MOF_PARENT_ID = "mof_parent_id";
    private final String MOF_CALLBACK_DATE = "mcd";
    private final String UC_PARENT_UNIT = "uc_parent_unit";
    private final String DEFAULT_PATH_V3 = "/openapi/ad/v3";
    private final String PARENT_EXCHANGE = "parent_exchange";
    private final String PARENT_AD_TYPE = "parent_ad_type";
    private final String PARENT_TEMPLATE_ID = "parent_template_id";
    private final String ONE_ID = "oneId";
    private final String DY_VIEW = "dy_view";
    private final String MORE_OFFER_DEFAULT_UNIT_ID = "117361";
    private final String MORE_OFFER_DEFAULT_APP_ID = "92762";
    private final String MORE_OFFER_DEFAULT_APP_KEY = "936dcbdd57fe235fd7cf61c2e93da3c4";
    private final String MORE_OFFER_LOAD_SUCCESS = "more offer load success";
    private final String MORE_OFFER_LOAD_FAILED = "more offer load failed";
    private final String MORE_OFFER_SHOW = "more offer show";
    private final String MORE_OFFER_CLICK = "more offer click";
    private final String MORE_OFFER_SHOW_FAILED = "more offer show fail";
    private final String UNIT_ID = MBridgeConstans.PROPERTIES_UNIT_ID;
    private final String R_ID = "r_id";
    private final int DO_ACTION_IMPRESSION = 0;
    private final int DO_ACTION_ONLY_IMPRESSION = 1;
    private volatile boolean hasReportMoreOfferLoad = false;
    private volatile boolean hasReportMoreOfferShow = false;
    private int bitmapSuccessCount = 0;
    private List<Integer> mImpressionId = new ArrayList();
    private int mControlShowSize = 0;
    private boolean isOnlyImpShow = false;
    private boolean mHasReportMofScenes = false;
    private boolean mIsRetry = false;
    private int mFromType = 0;
    private OnItemExposeListener onItemExposeListener = new OnItemExposeListener() { // from class: com.mbridge.msdk.video.dynview.moffer.MOfferModel.1
        @Override // com.mbridge.msdk.video.dynview.endcard.expose.OnItemExposeListener
        public final void onItemViewFirstVisible() {
            if (MOfferModel.this.viewMofferLayout != null && MOfferModel.this.isOnlyImpShow) {
                if (MOfferModel.this.viewMofferLayout.getVisibility() == 0) {
                    try {
                        com.mbridge.msdk.video.dynview.f.a.a(MOfferModel.this.mCampaignUnit, 0, 1, "117361");
                        return;
                    } catch (Exception e4) {
                        e4.printStackTrace();
                        return;
                    }
                }
                if (MOfferModel.this.cacheOnlyImpressionReportList == null) {
                    MOfferModel.this.cacheOnlyImpressionReportList = new ArrayList();
                }
                MOfferModel.this.cacheOnlyImpressionReportList.add(0);
            }
        }

        @Override // com.mbridge.msdk.video.dynview.endcard.expose.OnItemExposeListener
        public final void onItemViewVisible(boolean z8, int i9) {
            if (MOfferModel.this.viewMofferLayout == null) {
                return;
            }
            if (MOfferModel.this.viewMofferLayout.getVisibility() == 0) {
                if (!MOfferModel.this.hasReportMoreOfferShow) {
                    com.mbridge.msdk.video.dynview.f.a.a(MOfferModel.this.mMainOfferCampaignEx, com.mbridge.msdk.foundation.controller.c.m().c(), "more offer show", MOfferModel.this.mUnitId, MOfferModel.this.mRid);
                    MOfferModel.this.hasReportMoreOfferShow = true;
                }
                try {
                    com.mbridge.msdk.video.dynview.f.a.a(MOfferModel.this.mCampaignUnit, i9, 0, "117361");
                    return;
                } catch (Exception e4) {
                    e4.printStackTrace();
                    return;
                }
            }
            if (MOfferModel.this.cacheImpressionReportList == null) {
                MOfferModel.this.cacheImpressionReportList = new ArrayList();
            }
            if (!MOfferModel.this.cacheImpressionReportList.contains(Integer.valueOf(i9))) {
                MOfferModel.this.cacheImpressionReportList.add(Integer.valueOf(i9));
            }
        }
    };
    private c mMoreOfferShowCallBack = new c() { // from class: com.mbridge.msdk.video.dynview.moffer.MOfferModel.2
        @Override // com.mbridge.msdk.video.dynview.moffer.c
        public final void a(List<View> list) {
            TextView textView;
            if (MOfferModel.this.viewMofferLayout != null && (textView = (TextView) MOfferModel.this.viewMofferLayout.findViewById(MOfferModel.this.findID("mbridge_reward_end_card_like_tv"))) != null) {
                textView.setVisibility(0);
            }
        }
    };

    public static /* synthetic */ int access$2208(MOfferModel mOfferModel) {
        int i9 = mOfferModel.bitmapSuccessCount;
        mOfferModel.bitmapSuccessCount = i9 + 1;
        return i9;
    }

    private void addLikeTextView() {
        TextView textView;
        MBridgeRelativeLayout mBridgeRelativeLayout = this.viewMofferLayout;
        if (mBridgeRelativeLayout == null || (textView = (TextView) mBridgeRelativeLayout.findViewById(findID("mbridge_reward_end_card_like_tv"))) == null) {
            return;
        }
        textView.setTextColor(Color.parseColor("#FF000000"));
        textView.setTextSize(10.0f);
        if (z.s(com.mbridge.msdk.foundation.controller.c.m().c()).contains("zh")) {
            textView.setEms(1);
            textView.getLayoutParams().width = L.a(30.0f);
            textView.setText("猜你喜欢");
        } else {
            textView.setText("Just\nfor\nYou");
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.dynview.moffer.MOfferModel.9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (MOfferModel.this.mObservableScrollView != null) {
                    if (MOfferModel.this.mObservableScrollView.getVisibility() == 0) {
                        MOfferModel.this.mObservableScrollView.setVisibility(8);
                    } else {
                        MOfferModel.this.mObservableScrollView.setVisibility(0);
                    }
                }
                try {
                    new com.mbridge.msdk.video.dynview.h.b().a(MOfferModel.this.mLinearLayout, 300L);
                } catch (Exception e4) {
                    ad.b(MOfferModel.TAG, e4.getMessage());
                }
            }
        });
    }

    private View buildItemView(final int i9) {
        Context context = this.mContext;
        if (context == null) {
            return null;
        }
        final View inflate = LayoutInflater.from(this.mContext).inflate(v.a(context, "mbridge_reward_end_card_more_offer_item", TtmlNode.TAG_LAYOUT), (ViewGroup) null, false);
        int a6 = v.a(this.mContext, "mbridge_reward_end_card_item_iv", "id");
        if (inflate == null) {
            return null;
        }
        setOfferData(this.mCampaignUnit.getAds(), i9, (RoundImageView) inflate.findViewById(a6), (TextView) inflate.findViewById(v.a(this.mContext, "mbridge_reward_end_card_item_title_tv", "id")));
        inflate.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.dynview.moffer.MOfferModel.7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CampaignEx campaignEx;
                try {
                    if (MOfferModel.this.mCampaignUnit != null && MOfferModel.this.mCampaignUnit.ads != null && MOfferModel.this.mCampaignUnit.ads.size() > 0 && (campaignEx = MOfferModel.this.mCampaignUnit.ads.get(i9)) != null) {
                        if (MOfferModel.this.mNotifyListener != null) {
                            MOfferModel mOfferModel = MOfferModel.this;
                            mOfferModel.callBackClick(mOfferModel.mNotifyListener);
                        }
                        com.mbridge.msdk.video.dynview.f.a.a(MOfferModel.this.mMainOfferCampaignEx, com.mbridge.msdk.foundation.controller.c.m().c(), "more offer click", MOfferModel.this.mUnitId, MOfferModel.this.mRid);
                        com.mbridge.msdk.video.dynview.f.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), campaignEx, MOfferModel.this.mUnitId, inflate);
                    }
                } catch (Exception e4) {
                    ad.b(MOfferModel.TAG, e4.getMessage());
                }
            }
        });
        return inflate;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:5|(1:7)|8|(2:9|10)|(21:14|15|(1:17)(1:53)|18|19|(1:21)(1:52)|22|(1:24)(1:51)|25|(2:27|(1:29)(1:49))(1:50)|30|(1:32)(1:48)|33|(1:35)(1:47)|36|37|38|39|(1:41)|42|43)|55|15|(0)(0)|18|19|(0)(0)|22|(0)(0)|25|(0)(0)|30|(0)(0)|33|(0)(0)|36|37|38|39|(0)|42|43) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01e3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01e4, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void buildRequestParams(com.mbridge.msdk.foundation.entity.CampaignEx r28) {
        /*
            Method dump skipped, instructions count: 621
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.dynview.moffer.MOfferModel.buildRequestParams(com.mbridge.msdk.foundation.entity.CampaignEx):void");
    }

    private void buildScrollViewGroup() {
        if (this.mContext != null && this.viewMofferLayout != null && this.mMainOfferCampaignEx != null) {
            this.mLinearLayout = new LinearLayout(this.mContext);
            this.mLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
            this.mLinearLayout.setOrientation(0);
            this.mLinearLayout.setGravity(17);
            for (int i9 = 0; i9 < this.mCampaignUnit.ads.size(); i9++) {
                View buildItemView = buildItemView(i9);
                if (buildItemView != null) {
                    this.mLinearLayout.addView(buildItemView);
                }
            }
            this.mObservableScrollView.addView(this.mLinearLayout);
            this.mObservableScrollView.setOnTouchListener(new View.OnTouchListener() { // from class: com.mbridge.msdk.video.dynview.moffer.MOfferModel.6
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 1) {
                        MOfferModel.this.checkViewVisiableState();
                        return false;
                    }
                    return false;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callBackClick(com.mbridge.msdk.video.module.a.a aVar) {
        if (aVar == null) {
            return;
        }
        aVar.a(128, "");
    }

    private void createMoreOfferList() {
        MBridgeRelativeLayout mBridgeRelativeLayout = this.viewMofferLayout;
        if (mBridgeRelativeLayout == null) {
            return;
        }
        this.mObservableScrollView = (ObservableScrollView) mBridgeRelativeLayout.findViewById(findID("mbridge_moreoffer_hls"));
        buildScrollViewGroup();
        addLikeTextView();
        showView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createMoreOfferView() {
        CampaignUnit campaignUnit = this.mCampaignUnit;
        if (campaignUnit == null || this.mContext == null || campaignUnit.getAds() == null || this.mCampaignUnit.getAds().size() == 0) {
            return;
        }
        setMoreOfferLayoutCallBack();
        createMoreOfferList();
    }

    private void doAdmfContorl() {
        JSONObject jSONObject;
        try {
            CampaignEx campaignEx = this.mMainOfferCampaignEx;
            if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getMoreOfferJsonData())) {
                JSONObject jSONObject2 = new JSONObject(this.mMainOfferCampaignEx.getMoreOfferJsonData());
                int i9 = this.mFromType;
                if (i9 != 1) {
                    if (i9 != 2) {
                        jSONObject = null;
                    } else {
                        jSONObject = jSONObject2.getJSONObject(CampaignEx.ENDCARD_URL);
                    }
                } else {
                    jSONObject = jSONObject2.getJSONObject("template_url");
                }
                if (jSONObject == null) {
                    return;
                }
                if (jSONObject.has(MBridgeConstans.DYNAMIC_VIEW_MORE_OFFER_ADMFTM)) {
                    this.admftm = jSONObject.getInt(MBridgeConstans.DYNAMIC_VIEW_MORE_OFFER_ADMFTM);
                }
                if (jSONObject.has(MBridgeConstans.DYNAMIC_VIEW_MORE_OFFER_ADMF)) {
                    this.admf = jSONObject.getInt(MBridgeConstans.DYNAMIC_VIEW_MORE_OFFER_ADMF);
                }
            }
        } catch (Exception e4) {
            ad.b(TAG, e4.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doControllableImpOnRequest() {
        CampaignUnit campaignUnit = this.mCampaignUnit;
        if (campaignUnit == null) {
            return;
        }
        try {
            com.mbridge.msdk.video.dynview.f.a.a(campaignUnit, 0, 1, "117361");
            this.isOnlyImpShow = true;
            if (this.mCampaignUnit.getAds() == null) {
                return;
            }
            int size = this.mCampaignUnit.getAds().size();
            if (this.admf >= size) {
                this.admf = size;
            }
            if (this.mImpressionId == null) {
                this.mImpressionId = new ArrayList();
            }
            for (int i9 = 0; i9 < this.admf; i9++) {
                if (!this.mImpressionId.contains(Integer.valueOf(i9))) {
                    com.mbridge.msdk.video.dynview.f.a.a(this.mCampaignUnit, i9, 0, "117361");
                    this.mImpressionId.add(Integer.valueOf(i9));
                }
            }
        } catch (Exception e4) {
            ad.b(TAG, e4.getMessage());
        }
    }

    private void doControllableImpOnShow(int i9) {
        CampaignUnit campaignUnit = this.mCampaignUnit;
        if (campaignUnit == null || campaignUnit.getAds() == null) {
            return;
        }
        try {
            int size = this.mCampaignUnit.getAds().size();
            if (this.mControlShowSize == 0) {
                this.mControlShowSize = this.admf + i9;
            }
            if (this.mControlShowSize >= size) {
                this.mControlShowSize = size;
            }
            while (i9 < this.mControlShowSize) {
                if (!this.mImpressionId.contains(Integer.valueOf(i9))) {
                    com.mbridge.msdk.video.dynview.f.a.a(this.mCampaignUnit, i9, 0, "117361");
                    this.mImpressionId.add(Integer.valueOf(i9));
                }
                i9++;
            }
        } catch (Exception e4) {
            ad.b(TAG, e4.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int findID(String str) {
        return v.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, "id");
    }

    private void initData() {
        String str;
        CampaignEx campaignEx = this.mMainOfferCampaignEx;
        if (campaignEx != null && this.mContext != null) {
            buildRequestParams(campaignEx);
            if (this.mParam == null) {
                return;
            }
            com.mbridge.msdk.video.dynview.f.b bVar = new com.mbridge.msdk.video.dynview.f.b(this.mContext);
            com.mbridge.msdk.video.dynview.f.a.a aVar = new com.mbridge.msdk.video.dynview.f.a.a() { // from class: com.mbridge.msdk.video.dynview.moffer.MOfferModel.3
                @Override // com.mbridge.msdk.video.dynview.f.a.a
                public final void a(List<h> list, CampaignUnit campaignUnit) {
                    if (MOfferModel.this.mParam != null && campaignUnit != null) {
                        try {
                            MOfferModel mOfferModel = MOfferModel.this;
                            mOfferModel.mUnitId = mOfferModel.mParam.a().get(MBridgeConstans.PROPERTIES_UNIT_ID);
                            MOfferModel mOfferModel2 = MOfferModel.this;
                            mOfferModel2.mRid = mOfferModel2.mParam.a().get("r_id");
                            if (campaignUnit.getAds() == null || campaignUnit.getAds().size() < 5) {
                                if (!MOfferModel.this.hasReportMoreOfferLoad) {
                                    com.mbridge.msdk.video.dynview.f.a.a(MOfferModel.this.mMainOfferCampaignEx, com.mbridge.msdk.foundation.controller.c.m().c(), "more offer load failed errorCode: -999 errorMsg: The campaign quantity less than 5.", MOfferModel.this.mUnitId, MOfferModel.this.mRid);
                                    MOfferModel.this.hasReportMoreOfferLoad = true;
                                }
                                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                                dVar.a("result", "2");
                                dVar.a("code", MOfferModel.MOF_LOAD_RESULT_CODE_OFFER_LESS_THAN_5);
                                if (MOfferModel.this.mIsRetry) {
                                    dVar.a("retry", "1");
                                }
                                com.mbridge.msdk.foundation.same.report.d.c.a().a("m_mof_req_result", MOfferModel.this.mMainOfferCampaignEx, dVar);
                                a.a().b();
                                return;
                            }
                            MOfferModel.this.mCampaignUnit = campaignUnit;
                            if (MOfferModel.this.admf > 0 && MOfferModel.this.admftm == 1) {
                                MOfferModel.this.doControllableImpOnRequest();
                            }
                            if (!MOfferModel.this.hasReportMoreOfferLoad) {
                                com.mbridge.msdk.video.dynview.f.a.a(MOfferModel.this.mMainOfferCampaignEx, com.mbridge.msdk.foundation.controller.c.m().c(), "more offer load success", MOfferModel.this.mUnitId, MOfferModel.this.mRid);
                                MOfferModel.this.hasReportMoreOfferLoad = true;
                            }
                            com.mbridge.msdk.foundation.same.report.d.d dVar2 = new com.mbridge.msdk.foundation.same.report.d.d();
                            dVar2.a("result", "1");
                            if (MOfferModel.this.mIsRetry) {
                                dVar2.a("retry", "1");
                            }
                            com.mbridge.msdk.foundation.same.report.d.c.a().a("m_mof_req_result", MOfferModel.this.mMainOfferCampaignEx, dVar2);
                            MOfferModel.this.createMoreOfferView();
                            return;
                        } catch (Exception e4) {
                            ad.b(MOfferModel.TAG, e4.getMessage());
                            a.a().b();
                            return;
                        }
                    }
                    a.a().b();
                }

                @Override // com.mbridge.msdk.video.dynview.f.a.a
                public final void a(int i9, String str2) {
                    if (MOfferModel.this.mParam == null) {
                        a.a().b();
                        return;
                    }
                    try {
                        MOfferModel mOfferModel = MOfferModel.this;
                        mOfferModel.mUnitId = mOfferModel.mParam.a().get(MBridgeConstans.PROPERTIES_UNIT_ID);
                        MOfferModel mOfferModel2 = MOfferModel.this;
                        mOfferModel2.mRid = mOfferModel2.mParam.a().get("r_id");
                        if (!MOfferModel.this.hasReportMoreOfferLoad) {
                            com.mbridge.msdk.video.dynview.f.a.a(MOfferModel.this.mMainOfferCampaignEx, com.mbridge.msdk.foundation.controller.c.m().c(), "more offer load failed errorCode:" + i9 + "errorMsg:" + str2, MOfferModel.this.mUnitId, MOfferModel.this.mRid);
                            MOfferModel.this.hasReportMoreOfferLoad = true;
                        }
                        com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                        dVar.a("result", "2");
                        dVar.a("code", i9 + "");
                        if (MOfferModel.this.mIsRetry) {
                            dVar.a("retry", "1");
                        }
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("m_mof_req_result", MOfferModel.this.mMainOfferCampaignEx, dVar);
                        a.a().b();
                    } catch (Exception e4) {
                        ad.b(MOfferModel.TAG, e4.getMessage());
                        a.a().b();
                    }
                }
            };
            String str2 = com.mbridge.msdk.foundation.same.net.e.d.f().f15813M;
            if (!TextUtils.isEmpty(this.mMainOfferCampaignEx.getReq_ext_data())) {
                try {
                    JSONObject jSONObject = new JSONObject(this.mMainOfferCampaignEx.getReq_ext_data());
                    String optString = jSONObject.optString("mof_domain");
                    if (!TextUtils.isEmpty(optString)) {
                        str2 = optString + "/openapi/ad/v3";
                    }
                    String optString2 = jSONObject.optString("parent_id");
                    if (!TextUtils.isEmpty(optString2)) {
                        com.mbridge.msdk.foundation.same.net.e.b.a(this.mParam, "mof_parent_id", optString2);
                    }
                    String optString3 = jSONObject.optString("oneId");
                    if (!TextUtils.isEmpty(optString3)) {
                        com.mbridge.msdk.foundation.same.net.e.b.a(this.mParam, "oneId", optString3);
                    }
                    String optString4 = jSONObject.optString("mcd");
                    if (!TextUtils.isEmpty(optString4)) {
                        com.mbridge.msdk.foundation.same.net.e.b.a(this.mParam, "mcd", optString4);
                    }
                    aVar.setUnitId(this.mMainOfferCampaignEx.getCampaignUnitId());
                } catch (Exception e4) {
                    ad.b(TAG, e4.getMessage());
                    str = com.mbridge.msdk.foundation.same.net.e.d.f().f15813M;
                }
            }
            str = str2;
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            if (this.mIsRetry) {
                dVar.a("retry", "1");
            }
            com.mbridge.msdk.foundation.same.report.d.c.a().a("m_mof_initiate", this.mMainOfferCampaignEx, dVar);
            bVar.getLoadOrSetting(1, str, this.mParam, aVar, true, "more_offer", 30000L);
            doAdmfContorl();
        }
    }

    private void initView() {
        Context context = this.mContext;
        if (context == null) {
            return;
        }
        this.viewMofferLayout = (MBridgeRelativeLayout) LayoutInflater.from(this.mContext).inflate(v.a(context, "mbridge_reward_more_offer_view", TtmlNode.TAG_LAYOUT), (ViewGroup) null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void release() {
        List<Integer> list = this.cacheImpressionReportList;
        if (list != null) {
            list.clear();
            this.cacheImpressionReportList = null;
        }
        List<Integer> list2 = this.cacheOnlyImpressionReportList;
        if (list2 != null) {
            list2.clear();
            this.cacheOnlyImpressionReportList = null;
        }
    }

    private void setCallbackForLogicVisibleView(View view, int i9) {
        boolean z8;
        if (view == null) {
            return;
        }
        try {
            Rect rect = new Rect();
            boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
            if (rect.width() > view.getMeasuredWidth() / 5) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (globalVisibleRect && z8) {
                List<Integer> list = this.mImpressionId;
                if (list != null && this.onItemExposeListener != null) {
                    if (list.contains(Integer.valueOf(i9))) {
                        return;
                    }
                    this.mImpressionId.add(Integer.valueOf(i9));
                    this.onItemExposeListener.onItemViewVisible(true, i9);
                }
            } else if (this.admf != 0) {
                doControllableImpOnShow(i9);
            }
        } catch (Exception e4) {
            ad.b(TAG, e4.getMessage());
        }
    }

    private void setMoreOfferLayoutCallBack() {
        MBridgeRelativeLayout mBridgeRelativeLayout = this.viewMofferLayout;
        if (mBridgeRelativeLayout == null) {
            return;
        }
        mBridgeRelativeLayout.setMoreOfferCacheReportCallBack(new b() { // from class: com.mbridge.msdk.video.dynview.moffer.MOfferModel.4
            @Override // com.mbridge.msdk.video.dynview.moffer.b
            public final void a() {
                try {
                    if (MOfferModel.this.cacheImpressionReportList != null) {
                        for (int i9 = 0; i9 < MOfferModel.this.cacheImpressionReportList.size(); i9++) {
                            if (!MOfferModel.this.hasReportMoreOfferShow) {
                                com.mbridge.msdk.video.dynview.f.a.a(MOfferModel.this.mMainOfferCampaignEx, MOfferModel.this.mContext, "more offer show", MOfferModel.this.mUnitId, MOfferModel.this.mRid);
                                MOfferModel.this.hasReportMoreOfferShow = true;
                            }
                            com.mbridge.msdk.video.dynview.f.a.a(MOfferModel.this.mCampaignUnit, ((Integer) MOfferModel.this.cacheImpressionReportList.get(i9)).intValue(), 0, "117361");
                        }
                    }
                    if (MOfferModel.this.cacheOnlyImpressionReportList != null || !MOfferModel.this.isOnlyImpShow) {
                        for (int i10 = 0; i10 < MOfferModel.this.cacheOnlyImpressionReportList.size(); i10++) {
                            com.mbridge.msdk.video.dynview.f.a.a(MOfferModel.this.mCampaignUnit, ((Integer) MOfferModel.this.cacheOnlyImpressionReportList.get(i10)).intValue(), 1, "117361");
                        }
                    }
                    MOfferModel.this.release();
                } catch (Exception e4) {
                    ad.b(MOfferModel.TAG, e4.getMessage());
                }
            }
        });
        this.viewMofferLayout.setMoreOfferShowFailedCallBack(new d() { // from class: com.mbridge.msdk.video.dynview.moffer.MOfferModel.5
            @Override // com.mbridge.msdk.video.dynview.moffer.d
            public final void a() {
                if (MOfferModel.this.viewMofferLayout != null && MOfferModel.this.viewMofferLayout.getVisibility() != 0) {
                    com.mbridge.msdk.video.dynview.f.a.a(MOfferModel.this.mMainOfferCampaignEx, MOfferModel.this.mContext, "more offer show fail", MOfferModel.this.mUnitId, MOfferModel.this.mRid);
                }
                MOfferModel.this.release();
            }
        });
    }

    private void setOfferData(List<CampaignEx> list, int i9, final RoundImageView roundImageView, TextView textView) {
        CampaignEx campaignEx;
        if (roundImageView == null || textView == null || list == null || this.mContext == null || this.mMainOfferCampaignEx == null || list.size() <= 0 || (campaignEx = list.get(i9)) == null) {
            return;
        }
        roundImageView.setImageDrawable(null);
        com.mbridge.msdk.foundation.same.c.b.a(this.mContext).a(campaignEx.getIconUrl(), new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.video.dynview.moffer.MOfferModel.8
            @Override // com.mbridge.msdk.foundation.same.c.c
            public final void onFailedLoad(String str, String str2) {
            }

            @Override // com.mbridge.msdk.foundation.same.c.c
            public final void onSuccessLoad(Bitmap bitmap, String str) {
                try {
                    if (roundImageView != null && bitmap != null && !bitmap.isRecycled()) {
                        roundImageView.setBorderRadius(13);
                        roundImageView.setImageBitmap(bitmap);
                    }
                    MOfferModel.access$2208(MOfferModel.this);
                    if (!MOfferModel.this.isShowMoreOffer && MOfferModel.this.bitmapSuccessCount >= 5 && MOfferModel.this.mMoreOfferShowCallBack != null) {
                        MOfferModel.this.isShowMoreOffer = true;
                        MOfferModel.this.mMoreOfferShowCallBack.a(null);
                    }
                } catch (Exception e4) {
                    ad.b(MOfferModel.TAG, e4.getMessage());
                }
            }
        });
        if (!TextUtils.isEmpty(campaignEx.getAppName())) {
            String a6 = ao.a(this.mMainOfferCampaignEx.getendcard_url(), "mof_textmod");
            if (!TextUtils.isEmpty(a6) && a6.equals("1")) {
                textView.setText(campaignEx.getAppName());
            } else {
                textView.setVisibility(8);
            }
        }
    }

    public void buildMofferAd(CampaignEx campaignEx) {
        Context c9 = com.mbridge.msdk.foundation.controller.c.m().c();
        this.mContext = c9;
        if (c9 == null) {
            return;
        }
        this.mMainOfferCampaignEx = campaignEx;
        initView();
        initData();
    }

    public void checkViewVisiableState() {
        if (this.mLinearLayout == null) {
            return;
        }
        for (int i9 = 0; i9 < this.mLinearLayout.getChildCount(); i9++) {
            try {
                setCallbackForLogicVisibleView(this.mLinearLayout.getChildAt(i9), i9);
            } catch (Exception e4) {
                ad.b(TAG, e4.getMessage());
                return;
            }
        }
    }

    public long getECParentTemplateCode() {
        try {
            String str = "";
            e eVar = this.mParam;
            if (eVar != null) {
                str = eVar.a().get("parent_template_id");
            }
            if (TextUtils.isEmpty(str)) {
                return 404L;
            }
            return Long.parseLong(str);
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
            }
            return 404L;
        }
    }

    public CampaignEx getmMainOfferCampaignEx() {
        return this.mMainOfferCampaignEx;
    }

    public void mofDestroy() {
        if (this.mMoreOfferLayoutListener != null) {
            this.mMoreOfferLayoutListener = null;
        }
        if (this.onItemExposeListener != null) {
            this.onItemExposeListener = null;
        }
        if (this.mMoreOfferShowCallBack != null) {
            this.mMoreOfferShowCallBack = null;
        }
        if (this.mNotifyListener != null) {
            this.mNotifyListener = null;
        }
    }

    public void setFromType(int i9) {
        this.mFromType = i9;
    }

    public void setIsRetry(boolean z8) {
        this.mIsRetry = z8;
    }

    public void setMoreOfferListener(g gVar, com.mbridge.msdk.video.module.a.a aVar) {
        this.mMoreOfferLayoutListener = gVar;
        this.mNotifyListener = aVar;
    }

    public void showView() {
        CampaignUnit campaignUnit;
        g gVar = this.mMoreOfferLayoutListener;
        if (gVar == null) {
            return;
        }
        MBridgeRelativeLayout mBridgeRelativeLayout = this.viewMofferLayout;
        if (mBridgeRelativeLayout != null && (campaignUnit = this.mCampaignUnit) != null) {
            gVar.a(mBridgeRelativeLayout, campaignUnit);
            if (!this.isOnlyImpShow) {
                com.mbridge.msdk.video.dynview.f.a.a(this.mCampaignUnit, 0, 1, "117361");
            }
            if (!this.mHasReportMofScenes) {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("scene", this.mFromType + "");
                com.mbridge.msdk.foundation.same.report.d.c.a().a("m_mof_scenes", this.mMainOfferCampaignEx, dVar);
                return;
            }
            return;
        }
        gVar.a(-1, "more Offer create fail");
    }
}
