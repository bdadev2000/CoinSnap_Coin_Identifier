package h1;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class j extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    public final Fragment f18710b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Fragment fragment, String str) {
        super(str);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f18710b = fragment;
    }
}
