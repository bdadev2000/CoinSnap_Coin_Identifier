package com.bykv.vk.openvk.component.video.zp.lMd;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class YW {
    public final zp KS;
    public final List<lMd> lMd;
    public final KS zp;

    /* loaded from: classes.dex */
    public static final class KS {
        final String KS;
        final String lMd;
        final String zp;

        private KS(String str, String str2, String str3) {
            this.zp = str;
            this.lMd = str2;
            this.KS = str3;
        }

        public static KS zp(String str) throws jU {
            int indexOf = str.indexOf(32);
            if (indexOf != -1) {
                int lastIndexOf = str.lastIndexOf(32);
                if (lastIndexOf > indexOf) {
                    String trim = str.substring(0, indexOf).trim();
                    String trim2 = str.substring(indexOf + 1, lastIndexOf).trim();
                    String trim3 = str.substring(lastIndexOf + 1).trim();
                    if (trim.length() != 0 && trim2.length() != 0 && trim3.length() != 0) {
                        return new KS(trim, trim2, trim3);
                    }
                    throw new jU("request line format error, line: ".concat(str));
                }
                throw new jU("request line format error, line: ".concat(str));
            }
            throw new jU("request line format error, line: ".concat(str));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("RequestLine{method='");
            sb.append(this.zp);
            sb.append("', path='");
            sb.append(this.lMd);
            sb.append("', version='");
            return AbstractC2914a.h(sb, this.KS, "'}");
        }
    }

    /* loaded from: classes.dex */
    public static final class jU extends Exception {
        public jU(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static final class lMd {
        public final String lMd;
        public final String zp;

        public lMd(String str, String str2) {
            this.zp = str;
            this.lMd = str2;
        }

        public static lMd zp(String str) throws jU {
            int indexOf = str.indexOf(":");
            if (indexOf != -1) {
                String trim = str.substring(0, indexOf).trim();
                String trim2 = str.substring(indexOf + 1).trim();
                if (trim.length() != 0 && trim2.length() != 0) {
                    return new lMd(trim, trim2);
                }
                throw new jU("request header format error, header: ".concat(str));
            }
            throw new jU("request header format error, header: ".concat(str));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Header{name='");
            sb.append(this.zp);
            sb.append("', value='");
            return AbstractC2914a.h(sb, this.lMd, "'}");
        }
    }

    /* loaded from: classes.dex */
    public static final class zp {
        final int COT;
        final String HWF;
        final String KS;
        final List<String> QR;
        final int jU;
        final String lMd;
        final int zp;

        private zp(int i9, String str, String str2, int i10, int i11, String str3, List<String> list) {
            this.zp = i9;
            this.lMd = str;
            this.KS = str2;
            this.jU = i10;
            this.COT = i11;
            this.HWF = str3;
            this.QR = list;
        }

        public static zp zp(KS ks, List<lMd> list) throws jU {
            String str;
            int i9;
            int i10;
            int indexOf = ks.lMd.indexOf("?");
            if (indexOf != -1) {
                ArrayList arrayList = new ArrayList();
                String str2 = null;
                String str3 = null;
                String str4 = null;
                int i11 = 0;
                for (String str5 : ks.lMd.substring(indexOf + 1).split("&")) {
                    String[] split = str5.split("=");
                    if (split.length == 2) {
                        if ("rk".equals(split[0])) {
                            str3 = Uri.decode(split[1]);
                        } else if (CampaignEx.JSON_KEY_AD_K.equals(split[0])) {
                            str4 = Uri.decode(split[1]);
                        } else if (split[0].startsWith("u")) {
                            arrayList.add(Uri.decode(split[1]));
                        } else if ("f".equals(split[0]) && com.bykv.vk.openvk.component.video.zp.KS.zp.lMd(split[1]) == 1) {
                            i11 = 1;
                        }
                    }
                }
                if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                    if (list != null) {
                        i10 = 0;
                        int i12 = 0;
                        for (lMd lmd : list) {
                            if (lmd != null && Command.HTTP_HEADER_RANGE.equalsIgnoreCase(lmd.zp)) {
                                int indexOf2 = lmd.lMd.indexOf("=");
                                if (indexOf2 != -1) {
                                    if ("bytes".equalsIgnoreCase(lmd.lMd.substring(0, indexOf2).trim())) {
                                        String substring = lmd.lMd.substring(indexOf2 + 1);
                                        if (!substring.contains(",")) {
                                            int indexOf3 = substring.indexOf("-");
                                            if (indexOf3 != -1) {
                                                String trim = substring.substring(0, indexOf3).trim();
                                                String trim2 = substring.substring(indexOf3 + 1).trim();
                                                try {
                                                    if (trim.length() > 0) {
                                                        i10 = Integer.parseInt(trim);
                                                    }
                                                    if (trim2.length() > 0 && i10 > (i12 = Integer.parseInt(trim2))) {
                                                        throw new jU("Range format error, Range: " + lmd.lMd);
                                                    }
                                                    str2 = lmd.lMd;
                                                } catch (NumberFormatException unused) {
                                                    throw new jU("Range format error, Range: " + lmd.lMd);
                                                }
                                            } else {
                                                throw new jU("Range format error, Range: " + lmd.lMd);
                                            }
                                        } else {
                                            throw new jU("Range format error, Range: " + lmd.lMd);
                                        }
                                    } else {
                                        throw new jU("Range format error, Range: " + lmd.lMd);
                                    }
                                } else {
                                    throw new jU("Range format error, Range: " + lmd.lMd);
                                }
                            }
                        }
                        i9 = i12;
                        str = str2;
                    } else {
                        str = null;
                        i9 = 0;
                        i10 = 0;
                    }
                    if (!arrayList.isEmpty()) {
                        return new zp(i11, str3, str4, i10, i9, str, arrayList);
                    }
                    throw new jU("no url found: path: " + ks.lMd);
                }
                throw new jU("rawKey or key is empty, path: " + ks.lMd);
            }
            throw new jU("path format error, path: " + ks.lMd);
        }

        public String toString() {
            return "Extra{flag=" + this.zp + ", rawKey='" + this.lMd + "', key='" + this.KS + "', from=" + this.jU + ", to=" + this.COT + ", urls=" + this.QR + '}';
        }
    }

    public YW(KS ks, List<lMd> list, zp zpVar) {
        this.zp = ks;
        this.lMd = list;
        this.KS = zpVar;
    }

    public static YW zp(InputStream inputStream) throws IOException, jU {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, com.bykv.vk.openvk.component.video.zp.KS.zp.zp));
        ArrayList arrayList = new ArrayList();
        KS ks = null;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (TextUtils.isEmpty(readLine)) {
                break;
            }
            String trim = readLine.trim();
            if (ks == null) {
                ks = KS.zp(trim);
            } else {
                arrayList.add(lMd.zp(trim));
            }
        }
        if (ks != null) {
            return new YW(ks, arrayList, zp.zp(ks, arrayList));
        }
        throw new jU("request line is null");
    }

    public String toString() {
        return "Request{requestLine=" + this.zp + ", headers=" + this.lMd + ", extra=" + this.KS + '}';
    }

    public static String zp(String str, String str2, List<String> list) {
        StringBuilder sb = new StringBuilder(512);
        String str3 = null;
        do {
            if (str3 != null) {
                if (list.size() == 1) {
                    return null;
                }
                list.remove(list.size() - 1);
            }
            str3 = zp(sb, str, str2, list);
        } while (str3.length() > 3072);
        return str3;
    }

    private static String zp(StringBuilder sb, String str, String str2, List<String> list) {
        sb.delete(0, sb.length());
        sb.append("rk=");
        sb.append(Uri.encode(str));
        sb.append("&k=");
        sb.append(Uri.encode(str2));
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            sb.append("&u");
            sb.append(i9);
            sb.append("=");
            sb.append(Uri.encode(list.get(i9)));
        }
        return sb.toString();
    }
}
