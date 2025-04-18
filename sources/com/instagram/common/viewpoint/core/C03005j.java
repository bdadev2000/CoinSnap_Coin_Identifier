package com.instagram.common.viewpoint.core;

import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Window;
import com.facebook.ads.AudienceNetworkActivity;

/* renamed from: com.facebook.ads.redexgen.X.5j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03005j {
    public final AudienceNetworkActivity A00;
    public final C1045Zs A01;

    public C03005j(C1045Zs c1045Zs, AudienceNetworkActivity audienceNetworkActivity) {
        this.A01 = c1045Zs;
        this.A00 = audienceNetworkActivity;
    }

    private int A00() {
        Rect rect = new Rect();
        Window window = this.A00.getWindow();
        if (window == null) {
            return 2;
        }
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        if (rect.top < 200 && rect.left < 200) {
            return 1;
        }
        return 0;
    }

    public final void A01() {
        if ((this.A01.A0G().A01() || C0608Im.A1v(this.A01)) && Build.VERSION.SDK_INT >= 24) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.5i
                @Override // java.lang.Runnable
                public final void run() {
                    C03005j.this.A02();
                }
            }, 1000L);
        }
    }

    public final /* synthetic */ void A02() {
        if (this.A00.isInMultiWindowMode()) {
            this.A01.A0E().AAW(A00());
        }
    }
}
