package com.facebook.appevents.aam;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import androidx.annotation.UiThread;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.appevents.b;
import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import z0.m;

/* loaded from: classes.dex */
public final class MetadataViewObserver implements ViewTreeObserver.OnGlobalFocusChangeListener {
    private static final int MAX_TEXT_LENGTH = 100;

    @NotNull
    private final WeakReference<Activity> activityWeakReference;

    @NotNull
    private final AtomicBoolean isTracking;

    @NotNull
    private final Set<String> processedText;

    @NotNull
    private final Handler uiThreadHandler;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final Map<Integer, MetadataViewObserver> observers = new HashMap();

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final String preNormalize(String str, String str2) {
            if (!a.g("r2", str)) {
                return str2;
            }
            Pattern compile = Pattern.compile("[^\\d.]");
            a.r(compile, "compile(...)");
            a.s(str2, "input");
            String replaceAll = compile.matcher(str2).replaceAll("");
            a.r(replaceAll, "replaceAll(...)");
            return replaceAll;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
        
            if (r7.equals("r5") == false) goto L86;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
        
            r0 = java.util.regex.Pattern.compile("[^a-z]+");
            p0.a.r(r0, "compile(...)");
            p0.a.s(r8, "input");
            r8 = r0.matcher(r8).replaceAll("");
            p0.a.r(r8, "replaceAll(...)");
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
        
            if (r7.equals("r4") == false) goto L86;
         */
        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void putUserData(java.util.Map<java.lang.String, java.lang.String> r6, java.lang.String r7, java.lang.String r8) {
            /*
                r5 = this;
                int r0 = r7.hashCode()
                java.lang.String r1 = "input"
                java.lang.String r2 = "compile(...)"
                r3 = 0
                switch(r0) {
                    case 3585: goto Lb3;
                    case 3586: goto L8e;
                    case 3587: goto L85;
                    case 3588: goto Le;
                    default: goto Lc;
                }
            Lc:
                goto Ld9
            Le:
                java.lang.String r0 = "r6"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L18
                goto Ld9
            L18:
                java.lang.String r0 = "-"
                boolean r1 = z0.m.M0(r8, r0, r3)
                if (r1 == 0) goto Ld9
                java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
                p0.a.r(r0, r2)
                z0.m.l1(r3)
                java.util.regex.Matcher r0 = r0.matcher(r8)
                boolean r1 = r0.find()
                if (r1 != 0) goto L3d
                java.lang.String r8 = r8.toString()
                java.util.List r8 = b1.f0.u(r8)
                goto L6e
            L3d:
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = 10
                r1.<init>(r2)
                r2 = r3
            L45:
                int r4 = r0.start()
                java.lang.CharSequence r2 = r8.subSequence(r2, r4)
                java.lang.String r2 = r2.toString()
                r1.add(r2)
                int r2 = r0.end()
                boolean r4 = r0.find()
                if (r4 != 0) goto L45
                int r0 = r8.length()
                java.lang.CharSequence r8 = r8.subSequence(r2, r0)
                java.lang.String r8 = r8.toString()
                r1.add(r8)
                r8 = r1
            L6e:
                java.util.Collection r8 = (java.util.Collection) r8
                java.lang.String[] r0 = new java.lang.String[r3]
                java.lang.Object[] r8 = r8.toArray(r0)
                if (r8 == 0) goto L7d
                java.lang.String[] r8 = (java.lang.String[]) r8
                r8 = r8[r3]
                goto Ld9
            L7d:
                java.lang.NullPointerException r6 = new java.lang.NullPointerException
                java.lang.String r7 = "null cannot be cast to non-null type kotlin.Array<T>"
                r6.<init>(r7)
                throw r6
            L85:
                java.lang.String r0 = "r5"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L97
                goto Ld9
            L8e:
                java.lang.String r0 = "r4"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L97
                goto Ld9
            L97:
                java.lang.String r0 = "[^a-z]+"
                java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
                p0.a.r(r0, r2)
                p0.a.s(r8, r1)
                java.util.regex.Matcher r8 = r0.matcher(r8)
                java.lang.String r0 = ""
                java.lang.String r8 = r8.replaceAll(r0)
                java.lang.String r0 = "replaceAll(...)"
                p0.a.r(r8, r0)
                goto Ld9
            Lb3:
                java.lang.String r0 = "r3"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto Lbc
                goto Ld9
            Lbc:
                java.lang.String r0 = "m"
                boolean r1 = z0.m.q1(r8, r0, r3)
                if (r1 != 0) goto Ld8
                java.lang.String r1 = "b"
                boolean r1 = z0.m.q1(r8, r1, r3)
                if (r1 != 0) goto Ld8
                java.lang.String r1 = "ge"
                boolean r8 = z0.m.q1(r8, r1, r3)
                if (r8 == 0) goto Ld5
                goto Ld8
            Ld5:
                java.lang.String r8 = "f"
                goto Ld9
            Ld8:
                r8 = r0
            Ld9:
                r6.put(r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.aam.MetadataViewObserver.Companion.putUserData(java.util.Map, java.lang.String, java.lang.String):void");
        }

        @UiThread
        public final void startTrackingActivity(@NotNull Activity activity) {
            a.s(activity, "activity");
            int hashCode = activity.hashCode();
            Map access$getObservers$cp = MetadataViewObserver.access$getObservers$cp();
            Integer valueOf = Integer.valueOf(hashCode);
            Object obj = access$getObservers$cp.get(valueOf);
            if (obj == null) {
                obj = new MetadataViewObserver(activity, null);
                access$getObservers$cp.put(valueOf, obj);
            }
            MetadataViewObserver.access$startTracking((MetadataViewObserver) obj);
        }

        @UiThread
        public final void stopTrackingActivity(@NotNull Activity activity) {
            a.s(activity, "activity");
            MetadataViewObserver metadataViewObserver = (MetadataViewObserver) MetadataViewObserver.access$getObservers$cp().remove(Integer.valueOf(activity.hashCode()));
            if (metadataViewObserver == null) {
                return;
            }
            MetadataViewObserver.access$stopTracking(metadataViewObserver);
        }
    }

    public /* synthetic */ MetadataViewObserver(Activity activity, k kVar) {
        this(activity);
    }

    public static final /* synthetic */ Map access$getObservers$cp() {
        if (CrashShieldHandler.isObjectCrashing(MetadataViewObserver.class)) {
            return null;
        }
        try {
            return observers;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MetadataViewObserver.class);
            return null;
        }
    }

    public static final /* synthetic */ void access$startTracking(MetadataViewObserver metadataViewObserver) {
        if (CrashShieldHandler.isObjectCrashing(MetadataViewObserver.class)) {
            return;
        }
        try {
            metadataViewObserver.startTracking();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MetadataViewObserver.class);
        }
    }

