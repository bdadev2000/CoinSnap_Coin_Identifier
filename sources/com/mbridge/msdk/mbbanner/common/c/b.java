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

/* loaded from: classes4.dex */
public class b {
    private static final String a = "b";

    /* renamed from: b, reason: collision with root package name */
    private Context f13818b;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.a.c f13820d;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.util.a f13821e;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.b.b f13822f;

    /* renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.b.d f13823g;

    /* renamed from: c, reason: collision with root package name */
    private int f13819c = 0;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f13824h = false;

    /* renamed from: i, reason: collision with root package name */
    private Timer f13825i = new Timer();

    /* renamed from: j, reason: collision with root package name */
    private volatile List<String> f13826j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f13827k = false;

    /* renamed from: l, reason: collision with root package name */
    private volatile boolean f13828l = false;

    /* renamed from: m, reason: collision with root package name */
    private volatile boolean f13829m = false;

    /* renamed from: n, reason: collision with root package name */
    private String f13830n = "";

    /* loaded from: classes4.dex */
    public static class a implements com.mbridge.msdk.foundation.same.c.c {
        private b a;

        /* renamed from: b, reason: collision with root package name */
        private String f13838b;

        /* renamed from: c, reason: collision with root package name */
        private CampaignEx f13839c;

        public a(b bVar, String str, CampaignEx campaignEx) {
            this.a = bVar;
            this.f13838b = str;
            this.f13839c = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.c.c
        public final void onFailedLoad(String str, String str2) {
            if (MBridgeConstans.DEBUG) {
                ad.c(b.a, "DownloadImageListener campaign image fail");
            }
            b bVar = this.a;
            if (bVar != null) {
                bVar.a(this.f13838b, 1, str2, false, this.f13839c);
            }
        }

        @Override // com.mbridge.msdk.foundation.same.c.c
        public final void onSuccessLoad(Bitmap bitmap, String str) {
            if (MBridgeConstans.DEBUG) {
                ad.c(b.a, "DownloadImageListener campaign image success");
            }
            b bVar = this.a;
            if (bVar != null) {
                bVar.a(this.f13838b, 1, str, true, this.f13839c);
            }
        }
    }

    public b(Context context, com.mbridge.msdk.mbbanner.common.a.c cVar, com.mbridge.msdk.mbbanner.common.b.b bVar, com.mbridge.msdk.mbbanner.common.util.a aVar) {
        this.f13818b = context.getApplicationContext();
        this.f13820d = cVar;
        this.f13822f = bVar;
        this.f13821e = aVar;
    }

