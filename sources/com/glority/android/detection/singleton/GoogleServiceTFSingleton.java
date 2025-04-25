package com.glority.android.detection.singleton;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstall;
import com.google.android.gms.common.moduleinstall.ModuleInstallClient;
import com.google.android.gms.tasks.Tasks;
import com.google.android.gms.tflite.client.TfLiteClient;
import com.google.android.gms.tflite.java.TfLite;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoogleServiceTFSingleton.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/glority/android/detection/singleton/GoogleServiceTFSingleton;", "", "()V", "task", "Lkotlin/Function0;", "", "getTask", "context", "Landroid/content/Context;", "isInstalled", "Companion", "lib-image-detection_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes13.dex */
public final class GoogleServiceTFSingleton {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static String TAG = "GoogleServiceTFSingleton";
    private static GoogleServiceTFSingleton instance;
    private Function0<Boolean> task;

    /* compiled from: GoogleServiceTFSingleton.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/glority/android/detection/singleton/GoogleServiceTFSingleton$Companion;", "", "()V", "TAG", "", "instance", "Lcom/glority/android/detection/singleton/GoogleServiceTFSingleton;", "getInstance", "lib-image-detection_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes13.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final GoogleServiceTFSingleton getInstance() {
            if (GoogleServiceTFSingleton.instance == null) {
                synchronized (GoogleServiceTFSingleton.class) {
                    if (GoogleServiceTFSingleton.instance == null) {
                        Companion companion = GoogleServiceTFSingleton.INSTANCE;
                        GoogleServiceTFSingleton.instance = new GoogleServiceTFSingleton();
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            GoogleServiceTFSingleton googleServiceTFSingleton = GoogleServiceTFSingleton.instance;
            Intrinsics.checkNotNull(googleServiceTFSingleton);
            return googleServiceTFSingleton;
        }
    }

    public final boolean isInstalled(Context context) {
        boolean booleanValue;
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (this) {
            if (this.task == null) {
                this.task = getTask(context);
            }
            Function0<Boolean> function0 = this.task;
            Boolean invoke = function0 != null ? function0.invoke() : null;
            Pair[] pairArr = new Pair[1];
            pairArr[0] = TuplesKt.to("status", invoke != null ? invoke.toString() : null);
            new LogEventRequest("googleservice_tfisinstalled_click", BundleKt.bundleOf(pairArr)).post();
            if (invoke == null) {
                this.task = null;
            }
            booleanValue = invoke != null ? invoke.booleanValue() : false;
        }
        return booleanValue;
    }

    private final Function0<Boolean> getTask(final Context context) {
        return new Function0<Boolean>() { // from class: com.glority.android.detection.singleton.GoogleServiceTFSingleton$getTask$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                ModuleInstallClient client = ModuleInstall.getClient(context);
                Intrinsics.checkNotNullExpressionValue(client, "getClient(context)");
                TfLiteClient client2 = TfLite.getClient(context);
                boolean z = false;
                try {
                    boolean areModulesAvailable = ((ModuleAvailabilityResponse) Tasks.await(client.areModulesAvailable(client2), 60L, TimeUnit.SECONDS)).areModulesAvailable();
                    if (!areModulesAvailable) {
                        client.deferredInstall(client2);
                    }
                    z = areModulesAvailable;
                } catch (Throwable unused) {
                }
                return Boolean.valueOf(z);
            }
        };
    }
}
