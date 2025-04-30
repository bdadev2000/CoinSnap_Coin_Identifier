package com.bytedance.sdk.component.QR.lMd;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.lMd.zp.Bj;
import com.bytedance.sdk.component.lMd.zp.HWF;
import com.bytedance.sdk.component.lMd.zp.KVG;
import com.bytedance.sdk.component.lMd.zp.QR;
import com.bytedance.sdk.component.lMd.zp.dQp;
import com.bytedance.sdk.component.lMd.zp.tG;
import com.bytedance.sdk.component.lMd.zp.zp;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class lMd extends KS {
    private boolean Bj;
    private com.bytedance.sdk.component.lMd.zp.zp dT;
    private Map<String, String> vDp;
    public static final com.bytedance.sdk.component.lMd.zp.zp zp = new zp.C0091zp().zp().lMd();
    public static final com.bytedance.sdk.component.lMd.zp.zp lMd = new zp.C0091zp().lMd();

    public lMd(Bj bj) {
        super(bj);
        this.dT = zp;
        this.Bj = false;
        this.vDp = new HashMap();
    }

    public void zp(String str, String str2) {
        if (str == null) {
            return;
        }
        this.vDp.put(str, str2);
    }

    public void zp(boolean z8) {
        this.Bj = z8;
    }

    public void zp(final com.bytedance.sdk.component.QR.zp.zp zpVar) {
        try {
            tG.zp zpVar2 = new tG.zp();
            if (this.Bj) {
                zpVar2.lMd(this.ku);
            } else {
                QR.zp zpVar3 = new QR.zp();
                Uri parse = Uri.parse(this.ku);
                zpVar3.zp(parse.getScheme());
                zpVar3.lMd(parse.getHost());
                String encodedPath = parse.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith("/")) {
                        encodedPath = encodedPath.substring(1);
                    }
                    zpVar3.KS(encodedPath);
                }
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str : queryParameterNames) {
                        this.vDp.put(str, parse.getQueryParameter(str));
                    }
                }
                for (Map.Entry<String, String> entry : this.vDp.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String encode = URLEncoder.encode(key, "UTF-8");
                        if (value == null) {
                            value = "";
                        }
                        zpVar3.zp(encode, URLEncoder.encode(value, "UTF-8"));
                    }
                }
                zpVar2.zp(zpVar3.lMd());
            }
            zp(zpVar2);
            zpVar2.zp(this.dT);
            zpVar2.zp((Object) lMd());
            if (!TextUtils.isEmpty(this.COT)) {
                zpVar2.zp(this.COT);
            }
            int i9 = this.HWF;
            if (i9 > 0) {
                zpVar2.zp(i9);
            }
            this.KS.zp(zpVar2.zp().lMd()).zp(new com.bytedance.sdk.component.lMd.zp.KS() { // from class: com.bytedance.sdk.component.QR.lMd.lMd.1
                @Override // com.bytedance.sdk.component.lMd.zp.KS
                public void zp(com.bytedance.sdk.component.lMd.zp.lMd lmd, IOException iOException) {
                    com.bytedance.sdk.component.QR.zp.zp zpVar4 = zpVar;
                    if (zpVar4 != null) {
                        zpVar4.zp(lMd.this, iOException);
                    }
                }

                @Override // com.bytedance.sdk.component.lMd.zp.KS
                public void zp(com.bytedance.sdk.component.lMd.zp.lMd lmd, dQp dqp) throws IOException {
                    String lMd2;
                    if (zpVar != null) {
                        HashMap hashMap = new HashMap();
                        if (dqp != null) {
                            HWF QR = dqp.QR();
                            if (QR != null) {
                                for (int i10 = 0; i10 < QR.zp(); i10++) {
                                    hashMap.put(QR.zp(i10), QR.lMd(i10));
                                }
                            }
                            KVG HWF = dqp.HWF();
                            if (HWF == null) {
                                lMd2 = "";
                            } else {
                                lMd2 = HWF.lMd();
                            }
                            zpVar.zp(lMd.this, new com.bytedance.sdk.component.QR.lMd(dqp.jU(), dqp.KS(), dqp.COT(), hashMap, lMd2, dqp.lMd(), dqp.zp()));
                        }
                    }
                }
            });
        } catch (Throwable th) {
            if (zpVar != null) {
                zpVar.zp(this, new IOException(th.getMessage()));
            }
        }
    }

    public com.bytedance.sdk.component.QR.lMd zp() {
        try {
            tG.zp zpVar = new tG.zp();
            if (this.Bj) {
                zpVar.lMd(this.ku);
            } else {
                QR.zp zpVar2 = new QR.zp();
                Uri parse = Uri.parse(this.ku);
                zpVar2.zp(parse.getScheme());
                zpVar2.lMd(parse.getHost());
                String encodedPath = parse.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith("/")) {
                        encodedPath = encodedPath.substring(1);
                    }
                    zpVar2.KS(encodedPath);
                }
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str : queryParameterNames) {
                        this.vDp.put(str, parse.getQueryParameter(str));
                    }
                }
                for (Map.Entry<String, String> entry : this.vDp.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String encode = URLEncoder.encode(key, "UTF-8");
                        if (value == null) {
                            value = "";
                        }
                        zpVar2.zp(encode, URLEncoder.encode(value, "UTF-8"));
                    }
                }
                zpVar.zp(zpVar2.lMd());
            }
            zp(zpVar);
            zpVar.zp(this.dT);
            zpVar.zp((Object) lMd());
            dQp zp2 = this.KS.zp(zpVar.zp().lMd()).zp();
            if (zp2 == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            HWF QR = zp2.QR();
            if (QR != null) {
                for (int i9 = 0; i9 < QR.zp(); i9++) {
                    hashMap.put(QR.zp(i9), QR.lMd(i9));
                }
            }
            KVG HWF = zp2.HWF();
            return new com.bytedance.sdk.component.QR.lMd(zp2.jU(), zp2.KS(), zp2.COT(), hashMap, HWF != null ? HWF.lMd() : "", zp2.lMd(), zp2.zp());
        } catch (Throwable unused) {
            return null;
        }
    }
}
