package com.mbridge.msdk.mbbid.out;

import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.z;

/* loaded from: classes3.dex */
public class SplashBidRequestParams extends BannerBidRequestParams {
    private static int b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static int f16401c;

    /* renamed from: d, reason: collision with root package name */
    private static int f16402d;

    /* renamed from: a, reason: collision with root package name */
    private boolean f16403a;

    public SplashBidRequestParams(String str, String str2) {
        this(str, str2, "");
    }

    public final boolean a() {
        return this.f16403a;
    }

    public int getOrientation() {
        return b;
    }

    public SplashBidRequestParams(String str, String str2, String str3) {
        this(str, str2, str3, false, b, f16402d, f16401c);
    }

    public SplashBidRequestParams(String str, String str2, boolean z8, int i9, int i10, int i11) {
        this(str, str2, "", z8, i9, i11, i10);
    }

    public SplashBidRequestParams(String str, String str2, String str3, boolean z8, int i9, int i10, int i11) {
        super(str, str2, str3, 0, 0);
        this.f16403a = false;
        b = i9;
        int i12 = z.i(c.m().c());
        int g9 = z.g(c.m().c());
        int i13 = b;
        if (i13 == 1) {
            if (g9 > i11 * 4) {
                setHeight(g9 - i11);
                setWidth(i12);
            } else {
                setHeight(0);
                setWidth(0);
            }
        } else if (i13 == 2) {
            if (i12 > i10 * 4) {
                setWidth(i12 - i10);
                setHeight(g9);
            } else {
                setHeight(0);
                setWidth(0);
            }
        }
        this.f16403a = z8;
    }
}
