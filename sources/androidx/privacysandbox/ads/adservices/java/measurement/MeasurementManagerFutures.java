package androidx.privacysandbox.ads.adservices.java.measurement;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import androidx.privacysandbox.ads.adservices.measurement.DeletionRequest;
import androidx.privacysandbox.ads.adservices.measurement.MeasurementManager;
import androidx.privacysandbox.ads.adservices.measurement.WebSourceRegistrationRequest;
import androidx.privacysandbox.ads.adservices.measurement.WebTriggerRegistrationRequest;
import b1.o0;
import com.google.common.util.concurrent.ListenableFuture;
import d0.b0;
import kotlin.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* loaded from: classes2.dex */
public abstract class MeasurementManagerFutures {

    /* loaded from: classes2.dex */
    public static final class Api33Ext5JavaImpl extends MeasurementManagerFutures {

        /* renamed from: a, reason: collision with root package name */
        public final MeasurementManager f20837a;

        public Api33Ext5JavaImpl(MeasurementManager measurementManager) {
            this.f20837a = measurementManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @RequiresPermission
        @DoNotInline
        @NotNull
        public ListenableFuture<Integer> b() {
            return CoroutineAdapterKt.a(e.f(a.c(o0.f22355a), null, new MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1(this, null), 3));
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @RequiresPermission
        @DoNotInline
        @NotNull
        public ListenableFuture<b0> c(@NotNull Uri uri, @Nullable InputEvent inputEvent) {
            a.s(uri, "attributionSource");
            return CoroutineAdapterKt.a(e.f(a.c(o0.f22355a), null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1(this, uri, inputEvent, null), 3));
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @RequiresPermission
        @DoNotInline
        @NotNull
        public ListenableFuture<b0> d(@NotNull Uri uri) {
            a.s(uri, "trigger");
            return CoroutineAdapterKt.a(e.f(a.c(o0.f22355a), null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1(this, uri, null), 3));
        }

        @RequiresPermission
        @DoNotInline
        @NotNull
        public ListenableFuture<b0> e(@NotNull DeletionRequest deletionRequest) {
            a.s(deletionRequest, "deletionRequest");
            return CoroutineAdapterKt.a(e.f(a.c(o0.f22355a), null, new MeasurementManagerFutures$Api33Ext5JavaImpl$deleteRegistrationsAsync$1(this, deletionRequest, null), 3));
        }

        @RequiresPermission
        @DoNotInline
        @NotNull
        public ListenableFuture<b0> f(@NotNull WebSourceRegistrationRequest webSourceRegistrationRequest) {
            a.s(webSourceRegistrationRequest, "request");
            return CoroutineAdapterKt.a(e.f(a.c(o0.f22355a), null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebSourceAsync$1(this, webSourceRegistrationRequest, null), 3));
        }

        @RequiresPermission
        @DoNotInline
        @NotNull
        public ListenableFuture<b0> g(@NotNull WebTriggerRegistrationRequest webTriggerRegistrationRequest) {
            a.s(webTriggerRegistrationRequest, "request");
            return CoroutineAdapterKt.a(e.f(a.c(o0.f22355a), null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebTriggerAsync$1(this, webTriggerRegistrationRequest, null), 3));
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public static final MeasurementManagerFutures a(Context context) {
        a.s(context, "context");
        MeasurementManager a2 = MeasurementManager.Companion.a(context);
        if (a2 != null) {
            return new Api33Ext5JavaImpl(a2);
        }
        return null;
    }

    public abstract ListenableFuture b();

    public abstract ListenableFuture c(Uri uri, InputEvent inputEvent);

    public abstract ListenableFuture d(Uri uri);
}
