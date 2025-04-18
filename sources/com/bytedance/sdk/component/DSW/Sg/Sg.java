package com.bytedance.sdk.component.DSW.Sg;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.Sg.YFl.DSW;
import com.bytedance.sdk.component.Sg.YFl.EH;
import com.bytedance.sdk.component.Sg.YFl.GA;
import com.bytedance.sdk.component.Sg.YFl.YFl;
import com.bytedance.sdk.component.Sg.YFl.eT;
import com.bytedance.sdk.component.Sg.YFl.rkt;
import com.bytedance.sdk.component.Sg.YFl.vc;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class Sg extends tN {
    private Map<String, String> YoT;
    private boolean eT;

    /* renamed from: nc, reason: collision with root package name */
    private com.bytedance.sdk.component.Sg.YFl.YFl f10311nc;
    public static final com.bytedance.sdk.component.Sg.YFl.YFl YFl = new YFl.C0080YFl().YFl().Sg();
    public static final com.bytedance.sdk.component.Sg.YFl.YFl Sg = new YFl.C0080YFl().Sg();

    public Sg(eT eTVar) {
        super(eTVar);
        this.f10311nc = YFl;
        this.eT = false;
        this.YoT = new HashMap();
    }

    public void YFl(String str, String str2) {
        if (str == null) {
            return;
        }
        this.YoT.put(str, str2);
    }

    public void YFl(boolean z10) {
        this.eT = z10;
    }

    public void YFl(final com.bytedance.sdk.component.DSW.YFl.YFl yFl) {
        try {
            GA.YFl yFl2 = new GA.YFl();
            if (this.eT) {
                yFl2.Sg(this.qsH);
            } else {
                DSW.YFl yFl3 = new DSW.YFl();
                Uri parse = Uri.parse(this.qsH);
                yFl3.YFl(parse.getScheme());
                yFl3.Sg(parse.getHost());
                String encodedPath = parse.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith("/")) {
                        encodedPath = encodedPath.substring(1);
                    }
                    yFl3.tN(encodedPath);
                }
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str : queryParameterNames) {
                        this.YoT.put(str, parse.getQueryParameter(str));
                    }
                }
                for (Map.Entry<String, String> entry : this.YoT.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String encode = URLEncoder.encode(key, "UTF-8");
                        if (value == null) {
                            value = "";
                        }
                        yFl3.YFl(encode, URLEncoder.encode(value, "UTF-8"));
                    }
                }
                yFl2.YFl(yFl3.Sg());
            }
            YFl(yFl2);
            yFl2.YFl(this.f10311nc);
            yFl2.YFl((Object) Sg());
            if (!TextUtils.isEmpty(this.wN)) {
                yFl2.YFl(this.wN);
            }
            int i10 = this.f10312vc;
            if (i10 > 0) {
                yFl2.YFl(i10);
            }
            this.tN.YFl(yFl2.YFl().Sg()).YFl(new com.bytedance.sdk.component.Sg.YFl.tN() { // from class: com.bytedance.sdk.component.DSW.Sg.Sg.1
                @Override // com.bytedance.sdk.component.Sg.YFl.tN
                public void YFl(com.bytedance.sdk.component.Sg.YFl.Sg sg2, IOException iOException) {
                    com.bytedance.sdk.component.DSW.YFl.YFl yFl4 = yFl;
                    if (yFl4 != null) {
                        yFl4.YFl(Sg.this, iOException);
                    }
                }

                @Override // com.bytedance.sdk.component.Sg.YFl.tN
                public void YFl(com.bytedance.sdk.component.Sg.YFl.Sg sg2, EH eh2) throws IOException {
                    if (yFl != null) {
                        HashMap hashMap = new HashMap();
                        if (eh2 != null) {
                            vc DSW = eh2.DSW();
                            if (DSW != null) {
                                for (int i11 = 0; i11 < DSW.YFl(); i11++) {
                                    hashMap.put(DSW.YFl(i11), DSW.Sg(i11));
                                }
                            }
                            rkt vc2 = eh2.vc();
                            yFl.YFl(Sg.this, new com.bytedance.sdk.component.DSW.Sg(eh2.AlY(), eh2.tN(), eh2.wN(), hashMap, vc2 == null ? "" : vc2.Sg(), eh2.Sg(), eh2.YFl()));
                        }
                    }
                }
            });
        } catch (Throwable th2) {
            if (yFl != null) {
                yFl.YFl(this, new IOException(th2.getMessage()));
            }
        }
    }

    public com.bytedance.sdk.component.DSW.Sg YFl() {
        try {
            GA.YFl yFl = new GA.YFl();
            String str = "";
            if (this.eT) {
                yFl.Sg(this.qsH);
            } else {
                DSW.YFl yFl2 = new DSW.YFl();
                Uri parse = Uri.parse(this.qsH);
                yFl2.YFl(parse.getScheme());
                yFl2.Sg(parse.getHost());
                String encodedPath = parse.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith("/")) {
                        encodedPath = encodedPath.substring(1);
                    }
                    yFl2.tN(encodedPath);
                }
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str2 : queryParameterNames) {
                        this.YoT.put(str2, parse.getQueryParameter(str2));
                    }
                }
                for (Map.Entry<String, String> entry : this.YoT.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String encode = URLEncoder.encode(key, "UTF-8");
                        if (value == null) {
                            value = "";
                        }
                        yFl2.YFl(encode, URLEncoder.encode(value, "UTF-8"));
                    }
                }
                yFl.YFl(yFl2.Sg());
            }
            YFl(yFl);
            yFl.YFl(this.f10311nc);
            yFl.YFl((Object) Sg());
            EH Sg2 = this.tN.YFl(yFl.YFl().Sg()).Sg();
            if (Sg2 == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            vc DSW = Sg2.DSW();
            if (DSW != null) {
                for (int i10 = 0; i10 < DSW.YFl(); i10++) {
                    hashMap.put(DSW.YFl(i10), DSW.Sg(i10));
                }
            }
            rkt vc2 = Sg2.vc();
            if (vc2 != null) {
                str = vc2.Sg();
            }
            return new com.bytedance.sdk.component.DSW.Sg(Sg2.AlY(), Sg2.tN(), Sg2.wN(), hashMap, str, Sg2.Sg(), Sg2.YFl());
        } catch (Throwable unused) {
            return null;
        }
    }
}
