package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.AbstractC0400a;
import androidx.core.app.InterfaceC0404e;
import androidx.lifecycle.C0513x;
import androidx.lifecycle.EnumC0503m;
import androidx.lifecycle.EnumC0504n;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import t0.AbstractC2703a;

/* loaded from: classes.dex */
public class FragmentActivity extends f.l implements InterfaceC0404e {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final C0513x mFragmentLifecycleRegistry;
    final O mFragments;
    boolean mResumed;
    boolean mStopped;

    public FragmentActivity() {
        this.mFragments = new O(new K(this));
        this.mFragmentLifecycleRegistry = new C0513x(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().c(LIFECYCLE_TAG, new H(this, 0));
        final int i9 = 0;
        addOnConfigurationChangedListener(new S.a(this) { // from class: androidx.fragment.app.I
            public final /* synthetic */ FragmentActivity b;

            {
                this.b = this;
            }

            @Override // S.a
            public final void accept(Object obj) {
                switch (i9) {
                    case 0:
                        this.b.lambda$init$1((Configuration) obj);
                        return;
                    default:
                        this.b.lambda$init$2((Intent) obj);
                        return;
                }
            }
        });
        final int i10 = 1;
        addOnNewIntentListener(new S.a(this) { // from class: androidx.fragment.app.I
            public final /* synthetic */ FragmentActivity b;

            {
                this.b = this;
            }

            @Override // S.a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        this.b.lambda$init$1((Configuration) obj);
                        return;
                    default:
                        this.b.lambda$init$2((Intent) obj);
                        return;
                }
            }
        });
        addOnContextAvailableListener(new J(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.e(EnumC0503m.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.mFragments.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(Intent intent) {
        this.mFragments.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$init$3(Context context) {
        Q q9 = this.mFragments.f4681a;
        q9.f4685f.attachController(q9, q9, null);
    }

    private static boolean markState(FragmentManager fragmentManager, EnumC0504n enumC0504n) {
        boolean z8 = false;
        for (Fragment fragment : fragmentManager.getFragments()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z8 |= markState(fragment.getChildFragmentManager(), enumC0504n);
                }
                H0 h02 = fragment.mViewLifecycleOwner;
                EnumC0504n enumC0504n2 = EnumC0504n.f4894f;
                if (h02 != null) {
                    h02.b();
                    if (h02.f4656f.f4904d.a(enumC0504n2)) {
                        fragment.mViewLifecycleOwner.f4656f.g(enumC0504n);
                        z8 = true;
                    }
                }
                if (fragment.mLifecycleRegistry.f4904d.a(enumC0504n2)) {
                    fragment.mLifecycleRegistry.g(enumC0504n);
                    z8 = true;
                }
            }
        }
        return z8;
    }

    @Nullable
    public final View dispatchFragmentsOnCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.mFragments.f4681a.f4685f.getLayoutInflaterFactory().onCreateView(view, str, context, attributeSet);
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
            AbstractC2703a.a(this).b(str2, printWriter);
        }
        this.mFragments.f4681a.f4685f.dump(str, fileDescriptor, printWriter, strArr);
    }

    @NonNull
    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.f4681a.f4685f;
    }

    @NonNull
    @Deprecated
    public AbstractC2703a getSupportLoaderManager() {
        return AbstractC2703a.a(this);
    }

    public void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), EnumC0504n.f4893d));
    }

    @Override // f.l, android.app.Activity
    @CallSuper
    public void onActivityResult(int i9, int i10, @Nullable Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i9, i10, intent);
    }

    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment) {
    }

    @Override // f.l, androidx.core.app.AbstractActivityC0412m, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.e(EnumC0503m.ON_CREATE);
        this.mFragments.f4681a.f4685f.dispatchCreate();
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
        this.mFragments.f4681a.f4685f.dispatchDestroy();
        this.mFragmentLifecycleRegistry.e(EnumC0503m.ON_DESTROY);
    }

    @Override // f.l, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i9, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i9, menuItem)) {
            return true;
        }
        if (i9 == 6) {
            return this.mFragments.f4681a.f4685f.dispatchContextItemSelected(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f4681a.f4685f.dispatchPause();
        this.mFragmentLifecycleRegistry.e(EnumC0503m.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // f.l, android.app.Activity
    @CallSuper
    public void onRequestPermissionsResult(int i9, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i9, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f4681a.f4685f.execPendingActions(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.e(EnumC0503m.ON_RESUME);
        this.mFragments.f4681a.f4685f.dispatchResume();
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.f4681a.f4685f.dispatchActivityCreated();
        }
        this.mFragments.f4681a.f4685f.execPendingActions(true);
        this.mFragmentLifecycleRegistry.e(EnumC0503m.ON_START);
        this.mFragments.f4681a.f4685f.dispatchStart();
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
        this.mFragments.f4681a.f4685f.dispatchStop();
        this.mFragmentLifecycleRegistry.e(EnumC0503m.ON_STOP);
    }

    public void setEnterSharedElementCallback(@Nullable androidx.core.app.r0 r0Var) {
        AbstractC0400a.c(this, null);
    }

    public void setExitSharedElementCallback(@Nullable androidx.core.app.r0 r0Var) {
        AbstractC0400a.d(this, null);
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @NonNull Intent intent, int i9, @Nullable Bundle bundle) {
        if (i9 == -1) {
            startActivityForResult(intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i9, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(@NonNull Fragment fragment, @NonNull IntentSender intentSender, int i9, @Nullable Intent intent, int i10, int i11, int i12, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        if (i9 == -1) {
            startIntentSenderForResult(intentSender, i9, intent, i10, i11, i12, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i9, intent, i10, i11, i12, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        AbstractC0400a.a(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        AbstractC0400a.b(this);
    }

    public void supportStartPostponedEnterTransition() {
        AbstractC0400a.e(this);
    }

    @Override // androidx.core.app.InterfaceC0404e
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i9) {
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    @Nullable
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @NonNull Intent intent, int i9) {
        startActivityFromFragment(fragment, intent, i9, (Bundle) null);
    }

    public FragmentActivity(int i9) {
        super(i9);
        this.mFragments = new O(new K(this));
        this.mFragmentLifecycleRegistry = new C0513x(this);
        this.mStopped = true;
        init();
    }
}
