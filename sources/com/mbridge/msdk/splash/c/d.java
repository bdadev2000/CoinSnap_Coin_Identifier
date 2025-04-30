package com.mbridge.msdk.splash.c;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.splash.c.g;
import com.mbridge.msdk.splash.view.MBSplashView;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static com.mbridge.msdk.foundation.db.e f17837a = com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
    private static String b = "ResManager";

    /* renamed from: c, reason: collision with root package name */
    private static int f17838c = 1;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a5, code lost:
    
        if ((r0.getTimestamp() + (r0.getPlct() * 1000)) < r7) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e3, code lost:
    
        if ((r0.getTimestamp() + (r0.getPlct() * 1000)) < r7) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.mbridge.msdk.foundation.entity.CampaignEx a(com.mbridge.msdk.splash.view.MBSplashView r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, boolean r21, int r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.splash.c.d.a(com.mbridge.msdk.splash.view.MBSplashView, java.lang.String, java.lang.String, java.lang.String, boolean, int, boolean, boolean):com.mbridge.msdk.foundation.entity.CampaignEx");
    }

    private static String b(String str) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                return "";
            }
            return "file:///" + file.getAbsolutePath();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Exception e4) {
                e4.getMessage();
                return "";
            }
        }
    }

    private static CampaignEx a(CampaignEx campaignEx) {
        if (TextUtils.isEmpty(campaignEx.getAdZip()) && (TextUtils.isEmpty(campaignEx.getAdHtml()) || !campaignEx.getAdHtml().contains("<MBTPLMARK>"))) {
            campaignEx.setHasMBTplMark(false);
            campaignEx.setIsMraid(true);
        } else {
            campaignEx.setHasMBTplMark(true);
            campaignEx.setIsMraid(false);
        }
        return campaignEx;
    }

    private static boolean a(MBSplashView mBSplashView, CampaignEx campaignEx, String str, String str2, boolean z8, int i9, boolean z9) {
        boolean z10;
        if (campaignEx == null) {
            return false;
        }
        mBSplashView.clearResState();
        if (TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            z10 = true;
        } else {
            boolean z11 = mBSplashView.isVideoReady() || com.mbridge.msdk.videocommon.download.b.getInstance().a(297, str2, campaignEx.isBidCampaign());
            if (!z11) {
                a(mBSplashView, campaignEx, str2);
            } else {
                mBSplashView.setVideoReady(true);
            }
            z10 = z11;
        }
        if (!TextUtils.isEmpty(campaignEx.getAdZip()) && !mBSplashView.isH5Ready()) {
            String h5ResAddress = H5DownLoadManager.getInstance().getH5ResAddress(campaignEx.getAdZip());
            if (TextUtils.isEmpty(h5ResAddress)) {
                z10 = false;
            } else if (!z9) {
                a(mBSplashView, h5ResAddress, campaignEx, str, str2, z8, i9);
            }
        }
        if (TextUtils.isEmpty(campaignEx.getAdZip()) && !TextUtils.isEmpty(campaignEx.getAdHtml()) && !mBSplashView.isH5Ready()) {
            String b8 = b(campaignEx.getAdHtml());
            if (TextUtils.isEmpty(b8)) {
                z10 = false;
            } else if (!z9) {
                a(mBSplashView, b8, campaignEx, str, str2, z8, i9);
            }
        }
        if (campaignEx.isDynamicView()) {
            if (TextUtils.isEmpty(campaignEx.getImageUrl()) || mBSplashView.isImageReady()) {
                return false;
            }
            if (!com.mbridge.msdk.foundation.same.c.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).b(campaignEx.getImageUrl())) {
                a(mBSplashView, campaignEx, (com.mbridge.msdk.splash.view.nativeview.a) null);
            } else {
                mBSplashView.setImageReady(true);
                return true;
            }
        }
        return z10;
    }

    private static void a(final MBSplashView mBSplashView, CampaignEx campaignEx, String str) {
        com.mbridge.msdk.videocommon.listener.a aVar = new com.mbridge.msdk.videocommon.listener.a() { // from class: com.mbridge.msdk.splash.c.d.1
            @Override // com.mbridge.msdk.videocommon.listener.a
            public final void a(String str2) {
                MBSplashView.this.setVideoReady(true);
            }

            @Override // com.mbridge.msdk.videocommon.listener.a
            public final void a(String str2, String str3) {
                MBSplashView.this.setVideoReady(false);
            }
        };
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(campaignEx);
        com.mbridge.msdk.videocommon.download.b.getInstance().createUnitCache(com.mbridge.msdk.foundation.controller.c.m().c(), str, copyOnWriteArrayList, 297, aVar);
        if (!com.mbridge.msdk.videocommon.download.b.getInstance().a(297, str, campaignEx.isBidCampaign())) {
            com.mbridge.msdk.videocommon.download.b.getInstance().load(str);
        } else {
            mBSplashView.setVideoReady(true);
        }
    }

    public static void a(final MBSplashView mBSplashView, CampaignEx campaignEx, final com.mbridge.msdk.splash.view.nativeview.a aVar) {
        com.mbridge.msdk.foundation.same.c.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(campaignEx.getImageUrl(), new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.splash.c.d.2
            @Override // com.mbridge.msdk.foundation.same.c.c
            public final void onFailedLoad(String str, String str2) {
                com.mbridge.msdk.splash.view.nativeview.a aVar2 = com.mbridge.msdk.splash.view.nativeview.a.this;
                if (aVar2 != null) {
                    aVar2.b();
                }
                MBSplashView mBSplashView2 = mBSplashView;
                if (mBSplashView2 != null) {
                    mBSplashView2.setImageReady(false);
                }
            }

            @Override // com.mbridge.msdk.foundation.same.c.c
            public final void onSuccessLoad(Bitmap bitmap, String str) {
                com.mbridge.msdk.splash.view.nativeview.a aVar2 = com.mbridge.msdk.splash.view.nativeview.a.this;
                if (aVar2 != null) {
                    aVar2.a();
                }
                MBSplashView mBSplashView2 = mBSplashView;
                if (mBSplashView2 != null) {
                    mBSplashView2.setImageReady(true);
                }
            }
        });
        if (TextUtils.isEmpty(campaignEx.getIconUrl())) {
            return;
        }
        com.mbridge.msdk.foundation.same.c.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(campaignEx.getIconUrl(), new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.splash.c.d.3
            @Override // com.mbridge.msdk.foundation.same.c.c
            public final void onFailedLoad(String str, String str2) {
            }

            @Override // com.mbridge.msdk.foundation.same.c.c
            public final void onSuccessLoad(Bitmap bitmap, String str) {
            }
        });
    }

    private static void a(MBSplashView mBSplashView, String str, CampaignEx campaignEx, String str2, String str3, boolean z8, int i9) {
        g.c cVar = new g.c();
        cVar.c(str3);
        cVar.b(str2);
        cVar.a(campaignEx);
        cVar.a(str);
        cVar.a(z8);
        cVar.a(i9);
        g.a.a().a(mBSplashView, cVar, null);
    }

    public static boolean a(MBSplashView mBSplashView, CampaignEx campaignEx) {
        if (mBSplashView == null) {
            return false;
        }
        boolean isVideoReady = !TextUtils.isEmpty(campaignEx.getVideoUrlEncode()) ? mBSplashView.isVideoReady() : true;
        if (isVideoReady && !TextUtils.isEmpty(campaignEx.getAdZip())) {
            isVideoReady = mBSplashView.isH5Ready();
        }
        if (isVideoReady && TextUtils.isEmpty(campaignEx.getAdZip()) && !TextUtils.isEmpty(campaignEx.getAdHtml())) {
            isVideoReady = mBSplashView.isH5Ready();
        }
        if (TextUtils.isEmpty(campaignEx.getAdZip()) && TextUtils.isEmpty(campaignEx.getAdHtml())) {
            isVideoReady = false;
        }
        if (!campaignEx.isDynamicView()) {
            return isVideoReady;
        }
        if (TextUtils.isEmpty(campaignEx.getImageUrl())) {
            return false;
        }
        return mBSplashView.isImageReady();
    }

    public static void a(CampaignEx campaignEx, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        if (f17837a == null) {
            f17837a = com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
        }
        f17837a.b(arrayList, str);
    }

    public static void a(String str) {
        if (f17837a == null) {
            f17837a = com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
        }
        f17837a.a(str, 0, f17838c);
    }
}
