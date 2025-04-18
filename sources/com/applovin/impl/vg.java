package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.WindowManager;
import com.applovin.impl.sdk.ad.b;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class vg {
    private final Activity a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8508b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8509c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f8510d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f8511e;

    public vg(Activity activity) {
        boolean z10;
        this.a = activity;
        int c10 = zp.c(activity);
        this.f8509c = c10;
        boolean isTablet = AppLovinSdkUtils.isTablet(activity);
        this.f8510d = isTablet;
        this.f8508b = a(c10, isTablet);
        if (isTablet && 2 == a(activity)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f8511e = z10;
    }

    private int a(int i10, boolean z10) {
        if (z10 && this.f8511e) {
            if (i10 == 0) {
                return 0;
            }
            if (i10 == 1) {
                return 9;
            }
            if (i10 == 2) {
                return 8;
            }
            return i10 == 3 ? 1 : -1;
        }
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 9;
        }
        return i10 == 3 ? 8 : -1;
    }

    private static int a(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        return (((rotation == 0 || rotation == 2) && configuration.orientation == 2) || ((rotation == 1 || rotation == 3) && configuration.orientation == 1)) ? 2 : 1;
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        int i10;
        if (bVar.C0() && (i10 = this.f8508b) != -1) {
            a(i10);
        } else {
            a(bVar.d0());
        }
    }

    private void a(b.c cVar) {
        if (cVar == b.c.ACTIVITY_PORTRAIT) {
            if (this.f8510d && this.f8511e) {
                int i10 = this.f8509c;
                if (i10 != 1 && i10 != 3) {
                    a(1);
                    return;
                } else if (i10 == 1) {
                    a(9);
                    return;
                } else {
                    a(1);
                    return;
                }
            }
            int i11 = this.f8509c;
            if (i11 != 0 && i11 != 2) {
                a(1);
                return;
            } else {
                a(i11 != 0 ? 9 : 1);
                return;
            }
        }
        if (cVar == b.c.ACTIVITY_LANDSCAPE) {
            if (this.f8510d && this.f8511e) {
                int i12 = this.f8509c;
                if (i12 != 0 && i12 != 2) {
                    a(0);
                    return;
                } else {
                    a(i12 != 2 ? 0 : 8);
                    return;
                }
            }
            int i13 = this.f8509c;
            if (i13 != 1 && i13 != 3) {
                a(0);
            } else {
                a(i13 == 1 ? 0 : 8);
            }
        }
    }

    private void a(int i10) {
        try {
            this.a.setRequestedOrientation(i10);
        } catch (Throwable unused) {
        }
    }
}
