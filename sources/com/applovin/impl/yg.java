package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.WindowManager;
import com.applovin.impl.sdk.ad.b;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes4.dex */
public class yg {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f28200a;

    /* renamed from: b, reason: collision with root package name */
    private final int f28201b;

    /* renamed from: c, reason: collision with root package name */
    private final int f28202c;
    private final boolean d;
    private final boolean e;

    public yg(Activity activity) {
        this.f28200a = activity;
        int c2 = yp.c(activity);
        this.f28202c = c2;
        boolean isTablet = AppLovinSdkUtils.isTablet(activity);
        this.d = isTablet;
        this.f28201b = a(c2, isTablet);
        this.e = isTablet && 2 == a(activity);
    }

    private int a(int i2, boolean z2) {
        if (z2 && this.e) {
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 1) {
                return 9;
            }
            if (i2 == 2) {
                return 8;
            }
            return i2 == 3 ? 1 : -1;
        }
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 9;
        }
        return i2 == 3 ? 8 : -1;
    }

    private static int a(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        return (((rotation == 0 || rotation == 2) && configuration.orientation == 2) || ((rotation == 1 || rotation == 3) && configuration.orientation == 1)) ? 2 : 1;
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        int i2;
        if (bVar.E0() && (i2 = this.f28201b) != -1) {
            a(i2);
        } else {
            a(bVar.e0());
        }
    }

    private void a(b.c cVar) {
        if (cVar != b.c.ACTIVITY_PORTRAIT) {
            if (cVar == b.c.ACTIVITY_LANDSCAPE) {
                if (this.d && this.e) {
                    int i2 = this.f28202c;
                    if (i2 != 0 && i2 != 2) {
                        a(0);
                        return;
                    } else {
                        a(i2 != 2 ? 0 : 8);
                        return;
                    }
                }
                int i3 = this.f28202c;
                if (i3 != 1 && i3 != 3) {
                    a(0);
                    return;
                } else {
                    a(i3 == 1 ? 0 : 8);
                    return;
                }
            }
            return;
        }
        if (!this.d || !this.e) {
            int i4 = this.f28202c;
            if (i4 != 0 && i4 != 2) {
                a(1);
                return;
            } else {
                a(i4 != 0 ? 9 : 1);
                return;
            }
        }
        int i5 = this.f28202c;
        if (i5 != 1 && i5 != 3) {
            a(1);
        } else if (i5 == 1) {
            a(9);
        } else {
            a(1);
        }
    }

    private void a(int i2) {
        try {
            this.f28200a.setRequestedOrientation(i2);
        } catch (Throwable unused) {
        }
    }
}
