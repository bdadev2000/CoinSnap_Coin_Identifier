package jd;

import android.app.UiModeManager;
import android.content.Context;
import android.content.IntentFilter;
import android.view.WindowManager;
import com.bumptech.glide.e;
import com.facebook.internal.i;
import h.c0;
import java.lang.ref.WeakReference;
import nd.h;
import qd.d;

/* loaded from: classes4.dex */
public final class b {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f20012b;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    public final void a(Context context) {
        boolean z10;
        boolean z11;
        int i10 = this.a;
        int i11 = 1;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        i.a(context, "Application Context cannot be null");
                        break;
                    default:
                        e.c(context, "Application Context cannot be null");
                        break;
                }
                if (!b()) {
                    switch (i10) {
                        case 0:
                            this.f20012b = true;
                            break;
                        default:
                            this.f20012b = true;
                            break;
                    }
                    h.d().b(context);
                    nd.b.f22726g.a(context);
                    if (context != null) {
                        x5.i.f27399c = (UiModeManager) context.getSystemService("uimode");
                    }
                    WindowManager windowManager = qd.c.a;
                    if (context != null) {
                        qd.c.f23896c = context.getResources().getDisplayMetrics().density;
                        qd.c.a = (WindowManager) context.getSystemService("window");
                    }
                    context.registerReceiver(new d(0), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
                    j.a.f19652c.f19654b = context.getApplicationContext();
                    nd.a aVar = nd.a.f22721f;
                    if (!aVar.f22723c) {
                        nd.e eVar = aVar.f22724d;
                        eVar.a(context);
                        eVar.f22732f = aVar;
                        eVar.g();
                        switch (eVar.f22729b) {
                            case 0:
                                z11 = eVar.f22731d;
                                break;
                            default:
                                z11 = eVar.f22731d;
                                break;
                        }
                        aVar.f22725e = z11;
                        aVar.f22723c = true;
                    }
                    nd.i iVar = nd.i.f22744d;
                    iVar.a = new WeakReference(context);
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                    context.registerReceiver(new c0(iVar, 10), intentFilter);
                    return;
                }
                return;
            default:
                switch (i10) {
                    case 0:
                        i.a(context, "Application Context cannot be null");
                        break;
                    default:
                        e.c(context, "Application Context cannot be null");
                        break;
                }
                if (!b()) {
                    switch (i10) {
                        case 0:
                            this.f20012b = true;
                            break;
                        default:
                            this.f20012b = true;
                            break;
                    }
                    h.e().b(context);
                    wd.b.f26968g.a(context);
                    if (context != null) {
                        e.f9647n = (UiModeManager) context.getSystemService("uimode");
                    }
                    WindowManager windowManager2 = zd.b.a;
                    if (context != null) {
                        zd.b.f28745c = context.getResources().getDisplayMetrics().density;
                        zd.b.a = (WindowManager) context.getSystemService("window");
                    }
                    context.registerReceiver(new d(i11), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
                    j.a.f19653d.f19654b = context.getApplicationContext();
                    wd.a aVar2 = wd.a.f26963f;
                    if (!aVar2.f26965c) {
                        nd.e eVar2 = aVar2.f26966d;
                        eVar2.a(context);
                        eVar2.f22732f = aVar2;
                        eVar2.g();
                        switch (eVar2.f22729b) {
                            case 0:
                                z10 = eVar2.f22731d;
                                break;
                            default:
                                z10 = eVar2.f22731d;
                                break;
                        }
                        aVar2.f26967e = z10;
                        aVar2.f26965c = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final boolean b() {
        switch (this.a) {
            case 0:
                return this.f20012b;
            default:
                return this.f20012b;
        }
    }
}