    private int b(String str) {
        try {
            int b3 = this.f13820d.b();
            if (b3 > this.f13820d.c()) {
                return 0;
            }
            return b3;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    private void a(String str) {
        if (this.f13829m) {
            return;
        }
        if ((this.f13827k || this.f13828l) && this.f13826j.size() == 0) {
            ad.c(a, "在子线程处理业务逻辑 完成");
            this.f13824h = true;
            this.f13829m = true;
            this.f13825i.cancel();
            this.f13821e.a(this.f13822f, str);
            this.f13823g.a(str);
        }
    }

    public final void a(String str, int i10, String str2, boolean z10, CampaignEx campaignEx) {
        if (z10) {
            if (i10 == 1) {
                ad.c(a, "downloadResource--> Success Image");
                synchronized (this) {
                    this.f13826j.remove(str2);
                    if (this.f13826j.size() == 0) {
                        a(str);
                    }
                }
                return;
            }
            if (i10 == 2) {
                ad.c(a, "downloadResource--> Success banner_html");
                this.f13828l = true;
                a(str);
                return;
            } else {
                if (i10 == 3) {
                    ad.c(a, "downloadResource--> Success banner_url");
                    this.f13827k = true;
                    a(str);
                    return;
                }
                return;
            }
        }
        if (i10 == -1) {
            ad.b(a, " unitId =" + str + " --> time out!");
        }
        this.f13825i.cancel();
        String str3 = a;
        ad.c(str3, "在子线程处理业务逻辑 完成");
        ad.c(str3, "downloadResource--> Fail");
        this.f13824h = true;
        com.mbridge.msdk.foundation.c.b bVar = new com.mbridge.msdk.foundation.c.b(880027);
        MBridgeIds mBridgeIds = new MBridgeIds();
        mBridgeIds.setUnitId(str);
        bVar.a(mBridgeIds);
        bVar.a(campaignEx);
        this.f13821e.b(this.f13822f, bVar);
        this.f13823g.a(str);
    }

    public final void a(String str, String str2, com.mbridge.msdk.mbbanner.common.a.b bVar, com.mbridge.msdk.mbbanner.common.b.d dVar) {
        boolean z10;
        try {
            ad.c(a, "requestCampaign--> started");
            this.f13823g = dVar;
            com.mbridge.msdk.mbbanner.common.f.a aVar = new com.mbridge.msdk.mbbanner.common.f.a() { // from class: com.mbridge.msdk.mbbanner.common.c.b.2
                @Override // com.mbridge.msdk.mbbanner.common.f.a
                public final void a(CampaignUnit campaignUnit) {
                    try {
                        ad.c(b.a, "requestCampaign--> Succeed");
                        b.this.f13821e.a(b.this.f13822f, campaignUnit, this.unitId);
                        b.a(b.this, this.unitId, campaignUnit);
                    } catch (Exception e2) {
                        ad.c(b.a, "requestCampaign--> Fail with exception = " + e2.getMessage());
                        com.mbridge.msdk.foundation.c.b bVar2 = new com.mbridge.msdk.foundation.c.b(880000);
                        bVar2.a(new MBridgeIds(this.placementId, this.unitId));
                        bVar2.a((campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().isEmpty()) ? null : campaignUnit.getAds().get(0));
                        bVar2.a((Throwable) e2);
                        b.this.f13821e.a(b.this.f13822f, bVar2);
                        b.this.f13823g.a(this.unitId);
                    }
                }

                @Override // com.mbridge.msdk.mbbanner.common.f.a
                public final void a(int i10, String str3) {
                    ad.c(b.a, "requestCampaign--> Fail errorCode:" + i10 + " msg:" + str3);
                    com.mbridge.msdk.foundation.c.b bVar2 = new com.mbridge.msdk.foundation.c.b(880003);
                    bVar2.a(i10 + "#" + str3);
                    bVar2.a(new MBridgeIds(this.placementId, this.unitId));
                    b.this.f13821e.a(b.this.f13822f, bVar2);
                    b.this.f13823g.a(this.unitId);
                }
            };
            aVar.setUnitId(str2);
            aVar.setPlacementId(str);
            aVar.setAdType(296);
            com.mbridge.msdk.mbbanner.common.e.a aVar2 = new com.mbridge.msdk.mbbanner.common.e.a(this.f13818b);
            this.f13819c = b(str2);
            e a10 = com.mbridge.msdk.mbbanner.common.a.d.a(false, this.f13818b, str2, this.f13820d.a(), this.f13819c, bVar);
            String d10 = ai.d(str2);
            if (!TextUtils.isEmpty(d10)) {
                a10.a("j", d10);
            }
            String c10 = bVar.c();
            if (TextUtils.isEmpty(c10)) {
                z10 = false;
            } else {
                aVar.a(c10);
                z10 = true;
            }
            this.f13821e.a(z10);
            aVar2.choiceV3OrV5BySetting(1, a10, aVar, c10, 30000L);
        } catch (Exception e2) {
            ad.b(a, e2.getMessage());
            com.mbridge.msdk.foundation.c.b bVar2 = new com.mbridge.msdk.foundation.c.b(880002);
            bVar2.a(new MBridgeIds(str, str2));
            this.f13821e.a(this.f13822f, bVar2);
            this.f13823g.a(str2);
        }
    }

    private List<CampaignEx> a(final String str, CampaignUnit campaignUnit) {
        ArrayList arrayList = new ArrayList();
        if (campaignUnit != null) {
            try {
                if (campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0) {
                    ArrayList<CampaignEx> ads = campaignUnit.getAds();
                    ad.c(a, "getNeedShowList 总共返回的campaign有：" + ads.size());
                    for (int i10 = 0; i10 < ads.size(); i10++) {
                        final CampaignEx campaignEx = ads.get(i10);
                        if (campaignEx != null && campaignEx.getOfferType() != 99 && (!TextUtils.isEmpty(campaignEx.getBannerUrl()) || !TextUtils.isEmpty(campaignEx.getBannerHtml()) || !TextUtils.isEmpty(campaignEx.getImageUrl()))) {
                            if (ai.c(campaignEx)) {
                                campaignEx.setRtinsType(ai.c(this.f13818b, campaignEx.getPackageName()) ? 1 : 2);
                            }
                            if (com.mbridge.msdk.foundation.same.c.a(this.f13818b, campaignEx)) {
                                arrayList.add(campaignEx);
                            } else {
                                ai.a(str, campaignEx, com.mbridge.msdk.foundation.same.a.f13292x);
                                this.f13830n = "APP ALREADY INSTALLED";
                            }
                            final Context context = this.f13818b;
                            final com.mbridge.msdk.foundation.same.report.d.a.a aVar = null;
                            try {
                                com.mbridge.msdk.foundation.same.c.a(campaignEx, context, null, new c.a() { // from class: com.mbridge.msdk.mbbanner.common.c.b.3
                                    @Override // com.mbridge.msdk.foundation.same.c.a
                                    public final void a(String str2, com.mbridge.msdk.foundation.same.report.d.b bVar) {
                                        if (!TextUtils.isEmpty(str2)) {
                                            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                                            dVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, str);
                                            bVar.a(str2, dVar);
                                            try {
                                                com.mbridge.msdk.foundation.same.report.d.c.a().a(str2, bVar, campaignEx, context, aVar);
                                            } catch (Exception e2) {
                                                if (MBridgeConstans.DEBUG) {
                                                    e2.printStackTrace();
                                                }
                                            }
                                        }
                                    }
                                });
                            } catch (Exception e2) {
                                if (MBridgeConstans.DEBUG) {
                                    e2.printStackTrace();
                                }
                            }
                        }
                    }
                    ad.c(a, "getNeedShowList 返回有以下带有视频素材的campaign：" + arrayList.size());
                }
            } catch (Exception e10) {
                e10.printStackTrace();
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
                this.f13826j.add(campaignEx.getImageUrl());
                com.mbridge.msdk.foundation.same.c.b.a(this.f13818b).a(campaignEx.getImageUrl(), new a(this, str, campaignEx));
            }
        }
    }

    private String a(String str, String str2, CampaignEx campaignEx) {
        Throwable th2;
        File file;
        String str3 = "";
        if (!TextUtils.isEmpty(str2)) {
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    try {
                        String a10 = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_HTML);
                        String md5 = SameMD5.getMD5(ao.b(str2));
                        if (TextUtils.isEmpty(md5)) {
                            md5 = String.valueOf(System.currentTimeMillis());
                        }
                        File file2 = new File(a10, md5.concat(".html"));
                        Uri.parse(str2).getPath();
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                        try {
                            fileOutputStream2.write(str2.getBytes());
                            fileOutputStream2.flush();
                            str3 = file2.getAbsolutePath();
                            fileOutputStream2.close();
                        } catch (Exception e2) {
                            e = e2;
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
                        } catch (Throwable th3) {
                            th2 = th3;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                    throw th2;
                                } catch (Exception e10) {
                                    e10.printStackTrace();
                                    throw th2;
                                }
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Exception e12) {
                e12.printStackTrace();
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
            bVar.f13821e.a(bVar.f13822f, bVar3);
            bVar.f13823g.a(str);
            return;
        }
        List<CampaignEx> a10 = bVar.a(str, campaignUnit);
        new Thread(new Runnable() { // from class: com.mbridge.msdk.mbbanner.common.c.b.4
            @Override // java.lang.Runnable
            public final void run() {
                ad.c(b.a, "在单独子线程保存数据库 开始");
                j.a(g.a(b.this.f13818b)).a();
                CampaignUnit campaignUnit2 = campaignUnit;
                if (campaignUnit2 != null && campaignUnit2.getAds() != null && campaignUnit.getAds().size() > 0) {
                    BannerUtils.uisList(b.this.f13818b, campaignUnit.getAds());
                }
                ad.c(b.a, "在单独子线程保存数据库 完成");
            }
        }).start();
        int i10 = 0;
        if (a10 != null && a10.size() != 0) {
            String str2 = a;
            ad.c(str2, "在子线程处理业务逻辑 开始");
            final CampaignEx campaignEx2 = a10.get(0);
            bVar.f13825i.schedule(new TimerTask() { // from class: com.mbridge.msdk.mbbanner.common.c.b.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    if (!b.this.f13824h) {
                        b.this.f13824h = true;
                        b.this.a(str, -1, "", false, campaignEx2);
                    }
                }
            }, 60000);
            bVar.f13820d.a(campaignUnit.getSessionId());
            int i11 = bVar.f13819c;
            try {
                if (a10.size() > 0) {
                    i11 += a10.size();
                }
                if (i11 > bVar.f13820d.c()) {
                    ad.c(str2, "saveNextOffset 重置offset为0");
                    i11 = 0;
                }
                ad.c(str2, "saveNextOffset 算出 下次的offset是:" + i11);
                if (an.b(str)) {
                    bVar.f13820d.a(i11);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            String trim = campaignEx2.getBannerUrl().trim();
            if (!TextUtils.isEmpty(trim)) {
                if (!TextUtils.isEmpty(trim)) {
                    com.mbridge.msdk.mbbanner.common.b.e eVar = new com.mbridge.msdk.mbbanner.common.b.e(bVar, str, campaignEx2);
                    com.mbridge.msdk.foundation.same.report.d.b bVar4 = new com.mbridge.msdk.foundation.same.report.d.b();
                    bVar4.a(campaignEx2);
                    H5DownLoadManager.getInstance().download(bVar4, trim, eVar);
                }
                if (a10.size() > 0) {
                    while (i10 < a10.size()) {
                        a10.get(i10).setBannerUrl(campaignEx2.getBannerUrl());
                        a10.get(i10).setHasMBTplMark(true);
                        i10++;
                    }
                }
            } else {
                String trim2 = campaignEx2.getBannerHtml().trim();
                if (!TextUtils.isEmpty(trim2)) {
                    String a11 = bVar.a(str, trim2, campaignEx2);
                    if (a10.size() > 0) {
                        while (i10 < a10.size()) {
                            a10.get(i10).setBannerHtml(a11);
                            a10.get(i10).setHasMBTplMark(trim2.contains("<MBTPLMARK>"));
                            i10++;
                        }
                    }
                } else {
                    bVar.f13828l = true;
                    bVar.f13827k = true;
                }
            }
            bVar.a(str, a10);
            return;
        }
        ad.c(a, "tryDownloadOnLoadSuccess 返回的campaign 没有符合下载规则的");
        if (bVar.f13830n.contains("INSTALLED")) {
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
        bVar.f13821e.a(bVar.f13822f, bVar2);
        bVar.f13823g.a(str);
    }
}
