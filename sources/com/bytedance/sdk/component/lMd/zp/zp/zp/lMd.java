package com.bytedance.sdk.component.lMd.zp.zp.zp;

import android.text.TextUtils;
import com.bytedance.sdk.component.lMd.zp.Bj;
import com.bytedance.sdk.component.lMd.zp.dQp;
import com.bytedance.sdk.component.lMd.zp.ku;
import com.bytedance.sdk.component.lMd.zp.rV;
import com.bytedance.sdk.component.lMd.zp.tG;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class lMd implements com.bytedance.sdk.component.lMd.zp.lMd {
    private AtomicBoolean KS = new AtomicBoolean(false);
    com.bytedance.sdk.component.lMd.zp.jU lMd;
    tG zp;

    public lMd(tG tGVar, com.bytedance.sdk.component.lMd.zp.jU jUVar) {
        this.zp = tGVar;
        this.lMd = jUVar;
    }

    private boolean KS() {
        if (this.zp.jU() == null) {
            return false;
        }
        return this.zp.jU().containsKey("Content-Type");
    }

    private boolean lMd(rV rVVar) {
        tG tGVar;
        return (rVVar == null || (tGVar = this.zp) == null || !"POST".equalsIgnoreCase(tGVar.KS()) || rVVar.HWF != rV.zp.STRING_TYPE || TextUtils.isEmpty(rVVar.jU)) ? false : true;
    }

    @Override // com.bytedance.sdk.component.lMd.zp.lMd
    public dQp zp() throws IOException {
        List<com.bytedance.sdk.component.lMd.zp.ku> list;
        com.bytedance.sdk.component.KS.zp.zp zpVar;
        tG tGVar = this.zp;
        if (tGVar != null && (zpVar = tGVar.lMd) != null) {
            if (zpVar.rV() == 0) {
                this.zp.lMd.dQp();
            }
            this.zp.lMd.zp();
        }
        this.lMd.KS().remove(this);
        this.lMd.jU().add(this);
        com.bytedance.sdk.component.lMd.zp.jU jUVar = this.lMd;
        if (jUVar instanceof COT) {
            if (this.lMd.jU().size() + jUVar.KS().size() > this.lMd.zp() || this.KS.get()) {
                this.lMd.jU().remove(this);
                return new QR(QR.zp, "Maximum number of requests exceeded", this.zp);
            }
        }
        try {
            Bj bj = this.zp.zp;
            if (bj != null && (list = bj.zp) != null && list.size() > 0) {
                ArrayList arrayList = new ArrayList(this.zp.zp.zp);
                arrayList.add(new com.bytedance.sdk.component.lMd.zp.ku() { // from class: com.bytedance.sdk.component.lMd.zp.zp.zp.lMd.1
                    @Override // com.bytedance.sdk.component.lMd.zp.ku
                    public dQp zp(ku.zp zpVar2) throws IOException {
                        return lMd.this.zp(zpVar2.zp());
                    }
                });
                return ((com.bytedance.sdk.component.lMd.zp.ku) arrayList.get(0)).zp(new KS(arrayList, this.zp));
            }
            return zp(this.zp);
        } catch (Throwable th) {
            throw new IOException(th.getMessage());
        }
    }

    /* renamed from: lMd, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.lMd.zp.lMd clone() {
        return new lMd(this.zp, this.lMd);
    }

    private boolean zp(rV rVVar) {
        tG tGVar;
        byte[] bArr;
        return rVVar != null && (tGVar = this.zp) != null && "POST".equalsIgnoreCase(tGVar.KS()) && rVVar.HWF == rV.zp.BYTE_ARRAY_TYPE && (bArr = rVVar.COT) != null && bArr.length > 0;
    }

    public dQp zp(tG tGVar) throws IOException {
        HttpURLConnection httpURLConnection;
        Exception e4;
        String message;
        int i9 = QR.zp;
        try {
            try {
                httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(tGVar.lMd().zp().toString()).openConnection()));
            } catch (Throwable th) {
                this.lMd.jU().remove(this);
                throw th;
            }
        } catch (Exception e9) {
            httpURLConnection = null;
            e4 = e9;
        }
        try {
            if (tGVar.jU() != null && tGVar.jU().size() > 0) {
                for (Map.Entry<String, List<String>> entry : tGVar.jU().entrySet()) {
                    String key = entry.getKey();
                    for (String str : entry.getValue()) {
                        if ("_disable_retry".equals(key) && "1".equals(str)) {
                            zp(httpURLConnection);
                        } else {
                            httpURLConnection.addRequestProperty(key, str);
                        }
                    }
                }
            }
            Bj bj = tGVar.zp;
            if (bj != null) {
                TimeUnit timeUnit = bj.KS;
                if (timeUnit != null) {
                    httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(bj.lMd));
                }
                Bj bj2 = tGVar.zp;
                if (bj2.KS != null) {
                    httpURLConnection.setReadTimeout((int) bj2.COT.toMillis(bj2.jU));
                }
            }
            if (tGVar.ku() == null) {
                httpURLConnection.setRequestMethod("GET");
            } else {
                if (!KS() && tGVar.ku().KS != null) {
                    httpURLConnection.addRequestProperty("Content-Type", tGVar.ku().KS.zp());
                }
                httpURLConnection.setRequestMethod(tGVar.KS());
                if ("POST".equalsIgnoreCase(tGVar.KS())) {
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    if (zp(tGVar.ku())) {
                        outputStream.write(tGVar.ku().COT);
                    } else if (lMd(tGVar.ku())) {
                        outputStream.write(tGVar.ku().jU.getBytes());
                    }
                    outputStream.flush();
                    outputStream.close();
                }
            }
            com.bytedance.sdk.component.KS.zp.zp zpVar = tGVar.lMd;
            if (zpVar != null) {
                zpVar.lMd();
            }
            httpURLConnection.connect();
            com.bytedance.sdk.component.KS.zp.zp zpVar2 = tGVar.lMd;
            if (zpVar2 != null) {
                zpVar2.KS();
            }
            i9 = httpURLConnection.getResponseCode();
            com.bytedance.sdk.component.KS.zp.zp zpVar3 = tGVar.lMd;
            if (zpVar3 != null) {
                zpVar3.COT();
            }
        } catch (Exception e10) {
            e4 = e10;
            try {
                message = httpURLConnection.getErrorStream().toString();
            } catch (Throwable unused) {
                message = e4.getMessage();
            }
            this.lMd.jU().remove(this);
            return new QR(i9, message, tGVar);
        }
        if (this.KS.get()) {
            httpURLConnection.disconnect();
            this.lMd.jU().remove(this);
            message = "internal error";
            return new QR(i9, message, tGVar);
        }
        QR qr = new QR(httpURLConnection, tGVar);
        this.lMd.jU().remove(this);
        return qr;
    }

    private static void zp(HttpURLConnection httpURLConnection) {
        try {
            Field declaredField = httpURLConnection.getClass().getDeclaredField("delegate");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(httpURLConnection);
            Field declaredField2 = obj.getClass().getDeclaredField("client");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            obj2.getClass().getDeclaredMethod("setRetryOnConnectionFailure", Boolean.TYPE).invoke(obj2, Boolean.FALSE);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.lMd.zp.lMd
    public void zp(final com.bytedance.sdk.component.lMd.zp.KS ks) {
        com.bytedance.sdk.component.KS.zp.zp zpVar;
        tG tGVar = this.zp;
        if (tGVar != null && (zpVar = tGVar.lMd) != null) {
            zpVar.dQp();
        }
        this.lMd.lMd().submit(new com.bytedance.sdk.component.ku.KS.lMd(this.zp.QR(), this.zp.HWF()) { // from class: com.bytedance.sdk.component.lMd.zp.zp.zp.lMd.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    dQp zp = lMd.this.zp();
                    if (zp == null) {
                        ks.zp(lMd.this, new IOException("response is null"));
                    } else {
                        ks.zp(lMd.this, zp);
                    }
                } catch (IOException e4) {
                    ks.zp(lMd.this, e4);
                }
            }
        });
    }
}
