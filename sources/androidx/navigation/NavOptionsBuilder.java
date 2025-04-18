package androidx.navigation;

import androidx.navigation.NavOptions;
import q0.l;

@NavOptionsDsl
/* loaded from: classes3.dex */
public final class NavOptionsBuilder {

    /* renamed from: b, reason: collision with root package name */
    public boolean f20489b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f20490c;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20491f;

    /* renamed from: a, reason: collision with root package name */
    public final NavOptions.Builder f20488a = new NavOptions.Builder();
    public int d = -1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, androidx.navigation.PopUpToBuilder] */
    public final void a(int i2, l lVar) {
        p0.a.s(lVar, "popUpToBuilder");
        this.d = i2;
        this.e = false;
        ?? obj = new Object();
        lVar.invoke(obj);
        this.e = obj.f20523a;
        this.f20491f = obj.f20524b;
    }
}
