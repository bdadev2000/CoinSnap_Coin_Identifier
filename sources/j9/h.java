package j9;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n9.o;
import n9.x;

/* loaded from: classes3.dex */
public abstract class h {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f19854b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Map f19855c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f19856d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f19855c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f19856d = Collections.unmodifiableMap(hashMap2);
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, e eVar, String str, List list, List list2) {
        char c10;
        char c11;
        char c12;
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        int i13 = eVar.f19839b;
        int length = spannableStringBuilder.length();
        String str2 = eVar.a;
        str2.getClass();
        int hashCode = str2.hashCode();
        int i14 = -1;
        if (hashCode != 0) {
            if (hashCode != 105) {
                if (hashCode != 3314158) {
                    if (hashCode != 3511770) {
                        if (hashCode != 98) {
                            if (hashCode != 99) {
                                if (hashCode != 117) {
                                    if (hashCode == 118 && str2.equals("v")) {
                                        c10 = 5;
                                    }
                                    c10 = 65535;
                                } else {
                                    if (str2.equals("u")) {
                                        c10 = 4;
                                    }
                                    c10 = 65535;
                                }
                            } else {
                                if (str2.equals(com.mbridge.msdk.foundation.controller.a.a)) {
                                    c10 = 2;
                                }
                                c10 = 65535;
                            }
                        } else {
                            if (str2.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)) {
                                c10 = 1;
                            }
                            c10 = 65535;
                        }
                    } else {
                        if (str2.equals("ruby")) {
                            c10 = 7;
                        }
                        c10 = 65535;
                    }
                } else {
                    if (str2.equals("lang")) {
                        c10 = 6;
                    }
                    c10 = 65535;
                }
            } else {
                if (str2.equals(com.mbridge.msdk.foundation.same.report.i.a)) {
                    c10 = 3;
                }
                c10 = 65535;
            }
        } else {
            if (str2.equals("")) {
                c10 = 0;
            }
            c10 = 65535;
        }
        switch (c10) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                com.applovin.impl.mediation.ads.e.k(1, spannableStringBuilder, i13, length, 33);
                break;
            case 2:
                for (String str3 : eVar.f19841d) {
                    Map map = f19855c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i13, length, 33);
                    } else {
                        Map map2 = f19856d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i13, length, 33);
                        }
                    }
                }
                break;
            case 3:
                com.applovin.impl.mediation.ads.e.k(2, spannableStringBuilder, i13, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i13, length, 33);
                break;
            case 7:
                int c13 = c(list2, str, eVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, d.f19837c);
                int i15 = eVar.f19839b;
                int i16 = 0;
                int i17 = 0;
                while (i16 < arrayList.size()) {
                    if ("rt".equals(((d) arrayList.get(i16)).a.a)) {
                        d dVar = (d) arrayList.get(i16);
                        int c14 = c(list2, str, dVar.a);
                        if (c14 == i14) {
                            if (c13 != i14) {
                                c14 = c13;
                            } else {
                                c14 = 1;
                            }
                        }
                        int i18 = dVar.a.f19839b - i17;
                        int i19 = dVar.f19838b - i17;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i18, i19);
                        spannableStringBuilder.delete(i18, i19);
                        spannableStringBuilder.setSpan(new e9.c(subSequence.toString(), c14), i15, i18, 33);
                        i17 = subSequence.length() + i17;
                        i15 = i18;
                    }
                    i16++;
                    i14 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList b3 = b(list2, str, eVar);
        for (int i20 = 0; i20 < b3.size(); i20++) {
            b bVar = ((f) b3.get(i20)).f19843c;
            if (bVar != null) {
                int i21 = bVar.f19829l;
                if (i21 == -1 && bVar.f19830m == -1) {
                    i10 = -1;
                } else {
                    if (i21 == 1) {
                        c11 = 1;
                    } else {
                        c11 = 0;
                    }
                    if (bVar.f19830m == 1) {
                        c12 = 2;
                    } else {
                        c12 = 0;
                    }
                    i10 = c11 | c12;
                }
                int i22 = -1;
                if (i10 != -1) {
                    int i23 = bVar.f19829l;
                    if (i23 != -1 || bVar.f19830m != -1) {
                        if (i23 == 1) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        if (bVar.f19830m == 1) {
                            i12 = 2;
                        } else {
                            i12 = 0;
                        }
                        i22 = i12 | i11;
                    }
                    com.bumptech.glide.d.b(spannableStringBuilder, new StyleSpan(i22), i13, length);
                }
                if (bVar.f19827j == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    spannableStringBuilder.setSpan(new StrikethroughSpan(), i13, length, 33);
                }
                if (bVar.f19828k == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i13, length, 33);
                }
                if (bVar.f19824g) {
                    if (bVar.f19824g) {
                        com.bumptech.glide.d.b(spannableStringBuilder, new ForegroundColorSpan(bVar.f19823f), i13, length);
                    } else {
                        throw new IllegalStateException("Font color not defined");
                    }
                }
                if (bVar.f19826i) {
                    if (bVar.f19826i) {
                        com.bumptech.glide.d.b(spannableStringBuilder, new BackgroundColorSpan(bVar.f19825h), i13, length);
                    } else {
                        throw new IllegalStateException("Background color not defined.");
                    }
                }
                if (bVar.f19822e != null) {
                    com.bumptech.glide.d.b(spannableStringBuilder, new TypefaceSpan(bVar.f19822e), i13, length);
                }
                int i24 = bVar.f19831n;
                if (i24 != 1) {
                    if (i24 != 2) {
                        if (i24 == 3) {
                            com.bumptech.glide.d.b(spannableStringBuilder, new RelativeSizeSpan(bVar.f19832o / 100.0f), i13, length);
                        }
                    } else {
                        com.bumptech.glide.d.b(spannableStringBuilder, new RelativeSizeSpan(bVar.f19832o), i13, length);
                    }
                } else {
                    com.bumptech.glide.d.b(spannableStringBuilder, new AbsoluteSizeSpan((int) bVar.f19832o, true), i13, length);
                }
                if (bVar.f19834q) {
                    spannableStringBuilder.setSpan(new e9.a(), i13, length, 33);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b(List list, String str, e eVar) {
        int i10;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            b bVar = (b) list.get(i11);
            String str2 = eVar.a;
            if (bVar.a.isEmpty() && bVar.f19819b.isEmpty() && bVar.f19820c.isEmpty() && bVar.f19821d.isEmpty()) {
                i10 = TextUtils.isEmpty(str2);
            } else {
                int a10 = b.a(b.a(b.a(0, bVar.a, str, 1073741824), bVar.f19819b, str2, 2), bVar.f19821d, eVar.f19840c, 4);
                if (a10 != -1) {
                    if (eVar.f19841d.containsAll(bVar.f19820c)) {
                        i10 = a10 + (bVar.f19820c.size() * 4);
                    }
                }
                i10 = 0;
            }
            if (i10 > 0) {
                arrayList.add(new f(i10, bVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, e eVar) {
        ArrayList b3 = b(list, str, eVar);
        for (int i10 = 0; i10 < b3.size(); i10++) {
            int i11 = ((f) b3.get(i10)).f19843c.f19833p;
            if (i11 != -1) {
                return i11;
            }
        }
        return -1;
    }

    public static c d(String str, Matcher matcher, x xVar, ArrayList arrayList) {
        g gVar = new g();
        try {
            String group = matcher.group(1);
            group.getClass();
            gVar.a = j.b(group);
            String group2 = matcher.group(2);
            group2.getClass();
            gVar.f19844b = j.b(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            e(group3, gVar);
            StringBuilder sb2 = new StringBuilder();
            String g10 = xVar.g();
            while (!TextUtils.isEmpty(g10)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(g10.trim());
                g10 = xVar.g();
            }
            gVar.f19845c = f(str, sb2.toString(), arrayList);
            return new c(gVar.a().a(), gVar.a, gVar.f19844b);
        } catch (NumberFormatException unused) {
            o.f("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0099, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c6, code lost:
    
        if (r7.equals("start") == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0084, code lost:
    
        switch(r15) {
            case 0: goto L45;
            case 1: goto L45;
            case 2: goto L44;
            case 3: goto L43;
            case 4: goto L42;
            case 5: goto L41;
            default: goto L40;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0087, code lost:
    
        n9.o.f("WebvttCueParser", "Invalid alignment value: ".concat(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0091, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x009a, code lost:
    
        r19.f19846d = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0093, code lost:
    
        r3 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0095, code lost:
    
        r3 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0097, code lost:
    
        r3 = 3;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:47:0x00f9. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(java.lang.String r18, j9.g r19) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.h.e(java.lang.String, j9.g):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01f3, code lost:
    
        switch(r13) {
            case 0: goto L140;
            case 1: goto L139;
            case 2: goto L138;
            case 3: goto L137;
            default: goto L136;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01f6, code lost:
    
        n9.o.f("WebvttCueParser", "ignoring unsupported entity: '&" + r7 + ";'");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x021e, code lost:
    
        if (r9 != r12) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0220, code lost:
    
        r3.append((java.lang.CharSequence) " ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0223, code lost:
    
        r7 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x020f, code lost:
    
        r3.append(' ');
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0213, code lost:
    
        r3.append(kotlin.text.Typography.amp);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0217, code lost:
    
        r3.append(kotlin.text.Typography.less);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x021b, code lost:
    
        r3.append(kotlin.text.Typography.greater);
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.text.SpannedString f(java.lang.String r16, java.lang.String r17, java.util.List r18) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.h.f(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static void g(String str, g gVar) {
        int indexOf = str.indexOf(44);
        char c10 = 65535;
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            substring.getClass();
            int i10 = 2;
            switch (substring.hashCode()) {
                case -1364013995:
                    if (substring.equals(TtmlNode.CENTER)) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1074341483:
                    if (substring.equals("middle")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (substring.equals(TtmlNode.END)) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 109757538:
                    if (substring.equals("start")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                case 1:
                    i10 = 1;
                    break;
                case 2:
                    break;
                case 3:
                    i10 = 0;
                    break;
                default:
                    o.f("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                    i10 = Integer.MIN_VALUE;
                    break;
            }
            gVar.f19849g = i10;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            gVar.f19847e = j.a(str);
            gVar.f19848f = 0;
        } else {
            gVar.f19847e = Integer.parseInt(str);
            gVar.f19848f = 1;
        }
    }
}
