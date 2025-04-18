package androidx.appcompat.app;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.e;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.view.SupportActionModeWrapper;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.WindowCallbackWrapper;
import androidx.appcompat.view.menu.ListMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.DecorContentParent;
import androidx.appcompat.widget.FitWindowsViewGroup;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.appcompat.widget.TintTypedArray;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.VectorEnabledTintResources;
import androidx.appcompat.widget.ViewUtils;
import androidx.collection.LongSparseArray;
import androidx.collection.SimpleArrayMap;
import androidx.core.app.AppLocalesStorageHelper;
import androidx.core.app.NavUtils;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.os.LocaleListCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.core.view.WindowInsetsCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import org.objectweb.asm.Opcodes;

/* JADX INFO: Access modifiers changed from: package-private */
@RestrictTo
/* loaded from: classes.dex */
public class AppCompatDelegateImpl extends AppCompatDelegate implements MenuBuilder.Callback, LayoutInflater.Factory2 {

    /* renamed from: j0, reason: collision with root package name */
    public static final SimpleArrayMap f407j0 = new SimpleArrayMap(0);

    /* renamed from: k0, reason: collision with root package name */
    public static final int[] f408k0 = {R.attr.windowBackground};

    /* renamed from: l0, reason: collision with root package name */
    public static final boolean f409l0 = !"robolectric".equals(Build.FINGERPRINT);
    public boolean B;
    public ViewGroup C;
    public TextView D;
    public View E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public PanelFeatureState[] N;
    public PanelFeatureState O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public Configuration T;
    public final int U;
    public int V;
    public int W;
    public boolean X;
    public AutoTimeNightModeManager Y;
    public AutoBatteryNightModeManager Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f410a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f411b0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f413d0;

    /* renamed from: e0, reason: collision with root package name */
    public Rect f414e0;

    /* renamed from: f0, reason: collision with root package name */
    public Rect f415f0;

    /* renamed from: g0, reason: collision with root package name */
    public AppCompatViewInflater f416g0;

    /* renamed from: h0, reason: collision with root package name */
    public OnBackInvokedDispatcher f417h0;

    /* renamed from: i0, reason: collision with root package name */
    public OnBackInvokedCallback f418i0;

    /* renamed from: k, reason: collision with root package name */
    public final Object f419k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f420l;

    /* renamed from: m, reason: collision with root package name */
    public Window f421m;

    /* renamed from: n, reason: collision with root package name */
    public AppCompatWindowCallback f422n;

    /* renamed from: o, reason: collision with root package name */
    public final AppCompatCallback f423o;

    /* renamed from: p, reason: collision with root package name */
    public ActionBar f424p;

    /* renamed from: q, reason: collision with root package name */
    public SupportMenuInflater f425q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f426r;

    /* renamed from: s, reason: collision with root package name */
    public DecorContentParent f427s;

    /* renamed from: t, reason: collision with root package name */
    public ActionMenuPresenterCallback f428t;

    /* renamed from: u, reason: collision with root package name */
    public PanelMenuPresenterCallback f429u;

    /* renamed from: v, reason: collision with root package name */
    public ActionMode f430v;
    public ActionBarContextView w;
    public PopupWindow x;

    /* renamed from: y, reason: collision with root package name */
    public Runnable f431y;

    /* renamed from: z, reason: collision with root package name */
    public ViewPropertyAnimatorCompat f432z = null;
    public final boolean A = true;

