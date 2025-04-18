package com.bytedance.sdk.component.DSW.Sg;

import android.text.TextUtils;
import com.bytedance.sdk.component.Sg.YFl.GA;
import com.bytedance.sdk.component.Sg.YFl.eT;
import com.mbridge.msdk.foundation.download.Command;
import eb.j;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public class YFl extends tN {
    public File Sg;
    public File YFl;

    public YFl(eT eTVar) {
        super(eTVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AlY() {
        try {
            this.YFl.delete();
        } catch (Throwable unused) {
        }
        try {
            this.Sg.delete();
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean DSW(Map<String, String> map) {
        return TextUtils.equals(map.get("Content-Encoding"), "gzip");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long vc(Map<String, String> map) {
        String str;
        if (map.containsKey("content-length")) {
            str = map.get("content-length");
        } else if (map.containsKey("Content-Length")) {
            str = map.get("Content-Length");
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str) || str == null) {
            return 0L;
        }
        try {
            return Long.valueOf(str).longValue();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean wN(Map<String, String> map) {
        if (TextUtils.equals(map.get("Accept-Ranges"), "bytes") || TextUtils.equals(map.get("accept-ranges"), "bytes")) {
            return true;
        }
        String str = map.get("Content-Range");
        if (TextUtils.isEmpty(str)) {
            str = map.get("content-range");
        }
        if (str != null && str.startsWith("bytes")) {
            return true;
        }
        return false;
    }

    public void YFl(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        this.YFl = new File(str, str2);
        this.Sg = new File(str, j.k(str2, ".temp"));
    }

    public void YFl(final com.bytedance.sdk.component.DSW.YFl.YFl yFl) {
        File file = this.YFl;
        if (file == null || this.Sg == null) {
            if (yFl != null) {
                yFl.YFl(this, new IOException("File info is null, please exec setFileInfo(String dir, String fileName)"));
                return;
            }
            return;
        }
        if (file.exists() && this.YFl.length() != 0 && yFl != null) {
            long currentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.component.DSW.Sg sg2 = new com.bytedance.sdk.component.DSW.Sg(true, 200, "Success", null, null, currentTimeMillis, currentTimeMillis);
            sg2.YFl(this.YFl);
            yFl.YFl(this, sg2);
            return;
        }
        long length = this.Sg.length();
        final long j3 = length >= 0 ? length : 0L;
        GA.YFl yFl2 = new GA.YFl();
        yFl2.YFl((Object) Sg());
        Sg(Command.HTTP_HEADER_RANGE, "bytes=" + j3 + "-");
        if (TextUtils.isEmpty(this.qsH)) {
            yFl.YFl(this, new IOException("Url is Empty"));
            return;
        }
        try {
            yFl2.Sg(this.qsH);
            if (!TextUtils.isEmpty(this.wN)) {
                yFl2.YFl(this.wN);
            }
            int i10 = this.f10312vc;
            if (i10 > 0) {
                yFl2.YFl(i10);
            }
            YFl(yFl2);
            this.tN.YFl(yFl2.YFl().Sg()).YFl(new com.bytedance.sdk.component.Sg.YFl.tN() { // from class: com.bytedance.sdk.component.DSW.Sg.YFl.1
                @Override // com.bytedance.sdk.component.Sg.YFl.tN
                public void YFl(com.bytedance.sdk.component.Sg.YFl.Sg sg3, IOException iOException) {
                    com.bytedance.sdk.component.DSW.YFl.YFl yFl3 = yFl;
                    if (yFl3 != null) {
                        yFl3.YFl(YFl.this, iOException);
                    }
                    YFl.this.AlY();
                }

                /* JADX WARN: Removed duplicated region for block: B:101:0x017a A[Catch: all -> 0x0183, TryCatch #3 {all -> 0x0183, blocks: (B:56:0x014f, B:58:0x0157, B:63:0x0165, B:101:0x017a, B:104:0x018c, B:106:0x0196, B:108:0x01a2, B:110:0x01ae, B:121:0x01bd, B:122:0x01ca, B:125:0x01e4), top: B:55:0x014f }] */
                /* JADX WARN: Removed duplicated region for block: B:124:0x01e3  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x0148  */
                /* JADX WARN: Removed duplicated region for block: B:63:0x0165 A[Catch: all -> 0x0183, TryCatch #3 {all -> 0x0183, blocks: (B:56:0x014f, B:58:0x0157, B:63:0x0165, B:101:0x017a, B:104:0x018c, B:106:0x0196, B:108:0x01a2, B:110:0x01ae, B:121:0x01bd, B:122:0x01ca, B:125:0x01e4), top: B:55:0x014f }] */
                /* JADX WARN: Removed duplicated region for block: B:66:0x016f A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:98:0x0175 A[EDGE_INSN: B:98:0x0175->B:99:0x0175 BREAK  A[LOOP:1: B:52:0x0140->B:65:0x016f], SYNTHETIC] */
                @Override // com.bytedance.sdk.component.Sg.YFl.tN
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void YFl(com.bytedance.sdk.component.Sg.YFl.Sg r18, com.bytedance.sdk.component.Sg.YFl.EH r19) throws java.io.IOException {
                    /*
                        Method dump skipped, instructions count: 557
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.DSW.Sg.YFl.AnonymousClass1.YFl(com.bytedance.sdk.component.Sg.YFl.Sg, com.bytedance.sdk.component.Sg.YFl.EH):void");
                }
            });
        } catch (IllegalArgumentException unused) {
            yFl.YFl(this, new IOException("Url is not a valid HTTP or HTTPS URL"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x019e A[Catch: all -> 0x022a, TryCatch #4 {all -> 0x022a, blocks: (B:67:0x017f, B:69:0x0185, B:71:0x0189, B:72:0x018f, B:73:0x0196, B:75:0x019e, B:77:0x01ae, B:82:0x01ba, B:91:0x01d0, B:98:0x01e8, B:100:0x01f0, B:102:0x01fa, B:104:0x0204, B:124:0x021a, B:136:0x01de), top: B:66:0x017f }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ba A[Catch: all -> 0x022a, TryCatch #4 {all -> 0x022a, blocks: (B:67:0x017f, B:69:0x0185, B:71:0x0189, B:72:0x018f, B:73:0x0196, B:75:0x019e, B:77:0x01ae, B:82:0x01ba, B:91:0x01d0, B:98:0x01e8, B:100:0x01f0, B:102:0x01fa, B:104:0x0204, B:124:0x021a, B:136:0x01de), top: B:66:0x017f }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01cb A[EDGE_INSN: B:88:0x01cb->B:89:0x01cb BREAK  A[LOOP:1: B:73:0x0196->B:84:0x01c6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d0 A[Catch: all -> 0x022a, TryCatch #4 {all -> 0x022a, blocks: (B:67:0x017f, B:69:0x0185, B:71:0x0189, B:72:0x018f, B:73:0x0196, B:75:0x019e, B:77:0x01ae, B:82:0x01ba, B:91:0x01d0, B:98:0x01e8, B:100:0x01f0, B:102:0x01fa, B:104:0x0204, B:124:0x021a, B:136:0x01de), top: B:66:0x017f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.component.DSW.Sg YFl() {
        /*
            Method dump skipped, instructions count: 595
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.DSW.Sg.YFl.YFl():com.bytedance.sdk.component.DSW.Sg");
    }
}
