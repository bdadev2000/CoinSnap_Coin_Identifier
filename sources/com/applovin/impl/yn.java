package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.regex.Pattern;
import kotlinx.coroutines.DebugKt;

/* loaded from: classes.dex */
final class yn {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f9246d = Pattern.compile("\\s+");

    /* renamed from: e, reason: collision with root package name */
    private static final eb f9247e = eb.a(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "none");

    /* renamed from: f, reason: collision with root package name */
    private static final eb f9248f = eb.a("dot", "sesame", "circle");

    /* renamed from: g, reason: collision with root package name */
    private static final eb f9249g = eb.a("filled", com.vungle.ads.internal.presenter.q.OPEN);

    /* renamed from: h, reason: collision with root package name */
    private static final eb f9250h = eb.a("after", "before", "outside");
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9251b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9252c;

    private yn(int i10, int i11, int i12) {
        this.a = i10;
        this.f9251b = i11;
        this.f9252c = i12;
    }

    public static yn a(String str) {
        if (str == null) {
            return null;
        }
        String lowerCase = Ascii.toLowerCase(str.trim());
        if (lowerCase.isEmpty()) {
            return null;
        }
        return a(eb.a((Object[]) TextUtils.split(lowerCase, f9246d)));
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
    private static com.applovin.impl.yn a(com.applovin.impl.eb r9) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.yn.a(com.applovin.impl.eb):com.applovin.impl.yn");
    }
}
