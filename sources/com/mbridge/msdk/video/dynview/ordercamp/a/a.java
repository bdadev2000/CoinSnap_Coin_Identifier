package com.mbridge.msdk.video.dynview.ordercamp.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.dycreator.baseview.MBFrameLayout;
import com.mbridge.msdk.dycreator.baseview.MBHeatLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.MBStarLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeImageView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeTextView;
import com.mbridge.msdk.dycreator.wrapper.DyAdType;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewCreator;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.n;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.video.dynview.h.b;
import com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import java.io.File;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class a extends BaseAdapter {
    private boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    private C0209a f15854b;

    /* renamed from: c, reason: collision with root package name */
    private List<CampaignEx> f15855c;

    /* renamed from: com.mbridge.msdk.video.dynview.ordercamp.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0209a {
        RelativeLayout a;

        /* renamed from: b, reason: collision with root package name */
        MBRotationView f15858b;

        /* renamed from: c, reason: collision with root package name */
        MBridgeImageView f15859c;

        /* renamed from: d, reason: collision with root package name */
        RoundImageView f15860d;

        /* renamed from: e, reason: collision with root package name */
        TextView f15861e;

        /* renamed from: f, reason: collision with root package name */
        TextView f15862f;

        /* renamed from: g, reason: collision with root package name */
        TextView f15863g;

        /* renamed from: h, reason: collision with root package name */
        TextView f15864h;

        /* renamed from: i, reason: collision with root package name */
        MBridgeLevelLayoutView f15865i;

        /* renamed from: j, reason: collision with root package name */
        ImageView f15866j;

        /* renamed from: k, reason: collision with root package name */
        ImageView f15867k;

        /* renamed from: l, reason: collision with root package name */
        MBCusRoundImageView f15868l;

        /* renamed from: m, reason: collision with root package name */
        MBCusRoundImageView f15869m;

        /* renamed from: n, reason: collision with root package name */
        MBStarLevelLayoutView f15870n;

        /* renamed from: o, reason: collision with root package name */
        MBHeatLevelLayoutView f15871o;

        /* renamed from: p, reason: collision with root package name */
        MBFrameLayout f15872p;
    }

    public a(List<CampaignEx> list) {
        this.f15855c = list;
    }

    private View a(int i10) {
        View view;
        String str;
        String str2;
        try {
            List<CampaignEx> list = this.f15855c;
            str = "";
            if (list == null || list.get(i10) == null) {
                str2 = "501";
            } else {
                str2 = this.f15855c.get(i10).getMof_tplid() + "";
                str = this.f15855c.get(i10).getCMPTEntryUrl();
            }
        } catch (Exception e2) {
            ad.b("OrderCampAdapter", e2.getMessage());
            view = null;
        }
        if (TextUtils.isEmpty(str)) {
            return a();
        }
        int r6 = z.r(c.m().c());
        String a = n.a(0, str2, str);
        if (TextUtils.isEmpty(a)) {
            return a();
        }
        File file = new File(a + File.separator + "template_config.json");
        if (file.isFile() && file.exists()) {
            List<String> a10 = ab.a(a, "template_" + str2 + "_" + r6 + "_item");
            if (a10 == null) {
                return a();
            }
            int r10 = z.r(c.m().c());
            h.a().b(c.m().k());
            view = DynamicViewCreator.getInstance().createDynamicView(new DyOption.Builder().campaignEx(this.f15855c.get(i10)).fileDirs(a10).dyAdType(DyAdType.REWARD).orientation(r10).adChoiceLink(ai.a(this.f15855c.get(i10))).build());
            if (view != null) {
                this.a = true;
                C0209a c0209a = new C0209a();
                this.f15854b = c0209a;
                c0209a.f15868l = (MBCusRoundImageView) view.findViewById(c("mbridge_lv_iv"));
                this.f15854b.f15867k = (ImageView) view.findViewById(c("mbridge_lv_iv_burl"));
                this.f15854b.f15869m = (MBCusRoundImageView) view.findViewById(c("mbridge_lv_icon_iv"));
                this.f15854b.f15870n = (MBStarLevelLayoutView) view.findViewById(c("mbridge_lv_sv_starlevel"));
                this.f15854b.f15872p = (MBFrameLayout) view.findViewById(c("mbridge_lv_ration"));
                view.setTag(this.f15854b);
            }
            return this.a ? view : a();
        }
        return a();
    }

    private int b(String str) {
        return v.a(c.m().c().getApplicationContext(), str, "id");
    }

    private int c(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.hashCode();
        }
        return -1;
    }

    private int d(String str) {
        if (this.a) {
            return c(str);
        }
        return b(str);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        List<CampaignEx> list = this.f15855c;
        if (list != null && list.size() > 0) {
            return this.f15855c.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        List<CampaignEx> list = this.f15855c;
        if (list != null) {
            return list.get(i10);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        View view2;
        try {
            if (view == null) {
                view2 = a(i10);
            } else {
                this.f15854b = (C0209a) view.getTag();
                view2 = view;
            }
        } catch (Exception e2) {
            e = e2;
            view2 = view;
        }
        try {
            this.f15854b.a = (RelativeLayout) view2.findViewById(d("mbridge_lv_item_rl"));
            this.f15854b.f15861e = (TextView) view2.findViewById(d("mbridge_lv_title_tv"));
            this.f15854b.f15863g = (TextView) view2.findViewById(d("mbridge_lv_tv_install"));
            this.f15854b.f15871o = (MBHeatLevelLayoutView) view2.findViewById(d("mbridge_lv_sv_heat_level"));
            this.f15854b.f15862f = (TextView) view2.findViewById(d("mbridge_lv_desc_tv"));
            this.f15854b.f15866j = (ImageView) view2.findViewById(d("mbridge_iv_flag"));
            this.f15854b.f15864h = (TextView) view2.findViewById(d("mbridge_order_viewed_tv"));
            double d10 = 5.0d;
            if (this.a) {
                List<CampaignEx> list = this.f15855c;
                if (list != null && this.f15854b != null && list.size() != 0) {
                    MBCusRoundImageView mBCusRoundImageView = this.f15854b.f15868l;
                    if (mBCusRoundImageView != null && (mBCusRoundImageView instanceof MBCusRoundImageView)) {
                        mBCusRoundImageView.setCustomBorder(30, 30, 30, 30, 10, -1728053248);
                        a(this.f15854b.f15868l, this.f15855c.get(i10).getImageUrl(), false);
                    }
                    ImageView imageView = this.f15854b.f15867k;
                    if (imageView != null) {
                        a(imageView, this.f15855c.get(i10).getImageUrl(), false);
                    }
                    MBCusRoundImageView mBCusRoundImageView2 = this.f15854b.f15869m;
                    if (mBCusRoundImageView2 != null && (mBCusRoundImageView2 instanceof MBCusRoundImageView)) {
                        mBCusRoundImageView2.setBorder(50, 20, -1);
                        a(this.f15854b.f15869m, this.f15855c.get(i10).getIconUrl(), true);
                    }
                    double rating = this.f15855c.get(i10).getRating();
                    if (rating > 0.0d) {
                        d10 = rating;
                    }
                    MBStarLevelLayoutView mBStarLevelLayoutView = this.f15854b.f15870n;
                    if (mBStarLevelLayoutView != null) {
                        mBStarLevelLayoutView.setRating((int) d10);
                        this.f15854b.f15870n.setOrientation(0);
                    }
                    MBHeatLevelLayoutView mBHeatLevelLayoutView = this.f15854b.f15871o;
                    if (mBHeatLevelLayoutView != null) {
                        mBHeatLevelLayoutView.setHeatCount(this.f15855c.get(i10).getNumberRating());
                    }
                }
            } else {
                List<CampaignEx> list2 = this.f15855c;
                if (list2 != null && this.f15854b != null && list2.size() != 0) {
                    MBridgeImageView mBridgeImageView = this.f15854b.f15859c;
                    if (mBridgeImageView != null) {
                        a(mBridgeImageView, this.f15855c.get(i10).getImageUrl(), false);
                    }
                    ImageView imageView2 = this.f15854b.f15867k;
                    if (imageView2 != null) {
                        a(imageView2, this.f15855c.get(i10).getImageUrl(), false);
                    }
                    RoundImageView roundImageView = this.f15854b.f15860d;
                    if (roundImageView != null) {
                        roundImageView.setBorderRadius(25);
                        a(this.f15854b.f15860d, this.f15855c.get(i10).getIconUrl(), true);
                    }
                    double rating2 = this.f15855c.get(i10).getRating();
                    if (rating2 > 0.0d) {
                        d10 = rating2;
                    }
                    MBridgeLevelLayoutView mBridgeLevelLayoutView = this.f15854b.f15865i;
                    if (mBridgeLevelLayoutView != null) {
                        mBridgeLevelLayoutView.setRatingAndUser(d10, this.f15855c.get(i10).getNumberRating());
                        this.f15854b.f15865i.setOrientation(0);
                    }
                    MBRotationView mBRotationView = this.f15854b.f15858b;
                    if (mBRotationView != null) {
                        mBRotationView.setWidthRatio(1.0f);
                        this.f15854b.f15858b.setHeightRatio(1.0f);
                        this.f15854b.f15858b.setAutoscroll(false);
                    }
                    MBridgeImageView mBridgeImageView2 = this.f15854b.f15859c;
                    if (mBridgeImageView2 != null) {
                        mBridgeImageView2.setCustomBorder(30, 30, 30, 30, 10, -1728053248);
                    }
                }
            }
            C0209a c0209a = this.f15854b;
            if (c0209a != null) {
                if (c0209a.f15861e != null) {
                    this.f15854b.f15861e.setText(this.f15855c.get(i10).getAppName());
                }
                if (this.f15854b.f15862f != null) {
                    this.f15854b.f15862f.setText(this.f15855c.get(i10).getAppDesc());
                }
                if (this.f15854b.f15863g != null) {
                    String adCall = this.f15855c.get(i10).getAdCall();
                    if (this.f15854b.f15863g instanceof MBridgeTextView) {
                        ((MBridgeTextView) this.f15854b.f15863g).setObjectAnimator(new b().c(this.f15854b.f15863g));
                    }
                    this.f15854b.f15863g.setText(adCall);
                }
                if (this.f15854b.f15866j != null) {
                    try {
                        String language = Locale.getDefault().getLanguage();
                        Context c10 = c.m().c();
                        if (c10 != null) {
                            if (!TextUtils.isEmpty(language) && language.equals("zh")) {
                                this.f15854b.f15866j.setImageDrawable(c10.getResources().getDrawable(c10.getResources().getIdentifier("mbridge_reward_flag_cn", "drawable", c.m().g())));
                            } else {
                                this.f15854b.f15866j.setImageDrawable(c10.getResources().getDrawable(c10.getResources().getIdentifier("mbridge_reward_flag_en", "drawable", c.m().g())));
                            }
                        }
                    } catch (Exception e10) {
                        ad.b("OrderCampAdapter", e10.getMessage());
                    }
                    ai.a(2, this.f15854b.f15866j, this.f15855c.get(i10), c.m().c(), false, null);
                }
                if (this.f15854b.f15864h != null) {
                    try {
                        this.f15854b.f15864h.setText(c.m().c().getResources().getString(c.m().c().getResources().getIdentifier("mbridge_reward_viewed_text_str", "string", c.m().g())));
                        this.f15854b.f15864h.setVisibility(0);
                    } catch (Exception e11) {
                        ad.b("OrderCampAdapter", e11.getMessage());
                    }
                }
            }
        } catch (Exception e12) {
            e = e12;
            ad.b("OrderCampAdapter", e.getMessage());
            return view2;
        }
        return view2;
    }

    private View a() {
        View inflate = LayoutInflater.from(c.m().c()).inflate(a("mbridge_order_layout_item"), (ViewGroup) null);
        C0209a c0209a = new C0209a();
        this.f15854b = c0209a;
        c0209a.f15859c = (MBridgeImageView) inflate.findViewById(b("mbridge_lv_iv"));
        this.f15854b.f15867k = (ImageView) inflate.findViewById(b("mbridge_lv_iv_burl"));
        this.f15854b.f15860d = (RoundImageView) inflate.findViewById(b("mbridge_lv_icon_iv"));
        this.f15854b.f15865i = (MBridgeLevelLayoutView) inflate.findViewById(b("mbridge_lv_sv_starlevel"));
        this.f15854b.f15858b = (MBRotationView) inflate.findViewById(b("mbridge_lv_ration"));
        inflate.setTag(this.f15854b);
        return inflate;
    }

    private void a(final ImageView imageView, String str, final boolean z10) {
        if (imageView == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            com.mbridge.msdk.foundation.same.c.b.a(imageView.getContext()).a(str, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.video.dynview.ordercamp.a.a.1
                @Override // com.mbridge.msdk.foundation.same.c.c
                public final void onFailedLoad(String str2, String str3) {
                    if (z10) {
                        imageView.setVisibility(8);
                    }
                }

                @Override // com.mbridge.msdk.foundation.same.c.c
                public final void onSuccessLoad(Bitmap bitmap, String str2) {
                    try {
                        if (!bitmap.isRecycled()) {
                            imageView.setImageBitmap(bitmap);
                        }
                    } catch (Throwable th2) {
                        ad.b("OrderCampAdapter", th2.getMessage());
                    }
                }
            });
        } else if (z10) {
            imageView.setVisibility(8);
        }
    }

    private int a(String str) {
        return v.a(c.m().c().getApplicationContext(), str, TtmlNode.TAG_LAYOUT);
    }
}
