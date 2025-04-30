package com.bytedance.sdk.component.QR.lMd;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.bytedance.sdk.component.lMd.zp.Bj;
import com.bytedance.sdk.component.lMd.zp.HWF;
import com.bytedance.sdk.component.lMd.zp.KVG;
import com.bytedance.sdk.component.lMd.zp.YW;
import com.bytedance.sdk.component.lMd.zp.dQp;
import com.bytedance.sdk.component.lMd.zp.rV;
import com.bytedance.sdk.component.lMd.zp.tG;
import com.bytedance.sdk.component.utils.tG;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class jU extends KS {
    rV zp;

    public jU(Bj bj) {
        super(bj);
        this.zp = null;
    }

    private byte[] COT(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        byte[] bArr = new byte[0];
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    try {
                        GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                        try {
                            gZIPOutputStream2.write(str.getBytes("utf-8"));
                            try {
                                gZIPOutputStream2.close();
                            } catch (IOException e4) {
                                tG.zp("PostExecutor", e4.toString());
                            }
                            bArr = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                        } catch (IOException e9) {
                            e = e9;
                            gZIPOutputStream = gZIPOutputStream2;
                            tG.zp("PostExecutor", e.toString());
                            if (gZIPOutputStream != null) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (IOException e10) {
                                    tG.zp("PostExecutor", e10.toString());
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                bArr = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                            }
                            return bArr;
                        } catch (Throwable th) {
                            th = th;
                            gZIPOutputStream = gZIPOutputStream2;
                            if (gZIPOutputStream != null) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (IOException e11) {
                                    tG.zp("PostExecutor", e11.toString());
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.toByteArray();
                                try {
                                    byteArrayOutputStream.close();
                                    throw th;
                                } catch (IOException e12) {
                                    tG.zp("PostExecutor", e12.toString());
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e13) {
                    e = e13;
                }
            } catch (IOException e14) {
                e = e14;
                byteArrayOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream = null;
            }
        } catch (IOException e15) {
            tG.zp("PostExecutor", e15.toString());
        }
        return bArr;
    }

    public rV KS() {
        return this.zp;
    }

    public void jU(String str) {
        if (TextUtils.isEmpty(str)) {
            str = JsonUtils.EMPTY_JSON;
        }
        this.zp = rV.zp(YW.zp("application/json; charset=utf-8"), str);
    }

    public void zp(JSONObject jSONObject) {
        String str;
        if (jSONObject != null) {
            str = jSONObject.toString();
        } else {
            str = JsonUtils.EMPTY_JSON;
        }
        this.zp = rV.zp(YW.zp("application/json; charset=utf-8"), str);
    }

    public void zp(String str, byte[] bArr) {
        this.zp = rV.zp(YW.zp(str), bArr);
    }

    public void zp(final com.bytedance.sdk.component.QR.zp.zp zpVar) {
        try {
            tG.zp zpVar2 = new tG.zp();
            if (TextUtils.isEmpty(this.ku)) {
                zpVar.zp(this, new IOException("Url is Empty"));
                return;
            }
            if (!TextUtils.isEmpty(this.COT)) {
                zpVar2.zp(this.COT);
            }
            int i9 = this.HWF;
            if (i9 > 0) {
                zpVar2.zp(i9);
            }
            zpVar2.lMd(this.ku);
            if (this.zp == null) {
                if (zpVar != null) {
                    zpVar.zp(this, new IOException("RequestBody is null, content type is not support!!"));
                }
            } else {
                zp(zpVar2);
                zpVar2.zp((Object) lMd());
                this.KS.zp(zpVar2.zp(this.zp).lMd()).zp(new com.bytedance.sdk.component.lMd.zp.KS() { // from class: com.bytedance.sdk.component.QR.lMd.jU.1
                    @Override // com.bytedance.sdk.component.lMd.zp.KS
                    public void zp(com.bytedance.sdk.component.lMd.zp.lMd lmd, IOException iOException) {
                        com.bytedance.sdk.component.QR.zp.zp zpVar3 = zpVar;
                        if (zpVar3 != null) {
                            zpVar3.zp(jU.this, iOException);
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:34:0x00ed  */
                    /* JADX WARN: Removed duplicated region for block: B:36:0x00f5  */
                    @Override // com.bytedance.sdk.component.lMd.zp.KS
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public void zp(com.bytedance.sdk.component.lMd.zp.lMd r14, com.bytedance.sdk.component.lMd.zp.dQp r15) throws java.io.IOException {
                        /*
                            Method dump skipped, instructions count: 309
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.QR.lMd.jU.AnonymousClass1.zp(com.bytedance.sdk.component.lMd.zp.lMd, com.bytedance.sdk.component.lMd.zp.dQp):void");
                    }
                });
            }
        } catch (Throwable th) {
            zpVar.zp(this, new IOException(th.getMessage()));
        }
    }

    public com.bytedance.sdk.component.QR.lMd zp() {
        com.bytedance.sdk.component.QR.lMd lmd;
        try {
            tG.zp zpVar = new tG.zp();
            if (TextUtils.isEmpty(this.ku)) {
                return new com.bytedance.sdk.component.QR.lMd(false, 5000, "URL_NULL_MSG", null, "URL_NULL_BODY", 1L, 1L);
            }
            zpVar.lMd(this.ku);
            if (this.zp == null) {
                return new com.bytedance.sdk.component.QR.lMd(false, 5000, "BODY_NULL_MSG", null, "BODY_NULL_BODY", 1L, 1L);
            }
            zp(zpVar);
            zpVar.zp((Object) lMd());
            dQp zp = this.KS.zp(zpVar.zp(this.zp).lMd()).zp();
            if (zp == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            HWF QR = zp.QR();
            if (QR != null) {
                for (int i9 = 0; i9 < QR.zp(); i9++) {
                    String zp2 = QR.zp(i9);
                    String lMd = QR.lMd(i9);
                    hashMap.put(zp2, lMd);
                    if (zp2 != null && zp2.equalsIgnoreCase("content-type")) {
                        hashMap.put("content-type", lMd == null ? "" : lMd.toLowerCase());
                    }
                }
            }
            if (com.bytedance.sdk.component.QR.jU.zp.zp(hashMap)) {
                byte[] jU = zp.HWF().jU();
                lmd = new com.bytedance.sdk.component.QR.lMd(zp.jU(), zp.KS(), zp.COT(), hashMap, null, zp.lMd(), zp.zp());
                lmd.zp(jU);
            } else if (this.YW) {
                byte[] jU2 = zp.HWF().jU();
                lmd = new com.bytedance.sdk.component.QR.lMd(zp.jU(), zp.KS(), zp.COT(), hashMap, new String(jU2, zp(zp(zp.HWF()))), zp.lMd(), zp.zp());
                lmd.zp(jU2);
            } else {
                lmd = new com.bytedance.sdk.component.QR.lMd(zp.jU(), zp.KS(), zp.COT(), hashMap, zp.HWF().lMd(), zp.lMd(), zp.zp());
            }
            zp(lmd, zp);
            return lmd;
        } catch (Throwable th) {
            return new com.bytedance.sdk.component.QR.lMd(false, 5001, th.getMessage(), null, "BODY_NULL_BODY", 1L, 1L);
        }
    }

    public void zp(String str, boolean z8) {
        if (z8) {
            zp("application/json; charset=utf-8", COT(str));
            lMd("Content-Encoding", "gzip");
        } else {
            jU(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Charset zp(YW yw) {
        try {
            return yw != null ? yw.zp(com.bytedance.sdk.component.lMd.zp.lMd.YW.zp) : com.bytedance.sdk.component.lMd.zp.lMd.YW.zp;
        } catch (Exception unused) {
            return com.bytedance.sdk.component.lMd.zp.lMd.YW.zp;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public YW zp(KVG kvg) {
        try {
            return kvg.COT();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(com.bytedance.sdk.component.QR.lMd lmd, dQp dqp) {
        if (lmd == null || dqp == null) {
            return;
        }
        lmd.zp(dqp.YW());
    }
}
