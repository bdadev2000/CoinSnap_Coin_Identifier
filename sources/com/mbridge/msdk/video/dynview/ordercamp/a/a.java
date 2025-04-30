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

/* loaded from: classes3.dex */
public final class a extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    private boolean f18725a = false;
    private C0197a b;

    /* renamed from: c, reason: collision with root package name */
    private List<CampaignEx> f18726c;

    /* renamed from: com.mbridge.msdk.video.dynview.ordercamp.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0197a {

        /* renamed from: a, reason: collision with root package name */
        RelativeLayout f18729a;
        MBRotationView b;

        /* renamed from: c, reason: collision with root package name */
        MBridgeImageView f18730c;

        /* renamed from: d, reason: collision with root package name */
        RoundImageView f18731d;

        /* renamed from: e, reason: collision with root package name */
        TextView f18732e;

        /* renamed from: f, reason: collision with root package name */
        TextView f18733f;

        /* renamed from: g, reason: collision with root package name */
        TextView f18734g;

        /* renamed from: h, reason: collision with root package name */
        TextView f18735h;

        /* renamed from: i, reason: collision with root package name */
        MBridgeLevelLayoutView f18736i;

        /* renamed from: j, reason: collision with root package name */
        ImageView f18737j;

        /* renamed from: k, reason: collision with root package name */
        ImageView f18738k;
        MBCusRoundImageView l;
        MBCusRoundImageView m;

        /* renamed from: n, reason: collision with root package name */
        MBStarLevelLayoutView f18739n;

        /* renamed from: o, reason: collision with root package name */
        MBHeatLevelLayoutView f18740o;

        /* renamed from: p, reason: collision with root package name */
        MBFrameLayout f18741p;
    }

    public a(List<CampaignEx> list) {
        this.f18726c = list;
    }

    private View a(int i9) {
        View view;
        String str;
        String str2;
        try {
            List<CampaignEx> list = this.f18726c;
            str = "";
            if (list != null && list.get(i9) != null) {
                str2 = this.f18726c.get(i9).getMof_tplid() + "";
                str = this.f18726c.get(i9).getCMPTEntryUrl();
            } else {
                str2 = "501";
            }
        } catch (Exception e4) {
            ad.b("OrderCampAdapter", e4.getMessage());
            view = null;
        }
        if (TextUtils.isEmpty(str)) {
            return a();
        }
        int r9 = z.r(c.m().c());
        String a6 = n.a(0, str2, str);
        if (TextUtils.isEmpty(a6)) {
            return a();
        }
        File file = new File(a6 + File.separator + "template_config.json");
        if (file.isFile() && file.exists()) {
            List<String> a9 = ab.a(a6, "template_" + str2 + "_" + r9 + "_item");
            if (a9 == null) {
                return a();
            }
            int r10 = z.r(c.m().c());
            h.a().b(c.m().k());
            view = DynamicViewCreator.getInstance().createDynamicView(new DyOption.Builder().campaignEx(this.f18726c.get(i9)).fileDirs(a9).dyAdType(DyAdType.REWARD).orientation(r10).adChoiceLink(ai.a(this.f18726c.get(i9))).build());
            if (view != null) {
                this.f18725a = true;
                C0197a c0197a = new C0197a();
                this.b = c0197a;
                c0197a.l = (MBCusRoundImageView) view.findViewById(c("mbridge_lv_iv"));
                this.b.f18738k = (ImageView) view.findViewById(c("mbridge_lv_iv_burl"));
                this.b.m = (MBCusRoundImageView) view.findViewById(c("mbridge_lv_icon_iv"));
                this.b.f18739n = (MBStarLevelLayoutView) view.findViewById(c("mbridge_lv_sv_starlevel"));
                this.b.f18741p = (MBFrameLayout) view.findViewById(c("mbridge_lv_ration"));
                view.setTag(this.b);
            }
            return this.f18725a ? view : a();
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
        if (this.f18725a) {
            return c(str);
        }
        return b(str);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        List<CampaignEx> list = this.f18726c;
        if (list != null && list.size() > 0) {
            return this.f18726c.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i9) {
        List<CampaignEx> list = this.f18726c;
        if (list != null) {
            return list.get(i9);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i9) {
        return i9;
    }

    @Override // android.widget.Adapter
    public final View getView(int i9, View view, ViewGroup viewGroup) {
        View view2;
        try {
            if (view == null) {
                view2 = a(i9);
            } else {
                this.b = (C0197a) view.getTag();
                view2 = view;
            }
            try {
                this.b.f18729a = (RelativeLayout) view2.findViewById(d("mbridge_lv_item_rl"));
                this.b.f18732e = (TextView) view2.findViewById(d("mbridge_lv_title_tv"));
                this.b.f18734g = (TextView) view2.findViewById(d("mbridge_lv_tv_install"));
                this.b.f18740o = (MBHeatLevelLayoutView) view2.findViewById(d("mbridge_lv_sv_heat_level"));
                this.b.f18733f = (TextView) view2.findViewById(d("mbridge_lv_desc_tv"));
                this.b.f18737j = (ImageView) view2.findViewById(d("mbridge_iv_flag"));
                this.b.f18735h = (TextView) view2.findViewById(d("mbridge_order_viewed_tv"));
                double d2 = 5.0d;
                if (this.f18725a) {
                    List<CampaignEx> list = this.f18726c;
                    if (list != null && this.b != null && list.size() != 0) {
                        MBCusRoundImageView mBCusRoundImageView = this.b.l;
                        if (mBCusRoundImageView != null && (mBCusRoundImageView instanceof MBCusRoundImageView)) {
                            mBCusRoundImageView.setCustomBorder(30, 30, 30, 30, 10, -1728053248);
                            a(this.b.l, this.f18726c.get(i9).getImageUrl(), false);
                        }
                        ImageView imageView = this.b.f18738k;
                        if (imageView != null) {
                            a(imageView, this.f18726c.get(i9).getImageUrl(), false);
                        }
                        MBCusRoundImageView mBCusRoundImageView2 = this.b.m;
                        if (mBCusRoundImageView2 != null && (mBCusRoundImageView2 instanceof MBCusRoundImageView)) {
                            mBCusRoundImageView2.setBorder(50, 20, -1);
                            a(this.b.m, this.f18726c.get(i9).getIconUrl(), true);
                        }
                        double rating = this.f18726c.get(i9).getRating();
                        if (rating > 0.0d) {
                            d2 = rating;
                        }
                        MBStarLevelLayoutView mBStarLevelLayoutView = this.b.f18739n;
                        if (mBStarLevelLayoutView != null) {
                            mBStarLevelLayoutView.setRating((int) d2);
                            this.b.f18739n.setOrientation(0);
                        }
                        MBHeatLevelLayoutView mBHeatLevelLayoutView = this.b.f18740o;
                        if (mBHeatLevelLayoutView != null) {
                            mBHeatLevelLayoutView.setHeatCount(this.f18726c.get(i9).getNumberRating());
                        }
                    }
                } else {
                    List<CampaignEx> list2 = this.f18726c;
                    if (list2 != null && this.b != null && list2.size() != 0) {
                        MBridgeImageView mBridgeImageView = this.b.f18730c;
                        if (mBridgeImageView != null) {
                            a(mBridgeImageView, this.f18726c.get(i9).getImageUrl(), false);
                        }
                        ImageView imageView2 = this.b.f18738k;
                        if (imageView2 != null) {
                            a(imageView2, this.f18726c.get(i9).getImageUrl(), false);
                        }
                        RoundImageView roundImageView = this.b.f18731d;
                        if (roundImageView != null) {
                            roundImageView.setBorderRadius(25);
                            a(this.b.f18731d, this.f18726c.get(i9).getIconUrl(), true);
                        }
                        double rating2 = this.f18726c.get(i9).getRating();
                        if (rating2 > 0.0d) {
                            d2 = rating2;
                        }
                        MBridgeLevelLayoutView mBridgeLevelLayoutView = this.b.f18736i;
                        if (mBridgeLevelLayoutView != null) {
                            mBridgeLevelLayoutView.setRatingAndUser(d2, this.f18726c.get(i9).getNumberRating());
                            this.b.f18736i.setOrientation(0);
                        }
                        MBRotationView mBRotationView = this.b.b;
                        if (mBRotationView != null) {
                            mBRotationView.setWidthRatio(1.0f);
                            this.b.b.setHeightRatio(1.0f);
                            this.b.b.setAutoscroll(false);
                        }
                        MBridgeImageView mBridgeImageView2 = this.b.f18730c;
                        if (mBridgeImageView2 != null) {
                            mBridgeImageView2.setCustomBorder(30, 30, 30, 30, 10, -1728053248);
                        }
                    }
                }
                C0197a c0197a = this.b;
                if (c0197a != null) {
                    if (c0197a.f18732e != null) {
                        this.b.f18732e.setText(this.f18726c.get(i9).getAppName());
                    }
                    if (this.b.f18733f != null) {
                        this.b.f18733f.setText(this.f18726c.get(i9).getAppDesc());
                    }
                    if (this.b.f18734g != null) {
                        String adCall = this.f18726c.get(i9).getAdCall();
                        if (this.b.f18734g instanceof MBridgeTextView) {
                            ((MBridgeTextView) this.b.f18734g).setObjectAnimator(new b().c(this.b.f18734g));
                        }
                        this.b.f18734g.setText(adCall);
                    }
                    if (this.b.f18737j != null) {
                        try {
                            String language = Locale.getDefault().getLanguage();
                            Context c9 = c.m().c();
                            if (c9 != null) {
                                if (!TextUtils.isEmpty(language) && language.equals("zh")) {
                                    this.b.f18737j.setImageDrawable(c9.getResources().getDrawable(c9.getResources().getIdentifier("mbridge_reward_flag_cn", "drawable", c.m().g())));
                                } else {
                                    this.b.f18737j.setImageDrawable(c9.getResources().getDrawable(c9.getResources().getIdentifier("mbridge_reward_flag_en", "drawable", c.m().g())));
                                }
                            }
                        } catch (Exception e4) {
                            ad.b("OrderCampAdapter", e4.getMessage());
                        }
                        ai.a(2, this.b.f18737j, this.f18726c.get(i9), c.m().c(), false, null);
                    }
                    if (this.b.f18735h != null) {
                        try {
                            this.b.f18735h.setText(c.m().c().getResources().getString(c.m().c().getResources().getIdentifier("mbridge_reward_viewed_text_str", "string", c.m().g())));
                            this.b.f18735h.setVisibility(0);
                        } catch (Exception e9) {
                            ad.b("OrderCampAdapter", e9.getMessage());
                        }
                    }
                }
            } catch (Exception e10) {
                e = e10;
                ad.b("OrderCampAdapter", e.getMessage());
                return view2;
            }
        } catch (Exception e11) {
            e = e11;
            view2 = view;
        }
        return view2;
    }

    private View a() {
        View inflate = LayoutInflater.from(c.m().c()).inflate(a("mbridge_order_layout_item"), (ViewGroup) null);
        C0197a c0197a = new C0197a();
        this.b = c0197a;
        c0197a.f18730c = (MBridgeImageView) inflate.findViewById(b("mbridge_lv_iv"));
        this.b.f18738k = (ImageView) inflate.findViewById(b("mbridge_lv_iv_burl"));
        this.b.f18731d = (RoundImageView) inflate.findViewById(b("mbridge_lv_icon_iv"));
        this.b.f18736i = (MBridgeLevelLayoutView) inflate.findViewById(b("mbridge_lv_sv_starlevel"));
        this.b.b = (MBRotationView) inflate.findViewById(b("mbridge_lv_ration"));
        inflate.setTag(this.b);
        return inflate;
    }

    private void a(final ImageView imageView, String str, final boolean z8) {
        if (imageView == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            com.mbridge.msdk.foundation.same.c.b.a(imageView.getContext()).a(str, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.video.dynview.ordercamp.a.a.1
                @Override // com.mbridge.msdk.foundation.same.c.c
                public final void onFailedLoad(String str2, String str3) {
                    if (z8) {
                        imageView.setVisibility(8);
                    }
                }

                @Override // com.mbridge.msdk.foundation.same.c.c
                public final void onSuccessLoad(Bitmap bitmap, String str2) {
                    try {
                        if (!bitmap.isRecycled()) {
                            imageView.setImageBitmap(bitmap);
                        }
                    } catch (Throwable th) {
                        ad.b("OrderCampAdapter", th.getMessage());
                    }
                }
            });
        } else if (z8) {
            imageView.setVisibility(8);
        }
    }

    private int a(String str) {
        return v.a(c.m().c().getApplicationContext(), str, TtmlNode.TAG_LAYOUT);
    }
}
