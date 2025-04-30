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
public final /* synthetic */ class F0 implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6389c;

    public /* synthetic */ F0(Object obj, int i9) {
        this.b = i9;
        this.f6389c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                em.c.a((em.c) this.f6389c);
                return;
            case 1:
                fl.c.b((fl) this.f6389c);
                return;
            case 2:
                ((n9.e) this.f6389c).a();
                return;
            case 3:
                vm.b.a.a((vm.b.a) this.f6389c);
                return;
            case 4:
                w5.f.b((w5.f) this.f6389c);
                return;
            case 5:
                w5.h.b((v5) this.f6389c);
                return;
            case 6:
                am.e((am) this.f6389c);
                return;
            case 7:
                ba.a((ba) this.f6389c);
                return;
            case 8:
                d5.c((Context) this.f6389c);
                return;
            case 9:
                ((el) this.f6389c).c();
                return;
            case 10:
                ((MediaCodec) this.f6389c).start();
                return;
            case 11:
                ((oe) this.f6389c).notifyDataSetChanged();
                return;
            case 12:
                ok.c((ok) this.f6389c);
                return;
            case 13:
                C0742r0.N((C0742r0) this.f6389c);
                return;
            case 14:
                rr.a((rr) this.f6389c);
                return;
            case 15:
                ((WebView) this.f6389c).destroy();
                return;
            case 16:
                ((SharedPreferences.Editor) this.f6389c).commit();
                return;
            case 17:
                ((C0730o) this.f6389c).b();
                return;
            case 18:
                um.e((um) this.f6389c);
                return;
            case 19:
                ((v4) this.f6389c).notifyDataSetChanged();
                return;
            case 20:
                vm.l((vm) this.f6389c);
                return;
            case 21:
                wm.h((wm) this.f6389c);
                return;
            default:
                ((zb) this.f6389c).notifyDataSetChanged();
                return;
        }
    }
}
