package com.instagram.common.viewpoint.core;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import okio.Utf8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Gf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0551Gf extends AbstractC1222cm {
    public static byte[] A04;
    public static String[] A05 = {"b4EbQiKGBOPn48tIsiPL5n4N5SxNZ1EN", "C4qAvqPXqcx1", "av0PnThHX1ufh2ncI3f6iPLWfGZcgSDj", "l1hdtvJdt41N", "aFghpyqA523JYmrsO", "P4eeegJbz09MXnMZrJhy5IVHeFKKR7Ef", "fwPno9KqPJ0g1dx57vycq8IipA21WGGJ", "Ava7qu9S1KN"};
    public static final String A06;
    public LL A00;
    public final Uri A01;
    public final C1T A02;
    public final Map<String, String> A03;

    public static String A04(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 41);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private final List<Intent> A06() {
        List<C01760m> A052 = A05();
        ArrayList arrayList = new ArrayList();
        if (A052 != null) {
            Iterator<C01760m> it = A052.iterator();
            while (it.hasNext()) {
                Intent A00 = A00(it.next());
                if (A00 != null) {
                    arrayList.add(A00);
                }
            }
        }
        return arrayList;
    }

    public static void A07() {
        A04 = new byte[]{88, 111, 111, 114, 111, 61, 109, 124, 111, 110, 116, 115, 122, 61, 124, 109, 109, 110, 116, 105, 120, 66, 121, 124, 105, 124, 51, 20, 28, 25, 16, 17, 85, 1, 26, 85, 26, 5, 16, 27, 85, 24, 20, 7, 30, 16, 1, 85, 0, 7, 25, 79, 85, 51, 53, 8, 7, 13, 27, 6, 0, 13, Utf8.REPLACEMENT_BYTE, 48, 58, 44, 49, 55, 58, 112, 55, 48, 42, 59, 48, 42, 112, Utf8.REPLACEMENT_BYTE, 61, 42, 55, 49, 48, 112, 26, 23, 31, 18, 5, 10, 0, 22, 11, 13, 0, 74, 13, 10, 16, 1, 10, 16, 74, 5, 7, 16, 13, 11, 10, 74, 50, 45, 33, 51, 34, 51, 51, 48, 42, 55, 38, 28, 39, 34, 55, 34, 79, 64, 69, 79, 71, 115, 95, 67, 89, 94, 79, 73, 25, 21, 6, 31, 17, 0, 78, 91, 91, 16, 17, 0, 21, 29, 24, 7, 75, 29, 16, 73, 81, 7, 125, 98, 119, 124, 119, 118, 77, 118, 119, 119, 98, 126, 123, 124, 121, 123, 100, 113, 122, 113, 112, 75, 103, 96, 123, 102, 113, 75, 114, 117, 120, 120, 118, 117, 119, Byte.MAX_VALUE, 75, 97, 102, 120, 123, 100, 113, 122, 113, 112, 75, 103, 96, 123, 102, 113, 75, 97, 102, 120, 82, 67, 80, 81, 75, 76, 69, 56, Utf8.REPLACEMENT_BYTE, 36, 57, 46, 20, 34, 47, 81, 86, 77, 80, 71, 125, 87, 80, 78, 60, 59, 32, 61, 42, 16, 58, 61, 35, 16, 56, 42, 45, 16, 41, 46, 35, 35, 45, 46, 44, 36, 23, 6, 15, 89, 24, 9, 0, 28, 30, 3, 1, 28, 24, 86, 1, 7, 17, 6, 23, 24, 29, 23, 31};
    }

    static {
        A07();
        A06 = C0551Gf.class.getSimpleName();
    }

    public C0551Gf(C1045Zs c1045Zs, J7 j7, String str, Uri uri, Map<String, String> extraData, C01770o c01770o, boolean z2, C1T c1t) {
        super(c1045Zs, j7, str, c01770o, z2);
        this.A01 = uri;
        this.A03 = extraData;
        this.A02 = c1t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r3.startsWith(r0) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.content.Intent A00(com.instagram.common.viewpoint.core.C01760m r12) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C0551Gf.A00(com.facebook.ads.redexgen.X.0m):android.content.Intent");
    }

    private Intent A01(C01760m c01760m) {
        Intent intent = new Intent(A04(88, 26, 77));
        intent.addFlags(268435456);
        if (!TextUtils.isEmpty(c01760m.A05()) && !TextUtils.isEmpty(c01760m.A04())) {
            intent.setComponent(new ComponentName(c01760m.A05(), c01760m.A04()));
        }
        if (!TextUtils.isEmpty(c01760m.A03())) {
            intent.setData(L5.A00(c01760m.A03()));
        }
        return intent;
    }

    private final Uri A02() {
        String queryParameter = this.A01.getQueryParameter(A04(231, 9, 11));
        if (!TextUtils.isEmpty(queryParameter)) {
            return L5.A00(queryParameter);
        }
        Uri uri = this.A01;
        String storeUrl = A04(223, 8, 98);
        String storeId = uri.getQueryParameter(storeUrl);
        Locale locale = Locale.US;
        Object[] objArr = {storeId};
        String storeUrl2 = A04(Opcodes.L2D, 22, 93);
        return L5.A00(String.format(locale, storeUrl2, objArr));
    }

    private EnumC01700g A03() throws C0657Ko {
        L2 l2 = new L2();
        try {
            return L2.A05(l2, ((AbstractC01710h) this).A00, A02(), ((AbstractC01710h) this).A02, this.A03);
        } catch (C0657Ko unused) {
            String str = A04(26, 27, 92) + this.A01.toString();
            String queryParameter = this.A01.getQueryParameter(A04(240, 22, 102));
            if (queryParameter != null && queryParameter.length() > 0) {
                L2.A0D(l2, ((AbstractC01710h) this).A00, L5.A00(queryParameter), ((AbstractC01710h) this).A02);
            }
            return EnumC01700g.A09;
        }
    }

    private List<C01760m> A05() {
        String queryParameter = this.A01.getQueryParameter(A04(Opcodes.FREM, 12, 106));
        if (TextUtils.isEmpty(queryParameter)) {
            return null;
        }
        String appsiteDataString = A04(53, 2, 65);
        if (appsiteDataString.equals(queryParameter)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(queryParameter);
            String appsiteDataString2 = A04(55, 7, 64);
            JSONArray optJSONArray = jSONObject.optJSONArray(appsiteDataString2);
            if (optJSONArray != null) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    C01760m A00 = C01760m.A00(optJSONArray.optJSONObject(i2));
                    if (A00 != null) {
                        arrayList.add(A00);
                    }
                }
            }
        } catch (JSONException e) {
            C8D A07 = ((AbstractC01710h) this).A00.A07();
            int i3 = C8E.A24;
            C8F c8f = new C8F(e);
            String appsiteDataString3 = A04(216, 7, 11);
            A07.AA0(appsiteDataString3, i3, c8f);
            String str = A06;
            String appsiteDataString4 = A04(0, 26, 52);
            Log.w(str, appsiteDataString4, e);
        }
        return arrayList;
    }

    private boolean A08() {
        List<Intent> appLaunchIntents = A06();
        if (appLaunchIntents == null) {
            return false;
        }
        Iterator<Intent> it = appLaunchIntents.iterator();
        while (it.hasNext()) {
            if (C0659Kq.A0C(((AbstractC01710h) this).A00, it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean A09(C1045Zs c1045Zs, String str) {
        return Build.VERSION.SDK_INT >= 30 && str != null && C0608Im.A1z(c1045Zs);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1222cm
    public final EnumC01700g A0D() {
        EnumC01700g enumC01700g = EnumC01700g.A09;
        if (((AbstractC1222cm) this).A02) {
            enumC01700g = A0G();
        } else {
            this.A03.put(A04(200, 16, 61), String.valueOf(true));
        }
        C1045Zs c1045Zs = ((AbstractC01710h) this).A00;
        if (A05[2].charAt(5) != 'T') {
            throw new RuntimeException();
        }
        A05[4] = "kOq5WVrOOgnK8qBpA";
        if (!M3.A0g(c1045Zs, enumC01700g, this.A03)) {
            A0E(this.A03, enumC01700g);
            C1T.A06(this.A02, ((AbstractC01710h) this).A00);
        } else {
            EnumC01700g actionOutcome = EnumC01700g.A08;
            if (enumC01700g != actionOutcome && this.A00 != null) {
                String str = this.A03.get(A04(126, 12, 5));
                if (A04(276, 9, 93) == str) {
                    this.A00.A0C(str, this.A02, ((AbstractC01710h) this).A02);
                } else {
                    this.A00.A0D(str, this.A02, ((AbstractC01710h) this).A02);
                }
            }
        }
        return enumC01700g;
    }

    public final EnumC01700g A0G() {
        EnumC01700g enumC01700g = EnumC01700g.A09;
        String A042 = A04(Opcodes.IF_ICMPNE, 15, 59);
        boolean A0F = A0F(this.A01);
        if (!A0F) {
            A0F = A08();
        }
        if (!A0F) {
            try {
                enumC01700g = A03();
                if (enumC01700g != EnumC01700g.A09) {
                    A042 = A04(200, 16, 61);
                } else {
                    A042 = A04(Opcodes.DRETURN, 25, 61);
                }
            } catch (Exception unused) {
                enumC01700g = EnumC01700g.A04;
            }
        }
        Map<String, String> map = this.A03;
        String redirectionAction = String.valueOf(true);
        map.put(A042, redirectionAction);
        return enumC01700g;
    }

    public final void A0H(LL ll) {
        this.A00 = ll;
    }
}
