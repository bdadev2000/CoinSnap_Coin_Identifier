package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import p0.a;

/* loaded from: classes4.dex */
public abstract class Violation extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final Fragment f19915a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Violation(Fragment fragment, String str) {
        super(str);
        a.s(fragment, "fragment");
        this.f19915a = fragment;
    }
}
