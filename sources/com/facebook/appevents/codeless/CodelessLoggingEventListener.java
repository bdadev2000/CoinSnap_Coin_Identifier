package com.facebook.appevents.codeless;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.b;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@RestrictTo
/* loaded from: classes.dex */
public final class CodelessLoggingEventListener {

    @NotNull
    public static final CodelessLoggingEventListener INSTANCE = new CodelessLoggingEventListener();

    /* loaded from: classes.dex */
    public static final class AutoLoggingOnClickListener implements View.OnClickListener {

        @Nullable
        private View.OnClickListener existingOnClickListener;

        @NotNull
        private WeakReference<View> hostView;

        @NotNull
        private EventBinding mapping;

        @NotNull
        private WeakReference<View> rootView;
        private boolean supportCodelessLogging;

        public AutoLoggingOnClickListener(@NotNull EventBinding eventBinding, @NotNull View view, @NotNull View view2) {
            a.s(eventBinding, "mapping");
            a.s(view, "rootView");
            a.s(view2, "hostView");
            this.mapping = eventBinding;
            this.hostView = new WeakReference<>(view2);
            this.rootView = new WeakReference<>(view);
            this.existingOnClickListener = ViewHierarchy.getExistingOnClickListener(view2);
            this.supportCodelessLogging = true;
        }

        public final boolean getSupportCodelessLogging() {
            return this.supportCodelessLogging;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@NotNull View view) {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                if (CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    a.s(view, ViewHierarchyConstants.VIEW_KEY);
                    View.OnClickListener onClickListener = this.existingOnClickListener;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                    View view2 = this.rootView.get();
                    View view3 = this.hostView.get();
                    if (view2 == null || view3 == null) {
                        return;
                    }
                    CodelessLoggingEventListener codelessLoggingEventListener = CodelessLoggingEventListener.INSTANCE;
                    CodelessLoggingEventListener.logEvent$facebook_core_release(this.mapping, view2, view3);
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            } catch (Throwable th2) {
                CrashShieldHandler.handleThrowable(th2, this);
            }
        }

        public final void setSupportCodelessLogging(boolean z2) {
            this.supportCodelessLogging = z2;
        }
    }

    /* loaded from: classes.dex */
    public static final class AutoLoggingOnItemClickListener implements AdapterView.OnItemClickListener {

        @Nullable
        private AdapterView.OnItemClickListener existingOnItemClickListener;

        @NotNull
        private WeakReference<AdapterView<?>> hostView;

        @NotNull
        private EventBinding mapping;

        @NotNull
        private WeakReference<View> rootView;
        private boolean supportCodelessLogging;

        public AutoLoggingOnItemClickListener(@NotNull EventBinding eventBinding, @NotNull View view, @NotNull AdapterView<?> adapterView) {
            a.s(eventBinding, "mapping");
            a.s(view, "rootView");
            a.s(adapterView, "hostView");
            this.mapping = eventBinding;
            this.hostView = new WeakReference<>(adapterView);
            this.rootView = new WeakReference<>(view);
            this.existingOnItemClickListener = adapterView.getOnItemClickListener();
            this.supportCodelessLogging = true;
        }

        public final boolean getSupportCodelessLogging() {
            return this.supportCodelessLogging;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(@Nullable AdapterView<?> adapterView, @NotNull View view, int i2, long j2) {
            a.s(view, ViewHierarchyConstants.VIEW_KEY);
            AdapterView.OnItemClickListener onItemClickListener = this.existingOnItemClickListener;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i2, j2);
            }
            View view2 = this.rootView.get();
            AdapterView<?> adapterView2 = this.hostView.get();
            if (view2 == null || adapterView2 == null) {
                return;
            }
            CodelessLoggingEventListener codelessLoggingEventListener = CodelessLoggingEventListener.INSTANCE;
            CodelessLoggingEventListener.logEvent$facebook_core_release(this.mapping, view2, adapterView2);
        }

        public final void setSupportCodelessLogging(boolean z2) {
            this.supportCodelessLogging = z2;
        }
    }

    private CodelessLoggingEventListener() {
    }

    @NotNull
    public static final AutoLoggingOnClickListener getOnClickListener(@NotNull EventBinding eventBinding, @NotNull View view, @NotNull View view2) {
        if (CrashShieldHandler.isObjectCrashing(CodelessLoggingEventListener.class)) {
            return null;
        }
        try {
            a.s(eventBinding, "mapping");
            a.s(view, "rootView");
            a.s(view2, "hostView");
            return new AutoLoggingOnClickListener(eventBinding, view, view2);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessLoggingEventListener.class);
            return null;
        }
    }

    @NotNull
    public static final AutoLoggingOnItemClickListener getOnItemClickListener(@NotNull EventBinding eventBinding, @NotNull View view, @NotNull AdapterView<?> adapterView) {
        if (CrashShieldHandler.isObjectCrashing(CodelessLoggingEventListener.class)) {
            return null;
        }
        try {
            a.s(eventBinding, "mapping");
            a.s(view, "rootView");
            a.s(adapterView, "hostView");
            return new AutoLoggingOnItemClickListener(eventBinding, view, adapterView);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessLoggingEventListener.class);
            return null;
        }
    }

    public static final void logEvent$facebook_core_release(@NotNull EventBinding eventBinding, @NotNull View view, @NotNull View view2) {
        if (CrashShieldHandler.isObjectCrashing(CodelessLoggingEventListener.class)) {
            return;
        }
        try {
            a.s(eventBinding, "mapping");
            a.s(view, "rootView");
            a.s(view2, "hostView");
            String eventName = eventBinding.getEventName();
            Bundle parameters = CodelessMatcher.Companion.getParameters(eventBinding, view, view2);
            INSTANCE.updateParameters$facebook_core_release(parameters);
            FacebookSdk.getExecutor().execute(new b(2, eventName, parameters));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessLoggingEventListener.class);
        }
    }

    /* renamed from: logEvent$lambda-0 */
    public static final void m463logEvent$lambda0(String str, Bundle bundle) {
        if (CrashShieldHandler.isObjectCrashing(CodelessLoggingEventListener.class)) {
            return;
        }
        try {
            a.s(str, "$eventName");
            a.s(bundle, "$parameters");
            AppEventsLogger.Companion.newLogger(FacebookSdk.getApplicationContext()).logEvent(str, bundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessLoggingEventListener.class);
        }
    }

    public final void updateParameters$facebook_core_release(@NotNull Bundle bundle) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            a.s(bundle, "parameters");
            String string = bundle.getString(AppEventsConstants.EVENT_PARAM_VALUE_TO_SUM);
            if (string != null) {
                bundle.putDouble(AppEventsConstants.EVENT_PARAM_VALUE_TO_SUM, AppEventUtility.normalizePrice(string));
            }
            bundle.putString(Constants.IS_CODELESS_EVENT_KEY, AppEventsConstants.EVENT_PARAM_VALUE_YES);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }
}
