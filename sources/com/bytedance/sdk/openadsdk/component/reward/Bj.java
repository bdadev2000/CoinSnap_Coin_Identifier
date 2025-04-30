package com.bytedance.sdk.openadsdk.component.reward;

import Q7.n0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.model.cz;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.utils.YhE;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Bj {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile Bj zp;
    private final tG KS;
    private final Map<woN, Long> jU = n0.q();
    private final Context lMd;

    /* loaded from: classes.dex */
    public interface zp<T> {
        void zp(boolean z8, T t9);
    }

    private Bj(Context context) {
        Context applicationContext;
        if (context == null) {
            applicationContext = KVG.zp();
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.lMd = applicationContext;
        this.KS = new tG("sp_reward_video");
    }

    public com.bytedance.sdk.openadsdk.core.model.zp lMd(String str) {
        com.bytedance.sdk.openadsdk.core.model.zp zpVar;
        long lMd = this.KS.lMd(str);
        boolean KS = this.KS.KS(str);
        if (System.currentTimeMillis() - lMd < 10500000 && !KS) {
            try {
                String zp2 = this.KS.zp(str);
                if (!TextUtils.isEmpty(zp2)) {
                    JSONObject jSONObject = new JSONObject(zp2);
                    if (jSONObject.has("creatives")) {
                        zpVar = com.bytedance.sdk.openadsdk.core.model.zp.lMd(jSONObject);
                    } else {
                        woN zp3 = com.bytedance.sdk.openadsdk.core.lMd.zp(jSONObject);
                        com.bytedance.sdk.openadsdk.core.model.zp zpVar2 = new com.bytedance.sdk.openadsdk.core.model.zp();
                        zpVar2.zp(zp3);
                        zpVar = zpVar2;
                    }
                    if (zpVar != null && zpVar.jU()) {
                        Iterator<woN> it = zpVar.KS().iterator();
                        while (it.hasNext()) {
                            if (!zp(it.next())) {
                                it.remove();
                            }
                        }
                        if (zpVar.jU()) {
                            return zpVar;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public void zp(String str) {
        this.KS.jU(str);
    }

    public void zp() {
        File[] listFiles;
        String str;
        File[] listFiles2;
        try {
            boolean COT = com.bytedance.sdk.openadsdk.core.ku.COT("sp_reward_video");
            if (COT) {
                str = "files";
            } else {
                str = "shared_prefs";
            }
            File file = new File(this.lMd.getDataDir(), str);
            if (file.exists() && file.isDirectory() && (listFiles2 = file.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.reward.Bj.1
                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    if (file2 != null) {
                        return file2.getName().contains("sp_reward_video");
                    }
                    return false;
                }
            })) != null) {
                for (File file2 : listFiles2) {
                    if (COT) {
                        try {
                            com.bytedance.sdk.component.utils.HWF.KS(file2);
                        } catch (Throwable unused) {
                        }
                    } else {
                        this.lMd.deleteSharedPreferences(file2.getName().replace(".xml", ""));
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        try {
            File cacheDir = this.lMd.getCacheDir();
            if (cacheDir == null || !cacheDir.exists() || !cacheDir.isDirectory() || (listFiles = cacheDir.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.reward.Bj.2
                @Override // java.io.FileFilter
                public boolean accept(File file3) {
                    if (file3 != null) {
                        return file3.getName().contains("reward_video_cache");
                    }
                    return false;
                }
            })) == null) {
                return;
            }
            for (File file3 : listFiles) {
                try {
                    com.bytedance.sdk.component.utils.HWF.KS(file3);
                } catch (Throwable unused3) {
                }
            }
        } catch (Throwable unused4) {
        }
    }

    public void zp(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.zp zpVar) {
        if (zpVar == null || zpVar.YW() || adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        synchronized (zpVar) {
            try {
                if (!zpVar.YW()) {
                    try {
                        this.KS.zp(adSlot.getCodeId(), zpVar.Bj().toString());
                    } catch (Throwable unused) {
                        zpVar.dT();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Bj zp(Context context) {
        if (zp == null) {
            synchronized (Bj.class) {
                try {
                    if (zp == null) {
                        zp = new Bj(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zp;
    }

    public String zp(String str, String str2, int i9) {
        File zp2;
        if (!TextUtils.isEmpty(str) && (zp2 = zp(str2, i9)) != null && zp2.exists() && zp2.isFile() && zp2.length() > 0) {
            return zp2.getAbsolutePath();
        }
        return null;
    }

    private boolean zp(woN won) {
        if (won != null) {
            return cz.Bj(won) || won.eWG() != null;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(final boolean z8, final woN won, final long j7, String str) {
        Long remove = this.jU.remove(won);
        final long elapsedRealtime = remove == null ? 0L : SystemClock.elapsedRealtime() - remove.longValue();
        final String str2 = z8 ? "load_video_success" : "load_video_error";
        final String str3 = (z8 || str == null) ? null : str;
        com.bytedance.sdk.openadsdk.dT.KS.zp(str2, false, new com.bytedance.sdk.openadsdk.dT.lMd() { // from class: com.bytedance.sdk.openadsdk.component.reward.Bj.3
            @Override // com.bytedance.sdk.openadsdk.dT.lMd
            @Nullable
            public com.bytedance.sdk.openadsdk.dT.zp.lMd getLogStats() throws Exception {
                return com.bytedance.sdk.openadsdk.dT.zp.KS.lMd().zp(str2).lMd(YhE.zp(z8, won, elapsedRealtime, j7, str3).toString());
            }
        });
    }

    public void zp(final woN won, final zp<Object> zpVar) {
        this.jU.put(won, Long.valueOf(SystemClock.elapsedRealtime()));
        if (won != null && won.eWG() != null && !TextUtils.isEmpty(won.eWG().Bj())) {
            String Bj = won.eWG().Bj();
            File zp2 = zp(won.eWG().rV(), won.jyq());
            com.bytedance.sdk.component.QR.lMd.zp jU = com.bytedance.sdk.openadsdk.Bj.KS.zp().lMd().jU();
            jU.lMd(Bj);
            jU.zp(zp2.getParent(), zp2.getName());
            jU.zp(new com.bytedance.sdk.component.QR.zp.zp() { // from class: com.bytedance.sdk.openadsdk.component.reward.Bj.4
                @Override // com.bytedance.sdk.component.QR.zp.zp
                public void zp(com.bytedance.sdk.component.QR.lMd.KS ks, com.bytedance.sdk.component.QR.lMd lmd) {
                    if (lmd.HWF() && lmd.COT() != null && lmd.COT().exists()) {
                        zp zpVar2 = zpVar;
                        if (zpVar2 != null) {
                            zpVar2.zp(true, null);
                        }
                        Bj.this.zp(true, won, lmd.zp(), lmd.lMd());
                        return;
                    }
                    zp zpVar3 = zpVar;
                    if (zpVar3 != null) {
                        zpVar3.zp(false, null);
                    }
                    Bj.this.zp(false, won, lmd.zp(), lmd.lMd());
                }

                @Override // com.bytedance.sdk.component.QR.zp.zp
                public void zp(com.bytedance.sdk.component.QR.lMd.KS ks, IOException iOException) {
                    zp zpVar2 = zpVar;
                    if (zpVar2 != null) {
                        zpVar2.zp(false, null);
                    }
                    Bj.this.zp(false, won, -2L, iOException.getMessage());
                }
            });
            return;
        }
        if (zpVar != null) {
            zpVar.zp(false, null);
        }
        zp(false, won, -1L, null);
    }

    private File zp(String str, int i9) {
        return new File(CacheDirFactory.getICacheDir(i9).zp(), str);
    }
}
