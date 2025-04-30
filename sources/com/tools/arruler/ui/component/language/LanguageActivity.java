package com.tools.arruler.ui.component.language;

import A6.c;
import F2.h;
import L6.b;
import M6.a;
import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.d0;
import com.tools.arruler.photomeasure.camera.ruler.R;
import k.C2426o;
import o7.C2513b;
import q7.InterfaceC2649b;
import u6.AbstractC2797m;
import x6.AbstractActivityC2926b;

/* loaded from: classes3.dex */
public final class LanguageActivity extends AbstractActivityC2926b implements InterfaceC2649b {
    public static final /* synthetic */ int m = 0;

    /* renamed from: f, reason: collision with root package name */
    public C2426o f19664f;

    /* renamed from: g, reason: collision with root package name */
    public volatile C2513b f19665g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f19666h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public boolean f19667i = false;

    /* renamed from: j, reason: collision with root package name */
    public b f19668j;

    /* renamed from: k, reason: collision with root package name */
    public a f19669k;
    public boolean l;

    public LanguageActivity() {
        addOnContextAvailableListener(new E6.b(this, 2));
    }

    @Override // q7.InterfaceC2649b
    public final Object a() {
        return t().a();
    }

    @Override // f.l
    public final d0 getDefaultViewModelProviderFactory() {
        return h.m(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // x6.AbstractActivityC2926b
    public final int m() {
        return R.layout.activity_language;
    }

    @Override // x6.AbstractActivityC2926b, androidx.fragment.app.FragmentActivity, f.l, androidx.core.app.AbstractActivityC0412m, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof InterfaceC2649b) {
            C2426o c9 = t().c();
            this.f19664f = c9;
            if (c9.a()) {
                this.f19664f.f21320c = getDefaultViewModelCreationExtras();
            }
        }
    }

    @Override // k.AbstractActivityC2417f, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C2426o c2426o = this.f19664f;
        if (c2426o != null) {
            c2426o.f21320c = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0373 A[Catch: Exception -> 0x037e, TryCatch #1 {Exception -> 0x037e, blocks: (B:100:0x036e, B:111:0x0373, B:113:0x0377, B:114:0x0380, B:115:0x0383), top: B:99:0x036e }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x040e A[Catch: Exception -> 0x0419, TryCatch #3 {Exception -> 0x0419, blocks: (B:145:0x0409, B:160:0x040e, B:162:0x0412, B:163:0x041b, B:164:0x041e), top: B:144:0x0409 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02dc A[Catch: Exception -> 0x02e7, TryCatch #5 {Exception -> 0x02e7, blocks: (B:55:0x02d7, B:66:0x02dc, B:68:0x02e0, B:69:0x02e9, B:70:0x02ec), top: B:54:0x02d7 }] */
    @Override // x6.AbstractActivityC2926b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p() {
        /*
            Method dump skipped, instructions count: 1119
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tools.arruler.ui.component.language.LanguageActivity.p():void");
    }

    @Override // x6.AbstractActivityC2926b
    public final void r() {
        AbstractC2797m abstractC2797m = (AbstractC2797m) k();
        abstractC2797m.f23357r.setOnClickListener(new c(this, 1));
    }

    public final C2513b t() {
        if (this.f19665g == null) {
            synchronized (this.f19666h) {
                try {
                    if (this.f19665g == null) {
                        this.f19665g = new C2513b((Activity) this);
                    }
                } finally {
                }
            }
        }
        return this.f19665g;
    }
}
