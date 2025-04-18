package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.DeletionRequest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import b1.f0;
import b1.l;
import d0.b0;
import h0.g;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* loaded from: classes2.dex */
public abstract class MeasurementManager {

    @RequiresExtension
    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    /* loaded from: classes2.dex */
    public static final class Api33Ext5Impl extends MeasurementManager {

        /* renamed from: a, reason: collision with root package name */
        public final android.adservices.measurement.MeasurementManager f20859a;

        public Api33Ext5Impl(Context context) {
            a.s(context, "context");
            Object systemService = context.getSystemService((Class<Object>) androidx.privacysandbox.ads.adservices.customaudience.a.n());
            a.r(systemService, "context.getSystemService…:class.java\n            )");
            android.adservices.measurement.MeasurementManager f2 = androidx.privacysandbox.ads.adservices.customaudience.a.f(systemService);
            a.s(f2, "mMeasurementManager");
            this.f20859a = f2;
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
        @DoNotInline
        @Nullable
        public Object a(@NotNull DeletionRequest deletionRequest, @NotNull g gVar) {
            DeletionRequest.Builder deletionMode;
            DeletionRequest.Builder matchBehavior;
            DeletionRequest.Builder start;
            DeletionRequest.Builder end;
            DeletionRequest.Builder domainUris;
            DeletionRequest.Builder originUris;
            android.adservices.measurement.DeletionRequest build;
            l lVar = new l(1, f0.r(gVar));
            lVar.p();
            DeletionRequest.Builder c2 = androidx.privacysandbox.ads.adservices.customaudience.a.c();
            deletionRequest.getClass();
            deletionMode = c2.setDeletionMode(0);
            matchBehavior = deletionMode.setMatchBehavior(0);
            start = matchBehavior.setStart(null);
            end = start.setEnd(null);
            domainUris = end.setDomainUris(null);
            originUris = domainUris.setOriginUris(null);
            build = originUris.build();
            a.r(build, "Builder()\n              …\n                .build()");
            this.f20859a.deleteRegistrations(build, new androidx.arch.core.executor.a(13), OutcomeReceiverKt.a(lVar));
            Object o2 = lVar.o();
            return o2 == i0.a.f30806a ? o2 : b0.f30125a;
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
        @RequiresPermission
        @DoNotInline
        @Nullable
        public Object b(@NotNull g gVar) {
            l lVar = new l(1, f0.r(gVar));
            lVar.p();
            this.f20859a.getMeasurementApiStatus(new androidx.arch.core.executor.a(8), OutcomeReceiverKt.a(lVar));
            Object o2 = lVar.o();
            i0.a aVar = i0.a.f30806a;
            return o2;
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
        @RequiresPermission
        @DoNotInline
        @Nullable
        public Object c(@NotNull Uri uri, @Nullable InputEvent inputEvent, @NotNull g gVar) {
            l lVar = new l(1, f0.r(gVar));
            lVar.p();
            this.f20859a.registerSource(uri, inputEvent, new androidx.arch.core.executor.a(12), OutcomeReceiverKt.a(lVar));
            Object o2 = lVar.o();
            return o2 == i0.a.f30806a ? o2 : b0.f30125a;
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
        @RequiresPermission
        @DoNotInline
        @Nullable
        public Object d(@NotNull Uri uri, @NotNull g gVar) {
            l lVar = new l(1, f0.r(gVar));
            lVar.p();
            this.f20859a.registerTrigger(uri, new androidx.arch.core.executor.a(9), OutcomeReceiverKt.a(lVar));
            Object o2 = lVar.o();
            return o2 == i0.a.f30806a ? o2 : b0.f30125a;
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
        @RequiresPermission
        @DoNotInline
        @Nullable
        public Object e(@NotNull WebSourceRegistrationRequest webSourceRegistrationRequest, @NotNull g gVar) {
            new l(1, f0.r(gVar)).p();
            androidx.privacysandbox.ads.adservices.customaudience.a.y();
            webSourceRegistrationRequest.getClass();
            new ArrayList();
            throw null;
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
        @RequiresPermission
        @DoNotInline
        @Nullable
        public Object f(@NotNull WebTriggerRegistrationRequest webTriggerRegistrationRequest, @NotNull g gVar) {
            new l(1, f0.r(gVar)).p();
            androidx.privacysandbox.ads.adservices.customaudience.a.A();
            webTriggerRegistrationRequest.getClass();
            new ArrayList();
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public static MeasurementManager a(Context context) {
            a.s(context, "context");
            Log.d("MeasurementManager", "AdServicesInfo.version=" + AdServicesInfo.a());
            if (AdServicesInfo.a() >= 5) {
                return new Api33Ext5Impl(context);
            }
            return null;
        }
    }

    public abstract Object a(DeletionRequest deletionRequest, g gVar);

    public abstract Object b(g gVar);

    public abstract Object c(Uri uri, InputEvent inputEvent, g gVar);

    public abstract Object d(Uri uri, g gVar);

    public abstract Object e(WebSourceRegistrationRequest webSourceRegistrationRequest, g gVar);

    public abstract Object f(WebTriggerRegistrationRequest webTriggerRegistrationRequest, g gVar);
}
