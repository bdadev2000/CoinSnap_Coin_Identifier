package com.bytedance.sdk.openadsdk.vc;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.pDU;
import com.bytedance.sdk.openadsdk.pDU.YFl.AlY;
import com.bytedance.sdk.openadsdk.pDU.tN;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Sg {
    private static volatile Sg YFl;
    private final ConcurrentHashMap<String, com.bytedance.sdk.openadsdk.EH.YFl> Sg = new ConcurrentHashMap<>();
    private com.bytedance.sdk.openadsdk.EH.YFl tN = null;
    private volatile boolean AlY = false;
    private volatile HandlerThread wN = null;

    /* renamed from: vc, reason: collision with root package name */
    private volatile Handler f10840vc = null;
    private String DSW = "";
    private int qsH = 0;
    private volatile long NjR = 0;

    /* renamed from: nc, reason: collision with root package name */
    private final Runnable f10839nc = new Runnable() { // from class: com.bytedance.sdk.openadsdk.vc.Sg.6
        @Override // java.lang.Runnable
        public void run() {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                } catch (Throwable th2) {
                    YoT.Sg(th2.getMessage());
                }
                if (YFl.YFl().wN()) {
                    Set<String> keySet = Sg.this.Sg.keySet();
                    if (keySet.size() > Sg.this.qsH) {
                        Sg.this.qsH = keySet.size();
                    }
                    HashSet hashSet = new HashSet(5);
                    ArrayList arrayList = new ArrayList(keySet.size());
                    arrayList.addAll(Sg.this.Sg.values());
                    Collections.sort(arrayList);
                    for (int i10 = 0; i10 < arrayList.size() && i10 < 5; i10++) {
                        hashSet.add(((com.bytedance.sdk.openadsdk.EH.YFl) arrayList.get(i10)).Sg());
                    }
                    try {
                        for (String str : keySet) {
                            com.bytedance.sdk.openadsdk.EH.YFl yFl = (com.bytedance.sdk.openadsdk.EH.YFl) Sg.this.Sg.get(str);
                            if (yFl != null) {
                                JSONObject YFl2 = yFl.YFl(jSONObject2);
                                if (hashSet.contains(str)) {
                                    jSONObject.put(str, YFl2);
                                }
                            }
                        }
                        jSONObject.put("common", jSONObject2);
                    } catch (JSONException e2) {
                        YoT.Sg(e2.getMessage());
                    }
                    Sg.this.DSW = jSONObject.toString();
                    Sg.this.tN().postDelayed(Sg.this.f10839nc, YFl.YFl().AlY());
                }
                try {
                    if (Sg.this.tN != null) {
                        jSONObject.put("common", Sg.this.tN.YFl(jSONObject2));
                    }
                } catch (JSONException e10) {
                    YoT.Sg(e10.getMessage());
                }
                Sg.this.DSW = jSONObject.toString();
                Sg.this.tN().postDelayed(Sg.this.f10839nc, YFl.YFl().AlY());
            } catch (OutOfMemoryError e11) {
                YoT.Sg(e11.getMessage());
            }
        }
    };

    private Sg() {
    }

    private void AlY() {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.NjR > 10000) {
            tN.YFl("track_feature_result", false, new com.bytedance.sdk.openadsdk.pDU.Sg() { // from class: com.bytedance.sdk.openadsdk.vc.Sg.1
                @Override // com.bytedance.sdk.openadsdk.pDU.Sg
                @Nullable
                public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                    Sg.this.NjR = elapsedRealtime;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, String.valueOf(Sg.this.qsH));
                    return AlY.Sg().YFl("track_feature_result").Sg(jSONObject.toString());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Handler tN() {
        if (this.wN != null && this.wN.isAlive()) {
            if (this.f10840vc == null) {
                synchronized (pDU.class) {
                    if (this.f10840vc == null) {
                        this.f10840vc = new Handler(this.wN.getLooper());
                    }
                }
            }
        } else {
            synchronized (pDU.class) {
                if (this.wN == null || !this.wN.isAlive()) {
                    this.wN = new HandlerThread("csj_feature", -1);
                    this.wN.start();
                    this.f10840vc = new Handler(this.wN.getLooper());
                }
            }
        }
        return this.f10840vc;
    }

    private void wN() {
        if (this.AlY) {
            return;
        }
        this.AlY = true;
        tN().postDelayed(this.f10839nc, YFl.YFl().AlY());
    }

    public void Sg() {
        try {
            if (YFl.YFl().tN()) {
                tN().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.vc.Sg.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (YFl.YFl().wN()) {
                            Iterator it = Sg.this.Sg.keySet().iterator();
                            while (it.hasNext()) {
                                com.bytedance.sdk.openadsdk.EH.YFl yFl = (com.bytedance.sdk.openadsdk.EH.YFl) Sg.this.Sg.get((String) it.next());
                                if (yFl != null) {
                                    yFl.YFl();
                                }
                            }
                            return;
                        }
                        if (Sg.this.tN != null) {
                            Sg.this.tN.YFl();
                        }
                    }
                });
            }
        } catch (OutOfMemoryError e2) {
            YoT.Sg(e2.getMessage());
        }
    }

    public static Sg YFl() {
        if (YFl == null) {
            synchronized (com.bytedance.sdk.openadsdk.core.tN.class) {
                if (YFl == null) {
                    YFl = new Sg();
                }
            }
        }
        return YFl;
    }

    public void YFl(JSONObject jSONObject) {
        if (YFl.YFl().tN()) {
            try {
                jSONObject.put("feature_data", this.DSW);
                AlY();
            } catch (JSONException e2) {
                YoT.Sg(e2.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(@NonNull String str, @NonNull String str2, String str3) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && YFl.YFl().tN()) {
                wN();
                if (YFl.YFl().wN()) {
                    com.bytedance.sdk.openadsdk.EH.YFl yFl = this.Sg.get(str2);
                    if (yFl == null) {
                        yFl = new com.bytedance.sdk.openadsdk.EH.YFl(str2);
                    }
                    yFl.YFl(str, str3);
                    this.Sg.put(str2, yFl);
                    return;
                }
                if (this.tN == null) {
                    this.tN = new com.bytedance.sdk.openadsdk.EH.YFl(str2);
                }
                this.tN.YFl(str, str3);
            }
        } catch (OutOfMemoryError e2) {
            YoT.Sg(e2.getMessage());
        }
    }

    public void YFl(@NonNull final String str, @NonNull final String str2, final String str3, String str4) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !YFl.YFl().tN()) {
            return;
        }
        if (!"show".equals(str) && !CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str) && !"dislike".equals(str)) {
            if (YFl.YFl().Wwa()) {
                if (TextUtils.isEmpty(str4)) {
                    return;
                }
                if (!"rewarded_video".equals(str4) && !"fullscreen_interstitial_ad".equals(str4) && !"open_ad".equals(str4)) {
                    return;
                }
            }
            if ("feed_play".equals(str) || "feed_pause".equals(str) || "feed_continue".equals(str) || "feed_over".equals(str) || "feed_break".equals(str) || "play_error".equals(str)) {
                tN().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.vc.Sg.3
                    @Override // java.lang.Runnable
                    public void run() {
                        Sg.this.YFl(str, str2, str3);
                    }
                });
                return;
            }
            return;
        }
        tN().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.vc.Sg.2
            @Override // java.lang.Runnable
            public void run() {
                Sg.this.YFl(str, str2, str3);
            }
        });
    }

    public void YFl(@NonNull final String str, final Wwa wwa) {
        if (!TextUtils.isEmpty(str) && YFl.YFl().tN() && Wwa.wN(wwa)) {
            if (!YFl.YFl().Wwa() || wwa.JGG() == 8 || wwa.JGG() == 7 || wwa.JGG() == 3) {
                if ("videoPercent30".equals(str) || "videoForceBreak".equals(str)) {
                    tN().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.vc.Sg.4
                        @Override // java.lang.Runnable
                        public void run() {
                            String kYz = wwa.kYz();
                            String ivp = wwa.ivp();
                            if (!TextUtils.isEmpty(kYz)) {
                                Sg.this.YFl(str, kYz, ivp);
                            }
                        }
                    });
                }
            }
        }
    }

    public void YFl(@NonNull final String str, final Wwa wwa, final String str2) {
        if (TextUtils.isEmpty(str) || !YFl.YFl().tN()) {
            return;
        }
        if ("landingStart".equals(str) || "landingFinish".equals(str) || "landingContinue".equals(str) || "landingPause".equals(str)) {
            tN().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.vc.Sg.5
                @Override // java.lang.Runnable
                public void run() {
                    Wwa wwa2 = wwa;
                    if (wwa2 != null && !TextUtils.isEmpty(wwa2.kYz())) {
                        Sg.this.YFl(str, wwa.kYz(), wwa.ivp() + str2);
                    }
                }
            });
        }
    }
}
