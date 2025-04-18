package androidx.navigation;

import android.os.Bundle;
import e0.w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NavController$executeRestoreState$3 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f20382a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f20383b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f20384c;
    public final /* synthetic */ NavController d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bundle f20385f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavController$executeRestoreState$3(b0 b0Var, ArrayList arrayList, d0 d0Var, NavController navController, Bundle bundle) {
        super(1);
        this.f20382a = b0Var;
        this.f20383b = arrayList;
        this.f20384c = d0Var;
        this.d = navController;
        this.f20385f = bundle;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        List list;
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
        p0.a.s(navBackStackEntry, "entry");
        this.f20382a.f30919a = true;
        List list2 = this.f20383b;
        int indexOf = list2.indexOf(navBackStackEntry);
        if (indexOf != -1) {
            d0 d0Var = this.f20384c;
            int i2 = indexOf + 1;
            list = list2.subList(d0Var.f30925a, i2);
            d0Var.f30925a = i2;
        } else {
            list = w.f30218a;
        }
        this.d.a(navBackStackEntry.f20328b, this.f20385f, navBackStackEntry, list);
        return d0.b0.f30125a;
    }
}
