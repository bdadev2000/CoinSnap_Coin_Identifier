package com.bytedance.sdk.component.vc.YFl.vc;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.vc.YFl.qsH;
import com.mbridge.msdk.foundation.download.Command;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class tN implements Sg {
    private final wN Sg;
    private final Context YFl;

    @SuppressLint({"StaticFieldLeak"})
    /* loaded from: classes.dex */
    public class YFl extends com.bytedance.sdk.component.vc.YFl.wN.wN {
        private final Map<String, String> AlY;
        private final AlY Sg;
        private final String tN;

        private String tN(String str) {
            if (!TextUtils.isEmpty(str)) {
                if (str.contains("{TS}") || str.contains("__TS__")) {
                    long currentTimeMillis = System.currentTimeMillis();
                    str = str.replace("{TS}", String.valueOf(currentTimeMillis)).replace("__TS__", String.valueOf(currentTimeMillis));
                }
                if ((str.contains("{UID}") || str.contains("__UID__")) && !TextUtils.isEmpty(this.tN)) {
                    return str.replace("{UID}", this.tN).replace("__UID__", this.tN);
                }
                return str;
            }
            return str;
        }

        public String Sg(String str) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    return str.replace("[ss_random]", String.valueOf(tN.Sg().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
                } catch (Exception unused) {
                    return str;
                }
            }
            return str;
        }

        public boolean YFl(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return str.startsWith("http://") || str.startsWith("https://");
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.component.vc.YFl.wN.AlY alY;
            com.bytedance.sdk.component.vc.YFl.wN rkt = qsH.DSW().rkt();
            if (rkt == null || qsH.DSW().vc() == null || !rkt.tN() || !YFl(this.Sg.Sg())) {
                return;
            }
            if (this.Sg.AlY() >= rkt.tN(this.Sg.vc())) {
                tN.this.Sg.tN(this.Sg);
                return;
            }
            try {
                rkt.GA();
                if (this.Sg.eT()) {
                    tN.this.Sg.YFl(this.Sg);
                }
                if (!rkt.YFl(tN.this.YFl())) {
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                String Sg = this.Sg.Sg();
                if (rkt.vc() == 0) {
                    Sg = tN(this.Sg.Sg());
                    if (this.Sg.tN()) {
                        Sg = Sg(Sg);
                    }
                }
                com.bytedance.sdk.component.vc.YFl.wN.tN nc2 = rkt.nc();
                if (nc2 == null) {
                    return;
                }
                nc2.YFl(Command.HTTP_HEADER_USER_AGENT, rkt.NjR());
                nc2.YFl("csj_client_source_from", "1");
                if (this.AlY != null) {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry<String, String> entry : this.AlY.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                    nc2.YFl("csj_extra_info", jSONObject.toString());
                }
                nc2.YFl(Sg);
                try {
                    alY = nc2.YFl();
                    try {
                        rkt.YFl(alY.YFl());
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                    alY = null;
                }
                AlY alY2 = this.Sg;
                alY2.YFl(alY2.AlY() + 1);
                if (alY != null && alY.YFl()) {
                    tN.this.Sg.tN(this.Sg);
                    this.Sg.Sg();
                    rkt.YFl(true, 200, System.currentTimeMillis() - currentTimeMillis, this.Sg);
                    return;
                }
                if (alY != null) {
                    this.Sg.Sg(alY.Sg());
                    this.Sg.tN(alY.tN());
                }
                if (alY != null && alY.Sg() == 8848) {
                    alY.tN();
                    tN.this.Sg.tN(this.Sg);
                } else {
                    this.Sg.Sg();
                    if (this.Sg.AlY() >= rkt.tN(this.Sg.vc())) {
                        tN.this.Sg.tN(this.Sg);
                        this.Sg.Sg();
                    } else {
                        tN.this.Sg.Sg(this.Sg);
                    }
                }
                rkt.YFl(false, this.Sg.qsH(), System.currentTimeMillis() - currentTimeMillis, this.Sg);
            } catch (Throwable unused3) {
            }
        }

        private YFl(AlY alY, String str, Map<String, String> map) {
            super("AdsStats");
            this.Sg = alY;
            this.tN = str;
            this.AlY = map;
        }
    }

    public tN(Context context, wN wNVar) {
        this.YFl = context;
        this.Sg = wNVar;
    }

    public static /* synthetic */ Random Sg() {
        return tN();
    }

    private static Random tN() {
        SecureRandom instanceStrong;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                instanceStrong = SecureRandom.getInstanceStrong();
                return instanceStrong;
            } catch (Throwable unused) {
                return new SecureRandom();
            }
        }
        return new SecureRandom();
    }

    public Context YFl() {
        Context context = this.YFl;
        return context == null ? qsH.DSW().vc() : context;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.vc.Sg
    public void YFl(String str, List<String> list, boolean z10, Map<String, String> map, int i10, String str2) {
        com.bytedance.sdk.component.vc.YFl.wN rkt = qsH.DSW().rkt();
        if (rkt == null || qsH.DSW().vc() == null || rkt.AlY() == null || !rkt.tN() || list == null || list.size() == 0) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            rkt.AlY().execute(new YFl(new AlY(UUID.randomUUID().toString() + "_" + System.currentTimeMillis(), it.next(), z10, i10, str2), str, map));
        }
    }

    @Override // com.bytedance.sdk.component.vc.YFl.vc.Sg
    public Runnable YFl(final AlY alY, final String str, final Map<String, String> map) {
        if (alY == null || TextUtils.isEmpty(alY.YFl())) {
            return null;
        }
        return new Runnable() { // from class: com.bytedance.sdk.component.vc.YFl.vc.tN.1
            @Override // java.lang.Runnable
            public void run() {
                if (tN.this.Sg.YFl(alY.YFl()) != null) {
                    new YFl(alY, str, map).run();
                }
            }
        };
    }

    @Override // com.bytedance.sdk.component.vc.YFl.vc.Sg
    public void YFl(final String str, final boolean z10) {
        com.bytedance.sdk.component.vc.YFl.wN rkt = qsH.DSW().rkt();
        if (rkt == null || qsH.DSW().vc() == null || !rkt.tN()) {
            return;
        }
        com.bytedance.sdk.component.vc.YFl.wN.wN wNVar = new com.bytedance.sdk.component.vc.YFl.wN.wN("trackFailedUrls") { // from class: com.bytedance.sdk.component.vc.YFl.vc.tN.2
            @Override // java.lang.Runnable
            public void run() {
                tN.this.YFl(tN.this.Sg.YFl(), str, z10);
            }
        };
        wNVar.YFl(1);
        if (rkt.AlY() != null) {
            rkt.AlY().execute(wNVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(List<AlY> list, String str, boolean z10) {
        if (list == null || list.size() == 0) {
            return;
        }
        com.bytedance.sdk.component.vc.YFl.wN rkt = qsH.DSW().rkt();
        for (AlY alY : list) {
            if (rkt != null && rkt.AlY() != null) {
                alY.YFl(z10);
                rkt.AlY().execute(new YFl(alY, str, null));
            }
        }
    }
}
