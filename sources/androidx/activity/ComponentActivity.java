package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.app.p1;
import androidx.core.app.q1;
import androidx.core.app.u1;
import androidx.fragment.app.q0;
import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.e1;
import androidx.lifecycle.o0;
import androidx.lifecycle.u0;
import com.plantcare.ai.identifier.plantid.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class ComponentActivity extends androidx.core.app.p implements e1, androidx.lifecycle.j, y1.f, a0, androidx.activity.result.h, d0.m, d0.n, p1, q1, n0.m {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final androidx.activity.result.g mActivityResultRegistry;
    private int mContentLayoutId;
    final e.a mContextAwareHelper;
    private a1 mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;

    @NonNull
    final p mFullyDrawnReporter;
    private final androidx.lifecycle.x mLifecycleRegistry;
    private final n0.q mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private z mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<m0.a> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<m0.a> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<m0.a> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<m0.a> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<m0.a> mOnTrimMemoryListeners;
    final m mReportFullyDrawnExecutor;
    final y1.e mSavedStateRegistryController;
    private d1 mViewModelStore;

    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.activity.e] */
    public ComponentActivity() {
        this.mContextAwareHelper = new e.a();
        this.mMenuHostHelper = new n0.q(new d(this, 0));
        this.mLifecycleRegistry = new androidx.lifecycle.x(this);
        y1.e g10 = ka.e.g(this);
        this.mSavedStateRegistryController = g10;
        this.mOnBackPressedDispatcher = null;
        n nVar = new n(this);
        this.mReportFullyDrawnExecutor = nVar;
        this.mFullyDrawnReporter = new p(nVar, new Function0() { // from class: androidx.activity.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ComponentActivity.this.reportFullyDrawn();
                return null;
            }
        });
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new h(this);
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() != null) {
            getLifecycle().a(new androidx.lifecycle.t() { // from class: androidx.activity.ComponentActivity.2
                @Override // androidx.lifecycle.t
                public final void a(androidx.lifecycle.v vVar, androidx.lifecycle.n nVar2) {
                    View view;
                    if (nVar2 == androidx.lifecycle.n.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        if (window != null) {
                            view = window.peekDecorView();
                        } else {
                            view = null;
                        }
                        if (view != null) {
                            view.cancelPendingInputEvents();
                        }
                    }
                }
            });
            getLifecycle().a(new androidx.lifecycle.t() { // from class: androidx.activity.ComponentActivity.3
                @Override // androidx.lifecycle.t
                public final void a(androidx.lifecycle.v vVar, androidx.lifecycle.n nVar2) {
                    if (nVar2 == androidx.lifecycle.n.ON_DESTROY) {
                        ComponentActivity.this.mContextAwareHelper.f17066b = null;
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.getViewModelStore().a();
                        }
                        ((n) ComponentActivity.this.mReportFullyDrawnExecutor).a();
                    }
                }
            });
            getLifecycle().a(new androidx.lifecycle.t() { // from class: androidx.activity.ComponentActivity.4
                @Override // androidx.lifecycle.t
                public final void a(androidx.lifecycle.v vVar, androidx.lifecycle.n nVar2) {
                    ComponentActivity componentActivity = ComponentActivity.this;
                    componentActivity.ensureViewModelStore();
                    componentActivity.getLifecycle().b(this);
                }
            });
            g10.a();
            jb.g.e(this);
            getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new f(this, 0));
            addOnContextAvailableListener(new g(this, 0));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public static Bundle e(ComponentActivity componentActivity) {
        componentActivity.getClass();
        Bundle bundle = new Bundle();
        androidx.activity.result.g gVar = componentActivity.mActivityResultRegistry;
        gVar.getClass();
        HashMap hashMap = gVar.f602b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(gVar.f604d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) gVar.f607g.clone());
        return bundle;
    }

    public static void f(ComponentActivity componentActivity) {
        Bundle a = componentActivity.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (a != null) {
            androidx.activity.result.g gVar = componentActivity.mActivityResultRegistry;
            gVar.getClass();
            ArrayList<Integer> integerArrayList = a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                gVar.f604d = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                Bundle bundle = a.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                Bundle bundle2 = gVar.f607g;
                bundle2.putAll(bundle);
                for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
                    String str = stringArrayList.get(i10);
                    HashMap hashMap = gVar.f602b;
                    boolean containsKey = hashMap.containsKey(str);
                    HashMap hashMap2 = gVar.a;
                    if (containsKey) {
                        Integer num = (Integer) hashMap.remove(str);
                        if (!bundle2.containsKey(str)) {
                            hashMap2.remove(num);
                        }
                    }
                    int intValue = integerArrayList.get(i10).intValue();
                    String str2 = stringArrayList.get(i10);
                    hashMap2.put(Integer.valueOf(intValue), str2);
                    hashMap.put(str2, Integer.valueOf(intValue));
                }
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.d(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // n0.m
    public void addMenuProvider(@NonNull n0.s sVar) {
        n0.q qVar = this.mMenuHostHelper;
        qVar.f22341b.add(sVar);
        qVar.a.run();
    }

    @Override // d0.m
    public final void addOnConfigurationChangedListener(@NonNull m0.a aVar) {
        this.mOnConfigurationChangedListeners.add(aVar);
    }

    public final void addOnContextAvailableListener(@NonNull e.b listener) {
        e.a aVar = this.mContextAwareHelper;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        Context context = aVar.f17066b;
        if (context != null) {
            listener.a(context);
        }
        aVar.a.add(listener);
    }

    @Override // androidx.core.app.p1
    public final void addOnMultiWindowModeChangedListener(@NonNull m0.a aVar) {
        this.mOnMultiWindowModeChangedListeners.add(aVar);
    }

    public final void addOnNewIntentListener(@NonNull m0.a aVar) {
        this.mOnNewIntentListeners.add(aVar);
    }

    @Override // androidx.core.app.q1
    public final void addOnPictureInPictureModeChangedListener(@NonNull m0.a aVar) {
        this.mOnPictureInPictureModeChangedListeners.add(aVar);
    }

    @Override // d0.n
    public final void addOnTrimMemoryListener(@NonNull m0.a aVar) {
        this.mOnTrimMemoryListeners.add(aVar);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            l lVar = (l) getLastNonConfigurationInstance();
            if (lVar != null) {
                this.mViewModelStore = lVar.f575b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new d1();
            }
        }
    }

    @Override // androidx.activity.result.h
    @NonNull
    public final androidx.activity.result.g getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.j
    @NonNull
    @CallSuper
    public k1.c getDefaultViewModelCreationExtras() {
        k1.e eVar = new k1.e();
        if (getApplication() != null) {
            eVar.b(b6.b.f2295g, getApplication());
        }
        eVar.b(jb.g.f19884b, this);
        eVar.b(jb.g.f19885c, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            eVar.b(jb.g.f19886d, getIntent().getExtras());
        }
        return eVar;
    }

    @Override // androidx.lifecycle.j
    @NonNull
    public a1 getDefaultViewModelProviderFactory() {
        Bundle bundle;
        if (this.mDefaultFactory == null) {
            Application application = getApplication();
            if (getIntent() != null) {
                bundle = getIntent().getExtras();
            } else {
                bundle = null;
            }
            this.mDefaultFactory = new u0(application, this, bundle);
        }
        return this.mDefaultFactory;
    }

    @NonNull
    public p getFullyDrawnReporter() {
        return this.mFullyDrawnReporter;
    }

    @Nullable
    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        l lVar = (l) getLastNonConfigurationInstance();
        if (lVar != null) {
            return lVar.a;
        }
        return null;
    }

    @Override // androidx.lifecycle.v
    @NonNull
    public androidx.lifecycle.p getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.activity.a0
    @NonNull
    public final z getOnBackPressedDispatcher() {
        if (this.mOnBackPressedDispatcher == null) {
            this.mOnBackPressedDispatcher = new z(new i(this, 0));
            getLifecycle().a(new androidx.lifecycle.t() { // from class: androidx.activity.ComponentActivity.6
                @Override // androidx.lifecycle.t
                public final void a(androidx.lifecycle.v vVar, androidx.lifecycle.n nVar) {
                    if (nVar == androidx.lifecycle.n.ON_CREATE && Build.VERSION.SDK_INT >= 33) {
                        z zVar = ComponentActivity.this.mOnBackPressedDispatcher;
                        OnBackInvokedDispatcher invoker = k.a((ComponentActivity) vVar);
                        zVar.getClass();
                        Intrinsics.checkNotNullParameter(invoker, "invoker");
                        zVar.f628e = invoker;
                        zVar.c(zVar.f630g);
                    }
                }
            });
        }
        return this.mOnBackPressedDispatcher;
    }

    @Override // y1.f
    @NonNull
    public final y1.d getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f27886b;
    }

    @Override // androidx.lifecycle.e1
    @NonNull
    public d1 getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @CallSuper
    public void initializeViewTreeOwners() {
        com.facebook.internal.i.H(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullParameter(decorView, "<this>");
        decorView.setTag(R.id.view_tree_view_model_store_owner, this);
        com.facebook.appevents.o.v(getWindow().getDecorView(), this);
        com.bumptech.glide.e.Q(getWindow().getDecorView(), this);
        View decorView2 = getWindow().getDecorView();
        Intrinsics.checkNotNullParameter(decorView2, "<this>");
        Intrinsics.checkNotNullParameter(this, "fullyDrawnReporterOwner");
        decorView2.setTag(R.id.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (!this.mActivityResultRegistry.a(i10, i11, intent)) {
            super.onActivityResult(i10, i11, intent);
        }
    }

    @Override // android.app.Activity
    @CallSuper
    @Deprecated
    public void onBackPressed() {
        getOnBackPressedDispatcher().b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    @CallSuper
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<m0.a> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // androidx.core.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.b(bundle);
        e.a aVar = this.mContextAwareHelper;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(this, "context");
        aVar.f17066b = this;
        Iterator it = aVar.a.iterator();
        while (it.hasNext()) {
            ((e.b) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i10 = o0.f1808c;
        ka.e.n(this);
        int i11 = this.mContentLayoutId;
        if (i11 != 0) {
            setContentView(i11);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, @NonNull Menu menu) {
        if (i10 == 0) {
            super.onCreatePanelMenu(i10, menu);
            n0.q qVar = this.mMenuHostHelper;
            MenuInflater menuInflater = getMenuInflater();
            Iterator it = qVar.f22341b.iterator();
            while (it.hasNext()) {
                ((q0) ((n0.s) it.next())).a.dispatchCreateOptionsMenu(menu, menuInflater);
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 0) {
            return this.mMenuHostHelper.a(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    @CallSuper
    public void onMultiWindowModeChanged(boolean z10) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<m0.a> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new androidx.core.app.r(z10));
        }
    }

    @Override // android.app.Activity
    @CallSuper
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<m0.a> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, @NonNull Menu menu) {
        Iterator it = this.mMenuHostHelper.f22341b.iterator();
        while (it.hasNext()) {
            ((q0) ((n0.s) it.next())).a.dispatchOptionsMenuClosed(menu);
        }
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    @CallSuper
    public void onPictureInPictureModeChanged(boolean z10) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<m0.a> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new u1(z10));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, @Nullable View view, @NonNull Menu menu) {
        if (i10 == 0) {
            super.onPreparePanel(i10, view, menu);
            Iterator it = this.mMenuHostHelper.f22341b.iterator();
            while (it.hasNext()) {
                ((q0) ((n0.s) it.next())).a.dispatchPrepareOptionsMenu(menu);
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (!this.mActivityResultRegistry.a(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i10, strArr, iArr);
        }
    }

    @Nullable
    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    @Nullable
    public final Object onRetainNonConfigurationInstance() {
        l lVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        d1 d1Var = this.mViewModelStore;
        if (d1Var == null && (lVar = (l) getLastNonConfigurationInstance()) != null) {
            d1Var = lVar.f575b;
        }
        if (d1Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        l lVar2 = new l();
        lVar2.a = onRetainCustomNonConfigurationInstance;
        lVar2.f575b = d1Var;
        return lVar2;
    }

    @Override // androidx.core.app.p, android.app.Activity
    @CallSuper
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        androidx.lifecycle.p lifecycle = getLifecycle();
        if (lifecycle instanceof androidx.lifecycle.x) {
            ((androidx.lifecycle.x) lifecycle).g(androidx.lifecycle.o.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    @CallSuper
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<m0.a> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i10));
        }
    }

    @Nullable
    public Context peekAvailableContext() {
        return this.mContextAwareHelper.f17066b;
    }

    @NonNull
    public final <I, O> androidx.activity.result.c registerForActivityResult(@NonNull f.b bVar, @NonNull androidx.activity.result.g gVar, @NonNull androidx.activity.result.b bVar2) {
        return gVar.c("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, bVar, bVar2);
    }

    @Override // n0.m
    public void removeMenuProvider(@NonNull n0.s sVar) {
        this.mMenuHostHelper.b(sVar);
    }

    @Override // d0.m
    public final void removeOnConfigurationChangedListener(@NonNull m0.a aVar) {
        this.mOnConfigurationChangedListeners.remove(aVar);
    }

    public final void removeOnContextAvailableListener(@NonNull e.b listener) {
        e.a aVar = this.mContextAwareHelper;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        aVar.a.remove(listener);
    }

    @Override // androidx.core.app.p1
    public final void removeOnMultiWindowModeChangedListener(@NonNull m0.a aVar) {
        this.mOnMultiWindowModeChangedListeners.remove(aVar);
    }

    public final void removeOnNewIntentListener(@NonNull m0.a aVar) {
        this.mOnNewIntentListeners.remove(aVar);
    }

    @Override // androidx.core.app.q1
    public final void removeOnPictureInPictureModeChangedListener(@NonNull m0.a aVar) {
        this.mOnPictureInPictureModeChangedListeners.remove(aVar);
    }

    @Override // d0.n
    public final void removeOnTrimMemoryListener(@NonNull m0.a aVar) {
        this.mOnTrimMemoryListeners.remove(aVar);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (d6.g.r()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            p pVar = this.mFullyDrawnReporter;
            synchronized (pVar.f584c) {
                pVar.f585d = true;
                Iterator it = pVar.f586e.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                pVar.f586e.clear();
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.d(getWindow().getDecorView());
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@NonNull IntentSender intentSender, int i10, @Nullable Intent intent, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i10, @Nullable Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@NonNull IntentSender intentSender, int i10, @Nullable Intent intent, int i11, int i12, int i13, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    @Override // android.app.Activity
    @RequiresApi(api = 26)
    @CallSuper
    public void onMultiWindowModeChanged(boolean z10, @NonNull Configuration newConfig) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z10, newConfig);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<m0.a> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                m0.a next = it.next();
                Intrinsics.checkNotNullParameter(newConfig, "newConfig");
                next.accept(new androidx.core.app.r(z10));
            }
        } catch (Throwable th2) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    @RequiresApi(api = 26)
    @CallSuper
    public void onPictureInPictureModeChanged(boolean z10, @NonNull Configuration newConfig) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z10, newConfig);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<m0.a> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                m0.a next = it.next();
                Intrinsics.checkNotNullParameter(newConfig, "newConfig");
                next.accept(new u1(z10));
            }
        } catch (Throwable th2) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th2;
        }
    }

    @NonNull
    public final <I, O> androidx.activity.result.c registerForActivityResult(@NonNull f.b bVar, @NonNull androidx.activity.result.b bVar2) {
        return registerForActivityResult(bVar, this.mActivityResultRegistry, bVar2);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.d(getWindow().getDecorView());
        super.setContentView(view);
    }

    public void addMenuProvider(@NonNull final n0.s sVar, @NonNull androidx.lifecycle.v vVar) {
        final n0.q qVar = this.mMenuHostHelper;
        qVar.f22341b.add(sVar);
        qVar.a.run();
        androidx.lifecycle.p lifecycle = vVar.getLifecycle();
        HashMap hashMap = qVar.f22342c;
        n0.p pVar = (n0.p) hashMap.remove(sVar);
        if (pVar != null) {
            pVar.a.b(pVar.f22339b);
            pVar.f22339b = null;
        }
        hashMap.put(sVar, new n0.p(lifecycle, new androidx.lifecycle.t() { // from class: n0.n
            @Override // androidx.lifecycle.t
            public final void a(androidx.lifecycle.v vVar2, androidx.lifecycle.n nVar) {
                androidx.lifecycle.n nVar2 = androidx.lifecycle.n.ON_DESTROY;
                q qVar2 = q.this;
                if (nVar == nVar2) {
                    qVar2.b(sVar);
                } else {
                    qVar2.getClass();
                }
            }
        }));
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.d(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(@NonNull final n0.s sVar, @NonNull androidx.lifecycle.v vVar, @NonNull final androidx.lifecycle.o oVar) {
        final n0.q qVar = this.mMenuHostHelper;
        qVar.getClass();
        androidx.lifecycle.p lifecycle = vVar.getLifecycle();
        HashMap hashMap = qVar.f22342c;
        n0.p pVar = (n0.p) hashMap.remove(sVar);
        if (pVar != null) {
            pVar.a.b(pVar.f22339b);
            pVar.f22339b = null;
        }
        hashMap.put(sVar, new n0.p(lifecycle, new androidx.lifecycle.t() { // from class: n0.o
            @Override // androidx.lifecycle.t
            public final void a(androidx.lifecycle.v vVar2, androidx.lifecycle.n nVar) {
                q qVar2 = q.this;
                qVar2.getClass();
                androidx.lifecycle.n.Companion.getClass();
                androidx.lifecycle.o oVar2 = oVar;
                androidx.lifecycle.n c10 = androidx.lifecycle.l.c(oVar2);
                Runnable runnable = qVar2.a;
                CopyOnWriteArrayList copyOnWriteArrayList = qVar2.f22341b;
                s sVar2 = sVar;
                if (nVar == c10) {
                    copyOnWriteArrayList.add(sVar2);
                    runnable.run();
                } else if (nVar == androidx.lifecycle.n.ON_DESTROY) {
                    qVar2.b(sVar2);
                } else if (nVar == androidx.lifecycle.l.a(oVar2)) {
                    copyOnWriteArrayList.remove(sVar2);
                    runnable.run();
                }
            }
        }));
    }

    public ComponentActivity(int i10) {
        this();
        this.mContentLayoutId = i10;
    }
}
