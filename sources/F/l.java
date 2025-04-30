package f;

import T.C0282m;
import T.C0283n;
import T.C0284o;
import T.InterfaceC0278k;
import T.InterfaceC0286q;
import a5.C0398b;
import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.RequiresApi;
import androidx.core.app.AbstractActivityC0412m;
import androidx.core.app.C0416q;
import androidx.core.app.j0;
import androidx.core.app.k0;
import androidx.core.app.n0;
import androidx.fragment.app.H;
import androidx.fragment.app.J;
import androidx.fragment.app.Z;
import androidx.lifecycle.AbstractC0505o;
import androidx.lifecycle.C0501k;
import androidx.lifecycle.C0513x;
import androidx.lifecycle.EnumC0503m;
import androidx.lifecycle.EnumC0504n;
import androidx.lifecycle.InterfaceC0499i;
import androidx.lifecycle.InterfaceC0509t;
import androidx.lifecycle.InterfaceC0511v;
import androidx.lifecycle.Q;
import androidx.lifecycle.V;
import androidx.lifecycle.c0;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.tools.arruler.photomeasure.camera.ruler.R;
import g.C2277a;
import g.InterfaceC2278b;
import g4.AbstractC2292b;
import i.AbstractC2330a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import r0.AbstractC2654b;
import r0.C2655c;
import t7.AbstractC2712a;
import t7.InterfaceC2717f;
import w4.v0;

/* loaded from: classes.dex */
public abstract class l extends AbstractActivityC0412m implements g0, InterfaceC0499i, G0.g, y, h.j, I.n, I.o, j0, k0, InterfaceC0278k {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final g Companion = new Object();
    private f0 _viewModelStore;
    private final h.i activityResultRegistry;
    private int contentLayoutId;
    private final C2277a contextAwareHelper;
    private final InterfaceC2717f defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final InterfaceC2717f fullyDrawnReporter$delegate;
    private final C0284o menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;
    private final InterfaceC2717f onBackPressedDispatcher$delegate;
    private final CopyOnWriteArrayList<S.a> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<S.a> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<S.a> onNewIntentListeners;
    private final CopyOnWriteArrayList<S.a> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<S.a> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final i reportFullyDrawnExecutor;
    private final G0.f savedStateRegistryController;

    public l() {
        this.contextAwareHelper = new C2277a();
        this.menuHostHelper = new C0284o(new d(this, 0));
        G0.f fVar = new G0.f(this);
        this.savedStateRegistryController = fVar;
        this.reportFullyDrawnExecutor = new j(this);
        this.fullyDrawnReporter$delegate = AbstractC2712a.d(new I6.e(this, 11));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new k(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() != null) {
            getLifecycle().a(new e(this, 0));
            getLifecycle().a(new e(this, 1));
            getLifecycle().a(new G0.b(this, 4));
            fVar.a();
            V.e(this);
            getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new H(this, 3));
            addOnContextAvailableListener(new J(this, 1));
            this.defaultViewModelProviderFactory$delegate = AbstractC2712a.d(new I6.e(this, 9));
            this.onBackPressedDispatcher$delegate = AbstractC2712a.d(new I6.e(this, 12));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.".toString());
    }

    public static final void access$ensureViewModelStore(l lVar) {
        if (lVar._viewModelStore == null) {
            h hVar = (h) lVar.getLastNonConfigurationInstance();
            if (hVar != null) {
                lVar._viewModelStore = hVar.b;
            }
            if (lVar._viewModelStore == null) {
                lVar._viewModelStore = new f0();
            }
        }
    }