    /* renamed from: c0, reason: collision with root package name */
    public final Runnable f412c0 = new AnonymousClass2();

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements Thread.UncaughtExceptionHandler {
        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            if (!(th instanceof Resources.NotFoundException)) {
                throw null;
            }
            String message = th.getMessage();
            if (message == null) {
                throw null;
            }
            if (!message.contains("drawable") && !message.contains("Drawable")) {
                throw null;
            }
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            throw null;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements Runnable {
        public AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.f411b0 & 1) != 0) {
                appCompatDelegateImpl.K(0);
            }
            if ((appCompatDelegateImpl.f411b0 & 4096) != 0) {
                appCompatDelegateImpl.K(108);
            }
            appCompatDelegateImpl.f410a0 = false;
            appCompatDelegateImpl.f411b0 = 0;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$4, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass4 implements FitWindowsViewGroup.OnFitSystemWindowsListener {
        @Override // androidx.appcompat.widget.FitWindowsViewGroup.OnFitSystemWindowsListener
        public final void a(Rect rect) {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public class ActionBarDrawableToggleImpl implements ActionBarDrawerToggle.Delegate {
        public ActionBarDrawableToggleImpl(AppCompatDelegateImpl appCompatDelegateImpl) {
        }
    }

    /* loaded from: classes.dex */
    public interface ActionBarMenuCallback {
        void a(int i2);

        View onCreatePanelView(int i2);
    }

    /* loaded from: classes.dex */
    public final class ActionMenuPresenterCallback implements MenuPresenter.Callback {
        public ActionMenuPresenterCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final boolean a(MenuBuilder menuBuilder) {
            Window.Callback callback = AppCompatDelegateImpl.this.f421m.getCallback();
            if (callback == null) {
                return true;
            }
            callback.onMenuOpened(108, menuBuilder);
            return true;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final void onCloseMenu(MenuBuilder menuBuilder, boolean z2) {
            AppCompatDelegateImpl.this.G(menuBuilder);
        }
    }

    /* loaded from: classes.dex */
    public class ActionModeCallbackWrapperV9 implements ActionMode.Callback {

        /* renamed from: a, reason: collision with root package name */
        public final ActionMode.Callback f440a;

        public ActionModeCallbackWrapperV9(ActionMode.Callback callback) {
            this.f440a = callback;
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public final void a(ActionMode actionMode) {
            this.f440a.a(actionMode);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.x != null) {
                appCompatDelegateImpl.f421m.getDecorView().removeCallbacks(appCompatDelegateImpl.f431y);
            }
            if (appCompatDelegateImpl.w != null) {
                ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = appCompatDelegateImpl.f432z;
                if (viewPropertyAnimatorCompat != null) {
                    viewPropertyAnimatorCompat.b();
                }
                ViewPropertyAnimatorCompat a2 = ViewCompat.a(appCompatDelegateImpl.w);
                a2.a(0.0f);
                appCompatDelegateImpl.f432z = a2;
                a2.d(new ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.ActionModeCallbackWrapperV9.1
                    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
                    public final void onAnimationEnd() {
                        ActionModeCallbackWrapperV9 actionModeCallbackWrapperV9 = ActionModeCallbackWrapperV9.this;
                        AppCompatDelegateImpl.this.w.setVisibility(8);
                        AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                        PopupWindow popupWindow = appCompatDelegateImpl2.x;
                        if (popupWindow != null) {
                            popupWindow.dismiss();
                        } else if (appCompatDelegateImpl2.w.getParent() instanceof View) {
                            ViewCompat.y((View) appCompatDelegateImpl2.w.getParent());
                        }
                        appCompatDelegateImpl2.w.g();
                        appCompatDelegateImpl2.f432z.d(null);
                        appCompatDelegateImpl2.f432z = null;
                        ViewCompat.y(appCompatDelegateImpl2.C);
                    }
                });
            }
            AppCompatCallback appCompatCallback = appCompatDelegateImpl.f423o;
            if (appCompatCallback != null) {
                appCompatCallback.onSupportActionModeFinished(appCompatDelegateImpl.f430v);
            }
            appCompatDelegateImpl.f430v = null;
            ViewCompat.y(appCompatDelegateImpl.C);
            appCompatDelegateImpl.X();
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public final boolean b(ActionMode actionMode, MenuBuilder menuBuilder) {
            return this.f440a.b(actionMode, menuBuilder);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public final boolean c(ActionMode actionMode, MenuItem menuItem) {
            return this.f440a.c(actionMode, menuItem);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public final boolean d(ActionMode actionMode, MenuBuilder menuBuilder) {
            ViewCompat.y(AppCompatDelegateImpl.this.C);
            return this.f440a.d(actionMode, menuBuilder);
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api21Impl {
        @DoNotInline
        public static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        @DoNotInline
        public static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api24Impl {
        @DoNotInline
        public static void a(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        @DoNotInline
        public static LocaleListCompat b(Configuration configuration) {
            return LocaleListCompat.b(configuration.getLocales().toLanguageTags());
        }

        @DoNotInline
        public static void c(LocaleListCompat localeListCompat) {
            LocaleList.setDefault(LocaleList.forLanguageTags(localeListCompat.f()));
        }

        @DoNotInline
        public static void d(Configuration configuration, LocaleListCompat localeListCompat) {
            configuration.setLocales(LocaleList.forLanguageTags(localeListCompat.f()));
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api26Impl {
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api33Impl {
        @DoNotInline
        public static OnBackInvokedDispatcher a(Activity activity) {
            OnBackInvokedDispatcher onBackInvokedDispatcher;
            onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            return onBackInvokedDispatcher;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.window.OnBackInvokedCallback, androidx.appcompat.app.c] */
        @DoNotInline
        public static OnBackInvokedCallback b(Object obj, final AppCompatDelegateImpl appCompatDelegateImpl) {
            Objects.requireNonNull(appCompatDelegateImpl);
            ?? r02 = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.c
                public final void onBackInvoked() {
                    AppCompatDelegateImpl.this.S();
                }
            };
            e.p(obj).registerOnBackInvokedCallback(1000000, r02);
            return r02;
        }

        @DoNotInline
        public static void c(Object obj, Object obj2) {
            e.p(obj).unregisterOnBackInvokedCallback(e.m(obj2));
        }
    }

    /* loaded from: classes.dex */
    public class AppCompatWindowCallback extends WindowCallbackWrapper {

        /* renamed from: b, reason: collision with root package name */
        public ActionBarMenuCallback f443b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f444c;
        public boolean d;

        /* renamed from: f, reason: collision with root package name */
        public boolean f445f;

        public AppCompatWindowCallback(Window.Callback callback) {
            super(callback);
        }

        public final void a(Window.Callback callback) {
            try {
                this.f444c = true;
                callback.onContentChanged();
            } finally {
                this.f444c = false;
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            boolean z2 = this.d;
            Window.Callback callback = this.f646a;
            return z2 ? callback.dispatchKeyEvent(keyEvent) : AppCompatDelegateImpl.this.J(keyEvent) || callback.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (this.f646a.dispatchKeyShortcutEvent(keyEvent)) {
                return true;
            }
            int keyCode = keyEvent.getKeyCode();
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.P();
            ActionBar actionBar = appCompatDelegateImpl.f424p;
            if (actionBar != null && actionBar.n(keyCode, keyEvent)) {
                return true;
            }
            PanelFeatureState panelFeatureState = appCompatDelegateImpl.O;
            if (panelFeatureState != null && appCompatDelegateImpl.U(panelFeatureState, keyEvent.getKeyCode(), keyEvent)) {
                PanelFeatureState panelFeatureState2 = appCompatDelegateImpl.O;
                if (panelFeatureState2 == null) {
                    return true;
                }
                panelFeatureState2.f462l = true;
                return true;
            }
            if (appCompatDelegateImpl.O == null) {
                PanelFeatureState O = appCompatDelegateImpl.O(0);
                appCompatDelegateImpl.V(O, keyEvent);
                boolean U = appCompatDelegateImpl.U(O, keyEvent.getKeyCode(), keyEvent);
                O.f461k = false;
                if (U) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final void onContentChanged() {
            if (this.f444c) {
                this.f646a.onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final boolean onCreatePanelMenu(int i2, Menu menu) {
            if (i2 != 0 || (menu instanceof MenuBuilder)) {
                return this.f646a.onCreatePanelMenu(i2, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final View onCreatePanelView(int i2) {
            View onCreatePanelView;
            ActionBarMenuCallback actionBarMenuCallback = this.f443b;
            return (actionBarMenuCallback == null || (onCreatePanelView = actionBarMenuCallback.onCreatePanelView(i2)) == null) ? this.f646a.onCreatePanelView(i2) : onCreatePanelView;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final boolean onMenuOpened(int i2, Menu menu) {
            super.onMenuOpened(i2, menu);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (i2 == 108) {
                appCompatDelegateImpl.P();
                ActionBar actionBar = appCompatDelegateImpl.f424p;
                if (actionBar != null) {
                    actionBar.h(true);
                }
            } else {
                appCompatDelegateImpl.getClass();
            }
            return true;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final void onPanelClosed(int i2, Menu menu) {
            if (this.f445f) {
                this.f646a.onPanelClosed(i2, menu);
                return;
            }
            super.onPanelClosed(i2, menu);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (i2 == 108) {
                appCompatDelegateImpl.P();
                ActionBar actionBar = appCompatDelegateImpl.f424p;
                if (actionBar != null) {
                    actionBar.h(false);
                    return;
                }
                return;
            }
            if (i2 != 0) {
                appCompatDelegateImpl.getClass();
                return;
            }
            PanelFeatureState O = appCompatDelegateImpl.O(i2);
            if (O.f463m) {
                appCompatDelegateImpl.H(O, false);
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final boolean onPreparePanel(int i2, View view, Menu menu) {
            MenuBuilder menuBuilder = menu instanceof MenuBuilder ? (MenuBuilder) menu : null;
            if (i2 == 0 && menuBuilder == null) {
                return false;
            }
            if (menuBuilder != null) {
                menuBuilder.setOverrideVisibleItems(true);
            }
            ActionBarMenuCallback actionBarMenuCallback = this.f443b;
            if (actionBarMenuCallback != null) {
                actionBarMenuCallback.a(i2);
            }
            boolean onPreparePanel = this.f646a.onPreparePanel(i2, view, menu);
            if (menuBuilder != null) {
                menuBuilder.setOverrideVisibleItems(false);
            }
            return onPreparePanel;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final void onProvideKeyboardShortcuts(List list, Menu menu, int i2) {
            MenuBuilder menuBuilder = AppCompatDelegateImpl.this.O(0).f458h;
            if (menuBuilder != null) {
                super.onProvideKeyboardShortcuts(list, menuBuilder, i2);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i2);
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.A && i2 == 0) {
                SupportActionModeWrapper.CallbackWrapper callbackWrapper = new SupportActionModeWrapper.CallbackWrapper(appCompatDelegateImpl.f420l, callback);
                androidx.appcompat.view.ActionMode B = appCompatDelegateImpl.B(callbackWrapper);
                if (B != null) {
                    return callbackWrapper.e(B);
                }
                return null;
            }
            return super.onWindowStartingActionMode(callback, i2);
        }
    }

    /* loaded from: classes.dex */
    public class AutoBatteryNightModeManager extends AutoNightModeManager {

        /* renamed from: c, reason: collision with root package name */
        public final PowerManager f447c;

        public AutoBatteryNightModeManager(Context context) {
            super();
            this.f447c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public final int c() {
            return Api21Impl.a(this.f447c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public final void d() {
            AppCompatDelegateImpl.this.C(true, true);
        }
    }

    @RestrictTo
    @VisibleForTesting
    /* loaded from: classes.dex */
    public abstract class AutoNightModeManager {

        /* renamed from: a, reason: collision with root package name */
        public BroadcastReceiver f448a;

        public AutoNightModeManager() {
        }

        public final void a() {
            BroadcastReceiver broadcastReceiver = this.f448a;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.f420l.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f448a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public final void e() {
            a();
            IntentFilter b2 = b();
            if (b2 == null || b2.countActions() == 0) {
                return;
            }
            if (this.f448a == null) {
                this.f448a = new BroadcastReceiver() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager.1
                    @Override // android.content.BroadcastReceiver
                    public final void onReceive(Context context, Intent intent) {
                        AutoNightModeManager.this.d();
                    }
                };
            }
            AppCompatDelegateImpl.this.f420l.registerReceiver(this.f448a, b2);
        }
    }

    /* loaded from: classes.dex */
    public class AutoTimeNightModeManager extends AutoNightModeManager {

        /* renamed from: c, reason: collision with root package name */
        public final TwilightManager f451c;

        public AutoTimeNightModeManager(TwilightManager twilightManager) {
            super();
            this.f451c = twilightManager;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x00fb A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, androidx.appcompat.app.TwilightCalculator] */
        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int c() {
            /*
                Method dump skipped, instructions count: 253
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.AutoTimeNightModeManager.c():int");
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public final void d() {
            AppCompatDelegateImpl.this.C(true, true);
        }
    }

    /* loaded from: classes.dex */
    public class ListMenuDecorView extends ContentFrameLayout {
        public ListMenuDecorView(ContextThemeWrapper contextThemeWrapper) {
            super(contextThemeWrapper, null);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.J(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y2 = (int) motionEvent.getY();
                if (x < -5 || y2 < -5 || x > getWidth() + 5 || y2 > getHeight() + 5) {
                    AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                    appCompatDelegateImpl.H(appCompatDelegateImpl.O(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public final void setBackgroundResource(int i2) {
            setBackgroundDrawable(AppCompatResources.a(getContext(), i2));
        }
    }

    /* loaded from: classes.dex */
    public static final class PanelFeatureState {

        /* renamed from: a, reason: collision with root package name */
        public int f453a;

        /* renamed from: b, reason: collision with root package name */
        public int f454b;

        /* renamed from: c, reason: collision with root package name */
        public int f455c;
        public int d;
        public ViewGroup e;

        /* renamed from: f, reason: collision with root package name */
        public View f456f;

        /* renamed from: g, reason: collision with root package name */
        public View f457g;

        /* renamed from: h, reason: collision with root package name */
        public MenuBuilder f458h;

        /* renamed from: i, reason: collision with root package name */
        public ListMenuPresenter f459i;

        /* renamed from: j, reason: collision with root package name */
        public ContextThemeWrapper f460j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f461k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f462l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f463m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f464n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f465o;

        /* renamed from: p, reason: collision with root package name */
        public Bundle f466p;

        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes.dex */
        public static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new Object();

            /* renamed from: a, reason: collision with root package name */
            public int f467a;

            /* renamed from: b, reason: collision with root package name */
            public boolean f468b;

            /* renamed from: c, reason: collision with root package name */
            public Bundle f469c;

            /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState$1, reason: invalid class name */
            /* loaded from: classes.dex */
            public class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
                @Override // android.os.Parcelable.ClassLoaderCreator
                public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.b(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i2) {
                    return new SavedState[i2];
                }

                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    return SavedState.b(parcel, null);
                }
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState] */
            public static SavedState b(Parcel parcel, ClassLoader classLoader) {
                ?? obj = new Object();
                obj.f467a = parcel.readInt();
                boolean z2 = parcel.readInt() == 1;
                obj.f468b = z2;
                if (z2) {
                    obj.f469c = parcel.readBundle(classLoader);
                }
                return obj;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i2) {
                parcel.writeInt(this.f467a);
                parcel.writeInt(this.f468b ? 1 : 0);
                if (this.f468b) {
                    parcel.writeBundle(this.f469c);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public final class PanelMenuPresenterCallback implements MenuPresenter.Callback {
        public PanelMenuPresenterCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final boolean a(MenuBuilder menuBuilder) {
            Window.Callback callback;
            if (menuBuilder != menuBuilder.getRootMenu()) {
                return true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.H || (callback = appCompatDelegateImpl.f421m.getCallback()) == null || appCompatDelegateImpl.S) {
                return true;
            }
            callback.onMenuOpened(108, menuBuilder);
            return true;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final void onCloseMenu(MenuBuilder menuBuilder, boolean z2) {
            PanelFeatureState panelFeatureState;
            MenuBuilder rootMenu = menuBuilder.getRootMenu();
            int i2 = 0;
            boolean z3 = rootMenu != menuBuilder;
            if (z3) {
                menuBuilder = rootMenu;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            PanelFeatureState[] panelFeatureStateArr = appCompatDelegateImpl.N;
            int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
            while (true) {
                if (i2 < length) {
                    panelFeatureState = panelFeatureStateArr[i2];
                    if (panelFeatureState != null && panelFeatureState.f458h == menuBuilder) {
                        break;
                    } else {
                        i2++;
                    }
                } else {
                    panelFeatureState = null;
                    break;
                }
            }
            if (panelFeatureState != null) {
                if (!z3) {
                    appCompatDelegateImpl.H(panelFeatureState, z2);
                } else {
                    appCompatDelegateImpl.F(panelFeatureState.f453a, panelFeatureState, rootMenu);
                    appCompatDelegateImpl.H(panelFeatureState, true);
                }
            }
        }
    }

    public AppCompatDelegateImpl(Context context, Window window, AppCompatCallback appCompatCallback, Object obj) {
        AppCompatActivity appCompatActivity = null;
        this.U = -100;
        this.f420l = context;
        this.f423o = appCompatCallback;
        this.f419k = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof AppCompatActivity)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        appCompatActivity = (AppCompatActivity) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (appCompatActivity != null) {
                this.U = appCompatActivity.getDelegate().f();
            }
        }
        if (this.U == -100) {
            SimpleArrayMap simpleArrayMap = f407j0;
            Integer num = (Integer) simpleArrayMap.get(this.f419k.getClass().getName());
            if (num != null) {
                this.U = num.intValue();
                simpleArrayMap.remove(this.f419k.getClass().getName());
            }
        }
        if (window != null) {
            D(window);
        }
        AppCompatDrawableManager.d();
    }

    public static LocaleListCompat E(Context context) {
        LocaleListCompat localeListCompat;
        LocaleListCompat a2;
        if (Build.VERSION.SDK_INT >= 33 || (localeListCompat = AppCompatDelegate.f398c) == null) {
            return null;
        }
        LocaleListCompat b2 = Api24Impl.b(context.getApplicationContext().getResources().getConfiguration());
        if (localeListCompat.d()) {
            a2 = LocaleListCompat.f18612b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i2 = 0;
            while (i2 < b2.e() + localeListCompat.e()) {
                Locale c2 = i2 < localeListCompat.e() ? localeListCompat.c(i2) : b2.c(i2 - localeListCompat.e());
                if (c2 != null) {
                    linkedHashSet.add(c2);
                }
                i2++;
            }
            a2 = LocaleListCompat.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return a2.d() ? b2 : a2;
    }

    public static Configuration I(Context context, int i2, LocaleListCompat localeListCompat, Configuration configuration, boolean z2) {
        int i3 = i2 != 1 ? i2 != 2 ? z2 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        if (localeListCompat != null) {
            Api24Impl.d(configuration2, localeListCompat);
        }
        return configuration2;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void A(CharSequence charSequence) {
        this.f426r = charSequence;
        DecorContentParent decorContentParent = this.f427s;
        if (decorContentParent != null) {
            decorContentParent.setWindowTitle(charSequence);
            return;
        }
        ActionBar actionBar = this.f424p;
        if (actionBar != null) {
            actionBar.s(charSequence);
            return;
        }
        TextView textView = this.D;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0049  */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, androidx.appcompat.view.StandaloneActionMode, androidx.appcompat.view.menu.MenuBuilder$Callback, androidx.appcompat.view.ActionMode] */
    @Override // androidx.appcompat.app.AppCompatDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.appcompat.view.ActionMode B(androidx.appcompat.view.ActionMode.Callback r9) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.B(androidx.appcompat.view.ActionMode$Callback):androidx.appcompat.view.ActionMode");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0100 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean C(boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.C(boolean, boolean):boolean");
    }

    public final void D(Window window) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        if (this.f421m != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof AppCompatWindowCallback) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        AppCompatWindowCallback appCompatWindowCallback = new AppCompatWindowCallback(callback);
        this.f422n = appCompatWindowCallback;
        window.setCallback(appCompatWindowCallback);
        int[] iArr = f408k0;
        Context context = this.f420l;
        TintTypedArray tintTypedArray = new TintTypedArray(context, context.obtainStyledAttributes((AttributeSet) null, iArr));
        Drawable c2 = tintTypedArray.c(0);
        if (c2 != null) {
            window.setBackgroundDrawable(c2);
        }
        tintTypedArray.f();
        this.f421m = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f417h0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f418i0) != null) {
            Api33Impl.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f418i0 = null;
        }
        Object obj = this.f419k;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f417h0 = Api33Impl.a(activity);
                X();
            }
        }
        this.f417h0 = null;
        X();
    }

    public final void F(int i2, PanelFeatureState panelFeatureState, MenuBuilder menuBuilder) {
        if (menuBuilder == null) {
            if (panelFeatureState == null && i2 >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.N;
                if (i2 < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i2];
                }
            }
            if (panelFeatureState != null) {
                menuBuilder = panelFeatureState.f458h;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f463m) && !this.S) {
            AppCompatWindowCallback appCompatWindowCallback = this.f422n;
            Window.Callback callback = this.f421m.getCallback();
            appCompatWindowCallback.getClass();
            try {
                appCompatWindowCallback.f445f = true;
                callback.onPanelClosed(i2, menuBuilder);
            } finally {
                appCompatWindowCallback.f445f = false;
            }
        }
    }

    public final void G(MenuBuilder menuBuilder) {
        if (this.M) {
            return;
        }
        this.M = true;
        this.f427s.i();
        Window.Callback callback = this.f421m.getCallback();
        if (callback != null && !this.S) {
            callback.onPanelClosed(108, menuBuilder);
        }
        this.M = false;
    }

    public final void H(PanelFeatureState panelFeatureState, boolean z2) {
        ViewGroup viewGroup;
        DecorContentParent decorContentParent;
        if (z2 && panelFeatureState.f453a == 0 && (decorContentParent = this.f427s) != null && decorContentParent.e()) {
            G(panelFeatureState.f458h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f420l.getSystemService("window");
        if (windowManager != null && panelFeatureState.f463m && (viewGroup = panelFeatureState.e) != null) {
            windowManager.removeView(viewGroup);
            if (z2) {
                F(panelFeatureState.f453a, panelFeatureState, null);
            }
        }
        panelFeatureState.f461k = false;
        panelFeatureState.f462l = false;
        panelFeatureState.f463m = false;
        panelFeatureState.f456f = null;
        panelFeatureState.f464n = true;
        if (this.O == panelFeatureState) {
            this.O = null;
        }
        if (panelFeatureState.f453a == 0) {
            X();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean J(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.J(android.view.KeyEvent):boolean");
    }

    public final void K(int i2) {
        PanelFeatureState O = O(i2);
        if (O.f458h != null) {
            Bundle bundle = new Bundle();
            O.f458h.saveActionViewStates(bundle);
            if (bundle.size() > 0) {
                O.f466p = bundle;
            }
            O.f458h.stopDispatchingItemsChanged();
            O.f458h.clear();
        }
        O.f465o = true;
        O.f464n = true;
        if ((i2 == 108 || i2 == 0) && this.f427s != null) {
            PanelFeatureState O2 = O(0);
            O2.f461k = false;
            V(O2, null);
        }
    }

    public final void L() {
        ViewGroup viewGroup;
        if (this.B) {
            return;
        }
        int[] iArr = androidx.appcompat.R.styleable.f318j;
        Context context = this.f420l;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(Opcodes.LNEG)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(126, false)) {
            u(1);
        } else if (obtainStyledAttributes.getBoolean(Opcodes.LNEG, false)) {
            u(108);
        }
        if (obtainStyledAttributes.getBoolean(Opcodes.FNEG, false)) {
            u(109);
        }
        if (obtainStyledAttributes.getBoolean(Opcodes.DNEG, false)) {
            u(10);
        }
        this.K = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        M();
        this.f421m.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.L) {
            viewGroup = this.J ? (ViewGroup) from.inflate(com.cooldev.gba.emulator.gameboy.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.cooldev.gba.emulator.gameboy.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.K) {
            viewGroup = (ViewGroup) from.inflate(com.cooldev.gba.emulator.gameboy.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.I = false;
            this.H = false;
        } else if (this.H) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.cooldev.gba.emulator.gameboy.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new ContextThemeWrapper(context, typedValue.resourceId) : context).inflate(com.cooldev.gba.emulator.gameboy.R.layout.abc_screen_toolbar, (ViewGroup) null);
            DecorContentParent decorContentParent = (DecorContentParent) viewGroup.findViewById(com.cooldev.gba.emulator.gameboy.R.id.decor_content_parent);
            this.f427s = decorContentParent;
            decorContentParent.setWindowCallback(this.f421m.getCallback());
            if (this.I) {
                this.f427s.h(109);
            }
            if (this.F) {
                this.f427s.h(2);
            }
            if (this.G) {
                this.f427s.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.H + ", windowActionBarOverlay: " + this.I + ", android:windowIsFloating: " + this.K + ", windowActionModeOverlay: " + this.J + ", windowNoTitle: " + this.L + " }");
        }
        ViewCompat.H(viewGroup, new OnApplyWindowInsetsListener() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.3
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                int k2 = windowInsetsCompat.k();
                int Y = AppCompatDelegateImpl.this.Y(windowInsetsCompat, null);
                if (k2 != Y) {
                    windowInsetsCompat = windowInsetsCompat.q(windowInsetsCompat.i(), Y, windowInsetsCompat.j(), windowInsetsCompat.h());
                }
                return ViewCompat.u(view, windowInsetsCompat);
            }
        });
        if (this.f427s == null) {
            this.D = (TextView) viewGroup.findViewById(com.cooldev.gba.emulator.gameboy.R.id.title);
        }
        boolean z2 = ViewUtils.f1295a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.cooldev.gba.emulator.gameboy.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f421m.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f421m.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new ContentFrameLayout.OnAttachListener() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.5
            @Override // androidx.appcompat.widget.ContentFrameLayout.OnAttachListener
            public final void a() {
            }

            @Override // androidx.appcompat.widget.ContentFrameLayout.OnAttachListener
            public final void onDetachedFromWindow() {
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                DecorContentParent decorContentParent2 = appCompatDelegateImpl.f427s;
                if (decorContentParent2 != null) {
                    decorContentParent2.i();
                }
                if (appCompatDelegateImpl.x != null) {
                    appCompatDelegateImpl.f421m.getDecorView().removeCallbacks(appCompatDelegateImpl.f431y);
                    if (appCompatDelegateImpl.x.isShowing()) {
                        try {
                            appCompatDelegateImpl.x.dismiss();
                        } catch (IllegalArgumentException unused2) {
                        }
                    }
                    appCompatDelegateImpl.x = null;
                }
                ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = appCompatDelegateImpl.f432z;
                if (viewPropertyAnimatorCompat != null) {
                    viewPropertyAnimatorCompat.b();
                }
                MenuBuilder menuBuilder = appCompatDelegateImpl.O(0).f458h;
                if (menuBuilder != null) {
                    menuBuilder.close();
                }
            }
        });
        this.C = viewGroup;
        Object obj = this.f419k;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f426r;
        if (!TextUtils.isEmpty(title)) {
            DecorContentParent decorContentParent2 = this.f427s;
            if (decorContentParent2 != null) {
                decorContentParent2.setWindowTitle(title);
            } else {
                ActionBar actionBar = this.f424p;
                if (actionBar != null) {
                    actionBar.s(title);
                } else {
                    TextView textView = this.D;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.C.findViewById(R.id.content);
        View decorView = this.f421m.getDecorView();
        contentFrameLayout2.f1091h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(Opcodes.LUSHR, contentFrameLayout2.getMinWidthMinor());
        if (obtainStyledAttributes2.hasValue(122)) {
            obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (obtainStyledAttributes2.hasValue(Opcodes.LSHR)) {
            obtainStyledAttributes2.getValue(Opcodes.LSHR, contentFrameLayout2.getFixedWidthMinor());
        }
        if (obtainStyledAttributes2.hasValue(120)) {
            obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (obtainStyledAttributes2.hasValue(Opcodes.LSHL)) {
            obtainStyledAttributes2.getValue(Opcodes.LSHL, contentFrameLayout2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.B = true;
        PanelFeatureState O = O(0);
        if (this.S || O.f458h != null) {
            return;
        }
        Q(108);
    }

    public final void M() {
        if (this.f421m == null) {
            Object obj = this.f419k;
            if (obj instanceof Activity) {
                D(((Activity) obj).getWindow());
            }
        }
        if (this.f421m == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final AutoNightModeManager N(Context context) {
        if (this.Y == null) {
            if (TwilightManager.d == null) {
                Context applicationContext = context.getApplicationContext();
                TwilightManager.d = new TwilightManager(applicationContext, (LocationManager) applicationContext.getSystemService(FirebaseAnalytics.Param.LOCATION));
            }
            this.Y = new AutoTimeNightModeManager(TwilightManager.d);
        }
        return this.Y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
    
        if (r2 <= r5) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState O(int r5) {
        /*
            r4 = this;
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState[] r0 = r4.N
            r1 = 0
            if (r0 == 0) goto L8
            int r2 = r0.length
            if (r2 > r5) goto L15
        L8:
            int r2 = r5 + 1
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState[] r2 = new androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState[r2]
            if (r0 == 0) goto L12
            int r3 = r0.length
            java.lang.System.arraycopy(r0, r1, r2, r1, r3)
        L12:
            r4.N = r2
            r0 = r2
        L15:
            r2 = r0[r5]
            if (r2 != 0) goto L24
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r2 = new androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState
            r2.<init>()
            r2.f453a = r5
            r2.f464n = r1
            r0[r5] = r2
        L24:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.O(int):androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState");
    }

    public final void P() {
        L();
        if (this.H && this.f424p == null) {
            Object obj = this.f419k;
            if (obj instanceof Activity) {
                this.f424p = new WindowDecorActionBar(this.I, (Activity) obj);
            } else if (obj instanceof Dialog) {
                this.f424p = new WindowDecorActionBar((Dialog) obj);
            }
            ActionBar actionBar = this.f424p;
            if (actionBar != null) {
                actionBar.q(this.f413d0);
            }
        }
    }

    public final void Q(int i2) {
        this.f411b0 = (1 << i2) | this.f411b0;
        if (this.f410a0) {
            return;
        }
        View decorView = this.f421m.getDecorView();
        Runnable runnable = this.f412c0;
        WeakHashMap weakHashMap = ViewCompat.f18740a;
        decorView.postOnAnimation(runnable);
        this.f410a0 = true;
    }

    public final int R(int i2, Context context) {
        if (i2 == -100) {
            return -1;
        }
        if (i2 == -1) {
            return i2;
        }
        if (i2 == 0) {
            if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            }
            return N(context).c();
        }
        if (i2 == 1 || i2 == 2) {
            return i2;
        }
        if (i2 != 3) {
            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
        }
        if (this.Z == null) {
            this.Z = new AutoBatteryNightModeManager(context);
        }
        return this.Z.c();
    }

    public final boolean S() {
        boolean z2 = this.P;
        this.P = false;
        PanelFeatureState O = O(0);
        if (O.f463m) {
            if (!z2) {
                H(O, true);
            }
            return true;
        }
        androidx.appcompat.view.ActionMode actionMode = this.f430v;
        if (actionMode != null) {
            actionMode.a();
            return true;
        }
        P();
        ActionBar actionBar = this.f424p;
        return actionBar != null && actionBar.g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x012c, code lost:
    
        if (r3 != null) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.T(androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState, android.view.KeyEvent):void");
    }

    public final boolean U(PanelFeatureState panelFeatureState, int i2, KeyEvent keyEvent) {
        MenuBuilder menuBuilder;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f461k || V(panelFeatureState, keyEvent)) && (menuBuilder = panelFeatureState.f458h) != null) {
            return menuBuilder.performShortcut(i2, keyEvent, 1);
        }
        return false;
    }

    public final boolean V(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        DecorContentParent decorContentParent;
        DecorContentParent decorContentParent2;
        Resources.Theme theme;
        DecorContentParent decorContentParent3;
        DecorContentParent decorContentParent4;
        if (this.S) {
            return false;
        }
        if (panelFeatureState.f461k) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.O;
        if (panelFeatureState2 != null && panelFeatureState2 != panelFeatureState) {
            H(panelFeatureState2, false);
        }
        Window.Callback callback = this.f421m.getCallback();
        int i2 = panelFeatureState.f453a;
        if (callback != null) {
            panelFeatureState.f457g = callback.onCreatePanelView(i2);
        }
        boolean z2 = i2 == 0 || i2 == 108;
        if (z2 && (decorContentParent4 = this.f427s) != null) {
            decorContentParent4.f();
        }
        if (panelFeatureState.f457g == null && (!z2 || !(this.f424p instanceof ToolbarActionBar))) {
            MenuBuilder menuBuilder = panelFeatureState.f458h;
            if (menuBuilder == null || panelFeatureState.f465o) {
                if (menuBuilder == null) {
                    Context context = this.f420l;
                    if ((i2 == 0 || i2 == 108) && this.f427s != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(com.cooldev.gba.emulator.gameboy.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(com.cooldev.gba.emulator.gameboy.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(com.cooldev.gba.emulator.gameboy.R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 0);
                            contextThemeWrapper.getTheme().setTo(theme);
                            context = contextThemeWrapper;
                        }
                    }
                    MenuBuilder menuBuilder2 = new MenuBuilder(context);
                    menuBuilder2.setCallback(this);
                    MenuBuilder menuBuilder3 = panelFeatureState.f458h;
                    if (menuBuilder2 != menuBuilder3) {
                        if (menuBuilder3 != null) {
                            menuBuilder3.removeMenuPresenter(panelFeatureState.f459i);
                        }
                        panelFeatureState.f458h = menuBuilder2;
                        ListMenuPresenter listMenuPresenter = panelFeatureState.f459i;
                        if (listMenuPresenter != null) {
                            menuBuilder2.addMenuPresenter(listMenuPresenter);
                        }
                    }
                    if (panelFeatureState.f458h == null) {
                        return false;
                    }
                }
                if (z2 && (decorContentParent2 = this.f427s) != null) {
                    if (this.f428t == null) {
                        this.f428t = new ActionMenuPresenterCallback();
                    }
                    decorContentParent2.b(panelFeatureState.f458h, this.f428t);
                }
                panelFeatureState.f458h.stopDispatchingItemsChanged();
                if (!callback.onCreatePanelMenu(i2, panelFeatureState.f458h)) {
                    MenuBuilder menuBuilder4 = panelFeatureState.f458h;
                    if (menuBuilder4 != null) {
                        if (menuBuilder4 != null) {
                            menuBuilder4.removeMenuPresenter(panelFeatureState.f459i);
                        }
                        panelFeatureState.f458h = null;
                    }
                    if (z2 && (decorContentParent = this.f427s) != null) {
                        decorContentParent.b(null, this.f428t);
                    }
                    return false;
                }
                panelFeatureState.f465o = false;
            }
            panelFeatureState.f458h.stopDispatchingItemsChanged();
            Bundle bundle = panelFeatureState.f466p;
            if (bundle != null) {
                panelFeatureState.f458h.restoreActionViewStates(bundle);
                panelFeatureState.f466p = null;
            }
            if (!callback.onPreparePanel(0, panelFeatureState.f457g, panelFeatureState.f458h)) {
                if (z2 && (decorContentParent3 = this.f427s) != null) {
                    decorContentParent3.b(null, this.f428t);
                }
                panelFeatureState.f458h.startDispatchingItemsChanged();
                return false;
            }
            panelFeatureState.f458h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            panelFeatureState.f458h.startDispatchingItemsChanged();
        }
        panelFeatureState.f461k = true;
        panelFeatureState.f462l = false;
        this.O = panelFeatureState;
        return true;
    }

    public final void W() {
        if (this.B) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void X() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z2 = false;
            if (this.f417h0 != null && (O(0).f463m || this.f430v != null)) {
                z2 = true;
            }
            if (z2 && this.f418i0 == null) {
                this.f418i0 = Api33Impl.b(this.f417h0, this);
            } else {
                if (z2 || (onBackInvokedCallback = this.f418i0) == null) {
                    return;
                }
                Api33Impl.c(this.f417h0, onBackInvokedCallback);
                this.f418i0 = null;
            }
        }
    }

    public final int Y(WindowInsetsCompat windowInsetsCompat, Rect rect) {
        boolean z2;
        boolean z3;
        int k2 = windowInsetsCompat != null ? windowInsetsCompat.k() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.w;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.w.getLayoutParams();
            if (this.w.isShown()) {
                if (this.f414e0 == null) {
                    this.f414e0 = new Rect();
                    this.f415f0 = new Rect();
                }
                Rect rect2 = this.f414e0;
                Rect rect3 = this.f415f0;
                if (windowInsetsCompat == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(windowInsetsCompat.i(), windowInsetsCompat.k(), windowInsetsCompat.j(), windowInsetsCompat.h());
                }
                ViewUtils.a(this.C, rect2, rect3);
                int i2 = rect2.top;
                int i3 = rect2.left;
                int i4 = rect2.right;
                WindowInsetsCompat n2 = ViewCompat.n(this.C);
                int i5 = n2 == null ? 0 : n2.i();
                int j2 = n2 == null ? 0 : n2.j();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z3 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z3 = true;
                }
                Context context = this.f420l;
                if (i2 <= 0 || this.E != null) {
                    View view = this.E;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i6 = marginLayoutParams2.height;
                        int i7 = marginLayoutParams.topMargin;
                        if (i6 != i7 || marginLayoutParams2.leftMargin != i5 || marginLayoutParams2.rightMargin != j2) {
                            marginLayoutParams2.height = i7;
                            marginLayoutParams2.leftMargin = i5;
                            marginLayoutParams2.rightMargin = j2;
                            this.E.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(context);
                    this.E = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i5;
                    layoutParams.rightMargin = j2;
                    this.C.addView(this.E, -1, layoutParams);
                }
                View view3 = this.E;
                r5 = view3 != null;
                if (r5 && view3.getVisibility() != 0) {
                    View view4 = this.E;
                    view4.setBackgroundColor((view4.getWindowSystemUiVisibility() & 8192) != 0 ? ContextCompat.getColor(context, com.cooldev.gba.emulator.gameboy.R.color.abc_decor_view_status_guard_light) : ContextCompat.getColor(context, com.cooldev.gba.emulator.gameboy.R.color.abc_decor_view_status_guard));
                }
                if (!this.J && r5) {
                    k2 = 0;
                }
                z2 = r5;
                r5 = z3;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = false;
            } else {
                z2 = false;
                r5 = false;
            }
            if (r5) {
                this.w.setLayoutParams(marginLayoutParams);
            }
        }
        View view5 = this.E;
        if (view5 != null) {
            view5.setVisibility(z2 ? 0 : 8);
        }
        return k2;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void a(View view, ViewGroup.LayoutParams layoutParams) {
        L();
        ((ViewGroup) this.C.findViewById(R.id.content)).addView(view, layoutParams);
        this.f422n.a(this.f421m.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final Context b(final Context context) {
        this.Q = true;
        int i2 = this.U;
        if (i2 == -100) {
            i2 = AppCompatDelegate.f397b;
        }
        int R = R(i2, context);
        if (AppCompatDelegate.k(context) && AppCompatDelegate.k(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (AppCompatDelegate.f403j) {
                    try {
                        LocaleListCompat localeListCompat = AppCompatDelegate.f398c;
                        if (localeListCompat == null) {
                            if (AppCompatDelegate.d == null) {
                                AppCompatDelegate.d = LocaleListCompat.b(AppLocalesStorageHelper.b(context));
                            }
                            if (!AppCompatDelegate.d.d()) {
                                AppCompatDelegate.f398c = AppCompatDelegate.d;
                            }
                        } else if (!localeListCompat.equals(AppCompatDelegate.d)) {
                            LocaleListCompat localeListCompat2 = AppCompatDelegate.f398c;
                            AppCompatDelegate.d = localeListCompat2;
                            AppLocalesStorageHelper.a(context, localeListCompat2.f());
                        }
                    } finally {
                    }
                }
            } else if (!AppCompatDelegate.f400g) {
                AppCompatDelegate.f396a.execute(new Runnable() { // from class: androidx.appcompat.app.a
                    /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
                    
                        if (r0 != null) goto L23;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void run() {
                        /*
                            r7 = this;
                            int r0 = android.os.Build.VERSION.SDK_INT
                            r1 = 1
                            r2 = 33
                            if (r0 < r2) goto L79
                            androidx.appcompat.app.AppCompatDelegate$SerialExecutor r3 = androidx.appcompat.app.AppCompatDelegate.f396a
                            android.content.ComponentName r3 = new android.content.ComponentName
                            java.lang.String r4 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
                            android.content.Context r5 = r1
                            r3.<init>(r5, r4)
                            android.content.pm.PackageManager r4 = r5.getPackageManager()
                            int r4 = r4.getComponentEnabledSetting(r3)
                            if (r4 == r1) goto L79
                            java.lang.String r4 = "locale"
                            if (r0 < r2) goto L54
                            androidx.collection.ArraySet r0 = androidx.appcompat.app.AppCompatDelegate.f401h
                            java.util.Iterator r0 = r0.iterator()
                        L26:
                            r2 = r0
                            androidx.collection.IndexBasedArrayIterator r2 = (androidx.collection.IndexBasedArrayIterator) r2
                            boolean r6 = r2.hasNext()
                            if (r6 == 0) goto L48
                            java.lang.Object r2 = r2.next()
                            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
                            java.lang.Object r2 = r2.get()
                            androidx.appcompat.app.AppCompatDelegate r2 = (androidx.appcompat.app.AppCompatDelegate) r2
                            if (r2 == 0) goto L26
                            android.content.Context r2 = r2.d()
                            if (r2 == 0) goto L26
                            java.lang.Object r0 = r2.getSystemService(r4)
                            goto L49
                        L48:
                            r0 = 0
                        L49:
                            if (r0 == 0) goto L59
                            android.os.LocaleList r0 = androidx.appcompat.app.AppCompatDelegate.Api33Impl.a(r0)
                            androidx.core.os.LocaleListCompat r0 = androidx.core.os.LocaleListCompat.g(r0)
                            goto L5b
                        L54:
                            androidx.core.os.LocaleListCompat r0 = androidx.appcompat.app.AppCompatDelegate.f398c
                            if (r0 == 0) goto L59
                            goto L5b
                        L59:
                            androidx.core.os.LocaleListCompat r0 = androidx.core.os.LocaleListCompat.f18612b
                        L5b:
                            boolean r0 = r0.d()
                            if (r0 == 0) goto L72
                            java.lang.String r0 = androidx.core.app.AppLocalesStorageHelper.b(r5)
                            java.lang.Object r2 = r5.getSystemService(r4)
                            if (r2 == 0) goto L72
                            android.os.LocaleList r0 = androidx.appcompat.app.AppCompatDelegate.Api24Impl.a(r0)
                            androidx.appcompat.app.AppCompatDelegate.Api33Impl.b(r2, r0)
                        L72:
                            android.content.pm.PackageManager r0 = r5.getPackageManager()
                            r0.setComponentEnabledSetting(r3, r1, r1)
                        L79:
                            androidx.appcompat.app.AppCompatDelegate.f400g = r1
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.a.run():void");
                    }
                });
            }
        }
        LocaleListCompat E = E(context);
        Configuration configuration = null;
        if (context instanceof android.view.ContextThemeWrapper) {
            try {
                ((android.view.ContextThemeWrapper) context).applyOverrideConfiguration(I(context, R, E, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).a(I(context, R, E, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f409l0) {
            return context;
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = new Configuration();
            configuration.fontScale = 0.0f;
            if (configuration3.diff(configuration4) != 0) {
                float f2 = configuration3.fontScale;
                float f3 = configuration4.fontScale;
                if (f2 != f3) {
                    configuration.fontScale = f3;
                }
                int i3 = configuration3.mcc;
                int i4 = configuration4.mcc;
                if (i3 != i4) {
                    configuration.mcc = i4;
                }
                int i5 = configuration3.mnc;
                int i6 = configuration4.mnc;
                if (i5 != i6) {
                    configuration.mnc = i6;
                }
                Api24Impl.a(configuration3, configuration4, configuration);
                int i7 = configuration3.touchscreen;
                int i8 = configuration4.touchscreen;
                if (i7 != i8) {
                    configuration.touchscreen = i8;
                }
                int i9 = configuration3.keyboard;
                int i10 = configuration4.keyboard;
                if (i9 != i10) {
                    configuration.keyboard = i10;
                }
                int i11 = configuration3.keyboardHidden;
                int i12 = configuration4.keyboardHidden;
                if (i11 != i12) {
                    configuration.keyboardHidden = i12;
                }
                int i13 = configuration3.navigation;
                int i14 = configuration4.navigation;
                if (i13 != i14) {
                    configuration.navigation = i14;
                }
                int i15 = configuration3.navigationHidden;
                int i16 = configuration4.navigationHidden;
                if (i15 != i16) {
                    configuration.navigationHidden = i16;
                }
                int i17 = configuration3.orientation;
                int i18 = configuration4.orientation;
                if (i17 != i18) {
                    configuration.orientation = i18;
                }
                int i19 = configuration3.screenLayout & 15;
                int i20 = configuration4.screenLayout & 15;
                if (i19 != i20) {
                    configuration.screenLayout |= i20;
                }
                int i21 = configuration3.screenLayout & Opcodes.CHECKCAST;
                int i22 = configuration4.screenLayout & Opcodes.CHECKCAST;
                if (i21 != i22) {
                    configuration.screenLayout |= i22;
                }
                int i23 = configuration3.screenLayout & 48;
                int i24 = configuration4.screenLayout & 48;
                if (i23 != i24) {
                    configuration.screenLayout |= i24;
                }
                int i25 = configuration3.screenLayout & com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS;
                int i26 = configuration4.screenLayout & com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS;
                if (i25 != i26) {
                    configuration.screenLayout |= i26;
                }
                int i27 = configuration3.colorMode & 3;
                int i28 = configuration4.colorMode & 3;
                if (i27 != i28) {
                    configuration.colorMode |= i28;
                }
                int i29 = configuration3.colorMode & 12;
                int i30 = configuration4.colorMode & 12;
                if (i29 != i30) {
                    configuration.colorMode |= i30;
                }
                int i31 = configuration3.uiMode & 15;
                int i32 = configuration4.uiMode & 15;
                if (i31 != i32) {
                    configuration.uiMode |= i32;
                }
                int i33 = configuration3.uiMode & 48;
                int i34 = configuration4.uiMode & 48;
                if (i33 != i34) {
                    configuration.uiMode |= i34;
                }
                int i35 = configuration3.screenWidthDp;
                int i36 = configuration4.screenWidthDp;
                if (i35 != i36) {
                    configuration.screenWidthDp = i36;
                }
                int i37 = configuration3.screenHeightDp;
                int i38 = configuration4.screenHeightDp;
                if (i37 != i38) {
                    configuration.screenHeightDp = i38;
                }
                int i39 = configuration3.smallestScreenWidthDp;
                int i40 = configuration4.smallestScreenWidthDp;
                if (i39 != i40) {
                    configuration.smallestScreenWidthDp = i40;
                }
                int i41 = configuration3.densityDpi;
                int i42 = configuration4.densityDpi;
                if (i41 != i42) {
                    configuration.densityDpi = i42;
                }
            }
        }
        Configuration I = I(context, R, E, configuration, true);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, com.cooldev.gba.emulator.gameboy.R.style.Theme_AppCompat_Empty);
        contextThemeWrapper.a(I);
        try {
            if (context.getTheme() != null) {
                ResourcesCompat.ThemeCompat.a(contextThemeWrapper.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return contextThemeWrapper;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final View c(int i2) {
        L();
        return this.f421m.findViewById(i2);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final Context d() {
        return this.f420l;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final ActionBarDrawerToggle.Delegate e() {
        return new ActionBarDrawableToggleImpl(this);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final int f() {
        return this.U;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final MenuInflater g() {
        if (this.f425q == null) {
            P();
            ActionBar actionBar = this.f424p;
            this.f425q = new SupportMenuInflater(actionBar != null ? actionBar.j() : this.f420l);
        }
        return this.f425q;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final ActionBar h() {
        P();
        return this.f424p;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void i() {
        LayoutInflater from = LayoutInflater.from(this.f420l);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof AppCompatDelegateImpl) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void j() {
        if (this.f424p != null) {
            P();
            if (this.f424p.k()) {
                return;
            }
            Q(0);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void l(Configuration configuration) {
        if (this.H && this.B) {
            P();
            ActionBar actionBar = this.f424p;
            if (actionBar != null) {
                actionBar.l();
            }
        }
        AppCompatDrawableManager a2 = AppCompatDrawableManager.a();
        Context context = this.f420l;
        synchronized (a2) {
            ResourceManagerInternal resourceManagerInternal = a2.f971a;
            synchronized (resourceManagerInternal) {
                LongSparseArray longSparseArray = (LongSparseArray) resourceManagerInternal.f1173b.get(context);
                if (longSparseArray != null) {
                    longSparseArray.a();
                }
            }
        }
        this.T = new Configuration(this.f420l.getResources().getConfiguration());
        C(false, false);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void m() {
        String str;
        this.Q = true;
        C(false, true);
        M();
        Object obj = this.f419k;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = NavUtils.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                ActionBar actionBar = this.f424p;
                if (actionBar == null) {
                    this.f413d0 = true;
                } else {
                    actionBar.q(true);
                }
            }
            synchronized (AppCompatDelegate.f402i) {
                AppCompatDelegate.t(this);
                AppCompatDelegate.f401h.add(new WeakReference(this));
            }
        }
        this.T = new Configuration(this.f420l.getResources().getConfiguration());
        this.R = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.app.AppCompatDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f419k
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = androidx.appcompat.app.AppCompatDelegate.f402i
            monitor-enter(r0)
            androidx.appcompat.app.AppCompatDelegate.t(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.f410a0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f421m
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f412c0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.S = r0
            int r0 = r3.U
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f419k
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            androidx.collection.SimpleArrayMap r0 = androidx.appcompat.app.AppCompatDelegateImpl.f407j0
            java.lang.Object r1 = r3.f419k
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.U
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            androidx.collection.SimpleArrayMap r0 = androidx.appcompat.app.AppCompatDelegateImpl.f407j0
            java.lang.Object r1 = r3.f419k
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            androidx.appcompat.app.ActionBar r0 = r3.f424p
            if (r0 == 0) goto L63
            r0.m()
        L63:
            androidx.appcompat.app.AppCompatDelegateImpl$AutoTimeNightModeManager r0 = r3.Y
            if (r0 == 0) goto L6a
            r0.a()
        L6a:
            androidx.appcompat.app.AppCompatDelegateImpl$AutoBatteryNightModeManager r0 = r3.Z
            if (r0 == 0) goto L71
            r0.a()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.n():void");
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void o() {
        L();
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (this.f416g0 == null) {
            int[] iArr = androidx.appcompat.R.styleable.f318j;
            Context context2 = this.f420l;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = obtainStyledAttributes.getString(116);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.f416g0 = new AppCompatViewInflater();
            } else {
                try {
                    this.f416g0 = (AppCompatViewInflater) context2.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f416g0 = new AppCompatViewInflater();
                }
            }
        }
        AppCompatViewInflater appCompatViewInflater = this.f416g0;
        int i2 = VectorEnabledTintResources.f1290a;
        return appCompatViewInflater.createView(view, str, context, attributeSet, false, false, true, false);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public final boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
        PanelFeatureState panelFeatureState;
        Window.Callback callback = this.f421m.getCallback();
        if (callback != null && !this.S) {
            MenuBuilder rootMenu = menuBuilder.getRootMenu();
            PanelFeatureState[] panelFeatureStateArr = this.N;
            int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    panelFeatureState = panelFeatureStateArr[i2];
                    if (panelFeatureState != null && panelFeatureState.f458h == rootMenu) {
                        break;
                    }
                    i2++;
                } else {
                    panelFeatureState = null;
                    break;
                }
            }
            if (panelFeatureState != null) {
                return callback.onMenuItemSelected(panelFeatureState.f453a, menuItem);
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public final void onMenuModeChange(MenuBuilder menuBuilder) {
        DecorContentParent decorContentParent = this.f427s;
        if (decorContentParent == null || !decorContentParent.a() || (ViewConfiguration.get(this.f420l).hasPermanentMenuKey() && !this.f427s.g())) {
            PanelFeatureState O = O(0);
            O.f464n = true;
            H(O, false);
            T(O, null);
            return;
        }
        Window.Callback callback = this.f421m.getCallback();
        if (this.f427s.e()) {
            this.f427s.c();
            if (this.S) {
                return;
            }
            callback.onPanelClosed(108, O(0).f458h);
            return;
        }
        if (callback == null || this.S) {
            return;
        }
        if (this.f410a0 && (1 & this.f411b0) != 0) {
            View decorView = this.f421m.getDecorView();
            Runnable runnable = this.f412c0;
            decorView.removeCallbacks(runnable);
            ((AnonymousClass2) runnable).run();
        }
        PanelFeatureState O2 = O(0);
        MenuBuilder menuBuilder2 = O2.f458h;
        if (menuBuilder2 == null || O2.f465o || !callback.onPreparePanel(0, O2.f457g, menuBuilder2)) {
            return;
        }
        callback.onMenuOpened(108, O2.f458h);
        this.f427s.d();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void p() {
        P();
        ActionBar actionBar = this.f424p;
        if (actionBar != null) {
            actionBar.r(true);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void q() {
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void r() {
        C(true, false);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void s() {
        P();
        ActionBar actionBar = this.f424p;
        if (actionBar != null) {
            actionBar.r(false);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final boolean u(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = 108;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        if (this.L && i2 == 108) {
            return false;
        }
        if (this.H && i2 == 1) {
            this.H = false;
        }
        if (i2 == 1) {
            W();
            this.L = true;
            return true;
        }
        if (i2 == 2) {
            W();
            this.F = true;
            return true;
        }
        if (i2 == 5) {
            W();
            this.G = true;
            return true;
        }
        if (i2 == 10) {
            W();
            this.J = true;
            return true;
        }
        if (i2 == 108) {
            W();
            this.H = true;
            return true;
        }
        if (i2 != 109) {
            return this.f421m.requestFeature(i2);
        }
        W();
        this.I = true;
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void v(int i2) {
        L();
        ViewGroup viewGroup = (ViewGroup) this.C.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f420l).inflate(i2, viewGroup);
        this.f422n.a(this.f421m.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void w(View view) {
        L();
        ViewGroup viewGroup = (ViewGroup) this.C.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f422n.a(this.f421m.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void x(View view, ViewGroup.LayoutParams layoutParams) {
        L();
        ViewGroup viewGroup = (ViewGroup) this.C.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f422n.a(this.f421m.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void y(Toolbar toolbar) {
        Object obj = this.f419k;
        if (obj instanceof Activity) {
            P();
            ActionBar actionBar = this.f424p;
            if (actionBar instanceof WindowDecorActionBar) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f425q = null;
            if (actionBar != null) {
                actionBar.m();
            }
            this.f424p = null;
            if (toolbar != null) {
                ToolbarActionBar toolbarActionBar = new ToolbarActionBar(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : this.f426r, this.f422n);
                this.f424p = toolbarActionBar;
                this.f422n.f443b = toolbarActionBar.f477c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f422n.f443b = null;
            }
            j();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void z(int i2) {
        this.V = i2;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
