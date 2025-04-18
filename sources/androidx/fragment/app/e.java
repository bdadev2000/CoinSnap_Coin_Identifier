package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.SavedStateRegistry;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements SavedStateRegistry.SavedStateProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19889a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19890b;

    public /* synthetic */ e(Object obj, int i2) {
        this.f19889a = i2;
        this.f19890b = obj;
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public final Bundle a() {
        int i2 = this.f19889a;
        Object obj = this.f19890b;
        switch (i2) {
            case 0:
                FragmentActivity fragmentActivity = (FragmentActivity) obj;
                String str = FragmentActivity.LIFECYCLE_TAG;
                fragmentActivity.markFragmentsCreated();
                fragmentActivity.mFragmentLifecycleRegistry.g(Lifecycle.Event.ON_STOP);
                return new Bundle();
            default:
                return ((FragmentManager) obj).U();
        }
    }
}
