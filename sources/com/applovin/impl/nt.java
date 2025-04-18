package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaCodec;
import android.webkit.WebView;
import com.applovin.impl.em;
import com.applovin.impl.fl;
import com.applovin.impl.n9;
import com.applovin.impl.vm;
import com.applovin.impl.w5;

/* loaded from: classes.dex */
public final /* synthetic */ class nt implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6439b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6440c;

    public /* synthetic */ nt(Object obj, int i10) {
        this.f6439b = i10;
        this.f6440c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f6439b;
        Object obj = this.f6440c;
        switch (i10) {
            case 0:
                em.c.a((em.c) obj);
                return;
            case 1:
                fl.c.b((fl) obj);
                return;
            case 2:
                ((n9.e) obj).a();
                return;
            case 3:
                vm.b.a.a((vm.b.a) obj);
                return;
            case 4:
                w5.f.b((w5.f) obj);
                return;
            case 5:
                w5.h.b((v5) obj);
                return;
            case 6:
                am.e((am) obj);
                return;
            case 7:
                ba.a((ba) obj);
                return;
            case 8:
                d5.c((Context) obj);
                return;
            case 9:
                ((el) obj).c();
                return;
            case 10:
                ((MediaCodec) obj).start();
                return;
            case 11:
                ((oe) obj).notifyDataSetChanged();
                return;
            case 12:
                ok.c((ok) obj);
                return;
            case 13:
                r0.p((r0) obj);
                return;
            case 14:
                rr.d((rr) obj);
                return;
            case 15:
                ((WebView) obj).destroy();
                return;
            case 16:
                ((SharedPreferences.Editor) obj).commit();
                return;
            case 17:
                ((o) obj).b();
                return;
            case 18:
                um.e((um) obj);
                return;
            case 19:
                ((v4) obj).notifyDataSetChanged();
                return;
            case 20:
                vm.l((vm) obj);
                return;
            case 21:
                wm.h((wm) obj);
                return;
            default:
                ((zb) obj).notifyDataSetChanged();
                return;
        }
    }
}
