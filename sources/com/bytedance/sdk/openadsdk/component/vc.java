package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.qsH.qsH;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.component.wN.eT;
import com.bytedance.sdk.component.wN.rkt;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.EH;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.model.aIu;
import com.bytedance.sdk.openadsdk.core.model.bZ;
import com.bytedance.sdk.openadsdk.core.qO;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.bytedance.sdk.openadsdk.utils.mn;
import com.bytedance.sdk.openadsdk.utils.pDU;
import com.bytedance.sdk.openadsdk.utils.zB;
import eb.j;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import p5.a;
import p5.c;
import r5.b;

/* loaded from: classes.dex */
public class vc {
    private static volatile vc YFl;
    private final Context AlY;
    private final com.bytedance.sdk.openadsdk.Sg.Sg Sg;
    private final qO<com.bytedance.sdk.openadsdk.AlY.YFl> tN;
    private final Map<String, AtomicInteger> wN = new ConcurrentHashMap();

    /* loaded from: classes.dex */
    public interface AlY {
        void YFl(Bitmap bitmap);
    }

    /* loaded from: classes.dex */
    public interface Sg {
        void YFl();

        void YFl(@Nullable com.bytedance.sdk.openadsdk.lG.YFl.Sg sg2);
    }

    /* loaded from: classes.dex */
    public class YFl extends qsH {
        private final com.bytedance.sdk.openadsdk.component.wN.YFl Sg;

        public YFl(com.bytedance.sdk.openadsdk.component.wN.YFl yFl) {
            super("App Open Ad Write Cache");
            this.Sg = yFl;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("tt_openad_materialMeta", "material" + this.Sg.YFl(), com.bytedance.sdk.component.utils.YFl.YFl(this.Sg.Sg().ni()).toString());
            } catch (Throwable unused) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface tN {
        void YFl();

        void YFl(int i10, String str);
    }

    private vc(Context context) {
        if (context != null) {
            this.AlY = context.getApplicationContext();
        } else {
            this.AlY = lG.YFl();
        }
        this.Sg = new com.bytedance.sdk.openadsdk.Sg.Sg(10, 8, true);
        this.tN = lG.tN();
    }

    public boolean AlY(int i10) {
        return com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("tt_openad", "image_has_cached".concat(String.valueOf(i10)), false);
    }

    public void DSW(int i10) {
        com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("tt_openad_materialMeta", "material".concat(String.valueOf(i10)));
        com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("tt_openad", "material_expiration_time".concat(String.valueOf(i10)));
        com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("tt_openad", "video_has_cached".concat(String.valueOf(i10)));
        com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("tt_openad", "image_has_cached".concat(String.valueOf(i10)));
    }

    public void tN(int i10) {
        com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("tt_openad", "image_has_cached".concat(String.valueOf(i10)), Boolean.TRUE);
    }

    @Nullable
    public Wwa vc(int i10) {
        String str;
        String Sg2 = com.bytedance.sdk.openadsdk.multipro.AlY.AlY.Sg("tt_openad_materialMeta", "material".concat(String.valueOf(i10)), null);
        if (!TextUtils.isEmpty(Sg2)) {
            try {
                str = com.bytedance.sdk.component.utils.YFl.tN(new JSONObject(Sg2).optString(PglCryptUtils.KEY_MESSAGE));
            } catch (JSONException e2) {
                YoT.YFl("TTAppOpenAdCacheManager", e2.getMessage());
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    Wwa YFl2 = com.bytedance.sdk.openadsdk.core.Sg.YFl(new JSONObject(str));
                    if (YFl2 != null) {
                        return YFl2;
                    }
                } catch (JSONException e10) {
                    YoT.YFl("TTAppOpenAdCacheManager", e10.getMessage());
                }
            }
        }
        return null;
    }

