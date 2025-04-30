package com.mbridge.msdk.video.dynview.j;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.MBHeatLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.MBStarLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.o;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.video.dynview.e.d;
import com.mbridge.msdk.video.dynview.e.e;
import com.mbridge.msdk.video.dynview.g.a;
import com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: j, reason: collision with root package name */
    private static boolean f18647j = false;
    private com.mbridge.msdk.video.dynview.i.c.b b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Bitmap> f18649c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f18650d;

    /* renamed from: e, reason: collision with root package name */
    private String f18651e = "#FFFFFFFF";

    /* renamed from: f, reason: collision with root package name */
    private String f18652f = "#60000000";

    /* renamed from: g, reason: collision with root package name */
    private String f18653g = "#FF5F5F5F";

    /* renamed from: h, reason: collision with root package name */
    private String f18654h = "#90ECECEC";

    /* renamed from: i, reason: collision with root package name */
    private volatile long f18655i = 0;

    /* renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.i.c.a f18656k = null;
    private boolean l = false;
    private int m = 0;

    /* renamed from: a, reason: collision with root package name */
    public com.mbridge.msdk.video.dynview.d.a f18648a = new com.mbridge.msdk.video.dynview.d.a() { // from class: com.mbridge.msdk.video.dynview.j.a.1
        @Override // com.mbridge.msdk.video.dynview.d.a
        public final void a() {
            if (a.this.l && a.this.b != null) {
                a.this.b.a(a.this.m * 1000, a.this.f18656k);
                a.this.l = false;
            }
        }

        @Override // com.mbridge.msdk.video.dynview.d.a
        public final void b() {
            if (a.this.b != null) {
                a.this.b.b();
                a.this.l = true;
            }
        }

        @Override // com.mbridge.msdk.video.dynview.d.a
        public final void c() {
            if (a.this.b != null) {
                a.this.b.b();
                a.this.l = true;
            }
        }
    };

    /* renamed from: com.mbridge.msdk.video.dynview.j.a$9, reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass9 implements com.mbridge.msdk.foundation.same.c.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f18678a;
        final /* synthetic */ ImageView b;

        public AnonymousClass9(int i9, ImageView imageView) {
            this.f18678a = i9;
            this.b = imageView;
        }

        @Override // com.mbridge.msdk.foundation.same.c.c
        public final void onFailedLoad(String str, String str2) {
            try {
                int a6 = v.a(this.b.getContext(), "mbridge_icon_play_bg", "drawable");
                this.b.setBackgroundColor(Color.parseColor(a.this.f18653g));
                this.b.setImageResource(a6);
                this.b.setScaleType(ImageView.ScaleType.CENTER);
            } catch (Exception e4) {
                ad.a("DataEnergizeWrapper", e4.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.c.c
        public final void onSuccessLoad(final Bitmap bitmap, String str) {
            if (bitmap != null && !bitmap.isRecycled()) {
                int i9 = this.f18678a;
                if (i9 != 501 && i9 != 802) {
                    this.b.setImageBitmap(bitmap);
                    return;
                } else {
                    com.mbridge.msdk.foundation.same.f.b.a().execute(new Runnable() { // from class: com.mbridge.msdk.video.dynview.j.a.9.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                final Bitmap a6 = o.a(bitmap, 10);
                                AnonymousClass9.this.b.post(new Runnable() { // from class: com.mbridge.msdk.video.dynview.j.a.9.1.1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        AnonymousClass9.this.b.setImageBitmap(a6);
                                    }
                                });
                            } catch (Exception e4) {
                                ad.b("DataEnergizeWrapper", e4.getMessage());
                            }
                        }
                    });
                    return;
                }
            }
            int a6 = v.a(this.b.getContext(), "mbridge_icon_play_bg", "drawable");
            this.b.setBackgroundColor(Color.parseColor(a.this.f18653g));
            this.b.setImageResource(a6);
            this.b.setScaleType(ImageView.ScaleType.CENTER);
        }
    }

    public static /* synthetic */ void b(a aVar, Map map) {
        if (map != null) {
            try {
                if (map.containsKey("choice_one_callback") && (map.get("choice_one_callback") instanceof d)) {
                    ((d) map.get("choice_one_callback")).a();
                    aVar.b();
                }
            } catch (Exception e4) {
                ad.b("DataEnergizeWrapper", e4.getMessage());
            }
        }
    }

    public final void c(com.mbridge.msdk.video.dynview.c cVar, View view, final Map map, e eVar) {
        try {
            if (this.f18649c == null) {
                this.f18649c = new HashMap();
            }
            final List<CampaignEx> g9 = cVar.g();
            if (view.getContext() == null) {
                eVar.a(com.mbridge.msdk.video.dynview.c.a.NOT_FOUND_CONTEXT);
                return;
            }
            if (map != null && map.containsKey("is_dy_success")) {
                f18647j = ((Boolean) map.get("is_dy_success")).booleanValue();
            }
            for (CampaignEx campaignEx : g9) {
                if (campaignEx != null) {
                    campaignEx.setECTemplateRenderSucc(f18647j);
                }
            }
            ListView listView = (ListView) view.findViewById(a(f18647j, "mbridge_order_view_lv"));
            GridView gridView = (GridView) view.findViewById(a(f18647j, "mbridge_order_view_h_lv"));
            ImageView imageView = (ImageView) view.findViewById(a(f18647j, "mbridge_order_view_iv_close"));
            com.mbridge.msdk.video.dynview.ordercamp.a.a aVar = new com.mbridge.msdk.video.dynview.ordercamp.a.a(g9);
            if (cVar.e() == 1) {
                if (listView != null) {
                    try {
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) listView.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.height = -1;
                            float c9 = (cVar.c() - ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 720.0f)) / 2.0f;
                            int a6 = ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 10.0f);
                            int i9 = (int) c9;
                            layoutParams.setMargins(a6, i9, a6, i9);
                            listView.setLayoutParams(layoutParams);
                        }
                    } catch (Exception e4) {
                        ad.b("DataEnergizeWrapper", e4.getMessage());
                    }
                    listView.setAdapter((ListAdapter) aVar);
                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.mbridge.msdk.video.dynview.j.a.6
                        @Override // android.widget.AdapterView.OnItemClickListener
                        public final void onItemClick(AdapterView<?> adapterView, View view2, int i10, long j7) {
                            a.a(a.this, map, g9, i10);
                        }
                    });
                }
            } else if (gridView != null) {
                int d2 = (int) cVar.d();
                int size = d2 / g9.size();
                int i10 = size / 9;
                int i11 = i10 / 2;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) gridView.getLayoutParams();
                layoutParams2.width = d2 - (i10 * 2);
                gridView.setLayoutParams(layoutParams2);
                gridView.setColumnWidth((size - i10) - (i11 / 2));
                gridView.setHorizontalSpacing(i11);
                gridView.setStretchMode(0);
                gridView.setNumColumns(g9.size());
                gridView.setAdapter((ListAdapter) aVar);
                gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.mbridge.msdk.video.dynview.j.a.7
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public final void onItemClick(AdapterView<?> adapterView, View view2, int i12, long j7) {
                        a.a(a.this, map, g9, i12);
                    }
                });
            }
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.dynview.j.a.8
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        a.a(a.this, map);
                    }
                });
            }
            if (eVar != null) {
                eVar.a(view, null);
            }
        } catch (Exception unused) {
            if (eVar != null) {
                eVar.a(com.mbridge.msdk.video.dynview.c.a.NOT_FOUND_VIEWOPTION);
            }
        }
    }

    public static /* synthetic */ void a(a aVar, Map map) {
        if (map != null) {
            try {
                if (map.containsKey("order_view_callback") && (map.get("order_view_callback") instanceof com.mbridge.msdk.video.dynview.e.c)) {
                    ((com.mbridge.msdk.video.dynview.e.c) map.get("order_view_callback")).a();
                    aVar.b();
                }
            } catch (Exception e4) {
                ad.b("DataEnergizeWrapper", e4.getMessage());
            }
        }
    }

    public final void b(com.mbridge.msdk.video.dynview.c cVar, View view, Map map, e eVar) {
        if (eVar == null) {
            return;
        }
        if (cVar == null) {
            eVar.a(com.mbridge.msdk.video.dynview.c.a.NOT_FOUND_VIEWOPTION);
            return;
        }
        if (map != null && map.containsKey("is_dy_success")) {
            f18647j = ((Boolean) map.get("is_dy_success")).booleanValue();
        }
        boolean z8 = f18647j;
        LinearLayout linearLayout = z8 ? (LinearLayout) view.findViewById(a(z8, "mbridge_reward_heat_mllv")) : null;
        ImageView imageView = (ImageView) view.findViewById(a(f18647j, "mbridge_reward_icon_riv"));
        TextView textView = (TextView) view.findViewById(a(f18647j, "mbridge_reward_title_tv"));
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(a(f18647j, "mbridge_reward_stars_mllv"));
        TextView textView2 = (TextView) view.findViewById(a(f18647j, "mbridge_reward_click_tv"));
        ImageView imageView2 = (ImageView) view.findViewById(a(f18647j, "mbridge_videoview_bg"));
        TextView textView3 = (TextView) view.findViewById(a(f18647j, "mbridge_reward_desc_tv"));
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(a(f18647j, "mbridge_reward_bottom_layout"));
        ArrayList arrayList = new ArrayList();
        List<CampaignEx> g9 = cVar.g();
        if (g9 != null && g9.size() > 0) {
            CampaignEx campaignEx = g9.get(0);
            if (campaignEx != null) {
                if (imageView != null) {
                    if (f18647j) {
                        if (imageView instanceof MBCusRoundImageView) {
                            ((MBCusRoundImageView) imageView).setCustomBorder(30, 30, 30, 30, 10, -1);
                        }
                    } else {
                        ((RoundImageView) imageView).setBorderRadius(10);
                    }
                    a(campaignEx.getIconUrl(), imageView);
                }
                if (textView != null) {
                    textView.setText(campaignEx.getAppName());
                }
                if (textView3 != null) {
                    textView3.setText(campaignEx.getAppDesc());
                }
                if (linearLayout2 != null) {
                    double rating = campaignEx.getRating();
                    if (rating <= 0.0d) {
                        rating = 5.0d;
                    }
                    if (f18647j) {
                        if (linearLayout2 instanceof MBStarLevelLayoutView) {
                            MBStarLevelLayoutView mBStarLevelLayoutView = (MBStarLevelLayoutView) linearLayout2;
                            mBStarLevelLayoutView.setRating((int) rating);
                            mBStarLevelLayoutView.setOrientation(0);
                        }
                        if (linearLayout instanceof MBHeatLevelLayoutView) {
                            ((MBHeatLevelLayoutView) linearLayout).setHeatCount(campaignEx.getNumberRating());
                        }
                    } else {
                        ((MBridgeLevelLayoutView) linearLayout2).setRatingAndUser(rating, campaignEx.getNumberRating());
                    }
                }
                if (textView2 != null) {
                    textView2.setText(campaignEx.getAdCall());
                }
                int i9 = cVar.i();
                if (i9 == 102 || i9 == 202 || i9 == 302) {
                    if (textView2 != null) {
                        arrayList.add(textView2);
                    }
                } else if (i9 == 802) {
                    if (imageView != null) {
                        arrayList.add(imageView);
                    }
                    if (textView2 != null) {
                        arrayList.add(textView2);
                    }
                    a(imageView2, campaignEx.getImageUrl(), i9);
                } else if (i9 != 902) {
                    if (i9 != 904) {
                        if (i9 == 5002010) {
                            if (cVar.k() && relativeLayout != null && relativeLayout.getVisibility() == 0) {
                                arrayList.add(relativeLayout);
                            } else {
                                if (imageView != null) {
                                    arrayList.add(imageView);
                                }
                                if (textView2 != null) {
                                    arrayList.add(textView2);
                                }
                            }
                        }
                    } else if (cVar.k()) {
                        arrayList.add(view);
                    }
                } else if (TextUtils.isEmpty(cVar.o()) || !cVar.o().equals("dsp") || !TextUtils.isEmpty(campaignEx.getClickURL())) {
                    arrayList.add(view);
                }
                eVar.a(view, arrayList);
                return;
            }
            eVar.a(com.mbridge.msdk.video.dynview.c.a.CAMPAIGNEX_IS_NULL);
            return;
        }
        eVar.a(com.mbridge.msdk.video.dynview.c.a.CAMPAIGNEX_IS_NULL);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.mbridge.msdk.video.dynview.c r33, android.view.View r34, final java.util.Map r35, com.mbridge.msdk.video.dynview.e.e r36) {
        /*
            Method dump skipped, instructions count: 1010
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.dynview.j.a.a(com.mbridge.msdk.video.dynview.c, android.view.View, java.util.Map, com.mbridge.msdk.video.dynview.e.e):void");
    }

    private void b() {
        com.mbridge.msdk.video.dynview.i.a.a.a().b();
        com.mbridge.msdk.video.dynview.i.c.b bVar = this.b;
        if (bVar != null) {
            bVar.b();
            this.b = null;
        }
        com.mbridge.msdk.video.dynview.b.a.a().f18569a = null;
        if (this.f18648a != null) {
            this.f18648a = null;
        }
        Map<String, Bitmap> map = this.f18649c;
        if (map != null) {
            if (map.entrySet() != null) {
                try {
                    Iterator<Map.Entry<String, Bitmap>> it = this.f18649c.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<String, Bitmap> next = it.next();
                        if (next != null && next.getValue() != null && !next.getValue().isRecycled()) {
                            next.getValue().recycle();
                        }
                        it.remove();
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
            this.f18649c.clear();
        }
    }

    public final void a(com.mbridge.msdk.video.dynview.c cVar, View view, e eVar) {
        if (eVar == null) {
            return;
        }
        if (cVar == null) {
            eVar.a(com.mbridge.msdk.video.dynview.c.a.NOT_FOUND_VIEWOPTION);
            return;
        }
        try {
            ImageView imageView = (ImageView) view.findViewById(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_iv_adbanner_bg", "id"));
            if (imageView != null) {
                imageView.setBackgroundColor(Color.parseColor(this.f18654h));
            }
            ImageView imageView2 = (ImageView) view.findViewById(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_iv_adbanner", "id"));
            if (imageView2 != null) {
                imageView2.setBackgroundColor(Color.parseColor(this.f18654h));
            }
            eVar.a(view, new ArrayList());
        } catch (Exception e4) {
            ad.a("DataEnergizeWrapper", e4.getMessage());
            eVar.a(com.mbridge.msdk.video.dynview.c.a.NOT_FOUND_VIEWOPTION);
        }
    }

    private void a(String str, ImageView imageView) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        a(imageView, str, -1);
    }

    private void a(ImageView imageView, String str, int i9) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        com.mbridge.msdk.foundation.same.c.b.a(imageView.getContext()).a(str, new AnonymousClass9(i9, imageView));
    }

    private void a(final String str, final ImageView imageView, final com.mbridge.msdk.video.dynview.c cVar, final View view) {
        com.mbridge.msdk.foundation.same.c.b.a(imageView.getContext()).a(str, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.video.dynview.j.a.10
            @Override // com.mbridge.msdk.foundation.same.c.c
            public final void onFailedLoad(String str2, String str3) {
            }

            @Override // com.mbridge.msdk.foundation.same.c.c
            public final void onSuccessLoad(Bitmap bitmap, String str2) {
                ImageView imageView2;
                if (bitmap != null && !bitmap.isRecycled() && (imageView2 = imageView) != null) {
                    imageView2.setImageBitmap(bitmap);
                    if (a.this.f18649c != null) {
                        a.this.f18649c.put(SameMD5.getMD5(str), bitmap);
                        a.a(a.this, cVar, view);
                    }
                }
            }
        });
        try {
            Bitmap a6 = a();
            if (a6 == null || a6.isRecycled()) {
                return;
            }
            a(cVar, view);
        } catch (Exception e4) {
            ad.b("DataEnergizeWrapper", e4.getMessage());
        }
    }

    private int a(boolean z8, String str) {
        try {
            if (z8) {
                if (TextUtils.isEmpty(str)) {
                    return -1;
                }
                return str.hashCode();
            }
            return v.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, "id");
        } catch (Exception e4) {
            ad.b("DataEnergizeWrapper", e4.getMessage());
            return -1;
        }
    }

    private Bitmap a() {
        Bitmap bitmap = null;
        try {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_4444);
            bitmap.eraseColor(Color.parseColor(this.f18654h));
            return bitmap;
        } catch (Exception e4) {
            if (!MBridgeConstans.DEBUG) {
                return bitmap;
            }
            e4.printStackTrace();
            return bitmap;
        }
    }

    private void a(com.mbridge.msdk.video.dynview.c cVar, View view) {
        a.C0194a a6 = com.mbridge.msdk.video.dynview.g.a.a();
        a6.a(cVar.e()).a(true);
        if (cVar.e() != 2) {
            a6.a(cVar.d()).b(cVar.c());
        } else if (cVar.d() > cVar.c()) {
            a6.a(cVar.d()).b(cVar.c());
        } else {
            a6.a(cVar.c()).b(cVar.d());
        }
        if (view.getBackground() == null) {
            view.setBackground(a6.a());
        }
    }

    public static /* synthetic */ void a(a aVar, Map map, List list, int i9) {
        if (map == null || list == null || list.size() <= 1) {
            return;
        }
        if (map.containsKey("choice_one_callback") && (map.get("choice_one_callback") instanceof d)) {
            d dVar = (d) map.get("choice_one_callback");
            if (dVar != null) {
                dVar.a((CampaignEx) list.get(i9));
                try {
                    CampaignEx campaignEx = (CampaignEx) list.get(i9);
                    com.mbridge.msdk.foundation.same.report.d.d dVar2 = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar2.a(CampaignEx.JSON_NATIVE_VIDEO_CLICK, "0");
                    dVar2.a("time", Long.valueOf(aVar.f18655i));
                    dVar2.a("choose_cid", campaignEx.getId());
                    dVar2.a("position", Integer.valueOf(i9));
                    dVar2.a("type", "choseFromTwoSelect");
                    com.mbridge.msdk.video.module.b.a.a("2000103", campaignEx, dVar2);
                } catch (Exception e4) {
                    if (MBridgeConstans.DEBUG) {
                        e4.printStackTrace();
                    }
                }
            }
            aVar.b();
            return;
        }
        if (map.containsKey("order_view_callback") && (map.get("order_view_callback") instanceof com.mbridge.msdk.video.dynview.e.c)) {
            com.mbridge.msdk.video.dynview.e.c cVar = (com.mbridge.msdk.video.dynview.e.c) map.get("order_view_callback");
            if (cVar != null) {
                cVar.a((CampaignEx) list.get(i9), i9);
            }
            aVar.b();
        }
    }

    public static /* synthetic */ void a(a aVar, com.mbridge.msdk.video.dynview.c cVar, View view) {
        Map<String, Bitmap> map = aVar.f18649c;
        if (map == null || map.size() <= 1) {
            return;
        }
        new com.mbridge.msdk.video.dynview.h.b();
        Map<String, Bitmap> map2 = aVar.f18649c;
        if (view != null) {
            com.mbridge.msdk.video.dynview.i.a.a.a().a(map2, cVar, view);
        }
    }
}
