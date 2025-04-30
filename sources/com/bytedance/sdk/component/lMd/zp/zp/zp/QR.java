package com.bytedance.sdk.component.lMd.zp.zp.zp;

import android.text.TextUtils;
import com.bytedance.sdk.component.lMd.zp.KVG;
import com.bytedance.sdk.component.lMd.zp.dQp;
import com.bytedance.sdk.component.lMd.zp.dT;
import com.bytedance.sdk.component.lMd.zp.tG;
import com.bytedance.sdk.component.lMd.zp.vDp;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class QR extends dQp {
    public static int zp = -1;
    String COT;
    tG KS;
    int jU;
    HttpURLConnection lMd;

    public QR(HttpURLConnection httpURLConnection, tG tGVar) {
        this.jU = zp;
        this.lMd = httpURLConnection;
        this.KS = tGVar;
    }

    @Override // com.bytedance.sdk.component.lMd.zp.dQp
    public String COT() throws IOException {
        if (!TextUtils.isEmpty(this.COT)) {
            return this.COT;
        }
        return this.lMd.getResponseMessage();
    }

    @Override // com.bytedance.sdk.component.lMd.zp.dQp
    public KVG HWF() {
        ku kuVar;
        com.bytedance.sdk.component.KS.zp.zp zpVar;
        com.bytedance.sdk.component.KS.zp.zp zpVar2;
        tG tGVar = this.KS;
        if (tGVar != null && (zpVar2 = tGVar.lMd) != null) {
            zpVar2.Bj();
        }
        try {
            try {
                kuVar = new ku(this.lMd);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.tG.lMd(th.getMessage());
                kuVar = null;
            }
        } catch (Exception unused) {
            HttpURLConnection httpURLConnection = this.lMd;
            kuVar = new ku(httpURLConnection, httpURLConnection.getErrorStream());
        }
        tG tGVar2 = this.KS;
        if (tGVar2 != null && (zpVar = tGVar2.lMd) != null) {
            zpVar.tG();
        }
        return kuVar;
    }

    @Override // com.bytedance.sdk.component.lMd.zp.dQp
    public int KS() {
        try {
            return this.lMd.getResponseCode();
        } catch (Exception unused) {
            return this.jU;
        }
    }

    @Override // com.bytedance.sdk.component.lMd.zp.dQp
    public com.bytedance.sdk.component.lMd.zp.HWF QR() {
        if (this.lMd == null) {
            return new com.bytedance.sdk.component.lMd.zp.HWF(new String[0]);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : this.lMd.getHeaderFields().entrySet()) {
            for (String str : entry.getValue()) {
                if (!"Content-Range".equalsIgnoreCase(entry.getKey()) || KS() != 206) {
                    arrayList.add(entry.getKey());
                    arrayList.add(str);
                }
            }
        }
        return new com.bytedance.sdk.component.lMd.zp.HWF((String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @Override // com.bytedance.sdk.component.lMd.zp.dQp
    public dT YW() {
        if (dT() != null && dT().lMd != null) {
            return new dT(dT().lMd);
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.lMd.zp.dQp, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            HWF().close();
        } catch (Exception unused) {
        }
    }

    public tG dT() {
        return this.KS;
    }

    @Override // com.bytedance.sdk.component.lMd.zp.dQp
    public boolean jU() {
        if (KS() >= 200 && KS() < 300) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.lMd.zp.dQp
    public vDp ku() {
        return vDp.HTTP_1_1;
    }

    @Override // com.bytedance.sdk.component.lMd.zp.dQp
    public long lMd() {
        return 0L;
    }

    public String toString() {
        return "";
    }

    @Override // com.bytedance.sdk.component.lMd.zp.dQp
    public long zp() {
        return 0L;
    }

    public String zp(String str) {
        HttpURLConnection httpURLConnection = this.lMd;
        if (httpURLConnection == null) {
            return "";
        }
        return httpURLConnection.getHeaderField(str);
    }

    public QR(int i9, String str, tG tGVar) {
        this.COT = str;
        this.KS = tGVar;
        this.jU = i9;
    }

    @Override // com.bytedance.sdk.component.lMd.zp.dQp
    public String zp(String str, String str2) {
        return !TextUtils.isEmpty(zp(str)) ? zp(str) : str2;
    }
}