    @Nullable
    public Wwa wN(int i10) {
        long YFl2 = com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("tt_openad", "material_expiration_time".concat(String.valueOf(i10)), -1L);
        Wwa vc2 = vc(i10);
        if (System.currentTimeMillis() / 1000 < YFl2 && vc2 != null) {
            return vc2;
        }
        if (vc2 != null || YFl2 != -1) {
            DSW(i10);
            if (vc2 != null) {
                com.bytedance.sdk.openadsdk.component.AlY.YFl.YFl(vc2);
                return null;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sg(AdSlot adSlot) {
        AtomicInteger atomicInteger = this.wN.get(adSlot.getCodeId());
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
        } else {
            atomicInteger.decrementAndGet();
        }
        this.wN.put(adSlot.getCodeId(), atomicInteger);
    }

    private int tN(AdSlot adSlot) {
        StringBuilder sb2 = new StringBuilder("material_expiration_time");
        sb2.append(adSlot.getCodeId());
        return com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("tt_openad", sb2.toString(), -1L) == -1 ? 0 : 1;
    }

    public static vc YFl(Context context) {
        if (YFl == null) {
            synchronized (vc.class) {
                if (YFl == null) {
                    YFl = new vc(context);
                }
            }
        }
        return YFl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sg(@NonNull final Wwa wwa, final AdSlot adSlot, final bZ bZVar) {
        final int kU = wwa.kU();
        YFl(wwa, bZVar, new Sg() { // from class: com.bytedance.sdk.openadsdk.component.vc.5
            @Override // com.bytedance.sdk.openadsdk.component.vc.Sg
            public void YFl(com.bytedance.sdk.openadsdk.lG.YFl.Sg sg2) {
                com.bytedance.sdk.openadsdk.component.wN.YFl yFl = new com.bytedance.sdk.openadsdk.component.wN.YFl(kU, wwa);
                vc.this.YFl(yFl);
                com.bytedance.sdk.openadsdk.component.AlY.YFl.YFl(yFl.Sg(), 1, bZVar);
                vc.this.Sg(adSlot);
            }

            @Override // com.bytedance.sdk.openadsdk.component.vc.Sg
            public void YFl() {
                vc.this.Sg(adSlot);
            }
        });
    }

    public boolean Sg(int i10) {
        return com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("tt_openad", "video_has_cached".concat(String.valueOf(i10)), false);
    }

    private void Sg(com.bytedance.sdk.openadsdk.component.wN.YFl yFl) {
        mn.YFl(new YFl(yFl), 5);
    }

    public static void YFl(Wwa wwa, AlY alY) {
        YFl(wwa, alY, 0);
    }

    public static void YFl(Wwa wwa, final AlY alY, final int i10) {
        String str = wwa.BPI().f23461f;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.NjR.AlY.YFl(str).YFl(wwa.BPI().f23457b).Sg(wwa.BPI().a).wN(GS.AlY(lG.YFl())).AlY(GS.tN(lG.YFl())).tN(2).YFl(new com.bytedance.sdk.component.wN.qsH() { // from class: com.bytedance.sdk.openadsdk.component.vc.2
            @Override // com.bytedance.sdk.component.wN.qsH
            public Bitmap YFl(Bitmap bitmap) {
                if (i10 <= 0) {
                    return bitmap;
                }
                return com.bytedance.sdk.component.adexpress.AlY.YFl.YFl(lG.YFl(), bitmap, i10);
            }
        }).YFl(new com.bytedance.sdk.openadsdk.NjR.Sg(wwa, str, new rkt<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.component.vc.1
            @Override // com.bytedance.sdk.component.wN.rkt
            public void YFl(int i11, String str2, @Nullable Throwable th2) {
            }

            @Override // com.bytedance.sdk.component.wN.rkt
            public void YFl(eT<Bitmap> eTVar) {
                AlY alY2;
                if (eTVar == null || eTVar.Sg() == null || eTVar.tN() == null || (alY2 = AlY.this) == null) {
                    return;
                }
                alY2.YFl(eTVar.Sg());
            }
        }));
    }

    public boolean Sg(Wwa wwa) {
        if (wwa == null || wwa.VB() == null || wwa.VB().size() == 0 || TextUtils.isEmpty(wwa.VB().get(0).YFl())) {
            return false;
        }
        EH eh2 = wwa.VB().get(0);
        return YFl(eh2.YFl(), eh2.DSW());
    }

    public String Sg() {
        String name = new File(CacheDirFactory.getRootDir()).getName();
        if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            return j.k(name, "/openad_image_cache/");
        }
        return j.k(name, "//openad_image_cache/");
    }

    public void YFl(final AdSlot adSlot) {
        if (adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        AtomicInteger atomicInteger = this.wN.get(adSlot.getCodeId());
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
        }
        if (atomicInteger.get() + tN(adSlot) > 0) {
            return;
        }
        atomicInteger.incrementAndGet();
        this.wN.put(adSlot.getCodeId(), atomicInteger);
        final bZ bZVar = new bZ();
        bZVar.YFl(zB.YFl());
        aIu aiu = new aIu();
        aiu.f10701nc = bZVar;
        aiu.AlY = 2;
        aiu.qsH = 2;
        this.tN.YFl(adSlot, aiu, 3, new qO.YFl() { // from class: com.bytedance.sdk.openadsdk.component.vc.3
            @Override // com.bytedance.sdk.openadsdk.core.qO.YFl
            public void YFl(int i10, String str) {
                vc.this.Sg(adSlot);
            }

            @Override // com.bytedance.sdk.openadsdk.core.qO.YFl
            public void YFl(com.bytedance.sdk.openadsdk.core.model.YFl yFl, com.bytedance.sdk.openadsdk.core.model.Sg sg2) {
                if (yFl != null && yFl.tN() != null && yFl.tN().size() != 0) {
                    Wwa wwa = yFl.tN().get(0);
                    if (wwa != null && wwa.Zu()) {
                        com.bytedance.sdk.openadsdk.component.wN.YFl yFl2 = new com.bytedance.sdk.openadsdk.component.wN.YFl(wwa.kU(), wwa);
                        vc.this.YFl(yFl2);
                        com.bytedance.sdk.openadsdk.component.AlY.YFl.YFl(yFl2.Sg(), 1, bZVar);
                        vc.this.Sg(adSlot);
                        return;
                    }
                    if (!Wwa.wN(wwa)) {
                        vc.this.Sg(wwa, adSlot, bZVar);
                        return;
                    } else {
                        vc.this.YFl(wwa, adSlot, bZVar);
                        return;
                    }
                }
                sg2.YFl(-3);
                com.bytedance.sdk.openadsdk.core.model.Sg.YFl(sg2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(@NonNull final Wwa wwa, final AdSlot adSlot, final bZ bZVar) {
        final int kU = wwa.kU();
        YFl(wwa, adSlot, bZVar, new tN() { // from class: com.bytedance.sdk.openadsdk.component.vc.4
            @Override // com.bytedance.sdk.openadsdk.component.vc.tN
            public void YFl() {
                com.bytedance.sdk.openadsdk.component.wN.YFl yFl = new com.bytedance.sdk.openadsdk.component.wN.YFl(kU, wwa);
                vc.this.YFl(yFl);
                com.bytedance.sdk.openadsdk.component.AlY.YFl.YFl(yFl.Sg(), 1, bZVar);
                vc.this.Sg(adSlot);
            }

            @Override // com.bytedance.sdk.openadsdk.component.vc.tN
            public void YFl(int i10, String str) {
                vc.this.Sg(adSlot);
            }
        });
    }

    public void YFl(@NonNull final Wwa wwa, AdSlot adSlot, final bZ bZVar, final tN tNVar) {
        final zB YFl2 = zB.YFl();
        final int kU = wwa.kU();
        a BPI = wwa.BPI();
        String str = BPI.f23462g;
        String c10 = BPI.c();
        if (TextUtils.isEmpty(c10)) {
            c10 = com.bytedance.sdk.component.utils.wN.YFl(str);
        }
        final File YFl3 = com.bytedance.sdk.openadsdk.component.DSW.YFl.YFl(c10);
        if (YFl3.exists()) {
            com.bytedance.sdk.openadsdk.component.DSW.YFl.YFl(YFl3);
            YFl(kU);
            long tN2 = YFl2.tN();
            if (bZVar != null) {
                bZVar.YFl(tN2);
                bZVar.YFl(1);
            }
            tNVar.YFl();
            YFl(wwa, (AlY) null);
            return;
        }
        if (lG.AlY().YI(String.valueOf(kU)) && !com.bytedance.sdk.component.utils.EH.AlY(lG.YFl())) {
            tNVar.YFl(100, "OnlyWifi");
            return;
        }
        com.bytedance.sdk.openadsdk.core.GA.YFl.Sg YFl4 = Wwa.YFl(YFl3.getParent(), wwa);
        YFl4.YFl("material_meta", wwa);
        YFl4.YFl("ad_slot", adSlot);
        com.bytedance.sdk.openadsdk.core.GA.wN.YFl.YFl(YFl4, new b() { // from class: com.bytedance.sdk.openadsdk.component.vc.6
            @Override // r5.b
            public void Sg(c cVar, int i10) {
            }

            @Override // r5.b
            public void YFl(c cVar, int i10) {
                vc.this.YFl(kU);
                long tN3 = YFl2.tN();
                com.bytedance.sdk.openadsdk.component.AlY.YFl.Sg(wwa, tN3, true);
                bZ bZVar2 = bZVar;
                if (bZVar2 != null) {
                    bZVar2.YFl(tN3);
                    bZVar.YFl(2);
                }
                tNVar.YFl();
                vc.YFl(wwa, (AlY) null);
            }

            @Override // r5.b
            public void YFl(c cVar, int i10, String str2) {
                long tN3 = YFl2.tN();
                com.bytedance.sdk.openadsdk.component.AlY.YFl.Sg(wwa, tN3, false);
                bZ bZVar2 = bZVar;
                if (bZVar2 != null) {
                    bZVar2.YFl(tN3);
                }
                tNVar.YFl(i10, str2);
                try {
                    if (YFl3.exists() && YFl3.isFile()) {
                        com.bytedance.sdk.component.utils.vc.tN(YFl3);
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    public void YFl(final Wwa wwa, final bZ bZVar, final Sg sg2) {
        final zB YFl2 = zB.YFl();
        final int kU = wwa.kU();
        EH eh2 = wwa.VB().get(0);
        String DSW = eh2.DSW();
        String YFl3 = eh2.YFl();
        int Sg2 = eh2.Sg();
        int tN2 = eh2.tN();
        String YFl4 = TextUtils.isEmpty(DSW) ? com.bytedance.sdk.component.utils.wN.YFl(YFl3) : DSW;
        if (TextUtils.isEmpty(YFl4)) {
            if (sg2 != null) {
                sg2.YFl();
                return;
            }
            return;
        }
        File Sg3 = com.bytedance.sdk.openadsdk.component.DSW.YFl.Sg(YFl4);
        if (YFl(YFl3, DSW)) {
            tN(kU);
            long tN3 = YFl2.tN();
            if (bZVar != null) {
                bZVar.YFl(tN3);
                bZVar.YFl(1);
            }
            sg2.YFl(null);
            return;
        }
        pDU.YFl(new com.bytedance.sdk.openadsdk.lG.YFl(YFl3, eh2.DSW()), Sg2, tN2, new pDU.YFl() { // from class: com.bytedance.sdk.openadsdk.component.vc.7
            @Override // com.bytedance.sdk.openadsdk.utils.pDU.YFl
            public void YFl(@NonNull com.bytedance.sdk.openadsdk.lG.YFl.Sg sg3) {
                if (sg3.AlY()) {
                    vc.this.tN(kU);
                    long tN4 = YFl2.tN();
                    com.bytedance.sdk.openadsdk.component.AlY.YFl.YFl(wwa, tN4, true);
                    bZ bZVar2 = bZVar;
                    if (bZVar2 != null) {
                        bZVar2.YFl(tN4);
                        bZVar.YFl(2);
                    }
                    sg2.YFl(sg3);
                    return;
                }
                com.bytedance.sdk.openadsdk.component.AlY.YFl.YFl(wwa, YFl2.tN(), false);
                sg2.YFl();
            }

            @Override // com.bytedance.sdk.openadsdk.utils.pDU.YFl
            public void YFl() {
                com.bytedance.sdk.openadsdk.component.AlY.YFl.YFl(wwa, YFl2.tN(), false);
                sg2.YFl();
            }
        }, Sg3.getParent());
    }

    public void YFl(int i10) {
        com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("tt_openad", "video_has_cached".concat(String.valueOf(i10)), Boolean.TRUE);
    }

    public void YFl(com.bytedance.sdk.openadsdk.component.wN.YFl yFl) {
        if (yFl.Sg() == null || Wwa.vc(yFl.Sg())) {
            return;
        }
        com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("tt_openad", "material_expiration_time" + yFl.YFl(), Long.valueOf(yFl.Sg().YP()));
        Sg(yFl);
    }

    @Nullable
    public String YFl(Wwa wwa) {
        if (wwa != null && wwa.BPI() != null && !TextUtils.isEmpty(wwa.BPI().f23462g)) {
            String str = wwa.BPI().f23462g;
            String c10 = wwa.BPI().c();
            if (TextUtils.isEmpty(c10)) {
                c10 = com.bytedance.sdk.component.utils.wN.YFl(str);
            }
            File YFl2 = com.bytedance.sdk.openadsdk.component.DSW.YFl.YFl(c10);
            if (YFl2.exists() && YFl2.isFile()) {
                return YFl2.getAbsolutePath();
            }
        }
        return null;
    }

    public boolean YFl(String str, String str2) {
        boolean z10;
        try {
            if (TextUtils.isEmpty(str2)) {
                str2 = com.bytedance.sdk.component.utils.wN.YFl(str);
            }
            File Sg2 = com.bytedance.sdk.openadsdk.component.DSW.YFl.Sg(str2);
            InputStream YFl2 = com.bytedance.sdk.openadsdk.NjR.AlY.YFl(str, str2);
            if (YFl2 != null) {
                try {
                    YFl2.close();
                } catch (IOException e2) {
                    YoT.YFl("TTAppOpenAdCacheManager", e2.getMessage());
                }
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (com.bytedance.sdk.openadsdk.NjR.AlY.YFl(str, str2, Sg2.getParent())) {
                    return true;
                }
                if (new File(Sg2.getPath() + ".0").exists()) {
                    return true;
                }
            }
            return z10;
        } catch (Exception e10) {
            YoT.YFl("TTAppOpenAdCacheManager", e10.getMessage());
            return false;
        }
    }

    public void YFl(File file) {
        try {
            this.Sg.YFl(file);
        } catch (IOException e2) {
            YoT.YFl("TTAppOpenAdCacheManager", "trimFileCache fail", e2);
        }
    }

    public void YFl() {
        File[] listFiles;
        try {
            com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("tt_openad_materialMeta");
            com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("tt_openad");
        } catch (Throwable unused) {
        }
        try {
            File cacheDir = this.AlY.getCacheDir();
            if (cacheDir == null || !cacheDir.exists() || !cacheDir.isDirectory() || (listFiles = cacheDir.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.vc.8
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
                    com.bytedance.sdk.component.utils.vc.tN(file);
                } catch (Throwable unused2) {
                }
            }
        } catch (Throwable unused3) {
        }
    }
}
