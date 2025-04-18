package com.bytedance.sdk.openadsdk.core.GA.tN;

import a4.j;
import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.qsH.qsH;
import com.bytedance.sdk.component.utils.YI;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.component.utils.pDU;
import com.bytedance.sdk.component.utils.vc;
import com.bytedance.sdk.component.utils.wN;
import com.bytedance.sdk.openadsdk.core.NjR;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.utils.mn;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class YFl {
    private static volatile YFl YFl;
    private String Sg;
    private final Map<Wwa, Sg> tN = j.r();
    private final Map<String, JSONObject> AlY = j.r();
    private final AtomicBoolean wN = new AtomicBoolean(false);

    /* renamed from: vc, reason: collision with root package name */
    private final Set<String> f10636vc = Collections.synchronizedSet(new HashSet());
    private final ConcurrentHashMap<String, com.bytedance.sdk.component.DSW.Sg.YFl> DSW = new ConcurrentHashMap<>();
    private final Map<String, String> qsH = j.r();

    /* loaded from: classes.dex */
    public static class Sg {
        long AlY;
        long Sg;
        long YFl;
        long tN;

        private Sg() {
        }

        public Sg AlY(long j3) {
            this.AlY = j3;
            return this;
        }

        public long Sg() {
            return this.AlY - this.tN;
        }

        public long YFl() {
            return this.Sg - this.YFl;
        }

        public Sg tN(long j3) {
            this.tN = j3;
            return this;
        }

        public Sg Sg(long j3) {
            this.Sg = j3;
            return this;
        }

        public Sg YFl(long j3) {
            this.YFl = j3;
            return this;
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.GA.tN.YFl$YFl, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0115YFl {
    }

    private YFl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AlY(File file) {
        wN(file);
        try {
            NjR.Sg().pDU().YFl(file);
        } catch (Throwable unused) {
        }
    }

    private void wN(File file) {
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
    public File tN(File file) {
        File[] listFiles;
        if (file != null && file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length != 0) {
            for (File file2 : listFiles) {
                if (file2 != null && file2.isFile() && "index.html".equals(file2.getName())) {
                    return file;
                }
            }
            for (File file3 : listFiles) {
                if (file3 != null && file3.isDirectory()) {
                    return tN(file3);
                }
            }
        }
        return null;
    }

    public void Sg() {
        if (this.wN.get()) {
            return;
        }
        mn.YFl(new qsH("PlayableCache_init") { // from class: com.bytedance.sdk.openadsdk.core.GA.tN.YFl.1
            @Override // java.lang.Runnable
            public void run() {
                File[] listFiles;
                try {
                    String tN = YFl.this.tN();
                    if (!TextUtils.isEmpty(tN)) {
                        File file = new File(tN);
                        if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                            for (File file2 : listFiles) {
                                if (file2 != null) {
                                    try {
                                        File tN2 = YFl.this.tN(file2);
                                        if (tN2 != null && tN2.exists()) {
                                            YFl.this.qsH.put(file2.getName(), tN2.getAbsolutePath());
                                        }
                                        YFl.this.YFl(YFl.this.YFl(tN2), true);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
                YFl.this.wN.set(true);
            }
        });
    }

    private String AlY() {
        if (TextUtils.isEmpty(this.Sg)) {
            try {
                File file = new File(lG.YFl().getCacheDir(), "playable");
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.Sg = file.getAbsolutePath();
            } catch (Throwable th2) {
                YoT.YFl("PlayableCache", "init root path error: ".concat(String.valueOf(th2)));
            }
        }
        return this.Sg;
    }

    private boolean Sg(File file) {
        return file != null && file.exists() && file.isFile() && file.canRead();
    }

    public static YFl YFl() {
        if (YFl == null) {
            synchronized (YFl.class) {
                if (YFl == null) {
                    YFl = new YFl();
                }
            }
        }
        return YFl;
    }

    public void Sg(Wwa wwa) {
        if (wwa == null || wwa.BPI() == null || TextUtils.isEmpty(wwa.BPI().f23464i) || !com.bytedance.sdk.openadsdk.aIu.YFl.YFl("can_cancel_playable", false)) {
            return;
        }
        com.bytedance.sdk.component.DSW.Sg.YFl yFl = this.DSW.get(wwa.BPI().f23464i);
        if (yFl != null) {
            yFl.tN();
        }
    }

    public boolean YFl(Wwa wwa) {
        if (this.wN.get() && wwa != null && wwa.BPI() != null && wwa.BPI().f23464i != null) {
            try {
                if (!TextUtils.isEmpty(this.qsH.get(wN.YFl(wwa.BPI().f23464i)))) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String tN() {
        File file = new File(AlY(), "games");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject YFl(File file, boolean z10) {
        byte[] AlY;
        String Sg2;
        try {
            if (!Sg(file) || (AlY = vc.AlY(file)) == null || AlY.length <= 0) {
                return null;
            }
            if (TextUtils.equals(file.getName(), "tt_open_ad_sdk_check_res.dat")) {
                Sg2 = com.bytedance.sdk.component.utils.YFl.tN(new String(AlY));
            } else {
                Sg2 = com.bytedance.sdk.component.AlY.YFl.Sg(new String(AlY), com.bytedance.sdk.openadsdk.core.YFl.Sg());
            }
            if (TextUtils.isEmpty(Sg2)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(Sg2);
            if (z10 && jSONObject.length() > 0) {
                this.AlY.put(file.getParentFile().getName(), jSONObject);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File YFl(File file) {
        File file2 = new File(file, "tt_open_ad_sdk_check_res.dat");
        return Sg(file2) ? file2 : new File(file, "tt_open_ad_sdk_check_res.dat");
    }

    public WebResourceResponse YFl(String str, String str2, String str3) {
        File tN;
        try {
        } catch (Throwable th2) {
            YoT.YFl("PlayableCache", "playable intercept error: ", th2);
        }
        if (this.wN.get() && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            try {
                if ((str3.startsWith("http://") || str3.startsWith("https://")) && str3.contains("?")) {
                    str3 = str3.split("\\?")[0];
                    if (str3.endsWith("/")) {
                        str3 = str3.substring(0, str3.length() - 1);
                    }
                }
            } catch (Throwable unused) {
            }
            String YFl2 = pDU.YFl(lG.YFl(), str3);
            if (TextUtils.isEmpty(YFl2)) {
                return null;
            }
            String YFl3 = wN.YFl(str);
            if (TextUtils.isEmpty(YFl3)) {
                return null;
            }
            String str4 = this.qsH.get(YFl3);
            if (!TextUtils.isEmpty(str4)) {
                tN = new File(str4);
            } else {
                tN = tN(new File(tN(), YFl3));
                if (tN != null && tN.exists()) {
                    this.qsH.put(YFl3, tN.getAbsolutePath());
                }
            }
            if (tN != null && tN.exists()) {
                String YFl4 = YFl(str2);
                if (TextUtils.isEmpty(YFl4)) {
                    return null;
                }
                String replace = str3.replace(YFl4, "");
                if (!TextUtils.isEmpty(replace) && !replace.startsWith("https://") && !replace.startsWith("http://")) {
                    File file = new File(tN, replace);
                    if (file.exists() && YFl(YFl3, replace, file) && file.getCanonicalPath().startsWith(tN.getCanonicalPath())) {
                        return new WebResourceResponse(YFl2, "utf-8", new FileInputStream(file));
                    }
                }
            }
            return null;
        }
        return null;
    }

    private String YFl(String str) {
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

    private boolean YFl(String str, String str2, File file) {
        if (file != null && file.exists()) {
            JSONObject jSONObject = this.AlY.get(str);
            if (jSONObject == null) {
                return true;
            }
            String optString = jSONObject.optString(str2);
            if (optString != null && optString.equalsIgnoreCase(wN.YFl(file))) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"[ByDesign4.2]BadDomainNameVerifier"})
    public void YFl(final Wwa wwa, final InterfaceC0115YFl interfaceC0115YFl) {
        File file;
        if (wwa != null && wwa.BPI() != null && !TextUtils.isEmpty(wwa.BPI().f23464i)) {
            final String str = wwa.BPI().f23464i;
            if (this.f10636vc.contains(str)) {
                return;
            }
            this.tN.put(wwa, new Sg().YFl(System.currentTimeMillis()));
            com.bytedance.sdk.openadsdk.core.GA.tN.Sg.YFl(wwa);
            String YFl2 = wN.YFl(str);
            final File file2 = new File(tN(), YFl2);
            String str2 = this.qsH.get(YFl2);
            if (TextUtils.isEmpty(str2)) {
                file = tN(file2);
                if (file != null && file.exists()) {
                    this.qsH.put(YFl2, file.getAbsolutePath());
                }
            } else {
                file = new File(str2);
            }
            if (file != null && file.exists()) {
                com.bytedance.sdk.openadsdk.core.GA.tN.Sg.YFl(wwa, -702, (String) null);
                wN(file2);
                this.tN.remove(wwa);
                YFl(interfaceC0115YFl, true);
                return;
            }
            try {
                vc.tN(file2);
            } catch (Throwable unused) {
            }
            this.f10636vc.add(str);
            File file3 = new File(AlY(), eb.j.k(YFl2, ".zip"));
            com.bytedance.sdk.component.DSW.Sg.YFl AlY = com.bytedance.sdk.openadsdk.lG.tN.YFl().Sg().AlY();
            this.DSW.put(str, AlY);
            AlY.Sg(str);
            AlY.YFl(file3.getParent(), file3.getName());
            AlY.YFl(7);
            AlY.YFl("playable_download");
            AlY.YFl(new com.bytedance.sdk.component.DSW.YFl.YFl() { // from class: com.bytedance.sdk.openadsdk.core.GA.tN.YFl.2
                @Override // com.bytedance.sdk.component.DSW.YFl.YFl
                public void YFl(com.bytedance.sdk.component.DSW.Sg.tN tNVar, final com.bytedance.sdk.component.DSW.Sg sg2) {
                    YFl.this.f10636vc.remove(str);
                    YFl.this.DSW.remove(str);
                    final Sg sg3 = (Sg) YFl.this.tN.remove(wwa);
                    if (sg3 != null) {
                        sg3.Sg(System.currentTimeMillis());
                    }
                    if (sg2.vc() && sg2.wN() != null && sg2.wN().exists()) {
                        mn.Sg(new qsH("downloadZip") { // from class: com.bytedance.sdk.openadsdk.core.GA.tN.YFl.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                boolean z10;
                                long j3;
                                long j10;
                                try {
                                    Sg sg4 = sg3;
                                    if (sg4 != null) {
                                        sg4.tN(System.currentTimeMillis());
                                    }
                                    YI.YFl(sg2.wN().getAbsolutePath(), file2.getAbsolutePath());
                                    Sg sg5 = sg3;
                                    if (sg5 != null) {
                                        sg5.AlY(System.currentTimeMillis());
                                    }
                                    Sg sg6 = sg3;
                                    if (sg6 != null) {
                                        j3 = sg6.YFl();
                                        j10 = sg3.Sg();
                                    } else {
                                        j3 = 0;
                                        j10 = 0;
                                    }
                                    com.bytedance.sdk.openadsdk.core.GA.tN.Sg.YFl(wwa, j3, j10);
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    YFl.this.AlY(file2);
                                    z10 = true;
                                    try {
                                        AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                                        File tN = YFl.this.tN(file2);
                                        if (tN != null && tN.exists()) {
                                            YFl.this.qsH.put(file2.getName(), tN.getAbsolutePath());
                                        }
                                        YFl.this.YFl(YFl.this.YFl(tN), true);
                                    } catch (Throwable unused2) {
                                    }
                                } catch (Throwable th2) {
                                    YoT.YFl("PlayableCache", "unzip error: ", th2);
                                    com.bytedance.sdk.openadsdk.core.GA.tN.Sg.YFl(wwa, -704, th2.getMessage());
                                    z10 = false;
                                }
                                try {
                                    sg2.wN().delete();
                                } catch (Throwable unused3) {
                                }
                                AnonymousClass2 anonymousClass23 = AnonymousClass2.this;
                                YFl.this.YFl(interfaceC0115YFl, z10);
                            }
                        });
                    } else {
                        com.bytedance.sdk.openadsdk.core.GA.tN.Sg.YFl(wwa, sg2.YFl() != 0 ? sg2.YFl() : -700, (String) null);
                        YFl.this.YFl(interfaceC0115YFl, false);
                    }
                }

                @Override // com.bytedance.sdk.component.DSW.YFl.YFl
                public void YFl(com.bytedance.sdk.component.DSW.Sg.tN tNVar, IOException iOException) {
                    YFl.this.f10636vc.remove(str);
                    YFl.this.DSW.remove(str);
                    YFl.this.tN.remove(wwa);
                    com.bytedance.sdk.openadsdk.core.GA.tN.Sg.YFl(wwa, -700, iOException.getMessage());
                    YFl.this.YFl(interfaceC0115YFl, false);
                }
            });
            return;
        }
        com.bytedance.sdk.openadsdk.core.GA.tN.Sg.YFl(wwa, -701, (String) null);
        YFl(interfaceC0115YFl, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(final InterfaceC0115YFl interfaceC0115YFl, final boolean z10) {
        mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.GA.tN.YFl.3
            @Override // java.lang.Runnable
            public void run() {
            }
        });
    }
}
