package com.mbridge.msdk.mbbanner.common.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.c;
import com.mbridge.msdk.foundation.same.net.f.e;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.foundation.tools.ao;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.mbridge.msdk.out.MBridgeIds;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16272a = "b";
    private Context b;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.a.c f16274d;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.util.a f16275e;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.b.b f16276f;

    /* renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.b.d f16277g;

    /* renamed from: c, reason: collision with root package name */
    private int f16273c = 0;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f16278h = false;

    /* renamed from: i, reason: collision with root package name */
    private Timer f16279i = new Timer();

    /* renamed from: j, reason: collision with root package name */
    private volatile List<String> f16280j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f16281k = false;
    private volatile boolean l = false;
    private volatile boolean m = false;

    /* renamed from: n, reason: collision with root package name */
    private String f16282n = "";

    /* loaded from: classes3.dex */
    public static class a implements com.mbridge.msdk.foundation.same.c.c {

        /* renamed from: a, reason: collision with root package name */
        private b f16291a;
        private String b;

        /* renamed from: c, reason: collision with root package name */
        private CampaignEx f16292c;

        public a(b bVar, String str, CampaignEx campaignEx) {
            this.f16291a = bVar;
            this.b = str;
            this.f16292c = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.c.c
        public final void onFailedLoad(String str, String str2) {
            if (MBridgeConstans.DEBUG) {
                ad.c(b.f16272a, "DownloadImageListener campaign image fail");
            }
            b bVar = this.f16291a;
            if (bVar != null) {
                bVar.a(this.b, 1, str2, false, this.f16292c);
            }
        }

        @Override // com.mbridge.msdk.foundation.same.c.c
        public final void onSuccessLoad(Bitmap bitmap, String str) {
            if (MBridgeConstans.DEBUG) {
                ad.c(b.f16272a, "DownloadImageListener campaign image success");
            }
            b bVar = this.f16291a;
            if (bVar != null) {
                bVar.a(this.b, 1, str, true, this.f16292c);
            }
        }
    }

    public b(Context context, com.mbridge.msdk.mbbanner.common.a.c cVar, com.mbridge.msdk.mbbanner.common.b.b bVar, com.mbridge.msdk.mbbanner.common.util.a aVar) {
        this.b = context.getApplicationContext();
        this.f16274d = cVar;
        this.f16276f = bVar;
        this.f16275e = aVar;
    }

    private int b(String str) {
        try {
            int b = this.f16274d.b();
            if (b > this.f16274d.c()) {
                return 0;
            }
            return b;
        } catch (Exception e4) {
            e4.printStackTrace();
            return 0;
        }
    }

    private void a(String str) {
        if (this.m) {
            return;
        }
        if ((this.f16281k || this.l) && this.f16280j.size() == 0) {
            ad.c(f16272a, "在子线程处理业务逻辑 完成");
            this.f16278h = true;
            this.m = true;
            this.f16279i.cancel();
            this.f16275e.a(this.f16276f, str);
            this.f16277g.a(str);
        }
    }

    public final void a(String str, int i9, String str2, boolean z8, CampaignEx campaignEx) {
        if (z8) {
            if (i9 == 1) {
                ad.c(f16272a, "downloadResource--> Success Image");
                synchronized (this) {
                    try {
                        this.f16280j.remove(str2);
                        if (this.f16280j.size() == 0) {
                            a(str);
                        }
                    } finally {
                    }
                }
                return;
            }
            if (i9 == 2) {
                ad.c(f16272a, "downloadResource--> Success banner_html");
                this.l = true;
                a(str);
                return;
            } else {
                if (i9 == 3) {
                    ad.c(f16272a, "downloadResource--> Success banner_url");
                    this.f16281k = true;
                    a(str);
                    return;
                }
                return;
            }
        }
        if (i9 == -1) {
            ad.b(f16272a, " unitId =" + str + " --> time out!");
        }
        this.f16279i.cancel();
        String str3 = f16272a;
        ad.c(str3, "在子线程处理业务逻辑 完成");
        ad.c(str3, "downloadResource--> Fail");
        this.f16278h = true;
        com.mbridge.msdk.foundation.c.b bVar = new com.mbridge.msdk.foundation.c.b(880027);
        MBridgeIds mBridgeIds = new MBridgeIds();
        mBridgeIds.setUnitId(str);
        bVar.a(mBridgeIds);
        bVar.a(campaignEx);
        this.f16275e.b(this.f16276f, bVar);
        this.f16277g.a(str);
    }

    public final void a(String str, String str2, com.mbridge.msdk.mbbanner.common.a.b bVar, com.mbridge.msdk.mbbanner.common.b.d dVar) {
        boolean z8;
        try {
            ad.c(f16272a, "requestCampaign--> started");
            this.f16277g = dVar;
            com.mbridge.msdk.mbbanner.common.f.a aVar = new com.mbridge.msdk.mbbanner.common.f.a() { // from class: com.mbridge.msdk.mbbanner.common.c.b.2
                @Override // com.mbridge.msdk.mbbanner.common.f.a
                public final void a(CampaignUnit campaignUnit) {
                    try {
                        ad.c(b.f16272a, "requestCampaign--> Succeed");
                        b.this.f16275e.a(b.this.f16276f, campaignUnit, this.unitId);
                        b.a(b.this, this.unitId, campaignUnit);
                    } catch (Exception e4) {
                        ad.c(b.f16272a, "requestCampaign--> Fail with exception = " + e4.getMessage());
                        com.mbridge.msdk.foundation.c.b bVar2 = new com.mbridge.msdk.foundation.c.b(880000);
                        bVar2.a(new MBridgeIds(this.placementId, this.unitId));
                        bVar2.a((campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().isEmpty()) ? null : campaignUnit.getAds().get(0));
                        bVar2.a((Throwable) e4);
                        b.this.f16275e.a(b.this.f16276f, bVar2);
                        b.this.f16277g.a(this.unitId);
                    }
                }

                @Override // com.mbridge.msdk.mbbanner.common.f.a
                public final void a(int i9, String str3) {
                    ad.c(b.f16272a, "requestCampaign--> Fail errorCode:" + i9 + " msg:" + str3);
                    com.mbridge.msdk.foundation.c.b bVar2 = new com.mbridge.msdk.foundation.c.b(880003);
                    bVar2.a(i9 + "#" + str3);
                    bVar2.a(new MBridgeIds(this.placementId, this.unitId));
                    b.this.f16275e.a(b.this.f16276f, bVar2);
                    b.this.f16277g.a(this.unitId);
                }
            };
            aVar.setUnitId(str2);
            aVar.setPlacementId(str);
            aVar.setAdType(296);
            com.mbridge.msdk.mbbanner.common.e.a aVar2 = new com.mbridge.msdk.mbbanner.common.e.a(this.b);
            this.f16273c = b(str2);
            e a6 = com.mbridge.msdk.mbbanner.common.a.d.a(false, this.b, str2, this.f16274d.a(), this.f16273c, bVar);
            String d2 = ai.d(str2);
            if (!TextUtils.isEmpty(d2)) {
                a6.a("j", d2);
            }
            String c9 = bVar.c();
            if (TextUtils.isEmpty(c9)) {
                z8 = false;
            } else {
                aVar.a(c9);
                z8 = true;
            }
            this.f16275e.a(z8);
            aVar2.choiceV3OrV5BySetting(1, a6, aVar, c9, 30000L);
        } catch (Exception e4) {
            ad.b(f16272a, e4.getMessage());
            com.mbridge.msdk.foundation.c.b bVar2 = new com.mbridge.msdk.foundation.c.b(880002);
            bVar2.a(new MBridgeIds(str, str2));
            this.f16275e.a(this.f16276f, bVar2);
            this.f16277g.a(str2);
        }
    }

    private List<CampaignEx> a(final String str, CampaignUnit campaignUnit) {
        ArrayList arrayList = new ArrayList();
        if (campaignUnit != null) {
            try {
                if (campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0) {
                    ArrayList<CampaignEx> ads = campaignUnit.getAds();
                    ad.c(f16272a, "getNeedShowList 总共返回的campaign有：" + ads.size());
                    for (int i9 = 0; i9 < ads.size(); i9++) {
                        final CampaignEx campaignEx = ads.get(i9);
                        if (campaignEx != null) {
                            if (campaignEx.getOfferType() != 99) {
                                if (TextUtils.isEmpty(campaignEx.getBannerUrl()) && TextUtils.isEmpty(campaignEx.getBannerHtml()) && TextUtils.isEmpty(campaignEx.getImageUrl())) {
                                }
                                if (ai.c(campaignEx)) {
                                    campaignEx.setRtinsType(ai.c(this.b, campaignEx.getPackageName()) ? 1 : 2);
                                }
                                if (com.mbridge.msdk.foundation.same.c.a(this.b, campaignEx)) {
                                    arrayList.add(campaignEx);
                                } else {
                                    ai.a(str, campaignEx, com.mbridge.msdk.foundation.same.a.f15696x);
                                    this.f16282n = "APP ALREADY INSTALLED";
                                }
                                final Context context = this.b;
                                try {
                                    final com.mbridge.msdk.foundation.same.report.d.a.a aVar = null;
                                    com.mbridge.msdk.foundation.same.c.a(campaignEx, context, null, new c.a() { // from class: com.mbridge.msdk.mbbanner.common.c.b.3
                                        @Override // com.mbridge.msdk.foundation.same.c.a
                                        public final void a(String str2, com.mbridge.msdk.foundation.same.report.d.b bVar) {
                                            if (!TextUtils.isEmpty(str2)) {
                                                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                                                dVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, str);
                                                bVar.a(str2, dVar);
                                                try {
                                                    com.mbridge.msdk.foundation.same.report.d.c.a().a(str2, bVar, campaignEx, context, aVar);
                                                } catch (Exception e4) {
                                                    if (MBridgeConstans.DEBUG) {
                                                        e4.printStackTrace();
                                                    }
                                                }
                                            }
                                        }
                                    });
                                } catch (Exception e4) {
                                    if (MBridgeConstans.DEBUG) {
                                        e4.printStackTrace();
                                    }
                                }
                            }
                        }
                    }
                    ad.c(f16272a, "getNeedShowList 返回有以下带有视频素材的campaign：" + arrayList.size());
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        return arrayList;
    }

    private void a(String str, List<CampaignEx> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (CampaignEx campaignEx : list) {
            if (!TextUtils.isEmpty(campaignEx.getImageUrl())) {
                this.f16280j.add(campaignEx.getImageUrl());
                com.mbridge.msdk.foundation.same.c.b.a(this.b).a(campaignEx.getImageUrl(), new a(this, str, campaignEx));
            }
        }
    }

    private String a(String str, String str2, CampaignEx campaignEx) {
        File file;
        Throwable th;
        String str3 = "";
        if (!TextUtils.isEmpty(str2)) {
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    try {
                        String a6 = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_HTML);
                        String md5 = SameMD5.getMD5(ao.b(str2));
                        if (TextUtils.isEmpty(md5)) {
                            md5 = String.valueOf(System.currentTimeMillis());
                        }
                        File file2 = new File(a6, md5.concat(".html"));
                        Uri.parse(str2).getPath();
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                        try {
                            fileOutputStream2.write(str2.getBytes());
                            fileOutputStream2.flush();
                            str3 = file2.getAbsolutePath();
                            fileOutputStream2.close();
                        } catch (Exception e4) {
                            e = e4;
                            fileOutputStream = fileOutputStream2;
                            e.printStackTrace();
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            file = new File(str3);
                            if (!file.exists()) {
                            }
                            a(str, 2, str2, false, campaignEx);
                            return str3;
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                    throw th;
                                } catch (Exception e9) {
                                    e9.printStackTrace();
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            file = new File(str3);
            if (!file.exists() && file.isFile() && file.canRead()) {
                a(str, 2, str2, true, campaignEx);
            } else {
                a(str, 2, str2, false, campaignEx);
            }
        }
        return str3;
    }

    public static /* synthetic */ void a(b bVar, final String str, final CampaignUnit campaignUnit) {
        com.mbridge.msdk.foundation.c.b bVar2;
        CampaignEx campaignEx;
        if (campaignUnit == null) {
            com.mbridge.msdk.foundation.c.b bVar3 = new com.mbridge.msdk.foundation.c.b(880003);
            MBridgeIds mBridgeIds = new MBridgeIds();
            mBridgeIds.setUnitId(str);
            bVar3.a(mBridgeIds);
            bVar.f16275e.a(bVar.f16276f, bVar3);
            bVar.f16277g.a(str);
            return;
        }
        List<CampaignEx> a6 = bVar.a(str, campaignUnit);
        new Thread(new Runnable() { // from class: com.mbridge.msdk.mbbanner.common.c.b.4
            @Override // java.lang.Runnable
            public final void run() {
                ad.c(b.f16272a, "在单独子线程保存数据库 开始");
                j.a(g.a(b.this.b)).a();
                CampaignUnit campaignUnit2 = campaignUnit;
                if (campaignUnit2 != null && campaignUnit2.getAds() != null && campaignUnit.getAds().size() > 0) {
                    BannerUtils.uisList(b.this.b, campaignUnit.getAds());
                }
                ad.c(b.f16272a, "在单独子线程保存数据库 完成");
            }
        }).start();
        int i9 = 0;
        if (a6 != null && a6.size() != 0) {
            String str2 = f16272a;
            ad.c(str2, "在子线程处理业务逻辑 开始");
            final CampaignEx campaignEx2 = a6.get(0);
            bVar.f16279i.schedule(new TimerTask() { // from class: com.mbridge.msdk.mbbanner.common.c.b.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    if (!b.this.f16278h) {
                        b.this.f16278h = true;
                        b.this.a(str, -1, "", false, campaignEx2);
                    }
                }
            }, 60000);
            bVar.f16274d.a(campaignUnit.getSessionId());
            int i10 = bVar.f16273c;
            try {
                if (a6.size() > 0) {
                    i10 += a6.size();
                }
                if (i10 > bVar.f16274d.c()) {
                    ad.c(str2, "saveNextOffset 重置offset为0");
                    i10 = 0;
                }
                ad.c(str2, "saveNextOffset 算出 下次的offset是:" + i10);
                if (an.b(str)) {
                    bVar.f16274d.a(i10);
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            String trim = campaignEx2.getBannerUrl().trim();
            if (!TextUtils.isEmpty(trim)) {
                if (!TextUtils.isEmpty(trim)) {
                    com.mbridge.msdk.mbbanner.common.b.e eVar = new com.mbridge.msdk.mbbanner.common.b.e(bVar, str, campaignEx2);
                    com.mbridge.msdk.foundation.same.report.d.b bVar4 = new com.mbridge.msdk.foundation.same.report.d.b();
                    bVar4.a(campaignEx2);
                    H5DownLoadManager.getInstance().download(bVar4, trim, eVar);
                }
                if (a6.size() > 0) {
                    while (i9 < a6.size()) {
                        a6.get(i9).setBannerUrl(campaignEx2.getBannerUrl());
                        a6.get(i9).setHasMBTplMark(true);
                        i9++;
                    }
                }
            } else {
                String trim2 = campaignEx2.getBannerHtml().trim();
                if (!TextUtils.isEmpty(trim2)) {
                    String a9 = bVar.a(str, trim2, campaignEx2);
                    if (a6.size() > 0) {
                        while (i9 < a6.size()) {
                            a6.get(i9).setBannerHtml(a9);
                            a6.get(i9).setHasMBTplMark(trim2.contains("<MBTPLMARK>"));
                            i9++;
                        }
                    }
                } else {
                    bVar.l = true;
                    bVar.f16281k = true;
                }
            }
            bVar.a(str, a6);
            return;
        }
        ad.c(f16272a, "tryDownloadOnLoadSuccess 返回的campaign 没有符合下载规则的");
        if (bVar.f16282n.contains("INSTALLED")) {
            bVar2 = new com.mbridge.msdk.foundation.c.b(880021, "APP ALREADY INSTALLED");
        } else {
            bVar2 = new com.mbridge.msdk.foundation.c.b(880003);
        }
        MBridgeIds mBridgeIds2 = new MBridgeIds();
        mBridgeIds2.setUnitId(str);
        bVar2.a(mBridgeIds2);
        if (campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0 && (campaignEx = campaignUnit.getAds().get(0)) != null) {
            bVar2.a(campaignEx);
        }
        bVar.f16275e.a(bVar.f16276f, bVar2);
        bVar.f16277g.a(str);
    }
}
