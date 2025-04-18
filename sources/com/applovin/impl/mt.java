package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaCodec;
import com.applovin.impl.fm;
import com.applovin.impl.il;
import com.applovin.impl.p9;
import com.applovin.impl.wm;
import com.applovin.impl.y5;

/* loaded from: classes.dex */
public final /* synthetic */ class mt implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25613a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25614b;

    public /* synthetic */ mt(Object obj, int i2) {
        this.f25613a = i2;
        this.f25614b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f25613a;
        Object obj = this.f25614b;
        switch (i2) {
            case 0:
                fm.c.a((fm.c) obj);
                return;
            case 1:
                il.c.b((il) obj);
                return;
            case 2:
                p9.e.a((p9.e) obj);
                return;
            case 3:
                wm.b.a.a((wm.b.a) obj);
                return;
            case 4:
                y5.f.b((y5.f) obj);
                return;
            case 5:
                y5.h.b((x5) obj);
                return;
            case 6:
                bm.e((bm) obj);
                return;
            case 7:
                da.a((da) obj);
                return;
            case 8:
                ((ec) obj).notifyDataSetChanged();
                return;
            case 9:
                f5.c((Context) obj);
                return;
            case 10:
                ((MediaCodec) obj).start();
                return;
            case 11:
                ((hl) obj).c();
                return;
            case 12:
                p9.e((p9) obj);
                return;
            case 13:
                r0.o((r0) obj);
                return;
            case 14:
                rk.c((rk) obj);
                return;
            case 15:
                ((te) obj).notifyDataSetChanged();
                return;
            case 16:
                u0.k((u0) obj);
                return;
            case 17:
                ((o) obj).b();
                return;
            case 18:
                ((SharedPreferences.Editor) obj).commit();
                return;
            case 19:
                vm.e((vm) obj);
                return;
            case 20:
                wm.l((wm) obj);
                return;
            case 21:
                ((x4) obj).notifyDataSetChanged();
                return;
            default:
                xm.h((xm) obj);
                return;
        }
    }
}
