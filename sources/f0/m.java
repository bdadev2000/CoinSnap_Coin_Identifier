package f0;

import android.view.View;
import com.applovin.impl.sdk.f;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17529b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17530c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17531d;

    public /* synthetic */ m(int i10, int i11, Object obj) {
        this.f17529b = i11;
        this.f17531d = obj;
        this.f17530c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f17529b;
        int i11 = this.f17530c;
        Object obj = this.f17531d;
        switch (i10) {
            case 0:
                ((s.a) obj).n(i11);
                return;
            case 1:
                ((com.applovin.impl.adview.a) obj).a(i11);
                return;
            case 2:
                com.applovin.impl.sdk.f.b((f.a) obj, i11);
                return;
            case 3:
                MaxAdPlacer.a((MaxAdPlacer) obj, i11);
                return;
            case 4:
                s7.e eVar = ((s7.c) obj).f24305b;
                eVar.getClass();
                boolean z10 = true;
                if (i11 != -3 && i11 != -2) {
                    if (i11 != -1) {
                        if (i11 != 1) {
                            kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.v("Unknown focus change type: ", i11, "AudioFocusManager");
                            return;
                        } else {
                            eVar.d(1);
                            eVar.b(1);
                            return;
                        }
                    }
                    eVar.b(-1);
                    eVar.a();
                    return;
                }
                if (i11 != -2) {
                    u7.e eVar2 = eVar.f24327d;
                    if (eVar2 == null || eVar2.f25552b != 1) {
                        z10 = false;
                    }
                    if (!z10) {
                        eVar.d(3);
                        return;
                    }
                }
                eVar.b(0);
                eVar.d(2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                View view = (View) sideSheetBehavior.f11787p.get();
                if (view != null) {
                    sideSheetBehavior.z(view, i11, false);
                    return;
                }
                return;
        }
    }
}
