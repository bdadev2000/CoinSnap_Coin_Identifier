package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.res.ImageVectorCache;
import androidx.compose.ui.res.ResourceIdCache;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import com.cooldev.gba.emulator.gameboy.R;
import d0.b0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final DynamicProvidableCompositionLocal f16324a = CompositionLocalKt.c(AndroidCompositionLocals_androidKt$LocalConfiguration$1.f16333a);

    /* renamed from: b, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f16325b = new CompositionLocal(AndroidCompositionLocals_androidKt$LocalContext$1.f16334a);

    /* renamed from: c, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f16326c = new CompositionLocal(AndroidCompositionLocals_androidKt$LocalImageVectorCache$1.f16335a);
    public static final StaticProvidableCompositionLocal d = new CompositionLocal(AndroidCompositionLocals_androidKt$LocalResourceIdCache$1.f16336a);
    public static final StaticProvidableCompositionLocal e = new CompositionLocal(AndroidCompositionLocals_androidKt$LocalSavedStateRegistryOwner$1.f16337a);

    /* renamed from: f, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f16327f = new CompositionLocal(AndroidCompositionLocals_androidKt$LocalView$1.f16338a);

    public static final void a(AndroidComposeView androidComposeView, q0.p pVar, Composer composer, int i2) {
        int i3;
        boolean z2;
        ComposerImpl g2 = composer.g(1396852028);
        if ((i2 & 6) == 0) {
            i3 = (g2.w(androidComposeView) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.w(pVar) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && g2.i()) {
            g2.A();
        } else {
            Context context = androidComposeView.getContext();
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (u2 == composer$Companion$Empty$1) {
                u2 = SnapshotStateKt.f(new Configuration(context.getResources().getConfiguration()), StructuralEqualityPolicy.f14078a);
                g2.o(u2);
            }
            MutableState mutableState = (MutableState) u2;
            Object u3 = g2.u();
            if (u3 == composer$Companion$Empty$1) {
                u3 = new AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1(mutableState);
                g2.o(u3);
            }
            androidComposeView.setConfigurationChangeObserver((q0.l) u3);
            Object u4 = g2.u();
            if (u4 == composer$Companion$Empty$1) {
                u4 = new AndroidUriHandler(context);
                g2.o(u4);
            }
            AndroidUriHandler androidUriHandler = (AndroidUriHandler) u4;
            AndroidComposeView.ViewTreeOwners viewTreeOwners = androidComposeView.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            Object u5 = g2.u();
            SavedStateRegistryOwner savedStateRegistryOwner = viewTreeOwners.f16241b;
            if (u5 == composer$Companion$Empty$1) {
                Object parent = androidComposeView.getParent();
                p0.a.q(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                LinkedHashMap linkedHashMap = null;
                String str = tag instanceof String ? (String) tag : null;
                if (str == null) {
                    str = String.valueOf(view.getId());
                }
                String b2 = j.b("SaveableStateRegistry:", str);
                SavedStateRegistry savedStateRegistry = savedStateRegistryOwner.getSavedStateRegistry();
                Bundle a2 = savedStateRegistry.a(b2);
                if (a2 != null) {
                    linkedHashMap = new LinkedHashMap();
                    Iterator it = a2.keySet().iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        Iterator it2 = it;
                        ArrayList parcelableArrayList = a2.getParcelableArrayList(str2);
                        p0.a.q(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                        linkedHashMap.put(str2, parcelableArrayList);
                        it = it2;
                        a2 = a2;
                    }
                }
                final SaveableStateRegistry a3 = SaveableStateRegistryKt.a(linkedHashMap, DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1.f16480a);
                try {
                    savedStateRegistry.c(b2, new SavedStateRegistry.SavedStateProvider() { // from class: androidx.compose.ui.platform.m
                        @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
                        public final Bundle a() {
                            Map d2 = SaveableStateRegistry.this.d();
                            Bundle bundle = new Bundle();
                            for (Map.Entry entry : d2.entrySet()) {
                                String str3 = (String) entry.getKey();
                                List list = (List) entry.getValue();
                                bundle.putParcelableArrayList(str3, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                            }
                            return bundle;
                        }
                    });
                    z2 = true;
                } catch (IllegalArgumentException unused) {
                    z2 = false;
                }
                DisposableSaveableStateRegistry disposableSaveableStateRegistry = new DisposableSaveableStateRegistry(a3, new DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1(z2, savedStateRegistry, b2));
                g2.o(disposableSaveableStateRegistry);
                u5 = disposableSaveableStateRegistry;
            }
            DisposableSaveableStateRegistry disposableSaveableStateRegistry2 = (DisposableSaveableStateRegistry) u5;
            b0 b0Var = b0.f30125a;
            boolean w = g2.w(disposableSaveableStateRegistry2);
            Object u6 = g2.u();
            if (w || u6 == composer$Companion$Empty$1) {
                u6 = new AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2$1(disposableSaveableStateRegistry2);
                g2.o(u6);
            }
            EffectsKt.c(b0Var, (q0.l) u6, g2);
            Configuration configuration = (Configuration) mutableState.getValue();
            Object u7 = g2.u();
            if (u7 == composer$Companion$Empty$1) {
                u7 = new ImageVectorCache();
                g2.o(u7);
            }
            final ImageVectorCache imageVectorCache = (ImageVectorCache) u7;
            Object u8 = g2.u();
            Object obj = u8;
            if (u8 == composer$Companion$Empty$1) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                g2.o(configuration2);
                obj = configuration2;
            }
            final Configuration configuration3 = (Configuration) obj;
            Object u9 = g2.u();
            if (u9 == composer$Companion$Empty$1) {
                u9 = new ComponentCallbacks2() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1
                    @Override // android.content.ComponentCallbacks
                    public final void onConfigurationChanged(Configuration configuration4) {
                        Configuration configuration5 = configuration3;
                        int updateFrom = configuration5.updateFrom(configuration4);
                        Iterator it3 = imageVectorCache.f16730a.entrySet().iterator();
                        while (it3.hasNext()) {
                            ImageVectorCache.ImageVectorEntry imageVectorEntry = (ImageVectorCache.ImageVectorEntry) ((WeakReference) ((Map.Entry) it3.next()).getValue()).get();
                            if (imageVectorEntry == null || Configuration.needNewResources(updateFrom, imageVectorEntry.f16732b)) {
                                it3.remove();
                            }
                        }
                        configuration5.setTo(configuration4);
                    }

                    @Override // android.content.ComponentCallbacks
                    public final void onLowMemory() {
                        imageVectorCache.f16730a.clear();
                    }

                    @Override // android.content.ComponentCallbacks2
                    public final void onTrimMemory(int i4) {
                        imageVectorCache.f16730a.clear();
                    }
                };
                g2.o(u9);
            }
            AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1 androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1 = (AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1) u9;
            boolean w2 = g2.w(context);
            Object u10 = g2.u();
            if (w2 || u10 == composer$Companion$Empty$1) {
                u10 = new AndroidCompositionLocals_androidKt$obtainImageVectorCache$1$1(context, androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1);
                g2.o(u10);
            }
            EffectsKt.c(imageVectorCache, (q0.l) u10, g2);
            Object u11 = g2.u();
            if (u11 == composer$Companion$Empty$1) {
                u11 = new ResourceIdCache();
                g2.o(u11);
            }
            final ResourceIdCache resourceIdCache = (ResourceIdCache) u11;
            Object u12 = g2.u();
            if (u12 == composer$Companion$Empty$1) {
                u12 = new ComponentCallbacks2() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1
                    @Override // android.content.ComponentCallbacks
                    public final void onConfigurationChanged(Configuration configuration4) {
                        ResourceIdCache resourceIdCache2 = ResourceIdCache.this;
                        synchronized (resourceIdCache2) {
                            resourceIdCache2.f16735a.d();
                        }
                    }

                    @Override // android.content.ComponentCallbacks
                    public final void onLowMemory() {
                        ResourceIdCache resourceIdCache2 = ResourceIdCache.this;
                        synchronized (resourceIdCache2) {
                            resourceIdCache2.f16735a.d();
                        }
                    }

                    @Override // android.content.ComponentCallbacks2
                    public final void onTrimMemory(int i4) {
                        ResourceIdCache resourceIdCache2 = ResourceIdCache.this;
                        synchronized (resourceIdCache2) {
                            resourceIdCache2.f16735a.d();
                        }
                    }
                };
                g2.o(u12);
            }
            AndroidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1 androidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1 = (AndroidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1) u12;
            boolean w3 = g2.w(context);
            Object u13 = g2.u();
            if (w3 || u13 == composer$Companion$Empty$1) {
                u13 = new AndroidCompositionLocals_androidKt$obtainResourceIdCache$1$1(context, androidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1);
                g2.o(u13);
            }
            EffectsKt.c(resourceIdCache, (q0.l) u13, g2);
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = CompositionLocalsKt.f16448t;
            CompositionLocalKt.b(new ProvidedValue[]{f16324a.c((Configuration) mutableState.getValue()), f16325b.c(context), LocalLifecycleOwnerKt.f20226a.c(viewTreeOwners.f16240a), e.c(savedStateRegistryOwner), SaveableStateRegistryKt.f14529a.c(disposableSaveableStateRegistry2), f16327f.c(androidComposeView.getView()), f16326c.c(imageVectorCache), d.c(resourceIdCache), dynamicProvidableCompositionLocal.c(Boolean.valueOf(((Boolean) g2.K(dynamicProvidableCompositionLocal)).booleanValue() | androidComposeView.getScrollCaptureInProgress$ui_release()))}, ComposableLambdaKt.c(1471621628, new AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$3(androidComposeView, androidUriHandler, pVar), g2), g2, 56);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$4(androidComposeView, pVar, i2);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    @NotNull
    public static final ProvidableCompositionLocal<LifecycleOwner> getLocalLifecycleOwner() {
        return LocalLifecycleOwnerKt.f20226a;
    }
}
