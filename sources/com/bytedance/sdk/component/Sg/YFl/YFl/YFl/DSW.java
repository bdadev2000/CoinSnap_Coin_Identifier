package com.bytedance.sdk.component.Sg.YFl.YFl.YFl;

import android.text.TextUtils;
import com.bytedance.sdk.component.Sg.YFl.EH;
import com.bytedance.sdk.component.Sg.YFl.GA;
import com.bytedance.sdk.component.Sg.YFl.YoT;
import com.bytedance.sdk.component.Sg.YFl.nc;
import com.bytedance.sdk.component.Sg.YFl.rkt;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class DSW extends EH {
    public static int YFl = -1;
    int AlY;
    HttpURLConnection Sg;
    GA tN;
    String wN;

    public DSW(HttpURLConnection httpURLConnection, GA ga2) {
        this.AlY = YFl;
        this.Sg = httpURLConnection;
        this.tN = ga2;
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.EH
    public boolean AlY() {
        return tN() >= 200 && tN() < 300;
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.EH
    public com.bytedance.sdk.component.Sg.YFl.vc DSW() {
        if (this.Sg == null) {
            return new com.bytedance.sdk.component.Sg.YFl.vc(new String[0]);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : this.Sg.getHeaderFields().entrySet()) {
            for (String str : entry.getValue()) {
                if (!"Content-Range".equalsIgnoreCase(entry.getKey()) || tN() != 206) {
                    arrayList.add(entry.getKey());
                    arrayList.add(str);
                }
            }
        }
        return new com.bytedance.sdk.component.Sg.YFl.vc((String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.EH
    public nc NjR() {
        if (nc() != null && nc().Sg != null) {
            return new nc(nc().Sg);
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.EH
    public long Sg() {
        return 0L;
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.EH
    public long YFl() {
        return 0L;
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.EH, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            vc().close();
        } catch (Exception unused) {
        }
    }

    public GA nc() {
        return this.tN;
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.EH
    public YoT qsH() {
        return YoT.HTTP_1_1;
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.EH
    public int tN() {
        try {
            return this.Sg.getResponseCode();
        } catch (Exception unused) {
            return this.AlY;
        }
    }

    public String toString() {
        return "";
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.EH
    public rkt vc() {
        qsH qsh;
        com.bytedance.sdk.component.tN.YFl.YFl yFl;
        com.bytedance.sdk.component.tN.YFl.YFl yFl2;
        GA ga2 = this.tN;
        if (ga2 != null && (yFl2 = ga2.Sg) != null) {
            yFl2.eT();
        }
        try {
            try {
                qsh = new qsH(this.Sg);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.YoT.Sg(th2.getMessage());
                qsh = null;
            }
        } catch (Exception unused) {
            HttpURLConnection httpURLConnection = this.Sg;
            qsh = new qsH(httpURLConnection, httpURLConnection.getErrorStream());
        }
        GA ga3 = this.tN;
        if (ga3 != null && (yFl = ga3.Sg) != null) {
            yFl.GA();
        }
        return qsh;
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.EH
    public String wN() throws IOException {
        if (!TextUtils.isEmpty(this.wN)) {
            return this.wN;
        }
        return this.Sg.getResponseMessage();
    }

    public String YFl(String str) {
        HttpURLConnection httpURLConnection = this.Sg;
        return httpURLConnection == null ? "" : httpURLConnection.getHeaderField(str);
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.EH
    public String YFl(String str, String str2) {
        return !TextUtils.isEmpty(YFl(str)) ? YFl(str) : str2;
    }

    public DSW(int i10, String str, GA ga2) {
        this.wN = str;
        this.tN = ga2;
        this.AlY = i10;
    }
}
