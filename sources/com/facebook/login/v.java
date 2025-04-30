package com.facebook.login;

import androidx.fragment.app.FragmentActivity;
import com.facebook.internal.AbstractC1839h;
import h.C2310a;
import java.io.IOException;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class v extends G7.k implements F7.l {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13779c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13780d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i9, Object obj, Object obj2) {
        super(1);
        this.b = i9;
        this.f13779c = obj;
        this.f13780d = obj2;
    }

    @Override // F7.l
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                C2310a c2310a = (C2310a) obj;
                G7.j.e(c2310a, "result");
                int i9 = c2310a.b;
                if (i9 == -1) {
                    t b = ((w) this.f13779c).b();
                    com.facebook.r rVar = com.facebook.r.f13801a;
                    AbstractC1839h.k();
                    b.j(com.facebook.r.f13808i, i9, c2310a.f20551c);
                } else {
                    ((FragmentActivity) this.f13780d).finish();
                }
                return t7.y.f23029a;
            case 1:
                G7.j.e((IOException) obj, "it");
                k8.h hVar = (k8.h) this.f13779c;
                H0.b bVar = (H0.b) this.f13780d;
                synchronized (hVar) {
                    bVar.c();
                }
                return t7.y.f23029a;
            default:
                Throwable th = (Throwable) obj;
                y.i iVar = (y.i) this.f13779c;
                if (th != null) {
                    if (th instanceof CancellationException) {
                        iVar.f24272d = true;
                        y.k kVar = iVar.b;
                        if (kVar != null && kVar.f24274c.cancel(true)) {
                            iVar.f24270a = null;
                            iVar.b = null;
                            iVar.f24271c = null;
                        }
                    } else {
                        iVar.f24272d = true;
                        y.k kVar2 = iVar.b;
                        if (kVar2 != null && kVar2.f24274c.i(th)) {
                            iVar.f24270a = null;
                            iVar.b = null;
                            iVar.f24271c = null;
                        }
                    }
                } else {
                    Object c9 = ((Q7.A) this.f13780d).c();
                    iVar.f24272d = true;
                    y.k kVar3 = iVar.b;
                    if (kVar3 != null && kVar3.f24274c.h(c9)) {
                        iVar.f24270a = null;
                        iVar.b = null;
                        iVar.f24271c = null;
                    }
                }
                return t7.y.f23029a;
        }
    }
}