    public static final /* synthetic */ void access$stopTracking(MetadataViewObserver metadataViewObserver) {
        if (CrashShieldHandler.isObjectCrashing(MetadataViewObserver.class)) {
            return;
        }
        try {
            metadataViewObserver.stopTracking();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MetadataViewObserver.class);
        }
    }

    private final void process(View view) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            runOnUIThread(new b(1, view, this));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* renamed from: process$lambda-0 */
    public static final void m459process$lambda0(View view, MetadataViewObserver metadataViewObserver) {
        if (CrashShieldHandler.isObjectCrashing(MetadataViewObserver.class)) {
            return;
        }
        try {
            a.s(view, "$view");
            a.s(metadataViewObserver, "this$0");
            if (view instanceof EditText) {
                metadataViewObserver.processEditText(view);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MetadataViewObserver.class);
        }
    }

    private final void processEditText(View view) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            String obj = ((EditText) view).getText().toString();
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            String obj2 = m.y1(obj).toString();
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = obj2.toLowerCase();
            a.r(lowerCase, "(this as java.lang.String).toLowerCase()");
            if (lowerCase.length() != 0 && !this.processedText.contains(lowerCase) && lowerCase.length() <= 100) {
                this.processedText.add(lowerCase);
                HashMap hashMap = new HashMap();
                List<String> currentViewIndicators = MetadataMatcher.getCurrentViewIndicators(view);
                List<String> list = null;
                for (MetadataRule metadataRule : MetadataRule.Companion.getRules()) {
                    Companion companion = Companion;
                    String preNormalize = companion.preNormalize(metadataRule.getName(), lowerCase);
                    if (metadataRule.getValRule().length() > 0) {
                        MetadataMatcher metadataMatcher = MetadataMatcher.INSTANCE;
                        if (!MetadataMatcher.matchValue(preNormalize, metadataRule.getValRule())) {
                        }
                    }
                    MetadataMatcher metadataMatcher2 = MetadataMatcher.INSTANCE;
                    if (MetadataMatcher.matchIndicator(currentViewIndicators, metadataRule.getKeyRules())) {
                        companion.putUserData(hashMap, metadataRule.getName(), preNormalize);
                    } else {
                        if (list == null) {
                            list = MetadataMatcher.getAroundViewIndicators(view);
                        }
                        if (MetadataMatcher.matchIndicator(list, metadataRule.getKeyRules())) {
                            companion.putUserData(hashMap, metadataRule.getName(), preNormalize);
                        }
                    }
                }
                InternalAppEventsLogger.Companion.setInternalUserData(hashMap);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void runOnUIThread(Runnable runnable) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.uiThreadHandler.post(runnable);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void startTracking() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (this.isTracking.getAndSet(true)) {
                return;
            }
            AppEventUtility appEventUtility = AppEventUtility.INSTANCE;
            View rootView = AppEventUtility.getRootView(this.activityWeakReference.get());
            if (rootView == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalFocusChangeListener(this);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @UiThread
    public static final void startTrackingActivity(@NotNull Activity activity) {
        if (CrashShieldHandler.isObjectCrashing(MetadataViewObserver.class)) {
            return;
        }
        try {
            Companion.startTrackingActivity(activity);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MetadataViewObserver.class);
        }
    }

    private final void stopTracking() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (this.isTracking.getAndSet(false)) {
                AppEventUtility appEventUtility = AppEventUtility.INSTANCE;
                View rootView = AppEventUtility.getRootView(this.activityWeakReference.get());
                if (rootView == null) {
                    return;
                }
                ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalFocusChangeListener(this);
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @UiThread
    public static final void stopTrackingActivity(@NotNull Activity activity) {
        if (CrashShieldHandler.isObjectCrashing(MetadataViewObserver.class)) {
            return;
        }
        try {
            Companion.stopTrackingActivity(activity);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MetadataViewObserver.class);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(@Nullable View view, @Nullable View view2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        if (view != null) {
            try {
                process(view);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return;
            }
        }
        if (view2 != null) {
            process(view2);
        }
    }

    private MetadataViewObserver(Activity activity) {
        this.processedText = new LinkedHashSet();
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        this.activityWeakReference = new WeakReference<>(activity);
        this.isTracking = new AtomicBoolean(false);
    }
}
