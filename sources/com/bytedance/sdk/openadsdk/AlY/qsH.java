package com.bytedance.sdk.openadsdk.AlY;

import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class qsH {
    private final WebView DSW;
    private long NjR;
    private final Wwa YFl;

    /* renamed from: vc, reason: collision with root package name */
    private int f10502vc;
    private int wN;
    private String qsH = "landingpage";
    private final Map<Integer, Long> Sg = new HashMap();
    private final List<Integer> tN = new ArrayList();
    private final Map<Integer, String> AlY = new HashMap();

    public qsH(Wwa wwa, WebView webView) {
        this.YFl = wwa;
        this.DSW = webView;
    }

    public void AlY(String str) {
        this.qsH = str;
    }

    public void Sg(String str) {
        if (YFl(false)) {
            tN.YFl(this.YFl, this.qsH, this.wN, str, (float) (SystemClock.elapsedRealtime() - this.NjR));
        }
    }

    public void YFl(String str) {
        if (YFl(true)) {
            tN.YFl(this.YFl, this.qsH, this.wN, str);
            this.AlY.put(Integer.valueOf(this.wN), str);
            this.NjR = SystemClock.elapsedRealtime();
        }
    }

    public void tN(String str) {
        String str2 = this.AlY.get(Integer.valueOf(this.wN));
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        String str3 = str2;
        int i10 = this.wN;
        if (i10 > 0) {
            tN.YFl(this.YFl, this.qsH, i10, str3, str, 1);
        }
    }

    private void Sg(boolean z10) {
        try {
            WebBackForwardList copyBackForwardList = this.DSW.copyBackForwardList();
            if (copyBackForwardList != null) {
                if (z10) {
                    this.wN = copyBackForwardList.getCurrentIndex() + 1;
                } else {
                    this.f10502vc = copyBackForwardList.getCurrentIndex() + 1;
                }
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("ArbitrageLandingLog", th2.toString());
        }
    }

    public void YFl(WebView webView, String str) {
        Wwa wwa = this.YFl;
        if (wwa == null || !com.bytedance.sdk.component.NjR.Sg.YFl(wwa.nc().tN(), str)) {
            return;
        }
        String str2 = this.AlY.get(Integer.valueOf(this.wN));
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        tN.YFl(this.YFl, this.qsH, this.wN, str2, str, 2);
    }

    private boolean YFl(boolean z10) {
        int i10 = z10 ? this.wN : this.f10502vc;
        Sg(z10);
        int i11 = z10 ? this.wN : this.f10502vc;
        return i11 > 0 && i11 != i10;
    }
}
