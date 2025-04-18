package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.Set;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class BoltsMeasurementEventListener extends BroadcastReceiver {

    @NotNull
    private static final String BOLTS_MEASUREMENT_EVENT_PREFIX = "bf_";

    @NotNull
    private static final String MEASUREMENT_EVENT_ARGS_KEY = "event_args";

    @NotNull
    private static final String MEASUREMENT_EVENT_NAME_KEY = "event_name";

    @Nullable
    private static BoltsMeasurementEventListener singleton;

    @NotNull
    private final Context applicationContext;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String MEASUREMENT_EVENT_NOTIFICATION_NAME = "com.parse.bolts.measurement_event";

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        @VisibleForTesting
        public static /* synthetic */ void getMEASUREMENT_EVENT_NOTIFICATION_NAME$facebook_core_release$annotations() {
        }

        @Nullable
        public final BoltsMeasurementEventListener getInstance(@NotNull Context context) {
            p0.a.s(context, "context");
            if (BoltsMeasurementEventListener.access$getSingleton$cp() != null) {
                return BoltsMeasurementEventListener.access$getSingleton$cp();
            }
            BoltsMeasurementEventListener boltsMeasurementEventListener = new BoltsMeasurementEventListener(context, null);
            BoltsMeasurementEventListener.access$open(boltsMeasurementEventListener);
            BoltsMeasurementEventListener.access$setSingleton$cp(boltsMeasurementEventListener);
            return BoltsMeasurementEventListener.access$getSingleton$cp();
        }

        @NotNull
        public final String getMEASUREMENT_EVENT_NOTIFICATION_NAME$facebook_core_release() {
            return BoltsMeasurementEventListener.access$getMEASUREMENT_EVENT_NOTIFICATION_NAME$cp();
        }
    }

    public /* synthetic */ BoltsMeasurementEventListener(Context context, kotlin.jvm.internal.k kVar) {
        this(context);
    }

    public static final /* synthetic */ String access$getMEASUREMENT_EVENT_NOTIFICATION_NAME$cp() {
        if (CrashShieldHandler.isObjectCrashing(BoltsMeasurementEventListener.class)) {
            return null;
        }
        try {
            return MEASUREMENT_EVENT_NOTIFICATION_NAME;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, BoltsMeasurementEventListener.class);
            return null;
        }
    }

    public static final /* synthetic */ BoltsMeasurementEventListener access$getSingleton$cp() {
        if (CrashShieldHandler.isObjectCrashing(BoltsMeasurementEventListener.class)) {
            return null;
        }
        try {
            return singleton;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, BoltsMeasurementEventListener.class);
            return null;
        }
    }

    public static final /* synthetic */ void access$open(BoltsMeasurementEventListener boltsMeasurementEventListener) {
        if (CrashShieldHandler.isObjectCrashing(BoltsMeasurementEventListener.class)) {
            return;
        }
        try {
            boltsMeasurementEventListener.open();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, BoltsMeasurementEventListener.class);
        }
    }

    public static final /* synthetic */ void access$setSingleton$cp(BoltsMeasurementEventListener boltsMeasurementEventListener) {
        if (CrashShieldHandler.isObjectCrashing(BoltsMeasurementEventListener.class)) {
            return;
        }
        try {
            singleton = boltsMeasurementEventListener;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, BoltsMeasurementEventListener.class);
        }
    }

    private final void close() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            LocalBroadcastManager a2 = LocalBroadcastManager.a(this.applicationContext);
            p0.a.r(a2, "getInstance(applicationContext)");
            a2.d(this);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Nullable
    public static final BoltsMeasurementEventListener getInstance(@NotNull Context context) {
        if (CrashShieldHandler.isObjectCrashing(BoltsMeasurementEventListener.class)) {
            return null;
        }
        try {
            return Companion.getInstance(context);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, BoltsMeasurementEventListener.class);
            return null;
        }
    }

    private final void open() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            LocalBroadcastManager a2 = LocalBroadcastManager.a(this.applicationContext);
            p0.a.r(a2, "getInstance(applicationContext)");
            a2.b(this, new IntentFilter(MEASUREMENT_EVENT_NOTIFICATION_NAME));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void finalize() throws Throwable {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            close();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(context);
            Set<String> set = null;
            String z02 = p0.a.z0(intent == null ? null : intent.getStringExtra(MEASUREMENT_EVENT_NAME_KEY), BOLTS_MEASUREMENT_EVENT_PREFIX);
            Bundle bundleExtra = intent == null ? null : intent.getBundleExtra(MEASUREMENT_EVENT_ARGS_KEY);
            Bundle bundle = new Bundle();
            if (bundleExtra != null) {
                set = bundleExtra.keySet();
            }
            if (set != null) {
                for (String str : set) {
                    p0.a.r(str, SDKConstants.PARAM_KEY);
                    Pattern compile = Pattern.compile("[^0-9a-zA-Z _-]");
                    p0.a.r(compile, "compile(...)");
                    String replaceAll = compile.matcher(str).replaceAll("-");
                    p0.a.r(replaceAll, "replaceAll(...)");
                    Pattern compile2 = Pattern.compile("^[ -]*");
                    p0.a.r(compile2, "compile(...)");
                    String replaceAll2 = compile2.matcher(replaceAll).replaceAll("");
                    p0.a.r(replaceAll2, "replaceAll(...)");
                    Pattern compile3 = Pattern.compile("[ -]*$");
                    p0.a.r(compile3, "compile(...)");
                    String replaceAll3 = compile3.matcher(replaceAll2).replaceAll("");
                    p0.a.r(replaceAll3, "replaceAll(...)");
                    bundle.putString(replaceAll3, (String) bundleExtra.get(str));
                }
            }
            internalAppEventsLogger.logEvent(z02, bundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private BoltsMeasurementEventListener(Context context) {
        Context applicationContext = context.getApplicationContext();
        p0.a.r(applicationContext, "context.applicationContext");
        this.applicationContext = applicationContext;
    }
}
