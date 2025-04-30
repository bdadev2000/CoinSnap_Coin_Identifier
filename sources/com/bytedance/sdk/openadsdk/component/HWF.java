package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.component.video.api.COT.zp;
import com.bytedance.sdk.component.COT.Bj;
import com.bytedance.sdk.component.ku.ku;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.model.ot;
import com.bytedance.sdk.openadsdk.core.model.pvr;
import com.bytedance.sdk.openadsdk.core.model.rV;
import com.bytedance.sdk.openadsdk.core.woN;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.cW;
import com.bytedance.sdk.openadsdk.utils.tG;
import com.mbridge.msdk.foundation.entity.o;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class HWF {
    private static volatile HWF zp;
    private final Map<String, AtomicInteger> COT = new ConcurrentHashMap();
    private final woN<com.bytedance.sdk.openadsdk.lMd.zp> KS;
    private final Context jU;
    private final com.bytedance.sdk.openadsdk.zp.lMd lMd;

    /* loaded from: classes.dex */
    public interface KS {
        void zp();

        void zp(int i9, String str);
    }

    /* loaded from: classes.dex */
    public interface jU {
        void zp(Bitmap bitmap);
    }

    /* loaded from: classes.dex */
    public interface lMd {
        void zp();

        void zp(@Nullable com.bytedance.sdk.openadsdk.Bj.zp.lMd lmd);
    }

    /* loaded from: classes.dex */
    public class zp extends ku {
        private final com.bytedance.sdk.openadsdk.component.COT.zp lMd;

        public zp(com.bytedance.sdk.openadsdk.component.COT.zp zpVar) {
            super("App Open Ad Write Cache");
            this.lMd = zpVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("tt_openad_materialMeta", "material" + this.lMd.zp(), com.bytedance.sdk.component.utils.zp.zp(this.lMd.lMd().Eg()).toString());
            } catch (Throwable unused) {
            }
        }
    }

    private HWF(Context context) {
        if (context != null) {
            this.jU = context.getApplicationContext();
        } else {
            this.jU = KVG.zp();
        }
        this.lMd = new com.bytedance.sdk.openadsdk.zp.lMd(10, 8, true);
        this.KS = KVG.KS();
    }

    @Nullable
    public com.bytedance.sdk.openadsdk.core.model.woN COT(int i9) {
        long zp2 = com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("tt_openad", "material_expiration_time".concat(String.valueOf(i9)), -1L);
        com.bytedance.sdk.openadsdk.core.model.woN HWF = HWF(i9);
        if (System.currentTimeMillis() / 1000 < zp2 && HWF != null) {
            return HWF;
        }
        if (HWF != null || zp2 != -1) {
            QR(i9);
            if (HWF != null) {
                com.bytedance.sdk.openadsdk.component.jU.zp.zp(HWF);
                return null;
            }
            return null;
        }
        return null;
    }

    @Nullable
    public com.bytedance.sdk.openadsdk.core.model.woN HWF(int i9) {
        String str;
        String lMd2 = com.bytedance.sdk.openadsdk.multipro.jU.jU.lMd("tt_openad_materialMeta", "material".concat(String.valueOf(i9)), null);
        if (!TextUtils.isEmpty(lMd2)) {
            try {
                str = com.bytedance.sdk.component.utils.zp.KS(new JSONObject(lMd2).optString("message"));
            } catch (JSONException e4) {
                tG.zp("TTAppOpenAdCacheManager", e4.getMessage());
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    com.bytedance.sdk.openadsdk.core.model.woN zp2 = com.bytedance.sdk.openadsdk.core.lMd.zp(new JSONObject(str));
                    if (zp2 != null) {
                        return zp2;
                    }
                } catch (JSONException e9) {
                    tG.zp("TTAppOpenAdCacheManager", e9.getMessage());
                }
            }
        }
        return null;
    }

    public void KS(int i9) {
        com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("tt_openad", "image_has_cached".concat(String.valueOf(i9)), Boolean.TRUE);
    }

    public void QR(int i9) {
        com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("tt_openad_materialMeta", "material".concat(String.valueOf(i9)));
        com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("tt_openad", "material_expiration_time".concat(String.valueOf(i9)));
        com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("tt_openad", "video_has_cached".concat(String.valueOf(i9)));
        com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("tt_openad", "image_has_cached".concat(String.valueOf(i9)));
    }

    public boolean jU(int i9) {
        return com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("tt_openad", "image_has_cached".concat(String.valueOf(i9)), false);
    }

    private int KS(AdSlot adSlot) {
        StringBuilder sb = new StringBuilder("material_expiration_time");
        sb.append(adSlot.getCodeId());
        return com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("tt_openad", sb.toString(), -1L) == -1 ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lMd(AdSlot adSlot) {
        AtomicInteger atomicInteger = this.COT.get(adSlot.getCodeId());
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
        } else {
            atomicInteger.decrementAndGet();
        }
        this.COT.put(adSlot.getCodeId(), atomicInteger);
    }

    public static HWF zp(Context context) {
        if (zp == null) {
            synchronized (HWF.class) {
                try {
                    if (zp == null) {
                        zp = new HWF(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lMd(@NonNull final com.bytedance.sdk.openadsdk.core.model.woN won, final AdSlot adSlot, final ot otVar) {
        final int FGx = won.FGx();
        zp(won, otVar, new lMd() { // from class: com.bytedance.sdk.openadsdk.component.HWF.5
            @Override // com.bytedance.sdk.openadsdk.component.HWF.lMd
            public void zp(com.bytedance.sdk.openadsdk.Bj.zp.lMd lmd) {
                com.bytedance.sdk.openadsdk.component.COT.zp zpVar = new com.bytedance.sdk.openadsdk.component.COT.zp(FGx, won);
                HWF.this.zp(zpVar);
                com.bytedance.sdk.openadsdk.component.jU.zp.zp(zpVar.lMd(), 1, otVar);
                HWF.this.lMd(adSlot);
            }

            @Override // com.bytedance.sdk.openadsdk.component.HWF.lMd
            public void zp() {
                HWF.this.lMd(adSlot);
            }
        });
    }

    public boolean lMd(int i9) {
        return com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("tt_openad", "video_has_cached".concat(String.valueOf(i9)), false);
    }

    private void lMd(com.bytedance.sdk.openadsdk.component.COT.zp zpVar) {
        QUv.zp(new zp(zpVar), 5);
    }

    public static void zp(com.bytedance.sdk.openadsdk.core.model.woN won, jU jUVar) {
        zp(won, jUVar, 0);
    }

    public static void zp(com.bytedance.sdk.openadsdk.core.model.woN won, final jU jUVar, final int i9) {
        String dT = won.eWG().dT();
        if (TextUtils.isEmpty(dT)) {
            return;
        }
        com.bytedance.sdk.openadsdk.HWF.jU.zp(dT).zp(won.eWG().KS()).lMd(won.eWG().lMd()).COT(WNy.jU(KVG.zp())).jU(WNy.KS(KVG.zp())).KS(2).zp(new com.bytedance.sdk.component.COT.ku() { // from class: com.bytedance.sdk.openadsdk.component.HWF.2
            @Override // com.bytedance.sdk.component.COT.ku
            public Bitmap zp(Bitmap bitmap) {
                if (i9 <= 0) {
                    return bitmap;
                }
                return com.bytedance.sdk.component.adexpress.jU.zp.zp(KVG.zp(), bitmap, i9);
            }
        }).zp(new com.bytedance.sdk.openadsdk.HWF.lMd(won, dT, new com.bytedance.sdk.component.COT.KVG<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.component.HWF.1
            @Override // com.bytedance.sdk.component.COT.KVG
            public void zp(int i10, String str, @Nullable Throwable th) {
            }

            @Override // com.bytedance.sdk.component.COT.KVG
            public void zp(Bj<Bitmap> bj) {
                jU jUVar2;
                if (bj == null || bj.lMd() == null || bj.KS() == null || (jUVar2 = jU.this) == null) {
                    return;
                }
                jUVar2.zp(bj.lMd());
            }
        }));
    }

    public boolean lMd(com.bytedance.sdk.openadsdk.core.model.woN won) {
        if (won == null || won.Rg() == null || won.Rg().size() == 0 || TextUtils.isEmpty(won.Rg().get(0).zp())) {
            return false;
        }
        rV rVVar = won.Rg().get(0);
        return zp(rVVar.zp(), rVVar.QR());
    }

    public String lMd() {
        String name = new File(CacheDirFactory.getRootDir()).getName();
        if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            return o.j(name, "/openad_image_cache/");
        }
        return o.j(name, "//openad_image_cache/");
    }

    public void zp(final AdSlot adSlot) {
        if (adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        AtomicInteger atomicInteger = this.COT.get(adSlot.getCodeId());
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
        }
        if (atomicInteger.get() + KS(adSlot) > 0) {
            return;
        }
        atomicInteger.incrementAndGet();
        this.COT.put(adSlot.getCodeId(), atomicInteger);
        final ot otVar = new ot();
        otVar.zp(cW.zp());
        pvr pvrVar = new pvr();
        pvrVar.dT = otVar;
        pvrVar.jU = 2;
        pvrVar.ku = 2;
        this.KS.zp(adSlot, pvrVar, 3, new woN.zp() { // from class: com.bytedance.sdk.openadsdk.component.HWF.3
            @Override // com.bytedance.sdk.openadsdk.core.woN.zp
            public void zp(int i9, String str) {
                HWF.this.lMd(adSlot);
            }

            @Override // com.bytedance.sdk.openadsdk.core.woN.zp
            public void zp(com.bytedance.sdk.openadsdk.core.model.zp zpVar, com.bytedance.sdk.openadsdk.core.model.lMd lmd) {
                if (zpVar != null && zpVar.KS() != null && zpVar.KS().size() != 0) {
                    com.bytedance.sdk.openadsdk.core.model.woN won = zpVar.KS().get(0);
                    if (won != null && won.hG()) {
                        com.bytedance.sdk.openadsdk.component.COT.zp zpVar2 = new com.bytedance.sdk.openadsdk.component.COT.zp(won.FGx(), won);
                        HWF.this.zp(zpVar2);
                        com.bytedance.sdk.openadsdk.component.jU.zp.zp(zpVar2.lMd(), 1, otVar);
                        HWF.this.lMd(adSlot);
                        return;
                    }
                    if (!com.bytedance.sdk.openadsdk.core.model.woN.COT(won)) {
                        HWF.this.lMd(won, adSlot, otVar);
                        return;
                    } else {
                        HWF.this.zp(won, adSlot, otVar);
                        return;
                    }
                }
                lmd.zp(-3);
                com.bytedance.sdk.openadsdk.core.model.lMd.zp(lmd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(@NonNull final com.bytedance.sdk.openadsdk.core.model.woN won, final AdSlot adSlot, final ot otVar) {
        final int FGx = won.FGx();
        zp(won, adSlot, otVar, new KS() { // from class: com.bytedance.sdk.openadsdk.component.HWF.4
            @Override // com.bytedance.sdk.openadsdk.component.HWF.KS
            public void zp() {
                com.bytedance.sdk.openadsdk.component.COT.zp zpVar = new com.bytedance.sdk.openadsdk.component.COT.zp(FGx, won);
                HWF.this.zp(zpVar);
                com.bytedance.sdk.openadsdk.component.jU.zp.zp(zpVar.lMd(), 1, otVar);
                HWF.this.lMd(adSlot);
            }

            @Override // com.bytedance.sdk.openadsdk.component.HWF.KS
            public void zp(int i9, String str) {
                HWF.this.lMd(adSlot);
            }
        });
    }

    public void zp(@NonNull final com.bytedance.sdk.openadsdk.core.model.woN won, AdSlot adSlot, final ot otVar, final KS ks) {
        final cW zp2 = cW.zp();
        final int FGx = won.FGx();
        com.bykv.vk.openvk.component.video.api.KS.lMd eWG = won.eWG();
        String Bj = eWG.Bj();
        String rV = eWG.rV();
        if (TextUtils.isEmpty(rV)) {
            rV = com.bytedance.sdk.component.utils.COT.zp(Bj);
        }
        final File zp3 = com.bytedance.sdk.openadsdk.component.QR.zp.zp(rV);
        if (zp3.exists()) {
            com.bytedance.sdk.openadsdk.component.QR.zp.zp(zp3);
            zp(FGx);
            long KS2 = zp2.KS();
            if (otVar != null) {
                otVar.zp(KS2);
                otVar.zp(1);
            }
            ks.zp();
            zp(won, (jU) null);
            return;
        }
        if (KVG.jU().Lij(String.valueOf(FGx)) && !com.bytedance.sdk.component.utils.KVG.jU(KVG.zp())) {
            ks.zp(100, "OnlyWifi");
            return;
        }
        com.bytedance.sdk.openadsdk.core.video.zp.lMd zp4 = com.bytedance.sdk.openadsdk.core.model.woN.zp(zp3.getParent(), won);
        zp4.zp("material_meta", won);
        zp4.zp("ad_slot", adSlot);
        com.bytedance.sdk.openadsdk.core.video.jU.zp.zp(zp4, new zp.InterfaceC0049zp() { // from class: com.bytedance.sdk.openadsdk.component.HWF.6
            @Override // com.bykv.vk.openvk.component.video.api.COT.zp.InterfaceC0049zp
            public void lMd(com.bykv.vk.openvk.component.video.api.KS.KS ks2, int i9) {
            }

            @Override // com.bykv.vk.openvk.component.video.api.COT.zp.InterfaceC0049zp
            public void zp(com.bykv.vk.openvk.component.video.api.KS.KS ks2, int i9) {
                HWF.this.zp(FGx);
                long KS3 = zp2.KS();
                com.bytedance.sdk.openadsdk.component.jU.zp.lMd(won, KS3, true);
                ot otVar2 = otVar;
                if (otVar2 != null) {
                    otVar2.zp(KS3);
                    otVar.zp(2);
                }
                ks.zp();
                HWF.zp(won, (jU) null);
            }

            @Override // com.bykv.vk.openvk.component.video.api.COT.zp.InterfaceC0049zp
            public void zp(com.bykv.vk.openvk.component.video.api.KS.KS ks2, int i9, String str) {
                long KS3 = zp2.KS();
                com.bytedance.sdk.openadsdk.component.jU.zp.lMd(won, KS3, false);
                ot otVar2 = otVar;
                if (otVar2 != null) {
                    otVar2.zp(KS3);
                }
                ks.zp(i9, str);
                try {
                    if (zp3.exists() && zp3.isFile()) {
                        com.bytedance.sdk.component.utils.HWF.KS(zp3);
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    public void zp(final com.bytedance.sdk.openadsdk.core.model.woN won, final ot otVar, final lMd lmd) {
        final cW zp2 = cW.zp();
        final int FGx = won.FGx();
        rV rVVar = won.Rg().get(0);
        String QR = rVVar.QR();
        String zp3 = rVVar.zp();
        int lMd2 = rVVar.lMd();
        int KS2 = rVVar.KS();
        String zp4 = TextUtils.isEmpty(QR) ? com.bytedance.sdk.component.utils.COT.zp(zp3) : QR;
        if (TextUtils.isEmpty(zp4)) {
            if (lmd != null) {
                lmd.zp();
                return;
            }
            return;
        }
        File lMd3 = com.bytedance.sdk.openadsdk.component.QR.zp.lMd(zp4);
        if (zp(zp3, QR)) {
            KS(FGx);
            long KS3 = zp2.KS();
            if (otVar != null) {
                otVar.zp(KS3);
                otVar.zp(1);
            }
            lmd.zp(null);
            return;
        }
        com.bytedance.sdk.openadsdk.utils.tG.zp(new com.bytedance.sdk.openadsdk.Bj.zp(zp3, rVVar.QR()), lMd2, KS2, new tG.zp() { // from class: com.bytedance.sdk.openadsdk.component.HWF.7
            @Override // com.bytedance.sdk.openadsdk.utils.tG.zp
            public void zp(@NonNull com.bytedance.sdk.openadsdk.Bj.zp.lMd lmd2) {
                if (lmd2.jU()) {
                    HWF.this.KS(FGx);
                    long KS4 = zp2.KS();
                    com.bytedance.sdk.openadsdk.component.jU.zp.zp(won, KS4, true);
                    ot otVar2 = otVar;
                    if (otVar2 != null) {
                        otVar2.zp(KS4);
                        otVar.zp(2);
                    }
                    lmd.zp(lmd2);
                    return;
                }
                com.bytedance.sdk.openadsdk.component.jU.zp.zp(won, zp2.KS(), false);
                lmd.zp();
            }

            @Override // com.bytedance.sdk.openadsdk.utils.tG.zp
            public void zp() {
                com.bytedance.sdk.openadsdk.component.jU.zp.zp(won, zp2.KS(), false);
                lmd.zp();
            }
        }, lMd3.getParent());
    }

    public void zp(int i9) {
        com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("tt_openad", "video_has_cached".concat(String.valueOf(i9)), Boolean.TRUE);
    }

    public void zp(com.bytedance.sdk.openadsdk.component.COT.zp zpVar) {
        if (zpVar.lMd() != null) {
            com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("tt_openad", "material_expiration_time" + zpVar.zp(), Long.valueOf(zpVar.lMd().Np()));
            lMd(zpVar);
        }
    }

    @Nullable
    public String zp(com.bytedance.sdk.openadsdk.core.model.woN won) {
        if (won != null && won.eWG() != null && !TextUtils.isEmpty(won.eWG().Bj())) {
            String Bj = won.eWG().Bj();
            String rV = won.eWG().rV();
            if (TextUtils.isEmpty(rV)) {
                rV = com.bytedance.sdk.component.utils.COT.zp(Bj);
            }
            File zp2 = com.bytedance.sdk.openadsdk.component.QR.zp.zp(rV);
            if (zp2.exists() && zp2.isFile()) {
                return zp2.getAbsolutePath();
            }
        }
        return null;
    }

    public boolean zp(String str, String str2) {
        boolean z8;
        try {
            if (TextUtils.isEmpty(str2)) {
                str2 = com.bytedance.sdk.component.utils.COT.zp(str);
            }
            File lMd2 = com.bytedance.sdk.openadsdk.component.QR.zp.lMd(str2);
            InputStream zp2 = com.bytedance.sdk.openadsdk.HWF.jU.zp(str, str2);
            if (zp2 != null) {
                try {
                    zp2.close();
                } catch (IOException e4) {
                    com.bytedance.sdk.component.utils.tG.zp("TTAppOpenAdCacheManager", e4.getMessage());
                }
                z8 = true;
            } else {
                z8 = false;
            }
            if (!z8) {
                if (com.bytedance.sdk.openadsdk.HWF.jU.zp(str, str2, lMd2.getParent())) {
                    return true;
                }
                if (new File(lMd2.getPath() + ".0").exists()) {
                    return true;
                }
            }
            return z8;
        } catch (Exception e9) {
            com.bytedance.sdk.component.utils.tG.zp("TTAppOpenAdCacheManager", e9.getMessage());
            return false;
        }
    }

    public void zp(File file) {
        try {
            this.lMd.zp(file);
        } catch (IOException e4) {
            com.bytedance.sdk.component.utils.tG.zp("TTAppOpenAdCacheManager", "trimFileCache fail", e4);
        }
    }

    public void zp() {
        File[] listFiles;
        try {
            com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("tt_openad_materialMeta");
            com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("tt_openad");
        } catch (Throwable unused) {
        }
        try {
            File cacheDir = this.jU.getCacheDir();
            if (cacheDir == null || !cacheDir.exists() || !cacheDir.isDirectory() || (listFiles = cacheDir.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.HWF.8
                @Override // java.io.FileFilter
                public boolean accept(File file) {
                    if (file == null) {
                        return false;
                    }
                    String name = file.getName();
                    if (!name.contains("openad_image_cache") && !name.contains("openad_video_cache")) {
                        return false;
                    }
                    return true;
                }
            })) == null) {
                return;
            }
            for (File file : listFiles) {
                try {
                    com.bytedance.sdk.component.utils.HWF.KS(file);
                } catch (Throwable unused2) {
                }
            }
        } catch (Throwable unused3) {
        }
    }
}
