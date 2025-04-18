package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity implements androidx.core.app.f, androidx.core.app.g {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final androidx.lifecycle.x mFragmentLifecycleRegistry;
    final g0 mFragments;
    boolean mResumed;
    boolean mStopped;

    public FragmentActivity() {
        this.mFragments = new g0(new d0(this));
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.x(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        final int i10 = 1;
        getSavedStateRegistry().c(LIFECYCLE_TAG, new androidx.activity.f(this, 1));
        final int i11 = 0;
        addOnConfigurationChangedListener(new m0.a(this) { // from class: androidx.fragment.app.c0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentActivity f1594b;

            {
                this.f1594b = this;
            }

            @Override // m0.a
            public final void accept(Object obj) {
                int i12 = i11;
                FragmentActivity fragmentActivity = this.f1594b;
                switch (i12) {
                    case 0:
                        fragmentActivity.lambda$init$1((Configuration) obj);
                        return;
                    default:
                        fragmentActivity.lambda$init$2((Intent) obj);
                        return;
                }
            }
        });
        addOnNewIntentListener(new m0.a(this) { // from class: androidx.fragment.app.c0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentActivity f1594b;

            {
                this.f1594b = this;
            }

            @Override // m0.a
            public final void accept(Object obj) {
                int i12 = i10;
                FragmentActivity fragmentActivity = this.f1594b;
                switch (i12) {
                    case 0:
                        fragmentActivity.lambda$init$1((Configuration) obj);
                        return;
                    default:
                        fragmentActivity.lambda$init$2((Intent) obj);
                        return;
                }
            }
        });
        addOnContextAvailableListener(new androidx.activity.g(this, 1));
    }

    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.e(androidx.lifecycle.n.ON_STOP);
        return new Bundle();
    }

    public /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.mFragments.a();
    }

    public /* synthetic */ void lambda$init$2(Intent intent) {
        this.mFragments.a();
    }

    public void lambda$init$3(Context context) {
        i0 i0Var = this.mFragments.a;
        i0Var.f1650f.attachController(i0Var, i0Var, null);
    }

    private static boolean markState(FragmentManager fragmentManager, androidx.lifecycle.o oVar) {
        boolean z10 = false;
        for (Fragment fragment : fragmentManager.getFragments()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z10 |= markState(fragment.getChildFragmentManager(), oVar);
                }
                v1 v1Var = fragment.mViewLifecycleOwner;
                androidx.lifecycle.o oVar2 = androidx.lifecycle.o.STARTED;
                if (v1Var != null) {
                    v1Var.b();
                    if (v1Var.f1729g.f1835d.a(oVar2)) {
                        fragment.mViewLifecycleOwner.f1729g.g(oVar);
                        z10 = true;
                    }
                }
                if (fragment.mLifecycleRegistry.f1835d.a(oVar2)) {
                    fragment.mLifecycleRegistry.g(oVar);
                    z10 = true;
                }
            }
        }
        return z10;
    }

    @Nullable
    public final View dispatchFragmentsOnCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.mFragments.a.f1650f.getLayoutInflaterFactory().onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (!shouldDumpInternalState(strArr)) {
            return;
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            l1.a.a(this).b(str2, printWriter);
        }
        this.mFragments.a.f1650f.dump(str, fileDescriptor, printWriter, strArr);
    }

    @NonNull
    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.a.f1650f;
    }

    @NonNull
    @Deprecated
    public l1.a getSupportLoaderManager() {
        return l1.a.a(this);
    }

    public void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), androidx.lifecycle.o.CREATED));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @CallSuper
    public void onActivityResult(int i10, int i11, @Nullable Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i10, i11, intent);
    }

    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment) {
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.p, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.e(androidx.lifecycle.n.ON_CREATE);
        this.mFragments.a.f1650f.dispatchCreate();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    @Nullable
    public View onCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.a.f1650f.dispatchDestroy();
        this.mFragmentLifecycleRegistry.e(androidx.lifecycle.n.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.mFragments.a.f1650f.dispatchContextItemSelected(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.a.f1650f.dispatchPause();
        this.mFragmentLifecycleRegistry.e(androidx.lifecycle.n.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @CallSuper
    public void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.a.f1650f.execPendingActions(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.e(androidx.lifecycle.n.ON_RESUME);
        this.mFragments.a.f1650f.dispatchResume();
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.a.f1650f.dispatchActivityCreated();
        }
        this.mFragments.a.f1650f.execPendingActions(true);
        this.mFragmentLifecycleRegistry.e(androidx.lifecycle.n.ON_START);
        this.mFragments.a.f1650f.dispatchStart();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.a.f1650f.dispatchStop();
        this.mFragmentLifecycleRegistry.e(androidx.lifecycle.n.ON_STOP);
    }

    public void setEnterSharedElementCallback(@Nullable androidx.core.app.y1 y1Var) {
        int i10 = androidx.core.app.i.a;
        androidx.core.app.a.c(this, null);
    }

    public void setExitSharedElementCallback(@Nullable androidx.core.app.y1 y1Var) {
        int i10 = androidx.core.app.i.a;
        androidx.core.app.a.d(this, null);
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @NonNull Intent intent, int i10) {
        startActivityFromFragment(fragment, intent, i10, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(@NonNull Fragment fragment, @NonNull IntentSender intentSender, int i10, @Nullable Intent intent, int i11, int i12, int i13, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        if (i10 == -1) {
            int i14 = androidx.core.app.i.a;
            startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        int i10 = androidx.core.app.i.a;
        androidx.core.app.a.a(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        int i10 = androidx.core.app.i.a;
        androidx.core.app.a.b(this);
    }

    public void supportStartPostponedEnterTransition() {
        int i10 = androidx.core.app.i.a;
        androidx.core.app.a.e(this);
    }

    @Override // androidx.core.app.g
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i10) {
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @NonNull Intent intent, int i10, @Nullable Bundle bundle) {
        if (i10 == -1) {
            int i11 = androidx.core.app.i.a;
            startActivityForResult(intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i10, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    @Nullable
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public FragmentActivity(int i10) {
        super(i10);
        this.mFragments = new g0(new d0(this));
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.x(this);
        this.mStopped = true;
        init();
    }
}
