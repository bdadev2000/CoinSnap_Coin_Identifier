package com.mbridge.msdk.mbbid.out;

import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.z;

/* loaded from: classes4.dex */
public class SplashBidRequestParams extends BannerBidRequestParams {

    /* renamed from: b, reason: collision with root package name */
    private static int f13922b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static int f13923c;

    /* renamed from: d, reason: collision with root package name */
    private static int f13924d;
    private boolean a;

    public SplashBidRequestParams(String str, String str2) {
        this(str, str2, "");
    }

    public final boolean a() {
        return this.a;
    }

    public int getOrientation() {
        return f13922b;
    }

    public SplashBidRequestParams(String str, String str2, String str3) {
        this(str, str2, str3, false, f13922b, f13924d, f13923c);
    }

    public SplashBidRequestParams(String str, String str2, boolean z10, int i10, int i11, int i12) {
        this(str, str2, "", z10, i10, i12, i11);
    }

    public SplashBidRequestParams(String str, String str2, String str3, boolean z10, int i10, int i11, int i12) {
        super(str, str2, str3, 0, 0);
        this.a = false;
        f13922b = i10;
        int i13 = z.i(c.m().c());
        int g10 = z.g(c.m().c());
        int i14 = f13922b;
        if (i14 == 1) {
            if (g10 > i12 * 4) {
                setHeight(g10 - i12);
                setWidth(i13);
            } else {
                setHeight(0);
                setWidth(0);
            }
        } else if (i14 == 2) {
            if (i13 > i11 * 4) {
                setWidth(i13 - i11);
                setHeight(g10);
            } else {
                setHeight(0);
                setWidth(0);
            }
        }
        this.a = z10;
    }
}
