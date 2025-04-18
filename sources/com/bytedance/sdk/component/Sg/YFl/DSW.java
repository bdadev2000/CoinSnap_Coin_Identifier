package com.bytedance.sdk.component.Sg.YFl;

import com.adjust.sdk.Constants;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.UByte;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class DSW {
    private static final char[] AlY = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final List<String> DSW;
    private final String NjR;
    final String Sg;
    final String YFl;

    /* renamed from: nc, reason: collision with root package name */
    private final String f10327nc;
    private final List<String> qsH;
    final int tN;

    /* renamed from: vc, reason: collision with root package name */
    private final String f10328vc;
    private final String wN;

    /* loaded from: classes.dex */
    public static final class YFl {
        String AlY;
        List<String> DSW;
        String YFl;
        String qsH;

        /* renamed from: vc, reason: collision with root package name */
        final List<String> f10329vc;
        String Sg = "";
        String tN = "";
        int wN = -1;

        /* renamed from: com.bytedance.sdk.component.Sg.YFl.DSW$YFl$YFl, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public enum EnumC0079YFl {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public YFl() {
            ArrayList arrayList = new ArrayList();
            this.f10329vc = arrayList;
            arrayList.add("");
        }

        private boolean vc(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private boolean wN(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        public YFl AlY(String str) {
            this.DSW = str != null ? DSW.Sg(DSW.YFl(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public YFl Sg(String str) {
            if (str != null) {
                String wN = wN(str, 0, str.length());
                if (wN != null) {
                    this.AlY = wN;
                    return this;
                }
                throw new IllegalArgumentException("unexpected host: ".concat(str));
            }
            throw new NullPointerException("host == null");
        }

        public YFl YFl(String str) {
            if (str != null) {
                if (str.equalsIgnoreCase("http")) {
                    this.YFl = "http";
                } else if (str.equalsIgnoreCase(Constants.SCHEME)) {
                    this.YFl = Constants.SCHEME;
                } else {
                    throw new IllegalArgumentException("unexpected scheme: ".concat(str));
                }
                return this;
            }
            throw new NullPointerException("scheme == null");
        }

        public YFl tN(String str) {
            if (str != null) {
                return YFl(str, true);
            }
            throw new NullPointerException("encodedPathSegments == null");
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.YFl);
            sb2.append("://");
            if (!this.Sg.isEmpty() || !this.tN.isEmpty()) {
                sb2.append(this.Sg);
                if (!this.tN.isEmpty()) {
                    sb2.append(AbstractJsonLexerKt.COLON);
                    sb2.append(this.tN);
                }
                sb2.append('@');
            }
            if (this.AlY.indexOf(58) != -1) {
                sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
                sb2.append(this.AlY);
                sb2.append(AbstractJsonLexerKt.END_LIST);
            } else {
                sb2.append(this.AlY);
            }
            int YFl = YFl();
            if (YFl != DSW.YFl(this.YFl)) {
                sb2.append(AbstractJsonLexerKt.COLON);
                sb2.append(YFl);
            }
            DSW.YFl(sb2, this.f10329vc);
            if (this.DSW != null) {
                sb2.append('?');
                DSW.Sg(sb2, this.DSW);
            }
            if (this.qsH != null) {
                sb2.append('#');
                sb2.append(this.qsH);
            }
            return sb2.toString();
        }

        private static String wN(String str, int i10, int i11) {
            return com.bytedance.sdk.component.Sg.YFl.Sg.NjR.YFl(DSW.YFl(str, i10, i11, false));
        }

        private static int AlY(String str, int i10, int i11) {
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (charAt == ':') {
                    return i10;
                }
                if (charAt != '[') {
                    i10++;
                }
                do {
                    i10++;
                    if (i10 < i11) {
                    }
                    i10++;
                } while (str.charAt(i10) != ']');
                i10++;
            }
            return i11;
        }

        private void tN() {
            if (this.f10329vc.remove(r0.size() - 1).isEmpty() && !this.f10329vc.isEmpty()) {
                this.f10329vc.set(r0.size() - 1, "");
            } else {
                this.f10329vc.add("");
            }
        }

        private static int vc(String str, int i10, int i11) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(DSW.YFl(str, i10, i11, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (parseInt <= 0 || parseInt > 65535) {
                return -1;
            }
            return parseInt;
        }

        public DSW Sg() {
            if (this.YFl != null) {
                if (this.AlY != null) {
                    return new DSW(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        private static int tN(String str, int i10, int i11) {
            int i12 = 0;
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i12++;
                i10++;
            }
            return i12;
        }

        public int YFl() {
            int i10 = this.wN;
            return i10 != -1 ? i10 : DSW.YFl(this.YFl);
        }

        private YFl YFl(String str, boolean z10) {
            int i10 = 0;
            do {
                int YFl = com.bytedance.sdk.component.Sg.YFl.Sg.NjR.YFl(str, i10, str.length(), "/\\");
                YFl(str, i10, YFl, YFl < str.length(), z10);
                i10 = YFl + 1;
            } while (i10 <= str.length());
            return this;
        }

        private static int Sg(String str, int i10, int i11) {
            if (i11 - i10 < 2) {
                return -1;
            }
            char charAt = str.charAt(i10);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i10++;
                    if (i10 >= i11) {
                        break;
                    }
                    char charAt2 = str.charAt(i10);
                    if (charAt2 < 'a' || charAt2 > 'z') {
                        if (charAt2 < 'A' || charAt2 > 'Z') {
                            if (charAt2 < '0' || charAt2 > '9') {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        public YFl YFl(String str, String str2) {
            if (str != null) {
                if (this.DSW == null) {
                    this.DSW = new ArrayList();
                }
                this.DSW.add(DSW.YFl(str, " \"'<>#&=", true, false, true, true));
                this.DSW.add(str2 != null ? DSW.YFl(str2, " \"'<>#&=", true, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        public EnumC0079YFl YFl(DSW dsw, String str) {
            int YFl;
            int YFl2 = com.bytedance.sdk.component.Sg.YFl.Sg.NjR.YFl(str, 0, str.length());
            int Sg = com.bytedance.sdk.component.Sg.YFl.Sg.NjR.Sg(str, YFl2, str.length());
            char c10 = 65535;
            if (Sg(str, YFl2, Sg) != -1) {
                if (str.regionMatches(true, YFl2, "https:", 0, 6)) {
                    this.YFl = Constants.SCHEME;
                    YFl2 += 6;
                } else if (str.regionMatches(true, YFl2, "http:", 0, 5)) {
                    this.YFl = "http";
                    YFl2 += 5;
                } else {
                    return EnumC0079YFl.UNSUPPORTED_SCHEME;
                }
            } else if (dsw != null) {
                this.YFl = dsw.YFl;
            } else {
                return EnumC0079YFl.MISSING_SCHEME;
            }
            int tN = tN(str, YFl2, Sg);
            char c11 = '?';
            char c12 = '#';
            if (tN < 2 && dsw != null && dsw.YFl.equals(this.YFl)) {
                this.Sg = dsw.Sg();
                this.tN = dsw.tN();
                this.AlY = dsw.Sg;
                this.wN = dsw.tN;
                this.f10329vc.clear();
                this.f10329vc.addAll(dsw.AlY());
                if (YFl2 == Sg || str.charAt(YFl2) == '#') {
                    AlY(dsw.wN());
                }
            } else {
                boolean z10 = false;
                boolean z11 = false;
                int i10 = YFl2 + tN;
                while (true) {
                    YFl = com.bytedance.sdk.component.Sg.YFl.Sg.NjR.YFl(str, i10, Sg, "@/\\?#");
                    char charAt = YFl != Sg ? str.charAt(YFl) : c10;
                    if (charAt == c10 || charAt == c12 || charAt == '/' || charAt == '\\' || charAt == c11) {
                        break;
                    }
                    if (charAt == '@') {
                        if (!z10) {
                            int YFl3 = com.bytedance.sdk.component.Sg.YFl.Sg.NjR.YFl(str, i10, YFl, AbstractJsonLexerKt.COLON);
                            boolean z12 = z10;
                            String YFl4 = DSW.YFl(str, i10, YFl3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z11) {
                                YFl4 = a.n(new StringBuilder(), this.Sg, "%40", YFl4);
                            }
                            this.Sg = YFl4;
                            if (YFl3 != YFl) {
                                this.tN = DSW.YFl(str, YFl3 + 1, YFl, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z10 = true;
                            } else {
                                z10 = z12;
                            }
                            z11 = true;
                        } else {
                            this.tN += "%40" + DSW.YFl(str, i10, YFl, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            z10 = z10;
                        }
                        i10 = YFl + 1;
                        c11 = '?';
                        c12 = '#';
                        c10 = 65535;
                    }
                }
                int AlY = AlY(str, i10, YFl);
                int i11 = AlY + 1;
                if (i11 < YFl) {
                    this.AlY = wN(str, i10, AlY);
                    int vc2 = vc(str, i11, YFl);
                    this.wN = vc2;
                    if (vc2 == -1) {
                        return EnumC0079YFl.INVALID_PORT;
                    }
                } else {
                    this.AlY = wN(str, i10, AlY);
                    this.wN = DSW.YFl(this.YFl);
                }
                if (this.AlY == null) {
                    return EnumC0079YFl.INVALID_HOST;
                }
                YFl2 = YFl;
            }
            int YFl5 = com.bytedance.sdk.component.Sg.YFl.Sg.NjR.YFl(str, YFl2, Sg, "?#");
            YFl(str, YFl2, YFl5);
            if (YFl5 < Sg && str.charAt(YFl5) == '?') {
                int YFl6 = com.bytedance.sdk.component.Sg.YFl.Sg.NjR.YFl(str, YFl5, Sg, '#');
                this.DSW = DSW.Sg(DSW.YFl(str, YFl5 + 1, YFl6, " \"'<>#", true, false, true, true, null));
                YFl5 = YFl6;
            }
            if (YFl5 < Sg && str.charAt(YFl5) == '#') {
                this.qsH = DSW.YFl(str, YFl5 + 1, Sg, "", true, false, false, false, null);
            }
            return EnumC0079YFl.SUCCESS;
        }

        private void YFl(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char charAt = str.charAt(i10);
            if (charAt != '/' && charAt != '\\') {
                List<String> list = this.f10329vc;
                list.set(list.size() - 1, "");
            } else {
                this.f10329vc.clear();
                this.f10329vc.add("");
                i10++;
            }
            while (true) {
                int i12 = i10;
                if (i12 >= i11) {
                    return;
                }
                i10 = com.bytedance.sdk.component.Sg.YFl.Sg.NjR.YFl(str, i12, i11, "/\\");
                boolean z10 = i10 < i11;
                YFl(str, i12, i10, z10, true);
                if (z10) {
                    i10++;
                }
            }
        }

        private void YFl(String str, int i10, int i11, boolean z10, boolean z11) {
            String YFl = DSW.YFl(str, i10, i11, " \"<>^`{}|/\\?#", z11, false, false, true, null);
            if (wN(YFl)) {
                return;
            }
            if (vc(YFl)) {
                tN();
                return;
            }
            if (this.f10329vc.get(r11.size() - 1).isEmpty()) {
                this.f10329vc.set(r11.size() - 1, YFl);
            } else {
                this.f10329vc.add(YFl);
            }
            if (z10) {
                this.f10329vc.add("");
            }
        }
    }

    public DSW(YFl yFl) {
        List<String> list;
        this.YFl = yFl.YFl;
        this.wN = YFl(yFl.Sg, false);
        this.f10328vc = YFl(yFl.tN, false);
        this.Sg = yFl.AlY;
        this.tN = yFl.YFl();
        this.DSW = YFl(yFl.f10329vc, false);
        List<String> list2 = yFl.DSW;
        if (list2 != null) {
            list = YFl(list2, true);
        } else {
            list = null;
        }
        this.qsH = list;
        String str = yFl.qsH;
        this.NjR = str != null ? YFl(str, false) : null;
        this.f10327nc = yFl.toString();
    }

    public List<String> AlY() {
        int indexOf = this.f10327nc.indexOf(47, this.YFl.length() + 3);
        String str = this.f10327nc;
        int YFl2 = com.bytedance.sdk.component.Sg.YFl.Sg.NjR.YFl(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < YFl2) {
            int i10 = indexOf + 1;
            int YFl3 = com.bytedance.sdk.component.Sg.YFl.Sg.NjR.YFl(this.f10327nc, i10, YFl2, '/');
            arrayList.add(this.f10327nc.substring(i10, YFl3));
            indexOf = YFl3;
        }
        return arrayList;
    }

    public String Sg() {
        if (this.wN.isEmpty()) {
            return "";
        }
        int length = this.YFl.length() + 3;
        String str = this.f10327nc;
        return this.f10327nc.substring(length, com.bytedance.sdk.component.Sg.YFl.Sg.NjR.YFl(str, length, str.length(), ":@"));
    }

    public URL YFl() {
        try {
            return new URL(this.f10327nc);
        } catch (MalformedURLException e2) {
            throw new RuntimeException(e2);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof DSW) && ((DSW) obj).f10327nc.equals(this.f10327nc);
    }

    public int hashCode() {
        return this.f10327nc.hashCode();
    }

    public String tN() {
        if (this.f10328vc.isEmpty()) {
            return "";
        }
        return this.f10327nc.substring(this.f10327nc.indexOf(58, this.YFl.length() + 3) + 1, this.f10327nc.indexOf(64));
    }

    public String toString() {
        return this.f10327nc;
    }

    public String wN() {
        if (this.qsH == null) {
            return null;
        }
        int indexOf = this.f10327nc.indexOf(63) + 1;
        String str = this.f10327nc;
        return this.f10327nc.substring(indexOf, com.bytedance.sdk.component.Sg.YFl.Sg.NjR.YFl(str, indexOf, str.length(), '#'));
    }

    public static int YFl(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals(Constants.SCHEME) ? 443 : -1;
    }

    public static void Sg(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10 += 2) {
            String str = list.get(i10);
            String str2 = list.get(i10 + 1);
            if (i10 > 0) {
                sb2.append(Typography.amp);
            }
            sb2.append(str);
            if (str2 != null) {
                sb2.append('=');
                sb2.append(str2);
            }
        }
    }

    public static void YFl(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append('/');
            sb2.append(list.get(i10));
        }
    }

    public static DSW tN(String str) {
        YFl yFl = new YFl();
        if (yFl.YFl((DSW) null, str) == YFl.EnumC0079YFl.SUCCESS) {
            return yFl.Sg();
        }
        return null;
    }

    public static String YFl(String str, boolean z10) {
        return YFl(str, 0, str.length(), z10);
    }

    private List<String> YFl(List<String> list, boolean z10) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            String str = list.get(i10);
            arrayList.add(str != null ? YFl(str, z10) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static List<String> Sg(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int indexOf = str.indexOf(38, i10);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i10);
            if (indexOf2 != -1 && indexOf2 <= indexOf) {
                arrayList.add(str.substring(i10, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            } else {
                arrayList.add(str.substring(i10, indexOf));
                arrayList.add(null);
            }
            i10 = indexOf + 1;
        }
        return arrayList;
    }

    public static String YFl(String str, int i10, int i11, boolean z10) {
        for (int i12 = i10; i12 < i11; i12++) {
            char charAt = str.charAt(i12);
            if (charAt == '%' || (charAt == '+' && z10)) {
                com.bytedance.sdk.component.Sg.YFl.Sg.YFl yFl = new com.bytedance.sdk.component.Sg.YFl.Sg.YFl();
                yFl.YFl(str, i10, i12);
                YFl(yFl, str, i12, i11, z10);
                return yFl.tN();
            }
        }
        return str.substring(i10, i11);
    }

    public static void YFl(com.bytedance.sdk.component.Sg.YFl.Sg.YFl yFl, String str, int i10, int i11, boolean z10) {
        int i12;
        while (i10 < i11) {
            int codePointAt = str.codePointAt(i10);
            if (codePointAt == 37 && (i12 = i10 + 2) < i11) {
                int YFl2 = com.bytedance.sdk.component.Sg.YFl.Sg.NjR.YFl(str.charAt(i10 + 1));
                int YFl3 = com.bytedance.sdk.component.Sg.YFl.Sg.NjR.YFl(str.charAt(i12));
                if (YFl2 != -1 && YFl3 != -1) {
                    yFl.Sg((YFl2 << 4) + YFl3);
                    i10 = i12;
                }
                yFl.YFl(codePointAt);
            } else {
                if (codePointAt == 43 && z10) {
                    yFl.Sg(32);
                }
                yFl.YFl(codePointAt);
            }
            i10 += Character.charCount(codePointAt);
        }
    }

    public static boolean YFl(String str, int i10, int i11) {
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && com.bytedance.sdk.component.Sg.YFl.Sg.NjR.YFl(str.charAt(i10 + 1)) != -1 && com.bytedance.sdk.component.Sg.YFl.Sg.NjR.YFl(str.charAt(i12)) != -1;
    }

    public static String YFl(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        int i12 = i10;
        while (i12 < i11) {
            int codePointAt = str.codePointAt(i12);
            if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || !z13)) {
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z10 && (!z11 || YFl(str, i12, i11)))) && (codePointAt != 43 || !z12))) {
                    i12 += Character.charCount(codePointAt);
                }
            }
            com.bytedance.sdk.component.Sg.YFl.Sg.YFl yFl = new com.bytedance.sdk.component.Sg.YFl.Sg.YFl();
            yFl.YFl(str, i10, i12);
            YFl(yFl, str, i12, i11, str2, z10, z11, z12, z13, charset);
            return yFl.tN();
        }
        return str.substring(i10, i11);
    }

    public static void YFl(com.bytedance.sdk.component.Sg.YFl.Sg.YFl yFl, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        com.bytedance.sdk.component.Sg.YFl.Sg.YFl yFl2 = null;
        while (i10 < i11) {
            int codePointAt = str.codePointAt(i10);
            if (!z10 || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt == 43 && z12) {
                    yFl.YFl(z10 ? "+" : "%2B");
                } else if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || !z13) && str2.indexOf(codePointAt) == -1 && (codePointAt != 37 || (z10 && (!z11 || YFl(str, i10, i11)))))) {
                    yFl.YFl(codePointAt);
                } else {
                    if (yFl2 == null) {
                        yFl2 = new com.bytedance.sdk.component.Sg.YFl.Sg.YFl();
                    }
                    if (charset != null && !charset.equals(com.bytedance.sdk.component.Sg.YFl.Sg.NjR.YFl)) {
                        yFl2.YFl(str, i10, Character.charCount(codePointAt) + i10, charset);
                    } else {
                        yFl2.YFl(codePointAt);
                    }
                    while (!yFl2.YFl()) {
                        int Sg = yFl2.Sg() & UByte.MAX_VALUE;
                        yFl.Sg(37);
                        char[] cArr = AlY;
                        yFl.Sg((int) cArr[(Sg >> 4) & 15]);
                        yFl.Sg((int) cArr[Sg & 15]);
                    }
                }
            }
            i10 += Character.charCount(codePointAt);
        }
    }

    public static String YFl(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13) {
        return YFl(str, 0, str.length(), str2, z10, z11, z12, z13, null);
    }
}
