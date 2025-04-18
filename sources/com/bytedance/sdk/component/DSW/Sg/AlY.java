package com.bytedance.sdk.component.DSW.Sg;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.bytedance.sdk.component.Sg.YFl.EH;
import com.bytedance.sdk.component.Sg.YFl.GA;
import com.bytedance.sdk.component.Sg.YFl.NjR;
import com.bytedance.sdk.component.Sg.YFl.eT;
import com.bytedance.sdk.component.Sg.YFl.pDU;
import com.bytedance.sdk.component.Sg.YFl.rkt;
import com.bytedance.sdk.component.Sg.YFl.vc;
import com.bytedance.sdk.component.utils.YoT;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AlY extends tN {
    pDU YFl;

    public AlY(eT eTVar) {
        super(eTVar);
        this.YFl = null;
    }

    private byte[] wN(String str) {
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
                            } catch (IOException e2) {
                                YoT.YFl("PostExecutor", e2.toString());
                            }
                            bArr = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                        } catch (IOException e10) {
                            e = e10;
                            gZIPOutputStream = gZIPOutputStream2;
                            YoT.YFl("PostExecutor", e.toString());
                            if (gZIPOutputStream != null) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (IOException e11) {
                                    YoT.YFl("PostExecutor", e11.toString());
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                bArr = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                            }
                            return bArr;
                        } catch (Throwable th2) {
                            th = th2;
                            gZIPOutputStream = gZIPOutputStream2;
                            if (gZIPOutputStream != null) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (IOException e12) {
                                    YoT.YFl("PostExecutor", e12.toString());
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.toByteArray();
                                try {
                                    byteArrayOutputStream.close();
                                    throw th;
                                } catch (IOException e13) {
                                    YoT.YFl("PostExecutor", e13.toString());
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (IOException e14) {
                    e = e14;
                }
            } catch (IOException e15) {
                e = e15;
                byteArrayOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream = null;
            }
        } catch (IOException e16) {
            YoT.YFl("PostExecutor", e16.toString());
        }
        return bArr;
    }

    public void AlY(String str) {
        if (TextUtils.isEmpty(str)) {
            str = JsonUtils.EMPTY_JSON;
        }
        this.YFl = pDU.YFl(NjR.YFl("application/json; charset=utf-8"), str);
    }

    public pDU AlY() {
        return this.YFl;
    }

    public void YFl(JSONObject jSONObject) {
        this.YFl = pDU.YFl(NjR.YFl("application/json; charset=utf-8"), jSONObject != null ? jSONObject.toString() : JsonUtils.EMPTY_JSON);
    }

    public void YFl(String str, byte[] bArr) {
        this.YFl = pDU.YFl(NjR.YFl(str), bArr);
    }

    public void YFl(final com.bytedance.sdk.component.DSW.YFl.YFl yFl) {
        try {
            GA.YFl yFl2 = new GA.YFl();
            if (TextUtils.isEmpty(this.qsH)) {
                yFl.YFl(this, new IOException("Url is Empty"));
                return;
            }
            if (!TextUtils.isEmpty(this.wN)) {
                yFl2.YFl(this.wN);
            }
            int i10 = this.f10312vc;
            if (i10 > 0) {
                yFl2.YFl(i10);
            }
            yFl2.Sg(this.qsH);
            if (this.YFl == null) {
                if (yFl != null) {
                    yFl.YFl(this, new IOException("RequestBody is null, content type is not support!!"));
                }
            } else {
                YFl(yFl2);
                yFl2.YFl((Object) Sg());
                this.tN.YFl(yFl2.YFl(this.YFl).Sg()).YFl(new com.bytedance.sdk.component.Sg.YFl.tN() { // from class: com.bytedance.sdk.component.DSW.Sg.AlY.1
                    @Override // com.bytedance.sdk.component.Sg.YFl.tN
                    public void YFl(com.bytedance.sdk.component.Sg.YFl.Sg sg2, IOException iOException) {
                        com.bytedance.sdk.component.DSW.YFl.YFl yFl3 = yFl;
                        if (yFl3 != null) {
                            yFl3.YFl(AlY.this, iOException);
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb  */
                    /* JADX WARN: Removed duplicated region for block: B:36:0x00f3  */
                    @Override // com.bytedance.sdk.component.Sg.YFl.tN
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public void YFl(com.bytedance.sdk.component.Sg.YFl.Sg r14, com.bytedance.sdk.component.Sg.YFl.EH r15) throws java.io.IOException {
                        /*
                            Method dump skipped, instructions count: 307
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.DSW.Sg.AlY.AnonymousClass1.YFl(com.bytedance.sdk.component.Sg.YFl.Sg, com.bytedance.sdk.component.Sg.YFl.EH):void");
                    }
                });
            }
        } catch (Throwable th2) {
            yFl.YFl(this, new IOException(th2.getMessage()));
        }
    }

    public com.bytedance.sdk.component.DSW.Sg YFl() {
        com.bytedance.sdk.component.DSW.Sg sg2;
        try {
            GA.YFl yFl = new GA.YFl();
            if (TextUtils.isEmpty(this.qsH)) {
                return new com.bytedance.sdk.component.DSW.Sg(false, 5000, "URL_NULL_MSG", null, "URL_NULL_BODY", 1L, 1L);
            }
            yFl.Sg(this.qsH);
            if (this.YFl == null) {
                return new com.bytedance.sdk.component.DSW.Sg(false, 5000, "BODY_NULL_MSG", null, "BODY_NULL_BODY", 1L, 1L);
            }
            YFl(yFl);
            yFl.YFl((Object) Sg());
            EH Sg = this.tN.YFl(yFl.YFl(this.YFl).Sg()).Sg();
            if (Sg == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            vc DSW = Sg.DSW();
            if (DSW != null) {
                for (int i10 = 0; i10 < DSW.YFl(); i10++) {
                    String YFl = DSW.YFl(i10);
                    String Sg2 = DSW.Sg(i10);
                    hashMap.put(YFl, Sg2);
                    if (YFl != null && YFl.equalsIgnoreCase("content-type")) {
                        hashMap.put("content-type", Sg2 == null ? "" : Sg2.toLowerCase());
                    }
                }
            }
            if (com.bytedance.sdk.component.DSW.AlY.YFl.YFl(hashMap)) {
                byte[] AlY = Sg.vc().AlY();
                sg2 = new com.bytedance.sdk.component.DSW.Sg(Sg.AlY(), Sg.tN(), Sg.wN(), hashMap, null, Sg.Sg(), Sg.YFl());
                sg2.YFl(AlY);
            } else if (this.NjR) {
                byte[] AlY2 = Sg.vc().AlY();
                sg2 = new com.bytedance.sdk.component.DSW.Sg(Sg.AlY(), Sg.tN(), Sg.wN(), hashMap, new String(AlY2, YFl(YFl(Sg.vc()))), Sg.Sg(), Sg.YFl());
                sg2.YFl(AlY2);
            } else {
                sg2 = new com.bytedance.sdk.component.DSW.Sg(Sg.AlY(), Sg.tN(), Sg.wN(), hashMap, Sg.vc().Sg(), Sg.Sg(), Sg.YFl());
            }
            YFl(sg2, Sg);
            return sg2;
        } catch (Throwable th2) {
            return new com.bytedance.sdk.component.DSW.Sg(false, 5001, th2.getMessage(), null, "BODY_NULL_BODY", 1L, 1L);
        }
    }

    public void YFl(String str, boolean z10) {
        if (z10) {
            YFl("application/json; charset=utf-8", wN(str));
            Sg("Content-Encoding", "gzip");
        } else {
            AlY(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Charset YFl(NjR njR) {
        try {
            return njR != null ? njR.YFl(com.bytedance.sdk.component.Sg.YFl.Sg.NjR.YFl) : com.bytedance.sdk.component.Sg.YFl.Sg.NjR.YFl;
        } catch (Exception unused) {
            return com.bytedance.sdk.component.Sg.YFl.Sg.NjR.YFl;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public NjR YFl(rkt rktVar) {
        try {
            return rktVar.wN();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(com.bytedance.sdk.component.DSW.Sg sg2, EH eh2) {
        if (sg2 == null || eh2 == null) {
            return;
        }
        sg2.YFl(eh2.NjR());
    }
}
