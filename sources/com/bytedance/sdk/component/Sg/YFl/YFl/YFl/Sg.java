package com.bytedance.sdk.component.Sg.YFl.YFl.YFl;

import android.text.TextUtils;
import com.bytedance.sdk.component.Sg.YFl.EH;
import com.bytedance.sdk.component.Sg.YFl.GA;
import com.bytedance.sdk.component.Sg.YFl.eT;
import com.bytedance.sdk.component.Sg.YFl.pDU;
import com.bytedance.sdk.component.Sg.YFl.qsH;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class Sg implements com.bytedance.sdk.component.Sg.YFl.Sg {
    com.bytedance.sdk.component.Sg.YFl.AlY Sg;
    GA YFl;
    private AtomicBoolean tN = new AtomicBoolean(false);

    public Sg(GA ga2, com.bytedance.sdk.component.Sg.YFl.AlY alY) {
        this.YFl = ga2;
        this.Sg = alY;
    }

    private boolean wN() {
        if (this.YFl.AlY() == null) {
            return false;
        }
        return this.YFl.AlY().containsKey("Content-Type");
    }

    /* renamed from: AlY, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.Sg.YFl.Sg clone() {
        return new Sg(this.YFl, this.Sg);
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.Sg
    public EH Sg() throws IOException {
        List<com.bytedance.sdk.component.Sg.YFl.qsH> list;
        com.bytedance.sdk.component.tN.YFl.YFl yFl;
        GA ga2 = this.YFl;
        if (ga2 != null && (yFl = ga2.Sg) != null) {
            if (yFl.pDU() == 0) {
                this.YFl.Sg.EH();
            }
            this.YFl.Sg.YFl();
        }
        this.Sg.tN().remove(this);
        this.Sg.AlY().add(this);
        com.bytedance.sdk.component.Sg.YFl.AlY alY = this.Sg;
        if (alY instanceof wN) {
            if (this.Sg.AlY().size() + alY.tN().size() > this.Sg.YFl() || this.tN.get()) {
                this.Sg.AlY().remove(this);
                return new DSW(DSW.YFl, "Maximum number of requests exceeded", this.YFl);
            }
        }
        try {
            eT eTVar = this.YFl.YFl;
            if (eTVar != null && (list = eTVar.YFl) != null && list.size() > 0) {
                ArrayList arrayList = new ArrayList(this.YFl.YFl.YFl);
                arrayList.add(new com.bytedance.sdk.component.Sg.YFl.qsH() { // from class: com.bytedance.sdk.component.Sg.YFl.YFl.YFl.Sg.1
                    @Override // com.bytedance.sdk.component.Sg.YFl.qsH
                    public EH YFl(qsH.YFl yFl2) throws IOException {
                        return Sg.this.YFl(yFl2.YFl());
                    }
                });
                return ((com.bytedance.sdk.component.Sg.YFl.qsH) arrayList.get(0)).YFl(new tN(arrayList, this.YFl));
            }
            return YFl(this.YFl);
        } catch (Throwable th2) {
            throw new IOException(th2.getMessage());
        }
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.Sg
    public GA YFl() {
        return this.YFl;
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.Sg
    public void tN() {
        this.tN.set(true);
    }

    private boolean YFl(pDU pdu) {
        GA ga2;
        byte[] bArr;
        return pdu != null && (ga2 = this.YFl) != null && "POST".equalsIgnoreCase(ga2.tN()) && pdu.f10338vc == pDU.YFl.BYTE_ARRAY_TYPE && (bArr = pdu.wN) != null && bArr.length > 0;
    }

    public EH YFl(GA ga2) throws IOException {
        HttpURLConnection httpURLConnection;
        Exception e2;
        String message;
        int i10 = DSW.YFl;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(ga2.Sg().YFl().toString()).openConnection();
            } finally {
                this.Sg.AlY().remove(this);
            }
        } catch (Exception e10) {
            httpURLConnection = null;
            e2 = e10;
        }
        try {
            if (ga2.AlY() != null && ga2.AlY().size() > 0) {
                for (Map.Entry<String, List<String>> entry : ga2.AlY().entrySet()) {
                    String key = entry.getKey();
                    for (String str : entry.getValue()) {
                        if ("_disable_retry".equals(key) && "1".equals(str)) {
                            YFl(httpURLConnection);
                        } else {
                            httpURLConnection.addRequestProperty(key, str);
                        }
                    }
                }
            }
            eT eTVar = ga2.YFl;
            if (eTVar != null) {
                TimeUnit timeUnit = eTVar.tN;
                if (timeUnit != null) {
                    httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(eTVar.Sg));
                }
                eT eTVar2 = ga2.YFl;
                if (eTVar2.tN != null) {
                    httpURLConnection.setReadTimeout((int) eTVar2.wN.toMillis(eTVar2.AlY));
                }
            }
            if (ga2.qsH() == null) {
                httpURLConnection.setRequestMethod("GET");
            } else {
                if (!wN() && ga2.qsH().tN != null) {
                    httpURLConnection.addRequestProperty("Content-Type", ga2.qsH().tN.YFl());
                }
                httpURLConnection.setRequestMethod(ga2.tN());
                if ("POST".equalsIgnoreCase(ga2.tN())) {
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    if (YFl(ga2.qsH())) {
                        outputStream.write(ga2.qsH().wN);
                    } else if (Sg(ga2.qsH())) {
                        outputStream.write(ga2.qsH().AlY.getBytes());
                    }
                    outputStream.flush();
                    outputStream.close();
                }
            }
            com.bytedance.sdk.component.tN.YFl.YFl yFl = ga2.Sg;
            if (yFl != null) {
                yFl.Sg();
            }
            httpURLConnection.connect();
            com.bytedance.sdk.component.tN.YFl.YFl yFl2 = ga2.Sg;
            if (yFl2 != null) {
                yFl2.tN();
            }
            i10 = httpURLConnection.getResponseCode();
            com.bytedance.sdk.component.tN.YFl.YFl yFl3 = ga2.Sg;
            if (yFl3 != null) {
                yFl3.wN();
            }
        } catch (Exception e11) {
            e2 = e11;
            try {
                message = httpURLConnection.getErrorStream().toString();
            } catch (Throwable unused) {
                message = e2.getMessage();
            }
            return new DSW(i10, message, ga2);
        }
        if (this.tN.get()) {
            httpURLConnection.disconnect();
            this.Sg.AlY().remove(this);
            message = "internal error";
            return new DSW(i10, message, ga2);
        }
        return new DSW(httpURLConnection, ga2);
    }

    private boolean Sg(pDU pdu) {
        GA ga2;
        return (pdu == null || (ga2 = this.YFl) == null || !"POST".equalsIgnoreCase(ga2.tN()) || pdu.f10338vc != pDU.YFl.STRING_TYPE || TextUtils.isEmpty(pdu.AlY)) ? false : true;
    }

    private static void YFl(HttpURLConnection httpURLConnection) {
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

    @Override // com.bytedance.sdk.component.Sg.YFl.Sg
    public void YFl(final com.bytedance.sdk.component.Sg.YFl.tN tNVar) {
        com.bytedance.sdk.component.tN.YFl.YFl yFl;
        GA ga2 = this.YFl;
        if (ga2 != null && (yFl = ga2.Sg) != null) {
            yFl.EH();
        }
        this.Sg.Sg().submit(new com.bytedance.sdk.component.qsH.tN.Sg(this.YFl.DSW(), this.YFl.vc()) { // from class: com.bytedance.sdk.component.Sg.YFl.YFl.YFl.Sg.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    EH Sg = Sg.this.Sg();
                    if (Sg == null) {
                        tNVar.YFl(Sg.this, new IOException("response is null"));
                    } else {
                        tNVar.YFl(Sg.this, Sg);
                    }
                } catch (IOException e2) {
                    tNVar.YFl(Sg.this, e2);
                }
            }
        });
    }
}
