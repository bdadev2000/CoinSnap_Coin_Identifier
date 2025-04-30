package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.WindowManager;
import com.applovin.impl.sdk.ad.b;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class vg {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f11730a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final int f11731c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f11732d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f11733e;

    public vg(Activity activity) {
        boolean z8;
        this.f11730a = activity;
        int c9 = zp.c(activity);
        this.f11731c = c9;
        boolean isTablet = AppLovinSdkUtils.isTablet(activity);
        this.f11732d = isTablet;
        this.b = a(c9, isTablet);
        if (isTablet && 2 == a(activity)) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f11733e = z8;
    }

    private int a(int i9, boolean z8) {
        if (z8 && this.f11733e) {
            if (i9 == 0) {
                return 0;
            }
            if (i9 == 1) {
                return 9;
            }
            if (i9 == 2) {
                return 8;
            }
            return i9 == 3 ? 1 : -1;
        }
        if (i9 == 0) {
            return 1;
        }
        if (i9 == 1) {
            return 0;
        }
        if (i9 == 2) {
            return 9;
        }
        return i9 == 3 ? 8 : -1;
    }

    private static int a(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        return (((rotation == 0 || rotation == 2) && configuration.orientation == 2) || ((rotation == 1 || rotation == 3) && configuration.orientation == 1)) ? 2 : 1;
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        int i9;
        if (bVar.C0() && (i9 = this.b) != -1) {
            a(i9);
        } else {
            a(bVar.d0());
        }
    }

    private void a(b.c cVar) {
        if (cVar == b.c.ACTIVITY_PORTRAIT) {
            if (this.f11732d && this.f11733e) {
                int i9 = this.f11731c;
                if (i9 != 1 && i9 != 3) {
                    a(1);
                    return;
                } else if (i9 == 1) {
                    a(9);
                    return;
                } else {
                    a(1);
                    return;
                }
            }
            int i10 = this.f11731c;
            if (i10 != 0 && i10 != 2) {
                a(1);
                return;
            } else {
                a(i10 != 0 ? 9 : 1);
                return;
            }
        }
        if (cVar == b.c.ACTIVITY_LANDSCAPE) {
            if (this.f11732d && this.f11733e) {
                int i11 = this.f11731c;
                if (i11 != 0 && i11 != 2) {
                    a(0);
                    return;
                } else {
                    a(i11 != 2 ? 0 : 8);
                    return;
                }
            }
            int i12 = this.f11731c;
            if (i12 != 1 && i12 != 3) {
                a(0);
            } else {
                a(i12 == 1 ? 0 : 8);
            }
        }
    }

    private void a(int i9) {
        try {
            this.f11730a.setRequestedOrientation(i9);
        } catch (Throwable unused) {
        }
    }
}
