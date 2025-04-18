package vg;

import a4.e;
import a4.l;
import a4.m;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26529b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p6.a f26530c;

    public /* synthetic */ a(p6.a aVar, int i10) {
        this.f26529b = i10;
        this.f26530c = aVar;
    }

    @Override // a4.e
    public final void a(l billingResult) {
        int i10 = this.f26529b;
        p6.a aVar = this.f26530c;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                if (billingResult.a == 0 && aVar != null) {
                    m a = a4.a.a();
                    a.f153b = "subs";
                    aVar.p(a.a(), new nb.a(14));
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                if (billingResult.a == 0) {
                    m a10 = a4.a.a();
                    a10.f153b = "subs";
                    aVar.p(a10.a(), new nb.a(16));
                    return;
                }
                return;
        }
    }

    @Override // a4.e
    public final void d() {
    }
}
