package com.bytedance.sdk.openadsdk.core.video.lMd;

import Q7.n0;
import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.utils.COT;
import com.bytedance.sdk.component.utils.Gzh;
import com.bytedance.sdk.component.utils.HWF;
import com.bytedance.sdk.component.utils.dQp;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.ku;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.mbridge.msdk.foundation.entity.o;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zp {
    private static volatile zp zp;
    private String lMd;
    private final Map<woN, lMd> KS = n0.q();
    private final Map<String, JSONObject> jU = n0.q();
    private final AtomicBoolean COT = new AtomicBoolean(false);
    private final Set<String> HWF = Collections.synchronizedSet(new HashSet());
    private final Map<String, String> QR = n0.q();

    /* loaded from: classes.dex */
    public static class lMd {
        long KS;
        long jU;
        long lMd;
        long zp;

        private lMd() {
        }

        public lMd KS(long j7) {
            this.KS = j7;
            return this;
        }

        public lMd jU(long j7) {
            this.jU = j7;
            return this;
        }

        public long lMd() {
            return this.jU - this.KS;
        }

        public long zp() {
            return this.lMd - this.zp;
        }

        public lMd lMd(long j7) {
            this.lMd = j7;
            return this;
        }

        public lMd zp(long j7) {
            this.zp = j7;
            return this;
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.video.lMd.zp$zp, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0118zp {
    }

    private zp() {
    }

    private boolean HWF(File file) {
        String[] list;
        if (file != null && file.isDirectory() && (list = file.list()) != null && list.length > 0) {
            return Arrays.asList(list).contains("index.html");
        }
        return false;
    }

    private void COT(File file) {
        try {
            if (!file.exists() || file.setLastModified(System.currentTimeMillis())) {
                return;
            }
            file.renameTo(file);
            file.lastModified();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jU(File file) {
        COT(file);
        try {
            ku.lMd().rV().zp(file);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File KS(File file) {
        File[] listFiles;
        if (file != null && file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length != 0) {
            for (File file2 : listFiles) {
                if (file2 != null && file2.isFile() && "index.html".equals(file2.getName())) {
                    return file;
                }
            }
            for (File file3 : listFiles) {
                if (file3 != null && file3.isDirectory()) {
                    return KS(file3);
                }
            }
        }
        return null;
    }

    public void lMd() {
        if (this.COT.get()) {
            return;
        }
        QUv.zp(new com.bytedance.sdk.component.ku.ku("PlayableCache_init") { // from class: com.bytedance.sdk.openadsdk.core.video.lMd.zp.1
            @Override // java.lang.Runnable
            public void run() {
                File[] listFiles;
                try {
                    String KS = zp.this.KS();
                    if (!TextUtils.isEmpty(KS)) {
                        File file = new File(KS);
                        if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                            for (File file2 : listFiles) {
                                if (file2 != null) {
                                    try {
                                        File KS2 = zp.this.KS(file2);
                                        if (KS2 != null && KS2.exists()) {
                                            zp.this.QR.put(file2.getName(), KS2.getAbsolutePath());
                                        }
                                        zp.this.zp(zp.this.zp(KS2), true);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
                zp.this.COT.set(true);
            }
        });
    }

    private String jU() {
        if (TextUtils.isEmpty(this.lMd)) {
            try {
                File file = new File(KVG.zp().getCacheDir(), "playable");
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.lMd = file.getAbsolutePath();
            } catch (Throwable th) {
                tG.zp("PlayableCache", "init root path error: ".concat(String.valueOf(th)));
            }
        }
        return this.lMd;
    }

    private boolean lMd(File file) {
        return file != null && file.exists() && file.isFile() && file.canRead();
    }

    public static zp zp() {
        if (zp == null) {
            synchronized (zp.class) {
                try {
                    if (zp == null) {
                        zp = new zp();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zp;
    }

    public boolean zp(woN won) {
        if (this.COT.get() && won != null && won.eWG() != null && won.eWG().tG() != null) {
            try {
                String zp2 = COT.zp(won.eWG().tG());
                if (this.jU.get(zp2) == null) {
                    return false;
                }
                return HWF(new File(KS(), zp2));
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String KS() {
        File file = new File(jU(), "games");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject zp(File file, boolean z8) {
        byte[] jU;
        String lMd2;
        try {
            if (!lMd(file) || (jU = HWF.jU(file)) == null || jU.length <= 0) {
                return null;
            }
            if (TextUtils.equals(file.getName(), "tt_open_ad_sdk_check_res.dat")) {
                lMd2 = com.bytedance.sdk.component.utils.zp.KS(new String(jU));
            } else {
                lMd2 = com.bytedance.sdk.component.jU.zp.lMd(new String(jU), com.bytedance.sdk.openadsdk.core.zp.lMd());
            }
            if (TextUtils.isEmpty(lMd2)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(lMd2);
            if (z8 && jSONObject.length() > 0) {
                this.jU.put(file.getParentFile().getName(), jSONObject);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File zp(File file) {
        File file2 = new File(file, "tt_open_ad_sdk_check_res.dat");
        return lMd(file2) ? file2 : new File(file, "tt_open_ad_sdk_check_res.dat");
    }

    public WebResourceResponse zp(String str, String str2, String str3) {
        File KS;
        try {
        } catch (Throwable th) {
            tG.zp("PlayableCache", "playable intercept error: ", th);
        }
        if (this.COT.get() && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            try {
                if ((str3.startsWith("http://") || str3.startsWith("https://")) && str3.contains("?")) {
                    str3 = str3.split("\\?")[0];
                    if (str3.endsWith("/")) {
                        str3 = str3.substring(0, str3.length() - 1);
                    }
                }
            } catch (Throwable unused) {
            }
            String zp2 = dQp.zp(KVG.zp(), str3);
            if (TextUtils.isEmpty(zp2)) {
                return null;
            }
            String zp3 = COT.zp(str);
            if (TextUtils.isEmpty(zp3)) {
                return null;
            }
            String str4 = this.QR.get(zp3);
            if (!TextUtils.isEmpty(str4)) {
                KS = new File(str4);
            } else {
                KS = KS(new File(KS(), zp3));
                if (KS != null && KS.exists()) {
                    this.QR.put(zp3, KS.getAbsolutePath());
                }
            }
            if (KS != null && KS.exists()) {
                String zp4 = zp(str2);
                if (TextUtils.isEmpty(zp4)) {
                    return null;
                }
                String replace = str3.replace(zp4, "");
                if (!TextUtils.isEmpty(replace) && !replace.startsWith("https://") && !replace.startsWith("http://")) {
                    File file = new File(KS, replace);
                    if (file.exists() && zp(zp3, replace, file) && file.getCanonicalPath().startsWith(KS.getCanonicalPath())) {
                        return new WebResourceResponse(zp2, "utf-8", new FileInputStream(file));
                    }
                }
            }
            return null;
        }
        return null;
    }

    private String zp(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\\?");
        if (split != null && split.length == 2) {
            String str2 = split[0];
            if (str2 != null && str2.endsWith("/")) {
                str = str.substring(0, split.length - 1);
            }
            String str3 = split[0];
            if (str3 != null && str3.endsWith("index.html")) {
                str = split[0];
            }
        }
        return str.replace("index.html", "");
    }

    private boolean zp(String str, String str2, File file) {
        if (file != null && file.exists()) {
            JSONObject jSONObject = this.jU.get(str);
            if (jSONObject == null) {
                return true;
            }
            String optString = jSONObject.optString(str2);
            if (optString != null && optString.equalsIgnoreCase(COT.zp(file))) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"[ByDesign4.2]BadDomainNameVerifier"})
    public void zp(final woN won, final InterfaceC0118zp interfaceC0118zp) {
        File file;
        if (won != null && won.eWG() != null && !TextUtils.isEmpty(won.eWG().tG())) {
            final String tG = won.eWG().tG();
            if (this.HWF.contains(tG)) {
                return;
            }
            this.KS.put(won, new lMd().zp(System.currentTimeMillis()));
            com.bytedance.sdk.openadsdk.core.video.lMd.lMd.zp(won);
            String zp2 = COT.zp(tG);
            final File file2 = new File(KS(), zp2);
            String str = this.QR.get(zp2);
            if (TextUtils.isEmpty(str)) {
                file = KS(file2);
                if (file != null && file.exists()) {
                    this.QR.put(zp2, file.getAbsolutePath());
                }
            } else {
                file = new File(str);
            }
            if (file != null && file.exists()) {
                com.bytedance.sdk.openadsdk.core.video.lMd.lMd.zp(won, -702, (String) null);
                COT(file2);
                this.KS.remove(won);
                zp(interfaceC0118zp, true);
                return;
            }
            try {
                HWF.KS(file2);
            } catch (Throwable unused) {
            }
            this.HWF.add(tG);
            File file3 = new File(jU(), o.j(zp2, ".zip"));
            com.bytedance.sdk.component.QR.lMd.zp jU = com.bytedance.sdk.openadsdk.Bj.KS.zp().lMd().jU();
            jU.lMd(tG);
            jU.zp(file3.getParent(), file3.getName());
            jU.zp(7);
            jU.zp("playable_download");
            jU.zp(new com.bytedance.sdk.component.QR.zp.zp() { // from class: com.bytedance.sdk.openadsdk.core.video.lMd.zp.2
                @Override // com.bytedance.sdk.component.QR.zp.zp
                public void zp(com.bytedance.sdk.component.QR.lMd.KS ks, final com.bytedance.sdk.component.QR.lMd lmd) {
                    zp.this.HWF.remove(tG);
                    final lMd lmd2 = (lMd) zp.this.KS.remove(won);
                    if (lmd2 != null) {
                        lmd2.lMd(System.currentTimeMillis());
                    }
                    if (lmd.HWF() && lmd.COT() != null && lmd.COT().exists()) {
                        QUv.lMd(new com.bytedance.sdk.component.ku.ku("downloadZip") { // from class: com.bytedance.sdk.openadsdk.core.video.lMd.zp.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                boolean z8;
                                long j7;
                                long j9;
                                try {
                                    lMd lmd3 = lmd2;
                                    if (lmd3 != null) {
                                        lmd3.KS(System.currentTimeMillis());
                                    }
                                    Gzh.zp(lmd.COT().getAbsolutePath(), file2.getAbsolutePath());
                                    lMd lmd4 = lmd2;
                                    if (lmd4 != null) {
                                        lmd4.jU(System.currentTimeMillis());
                                    }
                                    lMd lmd5 = lmd2;
                                    if (lmd5 != null) {
                                        j7 = lmd5.zp();
                                        j9 = lmd2.lMd();
                                    } else {
                                        j7 = 0;
                                        j9 = 0;
                                    }
                                    com.bytedance.sdk.openadsdk.core.video.lMd.lMd.zp(won, j7, j9);
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    zp.this.jU(file2);
                                    z8 = true;
                                    try {
                                        AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                                        File KS = zp.this.KS(file2);
                                        if (KS != null && KS.exists()) {
                                            zp.this.QR.put(file2.getName(), KS.getAbsolutePath());
                                        }
                                        zp.this.zp(zp.this.zp(KS), true);
                                    } catch (Throwable unused2) {
                                    }
                                } catch (Throwable th) {
                                    tG.zp("PlayableCache", "unzip error: ", th);
                                    com.bytedance.sdk.openadsdk.core.video.lMd.lMd.zp(won, -704, th.getMessage());
                                    z8 = false;
                                }
                                try {
                                    lmd.COT().delete();
                                } catch (Throwable unused3) {
                                }
                                AnonymousClass2 anonymousClass23 = AnonymousClass2.this;
                                zp.this.zp(interfaceC0118zp, z8);
                            }
                        });
                    } else {
                        com.bytedance.sdk.openadsdk.core.video.lMd.lMd.zp(won, lmd.zp() != 0 ? lmd.zp() : -700, (String) null);
                        zp.this.zp(interfaceC0118zp, false);
                    }
                }

                @Override // com.bytedance.sdk.component.QR.zp.zp
                public void zp(com.bytedance.sdk.component.QR.lMd.KS ks, IOException iOException) {
                    zp.this.HWF.remove(tG);
                    zp.this.KS.remove(won);
                    com.bytedance.sdk.openadsdk.core.video.lMd.lMd.zp(won, -700, iOException.getMessage());
                    zp.this.zp(interfaceC0118zp, false);
                }
            });
            return;
        }
        com.bytedance.sdk.openadsdk.core.video.lMd.lMd.zp(won, -701, (String) null);
        zp(interfaceC0118zp, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(final InterfaceC0118zp interfaceC0118zp, final boolean z8) {
        QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.lMd.zp.3
            @Override // java.lang.Runnable
            public void run() {
            }
        });
    }
}
