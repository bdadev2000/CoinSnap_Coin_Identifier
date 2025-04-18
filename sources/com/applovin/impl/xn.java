package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.appevents.integrity.IntegrityManager;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
final class xn {
    private static final Pattern d = Pattern.compile("\\s+");
    private static final ib e = ib.a("auto", IntegrityManager.INTEGRITY_TYPE_NONE);

    /* renamed from: f, reason: collision with root package name */
    private static final ib f27956f = ib.a("dot", "sesame", "circle");

    /* renamed from: g, reason: collision with root package name */
    private static final ib f27957g = ib.a("filled", "open");

    /* renamed from: h, reason: collision with root package name */
    private static final ib f27958h = ib.a("after", "before", "outside");

    /* renamed from: a, reason: collision with root package name */
    public final int f27959a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27960b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27961c;

    private xn(int i2, int i3, int i4) {
        this.f27959a = i2;
        this.f27960b = i3;
        this.f27961c = i4;
    }

    public static xn a(String str) {
        if (str == null) {
            return null;
        }
        String lowerCase = Ascii.toLowerCase(str.trim());
        if (lowerCase.isEmpty()) {
            return null;
        }
        return a(ib.a((Object[]) TextUtils.split(lowerCase, d)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00eb, code lost:
    
        if (r9.equals("dot") != false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.applovin.impl.xn a(com.applovin.impl.ib r9) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.xn.a(com.applovin.impl.ib):com.applovin.impl.xn");
    }
}
