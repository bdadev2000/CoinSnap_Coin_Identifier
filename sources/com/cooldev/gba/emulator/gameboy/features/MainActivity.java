package com.cooldev.gba.emulator.gameboy.features;

import android.R;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.compose.ComponentActivityKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.cooldev.gba.emulator.gameboy.utils.ConsentInformationUtils;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.p;

@StabilityInferred
/* loaded from: classes4.dex */
public final class MainActivity extends AppCompatActivity {
    private ConsentInformationUtils consentInformationUtils;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Nullable
    private static final String LOG_TAG = g0.a(MainActivity.class).c();

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public MainActivity() {
        e();
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private final void initApp() {
        ConsentInformationUtils consentInformationUtils = new ConsentInformationUtils(this);
        this.consentInformationUtils = consentInformationUtils;
        consentInformationUtils.setUpConsentInformation();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        getWindow().getDecorView();
        super.onCreate(bundle);
        initApp();
        p m54getLambda1$gba_v1_0_35_54__09Apr2025_1046_release = ComposableSingletons$MainActivityKt.INSTANCE.m54getLambda1$gba_v1_0_35_54__09Apr2025_1046_release();
        ViewGroup.LayoutParams layoutParams = ComponentActivityKt.f219a;
        View childAt = ((ViewGroup) getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(null);
            composeView.setContent(m54getLambda1$gba_v1_0_35_54__09Apr2025_1046_release);
            return;
        }
        ComposeView composeView2 = new ComposeView(this);
        composeView2.setParentCompositionContext(null);
        composeView2.setContent(m54getLambda1$gba_v1_0_35_54__09Apr2025_1046_release);
        View decorView = getWindow().getDecorView();
        if (ViewTreeLifecycleOwner.a(decorView) == null) {
            ViewTreeLifecycleOwner.b(decorView, this);
        }
        if (ViewTreeViewModelStoreOwner.a(decorView) == null) {
            ViewTreeViewModelStoreOwner.b(decorView, this);
        }
        if (ViewTreeSavedStateRegistryOwner.a(decorView) == null) {
            ViewTreeSavedStateRegistryOwner.b(decorView, this);
        }
        setContentView(composeView2, ComponentActivityKt.f219a);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ConsentInformationUtils consentInformationUtils = this.consentInformationUtils;
        if (consentInformationUtils == null) {
            a.B0("consentInformationUtils");
            throw null;
        }
        if (consentInformationUtils.isConsentFormAvailable()) {
            Log.d(LOG_TAG, "Consent form is available.");
        } else {
            Log.d(LOG_TAG, "Consent form is not available.");
        }
    }
}
