package com.bytedance.sdk.component.QR.lMd;

import android.text.TextUtils;
import com.bytedance.sdk.component.lMd.zp.Bj;
import com.bytedance.sdk.component.lMd.zp.tG;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.entity.o;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public class zp extends KS {
    public File lMd;
    public File zp;

    public zp(Bj bj) {
        super(bj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean COT(Map<String, String> map) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static long HWF(Map<String, String> map) {
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
    public static boolean QR(Map<String, String> map) {
        return TextUtils.equals(map.get("Content-Encoding"), "gzip");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void KS() {
        try {
            this.zp.delete();
        } catch (Throwable unused) {
        }
        try {
            this.lMd.delete();
        } catch (Throwable unused2) {
        }
    }

    public void zp(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        this.zp = new File(str, str2);
        this.lMd = new File(str, o.j(str2, ".temp"));
    }

    public void zp(final com.bytedance.sdk.component.QR.zp.zp zpVar) {
        File file = this.zp;
        if (file == null || this.lMd == null) {
            if (zpVar != null) {
                zpVar.zp(this, new IOException("File info is null, please exec setFileInfo(String dir, String fileName)"));
                return;
            }
            return;
        }
        if (file.exists() && this.zp.length() != 0 && zpVar != null) {
            long currentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.component.QR.lMd lmd = new com.bytedance.sdk.component.QR.lMd(true, 200, "Success", null, null, currentTimeMillis, currentTimeMillis);
            lmd.zp(this.zp);
            zpVar.zp(this, lmd);
            return;
        }
        long length = this.lMd.length();
        final long j7 = length >= 0 ? length : 0L;
        tG.zp zpVar2 = new tG.zp();
        zpVar2.zp((Object) lMd());
        lMd(Command.HTTP_HEADER_RANGE, "bytes=" + j7 + "-");
        if (TextUtils.isEmpty(this.ku)) {
            zpVar.zp(this, new IOException("Url is Empty"));
            return;
        }
        try {
            zpVar2.lMd(this.ku);
            if (!TextUtils.isEmpty(this.COT)) {
                zpVar2.zp(this.COT);
            }
            int i9 = this.HWF;
            if (i9 > 0) {
                zpVar2.zp(i9);
            }
            zp(zpVar2);
            this.KS.zp(zpVar2.zp().lMd()).zp(new com.bytedance.sdk.component.lMd.zp.KS() { // from class: com.bytedance.sdk.component.QR.lMd.zp.1
                @Override // com.bytedance.sdk.component.lMd.zp.KS
                public void zp(com.bytedance.sdk.component.lMd.zp.lMd lmd2, IOException iOException) {
                    com.bytedance.sdk.component.QR.zp.zp zpVar3 = zpVar;
                    if (zpVar3 != null) {
                        zpVar3.zp(zp.this, iOException);
                    }
                    zp.this.KS();
                }

                /* JADX WARN: Removed duplicated region for block: B:100:0x017a A[EDGE_INSN: B:100:0x017a->B:101:0x017a BREAK  A[LOOP:1: B:56:0x0146->B:67:0x0176], SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:103:0x017f A[Catch: all -> 0x0167, TryCatch #5 {all -> 0x0167, blocks: (B:60:0x0156, B:62:0x015c, B:68:0x016c, B:103:0x017f, B:106:0x018b, B:108:0x0195, B:110:0x01a1, B:112:0x01ad, B:123:0x01bc, B:124:0x01c9, B:127:0x01e5), top: B:59:0x0156 }] */
                /* JADX WARN: Removed duplicated region for block: B:126:0x01e2  */
                /* JADX WARN: Removed duplicated region for block: B:128:0x01e4  */
                /* JADX WARN: Removed duplicated region for block: B:58:0x014e  */
                @Override // com.bytedance.sdk.component.lMd.zp.KS
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void zp(com.bytedance.sdk.component.lMd.zp.lMd r19, com.bytedance.sdk.component.lMd.zp.dQp r20) throws java.io.IOException {
                    /*
                        Method dump skipped, instructions count: 560
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.QR.lMd.zp.AnonymousClass1.zp(com.bytedance.sdk.component.lMd.zp.lMd, com.bytedance.sdk.component.lMd.zp.dQp):void");
                }
            });
        } catch (IllegalArgumentException unused) {
            zpVar.zp(this, new IOException("Url is not a valid HTTP or HTTPS URL"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x019f A[Catch: all -> 0x0223, TryCatch #1 {all -> 0x0223, blocks: (B:66:0x0180, B:68:0x0186, B:70:0x018a, B:71:0x0190, B:72:0x0197, B:74:0x019f, B:76:0x01af, B:82:0x01b8, B:87:0x01cc, B:94:0x01e4, B:96:0x01ec, B:98:0x01f6, B:100:0x0200, B:120:0x0216, B:131:0x01da), top: B:65:0x0180 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c7 A[EDGE_INSN: B:84:0x01c7->B:85:0x01c7 BREAK  A[LOOP:1: B:72:0x0197->B:81:0x01c2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cc A[Catch: all -> 0x0223, TryCatch #1 {all -> 0x0223, blocks: (B:66:0x0180, B:68:0x0186, B:70:0x018a, B:71:0x0190, B:72:0x0197, B:74:0x019f, B:76:0x01af, B:82:0x01b8, B:87:0x01cc, B:94:0x01e4, B:96:0x01ec, B:98:0x01f6, B:100:0x0200, B:120:0x0216, B:131:0x01da), top: B:65:0x0180 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.component.QR.lMd zp() {
        /*
            Method dump skipped, instructions count: 590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.QR.lMd.zp.zp():com.bytedance.sdk.component.QR.lMd");
    }
}
