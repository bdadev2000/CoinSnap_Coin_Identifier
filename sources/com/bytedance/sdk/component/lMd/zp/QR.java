package com.bytedance.sdk.component.lMd.zp;

import Q7.n0;
import com.adjust.sdk.Constants;
import com.applovin.exoplayer2.common.base.Ascii;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class QR {
    private static final char[] jU = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final String COT;
    private final String HWF;
    final int KS;
    private final List<String> QR;
    private final String YW;
    private final String dT;
    private final List<String> ku;
    final String lMd;
    final String zp;

    /* loaded from: classes.dex */
    public static final class zp {
        final List<String> HWF;
        List<String> QR;
        String jU;
        String ku;
        String zp;
        String lMd = "";
        String KS = "";
        int COT = -1;

        /* renamed from: com.bytedance.sdk.component.lMd.zp.QR$zp$zp, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public enum EnumC0090zp {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public zp() {
            ArrayList arrayList = new ArrayList();
            this.HWF = arrayList;
            arrayList.add("");
        }

        private boolean COT(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        private boolean HWF(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        public zp KS(String str) {
            if (str != null) {
                return zp(str, true);
            }
            throw new NullPointerException("encodedPathSegments == null");
        }

        public zp jU(String str) {
            this.QR = str != null ? QR.lMd(QR.zp(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public zp lMd(String str) {
            if (str != null) {
                String COT = COT(str, 0, str.length());
                if (COT != null) {
                    this.jU = COT;
                    return this;
                }
                throw new IllegalArgumentException("unexpected host: ".concat(str));
            }
            throw new NullPointerException("host == null");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.zp);
            sb.append("://");
            if (!this.lMd.isEmpty() || !this.KS.isEmpty()) {
                sb.append(this.lMd);
                if (!this.KS.isEmpty()) {
                    sb.append(':');
                    sb.append(this.KS);
                }
                sb.append('@');
            }
            if (this.jU.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.jU);
                sb.append(']');
            } else {
                sb.append(this.jU);
            }
            int zp = zp();
            if (zp != QR.zp(this.zp)) {
                sb.append(':');
                sb.append(zp);
            }
            QR.zp(sb, this.HWF);
            if (this.QR != null) {
                sb.append('?');
                QR.lMd(sb, this.QR);
            }
            if (this.ku != null) {
                sb.append('#');
                sb.append(this.ku);
            }
            return sb.toString();
        }

        public zp zp(String str) {
            if (str != null) {
                if (str.equalsIgnoreCase("http")) {
                    this.zp = "http";
                } else if (str.equalsIgnoreCase(Constants.SCHEME)) {
                    this.zp = Constants.SCHEME;
                } else {
                    throw new IllegalArgumentException("unexpected scheme: ".concat(str));
                }
                return this;
            }
            throw new NullPointerException("scheme == null");
        }

        private static String COT(String str, int i9, int i10) {
            return com.bytedance.sdk.component.lMd.zp.lMd.YW.zp(QR.zp(str, i9, i10, false));
        }

        private void KS() {
            if (this.HWF.remove(r0.size() - 1).isEmpty() && !this.HWF.isEmpty()) {
                this.HWF.set(r0.size() - 1, "");
            } else {
                this.HWF.add("");
            }
        }

        private static int jU(String str, int i9, int i10) {
            while (i9 < i10) {
                char charAt = str.charAt(i9);
                if (charAt == ':') {
                    return i9;
                }
                if (charAt != '[') {
                    i9++;
                }
                do {
                    i9++;
                    if (i9 < i10) {
                    }
                    i9++;
                } while (str.charAt(i9) != ']');
                i9++;
            }
            return i10;
        }

        private static int HWF(String str, int i9, int i10) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(QR.zp(str, i9, i10, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (parseInt <= 0 || parseInt > 65535) {
                return -1;
            }
            return parseInt;
        }

        public QR lMd() {
            if (this.zp != null) {
                if (this.jU != null) {
                    return new QR(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        private static int KS(String str, int i9, int i10) {
            int i11 = 0;
            while (i9 < i10) {
                char charAt = str.charAt(i9);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i11++;
                i9++;
            }
            return i11;
        }

        public int zp() {
            int i9 = this.COT;
            return i9 != -1 ? i9 : QR.zp(this.zp);
        }

        private zp zp(String str, boolean z8) {
            int i9 = 0;
            do {
                int zp = com.bytedance.sdk.component.lMd.zp.lMd.YW.zp(str, i9, str.length(), "/\\");
                zp(str, i9, zp, zp < str.length(), z8);
                i9 = zp + 1;
            } while (i9 <= str.length());
            return this;
        }

        private static int lMd(String str, int i9, int i10) {
            if (i10 - i9 < 2) {
                return -1;
            }
            char charAt = str.charAt(i9);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i9++;
                    if (i9 >= i10) {
                        break;
                    }
                    char charAt2 = str.charAt(i9);
                    if (charAt2 < 'a' || charAt2 > 'z') {
                        if (charAt2 < 'A' || charAt2 > 'Z') {
                            if (charAt2 < '0' || charAt2 > '9') {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        public zp zp(String str, String str2) {
            if (str != null) {
                if (this.QR == null) {
                    this.QR = new ArrayList();
                }
                this.QR.add(QR.zp(str, " \"'<>#&=", true, false, true, true));
                this.QR.add(str2 != null ? QR.zp(str2, " \"'<>#&=", true, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        public EnumC0090zp zp(QR qr, String str) {
            int zp;
            int i9;
            int zp2 = com.bytedance.sdk.component.lMd.zp.lMd.YW.zp(str, 0, str.length());
            int lMd = com.bytedance.sdk.component.lMd.zp.lMd.YW.lMd(str, zp2, str.length());
            if (lMd(str, zp2, lMd) != -1) {
                if (str.regionMatches(true, zp2, "https:", 0, 6)) {
                    this.zp = Constants.SCHEME;
                    zp2 += 6;
                } else if (str.regionMatches(true, zp2, "http:", 0, 5)) {
                    this.zp = "http";
                    zp2 += 5;
                } else {
                    return EnumC0090zp.UNSUPPORTED_SCHEME;
                }
            } else if (qr != null) {
                this.zp = qr.zp;
            } else {
                return EnumC0090zp.MISSING_SCHEME;
            }
            int KS = KS(str, zp2, lMd);
            char c9 = '?';
            char c10 = '#';
            if (KS < 2 && qr != null && qr.zp.equals(this.zp)) {
                this.lMd = qr.lMd();
                this.KS = qr.KS();
                this.jU = qr.lMd;
                this.COT = qr.KS;
                this.HWF.clear();
                this.HWF.addAll(qr.jU());
                if (zp2 == lMd || str.charAt(zp2) == '#') {
                    jU(qr.COT());
                }
            } else {
                boolean z8 = false;
                boolean z9 = false;
                int i10 = zp2 + KS;
                while (true) {
                    zp = com.bytedance.sdk.component.lMd.zp.lMd.YW.zp(str, i10, lMd, "@/\\?#");
                    char charAt = zp != lMd ? str.charAt(zp) : (char) 65535;
                    if (charAt == 65535 || charAt == c10 || charAt == '/' || charAt == '\\' || charAt == c9) {
                        break;
                    }
                    if (charAt == '@') {
                        if (!z8) {
                            int zp3 = com.bytedance.sdk.component.lMd.zp.lMd.YW.zp(str, i10, zp, ':');
                            i9 = zp;
                            String zp4 = QR.zp(str, i10, zp3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z9) {
                                zp4 = n0.l(new StringBuilder(), this.lMd, "%40", zp4);
                            }
                            this.lMd = zp4;
                            if (zp3 != i9) {
                                this.KS = QR.zp(str, zp3 + 1, i9, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z8 = true;
                            }
                            z9 = true;
                        } else {
                            i9 = zp;
                            this.KS += "%40" + QR.zp(str, i10, i9, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                        }
                        i10 = i9 + 1;
                        c9 = '?';
                        c10 = '#';
                    }
                }
                int jU = jU(str, i10, zp);
                int i11 = jU + 1;
                if (i11 < zp) {
                    this.jU = COT(str, i10, jU);
                    int HWF = HWF(str, i11, zp);
                    this.COT = HWF;
                    if (HWF == -1) {
                        return EnumC0090zp.INVALID_PORT;
                    }
                } else {
                    this.jU = COT(str, i10, jU);
                    this.COT = QR.zp(this.zp);
                }
                if (this.jU == null) {
                    return EnumC0090zp.INVALID_HOST;
                }
                zp2 = zp;
            }
            int zp5 = com.bytedance.sdk.component.lMd.zp.lMd.YW.zp(str, zp2, lMd, "?#");
            zp(str, zp2, zp5);
            if (zp5 < lMd && str.charAt(zp5) == '?') {
                int zp6 = com.bytedance.sdk.component.lMd.zp.lMd.YW.zp(str, zp5, lMd, '#');
                this.QR = QR.lMd(QR.zp(str, zp5 + 1, zp6, " \"'<>#", true, false, true, true, null));
                zp5 = zp6;
            }
            if (zp5 < lMd && str.charAt(zp5) == '#') {
                this.ku = QR.zp(str, 1 + zp5, lMd, "", true, false, false, false, null);
            }
            return EnumC0090zp.SUCCESS;
        }

        private void zp(String str, int i9, int i10) {
            if (i9 == i10) {
                return;
            }
            char charAt = str.charAt(i9);
            if (charAt != '/' && charAt != '\\') {
                List<String> list = this.HWF;
                list.set(list.size() - 1, "");
            } else {
                this.HWF.clear();
                this.HWF.add("");
                i9++;
            }
            while (true) {
                int i11 = i9;
                if (i11 >= i10) {
                    return;
                }
                i9 = com.bytedance.sdk.component.lMd.zp.lMd.YW.zp(str, i11, i10, "/\\");
                boolean z8 = i9 < i10;
                zp(str, i11, i9, z8, true);
                if (z8) {
                    i9++;
                }
            }
        }

        private void zp(String str, int i9, int i10, boolean z8, boolean z9) {
            String zp = QR.zp(str, i9, i10, " \"<>^`{}|/\\?#", z9, false, false, true, null);
            if (COT(zp)) {
                return;
            }
            if (HWF(zp)) {
                KS();
                return;
            }
            if (this.HWF.get(r11.size() - 1).isEmpty()) {
                this.HWF.set(r11.size() - 1, zp);
            } else {
                this.HWF.add(zp);
            }
            if (z8) {
                this.HWF.add("");
            }
        }
    }

    public QR(zp zpVar) {
        List<String> list;
        this.zp = zpVar.zp;
        this.COT = zp(zpVar.lMd, false);
        this.HWF = zp(zpVar.KS, false);
        this.lMd = zpVar.jU;
        this.KS = zpVar.zp();
        this.QR = zp(zpVar.HWF, false);
        List<String> list2 = zpVar.QR;
        if (list2 != null) {
            list = zp(list2, true);
        } else {
            list = null;
        }
        this.ku = list;
        String str = zpVar.ku;
        this.YW = str != null ? zp(str, false) : null;
        this.dT = zpVar.toString();
    }

    public String COT() {
        if (this.ku == null) {
            return null;
        }
        int indexOf = this.dT.indexOf(63) + 1;
        String str = this.dT;
        return this.dT.substring(indexOf, com.bytedance.sdk.component.lMd.zp.lMd.YW.zp(str, indexOf, str.length(), '#'));
    }

    public String KS() {
        if (this.HWF.isEmpty()) {
            return "";
        }
        return this.dT.substring(this.dT.indexOf(58, this.zp.length() + 3) + 1, this.dT.indexOf(64));
    }

    public boolean equals(Object obj) {
        if ((obj instanceof QR) && ((QR) obj).dT.equals(this.dT)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.dT.hashCode();
    }

    public List<String> jU() {
        int indexOf = this.dT.indexOf(47, this.zp.length() + 3);
        String str = this.dT;
        int zp2 = com.bytedance.sdk.component.lMd.zp.lMd.YW.zp(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < zp2) {
            int i9 = indexOf + 1;
            int zp3 = com.bytedance.sdk.component.lMd.zp.lMd.YW.zp(this.dT, i9, zp2, '/');
            arrayList.add(this.dT.substring(i9, zp3));
            indexOf = zp3;
        }
        return arrayList;
    }

    public String lMd() {
        if (this.COT.isEmpty()) {
            return "";
        }
        int length = this.zp.length() + 3;
        String str = this.dT;
        return this.dT.substring(length, com.bytedance.sdk.component.lMd.zp.lMd.YW.zp(str, length, str.length(), ":@"));
    }

    public String toString() {
        return this.dT;
    }

    public URL zp() {
        try {
            return new URL(this.dT);
        } catch (MalformedURLException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static int zp(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals(Constants.SCHEME) ? 443 : -1;
    }

    public static QR KS(String str) {
        zp zpVar = new zp();
        if (zpVar.zp((QR) null, str) == zp.EnumC0090zp.SUCCESS) {
            return zpVar.lMd();
        }
        return null;
    }

    public static void lMd(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i9 = 0; i9 < size; i9 += 2) {
            String str = list.get(i9);
            String str2 = list.get(i9 + 1);
            if (i9 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    public static void zp(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            sb.append('/');
            sb.append(list.get(i9));
        }
    }

    public static String zp(String str, boolean z8) {
        return zp(str, 0, str.length(), z8);
    }

    private List<String> zp(List<String> list, boolean z8) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i9 = 0; i9 < size; i9++) {
            String str = list.get(i9);
            arrayList.add(str != null ? zp(str, z8) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static List<String> lMd(String str) {
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        while (i9 <= str.length()) {
            int indexOf = str.indexOf(38, i9);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i9);
            if (indexOf2 != -1 && indexOf2 <= indexOf) {
                arrayList.add(str.substring(i9, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            } else {
                arrayList.add(str.substring(i9, indexOf));
                arrayList.add(null);
            }
            i9 = indexOf + 1;
        }
        return arrayList;
    }

    public static String zp(String str, int i9, int i10, boolean z8) {
        for (int i11 = i9; i11 < i10; i11++) {
            char charAt = str.charAt(i11);
            if (charAt == '%' || (charAt == '+' && z8)) {
                com.bytedance.sdk.component.lMd.zp.lMd.zp zpVar = new com.bytedance.sdk.component.lMd.zp.lMd.zp();
                zpVar.zp(str, i9, i11);
                zp(zpVar, str, i11, i10, z8);
                return zpVar.KS();
            }
        }
        return str.substring(i9, i10);
    }

    public static void zp(com.bytedance.sdk.component.lMd.zp.lMd.zp zpVar, String str, int i9, int i10, boolean z8) {
        int i11;
        while (i9 < i10) {
            int codePointAt = str.codePointAt(i9);
            if (codePointAt == 37 && (i11 = i9 + 2) < i10) {
                int zp2 = com.bytedance.sdk.component.lMd.zp.lMd.YW.zp(str.charAt(i9 + 1));
                int zp3 = com.bytedance.sdk.component.lMd.zp.lMd.YW.zp(str.charAt(i11));
                if (zp2 != -1 && zp3 != -1) {
                    zpVar.lMd((zp2 << 4) + zp3);
                    i9 = i11;
                }
                zpVar.zp(codePointAt);
            } else {
                if (codePointAt == 43 && z8) {
                    zpVar.lMd(32);
                }
                zpVar.zp(codePointAt);
            }
            i9 += Character.charCount(codePointAt);
        }
    }

    public static boolean zp(String str, int i9, int i10) {
        int i11 = i9 + 2;
        return i11 < i10 && str.charAt(i9) == '%' && com.bytedance.sdk.component.lMd.zp.lMd.YW.zp(str.charAt(i9 + 1)) != -1 && com.bytedance.sdk.component.lMd.zp.lMd.YW.zp(str.charAt(i11)) != -1;
    }

    public static String zp(String str, int i9, int i10, String str2, boolean z8, boolean z9, boolean z10, boolean z11, Charset charset) {
        int i11 = i9;
        while (i11 < i10) {
            int codePointAt = str.codePointAt(i11);
            if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || !z11)) {
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z8 && (!z9 || zp(str, i11, i10)))) && (codePointAt != 43 || !z10))) {
                    i11 += Character.charCount(codePointAt);
                }
            }
            com.bytedance.sdk.component.lMd.zp.lMd.zp zpVar = new com.bytedance.sdk.component.lMd.zp.lMd.zp();
            zpVar.zp(str, i9, i11);
            zp(zpVar, str, i11, i10, str2, z8, z9, z10, z11, charset);
            return zpVar.KS();
        }
        return str.substring(i9, i10);
    }

    public static void zp(com.bytedance.sdk.component.lMd.zp.lMd.zp zpVar, String str, int i9, int i10, String str2, boolean z8, boolean z9, boolean z10, boolean z11, Charset charset) {
        com.bytedance.sdk.component.lMd.zp.lMd.zp zpVar2 = null;
        while (i9 < i10) {
            int codePointAt = str.codePointAt(i9);
            if (!z8 || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt == 43 && z10) {
                    zpVar.zp(z8 ? "+" : "%2B");
                } else if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || !z11) && str2.indexOf(codePointAt) == -1 && (codePointAt != 37 || (z8 && (!z9 || zp(str, i9, i10)))))) {
                    zpVar.zp(codePointAt);
                } else {
                    if (zpVar2 == null) {
                        zpVar2 = new com.bytedance.sdk.component.lMd.zp.lMd.zp();
                    }
                    if (charset != null && !charset.equals(com.bytedance.sdk.component.lMd.zp.lMd.YW.zp)) {
                        zpVar2.zp(str, i9, Character.charCount(codePointAt) + i9, charset);
                    } else {
                        zpVar2.zp(codePointAt);
                    }
                    while (!zpVar2.zp()) {
                        byte lMd = zpVar2.lMd();
                        zpVar.lMd(37);
                        char[] cArr = jU;
                        zpVar.lMd((int) cArr[((lMd & 255) >> 4) & 15]);
                        zpVar.lMd((int) cArr[lMd & Ascii.SI]);
                    }
                }
            }
            i9 += Character.charCount(codePointAt);
        }
    }

    public static String zp(String str, String str2, boolean z8, boolean z9, boolean z10, boolean z11) {
        return zp(str, 0, str.length(), str2, z8, z9, z10, z11, null);
    }
}
