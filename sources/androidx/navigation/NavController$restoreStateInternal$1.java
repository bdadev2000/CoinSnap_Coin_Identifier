package androidx.navigation;

import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class NavController$restoreStateInternal$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f20395a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavController$restoreStateInternal$1(String str) {
        super(1);
        this.f20395a = str;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return Boolean.valueOf(p0.a.g((String) obj, this.f20395a));
    }
}
