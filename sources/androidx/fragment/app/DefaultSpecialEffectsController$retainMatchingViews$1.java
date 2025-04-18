package androidx.fragment.app;

import android.view.View;
import androidx.core.view.ViewCompat;
import e0.u;
import java.util.Collection;
import java.util.Map;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class DefaultSpecialEffectsController$retainMatchingViews$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Collection f19674a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSpecialEffectsController$retainMatchingViews$1(Collection collection) {
        super(1);
        this.f19674a = collection;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        p0.a.s(entry, "entry");
        return Boolean.valueOf(u.A0(this.f19674a, ViewCompat.o((View) entry.getValue())));
    }
}
