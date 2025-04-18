package com.bytedance.sdk.openadsdk.component.reward;

import a4.j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Ne;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.utils.Sco;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import m2.l;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AlY {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile AlY YFl;
    private final Map<Wwa, Long> AlY = j.r();
    private final Context Sg;
    private final GA tN;

    /* loaded from: classes.dex */
    public interface YFl<T> {
        void YFl(boolean z10, T t5);
    }

    private AlY(Context context) {
        Context applicationContext;
        if (context == null) {
            applicationContext = lG.YFl();
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.Sg = applicationContext;
        this.tN = new GA("sp_full_screen_video");
    }

    private boolean Sg(Wwa wwa) {
        if (wwa != null) {
            if (Ne.Wwa(wwa) || wwa.BPI() != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void YFl(String str, Wwa wwa) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String Sg = this.tN.Sg(str);
        String ivp = wwa != null ? wwa.ivp() : "";
        if (TextUtils.isEmpty(Sg) || TextUtils.isEmpty(ivp) || Sg.equals(ivp)) {
            this.tN.DSW(str);
        }
    }

    public void YFl() {
        File[] listFiles;
        File[] listFiles2;
        try {
            boolean z10 = com.bytedance.sdk.openadsdk.core.NjR.DSW("sp_full_screen_video");
            File file = new File(this.Sg.getDataDir(), z10 ? "files" : "shared_prefs");
            if (file.exists() && file.isDirectory() && (listFiles2 = file.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.reward.AlY.1
                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    if (file2 != null) {
                        return file2.getName().contains("sp_full_screen_video");
                    }
                    return false;
                }
            })) != null) {
                for (File file2 : listFiles2) {
                    if (z10) {
                        try {
                            com.bytedance.sdk.component.utils.vc.tN(file2);
                        } catch (Throwable unused) {
                        }
                    } else {
                        this.Sg.deleteSharedPreferences(file2.getName().replace(".xml", ""));
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        try {
            File cacheDir = this.Sg.getCacheDir();
            if (cacheDir == null || !cacheDir.exists() || !cacheDir.isDirectory() || (listFiles = cacheDir.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.reward.AlY.2
                @Override // java.io.FileFilter
                public boolean accept(File file3) {
                    if (file3 != null) {
                        return file3.getName().contains("full_screen_video_cache");
                    }
                    return false;
                }
            })) == null) {
                return;
            }
            for (File file3 : listFiles) {
                try {
                    com.bytedance.sdk.component.utils.vc.tN(file3);
                } catch (Throwable unused3) {
                }
            }
        } catch (Throwable unused4) {
        }
    }

    public void YFl(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.YFl yFl) {
        if (yFl == null || adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        String YFl2 = yFl.YFl();
        try {
            this.tN.YFl(adSlot.getCodeId(), yFl.YoT().toString(), YFl2);
        } catch (Throwable unused) {
        }
    }

    public static AlY YFl(Context context) {
        if (YFl == null) {
            synchronized (AlY.class) {
                if (YFl == null) {
                    YFl = new AlY(context);
                }
            }
        }
        return YFl;
    }

    public String YFl(Wwa wwa) {
        if (wwa == null || wwa.BPI() == null || TextUtils.isEmpty(wwa.BPI().f23462g)) {
            return null;
        }
        return YFl(wwa.BPI().f23462g, wwa.BPI().c(), wwa.dBO());
    }

    public String YFl(String str, String str2, int i10) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = com.bytedance.sdk.component.utils.wN.YFl(str);
        }
        File YFl2 = YFl(str2, i10);
        if (YFl2 == null || !YFl2.exists() || !YFl2.isFile() || YFl2.length() <= 0) {
            return null;
        }
        return YFl2.getAbsolutePath();
    }

    public com.bytedance.sdk.openadsdk.core.model.YFl YFl(String str, boolean z10) {
        com.bytedance.sdk.openadsdk.core.model.YFl yFl;
        long tN = this.tN.tN(str);
        boolean AlY = this.tN.AlY(str);
        boolean vc2 = this.tN.vc(str);
        int Sg = wN.Sg();
        if ((System.currentTimeMillis() - tN < 10500000) && !AlY && (!z10 || Sg != 2 || !vc2)) {
            try {
                String YFl2 = this.tN.YFl(str);
                if (!TextUtils.isEmpty(YFl2)) {
                    JSONObject jSONObject = new JSONObject(YFl2);
                    if (jSONObject.has("creatives")) {
                        yFl = com.bytedance.sdk.openadsdk.core.model.YFl.Sg(jSONObject);
                    } else {
                        Wwa YFl3 = com.bytedance.sdk.openadsdk.core.Sg.YFl(jSONObject);
                        com.bytedance.sdk.openadsdk.core.model.YFl yFl2 = new com.bytedance.sdk.openadsdk.core.model.YFl();
                        yFl2.YFl(YFl3);
                        yFl = yFl2;
                    }
                    if (yFl != null && yFl.AlY()) {
                        Iterator<Wwa> it = yFl.tN().iterator();
                        while (it.hasNext()) {
                            if (!Sg(it.next())) {
                                it.remove();
                            }
                        }
                        if (yFl.AlY()) {
                            return yFl;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(final boolean z10, final Wwa wwa, final long j3, String str) {
        Long remove = this.AlY.remove(wwa);
        final long elapsedRealtime = remove == null ? 0L : SystemClock.elapsedRealtime() - remove.longValue();
        final String str2 = z10 ? "load_video_success" : "load_video_error";
        final String str3 = (z10 || str == null) ? null : str;
        com.bytedance.sdk.openadsdk.pDU.tN.YFl(str2, false, new com.bytedance.sdk.openadsdk.pDU.Sg() { // from class: com.bytedance.sdk.openadsdk.component.reward.AlY.3
            @Override // com.bytedance.sdk.openadsdk.pDU.Sg
            @Nullable
            public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                return com.bytedance.sdk.openadsdk.pDU.YFl.AlY.Sg().YFl(str2).Sg(Sco.YFl(z10, wwa, elapsedRealtime, j3, str3).toString());
            }
        });
    }

    public void YFl(final Wwa wwa, final YFl<Object> yFl) {
        this.AlY.put(wwa, Long.valueOf(SystemClock.elapsedRealtime()));
        if (wwa.BPI() != null && !TextUtils.isEmpty(wwa.BPI().f23462g)) {
            String str = wwa.BPI().f23462g;
            File YFl2 = YFl(wwa.BPI().c(), wwa.dBO());
            com.bytedance.sdk.component.DSW.Sg.YFl AlY = com.bytedance.sdk.openadsdk.lG.tN.YFl().Sg().AlY();
            AlY.Sg(str);
            AlY.YFl(YFl2.getParent(), YFl2.getName());
            AlY.YFl(new com.bytedance.sdk.component.DSW.YFl.YFl() { // from class: com.bytedance.sdk.openadsdk.component.reward.AlY.4
                @Override // com.bytedance.sdk.component.DSW.YFl.YFl
                public void YFl(com.bytedance.sdk.component.DSW.Sg.tN tNVar, com.bytedance.sdk.component.DSW.Sg sg2) {
                    if (sg2.vc() && sg2.wN() != null && sg2.wN().exists()) {
                        YFl yFl2 = yFl;
                        if (yFl2 != null) {
                            yFl2.YFl(true, null);
                        }
                        AlY.this.YFl(true, wwa, sg2.YFl(), sg2.Sg());
                        return;
                    }
                    YFl yFl3 = yFl;
                    if (yFl3 != null) {
                        yFl3.YFl(false, null);
                    }
                    AlY.this.YFl(false, wwa, sg2.YFl(), sg2.Sg());
                }

                @Override // com.bytedance.sdk.component.DSW.YFl.YFl
                public void YFl(com.bytedance.sdk.component.DSW.Sg.tN tNVar, IOException iOException) {
                    YFl yFl2 = yFl;
                    if (yFl2 != null) {
                        yFl2.YFl(false, null);
                    }
                    AlY.this.YFl(false, wwa, -2L, iOException.getMessage());
                }
            });
            return;
        }
        if (yFl != null) {
            yFl.YFl(false, null);
        }
        YFl(false, wwa, -1L, null);
    }

    private File YFl(String str, int i10) {
        return new File(((l) CacheDirFactory.getICacheDir(i10)).d(), str);
    }

    public void YFl(String str) {
        this.tN.wN(str);
    }
}
