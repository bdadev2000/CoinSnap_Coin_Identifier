package com.bytedance.sdk.openadsdk.core.AlY;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.component.utils.vc;
import com.bytedance.sdk.component.utils.wN;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.GA.tN.tN;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.multipro.Sg;
import com.bytedance.sdk.openadsdk.pDU.YFl.AlY;
import eb.j;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class YFl {
    private final List<String> YFl = new CopyOnWriteArrayList();
    private final tN Sg = new tN(5, 5, true);
    private final ConcurrentHashMap<String, Long> tN = new ConcurrentHashMap<>();

    /* renamed from: com.bytedance.sdk.openadsdk.core.AlY.YFl$YFl, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0109YFl {
        private static final YFl YFl = new YFl();
    }

    private boolean tN(String str) {
        return !this.YFl.contains(str);
    }

    public File Sg(String str) {
        String k10;
        String YFl = wN.YFl(str);
        if (YFl == null) {
            return null;
        }
        String name = new File(CacheDirFactory.getRootDir()).getName();
        if (Sg.tN()) {
            k10 = j.k(name, "/music/");
        } else {
            k10 = j.k(name, "//music/");
        }
        return vc.YFl(lG.YFl(), Sg.tN(), k10, YFl);
    }

    public void tN() {
        com.bytedance.sdk.openadsdk.pDU.tN.YFl("music_preload_start", false, new com.bytedance.sdk.openadsdk.pDU.Sg() { // from class: com.bytedance.sdk.openadsdk.core.AlY.YFl.2
            @Override // com.bytedance.sdk.openadsdk.pDU.Sg
            public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                AlY YFl = AlY.Sg().YFl("music_preload_start");
                YFl.YFl();
                return YFl;
            }
        });
    }

    public static YFl YFl() {
        return C0109YFl.YFl;
    }

    public void YFl(com.bytedance.sdk.openadsdk.core.model.YFl yFl) {
        List<Wwa> tN = yFl.tN();
        if (tN == null || tN.size() == 0) {
            return;
        }
        for (int i10 = 0; i10 < tN.size(); i10++) {
            Wwa wwa = tN.get(i10);
            if (wwa != null) {
                YFl(wwa);
            }
        }
    }

    public InputStream YFl(String str) {
        File Sg = Sg(str);
        if (Sg != null && YFl(Sg)) {
            try {
                return new FileInputStream(Sg);
            } catch (Exception e2) {
                YoT.YFl("MusicCacheManager", e2.getMessage());
            }
        }
        return null;
    }

    private void YFl(Wwa wwa) {
        Wwa.YFl lu;
        String eT;
        if (wwa == null || (lu = wwa.lu()) == null || (eT = lu.eT()) == null || !eT.contains("music_url")) {
            return;
        }
        tN();
        String AlY = lu.AlY();
        if (TextUtils.isEmpty(AlY)) {
            try {
                new JSONObject().put("result", 0);
            } catch (JSONException e2) {
                YoT.YFl("MusicCacheManager", e2.getMessage());
            }
            YFl(0, -1L, 10001, "music url string is null");
            return;
        }
        File Sg = Sg(AlY);
        if (Sg == null) {
            return;
        }
        Sg.getPath();
        if (YFl(Sg)) {
            YFl(2, -1L, -1, null);
        } else {
            YFl(wwa, AlY, Sg);
        }
    }

    public void Sg() {
        File YFl = YFl(lG.YFl(), Sg.tN());
        YFl.getAbsolutePath();
        try {
            this.Sg.YFl(YFl);
        } catch (IOException e2) {
            YoT.YFl("MusicCacheManager", "trimFileCache fail", e2);
        }
    }

    private boolean YFl(File file) {
        return file.exists() && file.length() != 0;
    }

    private void YFl(Wwa wwa, String str, File file) {
        if (tN(str)) {
            this.tN.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
            com.bytedance.sdk.component.DSW.Sg.YFl AlY = com.bytedance.sdk.openadsdk.lG.tN.YFl().Sg().AlY();
            AlY.Sg(str);
            AlY.YFl(file.getParent(), file.getName());
            AlY.tN(str);
            this.YFl.add(str);
            AlY.YFl(new com.bytedance.sdk.component.DSW.YFl.YFl() { // from class: com.bytedance.sdk.openadsdk.core.AlY.YFl.1
                @Override // com.bytedance.sdk.component.DSW.YFl.YFl
                public void YFl(com.bytedance.sdk.component.DSW.Sg.tN tNVar, com.bytedance.sdk.component.DSW.Sg sg2) {
                    sg2.tN();
                    sg2.YFl();
                    String Sg = tNVar.Sg();
                    Long l10 = (Long) YFl.this.tN.get(Sg);
                    if (sg2.vc() && sg2.wN() != null && sg2.wN().exists()) {
                        sg2.wN();
                        if (l10 != null) {
                            YFl.this.tN.remove(Sg);
                            YFl.this.YFl(1, SystemClock.elapsedRealtime() - l10.longValue(), -1, null);
                        }
                        try {
                            vc.Sg(sg2.wN());
                        } catch (IOException e2) {
                            YoT.YFl("MusicCacheManager", e2.getMessage());
                        }
                    }
                    if (sg2.vc() || l10 == null) {
                        return;
                    }
                    YFl.this.YFl(0, SystemClock.elapsedRealtime() - l10.longValue(), -2, "http response status code isn't 200");
                }

                @Override // com.bytedance.sdk.component.DSW.YFl.YFl
                public void YFl(com.bytedance.sdk.component.DSW.Sg.tN tNVar, IOException iOException) {
                    Long l10 = (Long) YFl.this.tN.get(tNVar.Sg());
                    if (l10 != null) {
                        YFl.this.YFl(0, SystemClock.elapsedRealtime() - l10.longValue(), -2, "http response status code isn't 200");
                    }
                }
            });
        }
    }

    private File YFl(Context context, boolean z10) {
        String k10;
        String name = new File(CacheDirFactory.getRootDir()).getName();
        if (Sg.tN()) {
            k10 = j.k(name, "/music");
        } else {
            k10 = j.k(name, "//music");
        }
        return vc.YFl(context, z10, k10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(final int i10, final long j3, final int i11, final String str) {
        com.bytedance.sdk.openadsdk.pDU.tN.YFl("music_preload_finish", false, new com.bytedance.sdk.openadsdk.pDU.Sg() { // from class: com.bytedance.sdk.openadsdk.core.AlY.YFl.3
            @Override // com.bytedance.sdk.openadsdk.pDU.Sg
            public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("result", i10);
                long j10 = j3;
                if (j10 != -1) {
                    jSONObject.put("load_duration", j10);
                }
                AlY Sg = AlY.Sg().YFl("music_preload_finish").Sg(jSONObject.toString());
                if (!TextUtils.isEmpty(str)) {
                    Sg.Sg(i11);
                    Sg.vc(str);
                }
                Sg.YFl();
                return Sg;
            }
        });
    }

    public void YFl(final boolean z10) {
        com.bytedance.sdk.openadsdk.pDU.tN.YFl("music_cache", false, new com.bytedance.sdk.openadsdk.pDU.Sg() { // from class: com.bytedance.sdk.openadsdk.core.AlY.YFl.4
            @Override // com.bytedance.sdk.openadsdk.pDU.Sg
            public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("result", z10);
                AlY Sg = AlY.Sg().YFl("music_cache").Sg(jSONObject.toString());
                Sg.YFl();
                return Sg;
            }
        });
    }
}