    public static void b(l lVar, Context context) {
        G7.j.e(lVar, "this$0");
        G7.j.e(context, "it");
        Bundle a6 = lVar.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (a6 != null) {
            h.i iVar = lVar.activityResultRegistry;
            iVar.getClass();
            ArrayList<Integer> integerArrayList = a6.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a6.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                ArrayList<String> stringArrayList2 = a6.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                if (stringArrayList2 != null) {
                    iVar.f20562d.addAll(stringArrayList2);
                }
                Bundle bundle = a6.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                Bundle bundle2 = iVar.f20565g;
                if (bundle != null) {
                    bundle2.putAll(bundle);
                }
                int size = stringArrayList.size();
                for (int i9 = 0; i9 < size; i9++) {
                    String str = stringArrayList.get(i9);
                    LinkedHashMap linkedHashMap = iVar.b;
                    boolean containsKey = linkedHashMap.containsKey(str);
                    LinkedHashMap linkedHashMap2 = iVar.f20560a;
                    if (containsKey) {
                        Integer num = (Integer) linkedHashMap.remove(str);
                        if (bundle2.containsKey(str)) {
                            continue;
                        } else if (!(linkedHashMap2 instanceof H7.a)) {
                            linkedHashMap2.remove(num);
                        } else {
                            G7.v.d(linkedHashMap2, "kotlin.collections.MutableMap");
                            throw null;
                        }
                    }
                    Integer num2 = integerArrayList.get(i9);
                    G7.j.d(num2, "rcs[i]");
                    int intValue = num2.intValue();
                    String str2 = stringArrayList.get(i9);
                    G7.j.d(str2, "keys[i]");
                    String str3 = str2;
                    linkedHashMap2.put(Integer.valueOf(intValue), str3);
                    linkedHashMap.put(str3, Integer.valueOf(intValue));
                }
            }
        }
    }

    public static void c(l lVar, InterfaceC0511v interfaceC0511v, EnumC0503m enumC0503m) {
        G7.j.e(lVar, "this$0");
        if (enumC0503m == EnumC0503m.ON_DESTROY) {
            lVar.contextAwareHelper.b = null;
            if (!lVar.isChangingConfigurations()) {
                lVar.getViewModelStore().a();
            }
            j jVar = (j) lVar.reportFullyDrawnExecutor;
            l lVar2 = jVar.f20219f;
            lVar2.getWindow().getDecorView().removeCallbacks(jVar);
            lVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(jVar);
        }
    }

    public static Bundle d(l lVar) {
        G7.j.e(lVar, "this$0");
        Bundle bundle = new Bundle();
        h.i iVar = lVar.activityResultRegistry;
        iVar.getClass();
        LinkedHashMap linkedHashMap = iVar.b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(iVar.f20562d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(iVar.f20565g));
        return bundle;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        i iVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        G7.j.d(decorView, "window.decorView");
        ((j) iVar).a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // T.InterfaceC0278k
    public void addMenuProvider(InterfaceC0286q interfaceC0286q) {
        G7.j.e(interfaceC0286q, "provider");
        C0284o c0284o = this.menuHostHelper;
        c0284o.b.add(interfaceC0286q);
        c0284o.f2915a.run();
    }

    @Override // I.n
    public final void addOnConfigurationChangedListener(S.a aVar) {
        G7.j.e(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.onConfigurationChangedListeners.add(aVar);
    }

    public final void addOnContextAvailableListener(InterfaceC2278b interfaceC2278b) {
        G7.j.e(interfaceC2278b, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C2277a c2277a = this.contextAwareHelper;
        c2277a.getClass();
        Context context = c2277a.b;
        if (context != null) {
            interfaceC2278b.a(context);
        }
        c2277a.f20412a.add(interfaceC2278b);
    }

    @Override // androidx.core.app.j0
    public final void addOnMultiWindowModeChangedListener(S.a aVar) {
        G7.j.e(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.onMultiWindowModeChangedListeners.add(aVar);
    }

    public final void addOnNewIntentListener(S.a aVar) {
        G7.j.e(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.onNewIntentListeners.add(aVar);
    }

    @Override // androidx.core.app.k0
    public final void addOnPictureInPictureModeChangedListener(S.a aVar) {
        G7.j.e(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.onPictureInPictureModeChangedListeners.add(aVar);
    }

    @Override // I.o
    public final void addOnTrimMemoryListener(S.a aVar) {
        G7.j.e(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.onTrimMemoryListeners.add(aVar);
    }

    public final void addOnUserLeaveHintListener(Runnable runnable) {
        G7.j.e(runnable, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.onUserLeaveHintListeners.add(runnable);
    }

    @Override // h.j
    public final h.i getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC0499i
    @CallSuper
    public AbstractC2654b getDefaultViewModelCreationExtras() {
        Bundle bundle;
        C2655c c2655c = new C2655c(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c2655c.f22812a;
        if (application != null) {
            C0398b c0398b = c0.f4885d;
            Application application2 = getApplication();
            G7.j.d(application2, MimeTypes.BASE_TYPE_APPLICATION);
            linkedHashMap.put(c0398b, application2);
        }
        linkedHashMap.put(V.f4868a, this);
        linkedHashMap.put(V.b, this);
        Intent intent = getIntent();
        if (intent != null) {
            bundle = intent.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            linkedHashMap.put(V.f4869c, bundle);
        }
        return c2655c;
    }

    public d0 getDefaultViewModelProviderFactory() {
        return (d0) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public n getFullyDrawnReporter() {
        return (n) this.fullyDrawnReporter$delegate.getValue();
    }

    public Object getLastCustomNonConfigurationInstance() {
        h hVar = (h) getLastNonConfigurationInstance();
        if (hVar != null) {
            return hVar.f20216a;
        }
        return null;
    }

    @Override // androidx.core.app.AbstractActivityC0412m, androidx.lifecycle.InterfaceC0511v
    public AbstractC0505o getLifecycle() {
        return super.getLifecycle();
    }

    @Override // f.y
    public final x getOnBackPressedDispatcher() {
        return (x) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // G0.g
    public final G0.e getSavedStateRegistry() {
        return this.savedStateRegistryController.b;
    }

    @Override // androidx.lifecycle.g0
    public f0 getViewModelStore() {
        if (getApplication() != null) {
            if (this._viewModelStore == null) {
                h hVar = (h) getLastNonConfigurationInstance();
                if (hVar != null) {
                    this._viewModelStore = hVar.b;
                }
                if (this._viewModelStore == null) {
                    this._viewModelStore = new f0();
                }
            }
            f0 f0Var = this._viewModelStore;
            G7.j.b(f0Var);
            return f0Var;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.".toString());
    }

    @CallSuper
    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        G7.j.d(decorView, "window.decorView");
        V.k(decorView, this);
        View decorView2 = getWindow().getDecorView();
        G7.j.d(decorView2, "window.decorView");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        G7.j.d(decorView3, "window.decorView");
        AbstractC2292b.j(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        G7.j.d(decorView4, "window.decorView");
        v0.z(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        G7.j.d(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i9, int i10, Intent intent) {
        if (!this.activityResultRegistry.a(i9, i10, intent)) {
            super.onActivityResult(i9, i10, intent);
        }
    }

    @Override // android.app.Activity
    @CallSuper
    public void onBackPressed() {
        getOnBackPressedDispatcher().d();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    @CallSuper
    public void onConfigurationChanged(Configuration configuration) {
        G7.j.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator<S.a> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // androidx.core.app.AbstractActivityC0412m, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.b(bundle);
        C2277a c2277a = this.contextAwareHelper;
        c2277a.getClass();
        c2277a.b = this;
        Iterator it = c2277a.f20412a.iterator();
        while (it.hasNext()) {
            ((InterfaceC2278b) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i9 = Q.f4860c;
        V.i(this);
        int i10 = this.contentLayoutId;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i9, Menu menu) {
        G7.j.e(menu, "menu");
        if (i9 == 0) {
            super.onCreatePanelMenu(i9, menu);
            C0284o c0284o = this.menuHostHelper;
            MenuInflater menuInflater = getMenuInflater();
            Iterator it = c0284o.b.iterator();
            while (it.hasNext()) {
                ((Z) ((InterfaceC0286q) it.next())).f4692a.dispatchCreateOptionsMenu(menu, menuInflater);
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i9, MenuItem menuItem) {
        G7.j.e(menuItem, "item");
        if (super.onMenuItemSelected(i9, menuItem)) {
            return true;
        }
        if (i9 == 0) {
            return this.menuHostHelper.a(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    @CallSuper
    public void onMultiWindowModeChanged(boolean z8) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<S.a> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new C0416q(z8));
        }
    }

    @Override // android.app.Activity
    @CallSuper
    public void onNewIntent(Intent intent) {
        G7.j.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator<S.a> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i9, Menu menu) {
        G7.j.e(menu, "menu");
        Iterator it = this.menuHostHelper.b.iterator();
        while (it.hasNext()) {
            ((Z) ((InterfaceC0286q) it.next())).f4692a.dispatchOptionsMenuClosed(menu);
        }
        super.onPanelClosed(i9, menu);
    }

    @Override // android.app.Activity
    @CallSuper
    public void onPictureInPictureModeChanged(boolean z8) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<S.a> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new n0(z8));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i9, View view, Menu menu) {
        G7.j.e(menu, "menu");
        if (i9 == 0) {
            super.onPreparePanel(i9, view, menu);
            Iterator it = this.menuHostHelper.b.iterator();
            while (it.hasNext()) {
                ((Z) ((InterfaceC0286q) it.next())).f4692a.dispatchPrepareOptionsMenu(menu);
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i9, String[] strArr, int[] iArr) {
        G7.j.e(strArr, "permissions");
        G7.j.e(iArr, "grantResults");
        if (!this.activityResultRegistry.a(i9, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i9, strArr, iArr);
        }
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [f.h, java.lang.Object] */
    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        h hVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        f0 f0Var = this._viewModelStore;
        if (f0Var == null && (hVar = (h) getLastNonConfigurationInstance()) != null) {
            f0Var = hVar.b;
        }
        if (f0Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f20216a = onRetainCustomNonConfigurationInstance;
        obj.b = f0Var;
        return obj;
    }

    @Override // androidx.core.app.AbstractActivityC0412m, android.app.Activity
    @CallSuper
    public void onSaveInstanceState(Bundle bundle) {
        G7.j.e(bundle, "outState");
        if (getLifecycle() instanceof C0513x) {
            AbstractC0505o lifecycle = getLifecycle();
            G7.j.c(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((C0513x) lifecycle).g(EnumC0504n.f4893d);
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    @CallSuper
    public void onTrimMemory(int i9) {
        super.onTrimMemory(i9);
        Iterator<S.a> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i9));
        }
    }

    @Override // android.app.Activity
    @CallSuper
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.b;
    }

    public final <I, O> h.c registerForActivityResult(AbstractC2330a abstractC2330a, h.i iVar, h.b bVar) {
        G7.j.e(abstractC2330a, "contract");
        G7.j.e(iVar, "registry");
        G7.j.e(bVar, "callback");
        return iVar.c("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, abstractC2330a, bVar);
    }

    @Override // T.InterfaceC0278k
    public void removeMenuProvider(InterfaceC0286q interfaceC0286q) {
        G7.j.e(interfaceC0286q, "provider");
        this.menuHostHelper.b(interfaceC0286q);
    }

    @Override // I.n
    public final void removeOnConfigurationChangedListener(S.a aVar) {
        G7.j.e(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.onConfigurationChangedListeners.remove(aVar);
    }

    public final void removeOnContextAvailableListener(InterfaceC2278b interfaceC2278b) {
        G7.j.e(interfaceC2278b, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C2277a c2277a = this.contextAwareHelper;
        c2277a.getClass();
        c2277a.f20412a.remove(interfaceC2278b);
    }

    @Override // androidx.core.app.j0
    public final void removeOnMultiWindowModeChangedListener(S.a aVar) {
        G7.j.e(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.onMultiWindowModeChangedListeners.remove(aVar);
    }

    public final void removeOnNewIntentListener(S.a aVar) {
        G7.j.e(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.onNewIntentListeners.remove(aVar);
    }

    @Override // androidx.core.app.k0
    public final void removeOnPictureInPictureModeChangedListener(S.a aVar) {
        G7.j.e(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.onPictureInPictureModeChangedListeners.remove(aVar);
    }

    @Override // I.o
    public final void removeOnTrimMemoryListener(S.a aVar) {
        G7.j.e(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.onTrimMemoryListeners.remove(aVar);
    }

    public final void removeOnUserLeaveHintListener(Runnable runnable) {
        G7.j.e(runnable, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.onUserLeaveHintListeners.remove(runnable);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (com.bumptech.glide.d.Q()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            n fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.b) {
                try {
                    fullyDrawnReporter.f20224c = true;
                    Iterator it = fullyDrawnReporter.f20225d.iterator();
                    while (it.hasNext()) {
                        ((F7.a) it.next()).invoke();
                    }
                    fullyDrawnReporter.f20225d.clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i9) {
        initializeViewTreeOwners();
        i iVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        G7.j.d(decorView, "window.decorView");
        ((j) iVar).a(decorView);
        super.setContentView(i9);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i9) {
        G7.j.e(intent, "intent");
        super.startActivityForResult(intent, i9);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i9, Intent intent, int i10, int i11, int i12) throws IntentSender.SendIntentException {
        G7.j.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i9, intent, i10, i11, i12);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i9, Bundle bundle) {
        G7.j.e(intent, "intent");
        super.startActivityForResult(intent, i9, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i9, Intent intent, int i10, int i11, int i12, Bundle bundle) throws IntentSender.SendIntentException {
        G7.j.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i9, intent, i10, i11, i12, bundle);
    }

    public final <I, O> h.c registerForActivityResult(AbstractC2330a abstractC2330a, h.b bVar) {
        G7.j.e(abstractC2330a, "contract");
        G7.j.e(bVar, "callback");
        return registerForActivityResult(abstractC2330a, this.activityResultRegistry, bVar);
    }

    @Override // android.app.Activity
    @RequiresApi(api = 26)
    @CallSuper
    public void onMultiWindowModeChanged(boolean z8, Configuration configuration) {
        G7.j.e(configuration, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z8, configuration);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<S.a> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new C0416q(z8));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    @RequiresApi(api = 26)
    @CallSuper
    public void onPictureInPictureModeChanged(boolean z8, Configuration configuration) {
        G7.j.e(configuration, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z8, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<S.a> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new n0(z8));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        i iVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        G7.j.d(decorView, "window.decorView");
        ((j) iVar).a(decorView);
        super.setContentView(view);
    }

    public void addMenuProvider(InterfaceC0286q interfaceC0286q, InterfaceC0511v interfaceC0511v) {
        G7.j.e(interfaceC0286q, "provider");
        G7.j.e(interfaceC0511v, "owner");
        C0284o c0284o = this.menuHostHelper;
        c0284o.b.add(interfaceC0286q);
        c0284o.f2915a.run();
        AbstractC0505o lifecycle = interfaceC0511v.getLifecycle();
        HashMap hashMap = c0284o.f2916c;
        C0283n c0283n = (C0283n) hashMap.remove(interfaceC0286q);
        if (c0283n != null) {
            c0283n.f2910a.b(c0283n.b);
            c0283n.b = null;
        }
        hashMap.put(interfaceC0286q, new C0283n(lifecycle, new C0282m(0, c0284o, interfaceC0286q)));
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        i iVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        G7.j.d(decorView, "window.decorView");
        ((j) iVar).a(decorView);
        super.setContentView(view, layoutParams);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(final InterfaceC0286q interfaceC0286q, InterfaceC0511v interfaceC0511v, final EnumC0504n enumC0504n) {
        G7.j.e(interfaceC0286q, "provider");
        G7.j.e(interfaceC0511v, "owner");
        G7.j.e(enumC0504n, "state");
        final C0284o c0284o = this.menuHostHelper;
        c0284o.getClass();
        AbstractC0505o lifecycle = interfaceC0511v.getLifecycle();
        HashMap hashMap = c0284o.f2916c;
        C0283n c0283n = (C0283n) hashMap.remove(interfaceC0286q);
        if (c0283n != null) {
            c0283n.f2910a.b(c0283n.b);
            c0283n.b = null;
        }
        hashMap.put(interfaceC0286q, new C0283n(lifecycle, new InterfaceC0509t() { // from class: T.l
            @Override // androidx.lifecycle.InterfaceC0509t
            public final void b(InterfaceC0511v interfaceC0511v2, EnumC0503m enumC0503m) {
                C0284o c0284o2 = C0284o.this;
                c0284o2.getClass();
                EnumC0503m.Companion.getClass();
                EnumC0504n enumC0504n2 = enumC0504n;
                EnumC0503m c9 = C0501k.c(enumC0504n2);
                Runnable runnable = c0284o2.f2915a;
                CopyOnWriteArrayList copyOnWriteArrayList = c0284o2.b;
                InterfaceC0286q interfaceC0286q2 = interfaceC0286q;
                if (enumC0503m == c9) {
                    copyOnWriteArrayList.add(interfaceC0286q2);
                    runnable.run();
                } else if (enumC0503m == EnumC0503m.ON_DESTROY) {
                    c0284o2.b(interfaceC0286q2);
                } else if (enumC0503m == C0501k.a(enumC0504n2)) {
                    copyOnWriteArrayList.remove(interfaceC0286q2);
                    runnable.run();
                }
            }
        }));
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    public l(int i9) {
        this();
        this.contentLayoutId = i9;
    }
}
