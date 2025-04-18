package com.facebook.appevents.codeless;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* loaded from: classes2.dex */
public final class RCTCodelessLoggingEventListener {

    @NotNull
    public static final RCTCodelessLoggingEventListener INSTANCE = new RCTCodelessLoggingEventListener();

    /* loaded from: classes2.dex */
    public static final class AutoLoggingOnTouchListener implements View.OnTouchListener {

        @Nullable
        private final View.OnTouchListener existingOnTouchListener;

        @NotNull
        private final WeakReference<View> hostView;

        @NotNull
        private final EventBinding mapping;

        @NotNull
        private final WeakReference<View> rootView;
        private boolean supportCodelessLogging;

        public AutoLoggingOnTouchListener(@NotNull EventBinding eventBinding, @NotNull View view, @NotNull View view2) {
            a.s(eventBinding, "mapping");
            a.s(view, "rootView");
            a.s(view2, "hostView");
            this.mapping = eventBinding;
            this.hostView = new WeakReference<>(view2);
            this.rootView = new WeakReference<>(view);
            this.existingOnTouchListener = ViewHierarchy.getExistingOnTouchListener(view2);
            this.supportCodelessLogging = true;
        }

        public final boolean getSupportCodelessLogging() {
            return this.supportCodelessLogging;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(@NotNull View view, @NotNull MotionEvent motionEvent) {
            a.s(view, ViewHierarchyConstants.VIEW_KEY);
            a.s(motionEvent, "motionEvent");
            View view2 = this.rootView.get();
            View view3 = this.hostView.get();
            if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
                CodelessLoggingEventListener codelessLoggingEventListener = CodelessLoggingEventListener.INSTANCE;
                CodelessLoggingEventListener.logEvent$facebook_core_release(this.mapping, view2, view3);
            }
            View.OnTouchListener onTouchListener = this.existingOnTouchListener;
            return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
        }

        public final void setSupportCodelessLogging(boolean z2) {
            this.supportCodelessLogging = z2;
        }
    }

    private RCTCodelessLoggingEventListener() {
    }

    @NotNull
    public static final AutoLoggingOnTouchListener getOnTouchListener(@NotNull EventBinding eventBinding, @NotNull View view, @NotNull View view2) {
        if (CrashShieldHandler.isObjectCrashing(RCTCodelessLoggingEventListener.class)) {
            return null;
        }
        try {
            a.s(eventBinding, "mapping");
            a.s(view, "rootView");
            a.s(view2, "hostView");
            return new AutoLoggingOnTouchListener(eventBinding, view, view2);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, RCTCodelessLoggingEventListener.class);
            return null;
        }
    }
}
